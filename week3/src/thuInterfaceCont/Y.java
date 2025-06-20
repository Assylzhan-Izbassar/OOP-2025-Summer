package thuInterfaceCont;

public interface Y extends X, Z {
	@Override
	void doIt();
	
//	void doSomething(); hidden
	
	void doSomething(String action); // Overloading
}
