import java.util.*;

public class PunchedCards {
    public static void main(String[] args){
        Scanner S = new Scanner(System.in);
        int T = S.nextInt();
        while(T-->0){
            int n = S.nextInt();
            int m = S.nextInt();
            printCard(n,m);
        }
    }
    static void printCard(int n, int m){
        int N = 2*n+1;
        int M = 2*m+1;
        System.out.println();
        for(int i = 0;i<N;i++){
            StringBuilder sb = new StringBuilder();
            for(int j = 0;j<M;j++){
                if((i==0 || i== 1 )&& (j==0 || j==1)){
                    sb.append(".");
                    continue;
                }
                if(i%2 == 0){
                    if(j%2 == 0){
                        sb.append("+");
                    }else{
                        sb.append("-");
                    }
                }else{
                    if(j%2==0){
                        sb.append("|");
                    }else{
                        sb.append(".");
                    }
                }
            }
            System.out.println(sb);
        }
    }
}
