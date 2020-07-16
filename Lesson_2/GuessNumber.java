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
            outputMassage(player1);
            if(!compare(player1)) {
                inputNumber(player2);
                outputMassage(player2);
            }
        } while(compare(player1));
    }

    private void inputNumber(Player player) {
        System.out.print(player1.getName() + " введите число, загаданное компьютером: ");
        player.setNumber(scan.nextInt());
    }

    private void outputMassage(Player player) {
        if(player.getNumber() < randomNum) {
            System.out.println("Введенное вами число меньше того, что загадал компьютер. Число: " + randomNum);
        } else if(player.getNumber() > randomNum){
            System.out.println("Введенное вами число больше того, что загадал компьютер. Число: " + randomNum);
        } else {
            System.out.println("Вы угадали. Число: " + randomNum);
        }
    }

    private boolean compare(Player player) {
        if(player.getNumber() == randomNum) {
            return true;
        } else {
            return false;
        }
    }
}