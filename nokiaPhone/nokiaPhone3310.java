import java.util.Scanner;
public class nokiaPhone3310{
    public static void main(String[] args){

        Scanner pressButton = new Scanner(System.in);

            
            String phone = String.format("""
                __________________________  
                |                   3310 |
                |                        |
                |          NOKIA         |
                |________________________|
                |                        |
                |                        |
                |                        |
                |                        |
                |                        |
                |                        |
                |________________________|
                |                        |
                           menu           
                |                        |
                | power           <  >   |
                |                        |
                |    1              3    |
                            2             
                |    4              6    |
                            5             
                |    7              9    |
                            8             
                |                        |
                            0             
                |________________________|  """ 
                                               );
            System.out.println(phone);
            
          int powerOn = 0;
          while(powerOn != 1) {
            System.out.print("Enter 1 to Switch on: ");
             powerOn = pressButton.nextInt();
                switch (powerOn){
                    case 1:   
                        System.out.printf("%s%n","Powering on");
                        break;
                default:
                        System.out.printf("%s %s%n","O_O", "press  1  to power on the phone"); break;
                                } 
            }
            
            String welcome = String.format("""
            __________________________  
            |                   3310 |
            |                        |
            |          NOKIA         |
            |________________________|
            |                        |
            |  W E L C O M E         |
            |                        |
            |   handshake            |
            |                        |
            |             N O K I A  |
            |________________________|
            |                        |
                       menu           
            |                        |
            | power           <  >   |
            |                        |
            |    1              3    |
                        2             
            |    4              6    |
                        5             
            |    7              9    |
                        8             
            |                        |
                        0             
            |________________________| 
                                        """
                                           );
            System.out.println(welcome);
            boolean inMenu = true;
            while (inMenu){
               System.out.printf("%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s", "MENU",
                                               "1. Phone book",
                                               "2. Messages",
                                               "3. Chat",
                                               "4. Call register",
                                               "5. Tones",
                                               "6. Settings",
                                               "7. Call divert",
                                               "8. Games",
                                               "9. Calculator",
                                               "10. Reminders",
                                               "11. Clocks",
                                               "12. Profiles",
                                               "13. SIM services",
                                               "0. To turn off the phone",
                                                "press a button 1 - 13 to access MAIN MENU options: ");
                int mainMenu = pressButton.nextInt();

                    switch (mainMenu){
                       case 1: System.out.printf("%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s", 
                                                               "Phone book", 
                                                       "1. Search",
                                                       "2. Service Nos. ",
                                                       "3. Add name",
                                                       "4. Erase",
                                                       "5. Edit",
                                                       "6. Assign tone",
                                                       "7. Send b'card",
                                                       "8. Options",
                                                       "9. Speed dails",
                                                       "10. Voice tags",
                                                        "0. Back to main menu",
                                                       "press a number to select other Phone book options: ");
                                                         boolean ifInPhoneBook = true;
                                                         while(ifInPhoneBook){  int phoneBook = pressButton.nextInt();
                                                             
                                                            switch (phoneBook){
                                                                case 1: System.out.printf("%s%n", "Search");
                                                                        break;
                                                                case 2: System.out.printf("%s%n", "Service Nos.");
                                                                        break;
                                                                case 3: System.out.printf("%s%n", "Add name");
                                                                        break;
                                                                case 4: System.out.printf("%s%n", "Erase");
                                                                        break;
                                                                case 5: System.out.printf("%s%n", "Edit");
                                                                        break;
                                                                case 6: System.out.printf("%s%n", "Assign tone");
                                                                        break;
                                                                case 7: System.out.printf("%s%n", "Send b'card");
                                                                        break;
                                                                case 8: System.out.printf("%s%n%s%n%s%n%s%n%s", 
                                                                                                    "Options",
                                                                                                 "1. Type of view",
                                                                                                 "2. Memory status",
                                                                                                  "0. Back to Phonebook Menu",          
                                                                                                 "Press a number to from 0-2: ");
                                                                                                boolean ifInOptions = true;
                                                                                                while(ifInOptions){   int options = pressButton.nextInt();
         
                                                                                                   switch (options){
                                                                                                        case 1: System.out.printf("%s%n", "Type of view");
                                                                                                                break;
                                                                                                        case 2: System.out.printf("%s%n", "Memory status");
                                                                                                                break;
                                                                                                        case 0: ifInOptions = false; System.out.printf("%s%n","Back");
                                                                                                                break;
                                                                                                        default: System.out.printf("%s%n", "O_O not an option");
                                                                                                    }
                                                                                                 }
                                                                        break;
                                                                case 9: System.out.printf("%s%n", "Speed dails");
                                                                        break;
                                                                case 10: System.out.printf("%s%n", "Voice tags");
                                                                        break;
                                                                case 0: ifInPhoneBook = false; System.out.printf("%s%n","Back to main menu"); break;
                                                                default: System.out.printf("%s%n", "O_O not an option");
                                                                }
                                                            }
                           break;
                        case 2: System.out.printf("%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s", 
                                                               "Messages",
                                                       "1. Write message",
                                                       "2. Inbox",
                                                       "3. Outbox",
                                                       "4. Picture messages",
                                                       "5. Templates",
                                                       "6. Smileys",
                                                       "7. Message Settings",
                                                       "8. Info service",
                                                       "9. Voice mailbox number",
                                                       "10. Service command editor",
                                                        "0. Go back Main Menu",
                                                       "press a number to select other Message options: " );
                                                    boolean ifInMessages = true;
                                                    while(ifInMessages){ int messages = pressButton.nextInt();
                                                             
                                                            switch (messages){
                                                                case 1: System.out.printf("%s%n", "Write messages");
                                                                        break;
                                                                case 2: System.out.printf("%s%n", "Inbox");
                                                                        break;
                                                                case 3: System.out.printf("%s%n", "Outbox");
                                                                        break;
                                                                case 4: System.out.printf("%s%n", "Picture messages");
                                                                        break;
                                                                case 5: System.out.printf("%s%n", "Templates");
                                                                        break;
                                                                case 6: System.out.printf("%s%n", "Smileys");
                                                                        break;
                                                                case 7: System.out.printf("%s%n%s%n%s%n%s%n%s", "Message settings",
                                                                                         "1.Set 1", 
                                                                                          "2.Common",
                                                                                           "0. Go back to Messages",
                                                                                          "Press a number to from 0-2: ");
                                                                                        boolean ifInMessageSettings = true;
                                                                                        while(ifInMessageSettings){  int messageSettings = pressButton.nextInt();
         
                                                                                          switch (messageSettings){

                                                                                              case 1: System.out.printf("%s%n%s%n%s%n%s%n%s", "Set 1",
                                                                                                        "1. Message center number", 
                                                                                                        "2. Messages sent as",
                                                                                                        "3. Message validity",
                                                                                                        "0. Go back to Message Settings",
                                                                                                        "Press a number to from 1-3: ");
                                                                                                      boolean ifInSetOne = true;
                                                                                                      while(ifInSetOne){  int setOne = pressButton.nextInt();
         
                                                                                                        switch (setOne){
                                                                                                        case 1: System.out.printf("%s%n", "Message centre number");
                                                                                                            break;
                                                                                                        case 2: System.out.printf("%s%n", "Messages sent as");
                                                                                                            break;
                                                                                                        case 3: System.out.printf("%s%n", "Message validity");
                                                                                                            break;
                                                                                                        case 0: ifInSetOne = false; System.out.printf("%s%n", "Go Back");
                                                                                                                break;
                                                                                                        default: System.out.printf("%s%n", "O_O not an option");
                                                                                                         }
                                                                                                      }
                                                                                                 break;
                                                                                              case 2: System.out.printf("%s%n%s%n%s%n%s%n%s%n%s", "Common",
                                                                                                        "1. Dilevery reports",
                                                                                                        "2. Reply via same centre",
                                                                                                        "3. Character support",
                                                                                                        "0. Go back to Message settings",
                                                                                                        "Press a number to from 0-3: ");
                                                                                                      boolean ifInCommon = true;
                                                                                                      while(ifInCommon){  int common = pressButton.nextInt();
         
                                                                                                        switch (common){
                                                                                                        case 1: System.out.printf("%s%n", "Dilevery reports");
                                                                                                                break;
                                                                                                        case 2: System.out.printf("%s%n", "Reply via same centre");
                                                                                                                break;
                                                                                                        case 3: System.out.printf("%s%n", "Character support");
                                                                                                                break;
                                                                                                        case 0: ifInCommon = false; 
                                                                                                                System.out.printf("%s%n", "Go Back");
                                                                                                                break;
                                                                                                        default: System.out.printf("%s%n", "O_O not an option");
                                                                                                         }
                                                                                                       }
                                                                                                 break;
                                                                                               case 0: ifInMessageSettings = false; System.out.printf("%s%","Back");
                                                                                                     break;
                                                                                               default: System.out.printf("O_O not an option");
                                                                                           }
                                                                                        }
                                                                        break;
                                                                case 8: System.out.printf("%s%n", "Info service");
                                                                        break;
                                                                case 9: System.out.printf("%s%n", "Voice mailbox number");
                                                                        break;
                                                                case 10: System.out.printf("%s%n%s%n", "Service command editor");
                                                                        break;
                                                                case 0: ifInMessages = false; System.out.printf("%s%n","Back to Main Menu"); break;
                                                                default: System.out.printf("%s%n%s%n", "O_O not an option");
                                                                        break;
                                                             }
                                                        }
                            break;
                         case 3:boolean ifInChat = true;
                                  while(ifInChat) { System.out.printf("%s%n%s%n%s","Chat", "0. Go back to Main Menu","press button 0 to go back: ");
                                                         int chat = pressButton.nextInt();
                                                          switch (chat){
                                                            case 0: ifInChat = false; System.out.printf("%s%n", "Go back"); break;
                                                            default: System.out.printf("%s%n","O_O not an option"); 
                                                           }
                                  }
                            break;  
                         case 4: System.out.printf("%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s","Call register", 
                                                       "1. Missed calls",
                                                        "2. Received Calls",
                                                        "3. Dialled numbers",
                                                        "4. Erase recent call lists",
                                                        "5. Show call duration",
                                                        "6. Show call costs",
                                                        "7. Call cost setttings",
                                                        "8. Prepaid credit",
                                                        "0. Go Back to the Main menu",
                                                        "press a number to select other Call register options: ");
                                                         boolean ifInCallRegister = true;
                                                         while(ifInCallRegister){  int callRegister = pressButton.nextInt();
                                                              switch (callRegister){
                                                                 case 1: System.out.printf("%s%n", "Missed calls");
                                                                    break;
                                                                 case 2: System.out.printf("%s%n", "Received Calls");
                                                                    break;
                                                                 case 3: System.out.printf("%s%n", "Dialled numbers");
                                                                    break;
                                                                 case 4: System.out.printf("%s%n", "Erase recent call lists");
                                                                    break;
                                                                 case 5: System.out.printf("%s%n%s%n%s%n%s%n%s%n%s%n%s", "Show call duration", 
                                                                                    "1. Last call duration",
                                                                                    "2. All call's duration",
                                                                                    "3. Recieved calls' duration",
                                                                                    "4. Dialled calls' duration",
                                                                                    "5. Clear timers",
                                                                                    "0. Go Back To Call Register",
                                                                                    "press a number to select other Show call duration options: ");
                                                                                   boolean ifInShowCallDuration = true;
                                                                                   while(ifInShowCallDuration){  int showCallDuration = pressButton.nextInt();
                                                                                      switch (showCallDuration){
                                                                                         case 1: System.out.printf("%s%n", "Last call duration");
                                                                                                break;
                                                                                         case 2: System.out.printf("%s%n", "All call's duration");
                                                                                                break;
                                                                                         case 3: System.out.printf("%s%n", "Recieved calls' duration");
                                                                                                break;
                                                                                         case 4: System.out.printf("%s%n", "Dialled calls' duration");
                                                                                                break;
                                                                                         case 5: System.out.printf("%s%n", "Clear timers");
                                                                                                break;
                                                                                         case 0: ifInShowCallDuration = false; System.out.printf("%s%n", "Clear timers");
                                                                                                break;
                                                                                          default: System.out.printf("%s%n", "O_O not an option");
                                                                                                break;
                                                                                            }
                                                                                   }
                                                                    break;
                                                                 case 6: System.out.printf("%s%n%s%n%s%n%s%n%s%n%s", "Show call costs",  
                                                                                    "1. Last call cost",
                                                                                    "2. All call's cost",
                                                                                    "3. Clear counters",
                                                                                    "0. Go Back To Call Register",
                                                                                    "press a number to select other Show call costs options: ");    
                                                                                    boolean ifInShowCallCost = true;
                                                                                    while(ifInShowCallCost){  int showCallCosts = pressButton.nextInt();
                                                                                       switch (showCallCosts){
                                                                                          case 1: System.out.printf("%s%n", "Last call cost");
                                                                                                break;
                                                                                          case 2: System.out.printf("%s%n", "All call's cost");
                                                                                                break;
                                                                                          case 3: System.out.printf("%s%n", "Clear counters");
                                                                                                break;
                                                                                          case 0: ifInShowCallCost = false; System.out.printf("%s%n", "Back");
                                                                                                break;
                                                                                             default: System.out.printf("%s%n", "O_O not an option");
                                                                                                break;
                                                                                            }
                                                                                     }
                                                                    break;
                                                                 case 7: System.out.printf("%s%n%s%n%s%n%s%n%s", "Call cost setttings",  
                                                                                    "1. Call cost limit",
                                                                                    "2. Show costs in",
                                                                                    "0. Go back to Call register",
                                                                                    "press a number to select other Call cost setttings options: ");
                                                                                    boolean ifInCallCostSettings = true;
                                                                                    while(ifInCallCostSettings){    int callCostsSettings = pressButton.nextInt();
                                                                                      switch (callCostsSettings){
                                                                                        case 1: System.out.printf("%s%n", "Call cost limit");
                                                                                                break;
                                                                                        case 2: System.out.printf("%s%n", "Show costs in");
                                                                                                break;
                                                                                        case 0: ifInCallCostSettings = false; System.out.printf("%s%n", "Back");
                                                                                                break;
                                                                                        default: System.out.printf("%s%n", "O_O not an option");
                                                                                                break;
                                                                                            }
                                                                                    }
                                                                    break;
                                                                 case 8: System.out.printf("%s%n", "Prepaid credit");
                                                                    break;
                                                                 case 0: ifInCallRegister = false; System.out.printf("%s%n", "Go Back"); break;
                                                                 default: System.out.printf("%s%n", "O_O not an option");
                                                              }
                                                            }
                            break;
                         case 5: System.out.printf("%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s","Tones",
                                                       "1. Ringing tone",
                                                       "2. Ringing volume",
                                                       "3. Incoming call alert",
                                                       "4. Composer",
                                                       "5. Message alert tone",
                                                       "6. Keypad tones",
                                                       "7. Warning and game tones",
                                                       "8. Vibrating alert",
                                                       "9. Screen saver",
                                                       "0. Go back to Main Menu",
                                                       "press a number to select other Tones options: ");
                                                         boolean ifInTones = true;
                                                         while(ifInTones){
                                                            int tones = pressButton.nextInt();
                                                              switch (tones){
                                                                 case 1: System.out.printf("%s%n", "Ringing tone");
                                                                    break;
                                                                 case 2: System.out.printf("%s%n", "Ringing volumes");
                                                                    break;
                                                                 case 3: System.out.printf("%s%n", "Incoming call alert");
                                                                    break;
                                                                 case 4: System.out.printf("%s%n", "Composer");
                                                                    break;
                                                                 case 5: System.out.printf("%s%n", "Message alert tone");
                                                                    break;
                                                                 case 6: System.out.printf("%s%n", "Keypad tones");
                                                                    break;
                                                                 case 7: System.out.printf("%s%n", "Warning and game tones");
                                                                    break;
                                                                 case 8: System.out.printf("%s%n", "Vibrating alert");
                                                                    break;
                                                                 case 9: System.out.printf("%s%n", "Screen saver");
                                                                    break;
                                                                 case 0: ifInTones = false; System.out.printf("%s%n", "Back"); break;

                                                                 default: System.out.printf("%s%n", "O_O not an option");
                                                              }
                                                          }
                            break;
                         case 6: System.out.printf("%s%n%s%n%s%n%s%n%s%n%s%n%s","Settings",
                                                        "1. Call settings",
                                                        "2. Phone settings",
                                                        "3. Security settings",
                                                        "4. Restore factory settings",
                                                        "0. Go Back to Main Menu",
                                                        "press a number to select other Settings options: ");
                                                         boolean ifInSettings = true;
                                                         while(ifInSettings){
                                                            int settings = pressButton.nextInt();
                                                              switch (settings){
                                                                 case 1: System.out.printf("%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s", "Call settings",
                                                                    "1. Automatic redial",
                                                                    "2. Speed dialling",
                                                                    "3. Call waiting options",
                                                                    "4. Own number sending",
                                                                    "5. Phone line in use",
                                                                    "6. Automatic answer",
                                                                    "0. Go back to Settings",
                                                                    "press a number to select other Call settings options: ");
                                                                    boolean ifInCallSettings = true;
                                                                    while(ifInCallSettings){
                                                                        int callSettings = pressButton.nextInt();
                                                                          switch (callSettings){
                                                                             case 1: System.out.printf("%s%n", "Automatic redial");
                                                                                break;
                                                                             case 2: System.out.printf("%s%n", "Speed dialling");
                                                                                break;
                                                                             case 3: System.out.printf("%s%n", "Call waiting options");
                                                                                break;
                                                                             case 4: System.out.printf("%s%n", "Own number sending");
                                                                                break;
                                                                             case 5: System.out.printf("%s%n", "Phone line in use");
                                                                                break;
                                                                             case 6: System.out.printf("%s%n", "Automatic answer");
                                                                                break;
                                                                             case 0: ifInCallSettings = false; System.out.printf("%s%n", "Go Back"); break;

                                                                             default: System.out.printf("%s%n", "O_O not an option");
                                                                                break;
                                                                           }
                                                                     }
                                                                    break;
                                                                 case 2: System.out.printf("%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s", "Phone settings", 
                                                                    "1. Language",
                                                                    "2. Cell info display",
                                                                    "3. Welcome note",
                                                                    "4. Network selection",
                                                                    "5. Lights",
                                                                    "6. Confirm SIM service actions",
                                                                    "0. Go Back to Settings menu",
                                                                    "press a number to select other Phone settings options: ");
                                                                    boolean ifInPhoneSettings = true;
                                                                    while(ifInPhoneSettings){
                                                                        int phoneSettings = pressButton.nextInt();
                                                                          switch (phoneSettings){
                                                                             case 1: System.out.printf("%s%n", "Language");
                                                                                break;
                                                                             case 2: System.out.printf("%s%n", "Cell info display");
                                                                                break;
                                                                             case 3: System.out.printf("%s%n", "Welcome note");
                                                                                break;
                                                                             case 4: System.out.printf("%s%n", "Network selection");
                                                                                break;
                                                                             case 5: System.out.printf("%s%n", "Lights");
                                                                                break;
                                                                             case 6: System.out.printf("%s%n", "Confirm SIM service actions");
                                                                                break;
                                                                             case 0: ifInPhoneSettings = false; System.out.printf("%s%n", "Back");
                                                                                break;
                                                                             default: System.out.printf("%s%n", "O_O not an option");
                                                                                break;
                                                                           }
                                                                      }
                                                                    break;
                                                                 case 3: System.out.printf("%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s", "Security settings", 
                                                                    "1. PIN code resquest",
                                                                    "2. Call barring service",
                                                                    "3. Fixed dialing",
                                                                    "4. Closed user group",
                                                                    "5. Phone security",
                                                                    "6. Change access codes",
                                                                    "0. Go Back to Settings Menu",
                                                                    "press a securitySettings to select other Security settings options: ");
                                                                    boolean ifInSecuritySettings = true;
                                                                    while(ifInSecuritySettings){
                                                                        int securitySettings = pressButton.nextInt();
                                                                          switch (securitySettings){
                                                                             case 1: System.out.printf("%s%n", "PIN code resquest");
                                                                                break;
                                                                             case 2: System.out.printf("%s%n", "Call barring service");
                                                                                break;
                                                                             case 3: System.out.printf("%s%n", "Fixed dialing");
                                                                                break;
                                                                             case 4: System.out.printf("%s%n", "Closed user group");
                                                                                break;
                                                                             case 5: System.out.printf("%s%n", "Phone security");
                                                                                break;
                                                                             case 6: System.out.printf("%s%n", "Change access codes");
                                                                                break;
                                                                             case 0: ifInSecuritySettings = false; System.out.printf("%s%n", "Back");
                                                                                break;
                                                                             default: System.out.printf("%s%n", "O_O not an option");
                                                                                break;
                                                                           }
                                                                     }
                                                                    break;
                                                                 case 4: System.out.printf("%s%n", "Restore factory settings");
                                                                    break;
                                                                 case 0: ifInSettings = false; System.out.printf("%s%n", "Go Back"); break;

                                                                 default: System.out.printf("%s%n", "O_O not an option");
                                                                    break;
                                                               }
                                                         }
                            break;
                         case 7:boolean ifInCallDivert = true;
                                  while(ifInCallDivert) { System.out.printf("%s%n%s%n%s","Call divert", "0. Go back","press 0 to go back: ");
                                                         int callDivert = pressButton.nextInt();
                                                          switch (callDivert){
                                                            case 0: ifInCallDivert = false; System.out.printf("%s%n", "Go back"); break;
                                                            default: System.out.printf("%s%n","O_O not an option"); 
                                                           }
                                  }
                            break;
                         case 8:boolean ifInGames = true;
                                  while(ifInGames) { System.out.printf("%s%n%s%n%s%n%s","Games", "0. Go back", "1. Snake II", "press 0 to go back: ");
                                                         int games = pressButton.nextInt();
                                                          switch (games){
                                                            case 1: System.out.printf("%s%n", "Snake II"); break;
                                                            case 0: ifInGames = false; System.out.printf("%s%n", "Go back"); break;
                                                            default: System.out.printf("%s%n","O_O not an option"); 
                                                           }
                                  }
                            break;
                         case 9:boolean ifInCalculator = true;
                                  while(ifInCalculator) { System.out.printf("%s%n%s%n%s","Calculator", "0. Go back","press 0 to go back: ");
                                                         int calculator = pressButton.nextInt();
                                                          switch (calculator){
                                                            case 0: ifInCalculator = false; System.out.printf("%s%n", "Go back"); break;
                                                            default: System.out.printf("%s%n","O_O not an option"); 
                                                           }
                                  }
                            break;
                         case 10: boolean ifInReminders = true;
                                  while(ifInReminders) { System.out.printf("%s%n%s%n%s","Reminders", "0. Go back","press button 0 to go back: ");
                                                         int reminders = pressButton.nextInt();
                                                          switch (reminders){
                                                            case 0: ifInReminders = false;  System.out.printf("%s%n", "back"); break;
                                                            default: System.out.printf("%s%n", "O_O not an option"); 
                                                           }
                                  }                  
                            break;
                         case 11: System.out.printf("%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s","Clock",
                                                       "1. Alarm clock",
                                                       "2. Clock settings",
                                                       "3. Date settings",
                                                       "4. Stopwatch",
                                                       "5. Countdown timer",
                                                       "6. Auto update of date and time",
                                                       "0. back",
                                                       "press a number to select other Clock options: ");
                                                        boolean ifInClockOption = true;
                                                        while(ifInClockOption) {
                                                            int clock = pressButton.nextInt();
                                                              switch (clock){
                                                                 case 1: System.out.printf("%s%n", "Alarm clock");
                                                                    break;
                                                                 case 2: System.out.printf("%s%n", "Clock settings");
                                                                    break;
                                                                 case 3: System.out.printf("%s%n", "Date settings");
                                                                    break;
                                                                 case 4: System.out.printf("%s%n", "Stopwatch");
                                                                    break;
                                                                 case 5: System.out.printf("%s%n", "Countdown timer");
                                                                    break;
                                                                 case 6: System.out.printf("%s%n", "Auto update of date and time");
                                                                    break;
                                                                 case 0: ifInClockOption = false; 
                                                                        System.out.printf("%s%n", "back");
                                                                    break;
                                                                 default: System.out.printf("%s%n", "O_O not an option");
                                                               }
                                                         }
                            break;
                         case 12:boolean ifInProfiles = true;
                                  while(ifInProfiles) { System.out.printf("%s%n%s%n%s","Profiles", "0. Back", "press 0 to go back: ");
                                                         int profiles = pressButton.nextInt();
                                                          switch (profiles){
                                                            case 0: ifInProfiles = false; System.out.printf("%s%n", "Go back"); break;
                                                            default: System.out.printf("%s%n","O_O not an option"); 
                                                           }
                                  }
                            break;
                         case 13:boolean ifInSIMservices = true;
                                  while(ifInSIMservices) { System.out.printf("%s%n%s%n%s","SIM services", "0. Back", "press 0 to go back:" );
                                                         int simServices = pressButton.nextInt();
                                                          switch (simServices){
                                                            case 0: ifInSIMservices = false; System.out.printf("%s%n", "Go back"); break;
                                                            default: System.out.printf("%s%n","O_O not an option"); 
                                                           }
                                  }
                            break;
                         case 0: inMenu = false;
                                          String powerOff = String.format("""
                __________________________  
                |                   3310 |
                |                        |
                |          NOKIA         |
                |________________________|
                |                        |
                |                        |
                |                        |
                |      G O O D B Y E     |
                |                        |
                |                        |
                |________________________|
                |                        |
                           menu           
                |                        |
                | power           <  >   |
                |                        |
                |    1              3    |
                            2             
                |    4              6    |
                            5             
                |    7              9    |
                            8             
                |                        |
                            0             
                |________________________|  """ 
                                               );
                                        System.out.println(powerOff); 
            
                            break;
                         default: System.out.printf("%s%n","O_O not an option");
                     }
            }

    }
}  
