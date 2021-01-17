package ru.vsu.fedosova;

import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        String[] text = FileReader.readFile();

        Abbreviations abbreviations = new Abbreviations(text);

        FileWriter.writeFile(abbreviations.findAbbreviations());
    }
}
