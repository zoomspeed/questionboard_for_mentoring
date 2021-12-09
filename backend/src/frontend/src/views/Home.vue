<template>
  <div class="home">
    <Header />
    <div id="app">
      <b-button>Button</b-button>
      <b-button variant="primary">Button</b-button>
      <b-button variant="warning">Button</b-button>
      <b-button variant="danger">Button</b-button>
      <b-button variant="success">Button</b-button>
      <b-button variant="outline-primary">Button</b-button>
    </div>
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

