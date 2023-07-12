import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    RoomChargeCalculator bill = new RoomChargeCalculator();
    
    int userinput;
    boolean balco, park, tv, kitc, wifi, ac, gard;
    int totalcost;

    Scanner userchoice = new Scanner(System.in);
    
    //display menu
    System.out.println("Room Charge Calculator");
    System.out.println("\n1. Delux-Double");
    System.out.println("2. Standard-Family");
    System.out.println("3. Standard-Single");
    System.out.println("4. Quit");

    //user's selection:
    System.out.print("\nEnter your choice (1-4) : ");
    userinput=userchoice.nextInt();
    
    /*
    switch(userinput){
      case 1 :System.out.println("You have selected : Delux-Double");
             break;
      case 2 :System.out.println("You have selected : Delux-Double");
             break;
      case 3 :System.out.println("You have selected : Delux-Double");
             break;
      case 4 :System.out.println("You have selected : Delux-Double");
             break;
      default :System.out.println("........INVALID INPUT........");
             break;
  
    }
     */
    //CONDITION 1
    if(userinput == 1){
      
      System.out.println("You have selected : Delux-Double option");
      System.out.println("\nStanded price :Rs 5000");
      System.out.println("Additional options ------ Available \nTo choose the additional options enter (True/False) :");

      System.out.print("Balcony : ");
      balco = userchoice.nextBoolean();
        
      System.out.print("Parking : ");
      park = userchoice.nextBoolean();
           
      System.out.print("Tv : ");
      tv = userchoice.nextBoolean();
             
      System.out.print("Kitchen : ");
      kitc = userchoice.nextBoolean();
             
      System.out.print("Wifi : ");
      wifi = userchoice.nextBoolean();

      //set value
      totalcost =bill.getChargeDeluxDouble(balco,park,tv,kitc,wifi);
      System.out.println("Total cost is : "+ totalcost );
      
    }
      //CONDITION 2
    else if(userinput == 2){
      
          System.out.println("You have selected : Standard-Family option");
          System.out.println("\nStanded price :Rs 3000");
          System.out.println("Additional options ------ Available \nTo choose the additional options enter (True/False) :");
            
          System.out.print("Parking : ");
          park = userchoice.nextBoolean();
  
          System.out.print("Kitchen : ");
          kitc = userchoice.nextBoolean();
                 
          System.out.print("Garden : ");
          gard = userchoice.nextBoolean();
    
          //set value
          totalcost =bill.getChargeStandardFamily(park,kitc,gard);
          System.out.println("Total cost is : "+ totalcost );
      
          }
      //CONDITION 3
          else if(userinput == 3){
            
                System.out.println("You have selected : Standard-Single option");
                System.out.println("\nStanded price :Rs 2000");
                System.out.println("Additional options ------ Available \nTo choose the additional options enter (True/False) :");
         
                System.out.print("Parking : ");
                park = userchoice.nextBoolean();
                     
                System.out.print("AC : ");
                ac = userchoice.nextBoolean();
                
                System.out.print("Wifi : ");
                wifi = userchoice.nextBoolean();
          
                //set value
                totalcost =bill.getChargeStandardSingle(park,ac,wifi);
                System.out.println("Total cost is : "+ totalcost );
      
                }

                else if(userinput == 4){

                       System.exit(0);
                       //EXITING THE PROGRAM
                       
                      }
                      else{
                        //DISPLAY AN ERROR MSG
                        System.out.println(".......System Error..\nI  N  V  A  L  I  D       I  N  P  U  T");
                      }

    
    
  }
}

//IT21144462-THARUSHA RANASINGHE