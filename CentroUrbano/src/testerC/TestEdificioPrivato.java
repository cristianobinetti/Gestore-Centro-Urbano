package testerC;

import classiC.EdificioPrivato;


public class TestEdificioPrivato {

	public static void main(String[] args) {
		
		System.out.println("Istanzio un nuovo edificio privato");
		EdificioPrivato l = new EdificioPrivato(50, 5, "privato", 500);
		
		System.out.println("Stampo l'edificio:");
		System.out.println(l.toString());
		
		System.out.println("Testo i metodi modificatori:");
		System.out.println("sommo 1 ad ogni variabile");
		l.setEfficienza(l.getEfficienza() + 1);
		l.setInvecchiamento(l.getInvecchiamento() + 1);
		l.setValore(l.getValore() + 1);
		System.out.println("chiamo l'edificio: nome_cambiato");
		l.setNome("nome_cambiato");
		
		System.out.println("Testo i metodi di accesso: ");
		System.out.println("coefficiente di efficienza = " + l.getEfficienza());
		System.out.println("coefficiente di invecchiamento = " + l.getInvecchiamento());
		System.out.println("nome = " + l.getNome());
		System.out.println("valore = " + l.getValore());
		
		System.out.println("Istanzio un nuovo edificio privato");
		EdificioPrivato l1 = new EdificioPrivato(100, 10, "privato1", 1000);
		
		System.out.println("Stampo l'edificio:");
		System.out.println(l1.toString());
		
		System.out.println("Testo l'equals su i due edifici:");
		System.out.println(l.equals(l1));
		
		System.out.println("Testo il clone sul primo edificio:");
		System.out.println(l.clone());
		
		System.out.println("Eseguo l'equals del clone sul primo edificio:");
		System.out.println(l.equals(l.clone()));
	}
	
}
