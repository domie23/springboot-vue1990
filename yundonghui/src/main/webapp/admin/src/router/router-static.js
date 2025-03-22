import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'

     import users from '@/views/modules/users/list'
    import caipan from '@/views/modules/caipan/list'
    import dictionary from '@/views/modules/dictionary/list'
    import gongzuoanpai from '@/views/modules/gongzuoanpai/list'
    import kaibi from '@/views/modules/kaibi/list'
    import laoshi from '@/views/modules/laoshi/list'
    import laoshixiangmu from '@/views/modules/laoshixiangmu/list'
    import laoshixiangmubaoming from '@/views/modules/laoshixiangmubaoming/list'
    import saishibianpai from '@/views/modules/saishibianpai/list'
    import xuesheng from '@/views/modules/xuesheng/list'
    import xueshengxiangmu from '@/views/modules/xueshengxiangmu/list'
    import xueshengxiangmubaoming from '@/views/modules/xueshengxiangmubaoming/list'
    import yuanxi from '@/views/modules/yuanxi/list'
    import config from '@/views/modules/config/list'
    import dictionaryKaibi from '@/views/modules/dictionaryKaibi/list'
    import dictionaryLaoshixiangmu from '@/views/modules/dictionaryLaoshixiangmu/list'
    import dictionaryLaoshixiangmuZhuanye from '@/views/modules/dictionaryLaoshixiangmuZhuanye/list'
    import dictionarySex from '@/views/modules/dictionarySex/list'
    import dictionaryXueshengxiangmu from '@/views/modules/dictionaryXueshengxiangmu/list'
    import dictionaryXueshengxiangmuZhuanye from '@/views/modules/dictionaryXueshengxiangmuZhuanye/list'





//2.配置路由   注意：名字
const routes = [{
    path: '/index',
    name: '首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '首页',
      component: Home,
      meta: {icon:'', title:'center'}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    } ,{
        path: '/users',
        name: '管理信息',
        component: users
      }
    ,{
        path: '/dictionaryKaibi',
        name: '开闭幕式',
        component: dictionaryKaibi
    }
    ,{
        path: '/dictionaryLaoshixiangmu',
        name: '老师项目类型',
        component: dictionaryLaoshixiangmu
    }
    ,{
        path: '/dictionaryLaoshixiangmuZhuanye',
        name: '是否老年',
        component: dictionaryLaoshixiangmuZhuanye
    }
    ,{
        path: '/dictionarySex',
        name: '性别类型',
        component: dictionarySex
    }
    ,{
        path: '/dictionaryXueshengxiangmu',
        name: '学生项目类型',
        component: dictionaryXueshengxiangmu
    }
    ,{
        path: '/dictionaryXueshengxiangmuZhuanye',
        name: '是否专业',
        component: dictionaryXueshengxiangmuZhuanye
    }
    ,{
        path: '/config',
        name: '轮播图',
        component: config
    }


    ,{
        path: '/caipan',
        name: '裁判',
        component: caipan
      }
    ,{
        path: '/dictionary',
        name: '字典',
        component: dictionary
      }
    ,{
        path: '/gongzuoanpai',
        name: '工作安排信息',
        component: gongzuoanpai
      }
    ,{
        path: '/kaibi',
        name: '开闭幕式信息',
        component: kaibi
      }
    ,{
        path: '/laoshi',
        name: '老师',
        component: laoshi
      }
    ,{
        path: '/laoshixiangmu',
        name: '老师项目',
        component: laoshixiangmu
      }
    ,{
        path: '/laoshixiangmubaoming',
        name: '老师项目报名',
        component: laoshixiangmubaoming
      }
    ,{
        path: '/saishibianpai',
        name: '赛事编排信息',
        component: saishibianpai
      }
    ,{
        path: '/xuesheng',
        name: '学生',
        component: xuesheng
      }
    ,{
        path: '/xueshengxiangmu',
        name: '学生项目',
        component: xueshengxiangmu
      }
    ,{
        path: '/xueshengxiangmubaoming',
        name: '学生项目报名',
        component: xueshengxiangmubaoming
      }
    ,{
        path: '/yuanxi',
        name: '院系',
        component: yuanxi
      }


    ]
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '/',
    name: '首页',
    redirect: '/index'
  }, /*默认跳转路由*/
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})

export default router;
