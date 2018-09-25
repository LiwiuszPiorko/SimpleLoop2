public class Loop2 {

    public static void main(String[] args) {

        int suma = 0;
        for (int i = 0; i < 101; i++) {
            if (i % 2 == 0) {
                suma = suma + i;
                System.out.println(i);
            }
        }
        System.out.println(suma);
    }
}











