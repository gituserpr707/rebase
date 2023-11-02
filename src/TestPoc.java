public class TestPoc {
    public void displayVersion(int version)
    {
        System.out.println("initial commit- 1.0"+ version);
    }

    public void displayName() {
            System.out.println("second commit- 02");
    }

    public void displayManufacturedDate(String date)
    {
        System.out.println("third commit- 3.0"+date);
    }
        public void diplayExpiryDat(){
            System.out.println("fouth commit - 04" );
        }

    public static void main(String args[]) {
        TestPoc testPoc = new TestPoc();
        testPoc.displayVersion(01);
        testPoc.displayManufacturedDate("02-11-23");
        testPoc.displayName();
        testPoc.diplayExpiryDat();
        System.out.println("added changes after creating feature branch");

    }


}
