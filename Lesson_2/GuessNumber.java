import java.util.Scanner;
import java.util.Random;

public class GuessNumber {
    private Player player1;
    private Player player2;
    private boolean isPlayer;
    private int randomNum;
    private Random random = new Random();

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    Scanner scan = new Scanner(System.in);
    public void play() {
        isPlayer = true;
        randomNum = random.nextInt(101);
        do{
            System.out.print(player1.getName() + " введите число, загаданное компьютером: ");
            player1.setNumber(scan.nextInt());
            guess(player1);
            if(isPlayer) {
                System.out.print(player2.getName() + " введите число, загаданное компьютером: ");
                player2.setNumber(scan.nextInt());
                guess(player2);
            }
        } while(isPlayer);
    }

    private void guess(Player player) {
        if(player.getNumber() < randomNum) {
            System.out.println("Введенное вами число меньше того, что загадал компьютер. Число: " + randomNum);
        } else if(player.getNumber() > randomNum) {
            System.out.println("Введенное вами число больше того, что загадал компьютер. Число: " + randomNum);
        } else {
            System.out.println("Вы угадали. Число: " + randomNum);
            isPlayer = false;
        }
    }
}