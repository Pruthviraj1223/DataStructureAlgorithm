package linkedList;


import java.io.*;

class OuterClass implements Serializable
{
   int a=10;

   int num=0;


    OuterClass(int num)
    {
        System.out.println("called");

        this.num = num;
    }

   void display()
   {
       System.out.println(a + " " + num);
   }
}


 public class add1toNumber
 {
      static  public void main(String[] args) throws IOException, ClassNotFoundException {

          var object1 = new OuterClass(14);

          object1.display();

          new ObjectOutputStream(new FileOutputStream("/root/IdeaProjects/DataStructureAlgorithm/src/main/java/object1.ser")).writeObject(object1);

          var object2 =  (OuterClass) new ObjectInputStream(new FileInputStream("/root/IdeaProjects/DataStructureAlgorithm/src/main/java/object1.ser")).readObject();

          object2.display();


      }
}
