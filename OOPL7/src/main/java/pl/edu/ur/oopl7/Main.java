/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl7;

/**
 *
 * @author Adrian Hrycaj
 */
public class Main {
    public static void main(String[] args) {
        double[][] array2D = new double[100][2];
        double[][] array3D = new double[100][3];

        Punkt2D punkt2d = new Punkt2D();
        Punkt3D punkt3d = new Punkt3D();
        
        for(int i=0; i<100; i++){
            punkt3d.losujPunkt();
            array3D[i][0] = punkt3d.getX();
            array3D[i][1] = punkt3d.getY();
            array3D[i][2] = punkt3d.getZ();
        }
        
        for(int i=0; i<100; i++){
            punkt2d.losujPunkt();
            array2D[i][0] = punkt2d.getX();
            array2D[i][1] = punkt2d.getY();
            for(int j=0; j<100; j++){
                if((array2D[i][0] == array3D[j][0]) && (array2D[i][1] == array3D[j][1])){
                    System.out.print("Wspólne składowe tablic to: ");
                    System.out.println(punkt2d.toString());
                }
            }
        }
    }
}
