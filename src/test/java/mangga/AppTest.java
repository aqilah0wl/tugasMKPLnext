package mangga;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void tesPlay(){
        Song testSong = new Song();

        int dataInput = 130;
        String expectedResult =  "Intermediate";
        testSong.setDuration(dataInput);
        assertEquals(testSong.play(), expectedResult);

    }
}
