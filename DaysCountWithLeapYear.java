import java.util.*;
public class DaysCountWithLeapYear {
    public static void main(String args[]){
        int leapYear;
        Scanner sc = new Scanner(System.in);
        // int dayMonthyear = sc.nextInt();
        // for(int i=)
        // int daysFormat=sc.nextInt();
        int day = sc.nextInt();
        int month = sc.nextInt();
        int year= sc.nextInt();
        int totalSum;
        int [] arrMonth = {1,2,3,4,5,6,7,8,9,10,11,12};
        for(int i=0; i<12; i++){
            if(arrMonth[i]==month){
                if(month==2)
                {
                    if(year%4==0){
                        totalSum = 31+29;
                    }else totalSum = 31+28;
                }
                month = 30;
                 totalSum = month +1;
                System.out.println(totalSum+"Days");

                }
                // int totalSum = day+;
                // for(int j=1; j<=month; j++){
                //     int sum = month*
                // }
                // System.out.println(i);

            }
        
        // if(month==)
        


    }
}
