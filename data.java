/*
    Type Conversion

    Numeric Primitive casting  

    Numeric primitive casting can be cast in two ways.
    Implicit casting happens when the source type has smaller range then the target type .
*/ 
public class data {
    public static void main(String[] args)
    {
        //Implicit casting 
        byte byteVar = 42;
        short shortVar = byteVar;
        int intVar = shortVar;
        long longVar = intVar;
        float floatVar = longVar;
        double doubleVar = floatVar;
        System.out.print("\n\tbyte = " +byteVar);
        System.out.print("\n\tshort = " +shortVar);
        System.out.print("\n\tint = " +intVar);
        System.out.print("\n\tlong = " +longVar);
        System.out.print("\n\tfloat = " +floatVar);
        System.out.print("\n\tdouble = " +doubleVar);
    } 
}
