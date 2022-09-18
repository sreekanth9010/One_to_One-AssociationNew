package in.ineuron.one_to_one_association;


//Target class 
public class Student {
	private String name;
	private int age;
	private int sid;
	
	//Has-a variable 
	private Address address;

	
	//performing constructor injection
	public Student(String name, int age, int sid, Address address) {
		super();
		this.name = name;
		this.age = age;
		this.sid = sid;
		this.address = address;
	}

	
	//getters and setters to get and set the values 
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	public void display()
	{
		System.out.println("************Dispalying student details *******************");
		System.out.println("The name of the student is :: "+name);
		System.out.println("The age of the student is  :: "+age);
		System.out.println("The student id of student is :: "+sid);
		System.out.println("**********************************************************");
		System.out.println("The address of the student are ::");
		System.out.println("The pincode is :: "+address.getPinNo());
		System.out.println("The door no is  :: "+address.getDoorNo());
		System.out.println("The state is :: "+address.getState());
		System.out.println("The city is :: "+address.getCity());
		System.out.println("The country is::"+address.getCountry());
	}
	

}
