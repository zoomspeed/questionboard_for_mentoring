import Vue from 'vue'
import App from './App.vue'
// BootstrapVue 추가
import BootstrapVue from 'bootstrap-vue'
import 'bootstrap/dist/css/bootstrap.min.css'
import 'bootstrap-vue/dist/bootstrap-vue.css'
// BootstrapVue 사용
Vue.use(BootstrapVue)

Vue.config.productionTip = false

new Vue({
  render: h => h(App),
}).$mount('#app')
