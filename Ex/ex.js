// var weight;

// console.log(typeof weight);






let person={// Para criar um objeto/variavel com varios atributos precisa usar chaves e dentro indicar os valores atribunido a eles usando ":"
    name :"Erick",
    age:18,
    stars:10,
    isSubscribed:false,
    weight: 68.5,
}
let person2={
    name :"João",
    age:11,
    stars:6,
    isSubscribed:true,
    weight: 35.5,
}
console.log(person.name ," de idade ",person.age," pesa " ,person.weight );
// console.log(typeof person.age)

let students=[];

students = [
  person,person2
]
console.log(students[1])