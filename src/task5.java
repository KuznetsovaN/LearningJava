//Необходимо вывести на экран таблицу умножения от 1 до 10 для введённого пользователем любого числа. Использовать циклы запрещено.
import java.util.Scanner;
    class task5 {
        // Function that print the
        // table of a given number
        // using recursion
        static void mul_table( int N, int i)
        {
            // Base Case
            if (i > 10 )
                return ;
            // Print the table for
            // current iteration
            System.out.println(N + " * " + i + " = " + N * i);

            // Recursive call to next
            // iteration
            mul_table(N, i + 1 );
        }

        // Driver Code
        public static void main (String[] args)
        {
            // Input number whose table
            // is to print
            Scanner sc = new Scanner(System.in);
            System.out.println("Введите число от 1 до 10:");
            int N = sc.nextInt() ;
            sc.close();

            // Function call to print
            // the table
            mul_table(N, 1 );
        }
    }



