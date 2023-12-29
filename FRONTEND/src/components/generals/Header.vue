<script setup>
import 'bootstrap/dist/css/bootstrap.min.css'
import 'bootstrap'
import Logo from './Logo.vue'
 import Inputs from './Inputs.vue';
  </script>
<template>
    <header>
         <nav class="navbar  navbar-expand-lg border-bottom border-body " data-bs-theme="dark">
      
       <div class="container-fluid">
       <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
      </button>
      <div class="collapse navbar-collapse justify-content-start" id="navbarSupportedContent">
             <ul class="navbar-nav justify-content-end nav-underline ">
              <li class="nav-item">
              <a class="nav-link " aria-current="page" href="/"> Login</a>
            </li>
            <li class="nav-item">
              <a class="nav-link" href="/list"><i class="bi bi-card-checklist"></i> Listado</a>
            </li>
            <li class="nav-item">
              <a class="nav-link" href="/form"><i class="bi bi-layout-text-sidebar-reverse"></i> Formulario</a>
            </li>
            <li class="nav-item">
              <a class="nav-link " href="/edit"> <i class="bi bi-vector-pen"></i> Edición</a>
            </li>
            <li class="nav-item">
              <a class="nav-link " href="/logout"> <i class="bi bi-box-arrow-right"></i> Logout</a>
            </li>
            </ul>
            <a class="navbar-brand" href="#">
        <Logo class=" logo"  />
       </a>
       <form class="d-flex" role="search">
    <div class="input-group">
      <Inputs type="search" placeholder="Search" aria-label="Search" />
       
      <button class="btn btn-outline-success ms-n5" type="submit">
        <i class="bi bi-search"></i></button>
  </div>
</form>

      </div>
    </div>
 </nav>
 </header>
 </template>
  
  
  
  <style scoped lang="scss">
  .navbar{
    background-color: black;
  }
  .logo{
    height: 5rem;
  margin-left: 250%;
  }
  .input-group{
    margin-left: 35rem;
  }
  

  </style>