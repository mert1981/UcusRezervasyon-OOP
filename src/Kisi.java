

import java.util.List;

abstract class Kisi {
    protected String adSoyad;
    protected String dogumTarihi;

    public Kisi(String adSoyad, int gun, int ay, int yil) {
        this.adSoyad = adSoyad;
        this.dogumTarihi = String.format("%02d-%02d-%04d", gun, ay, yil);
    }

    public abstract String getKategori();

    @Override
    public String toString() {
        return String.format("%-20s %-15s %-15s", adSoyad, dogumTarihi, getKategori());
    }

    public static void listele() {
    	System.out.printf("%-20s %-15s %-15s%n", "Ad Soyad", "Doğum Tarihi", "Kategori");
        System.out.println("---------------------------------------------------------");
    
        List<String[]> kisiVerileri = DosyaOkuyucu.dosyaOku("src/files/Kisiler.txt", ";");

        for (String[] veriler : kisiVerileri) {
            String adSoyad = veriler[0].trim();
            int gun = Integer.parseInt(veriler[1].trim());
            int ay = Integer.parseInt(veriler[2].trim());
            int yil = Integer.parseInt(veriler[3].trim());
            String kategori = veriler[4].trim();

            Kisi kisi;
            switch (kategori) {
                case "Yönetici":
                    kisi = new Yonetici(adSoyad, gun, ay, yil);
                    break;
                case "KabinUyesi":
                    kisi = new KabinUyesi(adSoyad, gun, ay, yil);
                    break;
                case "Pilot":
                    kisi = new Pilot(adSoyad, gun, ay, yil);
                    break;
                case "Müsteri":
                    kisi = new Müsteri(adSoyad, gun, ay, yil);
                    break;
                case "Calisan":
                    kisi = new Calisan(adSoyad, gun, ay, yil);
                    break;
                default:
                    System.err.println("Bilinmeyen kategori: " + kategori);
                    continue;
            }
            System.out.println(kisi);
        }
    }
}
