package org.poss;

public class PossibleObjectCreation extends Possible2{
	
	private void childMethod1() {
		System.out.println("Child Method 1");

	}
	private void childMethod2() {
		System.out.println("Child Method 1");

	}
	@Override
	public void parMethod3() {
		System.out.println("Overridden Method 3");
		super.parMethod3();
	}
	
	public static void main(String[] args) {
		
		PossibleObjectCreation p=new PossibleObjectCreation(); // Using Child-Child Class Object Creation
		p.childMethod1();
		p.childMethod2();
		p.parMethod1();
		p.parMethod2();
		p.parMethod3();
		
		Possible2 p1=new Possible2(); //Using Parent-Parent Class Object Creation
		p1.parMethod1();
		p1.parMethod2();
		p1.parMethod3();
		
		Possible2 p3=new PossibleObjectCreation(); // Parent - Child Object Creation
		p3.parMethod1();
		p3.parMethod2();
		p3.parMethod3();
		
		
		
		
		
	}

}
