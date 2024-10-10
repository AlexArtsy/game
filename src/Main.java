import character.Character;
import character.Player;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Player player = new Player();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя игрока:");
        String playerName = scanner.nextLine();
        player.setName(playerName);
        System.out.println(player);
        System.out.println("Введите параметр hp:");
        int hp = scanner.nextInt();
        player.setHp(hp);
        System.out.println("Введите параметр power:");
        int power = scanner.nextInt();
        player.setPower(power);
        System.out.println("Введите параметр defence");
        int defence = scanner.nextInt();
        player.setDefence(defence);
        System.out.println("Введите параметр intelligence:");
        int intelligence = scanner.nextInt();
        player.setIntelligence(intelligence);
        System.out.println(player);

    }
}