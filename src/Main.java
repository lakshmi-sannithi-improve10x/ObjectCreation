public class Main {
    public static void main(String[] args) {
        int a1= add(5,10);
        float a2 = add(2.5f,2.5f);
        System.out.println(a1);
        System.out.println(a2);
    }

    public static int add(int a, int b){
        return a + b;
    }

    public static float add(float a, float b){
        return a + b;
    }

}