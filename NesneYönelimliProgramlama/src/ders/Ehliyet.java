package ders;

public class Ehliyet {
	
	private String isimsoyisim;
	private int yas;
	
	public static void main(String[] args) {	
	}
	public String getIsimsoyisim() {
		return isimsoyisim;
	}
	public void setIsimsoyisim(String isimsoyisim) {
		this.isimsoyisim = isimsoyisim;
	}
	public int getYas() {
		return yas;
	}
	public void setYas(int yas)throws Resitdegil {
		if(yas<18) {
			throw new Resitdegil();
		}
		this.yas = yas;
	}

}
