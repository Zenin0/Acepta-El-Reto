import java.util.Scanner;
public class unit {
    public static boolean BOT(int mat[], int n) {
        for (int i = 0; i < mat.length; i++) {
            if( mat[i] != mat[0]){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num;
        int arr[];
        while (sc.hasNext()) {
            num = sc.next();
            arr = new int[10];
            for (int i = 0; i < num.length(); i++) {
                arr[num.charAt(i)-48]++;
            }

            if (BOT(arr , arr[0])){
                System.out.print("no subnormal\n");
            }else{
                System.out.print("subnormal\n");
            }

        }
    }
}