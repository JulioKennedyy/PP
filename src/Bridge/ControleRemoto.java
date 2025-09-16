package Bridge;

public abstract class ControleRemoto {
    protected Aparelho aparelho;

    public ControleRemoto(Aparelho aparelho) {
        this.aparelho = aparelho;
    }

    public void togglePower() {
        if (aparelho.isLigado()) {
            aparelho.desligar();
        } else {
            aparelho.ligar();
        }
    }

    public void volumeUp() {
        int volumeAtual = aparelho.getVolume();
        aparelho.setVolume(volumeAtual + 5);
    }

    public void volumeDown() {
        int volumeAtual = aparelho.getVolume();
        aparelho.setVolume(volumeAtual - 5);
    }

    public void channelUp() {
        int canalAtual = aparelho.getCanal();
        aparelho.setCanal(canalAtual + 1);
    }

    public void channelDown() {
        int canalAtual = aparelho.getCanal();
        aparelho.setCanal(canalAtual - 1);
    }
}
