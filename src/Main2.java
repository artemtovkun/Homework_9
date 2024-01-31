import java.util.Arrays;
import java.util.Random;
public class Main2 {
    public static void main(String[] args) {
        //Задача 1
        //Бухгалтеры попросили посчитать сумму всех выплат за месяц.
        //Напишите программу, которая решит эту задачу, и выведите в консоль результат в формате: «Сумма трат за месяц составила … рублей».
        int[] ints = generateRandomArray();
        System.out.println(Arrays.toString(ints));
        int result = 0;
        for (int value : ints) {
            result = result + value;
        }
        System.out.println("Сумма всех выплат за месяц составила " +result+ " рублей.");
        //Задача 2
        //Также бухгалтерия попросила найти минимальную и максимальную трату за день.
        //Напишите программу, которая решит эту задачу, и выведите в консоль результат в формате:
        //«Минимальная сумма трат за день составила … рублей. Максимальная сумма трат за день составила … рублей».
        int[] expenses = generateRandomArray();
        int totalExpenses = 0;
        int minExpense = 0;
        int maxExpense = 0;

        for (int expens : expenses) {
            totalExpenses += expens;
            if (expens < minExpense) {
                minExpense = expens;
            }
            if (expens > maxExpense) {
                maxExpense = expens;
            }
        }
        double resultAverage = (double) totalExpenses / expenses.length; // Задача 3
        System.out.println("Сумма трат за месяц составила " +totalExpenses+ " рублей");
        System.out.println("Минимальная сумма трат за день составила " +minExpense+ " рублей");
        System.out.println("Максимальная сумма трат за день составила " +maxExpense+ " рублей");
        //Задача 3
        System.out.println("Средняя сумма трат за месяц составила " +resultAverage+ " рублей");
        //Задача 4

        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0 ; i--) {
            System.out.print(reverseFullName[i]);

        }
    }

    // Объявить метод «сгенерироватьМассив»
    public static int[] generateRandomArray() {
        Random random = new Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000 + 1) + 100_000;
        }
        return arr;
        }

    }

