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
#todoFooter {
    height: 40px;
}

#todoFooter button {
    width: 30%;
    height: 90%;

    border: solid 2px lightskyblue;
    border-radius: 8px;

    background-color: lightskyblue;

    font-size: 1em;
    color: white;

    float: right;
}

#todoFooter button:hover {
    border: solid 2px cornflowerblue;
    background-color: cornflowerblue;
}
</style>