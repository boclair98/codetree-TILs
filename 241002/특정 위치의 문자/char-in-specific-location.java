import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        char[] word = {'L','E','B','R','O','S'};
        char w = sc.next().charAt(0);
        int s = -1;

        for(int i = 0 ; i<6;i++){
            if(word[i]==w){
                s=i;
                break;
            }
        }
        if (s!=-1){
            System.out.print(s);
        }else{
            System.out.print("None");
        }
    }
}