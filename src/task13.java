//Необходимо провести сравнение длины двух строк, которые были введены с клавиатуры и записаны в соответствующие переменные.
//Вывести на экран строку с наибольшей длиной. Если длины равны, вывести соответствтующее сообщение.
import java.util.Scanner;
public class task13 {
    public static void main(String[] args) {
        System.out.println("Введите строку :");
        Scanner sc = new Scanner(System.in);
        String greeting1= sc.nextLine();
       // System.out.println(greeting1);

        System.out.println("Введите вторую строку :");
        String greeting2= sc.nextLine();
       // System.out.println(greeting2);

        int len1 = greeting1.length();
        int len2 = greeting2.length();

        if (len1 > len2){
        System.out.println("1-я строка длиннее:"+ greeting1);}
        else if  (len2 > len1){
        System.out.println("2-я строка длиннее:"+greeting2);}
  else
        System.out.println("Длины строк равны");
    }
}
