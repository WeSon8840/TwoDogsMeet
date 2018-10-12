/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package twodogsmeet;


/**
 *
 * @author glSon8840
 */
public class Dog {
    private String name, breed;
    private int age, hunger, aggression;
    
    public Dog(String dgname, String dgbreed, int dgage, int hung,int aggr) {
        name = dgname;
        breed = dgbreed;
        age = dgage;
        hunger = hung;
        aggression = aggr;
    }
    
    public Dog(String dgname, String dgbreed) {
        //This constructor only uses the name and breed
        //Set the aggression and hunger to random #s
        name = dgname;
        breed = dgbreed;
        age = (int)(Math.random() * 5) + 7;
        aggression = (int) (Math.random() * 10) + 1;
        hunger = (int) (Math.random() * 10) + 1;
  }
    
    /**
     * This method allow the user to set the age of the dog
     * pre:needs an age value
     * post:sets the age value
     */
    public int getAge(){
        return age;
    }
    
    /**
     * This method allow the user to set the aggression of the dog
     * pre:needs an aggression value
     * post:sets the aggression value
     */
    public int getAggression(){
        return aggression;
    }
    
    /**
     * This method allow the user to set the breed of the dog
     * pre:needs an breed value
     * post:sets the breed value
     */
    public String getBreed(){
        return breed;
    }
    
    /**
     * This method allow the user to set the Hunger of the dog
     * pre:needs an hunger value
     * post:sets the hunger value
     */   
    public int getHunger(){
        return hunger;
    }
    
    /**
     * This method allow the user to set the name of the dog
     * pre:needs an name value
     * post:sets the name value
     */
    public String getName(){
        return name;
    }
    
    /**
     * This method allow the user to set the age of the dog
     * pre:needs an age value
     * post:sets the age value
     */
    public void setAge(int dgage){
        age = dgage;
    }
    
    /**
     * This method allow the user to set the Hunger of the dog
     * pre:needs an hunger value
     * post:sets the hunger value
     */    
    public void setHunger(int hung){
        hunger = hung;
    }
    
    /**
     * This method allow the user to set the aggression of the dog
     * pre:needs an aggression value
     * post:sets the aggression value
     */
    public void setAggression(int aggr){
        aggression = aggr;
    }
    
    public void barkFriendly() {
        System.out.println("Arf! Arf!");
  }

    public void barkAngry() {
        System.out.println("GRR! RRRFFF!");
  }
    
    public String toString() {
        String output = "Name: " + name + "\n";
        output += "Breed: " + breed + "\n";
        output += "Agre: " + age + "\n";
        output += "Aggression: " + aggression + "\n";
        output += "Hunger: " + hunger;
        //output string is complete, return it
        return output;
}
}
