package com.pidkui.hacker_earth.easy;

import java.util.Scanner;

public class CostOfBalloons {
    public static void main(String[] args) {
        int numberOfTestCases;
        int numberOfParticipants;
        int balloonCost1;
        int balloonCost2;
        int participantsSolvedFirstQuestion;
        int participantsSolvedSecondQuestion;
        int firstTotalCost;
        int secondTotalCost;

        Scanner sc = new Scanner(System.in);
        numberOfTestCases = sc.nextInt();

        if (numberOfTestCases < 1 || numberOfTestCases > 10) {
            System.exit(0);
        }

        for (int i = 0; i < numberOfTestCases; i++) {
            balloonCost1 = sc.nextInt();
            balloonCost2 = sc.nextInt();

            numberOfParticipants = sc.nextInt();

            if (numberOfParticipants < 1 || numberOfParticipants > 10) {
                System.exit(0);
            }

            participantsSolvedFirstQuestion = 0;
            participantsSolvedSecondQuestion = 0;

            for (int j = 0; j < numberOfParticipants; j++) {
                // status of j th participant for first problem
                if (sc.nextInt() == 1) {
                    participantsSolvedFirstQuestion++;
                }
                // status of j th participant for second problem
                if (sc.nextInt() == 1) {
                    participantsSolvedSecondQuestion++;
                }
            }

            firstTotalCost = balloonCost1 * participantsSolvedFirstQuestion + balloonCost2 * participantsSolvedSecondQuestion;
            secondTotalCost = balloonCost1 * participantsSolvedSecondQuestion + balloonCost2 * participantsSolvedFirstQuestion;

            System.out.println(Math.min(firstTotalCost, secondTotalCost));
        }
    }
}
