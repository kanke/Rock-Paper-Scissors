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
public class PaperTest {

    String paperName = "Paper";

    @After
    public void validate() {
        validateMockitoUsage();
    }

    @Before
    public void setup() {

    }


    @Test
    public void shouldReturnPaperName() {
        Paper mockPaper = new Paper();

        mockPaper.setName(paperName);

        assertEquals(mockPaper.getName(), this.paperName);
        assertTrue(mockPaper.getName() == this.paperName);

    }

    @Test
    public void shouldNotReturnPaperName() {
        Paper mockPaper = new Paper();

        mockPaper.setName("falsePaperName");

        assertNotSame(mockPaper.getName(), this.paperName);
        assertFalse(mockPaper.getName() == this.paperName);

    }
}