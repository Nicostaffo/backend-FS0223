package it.epicode.be;

import java.util.Scanner;

public class Helloworld {

	
	
public static void main (String[] args)
		{
		// Stampa a console  la frase
		System.out.println("This is my first Epicode Java Project!");
		moltiplica(6,2);
		concatena("ciao per",3);
		 String[] array = {"ma", "quante'", "la", "mafia", "jhonny"};
	        String nuovaStringa = "Bedda";
	        String[] nuovoArray = inserisciArray(array, nuovaStringa);
	        
	        for (String elemento : nuovoArray) {
	            System.out.println(elemento);
	        }
	        Scanner sc = new Scanner(System.in);
			
			System.out.print("Inserisci il tuo nome: ");
			String nome = sc.nextLine();
			System.out.print("Inserisci il tuo cognome: ");
			String cognome = sc.nextLine();
			System.out.print("Inserisci il tuo lavoro: ");
			String lavoro = sc.nextLine();
			System.out.println("Ciao " + nome + " " + cognome + " il "+ lavoro);
			System.out.println( lavoro+  " il " + cognome + nome+ "Ciao ");
			areaTriangolo(3.5,4.2);
		}
public static void moltiplica(int a, int b) {
	int molt = a*b;
	System.out.println(molt);
}
public static void concatena(String name,int x) {
	String conc = name +' '+ x;
	System.out.println(conc);
}
public static String[] inserisciArray(String[] array, String nuovaStringa) {
    String[] nuovoArray = new String[6];

    for (int i = 0; i < 2; i++) {
        nuovoArray[i] = array[i];
    }

    nuovoArray[2] = nuovaStringa;
 
    for (int i = 2; i < 5; i++) {
        nuovoArray[i+1] = array[i];
    }
    
    return nuovoArray;
}
public static void areaTriangolo(double x,double y) {
	double calcArea = (x*y)/2;
	System.out.println("il risultato "+ calcArea);
}
public static void pariDispari(int x) {
	
}
}




