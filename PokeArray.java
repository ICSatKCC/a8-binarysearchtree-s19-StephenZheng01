import java.util.*;
/**
 Assignment 4 Arraylist of pokemon
 @author Stephen Zheng
 @since 02/25/2019
*/
public class PokeArray
{
/**
    * Main method to drive program.
    * @param args not used.
    */
   public static void main(String[] args){
   Scanner userIn = new Scanner (System.in);
   String inString = new String("");
   boolean menuloop = true;
   int counter = 0;
	ArrayList<Pokemon> pokemonArray = new ArrayList<Pokemon>();
      
     while(menuloop){
         
         
         System.out.println("1. Add a Pokemon");
         System.out.println("2. Print all Pokemon");
         System.out.println("0. Exit the program");
         System.out.println("\nWhat would you like to do?");
         
         inString = userIn.nextLine();
         
         inString = inString.trim();
         
         switch(inString){
            case "1":
               System.out.println("1. Bulbasaur");
               System.out.println("2. Ivysaur");
               System.out.println("3. Venusaur");
               System.out.println("4. Charmander");
               System.out.println("5. Charmeleon");
               System.out.println("6. Charizard");
               System.out.println("7. Squirtle");
               System.out.println("8. Wartortle");
               System.out.println("9. Blastoise");
               
               inString = userIn.nextLine();
               inString = inString.trim();
               switch(inString){
                  case "1": 
					      counter = counter%6;
					      System.out.println("Would you like to give your Bulbasaur a nickname?(y/n)");
					      inString = userIn.nextLine();
					      if(inString.equals("y")){
						      System.out.println("What is Bulbasaur's nickname?");
						      inString = userIn.nextLine();
						      if(pokemonArray.size() == 6){
                           pokemonArray.remove(counter);
                        }
                        pokemonArray.add(counter,new Bulbasaur(inString));
						      counter++;
					      }
					      else if(inString.equals("n")){
                        if(pokemonArray.size() == 6){
                           pokemonArray.remove(counter);
                        }
						      pokemonArray.add(counter, new Bulbasaur());
						      counter++;
					      }
					      else{
						      System.out.println("Invalid response,please try again");
					      }
					      break;
                  case "2": 
					      counter = counter%6;
					      System.out.println("Would you like to give your Ivysaur a nickname?(y/n)");
					      inString = userIn.nextLine();
					      inString = inString.trim();
					      if(inString.equals("y")){
						      System.out.println("What is Ivysaur's nickname?");
						      inString = userIn.nextLine();
						      if(pokemonArray.size() == 6){
                           pokemonArray.remove(counter);
                        }
                        pokemonArray.add(counter, new Ivysaur(inString));
						      counter++;
					      }
					      else if(inString.equals("n")){
						      if(pokemonArray.size() == 6){
                           pokemonArray.remove(counter);
                        }
                        pokemonArray.add(counter, new Ivysaur());
						      counter++;
					      }
					      else{
						      System.out.println("Invalid response,please try again");
					      }
					      break;
                  case "3": 
					      counter = counter%6;
					      System.out.println("Would you like to give your Venusaur a nickname?(y/n)");
					      inString = userIn.nextLine();
					      inString = inString.trim();
					      if(inString.equals("y")){
						      System.out.println("What is Venusaur's nickname?");
						      inString = userIn.nextLine();
						      if(pokemonArray.size() == 6){
                           pokemonArray.remove(counter);
                        }
                        pokemonArray.add(counter, new Venusaur(inString));
						      counter++;
					      }
					      else if(inString.equals("n")){
						      if(pokemonArray.size() == 6){
                           pokemonArray.remove(counter);
                        }
                        pokemonArray.add(counter, new Venusaur());
						      counter++;
					      }
					      else{
						      System.out.println("Invalid response,please try again");
					      }
					      break;
                  case "4": 
					      counter = counter%6;
					      System.out.println("Would you like to give your Charmander a nickname?(y/n)");
					      inString = userIn.nextLine();
					      inString = inString.trim();
					      if(inString.equals("y")){
						      System.out.println("What is Charmander's nickname?");
						      inString = userIn.nextLine();
						      if(pokemonArray.size() == 6){
                           pokemonArray.remove(counter);
                        }
                        pokemonArray.add(counter, new Charmander(inString));
						      counter++;
					      }
					      else if(inString.equals("n")){
						      if(pokemonArray.size() == 6){
                           pokemonArray.remove(counter);
                        }
                        pokemonArray.add(counter, new Charmander());
						      counter++;
					      }
					      else{
						      System.out.println("Invalid response,please try again");
					      }
					      break;
                  case "5": 
					      counter = counter%6;
					      System.out.println("Would you like to give your Charmeleon a nickname?(y/n)");
					      inString = userIn.nextLine();
					      inString = inString.trim();
					      if(inString.equals("y")){
						      System.out.println("What is Charmeleon's nickname?");
						      inString = userIn.nextLine();
						      if(pokemonArray.size() == 6){
                           pokemonArray.remove(counter);
                        }
                        pokemonArray.add(counter, new Charmeleon(inString));
						      counter++;
					      }
					      else if(inString.equals("n")){
						      if(pokemonArray.size() == 6){
                           pokemonArray.remove(counter);
                        }
                        pokemonArray.add(counter, new Charmeleon());
						      counter++;
					      }
					      else{
						      System.out.println("Invalid response,please try again");
					      }
					      break;
                  case "6": 
					      counter = counter%6;
					      System.out.println("Would you like to give your Charizard a nickname?(y/n)");
					      inString = userIn.nextLine();
					      inString = inString.trim();
					      if(inString.equals("y")){
						      System.out.println("What is Charizard's nickname?");
						      inString = userIn.nextLine();
						      if(pokemonArray.size() == 6){
                           pokemonArray.remove(counter);
                        }
                        pokemonArray.add(counter, new Charizard(inString));
						      counter++;
					      }
					      else if(inString.equals("n")){
						      if(pokemonArray.size() == 6){
                           pokemonArray.remove(counter);
                        }
                        pokemonArray.add(counter,new Charizard());
						      counter++;
					      }
					      else{
						      System.out.println("Invalid response,please try again");
					      }
					      break;
                  case "7":
					      counter = counter%6;
					      System.out.println("Would you like to give your Squirtle a nickname?(y/n)");
					      inString = userIn.nextLine();
					      inString = inString.trim();
					      if(inString.equals("y")){
						      System.out.println("What is Squirtle's nickname?");
						      inString = userIn.nextLine();
						      if(pokemonArray.size() == 6){
                           pokemonArray.remove(counter);
                        }
                        pokemonArray.add(counter, new Squirtle(inString));
						      counter++;
					      }
					      else if(inString.equals("n")){
						      if(pokemonArray.size() == 6){
                           pokemonArray.remove(counter);
                        }
                        pokemonArray.add(counter, new Squirtle());
						      counter++;
					      }
					      else{
						      System.out.println("Invalid response,please try again");
					      }
					      break;
                  case "8": 
					      counter = counter%6;
					      System.out.println("Would you like to give your Wartortle a nickname?(y/n)");
					      inString = userIn.nextLine();
					      inString = inString.trim();
					      if(inString.equals("y")){
						      System.out.println("What is Wartortle's nickname?");
						      inString = userIn.nextLine();
						      if(pokemonArray.size() == 6){
                           pokemonArray.remove(counter);
                        }
                        pokemonArray.add(counter, new Wartortle(inString));
						      counter++;
					      }
					      else if(inString.equals("n")){
						      if(pokemonArray.size() == 6){
                           pokemonArray.remove(counter);
                        }
                        pokemonArray.add(counter, new Wartortle());
						      counter++;
					      }
					      else{
						      System.out.println("Invalid response,please try again");
					      }
					      break;
				      case "9": 
					      counter = counter%6;
					      System.out.println("Would you like to give your Blastoise a nickname?(y/n)");
					      inString = userIn.nextLine();
					      inString = inString.trim();
					      if(inString.equals("y")){
						      System.out.println("What is Blastoise's nickname?");
						      inString = userIn.nextLine();
						      if(pokemonArray.size() == 6){
                           pokemonArray.remove(counter);
                        }
                        pokemonArray.add(counter, new Blastoise(inString));
						      counter++;
					      }
					      else if(inString.equals("n")){
						      if(pokemonArray.size() == 6){
                           pokemonArray.remove(counter);
                        }
                        pokemonArray.add(counter,new Blastoise());
						      counter++;
					      }
					      else{
						      System.out.println("Invalid response,please try again");
					      }
					      break;            
                  default:
					      System.out.println("Invalid response,please try again");
					      break;
			         }
			   break;
            case "2":
			System.out.println("you have " + pokemonArray.size() + " pokemon.");
              for(int i = 0; i<pokemonArray.size(); i++){
					System.out.println(pokemonArray.get(i).toString());
			     }
               break;
            case "0":
				   System.out.println("Ending program.");
				   menuloop = false;
				break;
				
			   default:
				   System.out.println("Invalid response,please try again");
				   break;
		   }
	   }
   }
}
