
public class Car extends Vehicle {

	
	
	public void show() {
		System.out.println("child class");
	}
	public static void main(String[] args) {
Car obj=new Car();
obj.show();
Vehicle obj1=new Car();  //upcasting coverting child class to parent class
obj1.show();
	}

}
