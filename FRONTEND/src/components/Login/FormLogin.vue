<script setup>
import { ref } from 'vue'
import Logo from '@/components/generals/Logo.vue'
const visible = ref(false)
</script>
<template>
<div class="login">
     <Logo/>
     <div class="card">
      <v-card class="mx-auto pa-12 pb-8 " elevation="8" max-width="448" rounded="lg">
        <div class="text-subtitle-1 text-medium-emphasis">Account</div>
        <v-text-field density="compact" placeholder="Email address" prepend-inner-icon="mdi-email-outline"
          variant="outlined"></v-text-field>
        <div class="text-subtitle-1 text-medium-emphasis d-flex align-center justify-space-between">
          Password
        </div>
        <v-text-field :append-inner-icon="visible ? 'mdi-eye-off' : 'mdi-eye'" :type="visible ? 'text' : 'password'"
          density="compact" placeholder="Enter your password" prepend-inner-icon="mdi-lock-outline" variant="outlined"
          @click:append-inner="visible = !visible"></v-text-field>
        <v-btn block class="mb-8" color="blue" size="large" variant="tonal">
          Log In
        </v-btn>
        <a class="text-caption text-decoration-none text-blue" href="#" rel="noopener noreferrer" target="_blank">
          Forgot login password?</a>
      </v-card>
    </div>
    </div>
</template>
<style scoped lang="scss">
.login{
  display: flex;
  flex-direction: row;
  column-count: 2  ;
  margin-left: -10rem;
  .card{
    margin-left: -42rem;
    margin-right: 3rem;
    width: 60%;
  }
}
</style>

