class PremiumService extends NailArtService {

    PremiumService(String namaLayanan, int harga) {
        super(namaLayanan, harga + 50000);
    }

    @Override
    public String getDetailService() {
        return "⭑✨♡ Premium Service: " + namaLayanan + " - Rp" + harga;
    }
}