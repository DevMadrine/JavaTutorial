package oop;

import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Sound {

    public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        Scanner scanner = new Scanner(System.in);
        File file = new File("src/deputy.wav");
        AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(file);
        Clip clip = AudioSystem.getClip();
        clip.open(audioInputStream);
//        clip.start();

        String response = "";

        while (!response.equals("Q")){
            System.out.println("P=Play, S=Stop, R=Reset, q=Quit");
            System.out.println("Enter your Choice: ");
            response = scanner.next();
            response = response.toUpperCase();

            switch (response){
                case("P"): clip.start();
                break;
                case("S"): clip.stop();
                break;
                case("R"): clip.setMicrosecondPosition(0);
                break;
                case("Q"):clip.close();
                break;
                default:
                    System.out.println("Not a valid response");

            }
        }
    }
}
