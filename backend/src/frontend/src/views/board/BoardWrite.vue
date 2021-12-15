<template lang="">
  <div>
    <b-button @click="writeBoard"></b-button>
    <b-form-input
      id="input-live"
      v-model="pstartTitlNm"
      aria-describedby="input-live-help input-live-feedback"
      placeholder="Enter your name"
      trim
    ></b-form-input>
    <b-form-input
      id="input-live"
      v-model="pstartCn"
      aria-describedby="input-live-help input-live-feedback"
      placeholder="Enter your name"
      trim
    ></b-form-input>
  </div>
</template>
<script>
import axios from "axios";
// import axios from "@/assets/conf/axiosCondig.js";
axios.defaults.headers.post["Content-Type"] = "application/json";
export default {
  data() {
    return {
      pstartTitlNm: "",
      pstartCn: "",
    };
  },
  methods: {
    writeBoard() {
      let self = this;
      const param = {
        pstartTitlNm: this.pstartTitlNm,
        pstartCn: this.pstartCn,
      };
      console.log(param);
      axios
        .post("/api/boards", param)
        .then(function (res) {
          console.log(res.data);
          self.$router.push({ name: "BoardView" });
        })
        .catch((error) => {
          console.log(error);
        });
    },
  },
};
</script>
<style lang=""></style>
