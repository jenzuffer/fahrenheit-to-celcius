public class Fahrenheit_to_celcius_Converter {
    public double fahrenheit;

    public Fahrenheit_to_celcius_Converter(double fahrenheit) {
        this.fahrenheit = fahrenheit;
    }

    public double Convert_fahrenheit_to_celcius() {
        double converter = (this.fahrenheit - 32.0) * 5.0 / 9.0;
        return (double) Math.round(converter * 10000) / 10000;
    }
}
