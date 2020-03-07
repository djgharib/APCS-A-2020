package Unit11;
//(c) A+ Computer Science

//www.apluscompsci.com
//Name -

import static java.lang.System.*;

class Rational implements Comparable<Rational> {
	// add two instance variables
	public int numerator = 1;
	public int denominator = 1;

	// write two constructors
	public Rational() {

	}

	public Rational(int num, int den) {
		numerator = num;
		denominator = den;
	}

	public int getNumerator() {
		return numerator;
	}

	public int getDenominator() {
		return denominator;
	}

	// write a setRational method
	public void setRational(int num, int den) {
		setNumerator(num);
		setDenominator(den);
	}

	// write a set method for numerator and denominator
	public void setNumerator(int num) {
		numerator = num;
	}

	public void setDenominator(int den) {
		denominator = den;
	}

	public void add(Rational other) {
		// num1/den1 + num2/den2
		// new numerator = (num1 * den2 + num2 * den1)
		int den1 = denominator;
		int den2 = other.getDenominator();
		int num1 = numerator;
		int num2 = other.getNumerator();
		int num3 = num1 * den2 + num2 * den1;
		// new denominator = (den1 * den2)
		int den3 = den2 * den1;
		numerator = num3;
		denominator = den3;
		reduce();
	}

	private void reduce() {
		int reduction = gcd(numerator, denominator);
		numerator = numerator / reduction;
		denominator = denominator / reduction;

	}

	private int gcd(int numOne, int numTwo) {
		int gcd = 1;
		for (int i = 1; i <= numOne && i <= numTwo; i++) {
			if (numOne % i == 0 && numTwo % i == 0)
				gcd = i;
		}
		return gcd;
	}

	public Object clone() {
		return new Rational(getNumerator(), getDenominator());
	}

	// ACCESSORS

	// write get methods for numerator and denominator

	public boolean equals(Object obj) {
		if (this.compareTo((Rational) obj) == 0) {
			return true;
		}
		return false;
	}

	public int compareTo(Rational other) {

		Rational frac1 = new Rational(numerator, denominator);
		Rational frac2 = new Rational(other.getNumerator(), other.getDenominator());
		frac1.reduce();
		frac2.reduce();
		if (frac1.getDenominator() < frac2.getDenominator()) {
			return -1;
		}
		else if (frac1.getDenominator() == frac2.getDenominator()) {
			if (frac1.getNumerator() < frac2.getNumerator()) {
				return -1;
			}
			else if (frac1.getNumerator() > frac2.getNumerator()) {
				return 1;
			}
			else {
				return 0;
			}
		}
		else {
			return 1;
		}
	}

	// write toString() method
	public String toString() {
		return numerator + "/" + denominator;
	}
}