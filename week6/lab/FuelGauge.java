import java.lang.Math;

public class FuelGauge{
    private int fuel;
    private int maxFuel = 15;

    public FuelGauge(){
        this.fuel = maxFuel;
    }

    public FuelGauge(int gal){
        if(gal<0){
            this.fuel = Math.abs(gal);
        }

        else if(gal>maxFuel){
            this.fuel = 15;
        }

        else
            this.fuel = gal;
    }

    public int getCurrentFuel(){
        return this.fuel;
    }

    public boolean incrementFuel(){
        if(this.fuel >= 15)
            return false;

        this.fuel++;
        return true;
    }

    public boolean decrementFuel(){
        if(this.fuel <= 0)
            return false;

        this.fuel--;
        return true;
    }

    public boolean checkEmpty(){
        if(this.fuel <=0)
            return true;

        return false;
    }

    public boolean checkFull(){
        if(this.fuel <=15)
            return true;

        return false;
    }

    @Override
    public String toString(){
        return String.format("Gas: %d gallons", this.fuel);
    }

    @Override
    public boolean equals(Object g){
        FuelGauge gauge = (FuelGauge)g;
        return (this.fuel==gauge.fuel);
    }

}
