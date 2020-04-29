//Написать программу сортировки по возрастанию заданного пользователем массива чисел.
// Пользователь программы должен задавать размер массива и наполнять его числами.
// Использовать одну из следующих сортировок: прямого выбора, вставки, быстрая, Шелла.

import java.util.Scanner;

public class FinalTask2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int razmer = scan.nextInt();
        int[] x = new int[razmer];
        System.out.println("Введите элементы массива: ");
        //Запонение массива данными
        for (int i = 0; i < razmer; i++) {
            x[i] = scan.nextInt();
        }


        for (int inc = x.length / 2; inc >= 1; inc = inc / 2)
            for (int step = 0; step < inc; step++){
                insertionSort (x, step, inc); // вызываем сортировку Шелла ниже
            }
        System.out.print("Ваш отсортированный массив: ");
        for (int i = 0; i < razmer; i++) {
            System.out.print(" "+ x[i]);
        }
    }

//сортировка методом Шелла
    private static void insertionSort (int[] arr, int start, int inc)
    {
        int tmp;
        for (int i = start; i < arr.length - 1; i += inc)
            for (int j = Math.min(i+inc, arr.length-1); j-inc >= 0; j = j-inc)
                if (arr[j - inc] > arr[j])
                {
                    tmp = arr[j];
                    arr[j] = arr[j-inc];
                    arr[j-inc] = tmp;
                }
                else break;
    }
}