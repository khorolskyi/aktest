package switch_case;
import java.time.DayOfWeek;
import java.util.Locale;
import org.apache.commons.lang3.ObjectUtils;

public class SwitchCase {
  public static void main(String[] args) {
    System.out.println(getRainBowColor(RainBow.Green));
  }
  public static String getRainBowColor(RainBow rainBow) {
    return switch (rainBow) {
      case Red -> "Red";
      case Blue -> "Blue";
      case Yellow -> "Yellow";
      case Green -> "Green";
      case Indigo -> "Indigp";
      case Violet -> "Violet";
      default -> "OOPS";
    };
  }

  public enum RainBow {
    Red, Orange, Yellow, Green, Blue, Indigo, Violet
  }
}
