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
#todoList li {
    display: flex;
    justify-content: center;
    align-content: center;

    border: dotted 2px lightslategray;
    border-radius: 8px;

    margin: 3px;
    padding: 3px;
}

#todoList li input[type="checkbox"] {
    width: 5%;
    float: left;

    accent-color: gray;
}

input[type="checkbox"]:checked + span {
    text-decoration: line-through;
    color: gray;
    font-style: italic;
}

#todoList li span {
    width: 85%;
}

#todoList li button {
    width: 10%;
    float: right;

    border: solid 2px lightgrey;
    border-radius: 8px;

    background-color: lightgrey;

    font-size: 1em;
    color: white;
}

#todoList li button:hover {
    border: solid 2px darkgray;
    background-color: darkgray;
}
</style>