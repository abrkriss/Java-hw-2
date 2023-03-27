
import java.util.HashMap;
import java.util.Map;


public class task_2 {

    public static void main(String[] args) throws Exception {
        
        String[] name = {"Иван","Светлана","Кристина","Анна","Анна","Иван","Петр","Павел","Петр","Мария","Марина","Мария","Мария","Марина","Анна","Иван","Петр","Иван"};
        HashMap <String, Integer> counter = new HashMap<String, Integer>();
        for(String i : name){
            Integer newVal = counter.getOrDefault(i, 0)+1;
            counter.put(i, newVal);
        }
        counter.entrySet().stream()
        .sorted(Map.Entry.<String, Integer>comparingByValue().reversed()) 
        .forEach(System.out::println); 

    }
    
}


    
    
