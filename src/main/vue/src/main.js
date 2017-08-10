// The Vue build version to load with the `import` command
// (runtime-only or standalone) has been set in webpack.base.conf with an alias.
import Vue from 'vue'
import App from './App'
import Resource from 'vue-resource'
import router from './router'
import iView from 'iview'
import '../theme/dist/iview.css'

Vue.config.productionTip = false
Vue.use(iView)
Vue.use(Resource)

/* eslint-disable no-new */
new Vue({
  el: '#app',
  router,
  iView,
  template: '<App/>',
  components: { App }
})
