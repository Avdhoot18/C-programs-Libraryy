import java.io.*;

public class FileIOExample {
    public static void main(String[] args) {
        String fileName = "example.txt";

        // Write to file
        try (FileWriter fw = new FileWriter(fileName)) {
            fw.write("Hello from Java File I/O!\n");
            fw.write("This is line 2.\n");
        } catch (IOException e) {
            System.out.println("Error writing file: " + e);
        }

        // Read from file
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            System.out.println("Contents of " + fileName + ":");
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e);
        }
    }
}
