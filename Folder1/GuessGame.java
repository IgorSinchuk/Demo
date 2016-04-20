/**
 * Created by Igor.
 */
public class GuessGame {
    public class Player {
    Player p1;//три переменных экземпляра для 3-х объктов Player
    Player p2;
    Player p3;

    public void startGame() {
        p1 = new Player();//присваеваем объктам три преременные экземпляра
        p2 = new Player();
        p3 = new Player();

        int guessp1 = 0;//
        int guessp2 = 0;
        int guessp3 = 0;

        boolean p1isRight = false;//переменные для хранения true or false
        boolean p2isRight = false;
        boolean p3isRight = false;

        int targetNumber = (int) (Math.random()*10);
        System.out.println("from one to 9...");

        while(true) {
            System.out.println("Number to guess, - " + targetNumber);
            
            p1.guess();//Вызываем метод guess()
            p2.guess();
            p3.guess();

            guessp1 = p1.number;//Извлекаем результаты каждого игрока
            System.out.println("First player is thinking it is " + guessp1);

            guessp2 = p2.number;
            System.out.println("First player is thinking it is " + guessp2);

            guessp3 = p3.number;
            System.out.println("First player is thinking it is " + guessp3);

            if (guessp1==targetNumber) {//проверяем варианты
                p1isRight = true;
            }
            if (guessp2==targetNumber) {
                p2isRight = true;
            }
            if (guessp3==targetNumber) {
                p3isRight = true;
            }

            if (p1isRight || p2isRight || p3isRight) {
                System.out.println("We have the winner");
                System.out.println("Первый игрок угадал?"+p1isRight);
                System.out.println("Второй игрок угадал?"+p2isRight);
                System.out.println("Третий игрок угадал?"+p3isRight);
                System.out.println("End of the game");
                break;//Игра окончена. Перекрываем цикл
            } else {//Продолжаем если никто не угадал
                System.out.println("Players have to try one more time");
            }//конец if/else/

        }//
    }//
    }//

}//
