package by.overone.lesson26;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Task4 {
    public static void main(String[] args) throws IOException {
        try {
            FileReader reader = new FileReader("C:\\Users\\Иван1\\IdeaProjects\\HomeTask\\FirstProject\\src\\by\\overone\\lesson26\\task4.txt");
            BufferedReader bufferedReader = new BufferedReader(reader);
            String ch;
            String[] arr;
            StringBuilder builder = new StringBuilder();
            while ((ch = bufferedReader.readLine()) != null) {
                builder.append(ch + " ");
            }
            arr = builder.toString().split("\\D+");
            int max = 0;
            String strMax = "";
            for (int i = 0; i < arr.length; i++) {
                if (max < arr[i].length()) {
                    max = arr[i].length();
                    strMax = arr[i];
                }
            }
            System.out.println(strMax);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
