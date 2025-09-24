class casting{
    public static void main(String[] args) {
        int a = 10;
        double b=a;
        System.out.println("implicit casting int to double: " + b);
        double c=80.55;
        int d = (int)c;
        System.out.println("Explicit casting double to int: " + d);
    }
}