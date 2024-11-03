import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // 1. Havalimanı ve diğer veri yapılarını oluşturma
    	
        Kisi yonetici = new Kisi("Ali Kırgız", "Yonetici", "123456789");
        Konum konum = new Konum("Türkiye", "İstanbul");
        Havalimani istanbulHavalimani = new Havalimani(yonetici, konum);

        // Havalimanına uçaklar ve uçuş ekleme
        Ucak ucak1 = new Ucak("Boeing 737", 180, 2018);
        istanbulHavalimani.ucakEkle(ucak1);

        Havalimani kalkisHavalimani = istanbulHavalimani;
        Havalimani varisHavalimani = new Havalimani(new Kisi("Ahmet", "Yılmaz", "Yonetici", "987654321"), new Konum("Türkiye", "Ankara"));

        Ucus ucus1 = new Ucus(1001, kalkisHavalimani, varisHavalimani, ucak1, new Gun("2024-12-01"), new Saat("10:30"), 5, Durum.AKTIF);
        List<Ucus> ucuslar = new ArrayList<>();
        ucuslar.add(ucus1);

        // 2. Müşteri havalimanı seçiyor
        System.out.println("Seçilen Havalimanı: " + istanbulHavalimani.getKonum());

        // 3. Mevcut uçuşları listele
        System.out.println("Mevcut Uçuşlar:");
        for (Ucus ucus : ucuslar) {
            System.out.println(ucus);
        }

        // 4. Müşteri bir uçuş seçiyor
        Ucus secilenUcus = ucuslar.get(0); // örnek olarak ilk uçuşu seçiyoruz
        System.out.println("Seçilen Uçuş: " + secilenUcus);

        // 5. Uçuş için rezervasyon yapma
        Kisi musteri = new Kisi("Fatma", "Kaya", "Musteri", "5551234567");
        UcusRezervasyonu rezervasyon = new UcusRezervasyonu(1, musteri, secilenUcus);

        
        Odeme odeme = new Odeme(150.0, "Kredi Kartı", Durum.ONAYLI);
        boolean odemeBasarili = odeme.islemYap();
        if (odemeBasarili) {
            System.out.println("Ödeme başarılı. Rezervasyon onaylandı!");
        } else {
            System.out.println("Ödeme başarısız. Lütfen tekrar deneyin.");
        }

        // Sonuçları yazdırma
        System.out.println("Rezervasyon Detayları: " + rezervasyon);
        System.out.println("Ödeme Detayları: " + odeme);
    }
}
