package com.practice.javaeight;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.stream.Stream;

public class FileReading {

    public static void main(String[] args)  {
        //some dummy file name and path, we can organize it by reading the file from a customized path or class path
        System.out.println("Enter the file name for example -->d://files.txt");
        Scanner sc = new Scanner(System.in);
        String fileName = sc.next();

        //read file into stream, try-with-resources
        try (Stream<String> stream = Files.lines(Paths.get(fileName))) {
            stream.forEach(e-> System.out.println(e.replaceAll("[aeiouAEIOU]","X")));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
