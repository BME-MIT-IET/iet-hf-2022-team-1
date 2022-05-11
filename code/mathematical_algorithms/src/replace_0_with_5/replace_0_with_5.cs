using System;

namespace Replace
{
    public class Program
    {
        private static string replace(string number)
        {
            StringBuilder bld = new StringBuilder();
            foreach (char n in number)
            {
                if (n == '0')
                {
                    bld.Append('5');
                }
                else
                {
                    bld.Append(n);
                }
            }
            return N;
        }
        
        public static void Main()
        {
            Console.Write("enter a number : ");
            string number = Console.ReadLine();
            
            Console.WriteLine(replace(number));
        }
    }

}
