package summax;

public class Analizador {
    private int[] arreglo;

    public Analizador(int[] arreglo) {
        this.arreglo = arreglo;
    }

    public Resultado encontrarSubsecuenciaMaxima() {
        int sumaMaxima = arreglo[0];
        int sumaActual = arreglo[0];
        int inicio = 0;
        int fin = 0;
        int tempInicio = 0;

        for (int i = 1; i < arreglo.length; i++) {
            if (sumaActual < 0) {
                sumaActual = arreglo[i];
                tempInicio = i;
            } else {
                sumaActual += arreglo[i];
            }

            if (sumaActual > sumaMaxima) {
                sumaMaxima = sumaActual;
                inicio = tempInicio;
                fin = i;
            }
        }

        return new Resultado(sumaMaxima, inicio, fin);
    }
}
