package ru.vsu.fedosova;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Scanner;

public class FileWriter
{

    public static void writeFile(List<String> abbreviations)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the full path to the file where you want to save the abbreviations");
        String filename = scanner.nextLine();
        File outputFile = new File(filename);
        try {
            scanner = new Scanner(outputFile);
            try (PrintWriter out = new PrintWriter(outputFile))
            {
                for (String s : abbreviations)
                {
                    out.println(s);
                }
            }
        } catch (FileNotFoundException fileNotFoundException) {
            System.out.println("File not found");
        }
    }
}
