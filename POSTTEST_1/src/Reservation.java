public class Reservation {
    Customer customer;
    NailArtService layanan;
    String tanggal;

    Reservation(Customer customer, NailArtService layanan, String tanggal){
        this.customer = customer;
        this.layanan = layanan;
        this.tanggal = tanggal;
    }
}