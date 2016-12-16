/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin_9_5;

import javax.swing.JOptionPane;

/**
 *
 * @author Familia
 */
public class Secuencias {

    public void calcularSec() {

        int num;

        System.out.print("Visualizamos la serie a-> ");

        num = Integer.parseInt(JOptionPane.showInputDialog("Introducir número de elementos a visualizar en la serie"));

        for (int i = 2, j = 0; j < num; i = i + 2, j++) {

            System.out.print(i + ", ");
        }

        System.out.print("Visualizamos la serie b-> ");

        for (int k = 1; k <= num; k++) {

            if (k % 2 == 0) {
                System.out.print("+" + k + ", ");
            } else {
                System.out.print("-" + k + ", ");
            }
        }
    }
}
