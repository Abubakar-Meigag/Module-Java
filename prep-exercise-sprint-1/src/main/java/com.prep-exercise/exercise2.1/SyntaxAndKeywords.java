
public class SyntaxAndKeywords {

    public static void main(String[] args) {

        // integral types
        byte by  = 121; // byte range is -128 to 127
        short sh = 3333; // short range is -32,768 to 32,767
        int in   = 123456; // int range is -2,147,483,648 to 2,147,483,647
        long lo  = 123456789L; // long range is -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807

        // flot point types
        float fl    = 12.34f; // float range is approximately ±3.40282347E+38F
        double dbl  = 12.3456789; // double range is approximately ±1.79769313486231570E+308 (15 significant decimal digits)

        // character and boolean types
        char ch      = 'a';
        boolean bool = true;


        System.out.println("integral types:");
        System.out.println("byte: " + by);
        System.out.println("short: " + sh);
        System.out.println("int: " + in);
        System.out.println("long: " + lo);

        System.out.println("floating point types:");
        System.out.println("float: " + fl);
        System.out.println("double: " + dbl);

        System.out.println("character and boolean types:");
        System.out.println("char: " + ch);
        System.out.println("boolean: " + bool);

    }
}