public class Building <T>
{

    public T getFloor()
    {
        return Floor;
    }

    public void setFloor(T floor)
    {
        this.Floor = floor;
    }


    public Building(T floor) {
        this.Floor = floor;
    }

    private T Floor;

}
