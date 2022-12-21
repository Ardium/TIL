// main.js 

import { createApp } from 'vue';
import App from './App.vue';

import router from './router/index.js';

import BootstrapVue from 'bootstrap-vue-3'
import 'bootstrap/dist/css/bootstrap.min.css'
import 'bootstrap-vue-3/dist/bootstrap-vue-3.css'

createApp(App)
.use(router)
.use(BootstrapVue)
.mount('#app');