package Activity12;

public class ShoeClass {
    double shoesize;
    String Color, Brand;
    // this is a default constuctor
    public ShoeClass(){
        this.shoesize= 0.0;
        this.Color= "defualt Color";
        this.Brand= "default Brand";
    }
    // this is a default constuctor
    public ShoeClass( double shoesize, String Color, String Brand){
        this.shoesize= shoesize;
        this.Color= Color;
        this.Brand= Brand;
    }
    public void display(){
        System.out.println( " The Brand is: " + Brand);
        System.out.println( " The Shoe Size is: " + shoesize);
        System.out.println( " The Color is: " + Color);
        System.out.println();
    }


}
