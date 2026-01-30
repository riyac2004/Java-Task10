import java.util.Scanner;

class InvalidMarksException extends Exception {

    //Constructor
    public InvalidMarksException(String message){
        super(message);
    }
}

public class Main {
    public static void checkMarks(int marks) throws InvalidMarksException {
        if (marks < 0 || marks > 100) {
            throw new InvalidMarksException("Marks should be between 0 and 100!");
        }
        System.out.println("Marks entered: " + marks);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try{
            System.out.print("Enter Student Marks: ");
            int marks=input.nextInt();

            checkMarks(marks);

            System.out.print("Enter a number to divide 100: ");
            int num=input.nextInt();

            int result= (100/num);
            System.out.println("Result: "+result);

        } catch (InvalidMarksException e) {
            System.out.println("Custom error: "+e.getMessage());
        }

        catch (ArithmeticException e){
            System.out.println("Math Error: Cannot divide by zero!");
        }
         catch (Exception e){
            System.out.println("General Error: Invalid Input!");
            e.printStackTrace();
         }

        finally{
            System.out.println("Program execution completed.");
            input.close();
        }
    }
}