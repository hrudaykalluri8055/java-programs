class variable{
    int a=10;
    static int b=10;
    public static void main(String args[]){
        int c=10;
        variable obj = new variable();
        System.out.println("instance variable: " + obj.a);
        System.out.println("static variable: " + b);
        System.out.println("local variable: " + c);
    }
}
