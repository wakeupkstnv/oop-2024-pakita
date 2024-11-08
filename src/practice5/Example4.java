package practice5;
import java.util.*;

public class Example4
{
   public static void main(String[] args)
   {
      double leftOperand, result = 0, rightOperand;
      String leftString, operator, rightString;
      StringTokenizer tokenizer;
      Scanner in = new Scanner(System.in);
      StringTokenizer splitBy = new StringTokenizer(in.nextLine(), " ", false);

      while (splitBy.hasMoreTokens()) {
         tokenizer = new StringTokenizer(splitBy.nextToken(), "+-*/", true);
         try
         {
            leftString = tokenizer.nextToken();
            operator = tokenizer.nextToken();
            rightString = tokenizer.nextToken();

            if (tokenizer.countTokens() != 0) throw new MoreThanNeedSymbolsException();

            leftOperand  = Double.parseDouble(leftString);
            rightOperand = Double.parseDouble(rightString);

            switch (operator) {
               case "+" -> result = leftOperand + rightOperand;
               case "-" -> result = leftOperand - rightOperand;
               case "*" -> result = leftOperand * rightOperand;
               case "/" -> {
                  if (rightOperand == 0) throw new ArithmeticException();
                  result = leftOperand / rightOperand;
               }
            }
            System.out.println("Result: " + result);
         }
         catch (NoSuchElementException nsee)
         {
            System.out.println("Invalid syntax");
         }
         catch (NumberFormatException nfe)
         {
            System.out.println("One or more operands is not a number");
         }
         catch (ExceptionInInitializerError | MoreThanNeedSymbolsException e){
            System.out.println(e.getMessage());
         }
         catch (ArithmeticException ae)
         {
            System.out.println("div by 0");
         } finally
         {
            in.close();
         }
      }
   }
}
