class DefaultValues {
    static int staticVar;        // default 0
    int instanceVar;             // default 0
    boolean boolVar;             // default false
    char charVar;                // default null

    public static void main(String[] args) {
        DefaultValues obj = new DefaultValues();    //class name refarence variable= new class name();
        System.out.println("Static variable default: " + staticVar);//static variable doesnt initialized but local variable must be initialized 
        System.out.println("Instance variable default: " + obj.instanceVar);
        System.out.println("Boolean default: " + obj.boolVar);
        System.out.println("Char default: [" + obj.charVar + "]");
    }
}
