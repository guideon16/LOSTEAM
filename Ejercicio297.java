import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio297 {

    public static void main(String[] args) {

        //Declaramos las variables

        String entrada;
        
        Scanner input = new Scanner(System.in);

        ArrayList< ArrayList<String> > vector = new ArrayList<>();

        vector.add(new ArrayList<String>());

        int contador = 0;


        //Entrada

        System.out.print("Introduzca una entrada: ");
        entrada = input.nextLine();

        //Eliminamos los espacios
        entrada = entrada.replace(" ", "");

        //Detectar el texto

        for (int i = 0; i < entrada.length(); i++) {

            //Detectamos si es un numero

           if( (int) entrada.charAt(i)  >= 48 && (int) entrada.charAt(i) <= 57 ) {

                vector.get(contador).add( String.valueOf( entrada.charAt(i) ) );

            }
            else {

                contador++;

                vector.add(new ArrayList<String>());
                
            }

            
        }


        //Imprimir

        for (int i = 0; i < vector.size(); i++) {
            
            

            System.out.print(vector.get(i));
                
            

        }



    
    }

    //Declaramos las constantes

    public static final int DA = (int) Math.pow(10, 1);

    public static final int H = (int) Math.pow(10, 2);

    public static final int K = (int) Math.pow(10, 3);

    public static final int M = (int) Math.pow(10, 6);

    public static final int G = (int) Math.pow(10, 9);

}