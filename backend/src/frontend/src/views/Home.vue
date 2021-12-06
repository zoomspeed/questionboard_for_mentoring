<template>
  <div class="home">
    <Header />
    <MainMenu />
    <HelloWorld />
  </div>
</template>

<script>
// @ is an alias to /src
import Header from '@/components/layout/Header.vue'
import MainMenu from '@/components/MainMenu.vue'
import HelloWorld from '@/components/HelloWorld.vue'

export default {
  name: 'Home',
  components: {
    Header,
    MainMenu,
    HelloWorld
  }
}
</script>

