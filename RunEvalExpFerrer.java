import java.io.*;
public class RunEvalExpFerrer {

	public static void main(String args[])throws IOException {
		String s, check = "y";
		int n;
		EvalExpFerrer ev;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				
		while(check.equals("y"))
		{
			System.out.print("Welcome to Rian's Evaluation of Expression Program\n");
			System.out.println(" ");
			System.out.println("Choose one: ");
			System.out.println("1. Postfix Expression");
			System.out.println("2. Prefix Expression");
			System.out.print("Enter the number of your preferred expression: ");
			
			n = Integer.parseInt(br.readLine());
			
			//FERRER, MARION CARYL R.
            //2ITF
			
			switch(n)
			{
			case 1:
				System.out.print("\nEnter the Postfix expression: ");
				s = br.readLine();
				ev = new EvalExpFerrer(s);
				System.out.println("Evaluating...");
				System.out.println("Answer: " + ev.evalPostfix());
				break;
				
			case 2:
				System.out.print("\nEnter the Prefix expression: ");
				s = br.readLine();
				ev = new EvalExpFerrer(s);
				System.out.println("Evaluating...");
				System.out.println("Answer: " + ev.evalPrefix());
				break;
			
			default:
				System.out.println("Only choose 1 or 2.");
			}
			System.out.println("\nAnother expression to evaluate? (Press y to continue)");
			check = br.readLine();
		}
	}
}
