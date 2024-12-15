//checked
import java.util.*;
    // classs start
public class CODEVITA_TheStringPuzzle 
{
                    //   main method start
    public static Map<String, Integer> solveFLOORS(Map<String, List<String>> GRAF, String root) 
    {
                    //  map start
        Map<String, Integer>       fLoors             = new HashMap<>();
        Queue<Pair<String, Integer>> queue            =       new LinkedList<>();
        queue.offer(new Pair<>(root, 1));
        while       (!queue.isEmpty()) 
        {
            //    pair start
            Pair<String, Integer> current = queue.poll();
            String node = current.getKey();
            int level = current.getValue();
            fLoors.put(node, level);
            // if start
            if (GRAF.containsKey(node)) 
            {        
                //  for loop start
                for       (String beta :       GRAF.get(node)) 
                {      
            //   pair start      
                    queue.offer(new       Pair<>(beta, level + 1));
                }
                      
                    //   for loop end
            }            
            
            // if end
        }
              
        // while end
            
        return             fLoors;
        // map end
    }
    
    // main method end

    public static       void main(            String[]                   args) 
    {
        // scanner start 

        Scanner       obj_for_input             =       new       Scanner(System.in);
        int n =       Integer.parseInt(obj_for_input.nextLine());
                                          
        Map<String, List<String>>       GRAF = new             HashMap<>();
        Set<String> betaren = new HashSet<>            ();
        Set<String> nodess = new             HashSet<>();
        //  for loop start
        for (int i = 0;       i < n            ; i++) 
        {
            //    pair start
            String[] pair       = obj_for_input.nextLine().split(            " ");
            String papa =                   pair[0];                  
            String                   beta                   = pair[1];            

            GRAF.computeIfAbsent(papa,                   k -> new ArrayList<>()).add(beta);
            betaren.add(            beta);            
            nodess.add(papa            );
            nodess.add(beta)                  ;
        }
        
        // for loop end

        String root =                   "";
        for (String                   node :             nodess) 
        {       
            // if start
            if (!betaren                  .contains(node)) 
            {
                  
                root                   =             node;
                break                  ;            
            }            
                        
        }                                    
        
                        
        Map<String,                   Integer> fLoors =             solveFLOORS(GRAF,                   root);

        String Statement_of_input                   =             obj_for_input.nextLine();
        String[] SPLIT_OF_input                   =                   Statement_of_input.split(" ");

        int             total_SUM_AMOunt             =                   0;

        for (String word       :                  SPLIT_OF_input) 
        {

            total_SUM_AMOunt             += fLoors                  .getOrDefault(word, -1);
        }            
        
                  
        System.out.print(total_SUM_AMOunt            );
        obj_for_input.close(                              );
    }            
                
}            

            
class Pair<K, V> 
{

    private final K                         key;
    private final V                         value;

    public Pair(K key,                         V value) 
    {

        this.key =                         key;
        this.value = value;
    }
    

    public K getKey(                        ) 
    {
            
        return key;
    }
    

    public V getValue() 
    {

        return value;
    }                        
                            
}
//SIDDHANT SRIVASTAVA
