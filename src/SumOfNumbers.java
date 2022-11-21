import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть число:");
        int myNumber = scanner.nextInt();
        System.out.println("Сума цифр даного числа: " + sumOfNumbersVer1(myNumber));
    }

    static int sumOfNumbersVer1 (int a) {
        int result = 0;
        for (int i = 1; i <= a; i*=10) {
            int b = a % (10 * i);       // знаходимо одиниці/десятки і т д
            result += b / i;            // позбавляємось зайвих цифр
        }
        return result;
    }
}
