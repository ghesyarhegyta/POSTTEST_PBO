public class VIPCustomer extends Customer {

    public VIPCustomer(String nama, String noHp) {
        super(nama, noHp);
        this.kategori = "VIP";
    }
}