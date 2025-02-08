package src.org;

public class Car {
    private String make;
    private String model;
    private int year;
    public Car(String make, String model, int year){
        this.make=make;
        this.model=model;
        this.year=year;}

        public void getmake(String make){
            this.make=make;
        }
        public void setModel(String model) {
            this.model = model;
        }

        public void setyear(int year){
            this.year=year;
        }
        public String getmake(){
        return make;


    }
    public String getmodel() {
        return model;

    }
    public int getyear(){
        return year;

    }
    public void startEngine(){
        System.out.println("The engine of " + make + " " + model + " has started.");

    }


    }

