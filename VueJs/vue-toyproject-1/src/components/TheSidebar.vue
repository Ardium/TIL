<!-- TheSidebar.vue -->

<template>
    <div id="sidebar">
        <h3>Menu</h3>
        
        <div class="defaultMenu topMenu">
            <router-link to="/">Main</router-link>
        </div>
        <div>
            <p class="defaultMenu topMenu">Practice</p>
            <div class="defaultMenu subMenu">
                <router-link to="/practice/calculator">Calculator</router-link>
            </div>
        </div>
    </div>
</template>

<script>
export default {};
</script>

<style scoped>
#sidebar {
    background-color: green;

    float: left;
    height: 100%;
    width: 15%;
}

.defaultMenu {
    font-style: oblique;

}
.topMenu {
    text-align: left;
    font-size: 2vw;
}

.subMenu {
    text-align: right;
    font-size: 1.5vw;
}

div h3 {
    text-align: center;
    color: white;
}
</style>