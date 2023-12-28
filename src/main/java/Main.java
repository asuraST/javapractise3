package main.java;

import main.java.exception.CheckedException;
import main.java.exception.UncheckedException;

public class Main {
    public static void main(String[] args){
        UncheckedException obj1 = new UncheckedException();// This will create an obj of  UncheckedException
        CheckedException obj2 = new CheckedException(); // This will create an obj of  checkedException
        System.out.println(" -------All Unchecked Exceptions-------");
        obj1.throwUncheckedException();
        System.out.println(" -------All Checked Exceptions-------");
        obj2.throwcheckedExption();
    }
}
