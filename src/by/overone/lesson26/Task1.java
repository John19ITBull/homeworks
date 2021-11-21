package by.overone.lesson26;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Task1 {
    public static void main(String[] args) throws IOException {
        try {
            FileInputStream fileInputStream = new FileInputStream("C:\\Users\\Иван1\\IdeaProjects\\HomeTask\\FirstProject\\src\\by\\overone\\lesson26\\task1.txt");
            int i;
            StringBuilder result = new StringBuilder();
            while ((i = fileInputStream.read()) != -1) {
                result.append((char) i);
            }
            fileInputStream.close();
            System.out.println(result);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
