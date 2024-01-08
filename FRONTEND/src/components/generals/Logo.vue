<script setup>
import { useImageStore } from '@/stores/imageStore.js'; 

const store = useImageStore();
const logoSrc = store.state.images[0].src;
</script>
<template>
  
  <img :src="logoSrc" class="card-img-top" alt="logo"/>


</template>

<style lang="scss" scoped>
  
</style>
