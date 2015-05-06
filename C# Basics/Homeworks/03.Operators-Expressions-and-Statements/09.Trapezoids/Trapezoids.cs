﻿using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Trapezoids
{
    class Trapezoids
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Please, enter trapezoid's base \"a\": ");
            float a = float.Parse(Console.ReadLine());

            Console.WriteLine("Please, enter trapezoid's base \"b\": ");
            float b = float.Parse(Console.ReadLine());

            Console.WriteLine("Please, enter trapezoid's height: ");
            float h = float.Parse(Console.ReadLine());

            if ((a > 0) && (b > 0) && (h > 0))
            {
                float area = ((a + b) / 2) * h;
                Console.WriteLine("Trapezoid's area is {0}", area);
            } else
                {
                    Console.WriteLine("The numbers You entered are NOT valid!");
                }
        }
    }
}
