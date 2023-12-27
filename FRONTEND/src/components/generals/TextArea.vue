
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
        <textarea
    ref="textarea"
    v-model="input"
    placeholder="Ingrese su solicitud..."
    class="form-group p-4"
    @input="resize()" />
   
    </div>
   </template>
   
   
   <style scoped>
   .form-group{
       background: transparent;
       border: none;
       height: 20rem;
       color:black !important;
        border: 1px solid transparent;
       background: #e6eaf2;
       border-radius: 20px;
       transition: .3s;
       width:50rem;
    
   }
   
   .field-icon {
       position: absolute;
       top: 50%;
       right: 15px;
       transform: translateY(-50%);
       color: rgba(255,255,255,.9);
   }
   </style>
   