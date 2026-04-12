class BasicService extends NailArtService {

    BasicService(String namaLayanan, int harga) {
        super(namaLayanan, harga);
    }

    @Override
    public String getDetailService() {
        return "Basic Service: " + namaLayanan + " - Rp" + harga;
    }
}