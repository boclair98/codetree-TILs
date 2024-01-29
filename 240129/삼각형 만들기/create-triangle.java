import java.util.Scanner;
public class Main {
    public static int n;
    public static int[] x = new int[100];
    public static int[] y = new int[100];
    public static int area(int i, int j, int k){
        return Math.abs((x[i]*y[j]+x[j]*y[k]+x[k]*y[i])-(x[j]*y[i] + x[k]*y[j]+x[i]*y[k]));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        for(int i = 0; i<n; i++){
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }
        int maxarea = 0;

        for (int i = 0; i<n; i++){
            for(int j = i+1; j<n; j++){
                for(int k = j+1; k<n; k++){
                    if((x[i]==x[j] || x[i]==x[k] || x[j]==x[k]) &&(y[i]==y[j] || y[i]==y[k] || y[j]==y[k])  ){
                        maxarea = Math.max(maxarea,area(i,j,k));
                    }

                }
            }
        }
        System.out.print(maxarea);
    }
}