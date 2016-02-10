/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Polygon;

/**
 *
 * @author xp
 */
public class Cruz extends Polygon{
    
    public Color color = null;
    public boolean relleno = false;
 
    
    public Cruz (int _x, int _y, int _width,  Color _color, boolean _relleno){
        //Numero de puntos de la figura
       
        addPoint(_x-_width, _y+3*_width);
        addPoint(_x+_width, _y+3*_width);
        addPoint(_x+_width, _y+_width);
        addPoint(_x+3*_width, _y+_width);
        addPoint(_x+3*_width, _y-_width);
        addPoint(_x+_width, _y-_width);
        addPoint(_x+_width, _y-3*_width);
        addPoint(_x-_width, _y-3*_width);
        addPoint(_x-_width, _y-_width);
        addPoint(_x-3*_width, _y-_width);
        addPoint(_x-3*_width, _y+_width);
        addPoint(_x-_width, _y+_width);
        
        
        
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
