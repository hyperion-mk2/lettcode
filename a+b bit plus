class Solution {
    /*
     * param a: The first integer
     * param b: The second integer
     * return: The sum of a and b
     */
    public int aplusb(int a, int b) {
        // write your code here, try to do it without arithmetic operators.
        int and = a & b;
        int nor = a ^ b;
        while (and != 0){
            int nand = and<<1 & nor;
            int nnor = and<<1 ^ nor;
            and = nand;
            nor = nnor;
        }
        return nor;
    }
};
