package Bridge;

public class ControleRemotoAvancado extends ControleRemoto {

    public ControleRemotoAvancado(Aparelho aparelho) {
        super(aparelho);
    }

    public void mute() {
        System.out.println("Controle Avançado: Mudo ativado!");
        aparelho.setVolume(0);
    }
}
