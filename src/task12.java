//Для введенной с клавиатуры строки необходимо провести отсев пробелов. Результат в виде строки без пробелов вывести на экран.

import java.util.Scanner;
public class task12 {
    public static void main(String[] args) {
        System.out.println("Введите строку ");
        Scanner sc = new Scanner(System.in); //создали сканнер
        String greeting= sc.nextLine();
        String greeting2;
        greeting2 = greeting.replaceAll(" ", "");

        System.out.println(greeting2);

    }
}

