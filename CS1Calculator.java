import java.util.Scanner;

public class CS1Calculator {

    private Scanner scan;
    private int additionCount;
    private int subtractionCount;
    private int multiplicationCount;
    private int divisionCount;
    private int totalSolved ; 
      
    public static void main(String[] args) {
    
      CS1Calculator myCalculator = new CS1Calculator();
      myCalculator.printIntro();
      myCalculator.calculate();
      myCalculator.printResults();
    
    }
  
    public CS1Calculator() {
      additionCount = 0;
      subtractionCount = 0;
      multiplicationCount = 0;
      divisionCount = 0;
      totalSolved = 0;
      
      scan = new Scanner(System.in);
      
    }
    
    
    private void printIntro() {
        System.out.printf("Hello! This is a basic calculator program. ");
    }

    private void calculate() {
    
        boolean using = true;
        String operator;
        String userAnswer;
        int num1, num2, result;
              
    
        do {
            System.out.println("Enter the operation you want to use.");
            System.out.println("(A)ddition");
            System.out.println("(S)ubtraction");
            System.out.println("(M)ultiplication");
            System.out.println("(D)ivision");
            
            operator = scan.nextLine();
            if (operator.equals("A")) {
            System.out.println("You've selected: Addition");
              }
            else if (operator.equals("S")) {
            System.out.println("You've selected: Subtraction");
            }
            else if (operator.equals("M")) {
            System.out.println("You've selected: Multiplication");
            }
            else if (operator.equals("D")) {
            System.out.println("You've selected: Division");
            }
           
           
            System.out.println("Enter your first number: ");
            num1 = Integer.parseInt(scan.nextLine());
            System.out.println("Enter your second number");
            num2 = Integer.parseInt(scan.nextLine());
            
            result = 0;

            if  (operator.equals ("A")) {
                result = num1 + num2;
                additionCount++;
               } 
            else if (operator.equals ("S")) {
                result = num1 - num2; 
                subtractionCount++;
               }
            else if (operator.equals ("M")) {
                result = num1 * num2;
                multiplicationCount++;
               }
            else if (operator.equals ("D")) {
                result = num1 / num2;
                divisionCount++;
               }
           
            else {
                System.out.println("Invalid operation, please try again.");
               
               }
  
        
          System.out.println("Your first number is: " + num1);
          System.out.println("Your second number is: " + num2);
          System.out.println("The result is: " + result);
    
          System.out.println("Would you like to solve another problem? (y,n)");
          
            userAnswer = scan.nextLine();

            if (userAnswer.equals("n")) {
                using = true;
            } else if (userAnswer.equals("y")){
            }
            
         } while (userAnswer.equals("y"));
    }


    private void printResults() {
        System.out.println("Thanks for using this program! Here's your Calculator Report: ");

        System.out.println("Addition Count: " + additionCount);
        System.out.println("Subtraction Count: " +  subtractionCount);
        System.out.println("Multiplication Count: " + multiplicationCount);
        System.out.println("Division Count: " + divisionCount);

        System.out.println("Total Problems Solved: " + totalSolved);
        
    }
 }
