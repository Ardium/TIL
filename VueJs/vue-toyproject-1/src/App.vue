<!-- App.vue -->

<template>
  <div id="wrap">
    <Header />

    <div id="container">
      <Sidebar />
      <Content />
    </div>
    
    <Footer />
  </div>
</template>

<script>
import Header from "./components/TheHeader.vue";
import Sidebar from "./components/TheSidebar.vue";
import Content from "./components/TheContent.vue";
import Footer from "./components/TheFooter.vue";

export default {
  name: 'App',
  components: {
    Header
  , Sidebar
  , Content
  , Footer
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
