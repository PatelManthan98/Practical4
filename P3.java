public class P3
{
    public static void main(String[] args) {
        try{
            int s= 33/0;
            System.out.println(s);
        }
        catch(ArithmeticException e){
            System.out.println("Divide By zero");
        }
        finally{
            System.out.println("Finally must be execute");
        }
        try{
            int b[]= {1,2,3,4,5};
            System.out.println(b[7]);
        }

        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("The Array is  out of range");
        }

    }
}
