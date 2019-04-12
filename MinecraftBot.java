public class MinecraftBot extends Chatbot
{

  // ###################### constructors 

  // default constructor  - initialize the MinecraftBot properties
  public MinecraftBot()
  {
    myGreetings = new String[2];
    myGreetings[0] = "Uhh, do I know you?";
    myGreetings[1] = "Ugh, where did I get myself into this time?";

    myRandomQuestions = new String[2];
    myRandomQuestions[0] = "What do you want?";
    myRandomQuestions[1] = "Why are you here?";

    myInventorySpace = 0;
    myQuickChat = "";
    myHealth = 0.0;
    myTools = false;
  }

  // other constructor
  public MinecraftBot(int space, double health, String quickChat, boolean tools) 
  {
    myInventorySpace = space;
    myQuickChat = quickChat;
    myHealth = health;
    myTools = tools;
  }

  // ###################### accessor methods (getters)
  
  // returns a random greeting
  public String getGreeting()
  {
    return myGreetings[(int) (Math.random() * myGreetings.length)];
  }

  // returns a random question
  public String getRandomQuestion()
  {
    return myRandomQuestions[(int) (Math.random() * myRandomQuestions.length)];
  }

  // returns the myInventorySpace
  public int getInventorySpace()
  {
    return myInventorySpace;
  }
  
  // returns myQuickChat
  public String getQuickChat()
  {
    return myQuickChat;
  }


  // returns myHealth
  public double getHealth()
  {
    return myHealth;
  }



  // ###################### modifier methods (setters)

  // setting inventory space
  public void setInventorySpace(int space)           
  {
    myInventorySpace = space;
  }

  // setting health
  public void setHealth(double health)              
  {
    myHealth = health;
  }

  public void setQuickChat(String chat)            // setting quick chat
  {
    myQuickChat = chat;
  }

  public void setTools(boolean tools)              // setting tools
  {
    myTools = tools;
  }
  private String[] myGreetings;             // greeting messages
  private String[] myRandomQuestions;       // random questions
  private int myInventorySpace;             // space of the inventory
  private String myQuickChat;               // speech bubble
  private double myHealth;                  // a decimal number betw 0 and 10 where 10 is best health
  public boolean myTools;                   // true - he has tools; false - he has no tools

}// end of the MinecraftBot classpublic class MinecraftBot extends Chatbot
