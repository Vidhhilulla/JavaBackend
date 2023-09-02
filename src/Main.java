public class Main {
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

        box<Integer> integerBox=new box<>();

        integerBox.setProp(123);
        System.out.println(integerBox.getProp()*100);

        box<String> stringbox=new box<>();
        stringbox.setProp("hello");
        String s= stringbox.getProp()+" Kinjala";
        System.out.println(s);



    }
}