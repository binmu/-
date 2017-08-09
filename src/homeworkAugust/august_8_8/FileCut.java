package homeworkAugust.august_8_8;

import java.io.*;

public class FileCut {
    public static void main(String[] args) {
        try {
            FileInputStream fileInputStream = new FileInputStream("D:/test.jpg");
            FileOutputStream fileOutputStream =new FileOutputStream("E:/test.jpg");
            BufferedInputStream bis = new BufferedInputStream(fileInputStream);
            BufferedOutputStream bos = new BufferedOutputStream(fileOutputStream);
            byte[] b = new byte[1024];
            int read = bis.read(b);
            while (read != -1){
            	bos.write(b, 0, read);;
                read = bis.read(b);
            }
            File file = new File("D:/test.jpg");
            
            file.deleteOnExit();
            bis.close();
            bos.close();
            System.out.println("Done!");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
