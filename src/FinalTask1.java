//Ввести с консоли число в бинарном формате. Перевести его в десятичный формат, записать в переменную int и вывести на экран.
// Необходимо использовать циклы, нельзя использования готовые методы языка Java, для перевода числа из одной системы счисления в другую.
import java.util.Scanner;

public class FinalTask1 {
         public static void main(String[] args) {
        int binary_number; //записываем число
        int final_value; // конечное число
        int base;//начинаем с младшей степени 2ки, 1
        int ostatok; 
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите число в бинарном формате: ");
             binary_number = scan.nextInt(); //записываем число
       final_value = 0;
        base = 1;
        while (binary_number > 0) {
            ostatok= binary_number % 10;
            binary_number = binary_number / 10;
            final_value += ostatok * base;
            base = base * 2;
        }
        System.out.println("Ваше число в десятичном формате: " + final_value);
    }
    }

