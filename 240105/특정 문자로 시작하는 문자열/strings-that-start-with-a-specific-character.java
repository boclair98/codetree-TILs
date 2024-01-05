import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] word = new String[20];
        int tal = 0 ;
        int val = 0 ;
        for(int i = 0 ; i<n; i++){
            word[i] = sc.next();
        }
        char car = sc.next().charAt(0);

        for (int i = 0 ; i<n; i++){
            if (word[i].charAt(0) == car){
                tal++;
                val = word[i].length()+val;
            }
        }
        double aver = (double) val / tal;

        System.out.printf("%d %.2f",tal,aver);
    }
}