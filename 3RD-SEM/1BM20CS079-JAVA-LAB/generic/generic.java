import java.lang.*;
import java.util.*;

class Gen<T, V> {

  T ob1;
  V ob2;

  Gen(T x, V y) {
    ob1 = x;
    ob2 = y;
  }

  T getob1() {
    return ob1;
  }

  V getob2() {
    return ob2;
  }

  void showType() {
    System.out.println("T is " + ob1.getClass().getName());
    System.out.println("V is " + ob2.getClass().getName());
  }
}

class genr {

  public static void main(String args[]) {
    Gen<Integer, String> wob;
    wob = new Gen<Integer, String>(250, "BMS College Of Engineering");
    int x = wob.getob1();
    wob.showType();
    System.out.println("The value for x =" + x);
    String y = wob.getob2(); 
    System.out.println("The value for y =" + y);
  }
}
