import java.util.ArrayList;
public class ShoppingCart {
    private ArrayList<Book> list1;
    private ArrayList<AudioBook> list2;

    public ShoppingCart() { this.list1= new ArrayList<Book>();
        this.list2= new ArrayList<AudioBook>();
    }
    public void addBook (){

    }
    public void removeBook (){

    }
    public double Sum1 (){
        double sum1=0.0;
        return sum1;

    }
    public double Sum2 (){
        double sum2 = 0.0;
        return sum2;
    }
    public double calculateTotal (){
        return Sum1()+Sum2();
    }
    public void payAmount (PaymentMethod payment){

    }
}
