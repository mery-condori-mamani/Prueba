public class Ejercicio {
    String nombre;
    public Ejercicio(String nombre){
        this.nombre = nombre;
    }

    public int obtenerPrimoN(int posiscion){
        int primosEncontrados = 0;
        int enesimoPrimo = 0;
        int aux = 1;
        while (primosEncontrados < posiscion) {
            boolean esPrimo = this.esPrimo(aux);
            if(esPrimo) {
                primosEncontrados ++;
                enesimoPrimo = aux;
            }
            aux ++;
        }
        return enesimoPrimo;
    }
    public boolean esPrimo(int numero){
        int aux = 0;
        boolean primo = false;
        for (int i = 1; i <= numero; i++){
            if (numero % i == 0) {
                aux++;
            }
        }
        if (aux == 2 || numero == 1){
            primo = true;
        }
        return primo;
    }
}
