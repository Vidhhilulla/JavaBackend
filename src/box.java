public class box<T> {

    public T getProp() {
        return prop;
    }

    public void setProp(T prop) {
        this.prop = prop;
    }

    public box(T prop)
    {
        this.prop = prop;
    }

    private T prop;
}






