public class Print20NumberMultiple {
   public static void main(String ar[])
   {
    int [] arr = new int[20];
    int num;
    for(int i=1; i<=20; i++){
       num = i*3*8;
        System.out.println("Multiple of 3 and 8 :" +  num+"\t");
       arr[i]=num;
       System.out.println("store num :" +arr[i]);
       if(arr[i]%2==0){
        continue;
       }else System.out.println("odd num :" + arr[i] + "\t");
    }
    

   } 
}
