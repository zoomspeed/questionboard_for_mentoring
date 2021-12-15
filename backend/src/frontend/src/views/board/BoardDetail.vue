<template lang="">
  <div>
    {{ JSON.stringify(item) }}
  </div>
</template>
<script>
import axios from "axios";
export default {
  data() {
    return {
      item: {},
    };
  },
  created() {
    axios.get(`/api/boards/${this.$route.params.pstartNo}`).then((res) => {
      this.item = res.data;
      console.log(this.item);
    });
  },
};
</script>
<style lang=""></style>
