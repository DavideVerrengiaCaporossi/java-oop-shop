package jana60.shop;

import java.text.DecimalFormat;

public class Prodotto {
	//creazione variabili
	
		String nome;
		String marca;
		int iva;
		float prezzo;
		//creazione costruttore
		public Prodotto(String nome, String marca, int iva, float prezzo) {
			super();
			this.nome = nome;
			this.marca = marca;
			this.iva = iva;
			this.prezzo = prezzo;
		}
		
		//formattazione decimale 
		DecimalFormat df= new DecimalFormat ("#0.00€");

		
		//creazione metodo 
		public float prezzoTotale()
		{
			float prezzoFinale = (prezzo / 100)* iva + prezzo;
			return prezzoFinale;
		}
			//creazione metodo stampa prezzo totale
		public String formattaPrezzo() 
		{
			String prezzoFormattato = df.format(prezzoTotale()) ;
			return prezzoFormattato;
		}
}
