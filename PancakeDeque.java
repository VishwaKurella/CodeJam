import java.util.*;

public class PancakeDeque {
    public static void main(String[] args){
        Scanner S = new Scanner(System.in);
        int T = S.nextInt();
        int c = 1;
        while(T-->0){
            int N = S.nextInt();
            Deque<Integer> queue = new ArrayDeque<>(N);
            for(int i = 0;i<N;i++) {
                queue.add(S.nextInt());
            }
            int count = 0;
            int last = Integer.MIN_VALUE;
            while(!queue.isEmpty()){
                if(queue.peekFirst()<=queue.peekLast()){
                    if(queue.peekFirst()>=last) {
                        count++;
                    }
                    last = Math.max(last,queue.pollFirst());
                }else{
                    if(queue.peekLast()>=last){
                        count++;
                    }
                    last = Math.max(last,queue.pollLast());
                }
            }
            System.out.println("Case #"+(c++)+": "+count);
        }
    }
}
