import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        printSlow("Would you like to play Poker or Old Maid?");
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

    static void printSlow(String test)
    {
        for (int i = 0; i < test.length(); i++) {
            System.out.print(test.charAt(i));
            try {
                Thread.sleep(45L);    // time interval in milliseconds
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}