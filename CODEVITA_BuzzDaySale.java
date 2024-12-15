// checked
import java.util.*;
           
public class CODEVITA_BuzzDaySale                       
{         

    public static void main(String[]                       args)                       
    {         

        Scanner obj_for_input = new Scanner(System                      .in);

        int n = obj_for_input.nextInt(                                 );
        int[] ids = new int[n];
        int[] price = new int[n];

        // IDs dekho
        for (int i = 0; i < n; i++                      )                       
        {         

            ids[i] = obj_for_input.nextInt(                      );
                    
        }


        // price dekho
        for (int i = 0; i < n;                       i++)                       
        {         

            price[i] = obj_for_input                      .nextInt();
                    
        }


        int budget = obj_for_input                      .nextInt();
        int zadaItems = 0;
        int zadaWeight                       = 0;

        for (int i = 0;                       i < n; i++)                       
        {         

            int lagat                       = price[i];
            int kitna                       = budget / lagat;

            if (kitna >                       0)                       
            {         

                int abhiFactorItems                       = 0;
                int currentFactorWeight =                       0;

                for (int j = 0; j                       < n; j++)                       
                {         

                    if (i != j &&                       ids[i]                       % ids[j] == 0)                       
                    {         

                        abhiFactorItems +=                       kitna;
                        currentFactorWeight                       += price[j] * kitna;
                                
                    }
                      
                            
                            }
                                                           

                // 
                if (abhiFactorItems > zadaItems || 
                   (abhiFactorItems == zadaItems &&                                  currentFactorWeight > zadaWeight))                       
                   {         

                    zadaItems = abhiFactorItems;
                    zadaWeight = currentFactorWeight                                 ;
                                       
                }

                        
                        }

                    
                    }


        System.out.print(zadaItems                                  + " " +                       zadaWeight);
        obj_for_input.close()                      ;
                           
    }
                      
                                  
            }

// SIDDHANT SRIVASTAVA
