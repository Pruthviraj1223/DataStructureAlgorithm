package threadProgram;

import com.sun.nio.file.SensitivityWatchEventModifier;

import java.util.ArrayList;
import java.util.EnumMap;
import java.util.EnumSet;

class Parent
{



    void Print()
    {

        // Print statement
        System.out.println("parent class");
    }

    void dis()
    {
        System.out.println("Parent display");
    }
}



class Child extends Parent
{


    void dis()
    {
        System.out.println("child display");
    }
}




public class Thread1
{

    public static void main(String[] args) throws Exception
    {
        var val = Pruthvi.Animal.values();


        System.out.println(Pruthvi.Animal.COW.getName());



    }
}
