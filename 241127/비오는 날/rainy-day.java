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
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        weather[] weather = new weather[n];
        for(int i = 0; i<n; i++){
            String date = sc.next();
            String day = sc.next();
            String we = sc.next();
            weather[i] = new weather(date,day,we);
        }
        weather[] s = new weather[n];
        int idx = 0 ;
        for(int i = 0; i<n; i++){
            if(weather[i].we.equals("Rain")){
                s[idx++] = weather[i];
            }
        }
        int idx2 = 0;
        for(int i = 1 ; i<idx; i++){
            if(s[i].date.compareTo(s[idx2].date)>0){
                idx2 = i ;
            }
        }
        System.out.print(weather[idx2].date+" "+weather[idx2].day+" "+weather[idx2].we);
    }
}