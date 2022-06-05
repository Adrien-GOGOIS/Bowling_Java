package org.example;

public class Bowling {
    public static void main(String[] args) {

        Try firstTry = new Try('9');
        Try secondTry = new Try('-');
        Frame firstFrame = new Frame(firstTry, secondTry);

        System.out.println(firstFrame.frameResult());

    }
}
