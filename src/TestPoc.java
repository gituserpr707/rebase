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

    public void displayManufacturedDate(String date)
    {
        System.out.println("third commit- 3.0"+date);
    }
    public static void main(String args[]) {

        TestPoc testPoc = new TestPoc();
        testPoc.displayVersion();
        testPoc.displayManufacturedDate("02-11-23");
        testPoc.displayName();
    }


}
