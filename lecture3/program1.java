package lecture3;

public class program1 {
    public static void main(String[] args) {
        
        System.out.println(" - - - ");
        Object o = 1; 
        GetType(o); // java.lang.Integer
    
        System.out.println(" - - - ");
        o = 1.2; 
        GetType(o); // java.lang.Double
    
        System.out.println(" - - - ");
        o = 1.2f; 
        GetType(o);

        System.out.println(" - - - ");
        var d = 5;
        o = d; 
        GetType(o);

    }
        
    static void GetType(Object obj) {

    System.out.println(obj.getClass().getName());
    
    }
}
