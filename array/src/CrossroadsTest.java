import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class CrossroadsTest {

  @Test
  void returnsZero() {
    char[][] arr = {
        {'S', 'C'}
    };
    Crossroads c = new Crossroads();
    int result = c.getMax(0, 0, arr);
    assertEquals(0, result);
  }

  @Test
  void returnsZero2() {
    char[][] arr = {
        {'S', 'E', 'C'},
        {'P', 'P', 'P'}
    };
    Crossroads c = new Crossroads();
    int result = c.getMax(0, 0, arr);
    assertEquals(0, result);
  }

  @Test
  void returnsOne(){
    char[][] arr = {
        {'S', 'E', 'C'},
        {'P', 'P', 'P'},
        {'P', 'E', 'E'}
    };
    Crossroads c = new Crossroads();
    int result = c.getMax(0, 0, arr);
    assertEquals(1,result);
  }
}
