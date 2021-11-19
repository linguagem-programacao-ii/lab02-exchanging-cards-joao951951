import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.Scanner;

public class Cards{

    public static void main(String[] args){
        Scanner key = new Scanner(System.in);
        String line;
        int cards, cards1;
        while (!(line = key.nextLine()).equals("0 0")){
            cards = 0;
            cards1 = 0;
            Set<String> line1 = new HashSet<>(Arrays.asList(key.nextLine().split(" ")));
            Set<String> line2 = new HashSet<>(Arrays.asList(key.nextLine().split(" ")));
            for (Iterator<String> iterator = line1.iterator(); iterator.hasNext();) {
                String a = iterator.next();
                if(!line2.contains(a)){
                    cards += 1;
                }else{
                    cards += 0;
                }
            }
            for (Iterator<String> iterator = line2.iterator(); iterator.hasNext();){
                if(!line1.contains(iterator.next())){
                    cards1 += 1;
                }else{
                    cards1 += 0;
                }
            }
            if(cards > cards1){
                System.out.println(cards1);
            }else
                System.out.println(cards);
        }
    }

}