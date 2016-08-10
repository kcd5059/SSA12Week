package com.tiy.ssa.weektwo.assignmentthree;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class WordCountTestsTest2 {

    static String SOURCE = "A tornado is a violently rotating column of air that rotates while in contact with both the "
            + "surface of the Earth and a cumulonimbus cloud or, in rare cases, the base of a cumulus cloud. They are often "
            + "referred to as twisters or cyclones,[1] although the word cyclone is used in meteorology to name any closed "
            + "low pressure circulation. Tornadoes come in many shapes and sizes, but they are typically in the form of a "
            + "visible condensation funnel, whose narrow end touches the earth and is often encircled by a cloud of debris "
            + "and dust. Most tornadoes have wind speeds less than 110 miles per hour (180 km/h), are about 250 feet (80 m) "
            + "across, and travel a few miles (several kilometers) before dissipating. The most extreme tornadoes can attain "
            + "wind speeds of more than 300 miles per hour (480 km/h), are more than two miles (3 km) in diameter, and stay on "
            + "the ground for dozens of miles (more than 100 km).[2][3][4]".toUpperCase();
    WordCount wordCount = new WordCount();
    
    @Before
    public void parse()
    {
        String[] words = SOURCE.split("\\W+"); //should take care of punctuation and other special 
                                           //characters
        for (String word : words)
        {
            this.wordCount.addWord(word);
        }

    }
    
    @Test
    public void Tests() 
    {
        
        for (String word : wordCount.top(10))
        {
            System.out.println(word);
        }
        System.out.println(" ");
        
        for (String word : wordCount.bottom(10))
        {
            System.out.println(word);
        }
        System.out.println(" ");
        
        System.out.println(wordCount.source());
    }
    
    @After
    public void clearWordCount()
    {
        wordCount.clear();
    }

}
