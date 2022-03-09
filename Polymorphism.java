public class Polymorphism{
	public static void main(String args[]){

		//METHOD OVERRIDING
		PrivateBank privateBank = new PrivateBank();
		PublicBank publicBank = new PublicBank();
		System.out.println(privateBank.getRateOfInterest());
		System.out.println(publicBank.getRateOfInterest());

		//METHOD OVERLOADING
		Shapes shape = new Shapes();
		shape.showDimensions(4);
		shape.showDimensions(5.0f, 6.0f);
		shape.showDimensions(8.0f);
	}
}
	//example of method overriding / Run-time polymorphism
	/*
	called as run time polymorphism cause which method 
	is going to be called is decided at run time by the
	JVM( Java Virtual Machine )
	
	important(5) 
	1) Same Method Name
	2) Same Arguememt List
	3) Same Return type
	4) Must not have More Restrictive Access Specifier
		eg: parent class : protected
		    child class : private ( not allowed)
		    child class can have (protected or public access specifiers in this case)
	5)Must not throw new or broader checked exceptions

	may or may not:
		have less restrictive access specifiers
		may throw fewer or narrower checked excpetions or unchecked exceptions
	*/
	class Bank{
		float getRateOfInterest(){
			System.out.print("Rate of Interest of ");
			return 0f;
		}
	}
	class PrivateBank extends Bank{
		@Override		
		float getRateOfInterest(){
			super.getRateOfInterest();
			System.out.println("Private Banks");
			return 5.5f;
		}
	}
	class PublicBank extends Bank{
		@Override
		float getRateOfInterest(){
			super.getRateOfInterest();
			System.out.println("Public Banks");
			return 5.0f;
		}
	}
	//example of method overloading / Compile time polymorphism
	/*
		important (2)
			1) Same Method Name
 			2) Different Arguement Lists

		may or may not (3)
			-->Have Different Return Types for Methods
			-->Have Different access modifiers for Methods
			-->Throw different check or uncheck exception
			       
	*/
	class Shapes{
		void showDimensions(int squaredimensions){
			System.out.println("Side of Square is \n" + squaredimensions);
		}
		void showDimensions(float length, float breadth){
			System.out.println("Length & Breadth of Rectangle are \n"+ length + " & " +breadth);
		}
		void showDimensions(float diameter){
			System.out.println("Diameter of circle is \n" + diameter);
		}
	}
