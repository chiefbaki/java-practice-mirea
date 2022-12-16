package Exercise6;

import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class WordFile {
    private static String  getLine(String s) {
        Queue<String> toAdd = new ArrayDeque<>(Arrays.asList(s.split(" ")));
        Set<String> added = new HashSet<>();
        added.add(toAdd.peek());
        String ans = toAdd.remove();
        boolean wasAdded = true;
        while(!toAdd.isEmpty() && wasAdded){
            wasAdded = false;
            int position;
            for (position = 0; position < toAdd.size(); position++) {
                String cur = toAdd.remove();
                if(added.contains(cur))
                    continue;
                if(cur.startsWith(ans.substring(ans.length()-1).toLowerCase()) || cur.startsWith(ans.substring(ans.length()-1).toUpperCase())){
                    ans += " " + cur;
                    wasAdded = true;
                    added.add(cur);
                    break;
                }
                toAdd.add(cur);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String path = sc.nextLine();
        String s = "";
        try(FileReader fr = new FileReader(path)){
            int c;
            while((c = fr.read()) != -1)
                s += (char) c;
        }
        catch (IOException e){
            e.printStackTrace();
        }
        System.out.println(getLine(s));
    }
}
