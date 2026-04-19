class PremiumService extends NailArtService implements Pembayaran {

    PremiumService(String namaLayanan, int harga) {
        super(namaLayanan, harga + 50000);
    }

    @Override
    public String getDetailService() {
        return "⭑✨♡ Premium Service: " + namaLayanan + " - Rp" + harga;
    }

    @Override
    public void bayar(int jumlah) {
        if (jumlah >= harga) {
            int kembalian = jumlah - harga;
            System.out.println("Pembayaran berhasil ദ്ദി(ᵔᗜᵔ)");
            System.out.println("Kembalian: Rp" + kembalian);
        } else {
            System.out.println("Uang kurang (╥﹏╥)");
        }
    }

    @Override
    public void cetakStruk() {
        System.out.println("\n⋆｡‧˚ʚ ୨ৎ ɞ˚‧｡⋆ STRUK PREMIUM SERVICE ⋆｡‧˚ʚ ୨ৎ ɞ˚‧｡⋆");
        System.out.println("Layanan: " + namaLayanan);
        System.out.println("Harga: Rp" + harga);
    }
}