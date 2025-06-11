import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
 // import java.io.DeleteFile;
//import java.io.File;
import java.io.IOException;
import java.util.Scanner;
public class file {
    public static void main(String[] args) {
        try {
            File file =new File("new.txt");
            if (file.createNewFile()) {
                System.out.println("file created : "+ file.getName());
            } else {
                System.out.println("file already exist..");
            }
        } catch (Exception e) {
            System.out.println("an error ");
            e.printStackTrace();
        }
    } 
}
class WriteTofile {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("new.txt");
            writer.write("hello , this is a test message written text");
            writer.close();
            System.out.println("sucessfully wrote to the file..");
                } catch (Exception e) {
            System.out.println("an error occured ...");
            e.printStackTrace();
        }
    }
}
public class ReadFromFile {
    public static void main(String[] args) {
        try {
            File  file =new File("example.txt");
            Scanner scanner=new Scanner(file);
            while(scanner.hasNextLine()){
                String data = scanner.nextLine();
                System.out.println(data);
            }
            scanner.close();

        } catch (FileNotFoundException e) {
            // TODO: handle exception
            System.out.println("an error occupied.. ");
            e.printStackTrace();
        }
    }
}
public class DeleteFile {
    public static void main(String[] args) {
        File file = new File ("example.txt");
        if(file.delete()){
            System.out.println("deleted the file : " + file);
        }
        else{
            System.out.println("failed to deleted the file ");
        }
    }
}

