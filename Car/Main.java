import javafx.scene.paint.Color;

public class Main {
    public static void main(String[] arg) {
    }

}

//Виды кузова
enum TypeCar {

    SEDAN,
    PICKUP
}

//Виды топлива
enum TypeFuel {

    GASOLINE,
    DISEL
}

//Виды КПП
enum TypeGearBox {

    MT,
    AT
}

//Описывает класс машина (из чего она состоит)
abstract class Car {
    private String make;
    private String model;
    private Color color;
    private TypeCar bodyType;
    private int numberWheels;
    private TypeFuel fuelType;
    private TypeGearBox gearboxType;
    private double engineCapacity;



    //Методы:
    //Движение
    //Обслуживание
    //Переключение КПП
    //Переключение основного света
    //Переключение дворников
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



    //Метод якорь
    //public void sweeping(){}



    //Метод установки марки ТС                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  
    public void setMake(String make) {
        this.make = make;
    }

    public String getMake() {
        return make;
    }



    //Метод установки модели ТС
    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }



    //Метод установки цвета ТС
    public void setColor(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }



    //Метод установки кузова ТС
    public void setBodyType(TypeCar bodyType) {
        this.bodyType = bodyType;
    }

    public TypeCar getBodyType() {
        return bodyType;
    }



    //Метод установки кол-ва колес ТС
    public void setNumberWheels(int numberWheels) {
        this.numberWheels = numberWheels;
    }

    public int getNumberWheels() {
        return numberWheels;
    }



    //Метод установки топлива ТС
    public void setFuelType(TypeFuel fuelType) {
        this.fuelType = fuelType;
    }

    public TypeFuel getFuelType() {
        return fuelType;
    }



    //Метод установки КПП ТС
    public void setGearboxType(TypeGearBox gearboxType) {
        this.gearboxType = gearboxType;
    }

    public TypeGearBox getGearboxType() {
        return gearboxType;
    }



    //Метод установки мощности двигателя ТС
    public void setEngineCapacity(double engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }

}

//Интерфейс заправки
interface Refuling
{
    void fuel();
}

//Интерфейс очистки лобового стекла, основного света и зеркал
interface Wiping
{
    void wipWindShield();
    void wipHeadLights();
    void wipMirrors();
}




