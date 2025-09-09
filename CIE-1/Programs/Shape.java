package cie01;

public class Shape {
	public double area(double radius) {
		return 3.14 * radius * radius;
	}
	public double area(double length,double breadth) {
		return length * breadth;
	}
	public double area( double base, double height, boolean isTriangle) {
		return 0.5 * base * height;
	}
	
		public static void main(String[] args) {
			Shape s= new Shape();
			System.out.println("Circle Area:" + s.area(5));
			System.out.println("Rectangle Area:"+ s.area(4,6));
			System.out.println("Triangle Area:"+ s.area(3,7, true));
		}
	}

