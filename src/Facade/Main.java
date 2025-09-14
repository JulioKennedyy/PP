package Facade;

public class Main {
    public static void main(String[] args) {
        Amplificador amp = new Amplificador();
        Projetor proj = new Projetor();
        Player player = new Player();

        amp.ligar();
        amp.definirVolume(10);
        proj.ligar();
        player.ligar();
        player.reproduzirFilme("Vingadores: Ultimato");
    }
}
