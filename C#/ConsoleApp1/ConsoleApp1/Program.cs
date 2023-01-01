// Libs necessárias para 

using System;// Lib que serve para que o usuario possa manipular elementos do sistema operacional
using System.Collections.Generic;//Possui estruturas de dados importantes
using System.Linq;// Ferramenta para controle de dados usado para grandes quantidades de dados
using System.Text;// Serve para manipule texto ex: Mudar de minusculo pra maiusculo
// using System.Threading.Tasks; //Serve para criar um programa que rode em diversos nucleos do processador ao mesmo tempo
// using System.IO; //É uma lib que te permite manipular arquivos 
// using System.Net; // Serve para criar projetos que precisam interagir com a internet

namespace ConsoleApp1{

    internal class Program{

        static void Main(string[] args){// <- Função principal todo código que for colocado aqui vai ser executado primeiro
              
            Console.WriteLine("Olá Mundo");// Serve para escrever no console e descer uma linha
            Console.Write("Olá Mundo");// Serve para escrever mas não quebra linha

            Console.ReadLine();//Serve para receber valores digitados no console

        }
    }
}
