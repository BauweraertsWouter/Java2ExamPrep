package be.kdg.junitdemo;

import org.junit.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

/**
 * Gebruik deze klasse om de 'logische' fouten uit de klasse gemidddelden te halen.
 * Aan de tests zelf mag je niets veranderen!
 */
public class TestGemiddelden {
    private Gemiddelden gemiddelden;

    @Before
    public void setUp() throws Exception {
        this.gemiddelden = new Gemiddelden();
    }

    @After
    public void tearDown() throws Exception {
        // er hoeft niks afgesloten te worden
    }

    @BeforeClass
    public static void init() {
        // er hoeft niks te gebeuren bij het laden van deze test-klasse
    }

    @AfterClass
    public static void close() {
        // er hoeft niks te gebeuren bij het afsluiten van deze test-klasse
    }

    @Test
    public void testRekenkundigGemiddeldeNormaal() {
        gemiddelden.voegGetalToe(3);
        double gemiddelde = gemiddelden.rekenkundigGemiddelde();
        assertEquals("gemiddelde van 3 zou 3 moeten zijn", 3.0, gemiddelde, 0.0);

        gemiddelden.voegGetalToe(5);
        gemiddelde = gemiddelden.rekenkundigGemiddelde();
        assertEquals("gemiddelde van 3 en 5 zou 4 moeten zijn", 4.0, gemiddelde, 0.0);

        gemiddelden.voegGetalToe(4);
        gemiddelde = gemiddelden.rekenkundigGemiddelde();
        assertEquals("gemiddelde van 3, 4 en 5 zou 4 moeten zijn", 4.0, gemiddelde, 0.0);

        gemiddelden.voegGetalToe(5);
        gemiddelde = gemiddelden.rekenkundigGemiddelde();
        assertEquals("gemiddelde van 3, 4, 5 en 5 zou 4,25 moeten zijn", 4.25, gemiddelde, 0.0);
    }

    @Test(expected=ArithmeticException.class)
    public void testRekenkundigGemiddeldeGeenGetallen() {
        gemiddelden.rekenkundigGemiddelde();
        fail("het gemiddelde van geen getallen zou een exception moeten gooien");
    }

    @Test(timeout=1000)
    public void testRekenkundigGemiddeldeEnkelNul() {
        gemiddelden.voegGetalToe(0);
        try {
            double gemiddelde = gemiddelden.rekenkundigGemiddelde();
            assertEquals("het gemiddelde van 0 zou 0 moeten zijn", 0.0, gemiddelde, 0.0);
        } catch (Exception e) {
            fail("het gemiddelde van het getal 0 mag geen exception gooien");
        }
    }

    @Test
    public void testMeetkundigGemiddeldeNormaal() {
        gemiddelden.voegGetalToe(8);
        double gemiddelde = gemiddelden.meetkundigGemiddelde();
        assertEquals("gemiddelde van 8 zou 8 moeten zijn", 8.0, gemiddelde, 0.0);

        gemiddelden.voegGetalToe(12.5);
        gemiddelde = gemiddelden.meetkundigGemiddelde();
        assertEquals("gemiddelde van 8 en 12.5 zou 10 moeten zijn", 10.0, gemiddelde, 0.000000001);

        gemiddelden.voegGetalToe(0);
        gemiddelde = gemiddelden.meetkundigGemiddelde();
        assertEquals("gemiddelde van 0 en andere getallen moet 0 zijn", 0.0, gemiddelde, 0.0);

        gemiddelden.maakLeeg();
        gemiddelden.voegGetalToe(8);
        gemiddelden.voegGetalToe(27);
        gemiddelden.voegGetalToe(343);
        gemiddelde = gemiddelden.meetkundigGemiddelde();
        assertEquals("het gemiddelde van 8, 27 en 343 zou 42 moeten zijn", 42, gemiddelde, 0.000000001);

        gemiddelden.voegGetalToe(42);
        gemiddelde = gemiddelden.meetkundigGemiddelde();
        assertEquals("het gemiddelde van 8, 27, 343 en 42 zou 42 moeten zijn", 42, gemiddelde, 0.0001);

        gemiddelden.voegGetalToe(8);
        gemiddelde = gemiddelden.meetkundigGemiddelde();
        assertEquals("het gemiddelde van 8, 27, 343, 42 en 8 zou 30,145148646 moeten zijn", 30.145148646003363746113550141118, gemiddelde, 0.000000001);
    }

    @Test
    public void testMeetkundigGemiddeldeSpeciaal() {
        try {
            gemiddelden.meetkundigGemiddelde();
            fail("het gemiddelde van geen getallen zou een exception moeten gooien");
        } catch (ArithmeticException e) {
            // OK.
        }

        gemiddelden.voegGetalToe(0);
        try {
            double gemiddelde = gemiddelden.meetkundigGemiddelde();
            assertEquals("het gemiddelde van 0 zou 0 moeten zijn", 0.0, gemiddelde, 0.0);
        } catch (Exception e) {
            fail("het gemiddelde van het getal 0 mag geen exception gooien");
        }
    }
}
