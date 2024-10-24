package javalab;
abstract class Figgures{
abstract void numberofsides();
}
class Rect extends Figgures{
	void numberofsides() {
		System.out.println("Rectangle has 4 sides");
		}
}
class Tri extends Figgures{
	void numberofsides() {
		System.out.println("Triangle has 3 sides");
		}
	}
class Hex extends Figgures{
	void numberofsides() {
		System.out.println("Hexagon has 6 sides");
		}
	}
public class Abstract {
	public static void main(String args[]) {
		Rect r =new Rect();
		Tri t = new Tri();
		Hex h = new Hex();
		r.numberofsides();
		t.numberofsides();
		h.numberofsides();
	}
}
