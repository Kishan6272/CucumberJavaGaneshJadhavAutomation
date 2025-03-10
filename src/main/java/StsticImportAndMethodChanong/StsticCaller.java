package StsticImportAndMethodChanong;
import AnotherPackage.Demo;
import io.cucumber.java.hu.De;

import  static StsticImportAndMethodChanong.StsticExample.*;

import  static java.lang.System.*;

public class StsticCaller {
    public static void main(String[] args) {

//        doSomething();
//       doSomething1();
//
//       doSomething1();

        out.println(Salary);

        Demo demo=new Demo();

        //StsticExample.doSomething1();

        StsticExample ststicExample=new StsticExample();

        ststicExample.doSomething().doSomething1();

       // demo.d();
    }
}
