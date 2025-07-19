public class Sample08_StringDemo {
    public static void main(String args[]) {
        String banner ="Welcome to ".concat("SEECODER");

        int len = banner.length();
        System.out.println( "Length of the banner: " + len );

        String substr = banner.substring(0,7);
        System.out.println(substr);

        String[] subs = banner.split(" ");
        for(String s : subs){
            System.out.println(s);
        }
    }
}