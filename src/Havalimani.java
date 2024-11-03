import java.util.List;

public class Havalimani {
	
	private Kisi yonetici;             // Havalimanının yöneticisi, Kisi sınıfından bir nesne
    private Konum konum;               // Havalimanının konumu, Konum sınıfından bir nesne
    private List<Kisi> kisiler;        // Havalimanındaki kişiler, Kisi sınıfından nesnelerden oluşan bir liste
    private List<Ucak> ucaklar;
    
	public Havalimani(Kisi yonetici, Konum konum, List<Kisi> kisiler, List<Ucak> ucaklar) {
		super();
		this.yonetici = yonetici;
		this.konum = konum;
		this.kisiler = kisiler;
		this.ucaklar = ucaklar;
	}

	public Kisi getYonetici() {
		return yonetici;
	}

	public void setYonetici(Kisi yonetici) {
		this.yonetici = yonetici;
	}

	public Konum getKonum() {
		return konum;
	}

	public void setKonum(Konum konum) {
		this.konum = konum;
	}

	public List<Kisi> getKisiler() {
		return kisiler;
	}

	public void setKisiler(List<Kisi> kisiler) {
		this.kisiler = kisiler;
	}

	public List<Ucak> getUcaklar() {
		return ucaklar;
	}

	public void setUcaklar(List<Ucak> ucaklar) {
		this.ucaklar = ucaklar;
	} 
	
	 public void kisiEkle(Kisi kisi) {
	        kisiler.add(kisi);
	    }

	    public void kisiSil(Kisi kisi) {
	        kisiler.remove(kisi);
	    }

	    public Kisi kisiGuncelle(int index, Kisi yeniKisi) {
	        if (index >= 0 && index < kisiler.size()) {
	            kisiler.set(index, yeniKisi);
	            return yeniKisi;
	        }
	        return null;
	    }

	    public Kisi kisiGetir(int index) {
	        if (index >= 0 && index < kisiler.size()) {
	            return kisiler.get(index);
	        }
	        return null;
	    }

	    
	    public void ucakEkle(Ucak ucak) {
	        ucaklar.add(ucak);
	    }

	    public void ucakSil(Ucak ucak) {
	        ucaklar.remove(ucak);
	    }

	    public Ucak ucakGuncelle(int index, Ucak yeniUcak) {
	        if (index >= 0 && index < ucaklar.size()) {
	            ucaklar.set(index, yeniUcak);
	            return yeniUcak;
	        }
	        return null;
	    }

	    public Ucak ucakGetir(int index) {
	        if (index >= 0 && index < ucaklar.size()) {
	            return ucaklar.get(index);
	        }
	        return null;
	    }

	    @Override
	    public String toString() {
	        return "Havalimani{" +
	                "yonetici=" + yonetici +
	                ", konum=" + konum +
	                ", kisiler=" + kisiler +
	                ", ucaklar=" + ucaklar +
	                '}';
	    }
	}
	
     

