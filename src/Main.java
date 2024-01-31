import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        //Сравнивание массивов
        int[] weights = {90, 91, 93, 92, 85, 87, 88, 89, 0, 0, 0, 0};
        int[] weightsCopy = {90, 91, 93, 92, 85, 87, 88, 89, 0, 0, 0, 0};
        // это "weights[0] = 90" нужно будет удалить, переменной уже присвоено значение
        int januaryWeight = weights[0];
        System.out.println(januaryWeight+ " abc");
        System.out.println(weights[0]);
        System.out.println(weights[4]);
        int january = 0;
        System.out.println(weights[january]+ " пометка");
        for (int weight : weights) {
            System.out.print(weight + " ");
        }
        System.out.println();
        boolean arraysAreEqual = true;
        arraysAreEqual = weights.length == weightsCopy.length;
        if (arraysAreEqual) {
            for (int i = 0; i < weights.length; i++) {
                if (weights[i] != weightsCopy[i]) {
                    arraysAreEqual = false;
                }
            }
        }
        if (arraysAreEqual) {
            System.out.println("Массивы одинаковые");
        }
        else {
            System.out.println("Массивы разные");
        }
        for (int i = 0; i < weightsCopy.length; i++){
            System.out.print(weightsCopy[i]+ " ");
        }
        System.out.println();
        int maxWeight = -1;
        for (int i = 0; i < weights.length; i++) {
            if (weights[i] > maxWeight) {
                maxWeight = weights[i];
            }
        }
        System.out.println("Максимальное значение - " +maxWeight);
        System.out.println("Вычитание предыдущего из последующего: " );
        for (int i = 0; i < weights.length - 1 && weights[ i + 1 ] != 0; i++) {
            //if (weights[ i + 1 ] != 0 ) { - это уже можно удалить, здесь остановка цикла если дальше будет пусто
                System.out.print(weights[i + 1] - weights[i]+ " ");
        }
    }
}