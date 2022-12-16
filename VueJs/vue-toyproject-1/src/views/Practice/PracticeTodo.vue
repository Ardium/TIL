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
            let key = localStorage.key(idx);
            let value = localStorage.getItem(key);
            
            this.pushItem(key, value);
        }
    },
    methods: {
        pushItem: function(key, value) {
            let todoItem = {
                key: key,
                value: value
            };
            this.todoItems.push(todoItem);

            console.log("Push Item: " + todoItem.key + " | " + todoItem.value);
        },
        addItem: function(newItem) {
            let todoId = Date.now();
            
            this.pushItem(todoId, newItem);
            localStorage.setItem(todoId, newItem);
        },
        removeItem: function(todoItem, idx) {
            localStorage.removeItem(todoItem.key);
            this.todoItems.splice(idx, 1);

            console.log("Remove Item: (idx|key|value)" + idx + "|" + todoItem.key + "|" + todoItem.value);
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