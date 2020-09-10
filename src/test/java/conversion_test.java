import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class conversion_test {
    @Test
    public void create_constructers() {
        // Arrange
        double fh = 0.0;
        double celcius = 0.0;
        // Act
        Fahrenheit_to_celcius_Converter Fc = new Fahrenheit_to_celcius_Converter(fh);
        Celcius_to_fahrenheit_converter Cf = new Celcius_to_fahrenheit_converter(celcius);
        // Assert
        Assertions.assertNotNull(Fc);
        Assertions.assertNotNull(Cf);
    }

    @Test
    public void assert_convert_not_null(){
        // Arrange
        double fh = 0.0;
        double celcius = 0.0;
        // Act
        Fahrenheit_to_celcius_Converter Fc = new Fahrenheit_to_celcius_Converter(fh);
        Celcius_to_fahrenheit_converter Cf = new Celcius_to_fahrenheit_converter(celcius);
        // Assert
        Assertions.assertNotNull(Fc.Convert_fahrenheit_to_celcius());
        Assertions.assertNotNull(Cf.Converter_celcius_to_fahrenheit());
    }

    @Test
    public void convert_celcius_to_fahrenheit(){
        // Arrange
        double celcius = 30.0;
        double expected_fahrenheit = 86.0000;
        double celcius_zero = 0.0;
        double excpected_fahrenheit_zero = 32.0000;
        // Act
        Celcius_to_fahrenheit_converter Cf = new Celcius_to_fahrenheit_converter(celcius);
        Celcius_to_fahrenheit_converter Cf_zero = new Celcius_to_fahrenheit_converter(celcius_zero);
        // Assert
        Assertions.assertEquals(expected_fahrenheit, (Cf.Converter_celcius_to_fahrenheit()));
        Assertions.assertEquals(excpected_fahrenheit_zero, (Cf_zero.Converter_celcius_to_fahrenheit()));
    }

    @Test
    public void convert_fahrenheit_to_celcius() {
        // Arrange
        double fh = 30.0;
        double expected_celcius = -1.1111;
        double fh_zero = 0.0;
        double expected_zero_celcius = -17.7778;
        // Act
        Fahrenheit_to_celcius_Converter Fc = new Fahrenheit_to_celcius_Converter(fh);
        Fahrenheit_to_celcius_Converter Fc_zero = new Fahrenheit_to_celcius_Converter(fh_zero);
        // Assert
        Assertions.assertEquals(expected_celcius, Fc.Convert_fahrenheit_to_celcius());
        Assertions.assertEquals(expected_zero_celcius, Fc_zero.Convert_fahrenheit_to_celcius());
    }

    @Test
    public void convert_edge_digits_to_fahrenheit(){
        // Arrange
        double celcius_max = Double.MAX_VALUE;
        double celcius_min = Double.MIN_VALUE;
        double expected_max = 9.223372036854776E14;
        double expected_min = 32.0;
        // Act
        Celcius_to_fahrenheit_converter Cf_max = new Celcius_to_fahrenheit_converter(celcius_max);
        Celcius_to_fahrenheit_converter Cf_min = new Celcius_to_fahrenheit_converter(celcius_min);
        // Assert
        Assertions.assertEquals(expected_max, Cf_max.Converter_celcius_to_fahrenheit());
        Assertions.assertEquals(expected_min, Cf_min.Converter_celcius_to_fahrenheit());
    }

    @Test
    public void convert_edge_digits_to_celcius() {
        // Arrange
        double fh_max = Double.MAX_VALUE;
        double fh_min = Double.MIN_VALUE;
        double expected_max = 9.223372036854776E14;
        double expected_min = -17.7778;
        // Act
        Fahrenheit_to_celcius_Converter Fc_max = new Fahrenheit_to_celcius_Converter(fh_max);
        Fahrenheit_to_celcius_Converter Fc_min = new Fahrenheit_to_celcius_Converter(fh_min);
        // Assert
        Assertions.assertEquals(expected_max, Fc_max.Convert_fahrenheit_to_celcius());
        Assertions.assertEquals(expected_min, Fc_min.Convert_fahrenheit_to_celcius());
    }

}
