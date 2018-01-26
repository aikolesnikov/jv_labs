class Demo {
    private static int count;
    public static void main(String [] args) {
        System.out.println(increment());
    }
    static int increment() {
        return ++count;
    }
}


