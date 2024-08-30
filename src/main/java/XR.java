import java.util.Comparator;

public class Xr implements Comparator {
   public int compare(Object var1, Object var2) {
      Xo var3 = (Xo)var1;
      Xo var4 = (Xo)var2;
      return var3.DZ != var4.DZ ? var4.DZ - var3.DZ : (!MV.e(var3.avP, var4.avP) ? var3.avP.compareTo(var4.avP) : var3.av.compareTo(var4.av));
   }
}
