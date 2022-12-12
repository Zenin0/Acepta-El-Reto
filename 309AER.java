import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class unit {
    static class FastReader {

        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(
                    new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
        boolean hasNext() {
            if (st != null && st.hasMoreTokens()) {
                return true;
            }
            String tmp;
            try {
                br.mark(1000);
                tmp = br.readLine();
                if (tmp == null) {
                    return false;
                }
                br.reset();
            } catch (IOException e) {
                return false;
            }
            return true;
        }
    }

    public static void main(String[] args) {
        FastReader fr = new FastReader();
        int caso = fr.nextInt();
        boolean first = false;
        String line,b,c,res,op;
        int sum = 0;
        //// 2
        for (int i = 0; i < caso; i++) {
            line = fr.next();
            // 15
            while (!(line.equals("."))) {

                if (!first){
                    b = fr.next();
                    c = fr.next();
                    if (b.equals("+")){
                        sum=Integer.valueOf(line)+Integer.valueOf(c);
                        System.out.print(sum);
                    } else if (b.equals("-")){
                        sum=Integer.valueOf(line)-Integer.valueOf(c);
                        System.out.print(sum);
                    }               
                    first = true;
                } else {
                    b = fr.next();
                    if (line.equals("+")){
                        sum=Integer.valueOf(sum)+Integer.valueOf(b);
                        System.out.print(", " + sum);
                    } else if (line.equals("-")){
                        sum=Integer.valueOf(sum)-Integer.valueOf(b);
                        System.out.print(", " + sum);
                    }   
                }
                line = fr.next();
                ;

            }
            System.out.print("\n");
            first = false;
        }
    }
}