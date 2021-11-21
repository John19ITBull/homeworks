package by.overone.lesson26;

import java.io.*;

public class Task3 {
    public static void main(String[] args) throws IOException {
        try {
            FileReader reader = new FileReader("C:\\Users\\Иван1\\IdeaProjects\\HomeTask\\FirstProject\\src\\by\\overone\\lesson26\\task3.txt");
            BufferedReader bufferedReader = new BufferedReader(reader);
            String ch;
            String[] arr;
            StringBuilder builder = new StringBuilder();
            while ((ch = bufferedReader.readLine()) != null) {
                builder.append(ch + " ");
            }
            arr = builder.toString().split("\\W+");
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i].charAt(arr[i].length() - 1) == arr[i + 1].charAt(0)) {
                    System.out.println(arr[i] + " " + arr[i + 1]);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
