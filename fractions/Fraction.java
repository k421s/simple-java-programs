import java.util.*;

/**
 * 
 * @karlton Suits
 * @version v1
 */
public class Fraction{
  //fields
  private int num;
  private int denom;

		public void simplify()
   {
       int largestNum;
       int smallestNum;
       int commonDevisor = 1;

       if(denom == 0)
       {
          denom = 1;    
        }

       // start of simplification. 
       if(denom < num)
       {
          largestNum = num;
          smallestNum = denom;
        }
       else
       {
          smallestNum = denom;
          largestNum = num;
        } 

       if(largestNum % smallestNum == 0)
         {
           commonDevisor = smallestNum;
         }

           else
           {
             for(int i = smallestNum; i > 0; i--)  
             {
               if((largestNum % i) == 0 && (smallestNum % i) == 0)
               {
                  commonDevisor = i;
                  i = 0;
                }
             }
      }
      num = num/commonDevisor;
      denom = denom/commonDevisor;
	}


  //no args constructor
  public Fraction(){
    num = 0;
    denom = 1;
  }
  
  //args constructor
  public Fraction(int inNum, int inDen){
    num = inNum;
    if(inDen == 0){ 
			denom = 1;
		}

    else{ 
			denom = inDen;
		}
  }
	
	public Fraction addFraction(Fraction inFraction){
		Fraction added = new Fraction();
	
		added.denom = this.denom * inFraction.denom;
		added.num = (this.num * inFraction.denom) + (inFraction.num * this.denom);
		added.simplify();

		return added;
	}

	public Fraction subFraction(Fraction inFraction){
		Fraction added = new Fraction();
		added.denom = this.denom * inFraction.denom;
		added.num = (this.num * inFraction.denom) - (inFraction.num * this.denom);
		added.simplify();

		return added;
	}

	public Fraction multFraction(Fraction inFraction){
		Fraction added = new Fraction();
		added.denom = this.denom * inFraction.denom;
		added.num = (this.num * inFraction.num);
		added.simplify();
		return added;
	}
	//must be set equal to an object
	public Fraction divFraction(Fraction inFraction){
		Fraction added = new Fraction();
		added.denom = this.denom * inFraction.num;
		added.num = (this.num * inFraction.denom);

		added.simplify();
		return added;
	}
	//uses system.out
	public int compareTo(Fraction inFraction){
		int index = 0;

		//cross multiply to set same denominator
		int numOne;		//numerator of this.num
		int numTwo;		//numerator of inFrac.num

		numOne = this.num * inFraction.denom;
		numTwo = inFraction.num * this.denom;

		//0 if equal, -1 if less, 1 if greater
		if(numOne == numTwo){ index = 0;}
		if(numOne < numTwo){ index = -1;}
		if(numOne > numTwo){ index = 1;}

		return index;
	}
	//uses system.out 
	public int equals(Fraction inFraction){
		int index = 0;

		//cross multiply to set same denominator
		int numOne;		//numerator of this.num
		int numTwo;		//numerator of inFrac.num
		
		//comparison numerators
		numOne = this.num * inFraction.denom;
		numTwo = inFraction.num * this.denom;

		//-1 if different, 0 if same
		if(numOne == numTwo){ index = 0;}
		else								{ index = -1;}
		return index;
	}


	public double toDecimal(){
		double decimal = ((double)(this.num) / (double)(this.denom));
		return decimal;
	}

	public static Fraction randomFraction(){
	
		Random rand = new Random();
		int n = rand.nextInt(100) + 1;

		rand = new Random();
		int d = rand.nextInt(100) + 1;
		
		
		Fraction randomFraction = (n > d) ? new Fraction(d, n): new Fraction(n, d);

		return randomFraction;
	}

	public String toString(){
		simplify();
		String fraction = Integer.toString(this.num) + "/" + Integer.toString(this.denom);

		return fraction;
	}

  public int getNum(){
   return num;
  }
  
  public int getDen(){
    return denom;
  }


  
}
 