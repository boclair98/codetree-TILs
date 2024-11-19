public class Main {
    public static void star(){
        for (int i = 0; i<10; i++){
            System.out.print("*");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        int count = 0;
        while(count<5){
            star();
            count++;
        }


    }
}