package ru.vsu.fedosova;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReader
{
    public static String[] readFile()
    {
        String text = "";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the full path to the file that contains the text");
        String filename = scanner.nextLine();
        File inputFile = new File(filename);
        try
        {
            scanner = new Scanner(inputFile);
            text = scanner.nextLine();
        } catch (FileNotFoundException fileNotFoundException)
        {
            System.out.println("File not found");
        }
        return divideText(text);
    }

    private static String[] divideText(String text)
    {
        String[] words = text.split("[ \\-#.,:;$]");
        return words;
    }
}
