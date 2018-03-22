package pract4;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;

import org.junit.runner.RunWith;

import static org.junit.Assert.*;

@RunWith(JUnitParamsRunner.class)
public class TemperatureConverterTest {

    private TemperatureConverter converter = new TemperatureConverter();

    @Test
    @Parameters({"32, 0", "-56, -48.88", "102.99, 39.44"})
    public void convertFtoC(double degreesFahrenheit, double degreesCelsius) {
        double result = converter.convertFtoC(degreesFahrenheit);
        assertEquals(degreesCelsius, result, 0.01);
    }

    @Test
    @Parameters({"34, 93.2", "-86, -122.8", "305, 581"})
    public void convertCtoF(double degreesCelsius, double degreesFahrenheit) {
        double result = converter.convertCtoF(degreesCelsius);
        assertEquals(degreesFahrenheit, result, 0.01);
    }

    @Test
    @Parameters({"34, 307.15", "-20, 253.15", "178.5, 451.65"})
    public void convertCtoK(double degreesCelsius, double kelvin) {
        double result = converter.convertCtoK(degreesCelsius);
        assertEquals(kelvin, result, 0.01);
    }

    @Test
    @Parameters({"45, -228.15", "309.75, 36.6", "-56, -329.15"})
    public void convertKtoC(double kelvin, double degreesCelsius) {
        double result = converter.convertKtoC(kelvin);
        assertEquals(degreesCelsius, result, 0.01);
    }

    @Test
    @Parameters({"12, 262.03", "-15, 247.03", "-500, -22.40"})
    public void convertFtoK(double degreesFahrenheit, double kelvin) {
        double result = converter.convertFtoK(degreesFahrenheit);
        assertEquals(kelvin, result, 0.01);
    }

    @Test
    @Parameters({"0, -459.67", "-30, -513.67", "100, -279.67"})
    public void convertKtoF(double kelvin, double degreesFahrenheit) {
        double result = converter.convertKtoF(kelvin);
        assertEquals(degreesFahrenheit, result, 0.01);
    }
}