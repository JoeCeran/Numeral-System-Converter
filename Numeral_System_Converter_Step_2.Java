package converter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        //int binary = 0b1010;
        //System.out.println(input + " = 0b" + Integer.toBinaryString(binary));
        //int lastDigit = input % 10;
        //sample.charAt(sample.length() -1)
        //System.out.println((Integer.toBinaryString(input).charAt(Integer.toBinaryString(input).length() - 1)));
        System.out.println((input % 8));
    }
}
