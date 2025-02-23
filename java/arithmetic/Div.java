package arithmetic;
public class Div implements ArithmeticOperation{
    @Override
    public double operation(double a,double b){
      if (b==0){
        System.err.println("Zero Division Error");
       }
     return a/b;
       
    }
}