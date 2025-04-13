package oop.files;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        File file = new File("src/oop/files/secret_message.txt");
        if(file.exists()){
            System.out.println("file exists");
        }else{
            System.out.println("file does not exist");
        }
    }
}
