public class Celcius_to_fahrenheit_converter {
    public double celcius;

    public Celcius_to_fahrenheit_converter(double celcius) {
        this.celcius = celcius;
    }

    public double Converter_celcius_to_fahrenheit() {
        double converter = (this.celcius * (9.0 / 5.0) + 32.0);
        return (double) Math.round(converter * 10000) / 10000;
    }
}
