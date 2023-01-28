import java.util.Scanner;

public class tempConverter {
    public static void main(String[] args) {
        

        Scanner scan = new Scanner(System.in);
        
        System.out.println("Would you like to convert Celsius or Fahrenheit");
        String userInput = scan.nextLine();

            while (userInput.equalsIgnoreCase("Fahrenheit")){
                System.out.printf("You Entered: %s\n", userInput);
                System.out.print("Enter a temperature in Fahrenheit: ");
                
                double tempF = scan.nextDouble();
                double tempFinalFahrenheit = (tempF - 32) * (.56F);
                
                System.out.printf("%.2f degrees Fahrenheit is %.2f degrees Celsius", tempF, tempFinalFahrenheit);
                
                userInput = scan.nextLine();

            }

        Scanner celsius = new Scanner(System.in);

            while (userInput.equalsIgnoreCase("Celsius")){
                System.out.printf("You Entered: %s\n", userInput);
                System.out.print("Enter a temperature in Celsius: ");

                double tempC = celsius.nextDouble();
                double tempFinalCelsius = (tempC * 1.8) + 32;
                
                System.out.printf("%.2f degrees Celsius is %.2f degrees Farenheight", tempC, tempFinalCelsius);

                userInput = celsius.nextLine();
            }
            
            
            
        }
            
        
        
    }
    

