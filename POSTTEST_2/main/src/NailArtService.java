class NailArtService {

    private String namaLayanan;
    private int harga;

    NailArtService(String namaLayanan, int harga) {
        this.namaLayanan = namaLayanan;
        this.harga = harga;
    }

    public String getNamaLayanan() {
        return namaLayanan;
    }

    public void setNamaLayanan(String namaLayanan) {
        this.namaLayanan = namaLayanan;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }
}