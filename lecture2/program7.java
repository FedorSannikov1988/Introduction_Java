package lecture2;
import java.io.File;
public class program7 {
    public static void main(String[] args) {
        try {
            String pathProject = System.getProperty("user.dir");
            String pathFile = pathProject.concat("/file_from_program7.txt");
            File f3 = new File(pathFile);
            if (f3.createNewFile()) {
                System.out.println("file.created");
            }
            else {
                System.out.println("file.existed");
            }
        }

        catch (Exception e) {
            System.out.println("catch");
        }
        
        finally { 
            System.out.println("finally"); 
        }
    }
}