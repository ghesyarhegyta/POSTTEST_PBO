public class VIPCustomer extends Customer {

    public VIPCustomer(String nama, String noHp) {
        super(nama, noHp);
        this.kategori = "VIP";
    }

    @Override
    public String getInfo() {
        return "🌟 VIP CUSTOMER 🌟\nNama: " + nama + "\nNo HP: " + noHp + "\nKategori: " + kategori;
    }
}