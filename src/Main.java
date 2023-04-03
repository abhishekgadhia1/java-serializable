import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		Person person = new Person("Abhishek", 27);
		
		System.out.println(person);
		
		FileOutputStream fos = new FileOutputStream("person.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(person);
		oos.close();
		fos.close();
		System.out.println("Serialized data is stored in person.ser");
	}

}
