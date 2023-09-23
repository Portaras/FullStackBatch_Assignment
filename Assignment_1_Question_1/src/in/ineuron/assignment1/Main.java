package in.ineuron.assignment1;

public class Main {

	public static void main(String[] args) {

		// Loose coupling
		IShapes circleShape = new CircleImplShapes();
		circleShape.findArea();
		circleShape.findPerimeter();

		IShapes triangleShape = new TriangleImplShapes();

		triangleShape.findArea();
		triangleShape.findPerimeter();

	}

}
