<!-- TodoList.vue -->

<template>
    <div id="todoList">
        <ul>
            <li v-for="(todoItem, idx) in propsdata"
                v-bind:key="idx">
                
                <input  type="checkbox">
                <span> {{ todoItem.value }}</span>
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
input[type="checkbox"]:checked + span {
    text-decoration: line-through;
    color: gray;
    font-style: italic;
}
</style>