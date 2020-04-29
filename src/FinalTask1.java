//Ввести с консоли число в бинарном формате. Перевести его в десятичный формат, записать в переменную int и вывести на экран.
// Необходимо использовать циклы, нельзя использования готовые методы языка Java, для перевода числа из одной системы счисления в другую.
import java.util.Scanner;


public class FinalTask1 {
    public static void main(String[] args) {
        int  binary_number; //записываем число
        int final_value; // конечное число
        int base;//начинаем с младшей степени 2ки, 1
        int ostatok;
        int b1;
        boolean flag=true;
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите число в бинарном формате: ");

        do{
            binary_number = scan.nextInt(); //записываем число
            b1=binary_number;
            flag=true;

            if(b1<0){ flag=false;
                System.out.println("Бинарное число не может быть отрицательном, состоит из 0 и 1.Введите снова" );
                continue;}

            while (b1 != 0) {
                ostatok= b1 % 10;
                if (ostatok>1){
                    flag=false;
                    System.out.println("Неккоректное число."+ binary_number +" Бинарное число состоит из 0 и 1.Введите снова" );
                    break;
                }
                b1 = b1 / 10;
            }
        }while (flag==false);

        final_value = 0;
        base = 1;
        while (binary_number != 0) {
            ostatok= binary_number % 10;
            binary_number = binary_number / 10;
            final_value += ostatok * base;
            base = base * 2;
        }

        System.out.println("Ваше число в десятичном формате: " + final_value);
    }
    }
