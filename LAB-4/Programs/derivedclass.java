package lab04;

	class A {
	    int add(int x, int y) {
	        return x + y;
	    }
	    double add(double x, double y) {
	        return x + y;
	    }
	}

	class B extends A {
	    String concatenate(String s1, String s2) {
	        return s1 + s2;
	    }
	}

	public class derivedclass{
	    public static void main(String[] args) {
	        B obj = new B();
	        System.out.println("Sum of Integers = " + obj.add(2, 3));
	        System.out.println("Sum of Double = " + obj.add(2.5, 3.5));
	        System.out.println("Concat 2 strings: " + obj.concatenate("Hello ","World"));
	    }
	}


