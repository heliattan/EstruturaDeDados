package rpn_calculator;

import java.util.ArrayList;

/**
 *
 * @author LUKETA
 */
public class FUNCTIONS {
    
    public float    addition            (float x ,float y)  { return x + y; }    
    public float    subtraction         (float x ,float y)  { return x - y; }
    public float    division            (float x ,float y)  { return x / y; }    
    public float    multiplication      (float x ,float y)  { return x * y; }
    public float    integer_division    (float x ,float y)  { return x / y; }
    public float    rest                (float x ,float y)  { return x % y; }
    public double   square_root         (float x)           { return Math.sqrt(x); }
    public double   potentiation        (float x, float y)  { return Math.pow(x, y); }
   
    public String binary (float number)
    {
        int x = Math.round(number);
        String bin = Integer.toBinaryString(x);       
        return bin;
    }   
   
    public double radian (float grade)
    {
        double g = grade;
        double r;
        r = (g * 3.14) / 180;
        return r; 
    }
    
    public ArrayList initlist(){
        ArrayList operation = new ArrayList();
        operation.add("OP01 - Addition          \t OP06 - Decimal to binary \t OP11 - Tangent\n");
        operation.add("OP02 - Subtraction       \t OP07 - y ^ x             \t OP12 - Degree to radian\n");
        operation.add("0P03 - Division          \t OP08 - Square Root       \t OP13 - Swap \n");
        operation.add("OP04 - Integer_division  \t OP09 - Sine              \t OP14 - Show Stack \n");
        operation.add("OP05 - Rest              \t OP10 - Cosine            \t OP15 - Exit Application \n");
        return operation;
    } 
}
