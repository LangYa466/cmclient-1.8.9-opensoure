import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Oc {
   public static Iterable q(Class var0, Iterable var1) {
      return new Of(var0, (Iterable[])w(Iterable.class, var1));
   }

   private static Object[] q(Class var0, int var1) {
      return Array.newInstance(var0, var1);
   }

   private static Object[] w(Class var0, Iterable var1) {
      ArrayList var2 = Lists.newArrayList();

      for(Object var4 : var1) {
         var2.add(var4);
      }

      return var2.toArray(q(var0, var2.size()));
   }

   public static Iterable q(Iterable var0) {
      return w(q(Object.class, var0));
   }

   // $FF: synthetic method
   static Object[] w(Class var0, int var1) {
      return q(var0, var1);
   }

   private static Iterable w(Iterable var0) {
      return Iterables.transform(var0, new Oe());
   }
}
