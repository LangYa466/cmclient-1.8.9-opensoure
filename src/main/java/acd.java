import java.util.Comparator;

final class acD implements Comparator {
   public int compare(Object var1, Object var2) {
      return ((acH)var1).ac() - ((acH)var2).ac();
   }
}
