class variables {
    int a = 10;
    static int b = 10;

    public static void main(String args[]) {
        int c = 10;
        variables obj = new variables();
        obj.hi(10, 5, 4); // This passes 3 values
    }

    void hi(int a, int b, int c) {
        int res = a + b + c; // All three values are added
        System.out.print(res); // Output should be 19
    }
}
