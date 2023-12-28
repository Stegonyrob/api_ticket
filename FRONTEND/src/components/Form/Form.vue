<script setup>
import Input from'@/components/generals/Inputs.vue'
import TextArea from '@/components/generals/TextArea.vue'
import RadioButtons from '@/components/generals/RadioButtons.vue'
import {useRequestStore} from '@/stores/requestStore'



const requestStore = useRequestStore();


</script>

<template>
    <main>
    <form @submit.prevent="handleSubmit" class="form">
      <div> 
        <h1>Formulario de solicitud</h1>
        <div>
        <h2>Nº {{ requestStore.formCount }}</h2> 
        <div>
            <RadioButtons/>
        </div>
        <div>
            <label class="__container-forms__label" for="date">Fecha de solicitud:<Input class="m-4 date" type="date" placeholder="Fecha" required name="date"/></label>
        </div>
        <div>
            <label class="__container-forms__label mt-5" for="name">Nombre del empleado :</label>
            <Input class="m-4 " type="text" placeholder="Ingrese su nombre" required name="user" /></div>
            <div>
            <label class="__container-forms__label" for="title">Titulo:</label>
            <Input class="m-4 " type="text" placeholder="Titulo" required name="title" /></div>
            <label class="__container-forms__label" for="title">Departamento al que va dirigido:</label>
            <Input class="m-4 " type="text" placeholder="Destinatario" required name="departament" /></div>
            <div><label class="__container-forms__label" for="description">Descripción de la solicitud:</label>
            <TextArea required for="description" name="description"/></div>
            <div><label class="__container-forms__label" for="solution">Resolución de la solicitud:</label>
            <TextArea required for="solution" name="solution"/></div>
           <div>  <button class="button__one mt-5" type="button">
                    Edit</button>
                <div class="container__button">
                    <button class="button__two" type="button">
                        Reset</button>
                    <button class="button__three" type="button">
                        Cancel
                    </button></div>
              
    </div>    </div>
        </form>
    </main>
</template>
<style lang="scss" scoped>


.form {
  
    margin-left: 20%;
    
    margin-right:20%;
    padding: 5rem;

    height: 30%;
    border: 1px solid transparent;
    background: #ACBCBE;
    border-radius: 40px;
   
    align-content: space-around;
    justify-content: center;
    flex-wrap: wrap;
    align-items: center;

   
    
}

   .button__one{
    background-color:orange;
    padding: 0.7em;
    width: 30%;
    display: flex;
    justify-content: center;
    color: white;
    margin-bottom: 1em;
    border:2px solid orange;
    
}



</style>