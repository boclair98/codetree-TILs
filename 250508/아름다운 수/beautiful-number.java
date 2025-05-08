import java.io.*;
import java.util.*;

public class Main {
    static int k,n;
    static boolean[] visited;
    static List<Integer> list = new ArrayList<>();
    static int[] num = new int[]{1,2,3,4};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        visited = new boolean[n];
        DFS(0);
        System.out.println(k);
    }

    private static void DFS(int idx) {
        if(idx == n){
            if(check(list)){
                k++;
//                System.out.println(list);
            }
            return;
        }
        for(int i = 1; i<=4; i++){
            list.add(i);
            DFS(idx+1);
            list.remove(list.size()-1);
        }
    }

    private static boolean check(List<Integer> list) {
        int start = 0;
        visited = new boolean[list.size()];
        for(int i = 0; i<list.size(); i++){
            if(!visited[i]){
                if(list.get(i) == 2){
                    if(i+1 < list.size()){
                        if(list.get(i+1) == 2){
                            visited[i] = true;
                            visited[i+1] = true;
                        }else{
                            return false;
                        }
                    }else{
                        return false;
                    }
                }else if(list.get(i) == 3){
                    if(i+2 < list.size()){
                        if(list.get(i+1) == 3 && list.get(i+2) == 3){
                            visited[i] = true;
                            visited[i+1] = true;
                            visited[i+2] = true;
                        }else{
                            return false;
                        }
                    }else{
                        return false;
                    }
                }else if(list.get(i) == 4){
                    if(i+3 < list.size()){
                        if(list.get(i+1) == 4 && list.get(i+2) ==4 && list.get(i+3) == 4){
                            visited[i] = true;
                            visited[i+1] = true;
                            visited[i+2] =true;
                            visited[i+3] = true;
                        }else{
                            return false;
                        }
                    }else{
                        return false;
                    }
                }
            }
        }
        return true;
    }


}
