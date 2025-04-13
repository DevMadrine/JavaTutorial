package oop.files;

import java.io.FileWriter;
import java.io.IOException;

public class File {
    public static void main(String[] args){
        try {
            FileWriter writer = new FileWriter("poem.txt");
            writer.write("Roses are red\n");
            writer.write("Roses are red\n");
            writer.write("Roses are red\n");
            writer.write("Roses are red\n");
            writer.append("A poem by Bro");
            writer.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
