import java.util.ArrayList;

public class demo{

    //define edge
    static class Edge{
        int src,des,wt;

        Edge(int src, int des, int wt){
            this.src = src;
            this.des = des;
            this.src = wt;
        }
    }



    public static void main(String[] args) { 
        //vertices 
        int V = 5;

        //declare graph
        ArrayList<Edge>[] graph = new ArrayList[V];

        //initialize graph with ArrayList for every element
        for(int i = 0; i<V; i++){
            graph[i] = new ArrayList<>();
        }

        //add edges
        graph[0].add(new Edge(0,1,1));
        graph[0].add(new Edge(0,2,1));

        graph[1].add(new Edge(1,3,1));

        graph[2].add(new Edge(2,0,1));

        graph[2].add(new Edge(2,4,1));

        graph[3].add(new Edge(3,1,1));

        graph[3].add(new Edge(0,1,1));

        graph[0].add(new Edge(0,1,1));


        //print neighbours of node 1
        for(int i = 0; i < graph[1].size(); i++){
            System.out.println(graph[1].get(i).des);
        }

    }
}