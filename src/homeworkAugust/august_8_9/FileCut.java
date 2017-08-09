package homeworkAugust.august_8_9;

import java.io.*;

public class FileCut {
    public static void main(String[] args) {
        try {
            FileInputStream fileInputStream = new FileInputStream("D:/test.jpg");
            FileOutputStream fileOutputStream =new FileOutputStream("E:/test.jpg");
            int read = fileInputStream.read();
            while (read != -1){
                fileOutputStream.write(read);
                read = fileInputStream.read();
            }
            File file = new File("D:/test.jpg");
            
            file.deleteOnExit();
            fileInputStream.close();
            fileOutputStream.close();
            System.out.println("Done!");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
