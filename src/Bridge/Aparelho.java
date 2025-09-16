package Bridge;

public interface Aparelho {
    boolean isLigado();
    void ligar();
    void desligar();
    int getVolume();
    void setVolume(int volume);
    int getCanal();
    void setCanal(int canal);
    void printStatus();
}