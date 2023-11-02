public class TestPoc {
    public void displayVersion()
    {
        System.out.println("initial commit- 1.0");
    }

    public void displayName(){

        {
            System.out.println("second commit- 1.0");
        }
    }
    public static void main(String args[]) {

        TestPoc testPoc = new TestPoc();
        testPoc.displayVersion();
        testPoc.displayName();
    }


}
