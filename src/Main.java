public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        task1();

    }
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(50_000) + 300_000;
        }
        return arr;
    }

    public static void task1() {
        System.out.println("Задача 1");
        int [] arr = generateRandomArray();

//        System.out.println("Сумма трат за месяц составила " +  + " рублей");
    }
}

