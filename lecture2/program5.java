package lecture2;
import java.io.File;
public class program5 {
    public static void main(String[] args) {
        try {
            String pathProject = System.getProperty("user.dir");
            String pathFile = pathProject.concat("/file_from_program5.txt");
            File f3 = new File(pathFile);
            f3.createNewFile();
            System.out.println("try");
        } 
        catch (Exception e) {
            System.out.println("catch");
        }
    }
}