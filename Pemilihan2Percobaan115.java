package meet6;
import java.util.Scanner;
public class Pemilihan2Percobaan115 {
    public static void main(String[] args) {
        Scanner input15 = new Scanner(System.in);

        int tahun;

        System.out.println("Masukkan Tahun : ");
        tahun = input15.nextInt();

        if (tahun % 400 == 0) {
            System.out.println(tahun + " adalah tahun kabisat.");
        } else {
            if (tahun % 100 == 0) {
                System.out.println(tahun + " bukan tahun kabisat.");
            } else if (tahun % 4 == 0) {
                System.out.println(tahun + " adalah tahun kabisat.");
            } else {
                System.out.println(tahun + " bukan tahun kabisat.");
            }
        }
    }
}
