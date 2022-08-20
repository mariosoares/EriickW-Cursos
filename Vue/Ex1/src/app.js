const MyNameApp = {
    data(){// Essa prorpiedade serve para exportar dados para o front end da aplicação
        return{
            name:"",
            input_name: "",
            
        }
    },
    methods:{
        submitForm(e){
            e.preventDefault();// Serve para que o formulário não seja enviado para o serivdor
            this.name = this.input_name;
        }
    }
}

Vue.createApp(MyNameApp).mount("#app")
// a função Vue.crateApp() serve para que crie um app em vue e o metodo .mount serve para mostra aonde será montado o app