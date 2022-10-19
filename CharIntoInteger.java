public class CharIntoInteger {
   // Online Java Compiler
// Use this editor to write, compile and run your Java code online
    public static void main(String[] args) {
        String statement = "COVID crisis has taught us several lessons and together we will overcome this great challenge. Now there is a sense of introspection in people. India will emerge stronger from this.";
        int st = 38;
        for(int i=0; i<=statement.length();i++){
            // System.out.println(statement.charAt(i));
            int s = (int) statement.charAt(i);
            int p=s-st;
            System.out.println(p);
            st++;
            
            
        }
        // for(int i=65; i<=90; i++){
        //     char s= (char) i;
        //     System.out.println(s);
        // }
        
        
        // System.out.println("Hello, World!");
    }
} 

