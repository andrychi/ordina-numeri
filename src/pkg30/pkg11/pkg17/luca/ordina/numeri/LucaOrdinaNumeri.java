/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg30.pkg11.pkg17.luca.ordina.numeri;

import java.util.stream.IntStream;
import javax.swing.JOptionPane;

/**
 *
 * @author tss
 */
public class LucaOrdinaNumeri {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //ordinare un array di numeri interi
        int x;
        int temp;

        String tetto = JOptionPane.showInputDialog("quanti numeri vuoi ordinare?");
        x = Integer.parseInt(tetto);

        int[] numeri = IntStream.range(0, x).toArray();

        for (int i = 0; i < x; i++) {
            String numero = JOptionPane.showInputDialog("dimmi i numeri");
            numeri[i] = Integer.parseInt(numero);
        }
        for (int z = 0; z < x - 1; z++) {

            for (int i = 0; i < x - 1; i++) {

                if (!(numeri[i] < numeri[i + 1])) {

                    temp = numeri[i];

                    numeri[i] = numeri[i + 1];
                    numeri[i + 1] = temp;
                }

            }

        }
        System.out.println("Ecco i numeri ordinati : \n");
        for (int i = 0; i < numeri.length; i++) {
            int valore = numeri[i];
            System.out.println(valore);

        }

    }

}