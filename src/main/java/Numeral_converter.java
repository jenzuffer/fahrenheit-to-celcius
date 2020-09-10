import java.util.Collection;
import java.util.Collections;

public class Numeral_converter {
    public int number;

    public Numeral_converter(int number) {
        this.number = number;
    }

    public String Convert_number_to_roman_numeral() {
        //https://stackoverflow.com/questions/12967896/converting-integers-to-roman-numerals-java
        //requires a version of java newer than 7 to accept lamdba expressions
        int max_cap = 99999;
        if (this.number < 1 || this.number > max_cap) return "Illegal input";
        return String.join("", Collections.nCopies(this.number, "I"))
                .replace("IIIII", "V")
                .replace("IIII", "IV")
                .replace("VV", "X")
                .replace("VIV", "IX")
                .replace("XXXXX", "L")
                .replace("XXXX", "XL")
                .replace("LL", "C")
                .replace("LXL", "XC")
                .replace("CCCCC", "D")
                .replace("CCCC", "CD")
                .replace("DD", "M")
                .replace("DCD", "CM");
    }

}
