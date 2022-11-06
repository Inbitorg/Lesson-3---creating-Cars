//Класс Пикап расширяет Car и реализет методы заправки и очистки
class PickUp extends Car implements Refuling, Wiping
{
    private int loadCapacity;

    //Переопределить метод завправки, очистки лобового стекла, основного света и зеркал
    @Override
    public void fuel(){}
    public void wipWindShield(){}
    public void wipHeadLights(){}
    public void wipMirrors(){}
    



    //Позволяет хранить значение мощности двигателя
    public int getLoadCapacity() {
        return loadCapacity;
    }

    //Метод установки мощности двигателя
    public void setLoadCapacity(int loadCapacity) {
        this.loadCapacity = loadCapacity;
    }



}




//Класс Футуристичное ТС расширяет Car
class FutureCar extends Car
{
    FutureCar()
    {
        //Устоновить кол-во колес на ТС (3)
        this.setNumberWheels(3);
    }

    //Переопределить метод движения (полет)
    @Override
    public void movement()
    {
        fly();
    }

    private void fly(){}

}

//Могу ошибаться в функциях 