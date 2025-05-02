package summax;

public class Principal {
    public static void main(String[] args) {
        int[] valores = {-2, 11, -4, 13, -5, 9, -3, 2, -8, 4};

        Analizador analizador = new Analizador(valores);
        Resultado resultado = analizador.encontrarSubsecuenciaMaxima();

        System.out.println("La suma maxima es: " + resultado.obtenerSuma());
        System.out.println("Desde la posicion " + (resultado.obtenerInicio() + 1) + " hasta la posicion " + (resultado.obtenerFin() + 1));
    }
}
