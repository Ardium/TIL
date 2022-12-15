<!-- TodoInput.vue -->

<template>
    <div id="todoInput">
        <input  type="text"
                placeholder="Todo로 관리할 사항을 입력하세요."
                v-model="newItem"
                v-on:keyup.enter="addItem(newItem)"/>
        <button v-on:click="addItem(newItem)">A</button>
    </div>
</template>

<script>
export default {
    data: function() {
        return {
            newItem: ""
        }
    },
    methods: {
        addItem: function (item) {
            this.$emit("addItem", item);
            this.newItem = "";
        },
    }
};
</script>

<style scoped>

</style>