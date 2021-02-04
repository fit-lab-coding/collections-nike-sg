package fit.core;

import java.util.HashMap;
import java.util.Map;

public class AttendanceHelper {
  public static Map<String, Boolean> random(int qtde, double perc) {
    String name = "Nome";
    Double result = qtde*(perc/100);
    int studentPresent = (int) Math.floor(result);
    int studentNotPresent = qtde-studentPresent;
    int contName = 1;
    

    Map<String, Boolean> lista = new HashMap<>(); 
    int i = 0;
    while(i < studentPresent){
      lista.put(name.concat(String.valueOf(contName)), true);
      i++;
      contName++;
    }

    int i2 = 0;
    while(i2 < studentNotPresent){
      lista.put(name.concat(String.valueOf(contName)), false);
      i2++;
      contName++;
    }


    return lista;
  }
}
