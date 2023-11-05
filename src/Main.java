import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Would you like to play Poker or Old Maid?");
        String answer = s.nextLine();
        answer = answer.toLowerCase();
        s.close();
        if (answer.contains("poker"))
        {
            Poker p = new Poker();
        }
        else
        {
            OldMaid mei = new OldMaid();
        }
    }
}