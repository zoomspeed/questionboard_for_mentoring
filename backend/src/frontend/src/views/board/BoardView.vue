<template>
  <div>
    <b-table striped hover :items="items" @row-clicked="goDetail"></b-table>
  </div>
</template>

<script>
import axios from "axios";
export default {
  methods: {
    goDetail(record, index) {
      console.log(record);
      console.log(index);
      console.log(record.pstartNo);
      this.pstartNo = record.pstartNo;
      this.$router.push({ name: "BoardDetail", params: { pstartNo: this.pstartNo } });
    },
  },
  created() {
    axios.get("/api/boards").then((res) => {
      console.log(res.data);
      this.items = res.data;
    });
  },
  data() {
    return {
      items: [],
      pstartNo: null,
    };
  },
};
</script>
