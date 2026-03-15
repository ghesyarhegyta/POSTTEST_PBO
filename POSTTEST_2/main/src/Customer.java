public class Customer {

    private String nama;
    private String noHp;
    protected String kategori;

    public Customer(String nama, String noHp) {
        this.nama = nama;
        this.noHp = noHp;
        this.kategori = "Regular";
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNoHp() {
        return noHp;
    }

    public void setNoHp(String noHp) {
        this.noHp = noHp;
    }

    public String getKategori() {
        return kategori;
    }
}