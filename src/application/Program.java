package application;

import entities.Pension;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("How many rooms will be rented: ");
        int n = sc.nextInt();

        Pension[] vect = new Pension[10];
        for (int i = 0; i < n; i++) {
            sc.nextLine();
            System.out.println("Rent #" + (i+1));
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("E-mail: ");
            String email = sc.nextLine();
            System.out.print("Room: ");
            int position = sc.nextInt();

            vect[position] = new Pension(position, name, email);
        }

        System.out.println("\nBusy rooms: ");
        for (int i = 0; i < vect.length; i++) {
            if (vect[i] != null) {
                System.out.println(vect[i].getRoom() + ": "+ vect[i].getName() + ", " + vect[i].getEmail());
            }
        }
        sc.close();
    }
}
