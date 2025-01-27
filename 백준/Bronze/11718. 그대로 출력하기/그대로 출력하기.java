import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> s = new ArrayList<>();
        while(sc.hasNextLine()){
            String string = sc.nextLine();
            s.add(string);
            if(string.isEmpty()){
                break;
            }
        }
        for(int i=0;i<s.size();i++){
            System.out.println(s.get(i));
        }
    }
}