package polymorphism;

/**
 * Created by @techieasif on April, 2020
 */

//Polymorphism Challenge

class Car {
    private String name;
    private int cylinders;
    private int wheels;
    private boolean engine;

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.engine = true;
        this.wheels = 4;
        this.name = name;
    }

    public String startEngine() {
        return "Starting engine in Base Class";
    }

    public String accelerate() {
        return "Accelerating Car in Base class";
    }

    public String brake() {
        return "Applying Brakes in Base Class";
    }

    public String getName() {
        return name;
    }

    public int getCylinders() {
        return cylinders;
    }

    public int getWheels() {
        return wheels;
    }

    public boolean isEngine() {
        return engine;
    }
}

class MiniCooper extends Car {

    MiniCooper() {

        super(2, "MiniCooper");
    }

    @Override
    public String startEngine() {
        return "Starting engine of " + getName();
    }

    @Override
    public String accelerate() {
        return "Accelerating " + getName();
    }

    @Override
    public String brake() {
        return "Applying Brakes " + getName();
    }
}

class RangeRover extends Car {
    RangeRover() {
        super(2, "Range Rover");
    }

    @Override
    public String startEngine() {
        return "Starting Engine " + getName();
    }

    @Override
    public String brake() {
        return "Applying Brakes " + getName();
    }

    @Override
    public String accelerate() {
        return "Accelerating  " + getName();
    }
}

class Jaguar extends Car {
    Jaguar() {
        super(2, "Jaguar");
    }

    @Override
    public String startEngine() {

        return "Starting Engine " + getClass().getSimpleName(); //getting class name using Object class
    }

    @Override
    public String brake() {
        return "Applying Brakes " + getName();
    }

    @Override
    public String accelerate() {
        return "Accelerating  " + getName();
    }
}

public class Challenge {
    public static Car cars() {
        int random = (int) (Math.random() * 3) + 1;
        System.out.println("got number : " + random);

        switch (random) {
            case 1:
                return new MiniCooper();
            case 2:
                return new RangeRover();
            case 3:
                return new Jaguar();
        }
        return null;
    }

    public static void main(String[] args) {
        for (int i = 1; i < 11; i++) {
            Car car = cars();
            System.out.println("***-----------------------" + car.getName() + " CAR Details ---------------- ***");
            System.out.println("- name :" + car.getName());
            System.out.println("- Cylinder :" + car.getCylinders());
            System.out.println("- " + car.startEngine());
            System.out.println("- " + car.accelerate());
            System.out.println("- " + car.brake());


        }
    }
}
