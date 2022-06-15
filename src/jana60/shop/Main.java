package jana60.shop;

public class Main {

	public static void main(String[] args) {
		//crazione contenitore per il prodotto
	
	Prodotto iphone = new Prodotto ("iphone","Apple",22,300f) ;
	Prodotto bevanda = new Prodotto ("Gassosa", "cocala",10,1f);
				
		System.out.println("il prezzo del iphone compreso di iva è " + iphone.formattaPrezzo());
		System.out.println("il prezzo della bevanda scelta è di " + bevanda.formattaPrezzo());
	}

}
