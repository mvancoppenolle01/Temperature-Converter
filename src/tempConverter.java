import java.util.Scanner;

public class tempConverter {
    public static void main(String[] args) {
       
        System.out.println("What temperature conversion would you like to make?");
        System.out.println("1. Fahrenheit to Celsius");
        System.out.println("2. Celsius to Fahrenheit");
        System.out.println("3. Kelvin to Fahrenheit");
        System.out.println("4. Kelvin to Celsius");
        System.out.println("5. Fahrenheit to Kelvin");
        System.out.println("6. Celsius to Kelvin");

        // Convert Fahrenheit to Celsius
        Scanner fahrenheitC = new Scanner(System.in);
        
        String userInput = fahrenheitC.nextLine();

            while (userInput.equalsIgnoreCase("Fahrenheit to Celsius")){
                System.out.printf("You Entered: %s\n", userInput);
                System.out.print("Enter a temperature in Fahrenheit: ");
                
                double tempF = fahrenheitC.nextDouble();
                double tempFinalFahrenheit = (tempF - 32) * (.56);
                
                System.out.printf("%.2f degrees Fahrenheit is %.2f degrees Celsius", tempF, tempFinalFahrenheit);
                
                Scanner again = new Scanner(System.in);

                System.out.println("\nWould you like to convert another temperature?(Y/N)");
                userInput = again.nextLine();

                if(userInput.equals("Y")){
                userInput = fahrenheitC.nextLine();
                System.out.println("What temperature conversion would you like to make?");
                userInput = fahrenheitC.nextLine();
                }

                else if(userInput.equals("N")){
                break;
                }
            }      
        
            // Convert Celsius to fahrenheit
            Scanner celsiusF = new Scanner(System.in);

            while (userInput.equalsIgnoreCase("Celsius to Fahrenheit")){
                System.out.printf("You Entered: %s\n", userInput);
                System.out.print("Enter a temperature in Celsius: ");

                double tempC = celsiusF.nextDouble();
                double tempFinalCelsius = (tempC * 1.8) + 32;
                
                System.out.printf("%.2f degrees Celsius is %.2f degrees Farenheight", tempC, tempFinalCelsius);
                
                Scanner again = new Scanner(System.in);

                System.out.println("\nWould you like to convert another temperature?(Y/N)");
                userInput = again.nextLine();

                if(userInput.equals("Y")){
                userInput = celsiusF.nextLine();
               
                System.out.println("What temperature conversion would you like to make?");
                userInput = celsiusF.nextLine();
                }

                else if(userInput.equals("N")){
                break;
                }
            }
        
            // Convert Kelvin to Fahrenheit
            Scanner kelvinF = new Scanner(System.in);

            while (userInput.equalsIgnoreCase("Kelvin to Fahrenheit")){
                System.out.printf("You Entered: %s\n", userInput);
                System.out.print("Enter a temperature in Kelvin: ");
                
                double tempK = kelvinF.nextDouble();
                double tempFinalKelvin = 1.8 * (tempK - 273.15) + 32;
                
                System.out.printf("%.2f degrees Kelvin is %.2f degrees Fahrenheit", tempK, tempFinalKelvin);
                
                Scanner again = new Scanner(System.in);

                System.out.println("\nWould you like to convert another temperature?(Y/N)");
                userInput = again.nextLine();

                if(userInput.equals("Y")){
                userInput = kelvinF.nextLine();
                
                System.out.println("What temperature conversion would you like to make?");
                userInput = kelvinF.nextLine();
                }

                else if(userInput.equals("N")){
                break;
                }
            }      

            // Convert Kelvin to Celsius
            Scanner kelvinC = new Scanner(System.in);

            while (userInput.equalsIgnoreCase("Kelvin to Celsius")){
                System.out.printf("You Entered: %s\n", userInput);
                System.out.print("Enter a temperature in Kelvin: ");
                
                double tempK = kelvinC.nextDouble();
                double tempFinalKelvinC = tempK - 273.15;
                
                System.out.printf("%.2f degrees Kelvin is %.2f degrees Celsius", tempK, tempFinalKelvinC);
                
                Scanner again = new Scanner(System.in);

                System.out.println("\nWould you like to convert another temperature?(Y/N)");
                userInput = again.nextLine();

                if(userInput.equals("Y")){
                userInput = kelvinC.nextLine();
               
                System.out.println("What temperature conversion would you like to make?");
                userInput = kelvinC.nextLine();
                }

                else if(userInput.equals("N")){
                break;
                }
            }   

            // Convert Fahrenheit to Kelvin
            Scanner fahrenheitKScanner = new Scanner(System.in);

            while (userInput.equalsIgnoreCase("Fahrenheit to Kelvin")){
                System.out.printf("You Entered: %s\n", userInput);
                System.out.print("Enter a temperature in Fahrenheit: ");
                
                double tempFKelvin = fahrenheitKScanner.nextDouble();
                double tempFinalFahrenheitK = (tempFKelvin - 32)/(1.8) + 273.15;
                
                System.out.printf("%.2f degrees Fahrenheit is %.2f degrees Kelvin", tempFKelvin, tempFinalFahrenheitK);
                
                Scanner again = new Scanner(System.in);

                System.out.println("\nWould you like to convert another temperature?(Y/N)");
                userInput = again.nextLine();

                if(userInput.equals("Y")){
                userInput = fahrenheitKScanner.nextLine();
               
                System.out.println("What temperature conversion would you like to make?");
                userInput = fahrenheitKScanner.nextLine();
                }

                else if(userInput.equals("N")){
                break;
                }
            }  
        
            // Convert Celsius to Kelvin
            Scanner celsiusKScanner = new Scanner(System.in);

            while (userInput.equalsIgnoreCase("Celsius to Kelvin")){
                System.out.printf("You Entered: %s\n", userInput);
                System.out.print("Enter a temperature in Celsius: ");
                
                double tempCKelvin = celsiusKScanner.nextDouble();
                double tempFinalCelsiusK = tempCKelvin + 273;
                
                System.out.printf("%.2f degrees Celsius is %.2f degrees Kelvin", tempCKelvin, tempFinalCelsiusK);
                
                Scanner again = new Scanner(System.in);

                System.out.println("\nWould you like to convert another temperature?(Y/N)");
                userInput = again.nextLine();

                if(userInput.equals("Y")){
                userInput = celsiusKScanner.nextLine();
               
                System.out.println("What temperature conversion would you like to make?");
                userInput = celsiusKScanner.nextLine();
                }

                else if(userInput.equals("N")){
                break;
                }    
          }
    }
}
    



