# vue

![vue](https://github.com/anindameister/SpringBootFairCorp/blob/main/snaps/Traversy/1.PNG)


![vue](https://github.com/anindameister/SpringBootFairCorp/blob/main/snaps/Traversy/2.PNG)

- spa: singlePageApplication

![vue](https://github.com/anindameister/SpringBootFairCorp/blob/main/snaps/Traversy/3.PNG)

![vue](https://github.com/anindameister/SpringBootFairCorp/blob/main/snaps/Traversy/4.PNG)

![vue](https://github.com/anindameister/SpringBootFairCorp/blob/main/snaps/Traversy/5.PNG)

![vue](https://github.com/anindameister/SpringBootFairCorp/blob/main/snaps/Traversy/6.PNG)

![vue](https://github.com/anindameister/SpringBootFairCorp/blob/main/snaps/Traversy/7.PNG)

- the below command in admin mode from windowsStart proabbaly fixed my terminal problem in vsCode
```
powershell Set-ExecutionPolicy RemoteSigned
```

- to install
    - nodeJs
    - vue.js devtools for chrome
- cli documentation: https://cli.vuejs.org/
- regular vueJs documentation: https://vuejs.org/

- installed vue with the command
```
npm install -g @vue/cli
```
- the **g** is the global indication
- creating a vue application named test
```
vue create test
```
- there's the regualr way
```
npm run serve
```
- or the GUI way
```
vue ui
```
- okay, for the moment, let's look at the vueJs files
- so we have the entry point at main.js
- in this we have
```
import App from './App.vue'
```
- so we are importing the app component from app.vue file
- now, we have id:app in here which is available in index.html
```
createApp(App).mount('#app')
```
- index.html
```
<div id="app"></div>
```