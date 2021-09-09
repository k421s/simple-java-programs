public class Main
{
    public static void main(String[ ] args)
    {
      int num = 12;
      int den = 24;

      Fraction frac = new Fraction(num, den);
      frac.simplify();
			Fraction frac2 = new Fraction(9, 9);

			
			frac = frac2.multFraction(frac2);

			System.out.println(frac2.toString());
            
      
    }
}
