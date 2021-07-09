package practice;

import java.util.*;
import java.util.Scanner;

public class Dictionary {

    Map<String, List<String>> dictionary = new HashMap<>();


    public void validateCommand(String[] input){
        String command = input[0];
        if(command.equals("ADD") ){
            // add validation
        }
        if(command.equals("KEYS")){
            // add validation
        }
    }

    public void add(String key,String value){
        if(!dictionary.containsKey(key)){
            dictionary.put(key,new ArrayList<>());
        }
        dictionary.get(key).add(value);
    }

    public void getKeys(){
        Set<String> getKeys = dictionary.keySet();
        for(String s:getKeys){
            System.out.println(s);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Dictionary dictionary = new Dictionary();
        while(true)
        {
            System.out.print("Enter command : ");
            String s = in.nextLine( );

            if(s.equals("")|s.equals("pl exit"))
            {
                break;
            }
            else
            {
                String[] commandValues = s.split(" ");
                dictionary.validateCommand(commandValues);
                switch (commandValues[0]){
                    case "ADD":
                        dictionary.add(commandValues[1],commandValues[2]);
                        return;
                    case "KEYS":
                        dictionary.getKeys();
                        return;
                    default:
                        System.out.println("Invalid command");
                }
            }
        }
    }
}
