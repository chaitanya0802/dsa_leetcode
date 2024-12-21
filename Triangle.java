//https://leetcode.com/problems/triangle/description/?envType=problem-list-v2&envId=array

import java.util.List;

public class Triangle {

    public int minimumTotal(List<List<Integer>> triangle) {

        if (triangle == null || triangle.size()==0) return 0;

        for (int row = triangle.size() - 2; row >= 0; row--) {
            List<Integer> currentRow = triangle.get(row);
            List<Integer> nextRow = triangle.get(row + 1);

            for (int col = 0; col < currentRow.size(); col++) {
                currentRow.set(col, currentRow.get(col) + Math.min(nextRow.get(col), nextRow.get(col + 1)));
            }
        }

        return triangle.get(0).get(0);
    }
}