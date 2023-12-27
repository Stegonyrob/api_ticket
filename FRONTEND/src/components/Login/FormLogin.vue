<script setup>
import { ref } from 'vue'
import Logo from '@/components/generals/Logo.vue'
import Input from '@/components/generals/Inputs.vue'
const handleSubmit = () => {
 
};
const visible = ref(false)
</script>

<template>
  <section >
   <div class="container-fluid">
   
        <Logo class=" logo" />
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
  
   </section>
    
</template>
<style scoped lang="scss">
.container-fluid{
  margin-top: 5%;
  display: flex;
    flex-direction: row;
    width: 100%;
    justify-content: space-evenly;
    align-content: stretch;
    flex-wrap: wrap;
    align-items: stretch;
.logo{
  width: 30%;
}
.card{
  display: flex;
    width: 40%;
    background-color: grey;
    justify-content: center;
    padding: 2rem;
    align-content: center;
    align-items: stretch;

  .btn {
   
  width: 50%;
	cursor: pointer;
	border-radius:40px;
	font-size: 1rem;
	text-transform: uppercase;
  margin-left: 25% !important;
  background: rgba(82, 125, 135, 1);
	border: 1px solid white !important;
	color: black rgb(0, 0,0 ,0.8) ;
	&:hover, &:active, &:focus {
		outline: none;
    border: 1px solid white;
		background: transparent;
		color :red;
	}
  .login{
    width: 100%;
    
  }
}




 
}

}
</style>

