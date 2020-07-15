import java.util.Scanner;
import java.util.Random;

public class GuessNumber {
    private Player player1;
    private Player player2;
    private boolean isPlayer;
    private int randomNum;
    private Random random = new Random();
    Scanner scan = new Scanner(System.in);

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void play() {
        randomNum = random.nextInt(101);
        do {
            System.out.print(player1.getName() + " введите число, загаданное компьютером: ");
            player1.setNumber(scan.nextInt());
            player1.setCondition(comparePlayers(player1));
            compare(player1);
            if(player2.isCondition()) {
                System.out.print(player2.getName() + " введите число, загаданное компьютером: ");
                player2.setNumber(scan.nextInt());
                player2.setCondition(comparePlayers(player2));
                compare(player2);
            }
        } while(player1.isCondition());
    }

    private void compare(Player player) {
        if(player.getNumber() < randomNum) {
            System.out.println("Введенное вами число меньше того, что загадал компьютер. Число: " + randomNum);
        } else if(player.getNumber() > randomNum) {
            System.out.println("Введенное вами число больше того, что загадал компьютер. Число: " + randomNum);
        } else {
            System.out.println("Вы угадали. Число: " + randomNum);
            player.setCondition(true);
        }
    }

    private boolean comparePlayers(Player player) {
        if(randomNum == player.getNumber()) {
            return true;
        } else {
            return false;
        }
    }
}