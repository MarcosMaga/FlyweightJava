/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exemploflyweight.factory;

import exemploflyweight.Weapon;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Marcos
 */
public class WeaponFactory {
    private static Map<String, Weapon> items = new HashMap();
    
    public static Weapon getWeapon(String name, int damage){
        Weapon weapon = items.get(name + damage);
        if(weapon == null){
            weapon = new Weapon(name, damage);
            items.put(name + damage, weapon);
        }
        return weapon;
    }
}
