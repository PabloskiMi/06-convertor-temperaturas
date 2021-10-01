package clases;

public class Medida {

    private double centigrados;
    private double kelvin;
    private double fahrenheit;

    public Medida(double centigrados) {
        
        this.centigrados = centigrados;
        
    }

    

    public double getCentigrados() {
        return centigrados;
    }

    public void setCentigrados(double centigrados) {
        this.centigrados = centigrados;
    }

    public double getKelvin() {
        return kelvin;
    }

    public void setKelvin(double kelvin) {
        this.kelvin = kelvin;
    }

    public double getFahrenheit() {
        return fahrenheit;
    }

    public void setFahrenheit(double fahrenheit) {
        this.fahrenheit = fahrenheit;
    }

    public double convertirKelvin() {
        
        kelvin = centigrados + 273.15;

        return kelvin;
        
    }
    
    public double convertirFahrenheit(){
        
        fahrenheit = (centigrados * (1.8)) + 32;
        
        return fahrenheit;
    }

}
