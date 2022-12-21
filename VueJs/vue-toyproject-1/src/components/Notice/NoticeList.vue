<!-- NoticeList.vue -->

<template>
    <div id="noticeList">
        <div id="notice_list_header">
            <div id="notice_btngrp" class="btn-group">
                <button id="btn_register" class="btn btn-outline-dark">등록</button>
                <button id="btn_modify" class="btn btn-outline-dark">수정</button>
                <button id="btn_delete" class="btn btn-outline-dark">삭제</button>
            </div>
        </div>
        <div id="notice_list_body">
            <table id="notice_table" class="table table-hover">
                <thead class="table-dark">
                    <tr>
                        <th scope="col">순번</th>
                        <th scope="col">카테고리</th>
                        <th scope="col">제목</th>
                        <th scope="col">작성자</th>
                        <th scope="col">작성일자</th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td scope="row">1</td>
                        <td>공모전</td>
                        <td>제 3 회 Vue 공모전 개최 공지</td>
                        <td>관리자</td>
                        <td>2022/12/01</td>
                    </tr>
                    <tr>
                        <td scope="row">2</td>
                        <td>시스템 점검</td>
                        <td>2022/12/10 시스템 긴급 점검 공지</td>
                        <td>관리자</td>
                        <td>2022/12/07</td>
                    </tr>
                    <tr>
                        <td scope="row">3</td>
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
    padding: 5px;
    background-color: white;
}

#notice_btngrp {
    margin: 0px 0px 5px 0px;

    float: right;
}

#notice_btngrp button {
    font-size: 0.7em;
}

#notice_list_body table th, td {
    padding: 5px;

    text-align: center;
    font-family: 'Noto Sans KR', sans-serif;
    font-size: 0.7em;
}
</style>