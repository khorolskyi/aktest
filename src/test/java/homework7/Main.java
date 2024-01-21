package homework7;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    List <PaymentRequest> list = new ArrayList<>();
    list.add(new PaymentRequest("1",1000,"UAH","alex@test.com"));
    list.add(new PaymentRequest("2",3000,"UAH","alex1@test.com"));
    list.add(new PaymentRequest("3",2000,"UAH","alex2@test.com"));

    Collections.sort(list);
    list.forEach(System.out::println);
  }
}
