import java.util.*;
class Classroom{
    static class Edge {
        int src;
        int dest;
        int weight;

        public Edge(int s,int d,int w){
            this.src=s;
            this.dest=d;
            this.weight=w;
        }
    }
    static void cresteGraph(ArrayList<Edge>graph[]){
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<>();
        } 
        //0 vertex
        graph[0].add(new Edge(0,1,1));
        graph[0].add(new Edge(0,2,1));

        //1 vertex
        graph[1].add(new Edge(1,0,1));
        graph[1].add(new Edge(1,3,1));

        //2 vertex
        graph[2].add(new Edge(2,0,1));
        graph[2].add(new Edge(2,4,1));

        //3 vertex
        graph[3].add(new Edge(3,1,1));
        graph[3].add(new Edge(3,4,1));
        graph[3].add(new Edge(3,5,1));

        //4 vertex
        graph[4].add(new Edge(4,2,1));
        graph[4].add(new Edge(4,3,1));
        graph[4].add(new Edge(4,5,1));

        //5 vertex
        graph[5].add(new Edge(5,3,1));
        graph[5].add(new Edge(5,4,1));
        graph[5].add(new Edge(5,6,1));

        //vetex 6
        graph[5].add(new Edge(6,5,1));

    }
    public static void bfs(ArrayList<Edge>[]graph){   // as we use adjacency listO(V+E) || if we use matrix method O(V^2)
        Queue<Integer>q= new LinkedList<>();
        boolean visited[]=new boolean[graph.length];
        q.add(0);   //source=0
        while(!q.isEmpty()){
            int curr=q.remove();

            if(!visited[curr]) {
                System.out.print(curr+" ");
                visited[curr]=true;
                for(int i=0;i<graph[curr].size();i++){
                    Edge e=graph[curr].get(i);
                    q.add(e.dest);
                }
            }
        }
    }
    public static void main(String args[]){
         /*
             /1---------3 \
            /           |  \
           0            |   5------6
            \           |  /
              \2--------4 /

          */
          int V=7;
          @SuppressWarnings("unchecked")
          ArrayList<Edge>graph[]= new ArrayList[V];
          cresteGraph(graph);
          bfs(graph);
    }
}