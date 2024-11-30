// link: https://www.hackerrank.com/contests/codevita-9/challenges/form-alternating-string
import java.util.*;
        
    class CODEVITA_FormAlternatingString

    {
    
          public static void main(String[] args) 
      {
    
          Scanner        inputusingSC = new Scanner(System.in);
            String BiNsTr =         inputusingSC.next();
            int n = BiNsTr.length();
               List<Integer> lagat =          new ArrayList<>();
           for (int i =        0; i < n; i++) 
        {
          
                lagat.add(inputusingSC.nextInt());
        }                                
        System.out.print(         CalCostOfReMoVaLMin(BiNsTr, lagat));
        inputusingSC.close()     ;
        }       
       private static   int CalCostOfReMoVaLMin(String BiNsTr, List<Integer> lagat) 
       {      

             int         CosToFReMoVaL =       0;
           char     pichlaChar        = BiNsTr.charAt(0);
        int pichlalagat = lagat.get(0);
            for (int loop = 1    ; loop < BiNsTr.length(); loop++) 
           {
  
            char abhiVALAchar     = BiNsTr.charAt(loop);
            if (abhiVALAchar ==      pichlaChar) 
            {

                CosToFReMoVaL      += Math.min(pichlalagat,      lagat.get(loop));
                pichlalagat      = Math.max(    pichlalagat,     lagat.get(loop));
              } else 
            {
   
                pichlaChar      =         abhiVALAchar;
                pichlalagat      =      lagat.get(loop);
            }         
        }      
        return     CosToFReMoVaL;
    }      
}