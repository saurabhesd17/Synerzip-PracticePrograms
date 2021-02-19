public class demo2deepcopy {
    public static void main(String[] args) {
        /**
         * Deep copy is where we're actually copying all the data from obj1 to obj2.
         * First we create the obj1 then initialize the value.
         * then we create obj2 and  copy all values from obj1 to obj2.
         * since we're creating new object indivisually, second memory space will be created.
         */

        deep obj1 = new deep();
        System.out.println(obj1);

        deep obj2 = new deep();
        obj2.i = obj1.i;
        obj2.j = obj1.j;
        System.out.println(obj2);

        /**
         * As you can see this method of copy is exactly what we want.
         * However, what if class has many values.
         * In that case it's anoying to do all hard coding.
         * Therefore this method is not recommended.
         */
    }
}

class deep{
    int i = 10;
    int j = 12;

    public String toString(){
        return "i= "+i+" j= "+j;
    }
}