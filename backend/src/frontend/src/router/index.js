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
    name: "BoardView",
    component: () => import("@/views/board/BoardView"),
    //beforeEnter: checkAuth(),
  },
  {
    path: "/board/:pstartNo",
    name: "BoardDetail",
    component: () => import("@/views/board/BoardDetail"),
  },
  {
    path: "/board/write",
    name: "BoardWrite",
    component: () => import("@/views/board/BoardWrite"),
  },
  {
    path: "/board/modify",
    name: "BoardModify",
    component: () => import("@/views/board/BoardModify"),
  },
];

const router = new VueRouter({
  mode: "history",
  base: process.env.BASE_URL,
  routes,
});

export default router;
