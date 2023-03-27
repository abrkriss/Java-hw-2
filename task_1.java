import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.io.*;

class lesson_5{
    public static Map <String, String> directory = new HashMap<>();


    public static void AddContact(String name, String phone){
        directory.put(name, phone);
    }


    public static void PrintAll(){
        System.out.println("All contacts: ");
        for(Map.Entry<String, String> k:directory.entrySet()){
            System.out.println(k.getKey()+": "+ k.getValue());
            
        }
    }




public static void main(String[] args) throws IOException{
    String act;
    System.out.println("Для добавление контакта введите 1, для просмотра всего 2");
    BufferedReader bf  = new  BufferedReader(new InputStreamReader(System.in));
    act = bf.readLine();
    
    
    while(!act.equals("2")){
    if (act.equals("1")){
        System.out.println("Введите фамилию:");
        String name = bf.readLine();
        System.out.println("Введите телефон:");
        String phone = bf.readLine();
        AddContact(name, phone);
    }
    System.out.println("Для добавление контакта введите 1, для просмотра всего 2");
    act = bf.readLine();

    if (act.equals("2")){
        PrintAll();
        break;
    }}
    }

   
}