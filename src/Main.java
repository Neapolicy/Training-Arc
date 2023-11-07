import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        printSlow("Would you like to play Poker or Old Maid?\n");
        String answer = s.nextLine();
        answer = answer.toLowerCase();
        if (answer.contains("poker"))
        {
            Poker p = new Poker();
        }
        else
        {
            OldMaid mei = new OldMaid();
        }
    }

    private static void printSlow(String text)
    {
        for (int i = 0; i < text.length(); i++) {
            System.out.print(text.charAt(i));
            try {
                Thread.sleep(45L);    // time interval in milliseconds
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
