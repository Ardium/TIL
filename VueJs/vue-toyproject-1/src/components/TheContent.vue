<!-- TheContent.vue -->

<template>
    <div id="content">
        <router-view></router-view>
    </div>
</template>


<script>
export default {};
</script>

<style scoped>
#content {
    flex: 7;

    border: solid 3px;
    border-color: purple;
}
</style>