package meet6;

import java.util.Scanner;

public class bilanganTerbesar15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan bilangan pertama (bil1): ");
        int bil1 = input.nextInt();
        System.out.print("Masukkan bilangan kedua (bil2): ");
        int bil2 = input.nextInt();
        System.out.print("Masukkan bilangan ketiga (bil3): ");
        int bil3 = input.nextInt();

        if (bil1 > bil2) {
            if (bil1 > bil3) {
                System.out.println("Bilangan terbesar adalah: " + bil1);
            } else {
                System.out.println("Bilangan terbesar adalah: " + bil3);
            }
        } else {
            if (bil2 > bil3) {
                System.out.println("Bilangan terbesar adalah: " + bil2);
            } else {
                System.out.println("Bilangan terbesar adalah: " + bil3);
            }
        }
    }
}

