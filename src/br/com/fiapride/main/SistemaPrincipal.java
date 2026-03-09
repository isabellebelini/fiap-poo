package br.com.fiapride.main;

import br.com.fiapride.model.Passageiro;
import br.com.fiapride.model.Gato;

public class SistemaPrincipal {

    public static void main(String[] args) {
        
        /* 
        Passageiro passageiro1 = new Passageiro("Ana Silva", "222");
        System.out.println("Regarga passageiro 1");
        passageiro1.adicionarSaldo(50.0);

        Passageiro passageiro2 = new Passageiro("Carlos Souza", "333");
        System.out.println("Regarga passageiro 2");
        passageiro2.adicionarSaldo(12.5);

        System.out.println("--- Sistema FiapRide ---");
        System.out.println("Passageiro: " + passageiro1.nome + " | Saldo: R$ " + passageiro1.saldo + " | CPF: " + passageiro1.cpf);
        System.out.println("Passageiro: " + passageiro2.nome + " | Saldo: R$ " + passageiro2.saldo + " | CPF: " + passageiro2.cpf);
        
        System.out.println("Pagando viagem do passageiro 1");
        passageiro1.pagarViagem(20);
        System.out.println("Pagando viagem do passageiro 2");
        passageiro2.pagarViagem(20);
        */

        System.out.println("--- Iniciando testes com Gatos ---");

        // INSTANCIAÇÃO
        Gato meuGato = new Gato("Siamês", "Preto");
        System.out.println("Gato criado! Raça: " + meuGato.raca + " | Energia Inicial: " + meuGato.energia);

        // Valores Válidos
        System.out.println("\n[Testando Valores Válidos]");
        meuGato.comer(20.0);
        meuGato.brincar(30.0);

        //Valores Inválidos
        System.out.println("\n[Testando Valores Inválidos]");
        meuGato.comer(-10.0);
        meuGato.brincar(100.0);
    }
}