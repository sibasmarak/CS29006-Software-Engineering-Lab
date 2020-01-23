
class Box{
	float area() {
		return 0;
	}
}

class Rectangle extends Box{

	public float area(float l, float b) {
		// TODO Auto-generated method stub
		return l * b;
	}
}

class Square extends Rectangle{
	public float area(float s) {
		return s * s;
	}
}

class Rhombus extends Rectangle{
	public float area(float d1, float d2) {
		return (float) (0.5 * d1 * d2);
	}
}

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
