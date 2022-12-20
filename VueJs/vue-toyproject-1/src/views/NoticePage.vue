<!-- NoticePage.vue -->

<template>
    <div id="wrapNotice">
        <h1>Notice</h1>

        <NoticeList></NoticeList>
    </div>
</template>

<script>
import NoticeList from "../components/Notice/NoticeList.vue";

export default {
    components: {
        NoticeList
    }
}
</script>

<style scoped>
</style>