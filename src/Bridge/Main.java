package Bridge;

public class Main {
    public static void main(String[] args) {
        System.out.println("Testando com a TV");
        Aparelho tv = new TV();

        ControleRemotoAvancado controleAvancadoTV = new ControleRemotoAvancado(tv);

        controleAvancadoTV.togglePower();
        controleAvancadoTV.volumeUp();
        controleAvancadoTV.channelUp();
        tv.printStatus();

        controleAvancadoTV.mute();
        tv.printStatus();
    }
}
