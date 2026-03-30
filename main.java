import java.util.Scanner;

public class Main{
    public static void main(String[] args) {

        // EXPERIMENT GWEHHH
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan NIM: ");
        String nim = input.nextLine();

        System.out.println("Masukkan nama: ");
        String nama = input.nextLine();

        System.out.println("Masukkan Alamat: ");
        String alamat = input.next();

        System.out.println("Masukkan No HP: ");
        String noHp = input.next();

        System.out.println("Masukkan Jenis Kelamin: ");
        String jenisKelamin = input.next();

        System.out.println("Masukkan Program Studi: ");
        String programStudi = input.next();

        System.out.println("Masukkan dosen Wali: ");
        String dosenWali = input.next();

        System.out.println("BOP yang perlu dibayar: ");
        Integer bopPerluDibayar = input.nextInt();

        System.out.println("Bayarkan Sisa BOP: ");
        Integer bayarBOP = input.nextInt();

        System.out.println("Sisa BOP: ");
        Integer sisaBOP = bopPerluDibayar - bayarBOP;
        // kalkulasi penjumlahan
        // int hasil = angka1 + angka2;
        System.out.println("NIM: " + nim);
        System.out.println("Nama: " + nama);
        System.out.println("Alamat: " + alamat);
        System.out.println("No HP: " + noHp);
        System.out.println("Jenis Kelamin: " + jenisKelamin);
        System.out.println("Program Studi: " + programStudi);
        System.out.println("Dosen Wali: " + dosenWali);
        System.out.println("BOP yang perlu dibayar: " + bopPerluDibayar);
        System.out.println("Bayar BOP: " + bayarBOP);
        System.out.println("Sisa BOP: " + sisaBOP);

      }
}
