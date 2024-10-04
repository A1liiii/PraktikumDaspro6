package meet6;
import java.util.Scanner;

public class tokoSepatu15 {
    public static void main(String[] args) {
        String merek = "", kategori = "";
        int ukuran = 0;
        double harga = 0;

        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan merek sepatu (Converse/Sketcher/Nike): ");
        merek = input.nextLine();

        switch (merek) {
            case "Converse":
                System.out.println("======================");
                System.out.println("Kategori yang tersedia untuk Converse:");
                System.out.println("===Slip On====");
                System.out.println("===High Top===");
                System.out.println("======================");
                break;

            case "Sketcher":
                System.out.println("======================");
                System.out.println("Kategori yang tersedia untuk Sketcher:");
                System.out.println("===Woman====");
                System.out.println("===Man===");
                System.out.println("======================");
                break;

            case "Nike":
                System.out.println("======================");
                System.out.println("Kategori yang tersedia untuk Nike:");
                System.out.println("===Kids====");
                System.out.println("===Adult===");
                System.out.println("======================");
                break;

            default:
                System.out.println("Merek tidak ditemukan.");
                return;
        }

        System.out.print("Masukkan kategori sepatu: ");
        kategori = input.nextLine();

        System.out.print("Masukkan ukuran sepatu: ");
        ukuran = input.nextInt();

        switch (merek) {
            case "Converse":
                if (kategori.equals("Slip On")) {
                    if (ukuran >= 36 && ukuran <= 40) {
                        harga = 800000;
                    }
                } else if (kategori.equals("High Top")) {
                    if (ukuran >= 40 && ukuran <= 44) {
                        harga = 1200000;
                    }
                }
                break;

            case "Sketcher":
                if (kategori.equals("Woman")) {
                    if (ukuran >= 36 && ukuran <= 41) {
                        harga = 1000000;
                    }
                } else if (kategori.equals("Man")) {
                    if (ukuran >= 41 && ukuran <= 44) {
                        harga = 1800000;
                    }
                }
                break;

            case "Nike":
                if (kategori.equals("Kids")) {
                    if (ukuran >= 36 && ukuran <= 40) {
                        harga = 750000;
                    }
                } else if (kategori.equals("Adult")) {
                    if (ukuran >= 40 && ukuran <= 44) {
                        harga = 1500000;
                    }
                }
                break;
        }

        if (harga > 0) {
            System.out.printf("Harga sepatu: Rp."+ harga);
        } else {
            System.out.println("Sepatu dengan spesifikasi tersebut tidak tersedia.");
        }
    }
}
