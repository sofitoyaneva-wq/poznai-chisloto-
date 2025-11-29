import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {

        Random random = new Random();               // Създаваме обект Random
        int secretNumber = random.nextInt(100) + 1; // Генерираме число от 1 до 100
        Scanner scanner = new Scanner(System.in);   // Скенер за въвеждане

        System.out.println("Компютърът избра число от 1 до 100. Познай го!");

        while (true) { // Безкраен цикъл – излизаме само ако познаем
            System.out.print("Въведи число: ");
            int guess;

            try {
                guess = Integer.parseInt(scanner.nextLine()); // Пробваме да превърнем текста в число
            } catch (Exception e) {
                System.out.println("Моля въведи валидно число!");
                continue; // Продължаваме към следващ опит
            }

            if (guess < 1 || guess > 100) {
                System.out.println("Числото трябва да е между 1 и 100!");
                continue;
            }

            if (guess < secretNumber) {
                System.out.println("По-голямо е! ↑");
            } else if (guess > secretNumber) {
                System.out.println("По-малко е! ↓");
            } else {
                System.out.println("Поздравления! Позна числото!");
                break; // Излизаме от цикъла – играта свършва
            }
        }

        scanner.close();
    }
}
