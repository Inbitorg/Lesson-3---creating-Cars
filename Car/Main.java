import javafx.scene.paint.Color;

public class Main {
    public static void main(String[] arg) {
        System.out.println("hello world!");
    }

}

enum TypeCar {

    SEDAN,
    PICKUP
}

enum TypeFuel {

    GASOLINE,
    DISEL
}

enum TypeGearBox {

    MT,
    AT
}

abstract class Car {
    private String make;
    private String model;
    private Color color;
    private TypeCar bodyType;
    private int numberWheels;
    private TypeFuel fuelType;
    private TypeGearBox gearboxType;
    private double engineCapacity;




    public void movement() {
    }

    public void maintenance() {
    }

    public boolean gearShifting() {
        return true;
    }

    public boolean switchHeadlights() {
        return true;
    }

    public boolean switchWipers() {
        return true;
    }



    //метод якорь
    //public void sweeping(){}



    //марка ТС                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    
    public void setMake(String make) {
        this.make = make;
    }

    public String getMake() {
        return make;
    }



    //модель ТС
    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }



    //цвет ТС
    public void setColor(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }



    //тип кузова
    public void setBodyType(TypeCar bodyType) {
        this.bodyType = bodyType;
    }

    public TypeCar getBodyType() {
        return bodyType;
    }



    //кол-во колес
    public void setNumberWheels(int numberWheels) {
        this.numberWheels = numberWheels;
    }

    public int getNumberWheels() {
        return numberWheels;
    }



    //тип используемого топлива
    public void setFuelType(TypeFuel fuelType) {
        this.fuelType = fuelType;
    }

    public TypeFuel getFuelType() {
        return fuelType;
    }



    //тип КПП
    public void setGearboxType(TypeGearBox gearboxType) {
        this.gearboxType = gearboxType;
    }

    public TypeGearBox getGearboxType() {
        return gearboxType;
    }



    //мощность двигателя ТС
    public void setEngineCapacity(double engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }

}

// интерфейс заправки
interface Refuling
{
    void fuel();
}

//интерфейс очистки лобового стекла, основного света и зеркал
interface Wiping
{
    void wipWindShield();
    void wipHeadLights();
    void wipMirrors();
}




