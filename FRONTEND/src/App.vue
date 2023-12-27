<script setup>
import { RouterLink, RouterView } from 'vue-router'
import Footer from '../src/components/generals/Footer.vue'
import Header from '../src/components/generals/Header.vue'
</script>

<template>
  <header>
    <div class="wrapper">
      <Header/>
      <nav>
      
      </nav>
    </div>
  </header>

  <RouterView />
  <Footer/>
</template>

<style scoped>

</style>
