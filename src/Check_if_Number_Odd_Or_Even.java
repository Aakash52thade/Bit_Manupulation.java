public class Check_if_Number_Odd_Or_Even {
    public static void main(String[] args) {
        int n = 7;
       Odd_OR_Even(n);
    }
    public static void Odd_OR_Even(int n){
        int Bitmask = 1;
        if((n & Bitmask) ==0){
            System.out.println("Even Number");
        }else {
            System.out.println("Odd Number");
        }
    }

}
