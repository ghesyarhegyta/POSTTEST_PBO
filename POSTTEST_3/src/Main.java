import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static ArrayList<Reservation> daftarReservasi = new ArrayList<>();
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        int pilihan;

        do {
            System.out.println("\n---------------------------------------------------");
            System.out.println("˗ˏˋLUXECLAWS-SISTEM MANAJEMEN RESERVASI NAIL ART´ˎ˗");
            System.out.println("---------------------------------------------------");
            System.out.println("1. Tambah Reservasi");
            System.out.println("2. Lihat Reservasi");
            System.out.println("3. Update Reservasi");
            System.out.println("4. Hapus Reservasi");
            System.out.println("5. Exit");
            System.out.println("---------------------------------------------------");
            System.out.print("(๑>◡<๑) Ayo silahkan pilih menu: ");

            pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {

                case 1:
                    tambahReservasi();
                    break;

                case 2:
                    lihatReservasi();
                    break;

                case 3:
                    updateReservasi();
                    break;

                case 4:
                    hapusReservasi();
                    break;

                case 5:
                    System.out.println("Arigatooo!! ⸜(｡˃ ᵕ ˂ )⸝♡");
                    break;

                default:
                    System.out.println("(╥﹏╥) OOPS menu tidak tersedia ↻");
            }

        } while (pilihan != 5);
    }

    static void tambahReservasi() {

        System.out.println("Lesgoow isi data kamu ya!! ٩(^ᗜ^ )و ´-");

        System.out.print("Nama Customer: ");
        String nama = input.nextLine();

        System.out.print("No HP: ");
        String hp = input.nextLine();

        System.out.print("Layanan Nail Art: ");
        String layanan = input.nextLine();

        System.out.print("Harga: ");
        int harga = input.nextInt();
        input.nextLine();

        System.out.print("Tanggal Reservasi: ");
        String tanggal = input.nextLine();

        System.out.print("Pilih kategori (1. Regular / 2. VIP): ");
        int pilihCust = input.nextInt();
        input.nextLine();

        Customer customer;
        if (pilihCust == 2) {
            customer = new VIPCustomer(nama, hp);
        } else {
            customer = new RegularCustomer(nama, hp);
        }

        System.out.print("Pilih jenis layanan (1. Basic / 2. Premium): ");
        int pilihService = input.nextInt();
        input.nextLine();

        NailArtService service;
        if (pilihService == 2) {
            service = new PremiumService(layanan, harga);
        } else {
            service = new BasicService(layanan, harga);
        }

        Reservation reservasi = new Reservation(customer, service, tanggal);
        daftarReservasi.add(reservasi);

        System.out.println("YEAYY ദ്ദി(˵ •̀ ᴗ - ˵ ) ✧ Reservasi berhasil ditambahkan!");
    }

    static void lihatReservasi() {

        if (daftarReservasi.isEmpty()) {
            System.out.println("(╥﹏╥) OOPS belum ada reservasi.");
            return;
        }

        for (int i = 0; i < daftarReservasi.size(); i++) {

            Reservation r = daftarReservasi.get(i);

            System.out.println("\n.✦ ݁˖Reservasi ke-" + (i + 1));
            System.out.println("Nama: " + r.getCustomer().getNama());
            System.out.println("No HP: " + r.getCustomer().getNoHp());
            System.out.println("Kategori: " + r.getCustomer().getKategori());
            System.out.println("Layanan: " + r.getLayanan().getNamaLayanan());
            System.out.println("Harga: " + r.getLayanan().getHarga());
            System.out.println("Tanggal: " + r.getTanggal());
            System.out.println("-----------------------.✦ ݁˖");
        }
    }

    static void updateReservasi() {

        if (daftarReservasi.isEmpty()) {
            System.out.println("(╥﹏╥) Belum ada reservasi untuk diupdate.");
            return;
        }

        lihatReservasi();

        System.out.print("Pilih nomor reservasi yang ingin diupdate: ");
        int index = input.nextInt() - 1;
        input.nextLine();

        if (index >= 0 && index < daftarReservasi.size()) {

            System.out.print("Nama baru: ");
            String nama = input.nextLine();

            System.out.print("No HP baru: ");
            String hp = input.nextLine();

            System.out.print("Layanan baru: ");
            String layanan = input.nextLine();

            System.out.print("Harga baru: ");
            int harga = input.nextInt();
            input.nextLine();

            System.out.print("Tanggal baru: ");
            String tanggal = input.nextLine();

            System.out.print("Pilih kategori (1. Regular / 2. VIP): ");
            int pilihCust = input.nextInt();
            input.nextLine();

            Customer customer;
            if (pilihCust == 2) {
                customer = new VIPCustomer(nama, hp);
            } else {
                customer = new RegularCustomer(nama, hp);
            }

            System.out.print("Pilih jenis layanan (1. Basic / 2. Premium): ");
            int pilihService = input.nextInt();
            input.nextLine();

            NailArtService service;
            if (pilihService == 2) {
                service = new PremiumService(layanan, harga);
            } else {
                service = new BasicService(layanan, harga);
            }

            Reservation reservasiBaru = new Reservation(customer, service, tanggal);
            daftarReservasi.set(index, reservasiBaru);

            System.out.println("YUHUUU (*´▽`*) data berhasil diupdate!");

        } else {
            System.out.println("OOPS index tidak valid ( ˶°ㅁ°) !!");
        }
    }

    static void hapusReservasi() {

        if (daftarReservasi.isEmpty()) {
            System.out.println("(╥﹏╥) Belum ada reservasi untuk dihapus.");
            return;
        }

        lihatReservasi();

        System.out.print("Pilih nomor reservasi yang ingin dihapus: ");
        int index = input.nextInt();

        if (index > 0 && index <= daftarReservasi.size()) {

            daftarReservasi.remove(index - 1);
            System.out.println("(๑'ᵕ'๑)⸝* Reservasi berhasil dihapus, byee");

        } else {
            System.out.println("OOPS index tidak valid ( ˶°ㅁ°) !!");
        }
    }
}