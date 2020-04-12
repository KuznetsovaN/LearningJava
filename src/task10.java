import java.util.Scanner;

//Произведите ввод данных с клавиатуры в матрицу, а после этого произведите вывод первой строки матрицы на экран, где каждый элемент умножается на 3. Размерность матрицы задается пользователем.
public class task10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Объявляем Scanner
        System.out.println("Enter array length: ");
        int size = input.nextInt(); // Читаем с клавиатуры размер массива и записываем в size
        int array[][] = new int[size][size]; // Создаём массив int размером в size
        System.out.println("Insert array elements:");
        /*Пройдёмся по всему массиву, заполняя его*/
        for (int t = 0; t < size; t++) {
            for (int i = 0; i < size; i++) {
                array[t][i] = input.nextInt(); // Заполняем массив элементами, введёнными с клавиатуры
            }
        }
            System.out.print("Inserted array elements:");
            for (int t = 0; t < size; t++) {
                for (int i = 0; i < size; i++) {
                    System.out.print(" " + array[t][i] * 3); // Выводим на экран, полученный массив
                }
                System.out.println();
            }
        }

}

