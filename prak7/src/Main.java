import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    private int firstCard;
    private int secondCard;
    private int step;
    private boolean gameOver = false;

    public Main() {
    }

    public void addCard(Queue deck, int a) {
        deck.add(a);
    }

    public void step(Queue deck1, Queue deck2) {
        if (deck1.peek() == null) {
            System.out.println("second " + this.step);
            this.gameOver = true;
        } else if (deck2.peek() == null) {
            System.out.println("first " + this.step);
            this.gameOver = true;
        } else {
            this.firstCard = (Integer)deck1.peek();
            if (this.firstCard == 0) {
                this.firstCard = 10;
            }

            this.secondCard = (Integer)deck2.peek();
            if (this.secondCard == 0) {
                this.secondCard = 10;
            }

            if (this.firstCard > this.secondCard) {
                if (this.firstCard == 10) {
                    this.firstCard = 0;
                }

                deck2.remove();
                deck1.remove();
                deck1.add(this.firstCard);
                deck1.add(this.secondCard);
                ++this.step;
            }

            if (this.secondCard > this.firstCard) {
                if (this.secondCard == 10) {
                    this.secondCard = 0;
                }

                deck2.remove();
                deck1.remove();
                deck2.add(this.firstCard);
                deck2.add(this.secondCard);
                ++this.step;
            }

            if (this.firstCard == this.secondCard) {
                deck1.remove();
                deck2.remove();
                if (this.firstCard == 10) {
                    this.firstCard = 0;
                }

                if (this.secondCard == 10) {
                    this.secondCard = 0;
                }

                deck1.add(this.firstCard);
                deck2.add(this.secondCard);
                ++this.step;
            }

            System.out.println("Итог шага " + this.step + ": \n" + deck1 + "\n" + deck2);
            if (this.step >= 106) {
                this.gameOver = true;
                System.out.println("botva");
            }

        }
    }

    public static void main(String[] args) {
        Main game = new Main();
        Queue<Integer> firstDeck = new LinkedList();
        Queue<Integer> secondDeck = new LinkedList();
        Scanner input = new Scanner(System.in);
        System.out.println("in 5 card first colod:");

        int i;
        for(i = 1; i <= 5; ++i) {
            game.addCard(firstDeck, input.nextInt());
        }

        System.out.println("in 5 card second colod:");

        for(i = 1; i <= 5; ++i) {
            game.addCard(secondDeck, input.nextInt());
        }

        while(!game.gameOver) {
            game.step(firstDeck, secondDeck);
        }

    }
}