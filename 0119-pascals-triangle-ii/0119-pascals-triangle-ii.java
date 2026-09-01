class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> level = new ArrayList<>();
        int i = rowIndex;
        long c = 1;
        level.add((int)c);
        for(int j = 0; j <i ; j++) {
                    c = c * (i-j)/(j+1);
                    level.add((int)c);
            }

            return level;
    }
}