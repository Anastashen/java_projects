public class task_2 {
    public static void main(String[] args) {
        for (int a = 2; a <= 1000; a++) {
            Integer c = a;
            for (int b = 2; b < a; b++) {
                if (a % b == 0) {
                    c = null;
                    break;
                }
            }
            if (c != null) {
                System.out.println(c);
            }
        }
    }

}
