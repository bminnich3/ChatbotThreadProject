public class ApexBot extends Chatbot
{
   // default constructor
   public ApexBot()
   {
      greetings = new String[6];
      greetings[0] = "Hey wassup, I'm Mirage.";
      greetings[1] = "Hi there, I am your aid Lifeline.";
      greetings[2] = "Greetings, my name is Bloodhound.";
      greetings[3] = "Hello human, I am your friendly metal bot, Pathfinder.";
      greetings[4] = "Sup maggot, Bangalore here.";
      greetings[5] = "Hòla amigo, the name's Octane.";
   }

   // accessors
   
   public String getGreeting()
   {
      return greetings[(int) (Math.random() * greetings.length)];
   }

   public String getrandomMessages()
   {
      return randomMessages[(int) (Math.random() * randomMessages.length)];
   }

   public String getGoodbye()
   {
      return goodbye[(int) (Math.random() * goodbye.length)];
   }

   // modifiers

   // interesting methods
   
   // instance fields (aka instance variables, properties)
   private String[] greetings;

   private String[] goodbye = 
   {
     "I hope you'll have fun, friend!", 
     "Good luck, have fun, don't die!", 
     "See you later!", 
     "See you soon!", 
     "Adios!",             // Spanish
     "Au revoir!",         // French
     "Ciao!"
   };
   
   private String[] randomMessages = 
   {
     "Don't worry, you'll be a Champion one day.",    // 0
     "You're good, but I'm better.",                  // 1
     "I bet I have more wins than you.",              // 2
     "Hey, good fight, wait wrong person.",           // 3
     "Uhh, okay."                                     // 4
   };
   
   public String[][] keywordResponsePairs = {
      // keyword (from human)              // chatbot response
     {"Who are you?",           "I'm an Apex Legend."}, 
     {"",                       "I will mate you in 3 moves."}, 
     {"",                       "Don't give up any pawns."}, 
     {"",                       "The king is the most valuable chess piece"}
    };

}// end of the ApexBot class
