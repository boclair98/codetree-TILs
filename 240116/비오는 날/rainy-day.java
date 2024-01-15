import java.util.Scanner;
class oneday{
    String time;
    String day;
    String weather;

    public oneday(String time, String day, String weather){
        this.time = time;
        this.day = day;
        this.weather = weather;
    }
}
public class Main {
    public static oneday ans = new oneday("9999-99-99", "", "");
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        
        
       
        for(int i = 0 ; i<n; i++){
            String time = sc.next();
            String day = sc.next();
            String weather = sc.next();
            oneday f = new oneday(time,day,weather);
            if (weather.equals("Rain")){
                
                if (ans.time.compareTo(f.time)>0){
                    ans = f;
                }
            }
        }

        
        System.out.print(ans.time+" "+ans.day+" "+ans.weather);
    }
}