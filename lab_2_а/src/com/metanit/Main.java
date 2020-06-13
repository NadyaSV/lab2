package com.metanit;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Date;


/**
 * Найти количество чисел, содержащих только четные цифры,
 * а среди оставшихся — количество чисел с равным числом четных и нечетных цифр.
 *
 * @author Надя
 *
 * @since JDK1.0
 */
public class Main {

    public static void main(String[] args) {
        /**Найти количество чисел, содержащих только четные цифры,
         * а среди оставшихся — количество чисел с равным числом четных и нечетных цифр.
         *
         * @param args
         */

        int n;
        System.out.println("Введие n:");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        int[] massiv_chisel = new int[n]; // массив вводимых чисел
        int chet_qiwra = 0; // кол-во четных цифр в числе
        int nechet_qiwra = 0; // кол-во нечетных

        int chet_itog = 0; // итоговое кол-во чисел, состоящих ТОЛЬКО из четных цифр
        int nechet_chet_itog = 0; // а тут равных четных-нечетных


        // будем обрабатыать и считать число и нужную нам инфу, сразу после ввода пользователя. по итогу просто выведем отчет
        for (int s = 0; s < n; s++) {
            // вводим число
            System.out.println("Число " + (s + 1) + " : ");
            massiv_chisel[s] = sc.nextInt();

            // раскладываем его на динамический массив цифр
            ArrayList<Integer> qiwri = new ArrayList<>();
            while (massiv_chisel[s] != 0) {
                qiwri.add(massiv_chisel[s] % 10);
                massiv_chisel[s] /= 10;
            }

            // проверяем кажду цифру на четность и увеличиваем соответствующий счетчик
            for (int i = 0; i < qiwri.size(); i++) {
                if (qiwri.get(i) % 2 == 0) chet_qiwra++;
                else nechet_qiwra++;
            }

            // если кол-во четных цифр = кол-ву цифр в чисел
            if (chet_qiwra == qiwri.size()) chet_itog++; // это первое условие
            else if (chet_qiwra == nechet_qiwra) nechet_chet_itog++; // а если четные = нечетным - второе

            // обнулим счетчики
            chet_qiwra = 0;
            nechet_qiwra = 0;

            /*дин.массив " ArrayList<Integer> qiwri" специально задается внутри цикла,
            чтобы при каждом новом вводимом числе он пересоздавался*/
        }

        System.out.println("Кол-во чисел, состоящих только из четных цифр : " + chet_itog +
                "\nКол-во чисел, где кол-во четных и нечетных цифр равны : " + nechet_chet_itog);

        //Вывод времени и даты
        Date currentDate = new Date();
        System.out.println("\nDate currentDate = " + currentDate);
    }
}

