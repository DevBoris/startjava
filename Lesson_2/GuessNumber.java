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
            if(compare(player1)) {
                break;
            } else {
                inputNumber(player2);
                if(compare(player2)) {
                    break;
                }
            }
        } while(compare(player1));
    }

    private void inputNumber(Player player) {
        System.out.print(player.getName() + " введите число, загаданное компьютером: ");
        player.setNumber(scan.nextInt());
    }

    private boolean compare(Player player) {
        if(player.getNumber() < randomNum) {
            System.out.println("Введенное вами число меньше того, что загадал компьютер. Число: " + randomNum);
        } else if(player.getNumber() > randomNum){
            System.out.println("Введенное вами число больше того, что загадал компьютер. Число: " + randomNum);
        } else if(player.getNumber() == randomNum) {
            System.out.println("Вы угадали. Число: " + randomNum);
            return true;
        }
        return false;
    }
}