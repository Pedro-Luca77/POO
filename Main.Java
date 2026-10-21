public class Main{
    public static void main(String[] args){
        carro MeuCarro = new carro();

        MeuCarro.marca = "Tesla";
        MeuCarro.cor = "Purple";
        MeuCarro.velocidade = 20;

        MeuCarro.acelerar();

        
        Volei placar = new volei();

        placar.pontuacaoA = 12;
        placar.pontuacaoB = 10;
        placar.setA = 2;
        placar.setB = 1;

        placar.jogo();
    }
}
