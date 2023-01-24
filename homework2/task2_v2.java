/*
Напишите программу, которая
1) по указанной строке URL скачивает файл и возвращает строковое содержимое файла
2) изменяет строковое содержимое файла подставляя по маске "%s" ваше имя
3) сохраняет файл локально
4) читает сохраненный файл и выводит содержимое в логгер
5) удаляет сохраненный файл
*/

package homework2;

import java.io.*;
import java.net.URL;
import java.util.Arrays;
import java.util.Scanner;
import java.util.logging.*;

public class task2_v2 {
    
    public static String Download_TXT_fIlE(int NuMBeR_ByTeS, String URL_FiLe) {
        String data_str = "";

        try (BufferedInputStream inputStream = new BufferedInputStream(new URL(URL_FiLe).openStream())) {

            byte data[] = new byte[NuMBeR_ByTeS];
            int bytesread = inputStream.read(data, 0, NuMBeR_ByTeS);
            data = Arrays.copyOfRange(data, 0, bytesread);
            data_str = new String(data, "UTF-8");
            
            /* - - - */
            System.out.println("- - - - - - - - - -");
            System.out.println("NuMBeR_ByTeS: " + NuMBeR_ByTeS);
            System.out.println("bytesread: " + bytesread);
            System.out.println("- - - - - - - - - -"+"\n");
            /* - - - */
            
            return data_str;
        } 
        catch (IOException e) {
            System.out.println("ALARM: ERROR: file download failed");
        }
        return data_str;
    }

    public static String Changing_TEXT(String old_string, String replacement_part, String substitute) {
        if (old_string == ""){
            System.out.println("ALARM: ERROR: Nothing came to the function Changing_TEXT");
            return "";
        }
        
        String after_replacement = old_string.replace(replacement_part, substitute);

        return after_replacement;
    }

    public static void Writing_Data_in_fIlE(String data_str, String path_and_file_name) {

        if (data_str == ""){
            return;
        }

        path_and_file_name += ".txt";

        try (FileWriter file_for_write = new FileWriter(path_and_file_name, true)) {

            file_for_write.write(data_str + "\n");
            file_for_write.flush();
            file_for_write.close();

        }
        catch (IOException e) {
            System.out.println("ALARM: ERROR: Data is not written to the file");
        }
    }

    public static void Send_Log(String text) throws IOException {
        
        Logger logger = Logger.getLogger(task2_v2.class.getName());
        FileHandler fh = new FileHandler("log_for_task2_v2.txt", true);
        logger.addHandler(fh);
        
        SimpleFormatter sFormat = new SimpleFormatter();
        fh.setFormatter(sFormat);

        logger.log(Level.INFO, text);
        fh.close();
    }

    public static String Read_Data_from_fIlE(String path_and_file_name) {

        String data_str = "";

        path_and_file_name += ".txt";

        try (FileReader read_file = new FileReader(path_and_file_name)) {
            
            Scanner scan = new Scanner(read_file);
            
            //считываем все строки
            data_str = scan.useDelimiter("\\A").next();
            Send_Log(data_str);

            read_file.close();
            scan.close();

            return data_str;
        }
        catch (IOException e) {
            System.out.println();
            System.out.printf("ALARM: ERROR: Specified file:" + path_and_file_name +";" + " " + "cannot be read" + "\n");
        }
        return data_str;
    }

    public static Boolean Delete_fIlE(String file_name) {
        
        file_name = "/" + file_name + ".txt";

        String pathProject = System.getProperty("user.dir");
        String pathFile = pathProject.concat(file_name);
        File file = new File(pathFile);

        return file.delete();
    }

    public static void main(String[] args) {

        //1) скачали
        String URL_FiLe = "https://raw.githubusercontent.com/aksodar/JSeminar_2/master/src/main/resources/example.txt";

        String text_from_file = Download_TXT_fIlE(256, URL_FiLe);

        System.out.println("Text from the downloaded file: " + text_from_file);

        //2) поменяли
        String сhanging_text_from_file = Changing_TEXT(text_from_file, "%s", "Федор");

        System.out.println("Changing text from the downloaded file: " + сhanging_text_from_file);

        //3) сохранили
        String path_and_file_name = "file_with_downloaded_modified_text";

        Writing_Data_in_fIlE(сhanging_text_from_file, path_and_file_name);

        //4) прочли сохраненный файл и записали содержимое в файл лога
        String read_text_from_saved_file = Read_Data_from_fIlE(path_and_file_name);

        System.out.println("Text from saved file: " + "\n" + read_text_from_saved_file);

        //5) удаляем ранее сохраненный файл
        if (Delete_fIlE(path_and_file_name)) {
            System.out.println("Successfully deleted a previously saved file !");
        }
        else {
            System.out.println("Previously saved file has not been deleted !");
        }
    }
}
