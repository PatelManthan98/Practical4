public class P2
{
    static void P2() throws P2exception
    {
        System.out.println("In P2");
        throw new P2exception("User Defined Exception");
    }

    public static void main(String[] args) {
        try{
            P2();
        }
        catch (P2exception e)
        {
            System.out.println(e);
        }
    }
}
