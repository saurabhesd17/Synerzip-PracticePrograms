public class demo3clone {
    public static void main(String[] args) throws CloneNotSupportedException{
        /**
         * To counter limitations of both shalow and deep copy, we have cloning.
         * However, by default clone method is private.
         * Therefore you have to override it first and made public.
         * Also due to security reasons you have to give specific permission to class
         * for cloning, otherwise it can't be cloned.
         */

         cloning obj1 = new cloning();
         System.out.println(obj1);

         cloning obj2 = (cloning)obj1.clone();
         System.out.println(obj2);

    }
}

/**
 * Here we need to implement cloneable interface otherwise we can't clone the class cloning.
 */
class cloning implements Cloneable{
    int i = 70;
    int j = 80;

    @Override
    public String toString(){
        return "i= "+i+" j= "+j;
    }

    @Override
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}
