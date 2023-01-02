using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Variaveis
{
    internal class Program
    {
        static void Main(string[] args)
        {
            //Podemos iniciar uma variavel sem valor
            int num;// capaz de armazenar numeros
            byte num1 = 12; //Capaz de armazenar numeros entre 0 e 255 (Ele usa menos memoria que o int, mas não aceita numero negativos)
            string nome = "Erick Willian"; // capaz de armazenar uma cadei de carateres deve ser escrita entre aspas duplas ""
            char letra = 'a';// capaz de armazenar caracteres e a letra deve ser escrita entre '' aspas simples
            float numPonto = 1.0f;// Capaz de armazenar numeros com ponto flutuante e deve obrigatoriamenete ter um f no fim para que o compilador entenda o que significa
            const int num2 = 40;//Assim você declara uma constante que é um valor que não pode ser alterado
        }
    }
}
