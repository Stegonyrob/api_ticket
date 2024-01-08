<script setup>
import Input from'@/components/generals/Inputs.vue'
import TextArea from '@/components/generals/TextArea.vue'
import RadioButtons from '@/components/generals/RadioButtons.vue'
import {useRequestStore} from '@/stores/requestStore'
import axios from 'axios';
import { ref } from 'vue';

const requestStore = useRequestStore();
let isSubmissionSuccessful = ref(false);
let hasError = ref(false);

async function handleSubmit() {
 const incident = {
 date: requestStore.date,
 name: requestStore.user,
 title: requestStore.title,
 description: requestStore.description,
 departament: requestStore.departament,
 solution: requestStore.solution
 };

 try {
 const response = await axios.post('http://localhost:8080/api/incidents/save', incident);
 console.log(response.data);
 isSubmissionSuccessful.value = true;
 setTimeout(() => {
 isSubmissionSuccessful.value = false;
 }, 5000);
 } catch (error) {
 console.error(error);
 hasError.value = true;
 setTimeout(() => {
 hasError.value = false;
 }, 5000);
 }
}
</script>

<template>
 <form @submit.prevent="handleSubmit" class="form mt-5">

 <h1>Formulario de solicitud</h1>
 <div>
  <h2>Nº {{ requestStore.formCount }}</h2>
  <div><RadioButtons /></div>
  
  <div class=" align-items-center">
  <label class="__container-forms__label" for="date">Fecha de solicitud:</label>
  <Input class="m-4 date" type="date" placeholder="Fecha" required name="date" />
  </div>
  <label class="__container-forms__label mt-5" for="name">Nombre del empleado :</label>
  <Input class="m-4 " type="text" placeholder="Ingrese su nombre" required name="user" />
  <label class="__container-forms__label" for="title">Titulo:</label>
  <Input class="m-4 " type="text" placeholder="Titulo" required name="title" />
  <label class="__container-forms__label" for="title">Departamento al que va dirigido:</label>
  <Input class="m-4 " type="text" placeholder="Destinatario" required name="departament" />
  <label class="__container-forms__label" for="description">Descripción de la solicitud:</label>
  <TextArea required for="description" name="description" />
  <label class="__container-forms__label" for="solution">Resolución de la solicitud:</label>
  <TextArea required for="solution" name="solution" />
 </div>
 <div class="d-grid gap-2 mt-3 d-md-flex">
  <button type="reset" class="btn btn-outline-warning">Borrar</button>
  <button type="button" class="btn btn-outline-danger" aria-label="Close">Cancelar</button>
  <button type="submit" class="btn btn-outline-success success">Enviar</button>
 </div>
 <div v-if="isSubmissionSuccessful" class="alert alert-success">
  Formulario creado exitosamente.
 </div>

 <div v-else-if="hasError" class="alert alert-danger">
  Actualmente no podemos enviar la solicitud. Por favor, inténtelo más tarde.
 </div>
 </form>
</template>
<style lang="scss" scoped>

.form {
 display: flex;
 flex-direction: column;
 margin-left: 20%;
 margin-bottom: 15rem;
 margin-right:20%;
 padding: 5rem;
 border: 1px solid transparent;
 background: #ACBCBE;
 border-radius: 40px;
 align-content: space-around;
 justify-content: center;
 flex-wrap: wrap;
 align-items: center;

 .btn{
 border:2px solid;
 border-radius: 2rem;
 }
 .success{
 margin-left: 18rem;
 }
}

</style>
