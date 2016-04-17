/**
 * Created by Igor.
 */
public class PhraseOmatic {//генератор случайных фраз
    public static void main (String [] args) {
        String [] wordListOne = {};//набор слов

        String [] wordListTwo = {};

        String [] wordListThree = {};

        int oneLenght = wordListOne.length;//Вычисляем количество слов в каждом списке
        int twoLenght = wordListTwo.length;
        int threeLenth = wordListThree.length;

        int rand1 = (int) (Math.random()*oneLenght);//генерируем три случайные числа
        int rand2 = (int) (Math.random()*twoLenght);
        int rand3 = (int) (Math.random()*threeLenth);

        String phrase = wordListOne[rand1]+ ""+// выводим фразу на экран
                wordListTwo[rand2] + "" + wordListThree[rand3];

        System.out.println("All you need is" + phrase);
    }
}

