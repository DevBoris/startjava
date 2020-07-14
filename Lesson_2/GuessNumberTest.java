import java.util.Scanner;
public class GuessNumberTest {
    public static void main(String[] args) {
        Player play1;
        Player play2;
        GuessNumber players;
        String choice;

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите имя игрока № 1: ");
        play1 = new Player(scan.nextLine());
        System.out.println("Введите имя игрока № 2: ");
        play2 = new Player(scan.nextLine());
        players = new GuessNumber(play1, play2);
        do{
            players.play();
            do {
                System.out.println("Хотите продолжить? [да/нет]: ");
                choice = scan.next();
            } while(!choice.equals("да") && !choice.equals("нет"));
        } while(choice.equals("да"));
    }
}