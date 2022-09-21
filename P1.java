public class P1
{
    public static void main(String[] args) {
        try{
            int p= 25/0;
            System.out.println(p);
            int q[]= {1,2,3,4,5};
            System.out.println(q[7]);
        }
        catch(ArithmeticException e){
            System.out.println("Divide By zero");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array out of range");
        }
        finally{
            System.out.println("Finally must be execute");
        }
    }
}
