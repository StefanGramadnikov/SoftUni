﻿using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace DividableNumbersInInterval
{
    class DividableNumbersInInterval
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Please, write two integers: ");

            int n = int.Parse(Console.ReadLine());
            int m = int.Parse(Console.ReadLine());

            if (n > m)
            {
                int temp = n;
                n = m;
                m = temp;
            }

            int p = 0;

            for (int i = n; i <= m; i++)
            {
                if (i % 5 == 0)
                {
                    p++;
                }
            }

            Console.WriteLine(p);
        }
    }
}
