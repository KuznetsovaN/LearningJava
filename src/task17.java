//Необходимо написать программу, которая будет записывать текстовые данные, введенные с экрана, в файл .txt.
// Запись ввести в файл до тех пор, пока не будет введена команда стоп в консоли.
// Пользователь при тестировании программы по правилу черного ящика должен понимать, какой принцип остановки записи в файл он должен подать.

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Formatter;
import java.util.Scanner;

public class task17 {
    static Formatter x;
    static Scanner scn;

    public static void main(String[] args) {
        try {
            x = new Formatter(new BufferedWriter(new FileWriter("src//2.txt", false)));// тут создаем по указанному пути файл куда и будем все записывать
            scn = new Scanner(System.in);

            System.out.println("Ввведите текстовые данные. Закончить ввод - stop");
            String b = scn.nextLine();

            while(true)  {
                if (b.equals("stop")) {
                    System.out.println("Программа отработала");
                    break;
                } else {
                    x.format("%s\r\n",b);
                    x.flush();
                    b= scn.nextLine();
                }
            }


                    x.close();
        } catch (Exception e) { }



        }
    }

