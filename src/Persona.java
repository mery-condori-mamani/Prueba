public class Persona {
    String nombre;
    int edad;
    int dinero;
    String talla;
    public Persona (String nombre, int edad, int dinero, String talla){
        this.nombre = nombre;
        this.edad = edad;
        this.dinero = dinero;
        this.talla = talla;
    }
    public int  comer (){
        int cantidadQueCome = 50;
        return cantidadQueCome;
    }
    public  int caminar (){
        int cantidadDePasos = 100;
        return cantidadDePasos;
    }
    public int dormir (){
        int cantidadDeHorasQueDuerme = 8;
        return cantidadDeHorasQueDuerme;
    }
    public boolean puedeComprarRopa  (Ropa ropa){
        boolean puede = true;
        if (dinero >= ropa.costoRopa){
            puede = true;
        } else {
            puede = false;
        }
        return puede;
    }
    public void comprarRopa (Ropa ropa){
        boolean compra =true;
        boolean aux = this.puedeComprarRopa(ropa);

        if (compra && aux){
            dinero = dinero - ropa.costoRopa;
        }
    }

}
