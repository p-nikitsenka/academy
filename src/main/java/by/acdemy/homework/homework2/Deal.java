package by.acdemy.homework.homework2;

import java.util.Scanner;

public class Deal {
    public static void main(String[] args) {
        int numberOfPlayers = 0;
        int cardsForPlayer = 5;
        String[] suitOfCards = {"Spades", "Diamonds", "Hearts", "Clubs"}; // задаем масти для колоды карт
        String[] rank = {"Ace", "King", "Queenn", "Jack", "10", "9", "8", "7", "6", "5", "4", "3", "2"}; // Задаем карты для колоды
        int numberOfCards = suitOfCards.length * rank.length; // задаем размер колоды
        Scanner console = new Scanner(System.in); // ввод количества игроков с клавиатуры
        do {
            System.out.println("Enter the number of players: ");
            while (!console.hasNextInt()) {
                System.out.println("That not a natural number! Try again!");
                console.next();
            }
            numberOfPlayers = console.nextInt();
            if (numberOfPlayers > (numberOfCards / cardsForPlayer)) {
                System.out.println("Too much players. Try again!");
            }
        } while (numberOfPlayers <= 0 || numberOfPlayers > (numberOfCards / cardsForPlayer));
        console.close();

        String[] deck = new String[numberOfCards]; // собираем колоду. Каждой карте каждого достоинства присваиваем все четыре масти и записываем все это в массив колоды
        for (int i = 0; i < rank.length; i++) {
            for (int j = 0; j < suitOfCards.length; j++) {
                deck[suitOfCards.length * i + j] = rank[i] + " " + suitOfCards[j];
            }
        }
        for (int i = 0; i < numberOfCards; i++) { // перетасовка колоды
            int x = i + (int) (Math.random() * (numberOfCards - i)); // случайная карта в колоде
            String temp = deck[x];

            deck[i] = temp;
        }
        for (int i = 0; i < numberOfPlayers * cardsForPlayer; i++) {
            System.out.println(deck[i]);
            if (i % cardsForPlayer == cardsForPlayer - 1)
                System.out.println();

        }
    }
}


