/*Необходимо написать программу, которая будет реализовывать следующие действия:
        1. Ввод числа с клавиатуры и запись его в строковую переменную S
        2. Конвертация строковой переменной S в числовую переменную X типа int
        3. Конвертация числа X типа int в число Y типа double
        Все три числа разных типов необходимо в столбик вывести на экран*/

import java.util.Scanner;
public class task14 {
    public static void main(String[] args) {
     // 1. Ввод числа с клавиатуры и запись его в строковую переменную S
        System.out.println("Введите число :");
        Scanner sc = new Scanner(System.in);
        String S= sc.nextLine();
        System.out.println("String : "+ S);
        // 2. Конвертация строковой переменной S в числовую переменную X типа int

        int X = Integer.parseInt(S.trim());
        System.out.println("int : "+ X);
        // 3. Конвертация числа X типа int в число Y типа double

        double Y = (int) X;
        System.out.println("double :"+ Y);


    }
}
