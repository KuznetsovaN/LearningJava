//Напишите программу конвертер валют. Программа должна переводить рубли в доллары по текущему курсу.
// Пользователь вводит текущий курс и количество рублей. Итоговое значение должно быть округлено до двух знаков после запятой.
 // (Пример для теста работы программы: Курс доллара = 67,55, Количество рублей: 1000, Итого: 14,80 долларов)

import java.util.Scanner;

public class FinalTask3 {
    public static void main(String args[]) {

        Scanner scanner = new Scanner (System.in);

        // вводим текущий курс доллара
        System.out.print("Введите курс доллара: ");
        double dollar_rate = scanner.nextDouble();
        System.out.println("Курс доллара: " + dollar_rate);

        // вводим кол-во рублей
        System.out.print("Введите колличество рублей: ");
        int count_rub = scanner.nextInt();
        System.out.println("Кол-во рублей: " + count_rub);

        double total_dollars = count_rub/dollar_rate;

        //округляем итоговое значение
        total_dollars = Math.round(total_dollars * 100.0) / 100.0;

        System.out.println(total_dollars);
    }
}