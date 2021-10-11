package VL02;

import java.util.Scanner;

    public class Aufg04 {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Im Folgenden werden 2 beliebige ganze Zahlen zu Ihrer Matrikelnummer (1234) addiert.");
            System.out.print("Geben Sie bitte ");
            System.out.println("eine beliebige ganze Zahl ein");
            int z1 = sc.nextInt();
            System.out.print("Geben Sie bitte ");
            System.out.println("eine weitere ganze Zahl ein");
            int z2 = sc.nextInt();
            final int matrnr = 1234;
            int addiert = matrnr + z1 + z2;
            System.out.print("Das Ergebnis lautet: ");
            System.out.print(z1);
            System.out.print(" + ");
            System.out.print(z2);
            System.out.print(" + ");
            System.out.print(1234);
            System.out.print(" = ");
            System.out.println(addiert);
        }
    }
