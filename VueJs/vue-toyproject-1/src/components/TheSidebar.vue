<!-- TheSidebar.vue -->

<template>
    <div id="sidebar"> 
        <h3> Menu </h3>
        <div id="sb-home">
            <router-link to="/">Home</router-link>
        </div>
        <div id="sb-todo">
            <router-link to="/todo">Todo</router-link>
        </div>
    </div>
</template>

<script>
export default {};
</script>

<style scoped>
#sidebar {
    flex: 1;
    
    border: solid 3px;
    border-color: yellowgreen;
}
</style>