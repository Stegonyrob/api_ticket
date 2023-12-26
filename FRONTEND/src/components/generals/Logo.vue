<script setup>
import { useImageStore } from '@/stores/imageStore.js'; 

const store = useImageStore();
const logoSrc = store.state.images[0].src;
</script>
<template>
  <v-img :src="logoSrc" aspect-ratio="3.75" rounded="lg"></v-img>
</template>
<style lang="scss" scoped>
  
</style>
