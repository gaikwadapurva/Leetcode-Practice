class PascalsTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<List<Integer>>();
        List<Integer> firstRow = new ArrayList<Integer>();
        firstRow.add(1);
        triangle.add(firstRow);
        if (numRows >= 2) {
            List<Integer> prevRow = new ArrayList<Integer>();
            prevRow.add(1);
            prevRow.add(1);
            triangle.add(prevRow);
            if (numRows > 2) {
                for (int i = 3; i <= numRows; i++) {
                    List<Integer> currRow = new ArrayList<Integer>();
                    currRow.add(1);
                    for (int j = 1; j < i - 1; j++) {
                        currRow.add(prevRow.get(j-1) + prevRow.get(j));
                    }
                    currRow.add(1);
                    prevRow = currRow;
                    triangle.add((List)currRow);
                }
            }
        }
        return (List)triangle;
    }
}