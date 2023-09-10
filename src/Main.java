import java.awt.*;
import java.util.ArrayList;
import java.util.Collection;

public class Main
{
    public static void main(String[] args)
    {
//        box b1=new box();
//        b1.setProp("HELLO");
//        System.out.println(b1.getProp());
//
//        b1.setProp("23");
//        System.out.println(b1.getProp());

//        Integer value=(Integer) b1.getProp();
//        System.out.println(value*100);

//        here,we are passing 23 in a String
//        Even though String contains integer

//        Use this

//        String value=(String) b1.getProp();
//        Integer value1=Integer.parseInt(value);
//        System.out.println(value1);

//        box<Integer> integerBox=new box<>();
//
//        integerBox.setProp(123);
//        System.out.println(integerBox.getProp()*100);
//
//        box<String> stringbox=new box<>();
//        stringbox.setProp("hello");
//        String s= stringbox.getProp()+" Kinjala";
//        System.out.println(s);

//        10th September:

//        I created a default constructor afterwards
//        box b5=new box();
//        b5.setProp("HELLO");
//        System.out.println(b5.getProp());







//        This line creates an exception due to usage of raw type.
//        Integer converted=(Integer)b5.getProp();


//        b5.setProp;






//        Pair<String,Integer> pair1=new Pair<>("A",1);
//        Pair<String,Integer> pair2=new Pair<>("B",2);
//        Pair<Integer,Integer> pair3=new Pair<>(3,3);
//        Pair<Integer,Integer> pair4=new Pair<>(4,4);


//        box <String> b1=new box<>("1");
//        box <String> b2=new box<>("1");
//        box <Integer> b3=new box<>(1);
//        box <Integer> b4=new box<>(1);



//        System.out.println(utils.comparePairValues(pair1,pair2));
//        System.out.println(utils.compareBoxProp(b1,b2));
//        System.out.println(utils.compareBoxProp(b3,b4));





//        System.out.println(utils.<String,Integer>comparePairValues(pair1,pair2));
//        Here,this becomes grey means it is bydefault understood
//            it is wgat we are going to send ke datatypes ehich it infers from pair1,pair2<String,Integer>

//        Building<Integer> b1=new Building<>(1);
//        Building<Integer> b2=new Building<>(1);
//        Building<Integer> b3=new Building<>(3);
//
//        System.out.println(utils.compareBuildingFloor(b1,b2));

//
//        Child c=new Child();
//        c.perform1();
//        c.perform2();
//        Base b=new Child();
//        b.perform1();

//        b.perform2();
//        b.perform2 will not work since the reference is of parent
//        And the parent doesnot have perform2



        Collection<Integer> collection=new ArrayList<>();
        collection.add(1);
        collection.add(2);
        collection.add(3);
        collection.add(4);

        for(Integer elem:collection)
        {
            System.out.println(elem);
        }

//        collection.get();
//        Now,Arraylist does have get method but because of reference of collection,it is not able to access it
//        Since Collection doesnot have get

        Child c=new Child();
        Base b=new Child();

        System.out.println(c.sharedVariable);
        System.out.println(b.sharedVariable);

//        Properties ⇒reference eg(member variable)
//        Functions⇒Object eg(perform1())































    }
//    public static <K,V> boolean(Pair<K,V> p1,Pair <K,V> p2)
//    {
////        return p1.equals(p2.getValue());
//    }
}