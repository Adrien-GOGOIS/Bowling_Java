package org.example;

public class Main {
    public static void main(String[] args) {

       Game bowling = new Game();

       bowling.play('9', '-');
       bowling.strike();
       bowling.play('5', '1');

    }
}
