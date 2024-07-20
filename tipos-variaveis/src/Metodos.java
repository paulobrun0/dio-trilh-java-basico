
public class Metodos {
    public static void main(String[] args) {

        int n1 = 5;
        int n2 = 1;
        int n3 = 6;

        double mediaFinal = calcularMedia(n1, n2, n3);
        String resultado = resultado(mediaFinal);

        System.out.println("O resultado é: " + resultado);
        System.out.println("Sua média final foi: " + mediaFinal);
    }

    public static double calcularMedia(int n1, int n2, int n3) {
        return (n1 + n2 + n3) / 3;
    }

    public static String resultado(double mediaFinal) {

        String resultado;

        if (mediaFinal < 6) {
            resultado = "Reprovado";
        } else if (mediaFinal == 6) {
            resultado = "Prova Minerva";
        } else {
            resultado = "Aprovado";
        }

        return resultado;
    }
}
