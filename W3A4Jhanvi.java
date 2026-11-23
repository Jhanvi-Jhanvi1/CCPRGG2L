package Jhanvi;
import java.io.FileWriter;
import java.io.IOException;
public class W3A4Jhanvi {

	public static void main(String[] args) {
		try (FileWriter writer = new FileWriter("Jhanvi.txt", true)){
			writer.write("\nToday I learned FileWriter.");
			System.out.println("New Text added.");
		} catch (IOException e) {
			System.out.println("Unable to update file");
		}

	}

}
