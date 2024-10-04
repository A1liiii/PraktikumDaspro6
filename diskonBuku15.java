package meet6;

import java.util.Scanner;

public class diskonBuku15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int HARGA_KAMUS = 25000;
        int HARGA_NOVEL = 42000;
        int HARGA_LAINNYA = 50000;

        System.out.print("Masukkan jenis buku (kamus/novel/lainnya): ");
        String jenisBuku = scanner.nextLine();
        System.out.print("Masukkan jumlah buku: ");
        int jumlahBuku = scanner.nextInt();

        double totalHarga = 0;
        double diskon = 0;

        if (jenisBuku.equals("kamus")) {
            totalHarga = HARGA_KAMUS * jumlahBuku;

            if (jumlahBuku > 2) {
                diskon = totalHarga * 0.10;
                totalHarga -= diskon;
                diskon += totalHarga * 0.02;
            } else {
                diskon = totalHarga * 0.10;
            }
        } else if (jenisBuku.equals("novel")) {
            totalHarga = HARGA_NOVEL * jumlahBuku;
            if (jumlahBuku > 3) {
                diskon = totalHarga * 0.07;
                totalHarga -= diskon;
                diskon += totalHarga * 0.02;
            } else {
                diskon = totalHarga * 0.07;
                totalHarga -= diskon;
                diskon += totalHarga * 0.01;
            }
        } else {
            totalHarga = HARGA_LAINNYA * jumlahBuku;
            if (jumlahBuku > 3) {
                diskon = totalHarga * 0.05;
            }
        }

        totalHarga -= diskon;

        System.out.println("Jumlah diskon: "+ diskon);
        System.out.println("Total yang harus dibayar: "+ totalHarga);
    }
}

