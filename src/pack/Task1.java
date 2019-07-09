package pack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Ariec on 09.07.2019.
 */
public class Task1 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String inStr1 = reader.readLine();
        String inStr2 = reader.readLine();
        HashMap<Character,Integer> inMapValue = calcSymbols(inStr1);
        inMapValue=withoutValue(inStr2,inMapValue);

        for (Map.Entry<Character, Integer> entry : inMapValue.entrySet()) {
            if (entry.getValue() == 0) {
                System.out.println(entry.getKey());
            }
        }
    }

    public static HashMap<Character,Integer> calcSymbols(String s){
        HashMap<Character,Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (map.containsKey(c)){
                map.put(c,map.get(c)+1);
            }else{
                map.put(c,1);
            }
        }
        return map;
    }

    public static HashMap<Character,Integer> withoutValue(String s, HashMap<Character,Integer> inMap){
        for (int i = 0; i <s.length() ; i++) {
            char cc=s.charAt(i);
            if(inMap.containsKey(cc)){
                inMap.put(cc, inMap.get(cc)-1);
            }else {
                inMap.put(cc,-1);
            }
        }
        return inMap;
    }
}
