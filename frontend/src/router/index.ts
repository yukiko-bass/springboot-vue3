import LoginView from "@/views/LoginView.vue";
import type { RouteRecordRaw } from 'vue-router';
import { createRouter, createWebHistory } from 'vue-router';

const routSettings: RouteRecordRaw[] = [
  {
    path: '/',
    name: 'login',
    component: LoginView
  },
];


const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes: routSettings
})

export default router
