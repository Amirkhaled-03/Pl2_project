package helpers;

import java.util.Scanner;

public class Functions {
    static Scanner scanner = new Scanner(System.in);
    public static   int readInt() {
        int num = 0;

        while (true) {
            try {
                num = scanner.nextInt();
                return num;

            } catch (Exception exception) {
                System.out.print("enter a valid int num: ");
                scanner.nextLine();
            }
        }
    }
}
