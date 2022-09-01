const op1 = document.getElementById("op1")
const op2 = document.querySelector("#op2")
const h1 = document.querySelector("h1")


op1.addEventListener("click",()=>{
    h1.classList.remove("disable")
    h1.classList.add("active")
})