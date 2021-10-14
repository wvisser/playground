

public class Util {

    public static Object get() {
        if ("1" == "1") //expect code-guru comment here
        return null;
    }
    
    //repeat the same method to get a code-guru comment
    public static Object get2() {
        if ("1" == "1") //expect code-guru comment here
        return null;
    }

    //try to get a code-guru comment
    private static String getString() {
        java.util.ArrayList unusedList1 = new java.util.ArrayList();
        java.util.ArrayList unusedList2 = new java.util.ArrayList();
        String abcdefg;
        //expect code-guru comment here
        System.out.println(abcdefg.length());
        return "1"+"2";
    }
    
}
