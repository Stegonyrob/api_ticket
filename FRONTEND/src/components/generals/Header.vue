<script>
import 'bootstrap/dist/css/bootstrap.min.css'
import 'bootstrap'
import Logo from './Logo.vue'
  export default {
    data() {
      return {
        name: "header",
        show: true,
      };
    },
    watch: {
      show(newVal) {
        console.log("Alert is now " + (newVal ? "visible" : "hidden"));
      },
    },
    methods: {
      toggle() {
        console.log("Toggle button clicked");
        this.show = !this.show;
      },
      dismissed() {
        console.log("Alert dismissed");
      },
    },
  };
  </script>
<template>
    <header>
         <nav class="navbar bg-dark navbar-expand-lg border-bottom border-body " data-bs-theme="dark">
       <a class="navbar-brand" href="#">
        <Logo class=" logo"  />
       </a>
       <div class="container-fluid">
       <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
      </button>
      <div class="collapse navbar-collapse justify-content-start" id="navbarSupportedContent">
             <ul class="navbar-nav justify-content-end nav-underline ">
              <li class="nav-item">
              <a class="nav-link " aria-current="page" href="/">Login</a>
            </li>
            <li class="nav-item">
              <a class="nav-link" href="/list">Listado</a>
            </li>
            <li class="nav-item">
              <a class="nav-link" href="/form">Formulario</a>
            </li>
            <li class="nav-item">
              <a class="nav-link " href="/edit">Edición</a>
            </li>
            <li class="nav-item">
              <a class="nav-link " href="/logout">Logout</a>
            </li>
            </ul>
      </div>
    </div>
 </nav>
 </header>
 </template>
  
  
  
  <style>
  
  
  
  </style>