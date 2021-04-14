import java.util.*;


public class Homewor_4 {
    public static void main(String[] args) {
        //1_задача_амебы
        divisionAmeba();
        System.out.println(summ(5, 10));
        //2_задача_сумма
        System.out.println(summ(3, 0));
        System.out.println(summ(5, -10));
        //3_задача_массив с треугольниками
        char[][] mass = new char[4][4];
        for (int i = 0; i < mass.length; i++) {
            Arrays.fill(mass[i], '*');
        }
        triangle(mass, 'a');
        triangle(mass, 'b');
        triangle(mass, 'c');
        triangle(mass, 'd');
        //4_задача_Положительное число и количество цифр в этом числе
        countNumbers(-50);
        countNumbers(-142584242);
        countNumbers(504546);
        countNumbers(0);
        countNumbers(1);
        countNumbers(-1);
        //5_задача_Массив из нечетных чисел от 1 до 100 с выводом в обратном порядке
        mass();
        //6_задача_Определение максимального элемента в массиве
        maxElemetnt();
        //7_задача_Замена каждого элемента с нечетным индексом на ноль.
        mass2();
        //8_задача_Замена максимального элемента на нулевой
        maxElementChange();
        //9_задача_Различие элементов массивов
        mass3();
        //10_задача_Матрица
        System.out.println("Введите размер матрицы ");
        Scanner input;
        int dim;
        while (true) {
            input = new Scanner(System.in);
            if (input.hasNextInt()) {
                dim = input.nextInt();
                if (dim > 0) {
                    break;
                }
            }
            System.out.println("Введите целое положительное число");
        }
        Random random = new Random();
        int[][] matrix = new int[dim][dim];
        for (int i = 0; i < dim; i++) {
            for (int j = 0; j < dim; j++) {
                matrix[i][j] = random.nextInt(51);
                System.out.printf("%2d ", matrix[i][j]);
            }
            System.out.println();
        }
        System.out.println();
        transpose(matrix);
    }


//         1) Одноклеточная амеба каждые 3 часа делится на 2 клетки. Определить,
//   сколько амеб будет через 3, 6, 9, 12,..., 24 часа

    private static void divisionAmeba() {
        int ameba = 1;
        for (int i = 3; i <= 24; i += 3) {
            ameba = ameba * 2;
            System.out.println("Если одна амеба каждые три часа делится на две, то количество амеб через " + i + " ч. будет равно " + ameba);
        }
    }


//        2) Напишите реализацию метода summ(int a, int b), вычисляющий a*b, не пользуясь операцией
//        умножения, где a и b целые числа, вызовите метод summ  в методе main и распечатайте на консоль.


    private static int summ(int a, int b) {
        int sum = 0;
        for (int i = 0; i < b; i++) {
            sum += a;
        }
        return sum;
    }

//        3) Дан двухмерный массив размерностью 4 на 4, необходимо нарисовать четыре треугольника вида

//        a)                  b)
//              *        *
//            * *        * *
//          * * *        * * *
//        * * * *        * * * *
//
//        c)                  d)
//        * * * *        * * * *
//          * * *        * * *
//            * *        * *
//              *        *

    private static void triangle(char[][] mass, char type) {
        switch (type) {
            case 'a':
                for (int i = 0; i < mass.length; i++) {
                    for (int j = 0; j < mass.length; j++) {
                        if (j >= mass.length - 1 - i) {
                            System.out.print(mass[i][j]);
                        } else {
                            System.out.print(' ');
                        }
                    }
                    System.out.println();
                }
                break;
            case 'b':
                for (int i = 0; i < mass.length; i++) {
                    for (int j = 0; j < mass.length; j++) {
                        if (j <= i) {
                            System.out.print(mass[i][j]);
                        } else {
                            System.out.print(' ');
                        }
                    }
                    System.out.println();
                }
                break;
            case 'c':
                for (int i = 0; i < mass.length; i++) {
                    for (int j = 0; j < mass.length; j++) {
                        if (j >= i) {
                            System.out.print(mass[i][j]);
                        } else {
                            System.out.print(' ');
                        }
                    }
                    System.out.println();
                }
                break;
            case 'd':
                for (int i = 0; i < mass.length; i++) {
                    for (int j = 0; j < mass.length; j++) {
                        if (j <= mass.length - 1 - i) {
                            System.out.print(mass[i][j]);
                        } else {
                            System.out.print(' ');
                        }
                    }
                    System.out.println();
                }
                break;
        }
        System.out.println();
    }

//        4)В переменную записываем число.
//        Надо вывести на экран сколько в этом числе цифр и положительное оно или отрицательное.
//        Например, Введите число: 5
//        "5 - это положительное число, количество цифр = 1"

    private static void countNumbers(int a) {
        int count = (a == 0) ? 1 : 0;
        int b = a;
        if (a < 0) {
            while (b != 0) {
                count++;
                b /= 10;
            }
            System.out.println(a + " это отрицательное число, количество цифр = " + count);
        } else if (b > 0) {
            while (b != 0) {
                count++;
                b /= 10;
            }
            System.out.println(a + " это положительное число, количество цифр = " + count);
        } else
            System.out.println("Это ноль, количестов цифр = 1");
    }


//        5) Создайте массив из всех нечётных чисел от 1 до 100, выведите его на экран в строку,
//        а затем этот же массив выведите на экран тоже в строку, но в обратном порядке (99 97 95 93 ... 7 5 3 1).

    private static void mass() {
        int a = 0;
        for (int i = 0; i < 100; i++) {
            if (i % 2 != 0) a++;
        }
        int[] mas = new int[a];
        for (int i = 1, b = 0; i < 100; i++) {
            if (i % 2 != 0) {
                mas[b] = i;
                System.out.print(mas[b] + " ");
                b++;
            }
        }
        System.out.println(" ");
        for (int i = mas.length - 1; i >= 0; i--) {
            System.out.print(mas[i] + " ");
        }
        System.out.println();
    }

//        6) Создайте массив из int[] mass = new int[12]; Рандомно заполните его значениями от 0 до 15.
//        Определите какой элемент является в этом массиве максимальным и сообщите индекс его последнего вхождения в массив.
//        Пример: {3,4,5,62,7,8,4,-5,7,62,5,1} Максимальный элемент 62, индекс его последнего вхождения в массив = 10

    private static void maxElemetnt() {
        int[] mass = new int[12];
        Random random = new Random();
        for (int i = 0; i < mass.length; i++) {
            mass[i] = random.nextInt(16);
            System.out.print(mass[i] + " ");
        }
        System.out.println();
        int max = mass[0];
        for (int j = 0; j < mass.length; j++) {
            if (max < mass[j]) {
                max = mass[j];
            }
        }
        int maxIndex = 0;
        for (int i = 0; i < mass.length; i++) {
            if (mass[i] == max) {
                maxIndex = i + 1;
            }
        }
        System.out.println("Максимальный элемент массива равен " + max + " индекс его последнего вхождения равен " + maxIndex);
    }


//        7) Создайте массив размера 20, заполните его случайными целыми чиселами из отрезка от 0 до 20.
//        Выведите массив на экран в строку. Замените каждый элемент с нечётным индексом на ноль.
//        Снова выведете массив на экран на отдельной строке.

    private static void mass2() {
        int[] mass2 = new int[20];
        Random random = new Random();
        for (int i = 0; i < mass2.length; i++) {
            mass2[i] = random.nextInt(20);
            System.out.print(mass2[i] + " ");
            if (i % 2 != 0) {
                mass2[i] = 0;
            }
        }
        System.out.println();
        for (int i = 0; i < mass2.length; i++) {
            System.out.print(mass2[i] + " ");
        }
        System.out.println();
    }

//        8) Найти максимальный элемент в массиве {4,5,0,23,77,0,8,9,101,2} и поменять его местами с нулевым элементом

    private static void maxElementChange() {
        int[] mass = new int[]{4, 5, 0, 23, 77, 0, 8, 9, 101, 2};
        int max = mass[0];
        int changeNull = mass[0];
        for (int j = 0; j < mass.length; j++) {
            if (max < mass[j]) {
                max = mass[j];
            }
        }
        System.out.println(Arrays.toString(mass));
        System.out.println();
        for (int i = 0; i < mass.length; i++) {
            if (max == mass[i]) {
                mass[i] = changeNull;
            } else {
                mass[0] = max;
            }
        }
        System.out.println(Arrays.toString(mass));
        System.out.println();
    }

//        9) Проверить, различны ли все элементы массива, если не различны то вывести элемент повторяющийся
//        Пример: {0,3,46,3,2,1,2}
//        Массив имеет повторяющиеся элементы 3, 2
//        Пример: {0,34,46,31,20,1,28}
//        Массив не имеет повторяющихся элементов


    public static void mass3() {
        int[] mass3 = {46, 46, 2, 2, 47, 3, 3, 47};
        Arrays.sort(mass3);
        System.out.println(Arrays.toString(mass3));
        int length = mass3.length;
        boolean flag = true;
        List<Integer> result = new ArrayList<>();
        for (int i = 0, j = i + 1; i < length && j < length; i++, j++) {
            if (mass3[i] == mass3[j] && flag) {
                result.add(mass3[i]);
                flag = false;
            } else {
                flag = true;
            }
        }
        if (!result.isEmpty()) {
            System.out.print("Массив имеет повторяющиеся элементы ");
            System.out.println(result);
        } else {
            System.out.println("Массив не имеет повторяющихся элементов");
        }
        System.out.println();
    }


//        10) Создаём квадратную матрицу, размер вводим с клавиатуры.
//        Заполняем случайными числами в диапазоне от 0 до 50. И выводим на консоль(в виде матрицы).
//        Далее необходимо транспонировать матрицу(1 столбец станет 1-й строкой, 2-й столбец - 2-й строкой и т. д.)
//        Пример:
//          1 2 3 4      1 6 3 1
//          6 7 8 9      2 7 3 5
//          3 3 4 5      3 8 4 6
//          1 5 6 7      4 9 5 7

    public static void transpose(int[][] matr) {
        int[][] transposedMatr = new int[matr.length][matr.length];
        for (int i = 0; i < matr.length; i++) {
            for (int j = 0; j < matr.length; j++) {
                transposedMatr[j][i] = matr[i][j];
            }
        }
        for (int i = 0; i < transposedMatr.length; i++) {
            for (int j = 0; j < transposedMatr.length; j++) {
                System.out.printf("%2d ", transposedMatr[i][j]);
            }
            System.out.println();
        }

    }
}
