package Testing;

public class CircleTesting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c1=new Circle(10);
		System.out.println(c1);
		c1.setRadius(20);
		System.out.println(c1);

	}

}

class Circle{
	private int radius;
	public Circle(int r) {
		radius=r;
	}
	public Circle setRadius(int r) {
		if(r==radius)
			return this;
			return new Circle(r);
		}
}