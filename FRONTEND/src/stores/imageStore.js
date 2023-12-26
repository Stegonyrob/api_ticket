import { defineStore } from 'pinia';
import { reactive } from 'vue';

export const useImageStore = defineStore('image', 
() => {
 const state = reactive(
  {
    images: [
      {
        src: './src/assets/image/logo.png',
        title: 'Logo'
      },
      // Otras imágenes aquí
    ]
  });

  return {
    state
  };
});
