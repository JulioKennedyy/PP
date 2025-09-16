package Bridge;

public class TV implements Aparelho {
    private boolean ligado = false;
    private int volume = 20;
    private int canal = 1;

    @Override
    public boolean isLigado() {
        return ligado;
    }

    @Override
    public void ligar() {
        ligado = true;
        System.out.println("TV foi ligada.");
    }

    @Override
    public void desligar() {
        ligado = false;
        System.out.println("TV foi desligada.");
    }

    @Override
    public int getVolume() {
        return volume;
    }

    @Override
    public void setVolume(int volume) {
        if (volume >= 0 && volume <= 100) {
            this.volume = volume;
            System.out.println("Volume da TV ajustado para: " + this.volume);
        }
    }

    @Override
    public int getCanal() {
        return canal;
    }

    @Override
    public void setCanal(int canal) {
        this.canal = canal;
        System.out.println("Canal da TV ajustado para: " + this.canal);
    }

    @Override
    public void printStatus() {
        System.out.println("| Status da TV");
        System.out.println("| Ligada: " + (ligado ? "Sim" : "Não"));
        System.out.println("| Volume: " + volume);
        System.out.println("| Canal: " + canal);
    }
}