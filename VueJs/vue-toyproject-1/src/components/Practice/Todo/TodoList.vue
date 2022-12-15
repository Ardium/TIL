<!-- TodoList.vue -->

<template>
    <div id="todoList">
        <ul>
            <li v-for="(todoItem, idx) in propsdata"
                v-bind:key="todoItem">
                
                <input type="checkbox">
                {{ todoItem }}
                <button v-on:click="removeItem(todoItem, idx)">D</button>
            </li>
        </ul>
    </div>
</template>

<script>
export default {
    props: ["propsdata"],
    methods: {
        removeItem: function (todoItem, idx) {
            this.$emit("removeItem", todoItem, idx);
        }
    }
};
</script>

<style scoped>
</style>