package javahomework_Week_6;

/**
 * 2.1 Declare two static variables
 * 2.2 Declare one static method
 * 2.3 Call both static variables into the static method inside the print statement.
 * 2.4 Declare the Main method.
 * 2.5 Call the static method into the Main method and Run the programme.
 */
public class Program2 {
    static int a = 5; // static variable
    static int b = 10; // static variable

    public static void method(){ // // static method
        System.out.println(a);
        System.out.println(b);

    }

    public static void main(String[] args) {
        method();

    }

}
