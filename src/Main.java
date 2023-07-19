import java.util.Arrays;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();

    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task1() {
        System.out.println("Задача 1");
        int[] arr = generateRandomArray();

        int salaryArr = 0;

        System.out.println(Arrays.toString(arr));

        for (int salary : arr) {
            salaryArr += salary;
        }
        System.out.println("Сумма трат за месяц составила " + salaryArr + " рублей");
    }

    public static void task2() {
        System.out.println("Задача 2");
        int[] arr = generateRandomArray();

        int minExpensesSalary = arr[0];
        int maxExpensesSalary = arr[0];

        System.out.println(Arrays.toString(arr));

        for (int salary : arr) {
            if (salary < minExpensesSalary) {
                minExpensesSalary = salary;
            }
            if (salary > maxExpensesSalary) {
                maxExpensesSalary = salary;
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + minExpensesSalary + " рублей");
        System.out.println("Максимальная сумма трат за день составила " + maxExpensesSalary + " рублей");

    }

    public static void task3() {
        System.out.println("Задача 3");
        int[] arr = generateRandomArray();

        int monthSalary = 0;

        System.out.println(Arrays.toString(arr));

        for (int salary : arr) {
            monthSalary += salary;
        }
        double mediumSalary = (double) monthSalary / arr.length;
        System.out.println("Средняя сумма трат за месяц составила " + mediumSalary + " рублей");
    }

    public static void task4() {
        System.out.println("Задача 4");

        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};

        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
            if (i != 0) {
                System.out.print(",");
            }
        }
    }
}




