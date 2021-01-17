package ru.vsu.fedosova;

import java.util.ArrayList;
import java.util.List;

public class Abbreviations
{
    private String[] words;

    public Abbreviations(String[] words)
    {
        this.words = words;
    }
    
    public List<String> findAbbreviations()
    {
        List<String> abbreviations = new ArrayList<>();
        for (int i = 0; i < words.length; i++)
        {
            char[] word = words[i].toCharArray();
            if (ifWordIsAbbreviations(word) == true)
            {
                abbreviations.add(words[i]);
            }
        }
        return abbreviations;
    }

    private boolean ifWordIsAbbreviations(char[] word)
    {
        boolean result = true;
        for (char x : word)
        {
            if (word.length < 2 || Character.isLowerCase(x) || Character.isDigit(x))
            {
                result = false;
                break;
            }
        }
        return result;
    }
}
