package fit.core;

import java.util.HashMap;
import java.util.Map;

public class AttendanceHelper {
  public static Map<String, Boolean> random(int qtde, double perc) {
    String name = "Nome";
    Double result = qtde*(perc/100);
    int studentPresent = (int) Math.floor(result);
    int studentNotPresent = qtde-studentPresent;

    Map<String, Boolean> list = new HashMap<>(); 
    {
      for (int i = 1; i < studentPresent; i++) {
        var nameC = name.concat(String.valueOf(i));
        list.put(nameC, true);
      }
      for (int i = 1; i < studentNotPresent; i++) {
        var nameC = name.concat(String.valueOf(i));
        list.put(nameC, false);
      }
    }



    return list;
  }
}
