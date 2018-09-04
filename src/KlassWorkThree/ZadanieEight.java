package KlassWorkThree;

import java.util.Scanner;

public class ZadanieEight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите число");
        double a = scanner.nextInt();
        double b = scanner.nextInt();
        double c;
        double d;
        if (a >= 1&b >= 1) {
            c = (a+b)/2;
            System.out.println("действительное положительное средне арифметическое число" +c);
            d = Math.sqrt(a*b);
            System.out.println("действительное положительное средне геометрисескоечисло" +d);
        }
        }
    }
