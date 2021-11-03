package by.overone.lesson21;

import java.util.ArrayList;

public class Tasks {
    public static Integer countUnique(ArrayList<Integer> list) {
        ArrayList<Integer> listUnique = new ArrayList<>();
        for(int i = 0; i < list.size(); i++){
            if(list.isEmpty()){
                return 0;
            }
            if( !listUnique.contains(list.get(i))){
                listUnique.add(list.get(i));
            }
        }
        return listUnique.size();
    }

    public static ArrayList<String> englishText(String text) {
        String[] arr = text.split(" ");
        ArrayList<String> wordsUnique = new ArrayList<>();
        for(int i = 0; i < arr.length; i++){
            if( !wordsUnique.contains(arr[i])){
                wordsUnique.add(arr[i]);
            }
        }
        return wordsUnique;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        System.out.println(countUnique(list));
        System.out.println(englishText("Aa bb aa bb cc ww cc"));
    }
}
