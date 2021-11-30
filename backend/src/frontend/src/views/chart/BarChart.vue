<template>
<div>
    <MainMenu/>
    
    <div>
        <h2>This is an BarChart Example</h2>
        <button @click="getBarChartData()">데이터 조회</button>
    </div>
    <br />
    <div style="align: center, width: 500px; height: 500px;">
        <div id="chart" style="width: 100%; height: 100%;"></div>
    </div>
</div>
</template>

<script>
// import 
import MainMenu from '@/components/MainMenu.vue'

import jui from 'jui-chart/lib/core.min.js'
import 'jui-chart/dist/chart.min.js'

import { mapGetters } from 'vuex'
//import { API_URL } from '@/assets/conf/web.config'
import { getApiUrl } from '@/assets/js/common.js'
import axios from 'axios'

// chart builder 생성
var builder = jui.include("chart.builder")

export default {
    name: 'BarChart',

    components: {MainMenu},

    data() {
        return {
            // chart 선언
            barChart: null,
        }
    },

    computed: mapGetters({
        barChartData: "chartDataStore/getBarChartData",
    }),

    created() {
        // 화면 신규 로드시 vuex의 이전 데이터 삭제
        this.$store.dispatch("chartDataStore/setBarChartData", [])
    },

    mounted() {
        this.createChart()
    },

    methods: {
        createChart() {
            this.barChart = builder("#chart", {
                theme: "dark",
                axis: [{
                    data: this.barChartData,
                    x: {
                        type: "range",
                        domain: "sales",
                        step: 10,
                        line: true,
                        reverse: true
                    },
                    y: {
                        type: "block",
                        domain: "quarter",
                        line: true
                    }
                }],
                brush: [{
                    type: "bar",
                    target: "sales",
                    display: "max",
                    active: 5,
                    activeEvent: "click",
                    animate: "right"
                }, {
                    type: "focus",
                    start: 1,
                    end: 1
                }],
                widget: {
                    type: "title",
                    text: "Bar 예제",
                    align: "start"
                }
            });
        },

        getBarChartData() {
            axios.get(getApiUrl("MentoringApi", "getBarChartData"))
            .then((res) => {
                this.$store.dispatch("chartDataStore/setBarChartData", res.data.resData)
                 this.barChart.axis(0).update(this.barChartData)
            })
        },
    },
}
</script>

<style scoped>
</style>
