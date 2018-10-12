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
        myInput = Integer.parseInt(JOptionPane.showInputDialog("Is" + dog1.getName() + "'s aggression  ok?\n1- Yes\n2- No"));
        if (myInput == 2){
            newAgg = Integer.parseInt(JOptionPane.showInputDialog("Enter" + dog1.getName() + "'s new aggression."));
            dog1.setAggression(newAgg);
        }
        
        myInput = Integer.parseInt(JOptionPane.showInputDialog("Is" + dog1.getName() + "'s hunger  ok?\n1- Yes\n2- No"));
        if (myInput == 2){
            newHunger = Integer.parseInt(JOptionPane.showInputDialog("Enter" + dog1.getName() + "'s new hunger."));
            dog1.setHunger(newHunger);
        }
        
        JOptionPane.showMessageDialog(null, dog1.getName() + "and" + dog2.getName() + "meet");
        
        if (dog1.getAggression() > 5 && dog2.getAggression()<5){
            System.out.print(dog1.getName() + ":");
            dog1.barkAngry();
            System.out.println(dog2.getName() + "run away");
        }
        
        else if (dog1.getAggression() < 5 && dog2.getAggression() > 5){
            System.out.print(dog2.getName() + ": ");
            dog2.barkAngry();;
            System.out.println(dog1.getName() + "run away");
        }
        
        else if (dog1.getAggression() < 5 && dog2.getAggression() < 5){
            System.out.print(dog1.getName() + ": ");
            dog1.barkFriendly();
            System.out.print(dog2.getName() + ": ");
            dog2.barkFriendly();
        }
        
        else{
            System.out.print(dog1.getName() + ": ");
            dog1.barkAngry();
            System.out.print(dog2.getName() + ": ");
            dog2.barkAngry();
        }
        
        if (dog1.getHunger() > dog2.getHunger()){
            System.out.println(dog1.getName() + " bite " + dog2.getName() + ".");
        }
        
        else if (dog2.getHunger() > dog1.getHunger()){
            System.out.println(dog2.getName() + " bite " + dog1.getName() + ".");
        }
        
        else{
            System.out.println("Tow dogs are equally hunger and aggression");
            System.out.println("The dog circle each other to fight");
            dog1.setAggression(0);
            dog2.setAggression(0);
        }
//        
//        JOptionPane.showMessageDialog(null, "Input two dogs info!");
//        final Dog[] dogs = new Dog[2];
//        String[] name = new String[2];
//        String[] breed =new String[2];
//        int[][] b1 = new int[2][3];
//        for (int i = 0; i < dogs.length; i++) {
//            name[i] = JOptionPane.showInputDialog("What is the " + (i + 1) + " dogs name?");
//            breed[i] = JOptionPane.showInputDialog("What is the " + (i + 1) + " dogs breed?");
//            for(int i1 = 0; i1 < b1.length; i1++) {
//            b1[i][i1] = (int)(Math.random()*10);
//            }
//
//            dogs[i] = new Dog(name[i], breed[i], b1[i][0], b1[i][1],
//                    b1[i][2]);
//            JOptionPane.showMessageDialog(null, dogs[i].getName() + " is a " + dogs[i].getBreed() + " which is " + dogs[i].getAge() + " of age. The dog hunger level is " + dogs[i].getHunger()
//                    + " and its agression level is " + dogs[i].getAggression());
//        }
//        if (dog1.getAggression() + dog2.getAggression() > 10 && dog1.getHunger() + dog2.getHunger() < 5) {
//            JOptionPane.showMessageDialog(null, "The didn't like eachother!");
//            return;
//        } else {// otherwise no fight
//            JOptionPane.showMessageDialog(null, "The dogs had a great time!");
//        }
        
           
//        for (int i = 0; i < dogs.length; i++) {
//
//            final String age = JOptionPane.showInputDialog("Dog " + (i + 1) + " is " + b1[i][0] + " years old. Change new age please");
//            final String hunger = JOptionPane.showInputDialog("Dog " + (i + 1) + "'s hunger on a scale from 1-10 is " + b1[i][1] + " .Change new value please");
//            final String agression = JOptionPane.showInputDialog("Dog " + (i + 1) + "'s agression on a scale from 1-10 is " + b1[i][2] + " . Change new value please");
//            if (!age.equalsIgnoreCase("ok")) {
//                b1[i][0] = Integer.parseInt(age);
//            }
//            if (!hunger.equalsIgnoreCase("ok")) {
//                b1[i][1] = Integer.parseInt(hunger);
//            }
//            if (!agression.equalsIgnoreCase("ok")) {
//                b1[i][2] = Integer.parseInt(agression);
//            }
//            dogs[i] = new Dog(name[i], breed[i], b1[i][0], b1[i][1],
//                    b1[i][2]);
//            JOptionPane.showMessageDialog(null, dogs[i].getName() + " is a " + dogs[i].getBreed() + " which is " + dogs[i].getAge() + " of age. The dog hunger level is " + dogs[i].getHunger()
//                    + " and its agression level is " + dogs[i].getAggression());
//        }
//        if (dogs[0].getAggression() + dogs[1].getAggression() > 10
//                && dogs[0].getHunger() + dogs[1].getHunger() < 5) {
//            JOptionPane.showMessageDialog(null, "The didn't like eachother!");
//            return;
//        } else {// otherwise no fight
//            JOptionPane.showMessageDialog(null, "The dogs had a great time!");
//        }      
    }
    
}
