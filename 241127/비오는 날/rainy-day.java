import java.util.*;
class weather{
    String date;
    String day;
    String we;
    public weather(String date, String day, String we){
        this.date = date;
        this.day = day;
        this.we = we;
    }
}
public class Main {
    public static weather w = new weather("9999-99-99","","");
    public static void main(String[] args) {
        
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        weather[] weather = new weather[n];
        for(int i = 0; i<n; i++){
            String date = sc.next();
            String day = sc.next();
            String we = sc.next();
            weather f = new weather(date,day,we);
            if(we.equals("Rain")){
                if(w.date.compareTo(f.date)>0){
                    w = f;
                }

            }

        }
        System.out.print(w.date+" "+w.day+" "+w.we);
        
    }
}