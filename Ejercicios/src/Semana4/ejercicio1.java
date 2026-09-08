package Semana4;

public class ejercicio1 {
    public static void main(String[] args) {
        //saludar();
        String [] nombres = {"Sofia","Ian","Caleb","Bianca","Naruto"};
       //for(String nombre : nombres){//Forma simplificada del otro for
        //saludar(nombre);} //Otra forma de hacerlo 
        for(int i=0; i < nombres.length; i++){
            saludar(nombres[i]);
        }
    }
    //parametro
    public static void saludar(String nombre) {
        System.out.println("Hola " + nombre);
        
    }
    


}
