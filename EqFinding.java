public class EqFinding {
    public boolean eqOp() {
        String s = "abc";
        if (s != null) { //should not flag
            if (s == "abc") { //should flag
                return true;
            }
        }
        return false;
    }
    
    public boolean eqOp2() {
        String s = "abc";
        if (s != null) { //should not flag
            if (s == "abc") { //should flag
                return true;
            }
        }
        return false;
    }
}
