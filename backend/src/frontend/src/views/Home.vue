<template>
  <div class="home">
    <MainMenu />
    <HelloWorld />
  </div>
</template>

<script>
// @ is an alias to /src
import MainMenu from '@/components/MainMenu.vue'
import HelloWorld from '@/components/HelloWorld.vue'

export default {
  name: 'Home',
  components: {
    MainMenu,
    HelloWorld
  }
}
</script>

