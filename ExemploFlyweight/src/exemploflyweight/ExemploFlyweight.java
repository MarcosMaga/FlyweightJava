/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exemploflyweight;

import exemploflyweight.factory.WeaponFactory;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Marcos
 */
public class ExemploFlyweight {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] types = {"espada", "machado", "lança"};
        List<Weapon> weapons = new ArrayList();
        
        Scanner input = new Scanner(System.in);
        System.out.println("Digite quantos itens você deseja gerar");
        
        Random rand = new Random();
        int itens = input.nextInt();

        for(int i=0; i < itens; i++){
            Weapon weapon = WeaponFactory.getWeapon(types[rand.nextInt(3)], rand.nextInt(5) + 1);
            weapons.add(weapon);
        }
        
        for(int i=0; i < weapons.size(); i++){
            System.out.println("Nome: " + weapons.get(i).getName() + ". Dano: " + weapons.get(i).getDamage() + ". Mem: " + Integer.toHexString(weapons.get(i).hashCode()));
        }
    }
    
}
