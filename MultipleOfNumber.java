import java.util.*;
public class MultipleOfNumber {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[10];
        int cout=0;
        int num;
        for(int i=1; i<=n; i++){
            if(i%3==0&&i%8==0){
                num = i;

                
                System.out.println("Multiple_of_3 and 8 :"+i);
                cout= cout+1;

               
            }
           

        }
        System.out.println("Total Count :" +cout);

    }
}
