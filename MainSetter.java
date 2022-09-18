package in.ineuron.one_to_one_association;

public class MainSetter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Address2 address = new Address2();
		address.setPinNo(515411);
		address.setDoorNo(262);
		address.setState("Andhra Pradesh");
		address.setCity("Anantapur");
		address.setCountry("India");
		
		Student2 student = new Student2();
		student.setName("Sreekanth");
		student.setAge(22);
		student.setSid(11705009);
		student.setAddress(address);
		student.display();
	}

}
