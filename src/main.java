/**
 * Created by home on 18.02.2018.
 */
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner enter = new Scanner(System.in);
        Fry PhillipFry = new Fry();

        System.out.println("enter film name");
        String movie = enter.nextLine();
        PhillipFry.SetName(movie);
        PhillipFry.output();
    }

    }

