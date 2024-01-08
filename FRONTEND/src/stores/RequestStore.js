import { defineStore } from 'pinia';
import { reactive } from 'vue';

export const useRequestStore = defineStore('form', {
 state: () => ({
   formCount: 0,
   form: [
     {
       formCount: '',
       name: '',
       title: '',
       date: '',
       description: '',
       state: '',
       solution: '',
     },
   ],
 }),
 actions: {
   createForm() {
     this.formCount++;
     this.form.push({
       formCount: this.formCount,
       name: '',
       title: '',
       date: '',
       description: '',
       state: '',
       solution: '',
     });
   },
 },

});
