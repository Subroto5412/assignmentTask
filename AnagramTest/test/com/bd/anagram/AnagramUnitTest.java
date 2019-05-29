package com.bd.anagram;

import com.bd.anagram.AnagramTest;
import static com.bd.anagram.AnagramTest.isAnagram;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.*;    
import java.io.*;
import static java.time.Clock.system;

/**
 *
 * @author subrotomohonto
 */
public class AnagramUnitTest {
    
    AnagramTest anagramTest;
    private String mFirstValue="eat";
    private String mSecondValue="tar";
    
    public AnagramUnitTest() {
    }
    
    @Before
    public void setUp() {
        anagramTest   = new AnagramTest();
    }
    
    @After
    public void tearDown() {
        anagramTest = null;
    }
   
    @Test
    public void testIsAnagramOrNot() {
     
        Boolean result = anagramTest.isAnagram(mFirstValue, mSecondValue);
		
        if(result)
        {
            System.out.println(mFirstValue+" and "+mSecondValue+" are Anagram");
	}
	else
        {
            System.out.println(mFirstValue+" and "+mSecondValue+" are not Anagram");
	}
    }
}
