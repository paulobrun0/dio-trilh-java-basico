public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void ligar() {
        ligada = true;
    }

    public void desligar() {
        ligada = false;
    }

    public void aumentarVolume() {
        volume++;
        if (volume == 100) {
            volume = 100;
        }
    }

    public void diminuirVolume() {
        volume--;
        if (volume == 0) {
            volume = 0;
        }
    }

    public void escolherCanal(int novoCanal) {
        if (novoCanal >= 1 && novoCanal <= 30) {
            canal = novoCanal;
        } else {
            System.out.println("Canal inválido");
        }
    }

    public void aumentarCanal() {
        canal++;
        if (canal == 30) {
            canal = 30;
        }
    }

    public void diminuirCanal() {
        canal--;
        if (canal == 1) {
            canal = 1;
        }
    }

}