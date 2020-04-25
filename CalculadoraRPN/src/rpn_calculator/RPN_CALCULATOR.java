package rpn_calculator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author LUKETA
 */
public class RPN_CALCULATOR {
   
    public static void main(String[] args) {
        
       String result = "";
      
       List<Float> task = new ArrayList();
       Scanner scanner = new Scanner(System.in); 
       FUNCTIONS fun = new FUNCTIONS();
       String data_imput = "";
       ArrayList operation = fun.initlist();
       boolean work = true;
       System.out.println("\t\t\t\t OPERATIONS\n");
       for(int i = 0; i < operation.size(); i++)
       {
           System.out.print(operation.get(i));
       }  
       while(work=true)
       {
           System.out.println("\nEnter the operation code: ");
           data_imput = scanner.next();
           if(!data_imput.contains("OP"))
           {
               try
               {
                   if(task.size()==15)
                   {
                       task.remove(15);
                       task.add(Float.parseFloat(data_imput));
                   }
                   else
                   {
                       task.add(Float.parseFloat(data_imput));
                   }
               }
               catch(Exception  e)
               {
                   System.out.println("Invalid Data!");
               }
           }     
       if(data_imput.contains("OP"))
       {
           if(task.size()>1)
           {    
                switch(data_imput) {
                case "OP01":
                    result = String.valueOf(fun.addition(task.get(task.size()-2),task.get(task.size()-1)));
                    task.remove(task.size()-1);
                    task.remove(task.size()-1);                 
                    task.add(Float.parseFloat(result));
                    System.out.println("Result: " + result);
                    break;
                    
                case "OP02":
                    result = String.valueOf(fun.subtraction(task.get(task.size()-2),task.get(task.size()-1)));
                    task.remove(task.size()-1);
                    task.remove(task.size()-1);    
                    task.add(Float.parseFloat(result));
                    System.out.println("Result: " + result);
                    break;
                    
                case "OP03":
                    result = String.valueOf(fun.division(task.get(task.size()-2),task.get(task.size()-1)));
                    task.remove(task.size()-1);
                    task.remove(task.size()-1);    
                    task.add(Float.parseFloat(result));
                    System.out.println("Result: " + result);
                    break;
                    
                case "OP04":
                    result = String.valueOf(fun.integer_division(task.get(task.size()-2),task.get(task.size()-1)));
                    task.remove(task.size()-1);
                    task.remove(task.size()-1);    
                    task.add(Float.parseFloat(result));
                    System.out.println("Result: " + result);
                    break;
                  
                case "OP05":
                    result = String.valueOf(fun.rest(task.get(task.size()-2),task.get(task.size()-1)));
                    task.remove(task.size()-1);
                    task.remove(task.size()-1);    
                    task.add(Float.parseFloat(result));
                    System.out.println("Result: " + result);
                    break;
                  
                case "OP06":
                    result = String.valueOf(fun.binary(task.get(task.size()-1)));
                    task.remove(task.size()-1);
                    task.remove(task.size()-1);    
                    task.add(Float.parseFloat(result));
                    System.out.println("Result: " + result);
                    break;
                  
                case "OP07":
                    result = String.valueOf(fun.potentiation(task.get(task.size()-2),task.get(task.size()-1)));
                    task.remove(task.size()-1);
                    task.remove(task.size()-1);
                    task.add(Float.parseFloat(result));
                    System.out.println("Result: " + result);
                    break;
                  
                case "OP08":
                    result = String.valueOf(Math.sqrt(task.size()-1));
                    task.remove(task.size()-1);
                    task.add(Float.parseFloat(result));
                    System.out.println("Result: " + result);
                    break;
                  
                case "OP09":
                    result = String.valueOf(Math.tan(task.size()-1));
                    task.remove(task.size()-1);
                    task.add(Float.parseFloat(result));
                    System.out.println("Result: " + result);
                    break;
                  
                case "OP10":
                    result = String.valueOf(Math.sin(task.size()-1));
                    task.remove(task.size()-1);
                    task.add(Float.parseFloat(result));
                    System.out.println("Result: " + result);
                    break;
                  
                case "OP11":
                    result = String.valueOf(Math.cos(task.size()-1));
                    task.remove(task.size()-1);
                    task.add(Float.parseFloat(result));
                    System.out.println("Result: " + result);
                    break;
                  
                case "OP12":
                    result = String.valueOf(Math.toRadians(task.size()-1));
                    task.remove(task.size()-1);
                    task.remove(task.size()-1);
                    task.add(Float.parseFloat(result));
                    System.out.println("Result: " + result);
                    break;
                  
                case  "OP13":
                    float atual = task.get(task.size()-1);
                    float anterior = task.get(task.size()-2);
                    task.remove(task.size()-1);
                    task.remove(task.size()-1);
                    task.add(atual);
                    task.add(anterior);
                    break;

                case "OP14":
                for(int i = 0; i < task.size(); i++)
                {
                    System.out.println(task.get(i));
                }  
                break;
                
                case  "OP15":
                    work = false;
                    System.exit(0);
                    break;
                    
                default:
                    break;
                }
            }
        }  
    }
}    
    
    
    
    
    
}
