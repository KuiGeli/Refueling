public class FuelTank {

    private double tank = 0;
    private double priceOfFuel = 5.5;

    public void fueling (double petrol){

        tank = tank + petrol;

    }

    public String toString (){

        return String.valueOf("Your tank has " + tank + "L of fuel in it.");

    }

    public double costOfRefuel(){

        return tank * priceOfFuel;
    }

    public void setTank(double tank) {
        this.tank = tank;
    }

    public double getTank() {
        return tank;
    }

    public void setPriceOfFuel(double priceOfFuel) {
        this.priceOfFuel = priceOfFuel;
    }

    public double getPriceOfFuel() {
        return priceOfFuel;
    }
}
