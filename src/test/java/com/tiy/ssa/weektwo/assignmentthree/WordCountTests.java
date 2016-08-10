package com.tiy.ssa.weektwo.assignmentthree;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class WordCountTests
{
    static String SOURCE = 
            "CONTENT CONTENT CONTENT CONTENT OF OF OF OF OF WIKIPEDIA WIKIPEDIA PARAGRAPHS" 
            + " GO GO GO GO GO GO GO HERE HERE HERE HERE HERE HERE".toUpperCase();
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
    public void addWordTest() 
    {
        assertEquals(7, wordCount.count("GO"));
        assertEquals(4, wordCount.count("CONTENT"));
    }
    
    @Test
    public void getTopWordsTests() 
    {
        List<String> topWords = new ArrayList<>(wordCount.top(5));
        
        assertEquals("GO", topWords.get(0));
        assertEquals("HERE", topWords.get(1));
        assertEquals("OF", topWords.get(2));
        assertEquals("CONTENT", topWords.get(3));
        assertEquals("WIKIPEDIA", topWords.get(4));
    }
    
    @Test
    public void getBottomWordsTests() {
        List<String> bottomWords = new ArrayList<>(wordCount.bottom(5));
        
       assertEquals("PARAGRAPHS", bottomWords.get(0));
       assertEquals("WIKIPEDIA", bottomWords.get(1));
       assertEquals("CONTENT", bottomWords.get(2));
       assertEquals("OF", bottomWords.get(3));
       assertEquals("HERE", bottomWords.get(4));
      
    }
    
   @Test
    public void getSourceTest() {
        assertEquals("CONTENT CONTENT CONTENT CONTENT OF OF OF OF OF WIKIPEDIA WIKIPEDIA PARAGRAPHS " + 
    "GO GO GO GO GO GO GO HERE HERE HERE HERE HERE HERE", wordCount.source());
    }
    
    @After
    public void clearInstance()
    {
        wordCount.clear();
    }
}
