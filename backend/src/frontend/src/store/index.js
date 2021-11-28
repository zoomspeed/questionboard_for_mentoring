import Vue from 'vue'
import Vuex from 'vuex'
import chartDataStore from '@/store/modules/chartDataStore'
Vue.use(Vuex)

export default new Vuex.Store({
  modules: {
    chartDataStore: chartDataStore,
  }
})
