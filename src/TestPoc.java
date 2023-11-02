public class TestPoc {
    public void displayVersion(int version)
    {
        System.out.println("initial commit- 1.0"+ version);
    }

    public void displayName() {
            System.out.println("second commit- 02");
    }
        public void diplayExpiryDat(){
            System.out.println("fouth commit - 04" );
        }

    public static void main(String args[]) {
        TestPoc testPoc = new TestPoc();
        testPoc.displayVersion(01);
        testPoc.displayName();
        testPoc.diplayExpiryDat();


    }


}
