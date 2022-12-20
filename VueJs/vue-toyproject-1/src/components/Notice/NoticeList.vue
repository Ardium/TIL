<!-- NoticeList.vue -->

<template>
    <div id="noticeList">
        <div id="notice_list_header">
            <div id="notice_btngrp">
                <button>등록</button>
                <button>수정</button>
                <button>삭제</button>
            </div>
        </div>
        <div id="notice_list_body">
            <table id="notice_table">
                <thead>
                    <tr>
                        <th>순번</th>
                        <th>카테고리</th>
                        <th>제목</th>
                        <th>작성자</th>
                        <th>작성일자</th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td>1</td>
                        <td>공모전</td>
                        <td>제 3 회 Vue 공모전 개최 공지</td>
                        <td>관리자</td>
                        <td>2022/12/01</td>
                    </tr>
                    <tr>
                        <td>2</td>
                        <td>시스템 점검</td>
                        <td>2022/12/10 시스템 긴급 점검 공지</td>
                        <td>관리자</td>
                        <td>2022/12/07</td>
                    </tr>
                    <tr>
                        <td>3</td>
                        <td>시스템 점검</td>
                        <td>2022/12/31 시스템 긴급 점검 공지</td>
                        <td>관리자</td>
                        <td>2022/12/20</td>
                    </tr>
                </tbody>
            </table>
        </div>
    </div>
</template>

<script>
export default {}
</script>

<style scoped>
#noticeList {
    background-color: white;
}

#notice_btngrp {
    float: right;
}

#notice_btngrp button {
    margin: 5px;

    font-size: x-small;
}

#notice_list_body {
    margin: 5px;
}

#notice_list_body table {
    width: 100%;

    border: solid 1px black;
    border-collapse: collapse;
}

#notice_list_body table th, td {
    padding: 5px;

    border-bottom: solid 1px black;

    text-align: center;
    font-family: 'Noto Sans KR', sans-serif;
    font-size: x-small;
}

#notice_list_body table th {
    background-color: gray;
    color: white;
}
</style>