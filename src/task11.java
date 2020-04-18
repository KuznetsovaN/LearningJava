//Необходимо произвести ввод строки с клавиатуры и записать в строковую переменную. Результат вывести на экран.
import java.util.Scanner;
public class task11 {
    public static void main(String[] args) {
        System.out.println("Введите строку ");
        Scanner sc = new Scanner(System.in); //создали сканнер
        String greeting= sc.nextLine();
        System.out.println(greeting);

    }
}
