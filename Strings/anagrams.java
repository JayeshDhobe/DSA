package Strings;
import java.util.Arrays;

public class anagrams {
    public static void main(String[] args) {
        String str1 = "earth";
        String str2 = "heart";  

        //convert to lowercase
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
       
      if (str1.length() ==  str2.length()) {

         //convert to character
         char[] str1charArray = str1.toCharArray();
         char[] str2charArray = str1.toCharArray();
 
        //sort
        Arrays.sort(str1charArray);
        Arrays.sort(str2charArray);
 
        boolean results = Arrays.equals(str1charArray ,str2charArray);
        if (results) {
            System.out.println(str1 +" " + "and" + " " + str2 + " are anagrams of each other");
        }else{
            System.out.println(str1 + " " + "and" +" " +str2 + " are  not anagrams of each other");    
      } 
       //case when length are n ot equal 
    }
    else {
        System.out.println(str1 + "and" + str2 + " are  not anagrams of each other");
    }
}
}