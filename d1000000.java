import java.util.*;
public class d1000000 {
    public static void main(String[] args){
        Scanner S = new Scanner(System.in);
        int T = S.nextInt();
        while(T-- >0){
            int N = S.nextInt();
            PriorityQueue<Integer> queue = new PriorityQueue<>(N);
            int result = 0;
            for(int i=0;i<N;i++){
                queue.offer(S.nextInt());
            }
            while(!queue.isEmpty()){
                if(queue.poll() >= result+1) result++;
            }
            System.out.println("Case #:"+result);
        }
    }
}
