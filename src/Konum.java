
public class Konum {

	private String ulke;
    private String sehir;

    public Konum(String ulke, String sehir) {
        this.ulke = ulke;
        this.sehir = sehir;
    }

    
    public String getUlke() { 
    	return ulke; 
    	}
    public void setUlke(String ulke) {
    	this.ulke = ulke; 
    	}

    public String getSehir() { 
    	return sehir; 
    	}
    public void setSehir(String sehir) { 
    	this.sehir = sehir; 
    	}
	
	
}
