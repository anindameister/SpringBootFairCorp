import Vue from 'vue'
import App from './App.vue'

Vue.config.productionTip = false

console.log("hello Aninda, today is a beautiful day and you'll make it a fruitful day, becaue you're the best.")

new Vue({
  render: h => h(App),
}).$mount('#app')
