using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Enumeradores
{
    internal class Program
    {
        enum Nen { Conjuração, Manipulação, Emissão, Transmutação, Aprimoramento,Especialização };
        static void Main(string[] args)
        {
            Nen Killua = Nen.Transmutação;
            Console.WriteLine("Killua: " + Killua);
            Nen Gon = Nen.Aprimoramento;
            Console.WriteLine("Gon: " + Gon);
        }
    }
}
