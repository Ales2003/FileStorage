/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filestorage;

/**
 *
 * @author Алекс1
 */
public class Second extends First{

    protected int multi;
    
    @Override
    public int sum() {
        super.summa = super.getX()*2+super.getY()*3;
        return summa;//To change body of generated methods, choose Tools | Templates.
    }
    
    public int multi(){
    multi = super.getX()*super.getY();
    return multi;
    }
    
}
