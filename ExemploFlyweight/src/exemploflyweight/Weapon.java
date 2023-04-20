/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exemploflyweight;

/**
 *
 * @author Marcos
 */
public class Weapon {
    private String name;
    private int damage;
    
    public Weapon(String _name, int _damage){
        this.name = _name;
        this.damage = _damage;
    }
    
    public String getName(){
        return this.name;
    }
    
    public int getDamage(){
        return this.damage;
    }
}
