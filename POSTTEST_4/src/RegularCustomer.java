public class RegularCustomer extends Customer {

    public RegularCustomer(String nama, String noHp) {
        super(nama, noHp);
        this.kategori = "Regular";
    }

    @Override
    public String getInfo() {
        return "Customer Regular\nNama: " + nama + "\nNo HP: " + noHp;
    }
}