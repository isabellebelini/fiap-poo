package br.com.fiapride.main;

// Importamos a classe Passageiro para que o sistema a reconheça
import br.com.fiapride.model.Passageiro;
import br.com.fiapride.model.Gato;

public class SistemaPrincipal {

	public static void main(String[] args) {
		/*INSTANCIAÇÃO
		//O comando 'new' aloca mamória para um novo objeto.
		
		// Criando o primeiro passageiro (Objeto 1)
		Passageiro passageiro1 = new Passageiro();
		passageiro1.nome = "Ana Silva";
		passageiro1.saldo = 50.0;

		// Criando o primeiro passageiro (Objeto 2)
		Passageiro passageiro2 = new Passageiro();
		passageiro2.nome = "Ana Silva";
		passageiro2.saldo = 12.50;
		
		//Exibindo os dados no Console
		System.out.println("==== Sistema ====");
		System.out.println("Passageiro: " + passageiro1.nome + " | Saldo: R$ " + passageiro1.saldo);
		System.out.println("Passageiro: " + passageiro2.nome + " | Saldo: R$ " + passageiro2.saldo);
		*/
		
		// (Objeto 1)
		Gato gato1 = new Gato();
		gato1.raca = "SRD";
		gato1.cor = "Cinza";

		// (Objeto 2)
		Gato gato2 = new Gato();
		gato2.raca = "Persa";
		gato2.cor = "Branco";

		System.out.println("A raça do meu gato é: " + gato1.raca + ", a cor dele é: " + gato1.cor);
		System.out.println("A raça do meu gato é: " + gato2.raca + ", a cor dele é: " + gato2.cor);
		
	}

}
