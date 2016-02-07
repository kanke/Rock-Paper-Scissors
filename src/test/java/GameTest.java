import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import static org.mockito.Mockito.validateMockitoUsage;

/**
 * Created by kanke on 07/02/2016.
 */
@RunWith(MockitoJUnitRunner.class)
public class GameTest {

    @After
    public void validate() {
        validateMockitoUsage();
    }

    @Before
    public void setup() {

    }

    @Test
    public void shouldGetGameInstructions(){}
}
