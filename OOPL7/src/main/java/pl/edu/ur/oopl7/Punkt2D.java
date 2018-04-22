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
public class Punkt2D {
    public double x, y;

    public Punkt2D() {
        this.x = 0;
        this.y = 0;
    }

    @Override
    public String toString() {
        return "x=" + this.x + ", y=" + this.y;
    }
      
    public Punkt2D(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    public void losujPunkt(){
        this.x = Math.random() * 20 - 10;
        this.y = Math.random() * 20 - 10;
    }
    
    public double getX() {
        return this.x;
    }

    public double getY() {
        return this.y;
    }
}
