<!-- TodoFooter.vue -->

<template>
    <div id="todoFooter">
        <button v-on:click="removeAll">Delete All</button>
    </div>
</template>

<script>
export default {
    methods: {
        removeAll: function() {
            this.$emit("removeAll");
        }
    }
};
</script>

<style scoped>
#todoFooter button {
    float: right;
}
</style>