package KlassWorkTwo;

import java.util.Scanner;

public class ZadanieNine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите число");
        double a;
        double b;
        double c = scanner.nextDouble();
        double s = scanner.nextDouble();
        a=Math.sqrt((c*c)+(s*s));
        System.out.println("гипотенуза" +a);
        b=Math.sqrt ((c*s)/2);
        System.out.println("площадь" +b);
    }

}
