public class Main {

    public static void main(String[] args) {
        /**
         * persona(nombre, edad, dinero, talla)
         * come = 4, camina = 1000, duerme = 8
         */
        Persona persona1 = new Persona("Miguel", 23, 100, "l");
        System.out.println(persona1.nombre + " come maximo " + persona1.comer() + " kilos");
        System.out.println(persona1.nombre + " camina maximo " + persona1.caminar() + " pasos");
        System.out.println(persona1.nombre + " duerme maximo " + persona1.dormir() + " horas");
        /**
         * ropa(tipo, talla, precio)
         */
        Ropa ropa1 = new Ropa("camisa", "m", 40);
        Ropa ropa2 = new Ropa("polera", "l", 40);
        Ropa ropa3 = new Ropa("chamarra", "l", 110);

        boolean puedeComprar1 = persona1.puedeComprarRopa(ropa1);
        if(puedeComprar1){
            persona1.comprarRopa(ropa1);
        }
        boolean puedeComprar2 = persona1.puedeComprarRopa(ropa2);
        if(puedeComprar2){
            persona1.comprarRopa(ropa2);
        }
        boolean puedeComprar3 = persona1.puedeComprarRopa(ropa3);
        if(puedeComprar3){
            persona1.comprarRopa(ropa3);
        }

        System.out.println( persona1.nombre + " tiene " + persona1.dinero);




        /*
        Ejercicio resolvedor1 = new Ejercicio("resoledor de ejercicios matematicos");

        int primo = resolvedor1.obtenerPrimoN(7);

        if(primo == 13) {
            System.out.println("su nota es 10");
        }else{
            System.out.println("Su nota es 0");
        }
*/


        // resolvedor1.numeroPrimo(1);
    }
}
