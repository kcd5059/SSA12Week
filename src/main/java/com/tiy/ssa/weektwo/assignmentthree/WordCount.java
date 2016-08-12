package com.tiy.ssa.weektwo.assignmentthree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Kyle
 */

public class WordCount 
{
    final Map<String, Integer> wordBank = new HashMap<>();
    final List<String> source = new ArrayList<>();
    /**
     * 
     * @param word callers are responsible for ensuring <code>word</code> <br>
     *        is an actual word, parsing is done by the caller
     */
    public void addWord(String word)
    {
        if ( !(wordBank.containsKey(word)) ) 
        {
            wordBank.put(word, 1);
        } else
        {
            wordBank.put(word, Integer.sum(wordBank.get(word), 1));
        }
        source.add(word);
    }
    /**
    * @return a <em>case-insensitive</em> count of <code>word</word> in the words added to this instance
    */
    public int count(String word)
    {
        return wordBank.getOrDefault(word, 0);
    }

    /**
     *
     * @param many
     * @return a logical set of words ordered in descending popularity
     *         order, so top <code>many</code> words
     */
    public List<String> top(int many)
    {
        List<Map.Entry<String, Integer>> entries = new ArrayList<Map.Entry<String, Integer>>(wordBank.entrySet());
        List<String> sortedAscending = new ArrayList<>();
        
        Collections.sort(entries, new Comparator<Map.Entry<String,Integer>>() 
        {
            public int compare(Map.Entry<String,Integer> a, Map.Entry<String,Integer> b) 
            {
            return Integer.compare(b.getValue(), a.getValue());
            }
        });
            
        for (Map.Entry<String,Integer> e : entries) 
        {
            sortedAscending.add(e.getKey());     
        }
        
        return sortedAscending.subList(0, many);
    }
    

    /**
     *
     * @param many
     * @return a logical set of words ordered in ascending least popularity
     *         order, so bottom <code>many</code> words
     */
    public List<String> bottom(int many)
    {
        List<Map.Entry<String, Integer>> entries = new ArrayList<Map.Entry<String, Integer>>(wordBank.entrySet());
        List<String> sortedDescending = new ArrayList<>();
    
        
        Collections.sort(entries, new Comparator<Map.Entry<String,Integer>>() 
        {
            public int compare(Map.Entry<String,Integer> a, Map.Entry<String,Integer> b) 
            {
            return Integer.compare(b.getValue(), a.getValue());
            }
        });
        
            
        for (Map.Entry<String,Integer> e : entries) 
        {
            sortedDescending.add(e.getKey());     
        }
        
       Collections.reverse(sortedDescending);
        
        return sortedDescending.subList(0, many);
    }

    /**
     *
     * @return the input that is being word counted (maintaining the order
     *         prescribed by {@link #addWord(String) }
     * @see #addWord(String)  
     */
    public String source()
    {
        String sourceString = "";
        
        for (String word : source) {
            sourceString += word + " ";
        }
        return sourceString.trim();
    }
    
    public void clear() 
    {
        wordBank.clear();
    }
}

