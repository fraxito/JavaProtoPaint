/*
 * Mi segunda clase java

La clase triangulo permite almacenar un triangulo
además de su posición en la pantalla, si está relleno o no
, su color etc
 */
package codigo;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Polygon;

/**
 *
 * @author Jorge Cisneros
 */
public class Rombo extends Polygon{
    
    public Color color = null;
    public boolean relleno = false;
 
    
    public Rombo (int _x, int _y, int _height, int _width,  Color _color, boolean _relleno){
        //Numero de puntos de la figura
        this.npoints = 4;
        
        this.xpoints[0] = _x ;
        this.ypoints[0] = _y + _height; //o width; 

        this.xpoints[1] = _x - _width; //o width/2;
        this.ypoints[1] = _y;
 
        this.xpoints[2] = _x;
        this.ypoints[2] = _y - _height; //o width;
        
        this.xpoints[3] = _x + _width; //o width/2;
        this.ypoints[3] = _y;
        
        
        
        this.color = _color;
        this.relleno = _relleno;
        
    }
        public void pintaYColorea(Graphics2D g2){
            g2.setColor(this.color);
            if (this.relleno) {
                g2.fill(this);
            } else {
                g2.draw(this);
            }
    }
}
