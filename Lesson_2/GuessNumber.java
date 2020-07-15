import java.util.Scanner;
import java.util.Random;

public class GuessNumber {
    private Player player1;
    private Player player2;
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
            if(!compare(player2)) {
                System.out.print(player2.getName() + " введите число, загаданное компьютером: ");
                player2.setNumber(scan.nextInt());
            }
        } while(compare(player1));
    }

    private boolean compare(Player player) {
        if(player.getNumber() < randomNum) {
            System.out.println("Введенное вами число меньше того, что загадал компьютер. Число: " + randomNum);
            return false;
        } else if(player.getNumber() > randomNum) {
            System.out.println("Введенное вами число больше того, что загадал компьютер. Число: " + randomNum);
            return false;
        } else if(player.getNumber() == randomNum) {
            System.out.println("Вы угадали. Число: " + randomNum);
            return true;
        } else {
            return false;
        }
    }
}