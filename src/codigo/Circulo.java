/*
 * Mi primera clase java

La clase círculo permite almacenar un círculo
además de su posición en la pantalla, si está relleno o no
, su color etc
 */
package codigo;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;

/**
 *
 * @author Jorge Cisneros
 */
public class Circulo extends Ellipse2D.Double{
    
    public Color color = null;
    public boolean relleno = false;
 
    
    public Circulo (int _x, int _y, int _width,  Color _color, boolean _relleno){
        this.x = _x - _width/2;
        this.y = _y - _width/2;
        this.width = _width;
        this.height = _width;
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
