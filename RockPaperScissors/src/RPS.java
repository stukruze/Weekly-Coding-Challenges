import java.util.Scanner;

public class RPS {

	public static void main(String[] args) {
		
		
		int fin = 1;
		
		while(fin == 1) {
			
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter rock paper or scissors for player one");
		
        String one = sc.nextLine();
        
        System.out.println("Enter rock paper or scissors for player two");
        
        String two = sc.nextLine();
        
        System.out.println(rps(one,two));
        
        System.out.println("Enter 1 to play again and 2 to terminate");
        
        fin = sc.nextInt();
        
		}
		
	}
	
	private static String rps(String one, String two) {
		
		if(one.equals("rock") && two.equals("paper")) {
			return "player two wins";
		}
		if(one.equals("rock") && two.equals("scissors")) {
			return "player one wins";
		}
		if(one.equals("paper") && two.equals("rock")) {
			return "player one wins";
		}
		if(one.equals("paper") && two.equals("scissors")) {
			return "player two wins";
		}
		if(one.equals("scissors") && two.equals("rock")) {
			return "player two wins";
		}
		if(one.equals("scissors") && two.equals("paper")) {
			return "player one wins";
		}
		if(one.equals(two)) {
			return "tie";
		}
		
		return "you entered something other than rock paper or scissors";
		
	}
	
	
	

}
