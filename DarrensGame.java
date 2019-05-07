//package rock_papperGame;
//
//
//import java.util.*;
//
//public class DarrensGame {
//	

//	public static void myFunc1() {
//		  
//	    Scanner myObj = new Scanner(System.in);  
//	    System.out.println("Let's Play! Write, Rock,Papper,Scissors");
//	    String userInput = myObj.nextLine();  
//	    System.out.println("You Wrote: " + userInput); 
//	    //computer answer needs its own function 
//	    	String[]computerChoice;
//	    	computerChoice = new String[3];
//	    	computerChoice[0] = "Papper";
//	    	computerChoice[1] = "Rock";
//	    	computerChoice[2] = "Scissors";
//		 
//	int random = (int) (Math.random()*3);
//		 System.out.println("Computer's Choices is: " + computerChoice[random]);  
//		 
//		 //next section needs it own function 
//    
//		if( computerChoice[random].equals( "Rock" ) && userInput.equalsIgnoreCase( "scissors")) {
//			System.out.println( "Computer Wins!");
//			} else if( userInput.equalsIgnoreCase( "Rock") && computerChoice[random].equals( "Scissors")) {
//				System.out.println (" You Win!");
//			};	
//		  
//		  if( computerChoice[random].equals( "Papper" ) && userInput.equalsIgnoreCase( "Rock")) {
//				System.out.println( "Computer Wins!");
//				} else if( userInput.equalsIgnoreCase( "Papper") && computerChoice[random].equals( "Rock")) {
//					System.out.println (" You Win!");	  
//				};
//		  if( computerChoice[random].equals( "Scissors" ) && userInput.equalsIgnoreCase( "Papper")) {
//				System.out.println( "Computer Wins!");
//				} else if( userInput.equalsIgnoreCase( "Scissors") && computerChoice[random].equals( "Papper")) {
//					System.out.println (" You Win!");
//				};
//				if(userInput.equals(computerChoice[random])) {
//			  System.out.println(" It's A Tie!");
//		  }
//}
//
//	
//	
//	public static void main(String[] args) {
//		
//		myFunc1();
//	      
//	}
//}
//	
//	
//	