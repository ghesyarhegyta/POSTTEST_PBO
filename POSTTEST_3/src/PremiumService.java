class PremiumService extends NailArtService {

    PremiumService(String namaLayanan, int harga) {
        super(namaLayanan, harga + 50000);
    }
}