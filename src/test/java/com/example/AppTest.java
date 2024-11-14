package com.banking;
 
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertNotNull;
 
public class AppTest {
 
    @Test
    public void testAppHasMain() {
        App app = new App();
        assertNotNull(app);
    }
}