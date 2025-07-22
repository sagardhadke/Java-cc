public class Unary_Operators {

    public static void main(String[] args){

        // Pre Increment
        int a = 13;
        System.out.println(++a); // 14
        System.out.println(++a); // 15

        // Pre Decrement
        System.out.println(--a); // 14
        System.out.println(a); // 14
        System.out.println(--a); // 13

        // Post Increment
        System.out.println(a++); // 13
        System.out.println(a++); // 14

        // Post Decrement
        System.out.println(a); // 15
        System.out.println(a--); // 15
        System.out.println(a--); // 14
        System.out.println(a); // 13

        System.out.println("\n\n\n\n\n");

        int value = 42;

        System.out.println(--value);  // 41
        System.out.println(value++);  // 41
        System.out.println(++value);  // 43
        System.out.println(value);    // 43
        System.out.println(value--);  // 43
        System.out.println(--value);  // 41
        System.out.println(value++);  // 41
        System.out.println(value);    // 42
        System.out.println(++value);  // 43
        System.out.println(value--);  // 43
    }

}
