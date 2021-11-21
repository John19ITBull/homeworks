package by.overone.lesson26;

import java.io.*;

public class Task2 {
    public static void main(String[] args) throws IOException {
        try {
            FileReader reader = new FileReader("C:\\Users\\Иван1\\IdeaProjects\\HomeTask\\FirstProject\\src\\by\\overone\\lesson26\\task2.txt");
            BufferedReader bufferedReader = new BufferedReader(reader);
            String ch;
            String[] arr;
            StringBuilder builder = new StringBuilder();
            while((ch = bufferedReader.readLine()) != null)
            {
                arr = ch.split("\\W+");
                for(int i = 0; i < arr.length; i++){
                    if(Character.toString(arr[i].charAt(0)).matches("([oOaAuUyYeEiI])")){
                        builder.append(arr[i] + " ");
                    }
                }
            }
            System.out.println(builder);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
