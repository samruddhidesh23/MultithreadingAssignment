public class static111 {

    int x=10;
    int j;
    int t=11;
    //sout//errror


    public static void main(String[] args) {
        static111 s = new static111();
        System.out.println(s.x);
       // System.out.println(x);non static can not access in static without object
        System.out.println(s.j);

        int y=1;//here we have to initialised variable
        System.out.println(y);
        //System.out.println(t);

//        for(int i=0;i<2;i++){
//            System.out.println(t);
//        }

        //opt last:static111@7b23ec81
        //static111@7b23ec81

    }
}
