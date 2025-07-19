public class Sample05_Loop {
    public static void whileLoop(){
        int x = 1;
        while( x < 10 ) {
            System.out.print("value of x : " + x );
            x++;
            System.out.print("\n");
        }

    }
    public static void doWhileLoop(){
        int x = 1;

        do{
            System.out.print("value of x : " + x );
            x++;
            System.out.print("\n");
        }while( x < 10 );
    }
    public static void forLoop(){
        for(int x = 1; x < 10; x = x+1) {
            System.out.print("value of x : " + x );
            System.out.print("\n");
        }
    }

    public static void breakContinue(){
        int [] numbers = {10, 20, 30, 40, 50};

        for(int x : numbers ) {
            // x 等于 30 时跳出循环
            if( x == 30 ) {
                break;
            }
            System.out.print( x );
            System.out.print("\n");
        }
        System.out.print("----------------\n");
        for(int x : numbers ) {
            if( x == 30 ) {
                continue;
            }
            System.out.print( x );
            System.out.print("\n");
        }

    }

    public static void main(String args[]) {
        whileLoop();
        doWhileLoop();
        forLoop();
        breakContinue();
    }
}
