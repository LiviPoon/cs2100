import java.lang.Math;
public class Odometer {
    private int currentMileage;
    private int maxMileage = 999999;
    
    private void setMileage(int m){
        if(m<0){
            this.currentMileage = Math.abs(m);
        }

        else if (m > maxMileage){
            this.currentMileage = m - maxMileage;
        }

        else{
            this.currentMileage = m;
        }
    }

    public Odometer(int miliage){
        setMileage(miliage);
    }

    public void addMileage(int milesDriven){
        if ((milesDriven+currentMileage)>=maxMileage){
            setMileage(milesDriven);
        }
    }

    

    @Override
    public String toString(){
        return String.format("Mileage: %d miles ", this.currentMileage);
    }


}
