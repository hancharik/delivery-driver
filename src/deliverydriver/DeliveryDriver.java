    /* for (int i = 1; i<= 10; i++){
             int d1 = (int) (Math.random() * 6) + 1;
             int d2 = (int) (Math.random() * 6) + 1;
             System.out.println(d1 + " " + d2);
         }*/
package deliverydriver;

import java.util.Scanner;
import java.util.Random;

public class DeliveryDriver {

    
    public static void main(String[] args) {
       
        Random randomNumbers = new Random(); // random number generator 
         Scanner in = new Scanner(System.in);
        
        //these are the three stats that affect the game the most.
        int driverZen = (int) (Math.random() * 20) + 10; //(10-30)How patient you are, keeps you from loosing money from leaving work early
        int driverFightAbility = (int) (Math.random() * 6) + 1; //(1-6)Keeps you from getting beaten and robbed
        int driverSpeed = (int) (Math.random() * 6) + 1; //(1-16)Faster drivers get more deliveries in a day
        int thugFightAbility = (int) (Math.random() * 6) + 1;
       
        
        
         int howManyYears = 1;
        
        
                
        int wins = 0;
        int losses = 0;
        double moneyEarned = 0;
        double moneyLost = 0;
        int totalDays = 0;
        int totalBeatings = 0;
        int totalGoHome = 0;
        int NotMuggings = 0;
        double totalAccumulatedDistance = 0;
        int days = 1;
        int years = days * 266;
        
        //int i = 0;
        System.out.println( "How many years do you want to simulate?" );
        howManyYears = in.nextInt();
        int totalYears = years * howManyYears;
        for ( int i = 1; i<= totalYears; i++)
        {
            
      
      
       
       
        double money = 0;
        int time = 1140; // number of minutes scheduled to work, 1040 is usual
        int runTime = 0;
        int totalRuns = 0;
        int totalTrip = 0;
        int totalTime = 0;
        int totalHours = totalTime / 60;
        int totalMins = totalTime % 60;
        double totalDistance = 0.00;
        double moneyStolen = 0;
        int muggings = 0;
        int anger = 0;
        int driverHealth = 0;
        int enemyHealth = 0 ;
        double runMoney = 0;
       
        System.out.println( "Zen: " + driverZen +"   Fighting Skill: "+ driverFightAbility + "   Speed: " + driverSpeed);
            
            while (time > totalTime && anger < driverZen) 
            {
             
             
             
             
             totalTrip++;
             
             
             
             
             System.out.println( "You have been at work for: " + totalHours + " hours and "+ totalMins + " minutes."   );
               if (anger > 20){
                  System.out.println( " You are in a bad mood " );//+ anger );  
                } else if (anger > 5){
                    System.out.println( " You are in a so-so mood ");//+ anger );
                }else{
                   System.out.println( " You are in a good mood "  );//+ anger );
                }
              int wait = (int) (Math.random() * 10) + 25; 
             
             System.out.println( " You get stuck mopping the floor for" + " " + wait + " minutes" ); 
             totalTime = totalTime + wait;
             int runAmount = (int) (Math.random() * 3) + 2;
             System.out.println( " You are leaving the store with " + runAmount + " deliveries" );
              String userInput = "";
                        //System.out.print( " Press any key to continue: " );
                        //userInput = in.next();
                        
            System.out.println( " We ride! " );
            //userInput = in.next();
            
            while (runAmount > 0)
                {
                        runAmount--;
                        totalRuns++;
                        double tip = (double) ((Math.random() * 200) + 1) / 100;
                        int legTime = (int) ((Math.random() * 10) + 7) - driverSpeed;
                        double deliveryDistance = (double) ((Math.random() * 600) + 1) / 100;
                       
                     
                        
                        int d1 = (int) (Math.random() * 23) + 1;
                        //int d3 = (int) (Math.random() * 20) + 19;
                        System.out.println( "       " );
                        System.out.println( "              Delivery #" + totalRuns +" : " );
                        System.out.print( "       " );
                        switch (d1)
                        {
                            case 1 : System.out.println( " You step in dog poo!" ); anger++; break;
                            case 2 : System.out.println( " You step in vomit!" ); anger++; break;
                            case 3 : System.out.println( " Strange smell in the hallway" ); anger++; break;
                            case 4 : System.out.println( " Customer doesn't answer the phone " ); anger++; time = time - 15; break;
                            case 5 : System.out.println( " You got a really good tip!" ); anger = anger - 3;  tip = tip + 4; break;
                            case 6 : System.out.println( " Elevator ride with drunken idiots!" ); anger++; break;
                            case 7 : System.out.println( " You got a good tip!" ); anger--;  tip = tip + 3; break;
                            case 9 : System.out.println( " Nice customer." ); anger--; break;
                            case 10 : System.out.println( " Giant party, no one knows who ordered!" ); anger++; time = time - 20; break;
                            case 11 : System.out.println( " You got a $5 tip!" ); anger = anger - 2;   tip = 5; break;
                            case 12 : System.out.println( " Three red lights in a row!" ); anger++; break;
                            case 13 : System.out.println( " You almost kill a jaywalker!" ); anger++; break;
                            case 14 : System.out.println( " Giant party, no one knows who ordered!" ); anger++; time = time - 20; break;
                            case 15 : System.out.println( " Place was easy to find." ); anger--; break;
                            case 16 : System.out.println( " You step in dog poo!" ); anger++; break;
                            case 17 : System.out.println( " You step in vomit!" ); anger++; break;
                            case 18 : System.out.println( " Strange smell in the hallway" ); anger++; break;
                            case 19 : System.out.println( " Customer doesn't answer the phone " ); anger++; time = time - 15; break;
                            case 20 : System.out.println( " Place was easy to find." ); anger--; break;
                            case 21 : System.out.println( " Elevator ride with drunken idiots!" ); anger++; break;
                            case 22 : System.out.println( " You got a good tip!" ); anger--;  tip = tip + 3;  break;
                            case 23 :  thugFightAbility = (int) (Math.random() * 6) + 1;
                                
                                if(driverFightAbility < thugFightAbility){
                                
                                System.out.println( " You get jumped, lose all your money!" ); moneyStolen = moneyStolen + money; anger = anger + 5; time = time - 20; money = 0; muggings++; break;
                            }else{
                               System.out.println( " You get jumped, but fight off the attacker!" ); anger--; NotMuggings++; break;
                            }
                                case 24 : thugFightAbility = (int) (Math.random() * 6) + 1;
                                    
                                    if(driverFightAbility < thugFightAbility){
                                    System.out.println( " You get jumped, but you dropped your money at the store!" ); anger = anger + 2; time = time - 20; tip = 0; muggings++; break;
                              }else{
                                  System.out.println( " You get jumped, but fight off the attacker!" ); anger--; NotMuggings++; break;  
                                }
                            
                        }
                        
                        System.out.print( "       tip: $" );
                        System.out.printf( "%.2f", tip );
                        System.out.print( ", " + legTime + " minutes, " );
                        System.out.printf( "%.2f", deliveryDistance );
                        System.out.println( " miles." );
                        runMoney = runMoney + tip;
                        totalDistance = totalDistance + deliveryDistance;
                        money = money + tip;
                        runTime = runTime + legTime;
                        time = time - legTime;
                        totalTime = totalTime + legTime;
                       /* System.out.println( " Back at the store." );
                        System.out.println( "That run took " + runTime + " minutes." );
             totalTime = totalTime + runTime;
             totalHours = totalTime / 60;
             totalMins = totalTime % 60;
             
             
                time = time - runTime;
                runTime = 0;
                */
            }  
        
            System.out.println( "       ...back at the store..." );
            System.out.print( " (that run got you " );
            System.out.printf( "%.2f", runMoney );
            System.out.println( " dollars in " + runTime + " minutes)." );
             totalTime = totalTime + runTime;
             totalHours = totalTime / 60;
             totalMins = totalTime % 60;
             
          
                time = time - runTime;
                runTime = 0;
                money = money + runMoney;
                runMoney = 0;
            }
       System.out.println( "Zen: " + driverZen + "   Fighting Skill: "+ driverFightAbility + "   Speed: " + driverSpeed + "    Thug Skill: "+ thugFightAbility);
        if (anger >= driverZen){
            System.out.println( " Due to a bad attitude, you left the store after " + totalHours + " hours and "+ totalMins + " minutes."   );
            System.out.println( " anger is at: " + anger + " (zen: " + driverZen + ")" );
            
            totalGoHome++;
        }else{
            System.out.println( "You made it through your shift of " + totalHours + " hours and "+ totalMins + " minutes."   );
            System.out.println( " anger is at: " + anger + " (zen: " + driverZen + ")" );
    }       
      
       
       
       double gasPrice = 3.85;
       double averageDistance = ( totalDistance / totalRuns );
       double totalFuel = (totalDistance / 19.5);
       double totalFuelCost = (totalFuel * gasPrice);
       double takeAfterFuel = (money - totalFuelCost);
       double averageTime = (totalTime / totalTrip);
       double averagePer = money / (double)totalRuns;
       double averagePerHour = (double)takeAfterFuel / (double)totalHours;
       double runAverage = (double)(totalRuns / totalTrip);
       
       
       System.out.print( "Today you made $" ); 
       System.out.printf( "%.2f", money );
       System.out.println(  " dollars on " + totalRuns + " total deliveries" );
       System.out.print( "Your average tip was $" );
       System.out.printf( "%.2f", averagePer  );
       System.out.println( " on " + totalTrip + " runs in " + totalHours + " hours and "+ totalMins + " minutes." );
       System.out.print( "You made $" );
       System.out.printf( "%.2f", averagePerHour );
       System.out.println( " per hour on a " + runAverage + "-bagger paced day." );
       System.out.print( "You drove " );
       System.out.printf( "%.2f", totalDistance );
       System.out.print( " miles and spent $");
       System.out.printf( "%.2f", totalFuelCost );
       System.out.println( " on gas." );
       System.out.print( "You lost $");
       System.out.printf( "%.2f", moneyStolen );
       System.out.println( " from " + muggings + " vicious beatings.");
      // System.out.println( "Each run averaged " + averageTime  + " minutes." );
      //System.out.printf( "You averaged " + "%.2f", averagePer + " per delivery" );
       totalAccumulatedDistance = totalAccumulatedDistance + totalDistance;
       if (money > 80){
           System.out.println( "" );
           System.out.println( "           You win!" ); wins++; 
       }else{
           System.out.println( "" );
           System.out.println( "           You loose!" ); losses++;
       }
       moneyEarned = moneyEarned + takeAfterFuel;
       moneyLost = moneyLost + moneyStolen;
       totalDays++; 
       totalBeatings = totalBeatings + muggings;
      
    }
        double daysGoHome = (double)totalGoHome / (double)totalDays; 
        double dailyBeatings = (double)totalBeatings / (double)totalDays;
        double winRatio = ((double)NotMuggings / ((double)NotMuggings + (double)totalBeatings)) * 100 ;
        double dollarsPerMile = moneyEarned / totalAccumulatedDistance; 
        double netEarnings = (moneyEarned / (totalDays / 266)) - (((totalAccumulatedDistance / 19) * 3.85)/(totalDays / 266) );
        double taxes = netEarnings * .17;
        
        System.out.println( "");
        System.out.println( "Zen: " +driverZen +"   Fighting Skill: "+ driverFightAbility + "   Speed: " + driverSpeed + "    Thug Skill: "+ thugFightAbility);
        System.out.print( "Over " + totalDays / 266  );
        System.out.println( " years, you won: " + wins + " times and you lost: " + losses + " times.");
        System.out.print( "You earned $" );
        System.out.printf( "%.2f", moneyEarned );
        System.out.print( " total, which is: $");
        System.out.printf( "%.2f",  moneyEarned / totalDays );
        System.out.print( " per day, $");
        System.out.printf( "%.2f",  moneyEarned / (totalDays / 266) );
        System.out.println( " per year.");
        System.out.print( "You lost $" );
        System.out.printf( "%.2f",  moneyLost );
        System.out.print( " total, or an additional: $");
        System.out.printf( "%.2f", moneyLost / totalDays );
        System.out.print( " per day, $");
        System.out.printf( "%.2f",  moneyLost / (totalDays / 266) );
        System.out.println( " per year,");
        System.out.print( "from being viciously attacked and robbed " + totalBeatings + " times, or about: ");
        System.out.printf( "%.2f", dailyBeatings * 100 );
        System.out.println( "% of your shifts.");
        System.out.print( "You fought off " + NotMuggings + " attackers, with a win ratio of ");
        System.out.printf( "%.2f", winRatio );
        System.out.println( "%.");
        System.out.print( "You were so disgusted that you left the store early " + totalGoHome + " times, or ");
        System.out.printf( "%.2f", daysGoHome * 100 );
        System.out.println( "% of the time.");
        System.out.print( "You drove a total of ");
        System.out.printf( "%.2f", totalAccumulatedDistance );
        System.out.print( " miles, spending $");
        System.out.printf( "%.2f", ((totalAccumulatedDistance / 19) * 3.85)/(totalDays / 266) );
        System.out.print( " dollars per year on gas. that's ");
        System.out.printf( "%.2f", totalAccumulatedDistance / totalDays );
        System.out.print( " miles per day, and made $");
        System.out.printf( "%.2f", dollarsPerMile );
        System.out.println( " dollars per mile.");
        System.out.print( "your annual salary: $" );
        System.out.printf( "%.2f", netEarnings - taxes );
        System.out.println( " after gas and taxes.");
        
        
    }
}
