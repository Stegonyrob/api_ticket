<script setup>
import Input from '@/components/generals/Inputs.vue'
</script>

<template>
    <main>
        <div class="container-fluid">
      <div class="card">
    <form @submit.prevent="handleSubmit" class="signin-form">
   <Input class="m-4 login" type="text" placeholder="Username" required />
   <Input class="m-4 login" type="password" placeholder="Password" required />
   <div class="form-group">
    <button type="submit" class="form-control btn btn-primary submit px-5 m-4">Sign In</button>
   </div>
  </form>
 </div>
</div>

        <form class="__container-forms">
        <h1 class="title">EDIT FORM</h1>
            <label class="__container-forms__label" for="name">Nombre del empleado :</label>
            <Input class="m-4 " type="text" placeholder="Ingrese su nombre" required name="user" />
            
            <label class="__container-forms__label" for="title">Titulo:</label>
            <Input class="m-4 " type="text" placeholder="Titulo" required name="title" />
           

            <label class="__container-forms__label" for="date">Fecha de solicitud:</label>
            <Input class="m-4 " type="date" placeholder="Fecha" required name="date"/>
           

          

            <label class="__container-forms__label" for="type">Description of your Request:</label>
            <textarea name="name-description" class="__container-forms__label__inputbox__description" cols="33" rows="5"></textarea>
                <button class="button__one" type="button">
                    Edit</button>
                <div class="container__button">
                    <button class="button__two" type="button">
                        Reset</button>
                    <button class="button__three" type="button">
                        Cancel
                    </button>
                </div>
        </form>
        
    </main>
</template>

<style lang="scss" scoped>


main {
    width: 100%;
    height: 100%;
    display: flex;
    justify-content: center;
 
    background-size: cover;
    
    
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
   
    .title{
        margin: 0 auto;
        font-size: 1.5em;
    }

    &__label {
        background-color: white;
       
        
        &__inputbox {
            
            width: 100%;
            padding: 0.5em;
            background-color: grey;
            margin-bottom: 1em;
            
        
            &__description {
                    background-color:grey;
            
                    margin-bottom: 1em;
                }
        }
    }

 
    }
.button__one{
    background-color:orange;
   
    padding: 0.7em;
    width: 100%;
    display: flex;
    justify-content: center;
    color: white;
    margin-bottom: 1em;
    border:2px solid orange;
    
   
}


</style>