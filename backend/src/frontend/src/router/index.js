import Vue from "vue";
import VueRouter from "vue-router";
import Home from "@/views/Home.vue";

Vue.use(VueRouter);

const routes = [
  {
    path: "/",
    name: "Home",
    component: Home,
  },
  {
    path: "/chart/barchart",
    name: "BarChart",
    component: () => import("@/views/chart/BarChart"),
    //beforeEnter: checkAuth(),
  },
  {
    path: "/board",
    name: "Board",
    component: () => import("@/views/board/BoardView"),
    //beforeEnter: checkAuth(),
  },
];

const router = new VueRouter({
  mode: "history",
  base: process.env.BASE_URL,
  routes,
});

export default router;
