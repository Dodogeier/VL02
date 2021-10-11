package VL02;

import java.util.Scanner;

public class Aufg05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Im Folgenden wird irgendeine Rechnung durchgeführt. Surpriiiiise!");
        System.out.print("Geben Sie bitte ");
        System.out.println("eine beliebige ganze Zahl ein");
        int input = sc.nextInt();
        final int x = input;
        int mon1 = 5 * x;
        int mon2 = mon1 + 3 * x * x;
        mon1 = mon2 + x * x * x;
        System.out.println(mon1);
    }
}
