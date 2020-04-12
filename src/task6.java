    import java.util.Scanner;

    public class task6 { // объявляется класс Test
        public static void main(String[] args) {// так включаются программы, просто запомнить
            Scanner sc = new Scanner(System.in);
            System.out.println("Введите числа:");
           // Ввод трех чисел с клавиатуры x, y, z
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();
            sc.close();
            // Нахождение и вывод на экран среднего арифметического чисел x, y, z
           int b = x+y+z;

           double dresult, drem;
            dresult = b / 3.0;
            drem = b % 3.0;

            System.out.println("Peзyльтaт и остаток от деления : "

                    + dresult + " " + drem);
           // Деление среднего арифметического на 2 без остатка
            double c= dresult/2;

            //   4. Если полученное число больше 3, то вывести на экран сообщение "Программа выполнена корректно"
            if (c>3)
                System.out.println("Программа выполнена корректно");

        }
            }

