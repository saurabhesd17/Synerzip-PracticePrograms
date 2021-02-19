public class demo1shalowcopy {
    public static void main(String[] args) {
        /**
         * Shallow copying is a technique to copy contents of one objects to another.
         * Suppose we have obj1 which has two values and 
         * we want to copy those values into another object
         * then we can write obj2 = obj1.
         * However, obj2 only points to the address of the obj1 
         * It's not storing actual data.
         * So when you change the data in obj2, it will also change obj1.
         */

         shalow obj1 = new shalow();
         System.out.println(obj1);

         shalow obj2 = obj1;
         System.out.println(obj2);

         obj2.i = 17;
         obj2.j = 23;
         System.out.println("obj1 "+obj1);
         System.out.println("obj2 "+obj2);
         
    }
}

class shalow{
    int i = 10;
    int j = 20;

    public String toString(){
        return "i= "+i+" j= "+j;
    }
}
