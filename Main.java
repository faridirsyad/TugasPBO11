import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.io.File;
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        int pilih;
        int pilih1;
        System.out.println("==================");
        System.out.println("   Bengkel Asoy   ");
        System.out.println("==================");
        System.out.println("1. Service        ");
        System.out.println("2. Exit           ");
        System.out.println("Masukkan Pilihan :");
        pilih = in.nextInt();

        switch (pilih){
            case 1 :
                int pilih2;
                Customer cs = new Customer();
                cs.input_data();
                cs.lihat_data();
                Motor mt = new Motor();
                mt.input_data();
                mt.update_data();
                Montir mon = new Montir();
                mon.input_data();
                mon.update_data();
                Service ser = new Service();
                ser.input_data();
                ser.jenis_service();
                ser.update_data();
                System.out.println("====================");
                System.out.println("Posisi Motor");
                System.out.println("1. Ditunggu");
                System.out.println("2. Ditinggal");
                System.out.println("Masukkan Pilihan : ");
                pilih2 = in.nextInt();

                if (pilih2 == 1){
                    ser.Ditunggu();
                } else if (pilih2 == 2) {
                    ser.Ditinggal();
                } else {
                    System.out.println("Salah Pilih");
                }
                try {
                    FileWriter file = new FileWriter("Data.txt");
                    file.write("Customer : "+cs.nama);
                    file.write("\nNo Hp    : "+cs.no_hp);
                    file.write("\nMerk     : "+mt.merk);
                    file.write("\nKeluhan  : "+mt.keluhan);
                    file.write("\nMontir   : "+mon.nama);
                    file.close();

                    System.out.println("File sudah ditulis!");
                } catch (IOException e) {
                    System.out.println("Terjadi kesalahan karena: " + e.getMessage());
                }
                break;
            case 2 :
                System.out.println("Exitt...");
                System.exit(0);
                break;
        }
        Pembayaran by = new Pembayaran(120000);
        int Total ;
        int Kembali;
        System.out.println("================================");
        System.out.println("          MENU PEMBAYARAN       ");
        System.out.println("================================");
        System.out.println("1. Service + Ganti Oli          ");
        System.out.println("2. Sercvie                      ");
        System.out.println("3. Ganti Oli                    ");
        System.out.println("================================");
        System.out.println("Masukan Pilihan Anda = ");
        pilih1 = in.nextInt();
        System.out.println();
        if (pilih1 == 1) {
            Total = 120000;
            System.out.println("Saldo       : " + by.biaya);
            System.out.println("Total Bayar : " + Total);
            Kembali = by.biaya-Total;
            System.out.println("Kembali     : " + Kembali);
        }
        else if (pilih1 == 2) {
            Total = 70000;
            System.out.println("Saldo       : " + by.biaya);
            System.out.println("Total Bayar : " + Total);
            Kembali = by.biaya-Total;
            System.out.println("Kembali     : " + Kembali);
        }
        else if (pilih1 == 3) {
            Total = 50000;
            System.out.println("Saldo       : " + by.biaya);
            System.out.println("Total Bayar : " + Total);
            Kembali = by.biaya-Total;
            System.out.println("Kembali     : " + Kembali);
        }
    }


}