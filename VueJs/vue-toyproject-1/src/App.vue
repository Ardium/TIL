<!-- App.vue -->

<template>
  <div id="wrap">
    <Todo></Todo>
    <!-- <Header />

    <div id="container">
      <Sidebar />
      <Content />
    </div>
    
    <Footer /> -->
  </div>
</template>

<script>
import Todo from "./views/Practice/PracticeTodo.vue";
// import Header from "./components/TheHeader.vue";
// import Sidebar from "./components/TheSidebar.vue";
// import Content from "./components/TheContent.vue";
// import Footer from "./components/TheFooter.vue";

export default {
  name: 'App',
  components: {
    Todo
  //   Header
  // , Sidebar
  // , Content
  // , Footer
  }
};
</script>

<style>
* {
  box-sizing: border-box;
  overflow: hidden;
}

#wrap {
  height: 100vh;
}

#wrap Header {
  height: 10%;
}

#container {
  height: 80%;
}

#wrap Footer {
  height: 10%;
}
</style>
