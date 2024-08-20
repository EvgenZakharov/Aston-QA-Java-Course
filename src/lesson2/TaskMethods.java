package src.lesson2;

public class TaskMethods {

    // Задание 1
    public static void printThreeWords() {
        System.out.println("Orange" + '\n' + "Banana" + '\n' + "Apple");
    }

    // Задание 2
    public static void checkSumSign() {
        int a = -5;
        int b = 10;
        int sum = a + b;
//        if (sum >= 0) {
//            System.out.println("Сумма положительная");
//        } else {
//            System.out.println("Сумма отрицательная");
//        }
        System.out.println(sum >= 0 ? "Сумма положительная" : "Сумма отрицательная");
    }

    // Задание 3
    public static void printColor() {
        int value = 99;

        if (value <= 0) {
            System.out.println("Красный");
//        } else if (value > 0 && value <= 100) {
        } else if (value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }

    // Задание 4
    public static void compareNumbers() {
        int a = 10;
        int b = 20;
//        if (a >= b) {
//            System.out.println("a >= b");
//        } else {
//            System.out.println("a < b");
//        }
        System.out.println(a >= b ? "a >= b" : "a < b");
    }

    // Задание 5
    public static boolean isSumInRange(int a, int b) {
        int sum = a + b;
        return sum >= 10 && sum <= 20;
    }

    // Задание 6
    public static void printSign(int number) {
//        if (number >= 0) {
//            System.out.println("Число положительное");
//        } else {
//            System.out.println("Число отрицательное");
//        }
        System.out.println(number >= 0 ? "Число положительное" : "Число отрицательное");
    }

    // Задание 7
    public static boolean isNegative(int number) {
        return number < 0;
    }

    // Задание 8
    public static void printStringMultipleTimes(String str, int times) {
        for (int i = 0; i < times; i++) {
            System.out.println(str);
        }
    }

    // Задание 9
    public static boolean isLeapYear(int year) {
        if (year % 400 == 0) {
            return true;
        } else if (year % 100 == 0) {
            return false;
        } else {
            return year % 4 == 0;
        }
    }

    // Задание 10
    public static void invertBinaryArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] == 0 ? 1 : 0;
        }
    }

    // Задание 11
    public static int[] fillArrayWithNumbers() {
        int[] array = new int[100];
        for (int i = 0; i < 100; i++) {
            array[i] = i + 1;
        }
        return array;
    }

    // Задание 12
    public static int[] modifyArray() {
        int[] specificArray = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < specificArray.length; i++) {
            if (specificArray[i] < 6) {
                specificArray[i] *= 2;
            }
        }
        return specificArray;
    }

    // Задание 13
    public static int[][] createDiagonalMatrix(int size) {
        int[][] matrix = new int[size][size];
        for (int i = 0; i < size; i++) {
            matrix[i][i] = 1;
            matrix[i][size - i - 1] = 1;
        }
        return matrix;
    }

    // Задание 14
    public static int[] createAndFillArray(int len, int initialValue) {
        int[] array = new int[len];
        for (int i = 0; i < len; i++) {
            array[i] = initialValue;
        }
        return array;


    }
}
