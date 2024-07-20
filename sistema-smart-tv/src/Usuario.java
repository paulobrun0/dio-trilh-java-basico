public class Usuario {
    public static void main(String[] args) throws Exception {

        SmartTv smartTv = new SmartTv();

        System.out.println("Tv Ligada? " + smartTv.ligada);
        System.out.println("Canal Atual?: " + smartTv.canal);
        System.out.println("Volume Atual? " + smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo Status -> Tv Ligada? " + smartTv.ligada);

        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.diminuirVolume();
        System.out.println("Novo Volume Atual? " + smartTv.volume);

        smartTv.escolherCanal(20);
        System.out.println("Novo Canal Atual? " + smartTv.canal);

        smartTv.aumentarCanal();
        System.out.println("Novo Canal Atual? " + smartTv.canal);

        smartTv.diminuirCanal();
        System.out.println("Novo Canal Atual? " + smartTv.canal);

    }
}
