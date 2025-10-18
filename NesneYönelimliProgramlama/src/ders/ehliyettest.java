package ders;

public class ehliyettest {
	

	public static void main(String[] args) throws Resitdegil {
		// TODO Auto-generated method stub
		Ehliyet ehliyet = new Ehliyet();
		
		ehliyet.setIsimsoyisim("Görkem Kılıç: ");
		try {
		ehliyet.setYas(15);
		}catch(Resitdegil exp) {
		System.out.println("Hata: "+exp.getMessage());
		}
		try {
		ehliyet.setYas(19);
		System.out.println("Ehliyet : "+ehliyet.getIsimsoyisim());
		System.out.println("yas : "+ehliyet.getYas());
		}
		catch(Resitdegil exp) {
			System.out.println("Hata: "+exp.getMessage());
		}

	}}
















































