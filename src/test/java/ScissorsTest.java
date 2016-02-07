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
public class ScissorsTest {

    String scissorsName = "Scissors";

    @After
    public void validate() {
        validateMockitoUsage();
    }

    @Before
    public void setup() {

    }


    @Test
       public void shouldReturnScissorsName(){
        Scissors mockScissors =  new Scissors();

        mockScissors.setName(scissorsName);

        assertEquals(mockScissors.getName(),this.scissorsName);
        assertTrue(mockScissors.getName() ==  this.scissorsName);

    }

    @Test
    public void shouldNotReturnScissorsName(){
        Scissors mockScissors =  new Scissors();

        mockScissors.setName("falseScissorsName");

        assertNotSame(mockScissors.getName(), this.scissorsName);
        assertFalse(mockScissors.getName() ==  this.scissorsName);

    }
}
