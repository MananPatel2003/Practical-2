class Adding_2_5 {
    static int add(int a, int b) {
        return a + b;
    }

    static double add(double a, double b) {
        return a + b;
    }
}

class Overloading {
    public static void main(String[] args) {
        System.out.println(Adding_2_5.add(27, 27));
        System.out.println(Adding_2_5.add(16.12, 27.03));
    }
}
