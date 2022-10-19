public class ReversString {
    public static void main(String ag[]){
        // String name = "Suraj";
        StringBuilder name = new StringBuilder("Suraj");
        for(int i=0; i<=name.length()/2; i++){
            int front = i;
            int backend = name.length()-1-i;
            char frontChar = name.charAt(front);
            char backChar = name.charAt(backend);
            name.setCharAt(front, backChar);
            name.setCharAt(backend, frontChar);
            // System.out.println(name);
        }
        System.out.println(name);
    }
}
