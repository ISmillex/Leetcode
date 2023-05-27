import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        
        ArrayList<Integer> prev = new ArrayList<>();

        prev.add(1);
        list.add(prev);

        for (int i=1; i<numRows; i++) {
            ArrayList<Integer> curr = new ArrayList<>();
            curr.add(1);
            for (int j=0; j<prev.size()-1; j++) {
                curr.add(prev.get(j) + prev.get(j+1));
            }
            curr.add(1);
            list.add(curr);
            prev = curr;
        }

        return list;
    }
    public static void main(String[] args) {
        PascalTriangle p = new PascalTriangle();

        System.out.println(p.generate(5));
    }
}