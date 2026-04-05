public class Reservation {

    private Customer customer;
    private NailArtService layanan;
    private String tanggal;

    public Reservation(Customer customer, NailArtService layanan, String tanggal) {
        this.customer = customer;
        this.layanan = layanan;
        this.tanggal = tanggal;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public NailArtService getLayanan() {
        return layanan;
    }

    public void setLayanan(NailArtService layanan) {
        this.layanan = layanan;
    }

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }
}