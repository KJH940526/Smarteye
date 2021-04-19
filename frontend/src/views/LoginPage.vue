<template>
  <div class="Login">
    <form v-on:submit="onSubmitForm">
      <input v-model="ID" placeholder="ID"><br/><br/>
      <input v-model="PASSWORD" placeholder="PASSWORD"><br/><br/>
      <router-link to="/board"><button type="submit">로그인</button></router-link>
    </form>
  </div>
</template>

<script>
// @ is an alias to /src


export default {
  name: 'Login',
  components: {

  },
  data(){
    return{
      ID:'',
      PASSWORD: ''
    }
  },
  methods: {
    onSubmitForm(e){
      e.preventDefault();
      
    }
    
  },
  beforeCreate() {
    
  },
}
</script>
