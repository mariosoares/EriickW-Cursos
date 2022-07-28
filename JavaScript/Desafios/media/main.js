function adicionarAlunos(){
    let listaAlunos = arguments;
    return listaAlunos
  } 
  
  function alunos(){
    const erick = {nome:"Erick",nota:10}
    const joao = {nome:"João",nota:10}
    const victor = {nome:"Victor",nota:10}
    
    let alunos = adicionarAlunos(erick,joao,victor)
     
     return alunos
  }
  
  function alunosNaMedia(media){
    let todosAlunos = alunos();
    let alunosNaMedia = []
    let i = 0
    
        
    while(i<todosAlunos.length){
      let taNaMedia = todosAlunos[i].nota >= media ;
      if(taNaMedia){
       alunosNaMedia.push(todosAlunos[i].nome)
      }
      i++
    }
    return `Os alunos na média são ${alunosNaMedia}`
  }
  console.log(alunosNaMedia(7))
  
  