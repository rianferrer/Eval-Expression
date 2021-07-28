import java.util.*;
public class EvalExpFerrer {
	
	private String input;
	
	public EvalExpFerrer(String str)
	{
		input = str;
	}
	
	// FOR POSTFIX EXPRESSION
    public int evalPostfix()
    { 
        Stack<Integer> stk = new Stack<>(); 
          
        // scanning variables
        for(int i = 0; i < input.length(); i++) 
        { 
            char c = input.charAt(i); 
              
            //operand
            if(Character.isDigit(c)) 
            stk.push(c - '0'); 
              
            //operator
            else
            { 
                int oprd1 = stk.pop(); 
                int oprd2 = stk.pop(); 
                  
                switch(c) 
                { 
                    case '+': 
                    stk.push(oprd2+oprd1); 
                    break; 
                      
                    case '-': 
                    stk.push(oprd2 - oprd1);
                    break; 
                      
                    case '/': 
                    stk.push(oprd2 / oprd1); 
                    break;
                    
                    //FERRER, MARION CARYL R.
                    //2ITF
                      
                    case '*': 
                    stk.push(oprd2 * oprd1); 
                    break; 
              } 
            } 
        } 
        return stk.pop();
    }
    
    // FOR PREFIX EXPRESSION
    public int evalPrefix()
    { 
        Stack<Integer> stk = new Stack<>(); 
          
        // scanning variables
        for(int i = input.length()-1; i >= 0; i--) 
        { 
            char c = input.charAt(i); 
              
            //operand
            if(Character.isDigit(c)) 
            stk.push(c - '0'); 
              
            //operator
            else
            { 
                int oprd1 = stk.pop(); 
                int oprd2 = stk.pop(); 
                  
                switch(c) 
                { 
                    case '+': 
                    stk.push(oprd1 + oprd2); 
                    break; 
                      
                    case '-': 
                    stk.push(oprd1 - oprd2); 
                    break;
                    
                    case '/': 
                    stk.push(oprd1 / oprd2); 
                    break; 
                      
                    case '*': 
                    stk.push(oprd1 * oprd2); 
                    break; 
              } 
            } 
        } 
        return stk.pop();
    }
}