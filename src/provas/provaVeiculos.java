package provas;

public class provaVeiculos {
    public static void main(String[] args) {
        // Distância entre as cidades
        double distancia = 100;
        
        // Velocidade do carro e do caminhão
        double velocidade_carro = 110;
        double velocidade_caminhao = 80;
        
        // Tempo de viagem do carro e do caminhão até o ponto de encontro
        double tempo_carro = distancia / velocidade_carro;
        double tempo_caminhao = distancia / velocidade_caminhao + 0.1; // 0.1 = tempo dos pedágios do caminhão
        
        // Distância restante do carro e do caminhão após o ponto de encontro
        double distancia_restante_carro = distancia - (velocidade_carro * tempo_carro);
        double distancia_restante_caminhao = distancia - (velocidade_caminhao * tempo_caminhao);
        
        // Verifica qual veículo está mais próximo de Ribeirão Preto
        if (distancia_restante_caminhao < 0) {
            System.out.println("O caminhão está mais próximo da cidade de Franca.");
        } else {
            System.out.println("O carro está mais próximo da cidade de Ribeirão Preto.");
        }
    }
}
