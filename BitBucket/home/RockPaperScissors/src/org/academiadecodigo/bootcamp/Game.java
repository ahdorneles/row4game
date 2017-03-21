package org.academiadecodigo.bootcamp;

/**
 * Created by codecadet on 24/01/17.
 */
public class Game {
    public Game() {
    }




    public void startGame(int bestof, Player player1, Player player2) {

        int p1Points = 0;
        int p2Points = 0;

        while (p1Points < bestof && p2Points < bestof) {
            RPS p1 = player1.pChoice();
            RPS p2 = player2.pChoice();
            if (p1 == p2) {
                System.out.println("It's a Draw!!");

            }
            else if (p1 == RPS.PAPER && p2 == RPS.ROCK) {
                p1Points = p1Points +1;
                System.out.println(player1.getName() + " wins P > R ///" + player1.getName() + ": " + p1Points + player2.getName() + ": " + p2Points );
            }
            else if (p1 == RPS.ROCK && p2 == RPS.Scissors) {
                p1Points = p1Points +1;
                System.out.println(player1.getName() + " wins R > S ///" + player1.getName() + ": " + p1Points + player2.getName() + ": " + p2Points );
            }
            else if (p1 == RPS.Scissors && p2 == RPS.PAPER) {
                p1Points = p1Points +1;
                System.out.println(player1.getName() + " wins S > P ///" + player1.getName() + ": " + p1Points + player2.getName() + ": " + p2Points );
            }
            ////////////////////////////////////p2
            else if (p2 == RPS.PAPER && p1 == RPS.ROCK) {
                p2Points = p2Points +1;
                System.out.println(player2.getName() + " wins P > R ///" + player1.getName() + ": " + p1Points + player2.getName() + ": " + p2Points );
            }
            else if (p2 == RPS.ROCK && p1 == RPS.Scissors) {
                p2Points = p2Points +1;
                System.out.println(player2.getName() + " wins P > R ///" + player1.getName() + ": " + p1Points + player2.getName() + ": " + p2Points );
            }
            else if (p2 == RPS.Scissors && p1 == RPS.PAPER) {
                p2Points = p2Points +1;
                System.out.println(player2.getName() + " wins P > R ///" + player1.getName() + ": " + p1Points + player2.getName() + ": " + p2Points );
            }

            if (p1Points >= bestof) {
                System.out.println(player1.getName() + " Wins the Game!!");
            }
            if (p2Points >= bestof) {
                System.out.println(player2.getName() + " Wins the Game!!");
            }

        }

        ///////////////////////////////////////////////////////

    }

}
