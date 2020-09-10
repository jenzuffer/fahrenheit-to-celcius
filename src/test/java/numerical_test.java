import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.function.ThrowingSupplier;
import org.junit.platform.engine.support.hierarchical.ThrowableCollector;

import java.io.IOError;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class numerical_test {
    @Test
    public void create_constructers() {
        // Arrange
        int number = 0;
        // Act
        Numeral_converter Nc = new Numeral_converter(number);
        // Assert
        Assertions.assertNotNull(Nc);
    }

    @Test
    public void assert_numbers_to_roman(){
        // Arrange
        int number = 1;
        int number_2 = 2;
        int number_25 = 25;
        int number_150 = 150;
        int number_4000 = 4000;
        int number_99999 = 99999;
        String expected_result = "I";
        String expected_result_2 = "II";
        String expected_result_25 = "XXV";
        String expected_result_150 = "CL";
        String expected_result_4000 = "MMMM";
        String expected_result_99999 = "MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMCMXCIX";
        // Act
        Numeral_converter Nc = new Numeral_converter(number);
        Numeral_converter Nc_2 = new Numeral_converter(number_2);
        Numeral_converter Nc_25 = new Numeral_converter(number_25);
        Numeral_converter Nc_150 = new Numeral_converter(number_150);
        Numeral_converter Nc_4000 = new Numeral_converter(number_4000);
        Numeral_converter Nc_99999 = new Numeral_converter(number_99999);
        // Assert
        Assertions.assertEquals(expected_result, Nc.Convert_number_to_roman_numeral());
        Assertions.assertEquals(expected_result_2, Nc_2.Convert_number_to_roman_numeral());
        Assertions.assertEquals(expected_result_25, Nc_25.Convert_number_to_roman_numeral());
        Assertions.assertEquals(expected_result_150, Nc_150.Convert_number_to_roman_numeral());
        Assertions.assertEquals(expected_result_4000, Nc_4000.Convert_number_to_roman_numeral());
        Assertions.assertEquals(expected_result_99999, Nc_99999.Convert_number_to_roman_numeral());
    }

    @Test
    public void Assert_edge_cases_not_throwing_exception(){
        // Arrange
        int number = -1;
        int number_max_int = Integer.MAX_VALUE;
        int number_min_int = Integer.MIN_VALUE;
        int arimathic_exception_int = 0;
        String expected_illegal_input = "Illegal input";
        // ACt
        Numeral_converter Nc_negative = new Numeral_converter(number);
        Numeral_converter Nc_max_int = new Numeral_converter(number_max_int);
        Numeral_converter Nc_min_int = new Numeral_converter(number_min_int);
        Numeral_converter Nc_arimathic_exception = new Numeral_converter(arimathic_exception_int / 9);
        //Assert
        Assertions.assertEquals(expected_illegal_input, Nc_negative.Convert_number_to_roman_numeral());
        Assertions.assertNotNull(Nc_max_int);
        Assertions.assertNotNull(Nc_min_int);
        Assertions.assertEquals(expected_illegal_input, Nc_max_int.Convert_number_to_roman_numeral());
        Assertions.assertEquals(expected_illegal_input, Nc_min_int.Convert_number_to_roman_numeral());
        Assertions.assertNotNull(Nc_arimathic_exception);

    }

}
