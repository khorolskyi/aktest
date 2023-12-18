package homework5;


public class Fraction {
  private int numerator;
  private int denominator;

  public Fraction(int numerator, int denominator) {
    this.numerator = numerator;
    this.denominator = denominator;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }

    if (obj == null || getClass() != obj.getClass()) {
      return false;
    }

    Fraction otherFraction = (Fraction) obj;

    return this.numerator * otherFraction.denominator == otherFraction.numerator * this.denominator;
  }
}

