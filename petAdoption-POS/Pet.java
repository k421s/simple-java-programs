import java.util.*;
import java.lang.*;
import java.io.*;


/**
 * This constructor class holds the data for a pet object
 * @author Karlton Suits
 * @version10/18/2018
 */
public class Pet{
  //fields
	private String petType;
	private String petName;
	private double costToAdopt;

  
  /**
	 * This no-args constructor sets object to blank values and zero
	 */
  public Pet(){
		petType = "";
		petName = "";
		costToAdopt = 0;
  }
  
  /**
   * args {@link sun.reflect.generics.scope.ConstructorScope}
   * @param type - type of pet 
	 * @param name - pet name
	 * @param cost - cost of pet adoption
   */
   public Pet(String type, String name, double cost){
     petType = type;
		 petName = name;
		 costToAdopt = cost;
   }  
  
  //getters

  /**
  * This method sets pet type 
  * @param type - new type of pet
  */
  public void setType(String type){
    petType = type;
  }
  
  /**
  * This method sets pet name 
  * @param name - new name for pet
  */
  public void setName(String name){
    petName = name;
  }
  
  /**
  * This method sets the cost to adopt
  * @param cost - new cost to adopt
  */
  public void setCost(double cost){
    costToAdopt = cost;
  }
  
  //getters
  /**
  * This method gets pet type 
  * @return petType - type of pet
  */
  public String getType(){
    return petType;
  }
  
  /**
  * This method gets pet name
  * @return petName - name of pet
  */
  public String getName(){
    return petName;
  }
   
  /**
  * This method returns the cost to adopt pet
  * @return cost - cost of pet
  */
  public double getCost(){
    return costToAdopt;
  }
  
  /**
  * This method returns the state of the object in string form
  * @return petString - object in string form
  */
  public String toString(){
    String petString =  "Type of pet: " + petType + "\n" +
                        "Name of pet: " + petName + "\n" + 
                        "Cost to adopt: " + Double.toString(costToAdopt) + "\n";
  
    return petString;
  }
  
  /**
  * This method compares an input pet with another and determins if all values
  * are the same
  * @param comparison - object to compare this with
  * @return equal - boolean statment thats true if equal
  */
  public boolean equals(Pet comparison){
    boolean equal = ((this.petType.equals(comparison.petType) && 
										(this.petName.equals(comparison.petName))))
										 ? true : false;
    return equal;
  }
   

	/**
  * This method compares cost to adopt
  * @param comparison - object to compare this with
  * @return compareIndex - difference in the cost
  */
	public double compareTo(Pet comparison){		
			double compareIndex = Math.abs(this.costToAdopt - comparison.costToAdopt);
			return compareIndex;
	}
}