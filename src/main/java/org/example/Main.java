package org.example;

public class Main {
    public static void main(String[] args) {

        Try firstTry = new Try('9');
        Try secondTry = new Try('-');

        Frame firstFrame = new Frame(firstTry, secondTry);

        for (Try s : firstFrame.playerFrame) {
            System.out.println(s.getTry());
        }

    }
}