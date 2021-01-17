package ru.vsu.fedosova;

import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        String filename = getFilename();
        String[] text = FileReader.readFile(filename);

        Abbreviations abbreviations = new Abbreviations(text);

        FileWriter.writeFile(abbreviations.findAbbreviations());
    }

    private static String getFilename()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the full path to the file that contains the text");
        String filename = scanner.nextLine();
        return filename;
    }
}
