public class Reservation {

    private Customer customer;
    private NailArtService layanan;
    private String tanggal;

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
    }

    public void tampilkanReservasi(boolean detail) {
        if (detail) {
            tampilkanReservasi();
        } else {
            System.out.println(customer.getNama() + " - " + layanan.getNamaLayanan());
        }
    }
}