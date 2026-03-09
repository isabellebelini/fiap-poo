package br.com.fiapride.model;

public class Gato {
    // Características
    public String raca;
    public String cor;
    public double energia; // Novo Atributo 
    
    public Gato(String raca, String cor) {
        this.raca = raca;
        this.cor = cor;
        this.energia = 50.0; //Faz mais sentido se ele já começar com energia 
    }

    // Método que aumenta o estado
    public void comer(double quantidade) {
        // Regra de negócio: A quantidade deve ser positiva
        if (quantidade <= 0) {
            System.out.println("Erro: A quantidade de comida deve ser maior que zero.");
            return; 
        }
        this.energia += quantidade;
        System.out.println("O gato comeu. Nova energia: " + this.energia);
    }

    // Método que diminui o estado
    public void brincar(double esforco) {
        // Regra de negócio: O esforço deve ser positivo e a energia suficiente
        if (esforco <= 0) {
            System.out.println("Erro: O esforço da brincadeira é inválido.");
            return;
        }
        if (this.energia < esforco) {
            System.out.println("Erro: Energia insuficiente para brincar. Dê comida ao gato!");
            return;
        }
        this.energia -= esforco;
        System.out.println("O gato brincou bastante. Energia restante: " + this.energia);
    }
}