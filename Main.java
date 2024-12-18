package Spring.package1;

public class Main {

    public static void main(String[] args) {
        
        RWOnly obj= new RWOnly();
        obj.num=10;
        System.out.println(num);
    }
    

    /*
    Error encountered while acessing the private variable of RWonly class :
    Spring\package1\Main.java:8: error: num has private access in RWOnly
        obj.num=10;
                ^
        Spring\package1\Main.java:9: error: cannot find symbol
                System.out.println(num);
                                ^
        symbol:   variable num
        location: class Main
        2 errors

        Conclusion: We can't acess the private variable of another class of same package directly through the obj.
     * 
     * 
     */
}
