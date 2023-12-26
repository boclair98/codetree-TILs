import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        
        for(int i = 1; i<=19; i++){
            for(int k = 1; k<=19; k++){
                if(k%2==0 || k ==19){
                    System.out.println(i+" * "+k+" = "+(i*k));
                }
                else{
                    System.out.print(i+" * "+k+" = "+(i*k)+" / ");
                }
            }
        }
    }
}