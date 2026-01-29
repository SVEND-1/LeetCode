package org.example.testing;

import java.util.*;

public class Task   {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        List<Integer>[] graph = new ArrayList[n + 1];
        for (int i = 1;i <= n;i++){
            graph[i] = new ArrayList<>();
        }

        int[][] x = new int[m][2];

        for(int i = 0;i < m;i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            graph[a].add(b);
            graph[b].add(a);
            x[i][0] = a;
            x[i][1] = b;
        }

        int min = Integer.MAX_VALUE;
        for(int[] edge : x){
            int u = edge[0];
            int v = edge[1];

            int[] d = new int[n + 1];
            Arrays.fill(d, -1);
            Queue<Integer> queue = new LinkedList<>();
            d[u] = 0;
            queue.add(u);

            while(!queue.isEmpty()){
                int cur = queue.poll();
                for(int next : graph[cur]){
                    if(cur == u && next == v||
                            cur == v && next == u){
                        continue;
                    }
                    if(d[next] == -1){
                        d[next] = d[cur] + 1;
                        queue.add(next);
                    }
                }
            }

            if(d[v] != -1){
                min = Math.min(min,d[v] + 1);
            }
        }

        System.out.println(min == Integer.MAX_VALUE ? -1 : min);
    }
}