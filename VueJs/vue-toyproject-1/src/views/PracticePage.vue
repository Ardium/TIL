<!-- PracticePage.vue -->

<template>
    <div id="wrapPractice">
        <h1> Vue Practice </h1>

        <div>
        <router-view></router-view>

        </div>
    </div>
</template>

<script>
export default {}
</script>

<style scoped>
#wrapPractice {
    height: 100%;
}

#wrapPractice h1 {
    margin: 0;

    height: 10%;
}

#wrapPractice div {
    height: 90%;
}
</style>