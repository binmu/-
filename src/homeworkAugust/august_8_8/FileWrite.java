package homeworkAugust.august_8_8;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWrite {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        try {
            FileWriter  fileWriter = new FileWriter("D:\\JavaIDE\\IntelliJ IDEA 2017.2.1\\WorkHouse\\TestHelloWorld\\test.txt");
            fileWriter.write(str);
            fileWriter.close();
            System.out.println("Done!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}