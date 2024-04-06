package builder.manual;

import builder.builder.Builder;

public class ManualBuilder implements Builder{

    private Manual manual = new Manual();

    @Override
    public void reset() {
        this.manual = new Manual();
    }

    @Override
    public void setSeats(int seats) {

    }

    @Override
    public void setEngine(String engine) {

    }

    @Override
    public void setTripComputer() {

    }

    @Override
    public void setGPS() {

    }

    public Manual getResult() {
        return this.manual;
    };

}