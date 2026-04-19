public class Reservation {

    private Customer customer;
    private NailArtService layanan;
    private String tanggal;
    private boolean sudahBayar = false;

    public Reservation(Customer customer, NailArtService layanan) {
        this.customer = customer;
        this.layanan = layanan;
        this.tanggal = "Belum ditentukan";
    }

    public Reservation(Customer customer, NailArtService layanan, String tanggal) {
        this.customer = customer;
        this.layanan = layanan;
        this.tanggal = tanggal;
    }

    public void tampilkanReservasi() {
        System.out.println(customer.getInfo());
        System.out.println(layanan.getDetailService());
        System.out.println("Tanggal: " + tanggal);
        System.out.println("Status: " + (sudahBayar ? "Sudah Dibayar ദ്ദി(ᵔᗜᵔ)" : "Belum Dibayar (╥﹏╥)"));
    }

    public void tampilkanReservasi(boolean detail) {
        if (detail) {
            tampilkanReservasi();
        } else {
            System.out.println(customer.getNama() + " - " + layanan.getNamaLayanan());
        }
    }

    public void prosesPembayaran(int uang) {

        if (sudahBayar) {
            System.out.println("Reservasi ini sudah dibayar yaa (⸝⸝> ᴗ•⸝⸝)");
            return;
        }

        if (layanan instanceof Pembayaran) {
            Pembayaran p = (Pembayaran) layanan;

            if (uang >= layanan.getHarga()) {
                p.bayar(uang);
                p.cetakStruk();
                sudahBayar = true;
            } else {
                p.bayar(uang);
            }
        }
    }
}