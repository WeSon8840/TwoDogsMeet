/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package twodogsmeet;
import javax.swing.JOptionPane;
/**
 *
 * @author glSon8840
 */
public class TwoDogsMeet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String inputName,inputBreed;
        int myInput;
        int newAgg, newHunger;
        
        JOptionPane.showMessageDialog(null, "Two dogs will be created.");
        //set info for dogs and creat them
        inputName = JOptionPane.showInputDialog( "Enter the name of the first dog.");
        inputBreed = JOptionPane.showInputDialog( "Enter the breed of the first dog.");
        Dog dog1 = new Dog(inputName, inputBreed);
        
        inputName = JOptionPane.showInputDialog( "Enter the name of the second dog.");
        inputBreed = JOptionPane.showInputDialog( "Enter the breed of the second dog.");
        Dog dog2 = new Dog(inputName, inputBreed);
        
        JOptionPane.showMessageDialog(null, dog1);
        myInput = Integer.parseInt(JOptionPane.showInputDialog(" Is " + dog1.getName() + "'s aggression  ok?\n1- Yes\n2- No"));
        if (myInput == 2){
            newAgg = Integer.parseInt(JOptionPane.showInputDialog("Enter " + dog1.getName() + "'s new aggression."));
            dog1.setAggression(newAgg);
        }
        
        myInput = Integer.parseInt(JOptionPane.showInputDialog(" Is " + dog1.getName() + "'s hunger  ok?\n1- Yes\n2- No"));
        if (myInput == 2){
            newHunger = Integer.parseInt(JOptionPane.showInputDialog(" Enter " + dog1.getName() + "'s new hunger."));
            dog1.setHunger(newHunger);
        }
        
        JOptionPane.showMessageDialog(null, dog2);
        myInput = Integer.parseInt(JOptionPane.showInputDialog(" Is " + dog2.getName() + "'s aggression  ok?\n1- Yes\n2- No"));
        if (myInput == 2){
            newAgg = Integer.parseInt(JOptionPane.showInputDialog("Enter " + dog2.getName() + "'s new aggression."));
            dog1.setAggression(newAgg);
        }
        
        myInput = Integer.parseInt(JOptionPane.showInputDialog(" Is " + dog2.getName() + "'s hunger  ok?\n1- Yes\n2- No"));
        if (myInput == 2){
            newHunger = Integer.parseInt(JOptionPane.showInputDialog(" Enter " + dog2.getName() + "'s new hunger."));
            dog1.setHunger(newHunger);
        }
        
        JOptionPane.showMessageDialog(null, dog1.getName() + " and " + dog2.getName() + " meet ");
        
        if (dog1.getAggression() > 5 && dog2.getAggression()<5){
            System.out.print(dog1.getName() + ":");
            dog1.barkAngry();
            System.out.println(dog2.getName() + " is run away");
        }
        
        else if (dog1.getAggression() < 5 && dog2.getAggression() > 5){
            System.out.print(dog2.getName() + ": ");
            dog2.barkAngry();;
            System.out.println(dog1.getName() + " is run away");
        }
        
        else if (dog1.getAggression() < 5 && dog2.getAggression() < 5){
            System.out.print(dog1.getName() + ": ");
            dog1.barkFriendly();
            System.out.print(dog2.getName() + ": ");
            dog2.barkFriendly();
            JOptionPane.showMessageDialog(null, "Two dogs have great time!");
        }
        
        else{
            System.out.print(dog1.getName() + ": ");
            dog1.barkAngry();
            System.out.print(dog2.getName() + ": ");
            dog2.barkAngry();
            JOptionPane.showMessageDialog(null, "They didn't like each other.");
        }
        
        if (dog1.getHunger() > dog2.getHunger()){
            System.out.print(dog1.getName() + " bite " + dog2.getName() + ".");
        }
        
        else if (dog2.getHunger() > dog1.getHunger()){
            System.out.print(dog2.getName() + " bite " + dog1.getName() + ".");
        }
        
        else{
            System.out.println("Tow dogs are equally hunger and aggression");
        }
    }
    
}
