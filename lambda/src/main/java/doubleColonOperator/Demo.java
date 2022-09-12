package doubleColonOperator;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Demo {
    public static void main(String[] args) {
        // Reference to a static method
        Calculate s1= (x,y)-> Calculator.findSum(x,y);
        s1.calculate(10,2);
        Calculate s2= Calculator::findSum;
        s2.calculate(20,22);
       // Reference to instance method
        Calculate m1=(x,y) -> new Calculator().findMultiply(x,y);
        m1.calculate(5,6);
        Calculator obj=new Calculator();
        Calculate m2= obj::findMultiply;
        m2.calculate(2,4);
        BiFunction<String,Integer,String> fn=(str,i)->str.substring(i);
        System.out.println(fn.apply("Developer",6));
        BiFunction<String,Integer,String> fn2=String::substring;
        System.out.println(fn2.apply("Developer",3));
        BiFunction<MyClass,Integer,Double>v2=MyClass::method;
        BiFunction<String,String,String>v3=String::concat;
        System.out.println(v2.apply(new MyClass(),2));
        Function<Integer,Double> nn=new MyClass()::method;
        System.out.println(nn.apply(4));
        BiFunction<MyClass,Integer,Double>aa=MyClass::method;
        BiFunction<String,String,String>bb=String::concat;


    }
}
