
package astrolife.IJSE.DBConnection;


public class A {
    private static A a;
    private A(){}
    
    public static A getInstance(){
        if(a==null){
            a= new A();
        }
        return a;
    }
    
}


class Demo{
    public static void main(String[] args) {
        A a1= A.getInstance();
        A a2= A.getInstance();
        System.out.println(a1==a2);
    }
}
