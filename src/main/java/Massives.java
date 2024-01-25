public class Massives {

    public static final int MAX_RANDOM_NUMBER = 100;

    public static void main(String[] args) {
        int[] numbers = new int[10];
        fillArrayWithRandomNumbers(numbers);
        printMaxNumber(numbers);
        printMinNumber(numbers);
        printAverageNumber(numbers);
    }

    //Заполнение массива случайными числами от 1 до 100
    private static void fillArrayWithRandomNumbers(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * MAX_RANDOM_NUMBER + 1);
            System.out.println(numbers[i]);
        }
    }

    //Максимальное значение
    private static void printMaxNumber(int[] numbers) {
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        System.out.println("Максимальное значение: " + max);
    }

    //Минимальное значение
    private static void printMinNumber(int[] numbers) {
        int min = numbers[0];
        for (int j = 1; j < numbers.length; j++) {
            if (numbers[j] < min) {
                min = numbers[j];
            }
        }
        System.out.println("Минимальное значение: " + min);
    }

    //Среднее значение
    private static void printAverageNumber(int[] numbers) {
        double sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        double average = sum / numbers.length;
        System.out.println("Среднее значение: " + average);
    }
}
