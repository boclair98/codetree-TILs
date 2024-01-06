import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        String word2 =sc.next();
        int cnt = -2;
       
        for (int i = 0 ; i<word.length(); i++){
                if(i + word2 - 1 >= word)
                    continue;
                int tal = 0 ;
                for(int j = 0 ; j<word2.length(); j++){

                    if(word.charAt(i+j)==word2.charAt(j)){
                        tal++;
                        
                    }
                }
                if (tal == word2.length()){
                    cnt = i ;
                    break;
                }
            
        } 
        
        if (cnt>=0){
             System.out.print(cnt);
        }
        else{
             System.out.print(-1);
        }
        
    }
}