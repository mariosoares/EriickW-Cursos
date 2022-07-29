function validacao(arr, number){
   
    if(!arr && !number){
      throw new ReferenceError("Envie os parâmetros")
    }
  if(typeof arr !== object){
      throw new TypeError("O array precisa ser do tipo object")
    }
  if(number != Number){
      throw new TypeError("O numero precisa ser do tipo number")
    }
  if(arr.length !== num){
    throw new RangeError("Tamanho invalido")
  }
  return arr
}


try{
  validacao()
}catch(e){
  if(e instanceof ReferenceError){//O instanceof funciona como um teste lógico colocando o "e" antes(que é o parametro que representa o erro que será recebido pelo try) o instanceof vai dizer onde está localizado/instanciado o erro que foi passado como parametro ou seja o tipo de erro e colocando apos dele o tipo do erro você meio que pergunta: o "e" esta instanciado no ReferenceError? ou melhor: o "e" é um ReferenceError?
    console.log("ReferenceError")
  }
}











