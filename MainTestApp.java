package in.ineuron.one_to_one_association;

public class MainTestApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Address address = new Address(515411,262,"Andhra Pradesh","Anantapur","India");
		
		Student student = new Student("Sreekanth",22,11705009,address);
		
		student.display();

	}

}
