import java.util.Scanner; 
import java.util.Arrays;

class Conversation {
  public static void main(String[] arguments) {

    Scanner input = new Scanner(System.in);
    System.out.println("Hello! How many rounds would you like to do?");
    int num = input.nextInt();
    input.nextLine();
    int counter  = 0;
    System.out.println("How are you?");
    String[] transcript = new String[num*2 + 1];
    transcript[0] = "How are you?";
   


    /*  I created a list of fairly vague dialogue just so when the user is not using any pronouns 
    in their responses, there can still be some type of banter or conversation.
    */
    String canned_responses[] = {"who", 
    "what", 
    "hey!", 
    "oh wow", 
    "so cool", 
    "amazinggg", 
    "dude thats crazyyy",
    "okay...",
    "interesting",
    "ahuh",
    "welp",
    "tuff",
    "damn" };
    // String canned_responses = {"wow", "cool", "amazing";}

    while (counter < num) {
      String user_response = input.nextLine();
      transcript[counter*2 + 1] = user_response;
      // System.out.println("oh");
      counter++;
      /* I am using an if statement to identify all the pronouns a user's response could give
       * in order to replace them and say it back to the user in a form of a question.
       */
      if (user_response.contains("I ")||user_response.contains("i ")|| 
      user_response.contains("Me ")|| user_response.contains("you ")|| 
      user_response.contains("You ")|| user_response.contains("my ")||
      user_response.contains("My ")||user_response.contains("your ")||
      user_response.contains("Your ")){

        /*
         * I am using temp to make up for using multiple if statements. Using temp, I am putting a temporary
         * variable in for certain pronouns so that the replaced pronouns do not get replaced AGAIN.
         */

        user_response = user_response.replaceAll("I ", "temp ");
        user_response = user_response.replaceAll("You ", "I ");
        user_response = user_response.replaceAll("temp ", "You ");

        user_response = user_response.replaceAll("i ", "temp ");
        user_response = user_response.replaceAll("you ", "i ");
        user_response = user_response.replaceAll("temp ", "you ");

        user_response = user_response.replaceAll("Me ", "you ");
        user_response = user_response.replaceAll("me ", "you ");

        user_response = user_response.replaceAll("am ", "are ");
        user_response = user_response.replaceAll("Am ", "Are ");

        user_response = user_response.replaceAll("my ", "temp ");
        user_response = user_response.replaceAll("your ", "my ");
        user_response = user_response.replaceAll("temp ", "your ");

        user_response = user_response.replaceAll("My ", "temp ");
        user_response = user_response.replaceAll("Your ", "My ");
        user_response = user_response.replaceAll("temp ", "Your ");

        /*
         * I am adding a question mark to the end of my sentence in order to make it seem like the 
         * computer is asking the user a question.
         */
        System.out.println(user_response + "?");
        transcript[counter*2] = user_response;



      }

      //.replace for words
      
      else{
        System.out.println(canned_responses[counter]);
        transcript[counter*2] = canned_responses[counter];
    }  
    
    }
    System.out.println("Goodbye!");
    System.out.println("TRANSCRIPT:");
    for(int i = 0; i < transcript.length; i++){
      System.out.println(transcript[i]);
    }
    System.out.println("Goodbye!");

     
    //  I dont really know how this part workssss ugh
      
     {
      
    } 
    
  }
}
