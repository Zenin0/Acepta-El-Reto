import java.util.Scanner;

public class unit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int casos = sc.nextInt();
        String fecha;
        boolean done = false;
        int tabla[][];
        while (casos != 0) {
            tabla = new int[13][32];
            for (int i = 0; i < casos; i++) {
                fecha = sc.next();
                String[] strArray = fecha.split("/");
                int[] intArray = new int[strArray.length];
                for (int j = 0; j < strArray.length; j++) {
                    intArray[j] = Integer.parseInt(strArray[j]);
                }
                tabla[intArray[1]][intArray[0]]++;
                if (tabla[intArray[1]][intArray[0]] >= 2) {
                    done = true;
                    //break;
                }
            }
            if (done) {
                System.out.print("SI\n");
            } else {
                System.out.print("NO\n");
            }
            done = false;
            casos = sc.nextInt();
        }
    }
}