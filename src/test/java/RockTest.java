import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.validateMockitoUsage;

/**
 * Created by kanke on 07/02/2016.
 */
@RunWith(MockitoJUnitRunner.class)
public class RockTest {

    String rockName = "Rock";

    @After
    public void validate() {
        validateMockitoUsage();
    }

    @Before
    public void setup() {

    }


    @Test
    public void shouldReturnRockName(){
        Rock mockRock =  new Rock();

        mockRock.setName(rockName);

        assertEquals(mockRock.getName(),this.rockName);
        assertTrue(mockRock.getName() ==  this.rockName);

    }

    @Test
    public void shouldNotReturnScissorsName(){
        Rock mockRock =  new Rock();

        mockRock.setName("falseRockName");

        assertNotSame(mockRock.getName(), this.rockName);
        assertFalse(mockRock.getName() ==  this.rockName);

    }
}
