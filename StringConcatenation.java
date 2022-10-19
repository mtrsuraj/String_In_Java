import java.util.*;
public class StringConcatenation {
    public static void main(String args[]){
        String firstName="Suraj";
        String lastName = "Patel";
        String fullName = firstName +" "+ lastName;
        System.out.println(fullName);
        // length_function
        System.out.println(fullName.length());
        // charAt
        for(int i=0;i<=fullName.length();i++){
            System.out.println(fullName.charAt(i));
            // compare
            String name1="Suraj";
            String name2="PAtel";
            if(name1.compareTo(name2)<-1){
                System.out.println("String are equel");
            }else System.out.println("String are not equel");
        }
        if(new String("name")==new String("name")){
            System.out.println("String are equels");
        }else System.out.println("String are not equels");

        String sentence = "My name is suraj";
        // substring(beg index, end index)
        String name = sentence.substring(11, sentence.length());
        System.out.println(name);
    }
}
