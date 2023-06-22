//Aggregation in java
public class Employee {

	int id;
	String name;
	Address address;
	public static void main(String[] args) {
		
		
		Address obj1=new Address("kollam","kerala","india",691574);  //calling address 
		Employee obj=new Employee(1,"anjaly",obj1);  //passing obj1 as address 

		obj.display();

	}
	public Employee(int id, String name, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}
	public void display() {
		System.out.println(id+","+name);
		System.out.println(address.city+" "+address.state+" "+address.country+" "+address.zip);
	}
	
}
