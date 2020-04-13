import java.util.Scanner;

//Произведите ввод данных с клавиатуры в матрицу, а после этого произведите вывод первой строки матрицы на экран, где каждый элемент умножается на 3. Размерность матрицы задается пользователем.

public class task10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Объявляем Scanner
        System.out.println("Ввести количество строк: ");
        int size = input.nextInt(); // Читаем с клавиатуры размер массива и записываем в size
        System.out.println("Ввести количество столбцов: ");
        int size1 = input.nextInt(); // Читаем с клавиатуры размер массива и записываем в size1
        int array[][] = new int[size][size1]; // Создаём массив int размером в size
        System.out.println("Заполняем элеметами матрицу:");
//Пройдёмся по всему массиву, заполняя его

        for (int t = 0; t < size; t++) {
            System.out.println("ввести строки "+(t+1)+" " ); // Выводим на экран, полученный массив {
            for (int i = 0; i < size1; i++) {
                array[t][i] = input.nextInt(); // Заполняем массив элементами, введёнными с клавиатуры
            }
        }
      int t = 0;
            for (int i = 0; i < size1; i++) {
                array[t][i]= array[t][i]*3; // умножаем на три
            }

            System.out.println("Вывод матрицы на экран:");
            for (t = 0; t < size; t++) {
                for (int i = 0; i < size1; i++) {
                    System.out.print(" " + array[t][i] ); // Выводим на экран, полученный результат
                }
                System.out.println();
            }
        }

}

