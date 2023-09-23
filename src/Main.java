import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Please enter a string: ");
        String userString = keyboard.nextLine();

        StringBuilder reversed = new StringBuilder(new StringBuilder(userString).reverse().toString());


        System.out.println("Here is your string reversed: " + reversed);
    }
}