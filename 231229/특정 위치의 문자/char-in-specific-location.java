import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        char n = sc.next().charAt(0);
        char[] chr = new char[]{'L','E','B','R','O','S'};
        int tal = -1 ;
        for(int i = 0 ; i<6; i++){
            if(chr[i] == n){
                tal = i;
            }
        }
        if(tal>=0){
            System.out.print(tal);
        }
        else{
            System.out.print("None");
        }
    }
}