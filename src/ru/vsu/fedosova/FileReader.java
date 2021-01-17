package ru.vsu.fedosova;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReader
{
    public static String[] readFile(String filename)
    {
        String text = "";
        File inputFile = new File(filename);
        try
        {
            Scanner scanner = new Scanner(inputFile);
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
