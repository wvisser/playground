public class EqTest {
    public boolean eqOp() {
        String s = "abc";
        if (s != null) { //should not flag
            if (s == "def") { //should flag
                return true;
            }
        }
        return false;
    }
}
