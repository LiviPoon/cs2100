public class Car {
    private String make;
    private String model;
    private Odometer odo;
    private int mpg;
    private FuelGauge gauge;

    public Car(String make, String model, FuelGauge gauge, Odometer odo, int mpg){
        this.make = make;
        this.model = model;
        this.gauge = gauge;
        this.odo = odo;
        this.mpg = mpg;
    }

    public Car(String make, String model, int mpg){
        this.make = make;
        this.model = model;
        this.gauge = new FuelGauge();
        this.odo = new Odometer(0);
        this.mpg = mpg;
    }

    public void drive(int numMiDriven){
        int gasUsed = numMiDriven/mpg;

        while(gasUsed>=0){
            this.gauge.decrementFuel();
            gasUsed--;
        }

        this.odo.addMileage(numMiDriven);
    }
    
    @Override
    public boolean equals(Object c){
      Car car = (Car)c;
      if(this==c) return true;
      if (c == null || getClass() != c.getClass()) return false;
    
        return mpg == car.mpg && FuelGauge.equals(car.FuelGauge) && this.odo.getMileage() == car.odo.getMileage();

    }
    }

    public void fillTank(){
        while(this.gauge.checkFull()==false){
            this.gauge.incrementFuel();
        }
        
    }

    @Override
    public String toString(){
        return String.format("%s%n%s%n%s", this.make, this.gauge.toString(),this.odo.toString());
    }






}
