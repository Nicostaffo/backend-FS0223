package lezione_2.esercizio1;

public class Main_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Rettangolo n1 = new Rettangolo(5,8);
    Rettangolo n2 = new Rettangolo(4,3);
    System.out.println(n1.calcoloArea());
    System.out.println(n2.calcoloArea());
    System.out.println(n1.calcolaPerimetro());
    System.out.println(n2.calcolaPerimetro());
    Rettangolo.stampaDueRettangoli(n1,n2);
	}

}
