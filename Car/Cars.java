class PickUp extends Car implements Refuling, Wiping
{
    private int loadCapacity;

    @Override
    public void fuel(){}
    public void wipWindShield(){}
    public void wipHeadLights(){}
    public void wipMirrors(){}
    




    public int getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(int loadCapacity) {
        this.loadCapacity = loadCapacity;
    }



}





class FutureCar extends Car
{
    FutureCar()
    {
        this.setNumberWheels(3);
    }

    @Override
    public void movement()
    {
        fly();
    }

    private void fly(){}

}