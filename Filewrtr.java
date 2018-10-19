import java.io.FileWriter;
import java.io.IOException;
public class Filewrtr {
    public static void main(String[] args) {
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter("kal.txt"); 
            fileWriter.write(68);
            fileWriter.write(70);
            fileWriter.write(72);
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                if (fileWriter != null) {
                    fileWriter.flush();
                    fileWriter.close();                 
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}