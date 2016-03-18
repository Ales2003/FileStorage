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
public class First {
    
    private int x;
    private int y;
    protected int summa;
    protected int diff;
    

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    public int sum (){
    
        summa = x+y;
        
        return summa;
        
    }
    public int dif(){
    diff = x-y;
    return diff;
    
    }
    
    
    
    
}
