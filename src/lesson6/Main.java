package src.lesson6;

public class Main {
    public static void main(String[] args) {

        // Проверка задания 1
        TaskMethods.printThreeWords();

        // Проверка задания 2
        TaskMethods.checkSumSign();

        // Проверка задания 3
        TaskMethods.printColor();

        // Проверка задания 4
        TaskMethods.compareNumbers();

        // Проверка задания 5
        System.out.println(TaskMethods.isSumInRange(10, 5));

        // Проверка задания 6
        TaskMethods.printSign(5);

        // Проверка задания 7
        System.out.println(TaskMethods.isNegative(9));

        // Проверка задания 8
        TaskMethods.printStringMultipleTimes("Hello", 3);

        // Проверка задания 9
        System.out.println(TaskMethods.isLeapYear(2024));

        // Проверка задания 10
        int[] binaryArray = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        TaskMethods.invertBinaryArray(binaryArray);
        for (int i : binaryArray) {
            System.out.print(i + " ");
        }
        System.out.println();

        // Проверка задания 11
        int[] hundredArray = TaskMethods.fillArrayWithNumbers();
        for (int i : hundredArray) {
            System.out.print(i + " ");
        }
        System.out.println();

        // Проверка задания 12
        int[] specificArray = TaskMethods.modifyArray();
        for (int i : specificArray) {
            System.out.print(i + " ");
        }
        System.out.println();

        // Проверка задания 13
        int[][] diagonalMatrix = TaskMethods.createDiagonalMatrix(5);
        for (int[] row : diagonalMatrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }

        // Проверка задания 14
        int[] customArray = TaskMethods.createAndFillArray(10, 7);
        for (int i : customArray) {
            System.out.print(i + " ");
        }
    }

}
