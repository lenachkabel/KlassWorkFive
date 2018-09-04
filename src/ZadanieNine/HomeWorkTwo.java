package ZadanieNine;

import java.util.Scanner;

public class HomeWorkTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите целое число");
        int a = scanner.nextInt();
        if (a % 2 == 0) {
            System.out.println("к четному числу + 2" + a);
        } else {
            System.out.println("если нечетное +1" + a );
        }
    }
}

