import java.util.ArrayList;

public class PerfectSquares {

	public static void main(String[] args) {
		System.out.println(numSquares(24));
	}

	public static int numSquares(int num) {
		ArrayList<Integer> PerfectSquares = findPerfectSquares(num);
		ArrayList<Integer> minList = new ArrayList<Integer>();
		int min = 0;
	
		if (num < 4)
			return num;
		if (num == 4)
			return 1;
	
		for(int i=1; i<PerfectSquares.size(); i++) {
			int tmp = num;
			int minSquare = 0;

			int j = i;
			while(num>0) {
				if (num>=PerfectSquares.get(j)) {
					num = num - PerfectSquares.get(j);
					minSquare++;
				}
				if(num<PerfectSquares.get(j)) {
					j--;
				}
			}

			num = tmp;
			minList.add(minSquare);
			// System.out.println(minSquare);
		}
		for (int i=0; i<minList.size(); i++) {
			min = minList.get(0);
			if (minList.get(i) < min)
				min = minList.get(i);
		}
		return min;
	}


	public static ArrayList<Integer> findPerfectSquares(int n) {
		ArrayList<Integer> list = new ArrayList<Integer>(); 
		for (int i=1; i*i<n; i++) {
			list.add(i*i);
		}
		return list;
	}
}   