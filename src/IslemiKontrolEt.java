
public class IslemiKontrolEt extends Odeme {
	
	private String bankaAdi;
	private String numarayiKontrolEt;

	public IslemiKontrolEt(int odemeID, double miktar, Durum durum,String bankaAdi,String numarayiKontrolEt) {
		super(odemeID, miktar, durum);
		this.bankaAdi = bankaAdi;
		this.numarayiKontrolEt = numarayiKontrolEt;
		
	}
	
	public String getBankaAdi() {
        return bankaAdi;
    }

    public void setBankaAdi(String bankaAdi) {
        this.bankaAdi = bankaAdi;
    }

    public String getNumarayiKontrolEt() {
        return numarayiKontrolEt;
    }

    public void setNumarayiKontrolEt(String numarayiKontrolEt) {
        this.numarayiKontrolEt = numarayiKontrolEt;
    }
   

	
}
