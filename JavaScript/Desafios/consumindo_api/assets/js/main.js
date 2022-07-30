const BASE_URL = 'https://animechan.vercel.app/api/random'
const Btn = document.getElementById("change")
const anime = document.getElementById("anime")
const personagem = document.getElementById("personagem")
const quote = document.getElementById("quote")

const getQuotes = async () => {
    try{
        const data = await fetch(BASE_URL);
        const json = await data.json();

        return json;
    }catch(e){
        console.log(e.messege)
    }
}

const loadImg = async () =>{
    
   const json = await getQuotes();
   anime.innerText = json.anime
   personagem.innerText = json.character
   quote.innerText = json.quote;
}

Btn.addEventListener("click", loadImg);

loadImg();