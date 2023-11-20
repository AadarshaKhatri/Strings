public class Methods {
    public static void main(String[] args) {
        String x = "adars";
        String y = "ADARS";
        // compares the string and gives boolean value
        System.out.println(x.equals(y));

        // compares the string while ignoring the case
        System.out.println(x.equalsIgnoreCase(y));

        // changes the character to lower case
        System.out.println(y.toLowerCase());

        // changes the character to upper case
        System.out.println(x.toUpperCase());

        // gives the length
        System.out.println(x.length());

        // character haru ko index dincha
        System.out.println(x.indexOf("a"));
        System.out.println(x.indexOf("w"));

        // index ma bhako character haru ko value dincha
        System.out.println(y.charAt(3));


        // combines both the string
        System.out.println(x.concat(y));

        // replace
        System.out.println(x.replace('a','e'));

        //slicing
        System.out.println(x.substring(0));

    }
}
