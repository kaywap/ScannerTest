import java.util.Scanner;

/**
 *Testing of the Scanner class
 * @version 08.27.2025
 * @author Kayla Cao
 */
public class ScannerInOut {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name;
        int age;
        double gpa;

        System.out.print("Enter your name: ");
        name = input.nextLine();

        while(true){
            try {
                System.out.print("Enter your age: ");
                String ageInput = input.nextLine().trim();
                if (ageInput.isEmpty()) {
                    System.out.println("Please enter a value");
                    continue;
                }
                age = Integer.parseInt(ageInput);  // parse and store
                if (age > 0) {
                    break;
                }
            }
            catch(Exception e){
                System.out.println("Invalid input, enter a valid integer");
            }
        }
        while(true){
            try {
                System.out.print("Enter your gpa: ");
                String gpaInput = input.nextLine().trim();
                if (gpaInput.isEmpty()) {
                    System.out.println("Please enter a value");
                    continue;
                }

                gpa = Double.parseDouble(gpaInput);  // parse and store
                if (gpa >= 0 && gpa <= 4.33) {
                    break;
                } else {
                    System.out.println("Invalid input, enter a value between 0 and 4");
                }
            }
            catch(Exception e){
                System.out.println("Invalid input, enter a valid number");
                // No input.next() needed since we're using nextLine()
            }
        }

        System.out.println("Name: " + name + "\nAge: " + age + "\nGPA: " + gpa);
    }
}
