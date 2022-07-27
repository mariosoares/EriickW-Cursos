
function even(arr){
    if(!arr) return -1;
    if(!arr.length)return -1;
    
     let arrayFormatado = []
     let array = arr
    for(let i = 0; i < array.length;i++){
      
      const operation = array[i] % 2
      const isEven = operation === 0 
         if(isEven){
       arrayFormatado[i] = 0
        }else{
        arrayFormatado[i] = array[i]
        }
      
    }
    return arrayFormatado
  }
  
  
     console.log(even([]))