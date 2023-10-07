package demo;

import org.junit.jupiter.api.Test;

import processing.core.PApplet;
import processing.event.KeyEvent;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import javax.lang.model.type.NullType;

public class TestApp {

    // Test when the powerUp is active
    @Test
    public void testPowerUp1() {
        App app = new App();
        app.loop();
        PApplet.runSketch(new String[] { "App" }, app);
        app.setup();
        app.delay(1000); // to give time to initialise stuff before drawing begins
        //assertEquals(expected, app.powerUp(500));
    }

}

// gradle run
// gradle test
// gradle jacocoTestReport
