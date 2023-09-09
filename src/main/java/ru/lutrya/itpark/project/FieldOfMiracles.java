package ru.lutrya.itpark.project;

import java.util.Random;
import java.util.Scanner;

public class FieldOfMiracles {
    public enum Player {
        ONE,
        TWO
    }

    public static Player currentPlayer = Player.ONE;

    public static void changePlayer() {
        if (currentPlayer == Player.ONE) {
            currentPlayer = Player.TWO;
        } else {
            currentPlayer = Player.ONE;
        }
    }

    public static void main(String[] args) {
        String[] words = new String[]{
            "листобой",
            "дрожжи",
            "затычка",
            "веснушка"
        };

        String[] descriptions = new String[]{
            "Как в старину называли сильный осенний ветер, дующий с северо-востока?",
            "Что хотели изготавливать из нефти в СССР?",
            "Как раньше назывался человек, которому во время свадебного обряда поручали бочонок с вином для угощения?",
            "Как в старину на Руси называли подснежную клюкву?"
        };

        Random random = new Random();
        int currentNumber = random.nextInt(0, words.length);

        String currentWord = words[currentNumber]
            .toLowerCase();
        String currentDescription = descriptions[currentNumber];

        boolean[] answers = new boolean[currentWord.length()];
        int firstPlayerScore = 0;
        int secondPlayerScore = 0;

        Scanner console = new Scanner(System.in);
        while (true) {
            boolean isFirstPlayer = currentPlayer == Player.ONE;

            System.out.println("[Голос из динамика] Внимание, вопрос: " + currentDescription);
            System.out.print("[Система] Символы на табло: ");

            for (int i = 0; i < currentWord.length(); i++)
                if (answers[i])
                    System.out.print(currentWord.charAt(i));
                else
                    System.out.print("?");

            System.out.print(".\n");

            int currentScore = 100 * random.nextInt(0, 11);

            if (currentScore == 0) {
                System.out.println("[Якубович] На барабане 0 очков, как жаль! Ход переходит следующему игроку.");
                changePlayer();
                continue;
            }

            if (isFirstPlayer)
                System.out.println("[Якубович] " + currentScore + " очков на баране, первый игрок, буква?");
            else
                System.out.println("[Якубович] " + currentScore + " очков на баране, второй игрок, буква?");

            String playerAnswer = console.nextLine()
                .toLowerCase();
            if (currentWord.contains(playerAnswer)) {
                if (
                    answers[
                        currentWord.indexOf(playerAnswer)
                    ]
                ) {
                    System.out.println("[Якубович] Буква \"" + playerAnswer + "\" уже была названа! Ход переходит следующему игроку.");
                    changePlayer();
                } else {
                    System.out.println("[Якубович] Откройте букву \"" + playerAnswer + "\"!");

                    if (isFirstPlayer)
                        firstPlayerScore += currentScore;
                    else
                        secondPlayerScore += currentScore;

                    for (int i = 0; i < currentWord.length(); i++)
                        if (currentWord.charAt(i) == playerAnswer.charAt(0))
                            answers[i] = true;

                    boolean isFullWord = true;
                    for (int i = 0; i < currentWord.length(); i++)
                        if (answers[i] == false) {
                            isFullWord = false;
                            break;
                        }

                    if (isFullWord) {
                        if (firstPlayerScore > secondPlayerScore)
                            System.out.println("[Якубович] И победителем нашей игры становится первый игрок со счётом " + firstPlayerScore + " очков! У оппонента было " + secondPlayerScore + " очков.");
                        else
                            System.out.println("[Якубович] И победителем нашей игры становится второй игрок со счётом " + secondPlayerScore + " очков! У оппонента было " + firstPlayerScore + " очков.");

                        break;
                    }
                }
            } else {
                System.out.println("[Якубович] Буквы \"" + playerAnswer + "\" нет в загаданном слове!");
                changePlayer();
            }
        }
    }
}
