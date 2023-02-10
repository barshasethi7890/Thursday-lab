import java.util.Scanner;
public class Test2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enetr the string");
         String inputString = sc.nextLine();

         if (inputString.length() > 4) {
            String allExceptLast4 = inputString.substring(0,inputString.length()-4);
            String repeatString = "x".repeat(allExceptLast4.length());
            repeatString += inputString.substring(inputString.length()-4);
            System.out.println(repeatString);
         }
         else{
            System.out.println("entered String must be greater than 4.");
         }
         }

    }
