package in.ineuron.assignment5;

public abstract class AbstractClassImplParent implements IParent {

	// It is not full abstraction, There can be non abstract method inside abstract
	// class.

	// If there is at least one abstract method in the class then the class needs to
	// abstract mandatory

	// But a class can be marked as abstract even if there is no abstract methods
	// inside it.

	// Interface extends Interface but he classes implement interface

	// if the class implement interface then all the abstract method inside the
	// interface needs to be implemented in the child class , if any one of method
	// is skipped for implementation then the class should be marked as abstract.

	// If the method going to be left as abstract in Abstract class then public
	// abstract keyword is mandatory in Abstract class.
	
	public abstract void MethodOne();
}
