import java.util.Scanner;
public class Main {
    public static int n1,n2;
    public static int[] a = new int[100];
    public static int[] b = new int[100];
    public static boolean issame(int n){
        for(int i = 0 ; i<n2; i++){
            if (a[i+n] != b[i]){
                return false;
            }
        }
        return true;
    }
    public static boolean didi(){
        for (int i = 0 ; i<= n1-n2; i++){
            if (issame(i)){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        n1 = sc.nextInt();
        n2 = sc.nextInt();

        for(int i = 0 ; i<n1; i++){
            a[i] = sc.nextInt();

        }

        for(int i = 0 ; i<n2; i++){
            b[i] = sc.nextInt();
        }

        if (didi()){
            System.out.print("Yes");
        }
        else{
            System.out.print("No");
        }
    }
}