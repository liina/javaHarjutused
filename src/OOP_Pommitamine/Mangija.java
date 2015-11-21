package OOP_Pommitamine;

import java.util.Scanner;

/**
 * Created by labner on 21.11.15.
 */
public class Mangija {
    private Scanner sc = new Scanner(System.in);
    public int[] kysiLask() {
        System.out.println("Sisesta koordinaadid xxx-yyy");
        String[] sisend = sc.nextLine().split("-");
        int x = Integer.parseInt(sisend[0]);
        int y = Integer.parseInt(sisend[1]);
        return new int[] {x,y};
    }

    public void pihtas() {
        System.out.println("pihtas");
    }

    public void moodas() {
        System.out.println("möödas");
    }
    public void gameover() {
        System.out.println("kõik!");
    }
}
