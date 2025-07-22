public class Shorthand_Operators {

    public static void main(String[] args){
        int x = 2;

        System.out.println("Addition Assignment = " + (x+=4)); // x = x+4;
        System.out.println("Subtraction Assignment = " + (x-=4)); // x = x-4;
        System.out.println("Multiplication Assignment = " + (x*=4)); // x = x*4;
        System.out.println("Division Assignment = " + (x/=4)); // x = x/4;
        System.out.println("Remainder Assignment = " + (x%=4)); // x = x%4;

    }

}
