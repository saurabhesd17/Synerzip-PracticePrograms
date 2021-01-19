enum size{
    small("This is small size"),
    medium("This is small size"),
    large("This is small size"),
    extraLarge("This is extra size");

    private String size;
    
    private size(String size){
        this.size = size;
    }

    public String getSize(){
        return size;
    }
}

public class enumDemo {
    public static void main(String[] args) {
        size size1 = size.extraLarge;
        System.out.println(size1.getSize());
    }
}
