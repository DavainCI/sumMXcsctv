package summax;

public class Resultado {
    private int suma;
    private int inicio;
    private int fin;

    public Resultado(int suma, int inicio, int fin) {
        this.suma = suma;
        this.inicio = inicio;
        this.fin = fin;
    }

    public int obtenerSuma() {
        return suma;
    }

    public int obtenerInicio() {
        return inicio;
    }

    public int obtenerFin() {
        return fin;
    }
}
