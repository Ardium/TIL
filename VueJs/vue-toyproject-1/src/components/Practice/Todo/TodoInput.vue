<!-- TodoInput.vue -->

<template>
    <div id="todoInput">
        <input  type="text"
                placeholder="Todo로 관리할 사항을 입력하세요."
                v-model="newItem"
                v-on:keyup.enter="addItem()"/>
        <button v-on:click="addItem()">A</button>
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
        addItem: function () {
            if (this.newItem.trim() !== "") {
                this.$emit("addItem", this.newItem);
                this.newItem = "";
            }
            else {
                alert("입력 필드에 값이 입력되지 않았습니다.");
            }
        },
    }
};
</script>

<style scoped>
#todoInput {
    height: 50px;

    display: flex;
    justify-content: center;
    align-content: center;

    margin: 5px;
    padding: 5px;

    border: solid 2px lightgray;
    border-radius: 8px;
}

#todoInput input[type="text"] {
    width: 90%;
    height: 90%;
    padding: 0px 0px 0px 5px;

    border: none;
    font-size: 1.1em;
}

#todoInput input[type="text"]:focus {
    outline: none;
}

#todoInput button {
    width: 10%;
    height: 90%;

    border: solid 2px lightcoral;
    border-radius: 8px;

    background-color: lightcoral;

    font-size: 1em;
    color: white;
}

#todoInput button:hover {
    border: solid 2px tomato;
    background-color: tomato;
}
</style>