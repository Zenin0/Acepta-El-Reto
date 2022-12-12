import java.util.*;

public class unit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Character> now;
        String entry;
        int indice;
        while (sc.hasNext()) {
            entry = sc.nextLine();
            indice = 0;
            now = new ArrayList<>();
            for (int i = 0; i < entry.length(); i++) {
                switch (entry.charAt(i)) {
                    case '-':
                        indice = 0;
                        break;
                    case '*':
                        indice++;
                        break;
                    case '3':
                        if (!now.isEmpty() && indice < now.size())
                            now.remove(indice);
                        break;
                    case '+':
                        if (now.isEmpty())
                            indice = 0;
                        else
                            indice = now.size();
                        break;
                    default:
                        if (indice > now.size()) {
                            if (!now.isEmpty())
                                indice = now.size();
                            else
                                indice = 0;
                        }
                        now.add(indice++, entry.charAt(i));
                }
            }

            for (Character c : now) 
                System.out.print(c + "");
            System.out.print("\n");
        }

    }
}