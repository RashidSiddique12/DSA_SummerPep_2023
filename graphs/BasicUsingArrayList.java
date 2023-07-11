import java.util.ArrayList;

public class BasicUsingArrayList {

    public static void addEle(ArrayList<ArrayList<Integer>> adj, int u, int v) {
        adj.get(u).add(v);
        adj.get(v).add(u);
    }

    public static void print(ArrayList<ArrayList<Integer>> adj) {
        for (int i = 1; i < adj.size(); i++) {
            System.out.print("head " + i + " : ");
            for (int j = 0; j < adj.get(i).size(); j++) {
                System.out.print("-> " + adj.get(i).get(j));

            }
            System.out.println();

        }
    }

    public static void main(String[] args) {
        int V = 7;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>(V);

        for (int i = 0; i <= V; i++) {
            adj.add(new ArrayList<Integer>());
        }

        addEle(adj, 1, 2);
        addEle(adj, 1, 4);
        addEle(adj, 2, 3);
        addEle(adj, 2, 4);
        addEle(adj, 2, 7);
        addEle(adj, 3, 6);
        addEle(adj, 3, 5);
        addEle(adj, 4, 5);
        addEle(adj, 6, 7);

        print(adj);

    }
}
