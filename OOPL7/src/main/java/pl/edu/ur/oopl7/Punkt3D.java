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
public class Punkt3D extends Punkt2D{
    public double z;
    
    @Override
    public void losujPunkt(){
        this.x = Math.random() * 20 - 10;
        this.y = Math.random() * 20 - 10;
        this.z = Math.random() * 20 - 10;
    }
    
    @Override
    public String toString() {
        return "x=" + this.x + ", y=" + this.y + ", z=" + this.z;
    }

    public double getZ() {
        return this.z;
    }    
    
}
