<script setup>
import { RouterLink, RouterView } from 'vue-router'
import Footer from '../src/components/generals/Footer.vue'
</script>

<template>
  <header>
    <div class="wrapper">
      <nav>
        <RouterLink to="/">Login</RouterLink>
        <RouterLink to="/list">List</RouterLink>
        <RouterLink to="/form">Form</RouterLink>
        <RouterLink to="/euser">Edit-User</RouterLink>
        <RouterLink to="/etec">Edit-Tec</RouterLink>
      </nav>
    </div>
  </header>

  <RouterView />
  <Footer/>
</template>

<style scoped>

</style>
