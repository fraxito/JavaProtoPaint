/*
 * Mi primera clase java

La clase círculo permite almacenar un círculo
además de su posición en la pantalla, si está relleno o no
, su color etc
 */
package codigo;

import java.awt.Color;
import java.awt.geom.Ellipse2D;

/**
 *
 * @author Jorge Cisneros
 */
public class Circulo extends Ellipse2D.Double{
    
    public Color color = null;
    public boolean relleno = false;
 
    
    public Circulo (int _x, int _y, int _width,  Color _color, boolean _relleno){
        this.x = _x;
        this.y = _y;
        this.width = _width;
        this.height = _width;
        this.color = _color;
        this.relleno = _relleno;
        
    }
}
