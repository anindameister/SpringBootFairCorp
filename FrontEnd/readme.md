# vue JS- 17:05
- JS frontend framework is vue js
- JS libraries are there like JQuery, Loadash, axios
- library can be imported in our code to do a specific task, Professor used the term **Functions**
- Framework example could be SpringBoot for Java so SpringBoot is the Java framework
- The term framework could be broken to frame+work, so it frames your work which is your code. So JS framework would froame your JS code. It's like photo frame. So we have a frame, a inside the frame we put the photo. Exactly, is the scenario here.

- all the details are available in https://gitlab.com/emse1/cours_js_1 

![Angular slide](https://github.com/anindameister/SpringBootFairCorp/blob/main/snaps/31.PNG)

- imperative paradigm: js,java,c:- executed one after the other
- declarative paradigm: more like HTML. you dont define the other, but describe how things are supposed to be in a declarative way.more to be checked later

- using the base vue files and doing 
```
npm install
```
- so we have the package.json file.. we can rename stuffs there and change the commands based on our convenience. Right now, we have "npm run serve" we could change that to "npm run app" by renaming the right stuff in package.json

- 43:29
- The entry point is main.js
- so, the current status now of this main.js is as below
```
import Vue from 'vue'
import App from './App.vue'

Vue.config.productionTip = false

console.log("hello Aninda, today is a beautiful day and you'll make it a fruitful day, becaue you're the best.")

new Vue({
  render: h => h(App),
}).$mount('#app')
```
- whatever is put in the console.log would come in the console of the browser once we get into the inspect mode
- just an observation, the inBuiltServer is taking some time to refresh 53:57

- having a bit of problem, understanding the emseDude, going to Traversy, would come back if required.


