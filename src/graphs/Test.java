package graphs;

import java.util.Arrays;

public class Test {
	
	public static void main(String[] args) {
		
		int[][] am = new int[][] {{0, 8, 1, 2}, {0, 0, 0, 9}, {0, 0, 0, 5}, {0, 0, 0, 0}};
		
		Graph g = new Graph(am);
		
		System.out.println(Arrays.toString(g.getAdjacencyList()));
		
		
	}

}
