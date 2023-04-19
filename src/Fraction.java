/*
Class Invariants:
Numerators and denominators are unchangeable once set by the constructor.
No denominator will be stored as a 0. (i.e., no DivideByZero Exceptions).
A Fraction is always in reduced form (reduce in the constructor to ensure this).
 */
public class Fraction {
    public final int numerator;
    public final int denominator;

    public Fraction(int numerator, int denominator) {
         this.numerator = numerator;
        if (denominator == 0) {
            this.denominator = 1;
        } else {
            this.denominator = denominator;
        }
    }
    public Fraction(Fraction otherFraction){
        if (otherFraction != null){
            this.numerator = otherFraction.numerator;
            this.denominator = otherFraction.denominator;
        } else {
            this.numerator = 0;
            this.denominator = 1;
        }
    }
    public int getNum(){
        return this.numerator;
    }
    public int getDenom(){
        return this.denominator;
    }
    @Override
    public String toString(){
        return numerator + "/" + denominator;
    }
    public Fraction add(Fraction otherFraction){
        if (this.denominator == otherFraction.denominator){
            //Adds numerators if denominators are the same, but does NOT reduce fraction
            return new Fraction ((this.numerator + otherFraction.numerator), this.denominator);
        } else {
            //Cross multiply if denominators aren't the same and add fractions, but does NOT reduce fraction
            return new Fraction ((this.numerator * otherFraction.denominator) + (this.denominator * otherFraction.numerator),
                    this.denominator * otherFraction.denominator);
        }
    }
    @Override
    public boolean equals(Object other) {
        if( other != null && ! (other instanceof Fraction ) ) return false;
        //what does this code do?
        Fraction that = (Fraction) other;
        //and this code?
        if (that == null) {
            return false;
        }
        return this.numerator == that.numerator && this.denominator == that.denominator;
    }
}
