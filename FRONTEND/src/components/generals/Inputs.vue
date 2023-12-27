 
   <script setup>
   import { ref } from 'vue';
   
   const props = defineProps({
    type: String,
    modelValue: String,
    placeholder: String,
    required: Boolean,
    icon: Boolean
   });
   
   const emit = defineEmits(['update:modelValue']);
   
   const updateValue = (event) => {
    emit('update:modelValue', event.target.value);
   };
   </script>
   

<template>
    <div class="form-group">
    <input :class="{ 'form-control': true, 'field-icon': icon }" :type="type" :value="modelValue" :placeholder="placeholder" :required="required" @input="updateValue($event)" />
    <span v-if="icon" class="fa fa-fw fa-eye field-icon toggle-password"></span>
    </div>
   </template>
  
   <style scoped>
   .form-control{
       background: transparent;
       border: none;
       height: 50px;
       color: gray;
       border: 1px solid transparent;
       background: #e6eaf2;
       border-radius: 40px;
       padding-left: 20px;
       padding-right: 20px;
       transition: .3s;
       width:100%;
       &:hover, &:focus{
           background: transparent;
           outline: none;
           box-shadow: none;
           border-color: rgba(255,255,255,.4);
       }
       &:focus{
           border-color: rgba(255,255,255,.4);
       }
   }
   
   .field-icon {
       position: absolute;
       top: 50%;
       right: 15px;
       transform: translateY(-50%);
       color: rgba(255,255,255,.9);
   }
   </style>
   