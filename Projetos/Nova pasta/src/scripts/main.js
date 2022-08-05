const content = document.querySelector("#content");
const img = document.querySelector("img")
import Personagens from "./personagens.js";

content.innerHTML = Personagens[0].historia;

img.setAttribute('src', `src/img/gon.png`)
