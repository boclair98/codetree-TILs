import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] num = new int[201];
        String[] word = new String[201];
        int cur = 100;
        int right = 0 ;
        int left = 0 ;
        int start = 1 ;
        for(int i = 0 ; i<n ; i++){
            int k = sc.nextInt();
            char k1 = sc.next().charAt(0);

            if (k1 == 'R'){
                right = cur + k;
                left = cur;
                cur = right;
                for (int j = left; j<right; j++){
                    num[j]=start;
                    start++;
                    word[j] = "Black";
                    if (start  > 4){
                        start = 1;
                    }
            }

            }

            if(k1 == 'L'){
                right = cur  ;
                left =  cur - k;
                cur = left;
                for (int z = left; z<right; z++){
                    num[z]=start;
                    start++;
                    word[z] = "White";
                    if (start  > 4){
                        start = 1;
                    }
            }
            }
            
            
        }
        int cnt = 0 ;
        for(int i =0; i<201; i++){
            //num[i] = num[i] % 4;
            if (num[i]==0){
                word[i] ="gray";
            }

            
            
        }
        // for (int i = 0 ; i<201; i++){
        //     System.out.print(num[i]+" ");
        // }
        int wh = 0 ;
        int bl = 0 ;
        int gr = 0;

        for (int i = 0 ; i<201; i++){
            if (word[i]=="White"){
                wh++;
            }
            if (word[i]=="Black"){
                bl++;
            }
            if (word[i]=="gray"){
                gr++;
            }
        }
        System.out.print(wh+" "+bl+" "+gr);
        

    }
}