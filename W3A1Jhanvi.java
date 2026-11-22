import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
      try (FileWriter writer = new FileWriter("Jhanvi.txt")){
          writer.write("Welcome to Java File Handling!");
          System.out.println("Text successfully written.");
      } catch (IOException e){
          System.out.println("Error writing to file.");
      }
    }
}
