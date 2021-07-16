import java.util.ArrayList;
import java.util.Iterator;
import java.io.*;

public class devcoding3 {
	public static void main(String[] args) {
		int answer = -1;
		int wires[][] = { { 1, 3 }, { 2, 3 }, { 3, 4 }, { 4, 5 }, { 4, 6 }, { 4, 7 }, { 7, 8 }, { 7, 9 } };
		int n = 9;// 노드 개수

		ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
		graph.add(new <Integer>ArrayList());
		for (int i = 0; i < n; i++) {
			graph.add(new <Integer>ArrayList());
		}

		for (int i = 0; i < wires.length; i++) {
			int v1 = wires[i][0];
			int v2 = wires[i][1];

			graph.get(v1).add(v2);
			graph.get(v2).add(v1);
		}

		for (int i = 1; i <= wires.length; i++) {
			Iterator<Integer> iter = graph.get(i).iterator();
			System.out.print("[" + i + "]:");

			while (iter.hasNext()) {
				System.out.print(iter.next() + " ");

			}

			System.out.println("//" + graph.get(i).size());
		}

	}
}
