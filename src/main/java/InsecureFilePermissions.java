import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class InsecureFilePermissions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the file name to create or modify: ");
        String fileName = scanner.nextLine();

        try {

            File file = new File(fileName);
            
            if (!file.exists()) {
                
                file.createNewFile();
                System.out.println("File created: " + file.getName());
            }

           
            System.out.println("Enter content to write to the file: ");
            String content = scanner.nextLine();

            FileWriter writer = new FileWriter(file, true); 
            writer.write(content);
            writer.close();

            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
