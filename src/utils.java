public class utils {

    public static boolean compareStrings(String s1,String s2)
    {
        return (s1.equals(s2));
    }

    public static <K,V> boolean comparePairValues(Pair <K,V> p1,Pair <K,V> p2)
    {
        return (p1.getValue().equals(p2.getValue()));
    }


    public static <T> boolean compareBoxProp(box <T>b1,box <T>b2)
    {
        return b1.getProp().equals(b2.getProp());
    }

    public static <T> Integer compareBuildingFloor(Building <T>b1,Building <T>b2)
    {
        if(b1.getFloor().equals(b2.getFloor()))
        {
            return 1;
        }
        return 0;


//            contril+alt+l=>gives indentation

    }


}
