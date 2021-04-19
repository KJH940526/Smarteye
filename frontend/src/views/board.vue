<template lang="">
  <div id = 'board'>
    <h1>게시판</h1>
    <tr>
      <td>번호</td>
      <td>이름</td>
      <td>제목</td>
      <td>내용</td>
    </tr>
  </div>
</template>
<script>
export default {
  name: 'board',
  components: {

  },
  data(){
    return{
      board:[]
    }
  },
  methods: {
    
  },
  beforeCreate() {
    
  },
  created() {
    this.$http.get('http://localhost:3000/BoardData')
    .then((res)=>{
      console.log(res);
      console.log(res.data);
    })
  },
}
</script>
<style lang="">
  
</style>