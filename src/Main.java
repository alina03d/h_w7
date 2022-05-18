import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = generateRandomArray();
        System.out.println(Arrays.toString(arr));

        int sum = 0;

        for (int index = 0; index < arr.length; index++) {
            sum += arr[index];
        }
        System.out.println("Сумма трат за месяц составила " + sum + "рублей");

        int min = 200001;
        int max = 99999;
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] < min){
                min = arr[index];
            }
            if(arr[index] > max){
                max = arr[index];
            }
        }
        System.out.printf("Минимальная сумма трат за день составила %d рублей. Максимальная сумма трат за день составила %d рублей",min,max);

        double average =(double) sum/arr.length;
        System.out.println("Средняя сумма трат за месяц составила"+ average+ " рублей");

        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--){
            System.out.print(reverseFullName[i]);
        }


    }
    int[] arr = generateRandomArray();
    private static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;

    }

}