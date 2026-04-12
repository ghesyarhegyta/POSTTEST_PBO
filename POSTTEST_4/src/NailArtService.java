class NailArtService {

    protected String namaLayanan;
    protected int harga;

    NailArtService(String namaLayanan, int harga) {
        this.namaLayanan = namaLayanan;
        this.harga = harga;
    }

    public String getNamaLayanan() { return namaLayanan; }
    public int getHarga() { return harga; }

    public String getDetailService() {
        return namaLayanan + " - Rp" + harga;
    }
}