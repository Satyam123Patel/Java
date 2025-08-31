package program1;

public class Program10 {

    // method with void return type
    public static void value(int ch) {
    	ch = 2;
        System.out.println("ch is: " + ch);
    }

    public static void main(String[] args) {
        int ch = 1;   // ✅ declare ch in main

        System.out.println("You entered: " + ch);

        switch(ch) {
            case 1:
                value(ch); // pass value to method
                break;
            default:
                System.out.println("Invalid choice");
        }
    }
}
