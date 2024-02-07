
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Daw1
 */
public class Suma {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca una frase: ");
        String frase = sc.nextLine();
        System.out.print("Introduzca una palabra para buscarla dentro de la frase: ");
        String palabra = sc.next();

        int veces = buscarPalabra(frase, palabra);

        if (veces == 0) {
            System.out.println(palabra +" no se encuentra en la frase");
        } else {
            System.out.println(palabra + " aparece " + veces + " veces en la frase");
        }
    }

    static int buscarPalabra(String frase, String palabra) {
        int veces = 0;
        int pos = frase.indexOf(palabra);

        while (pos != -1) {
            veces++;
            pos = frase.indexOf(palabra, pos + 1);
        }

        return veces;
    }
    
}
