package in.ineuron.assignment5;

public interface IParent {

	// Interface cannot have implementation body as
	// they are complete abstraction / Service requirement specification.

	// Methods in interface are by default public abstract hence it is not
	// mandatory to mention public abstract before method name.

	// But in the later version default keyword is used for method implementation
	// inside interface.

	// Interface can extend other interface

	// Multiple inheritance can be achieved in interface.

	// Loose coupling can be achieved using interface which helps in integrating
	// the different vendors implementation code (jar) without any issue.

	// Interface are complete abstract

	// Hence the developer no need to care about the implementation class details,
	// developer can directly use interface to hold the implemented class object to
	// get use of the methods in implemented class.
	
	// Fields are by default public static final

	
	void MethodOne();
	
}
