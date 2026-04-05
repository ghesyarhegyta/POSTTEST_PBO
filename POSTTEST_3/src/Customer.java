public class Customer {

    protected String nama;
    protected String noHp;
    protected String kategori;

    public Customer(String nama, String noHp) {
        this.nama = nama;
        this.noHp = noHp;
        this.kategori = "Regular";
    }

    public String getNama() { return nama; }
    public String getNoHp() { return noHp; }
    public String getKategori() { return kategori; }
}