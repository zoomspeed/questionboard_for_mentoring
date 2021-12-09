import Vue from "vue";
import App from "./App.vue";
import router from "./router";
import store from "./store";

// Bootstrap
import BootstrapVue from "bootstrap-vue";
import "bootstrap/dist/css/bootstrap.min.css";
import "bootstrap-vue/dist/bootstrap-vue.css";

//Element ui
import Element from "element-ui";
import "element-ui/lib/theme-chalk/index.css";

Vue.use(BootstrapVue);
Vue.use(Element, { size: "small", zIndex: 3000 });
Vue.config.productionTip = false;

new Vue({
  router,
  store,
  render: (h) => h(App),
}).$mount("#app");
