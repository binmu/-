package homeworkAugust.august_8_9;


import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class FileWrite {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        try {
            RandomAccessFile rf = new RandomAccessFile("src/test.txt", "rw");
            rf.seek(rf.length());  //将指针移动到文件末尾
            rf.writeBytes(str);
            rf.writeBytes(System.getProperty("line.separator"));
            rf.close();
            System.out.println("Done!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}