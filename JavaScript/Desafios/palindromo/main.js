function verificaPalindromo(string){
    const palavraInvertida = string.split("").reverse().join("")
    
    const saoIguais = string == palavraInvertida
    
    
    if(saoIguais){
      console.log("Essa palavra é um palídromo")
    }else{
      console.log("Essa palavra não é um palíndromo")
    }
  }
  verificaPalindromo("am")
  
  
  
  