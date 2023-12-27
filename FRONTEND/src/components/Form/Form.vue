<script setup>
import Input from'@/components/generals/Inputs.vue'
import TextArea from '@/components/generals/TextArea.vue'
import {useRequestStore} from '@/stores/requestStore'



const requestStore = useRequestStore();


</script>

<template>
    <main>
    <form @submit.prevent="handleSubmit" class="form">
      <div> <div>
        <h2>Nº {{ requestStore.formCount }}</h2>
            <label class="__container-forms__label" for="date">Fecha de solicitud:</label>
            <Input class="m-4 date" type="date" placeholder="Fecha" required name="date"/></div><div>
            <label class="__container-forms__label mt-5" for="name">Nombre del empleado :</label>
            <Input class="m-4 " type="text" placeholder="Ingrese su nombre" required name="user" /></div>
            <div>
            <label class="__container-forms__label" for="title">Titulo:</label>
            <Input class="m-4 " type="text" placeholder="Titulo" required name="title" /></div>
            <label class="__container-forms__label" for="title">Titulo:</label>
            <Input class="m-4 " type="text" placeholder="Titulo" required name="title" /></div>
            
Departamento de mantenimiento
            <label class="__container-forms__label" for="description">Descripción de la solicitud:</label>
            <TextArea required for="description" name="description"/>
           
                <button class="button__one mt-5" type="button">
                    Edit</button>
                <div class="container__button">
                    <button class="button__two" type="button">
                        Reset</button>
                    <button class="button__three" type="button">
                        Cancel
                    </button>
    </div>
                </div>
        </form>
    </main>
</template>

<style lang="scss" scoped>


main {
    width: 70%;
    height: 70%;
    display: flex;
    justify-content: center;
    border: 1px solid transparent;
    background: #ACBCBE;
    border-radius: 40px;
    .date{
    color:black !important;
   } 
    
}

.__container-forms {
    width: 30%;
    padding: 2em;
     font-weight: bold;
    display: flex;;
    flex-direction: column;
    align-items: flex-start;
    margin-top: 20px;
    margin-bottom: 20px;
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
}


</style>