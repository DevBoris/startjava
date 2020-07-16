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
            inputNumber(player1);
            compare(player1);
            do {
                inputNumber(player2);
                compare(player2);
            } while(player2.getNumber() != randomNum);
        } while(player1.getNumber() != randomNum);
    }

    private boolean compare(Player player) {
        if(player.getNumber() < randomNum) {
            System.out.println("Введенное вами число меньше того, что загадал компьютер. Число: " + randomNum);
        } else if(player.getNumber() > randomNum) {
            System.out.println("Введенное вами число больше того, что загадал компьютер. Число: " + randomNum);
        } else {
            System.out.println("Вы угадали. Число: " + randomNum);
            return true;
        }
        return false;
    }
    private void inputNumber(Player player) {
        System.out.print(player1.getName() + " введите число, загаданное компьютером: ");
        player1.setNumber(scan.nextInt());
    }
}