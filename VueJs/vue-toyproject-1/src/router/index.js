// router > index.js

import { createRouter, createWebHistory } from 'vue-router'

// 라우팅될 페이지 경로 및 별칭
import HomePage from "../views/HomePage.vue";
import PracticePage from "../views/PracticePage.vue";
import PracticeCalculator from "../components/Practice/PracticeCalculator.vue";



// 라우팅될 페이지 정보를 담는 변수
const routes = [
    {
        path: "/home",
        name: "home",
        component: HomePage
    },
    {
        path: "/practice",
        name: "practice",
        component: PracticePage,
        children: [
            {
                path: "calculator",
                component: PracticeCalculator
            }
        ]
    }
];

// 라우터 정보
const router = createRouter({
    history: createWebHistory(),
    routes,
})

export default router;