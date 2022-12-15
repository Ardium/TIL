<!-- PracticeTodo.vue -->

<template>
    <div id="todo">
        <TodoHeader></TodoHeader>
        <TodoInput v-on:addItem="addItem"></TodoInput>
        <TodoList v-bind:propsdata="todoItems" v-on:removeItem="removeItem"></TodoList>
        <TodoFooter v-on:removeAll="removeItems"></TodoFooter>
    </div>
</template>

<script>
import TodoHeader from "../../components/Practice/Todo/TodoHeader.vue";
import TodoInput from "../../components/Practice/Todo/TodoInput.vue";
import TodoList from "../../components/Practice/Todo/TodoList.vue";
import TodoFooter from "../../components/Practice/Todo/TodoFooter.vue";

export default {
    data: function() {
        return {
            todoItems: []
        }
    },
    created: function() {
        for (let idx = 0; idx < localStorage.length; idx++) {
            this.todoItems.push(localStorage.key(idx));
        }
    },
    methods: {
        addItem: function(newItem) {
            console.log("Add Item: " + newItem);

            localStorage.setItem(newItem, newItem);
            this.todoItems.push(newItem);
        },
        removeItem: function(todoItem, idx) {
            console.log("Remove Item: " + todoItem + "(" + idx + ")");
            
            localStorage.removeItem(todoItem);
            this.todoItems.splice(idx, 1);
        },
        removeItems: function() {
            console.log("Remove All Items");
            
            localStorage.clear();
            this.todoItems = [];
        }
    },
    components: {
        TodoHeader,
        TodoInput,
        TodoList,
        TodoFooter
    }
};
</script>

<style scoped>
#todo {
    background-color: white;
}
</style>