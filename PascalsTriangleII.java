class PascalsTriangleII {
    public List<Integer> getRow(int rowIndex) {
        if (rowIndex == 0) {
            List<Integer> firstRow = new ArrayList<Integer>();
            firstRow.add(1);
            return (List)firstRow;
        }
        else if (rowIndex == 1) {
            List<Integer> secondRow = new ArrayList<Integer>();
            secondRow.add(1);
            secondRow.add(1);
            return (List)secondRow;
        }
        else {
            List<Integer> prevRow = new ArrayList<Integer>();
            prevRow.add(1);
            prevRow.add(1);
            List<Integer> result = new ArrayList<Integer>();
            for (int i = 2; i <= rowIndex; i++) {
                List<Integer> currRow = new ArrayList<Integer>();
                currRow.add(1);
                for (int j = 1; j < i; j++) {
                    currRow.add(prevRow.get(j-1) + prevRow.get(j));
                }
                currRow.add(1);
                prevRow = currRow;
            }
            result = prevRow;
            return result;
        }
    }
}