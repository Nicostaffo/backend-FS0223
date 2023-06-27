package lezione_2.esercizio1;

public class Rettangolo {
  int altezza;
  int base;
  
  public Rettangolo (int altezza, int base) {
	  this.altezza = altezza;
	  this.base = base;
  }
  public int calcoloArea() {
	  int area = base * altezza;
	  return area;
  }
  public int calcolaPerimetro() {
	  int perimetro =(base + altezza)*2;
	  return perimetro;
  }
  public static void stampaDueRettangoli(Rettangolo n1, Rettangolo n2) {
	 int area1= n1.calcoloArea();
	 int perimetro1 = n1.calcolaPerimetro();
	 int area2 = n2.calcoloArea();
	 int perimetro2 = n2.calcolaPerimetro();
	 int sommaArea = (area1 + area2);
	 int sommaPerimetro = (perimetro1 + perimetro2);
	 System.out.println(sommaArea + " " + sommaPerimetro);
	 
	
  }
}
