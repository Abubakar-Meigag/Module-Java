package module;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Train {

   public List<String> arr = new ArrayList<>(Arrays.asList("Buenos Aires", "Córdoba", "La Plata"));
   public ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));
   public String[] newArray = {"a", "b", "c", "h"};
   public String[] oldArray = new String[5];
   public List<String> array = new ArrayList<>();
   public ArrayList<Integer> oldArrayList = new ArrayList<>();

   public void getOldArray(String[] oldArray) {
       System.out.println(Arrays.toString(oldArray));
   }

   public void getStringElement (List<String> arr){
       for (String s : arr) {
           System.out.println(s);
       }
   };

   public void getNewArray(String[] newArray){
       for(String s : newArray){
           System.out.println(s);
       }
   };

   public void getIntElement (List<Integer> arrayList){
       for (Integer i : arrayList) {
           System.out.println(i);
       }
   }

}

