//Urvin Thummar 21ce145
public class ex5 {
        static int add(int a, int b){return a+b;}
        static double add(double a, double b){return a+b;}
    }
    class TestOverloading2{
        public static void main(String[] args){
            System.out.println(ex5.add(11,11));
            System.out.println(ex5.add(12.3,12.6));
        }}

