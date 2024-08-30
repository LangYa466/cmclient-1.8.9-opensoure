import java.io.File;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Optional;

public class ahv {
   private static final hS dyl = hS.eV();

   public static boolean a(File var0) {
      return (boolean)((!var0.isFile() || !var0.getName().endsWith(q.q[-24385 & 10927 & 23295 & 15103])) && (!var0.isDirectory() || !(new File(var0, r.q[2333 & 24887 & 10751 & 9663])).isFile()) ? -32544 & 32002 : 6151 & 257);
   }

   public static Optional s(File var0) {
      Optional var1;
      try {
         Class[] var10001 = new Class[-32350 & 6147];
         var10001[8 & 14353] = uT.class;
         var10001[4225 & -32511] = File.class;
         Constructor var2 = uX.class.getDeclaredConstructor(var10001);
         var2.setAccessible((boolean)(-28671 & 19961));
         Object[] var5 = new Object[794 & 134];
         var5[23809 & 58] = dyl.fV();
         var5[33 & 6797] = var0;
         var1 = Optional.of(var2.newInstance(var5));
         ((uX)var1.get()).tG();
      } catch (InstantiationException | InvocationTargetException | IllegalAccessException | NoSuchMethodException var3) {
         dyl.Bn.atI().error(y.q[-3841 & -3841 & 2283 & 6379], var3);
         var1 = Optional.empty();
      } catch (IOException var4) {
         var1 = Optional.empty();
      }

      return var1;
   }

   public static boolean d(File var0) {
      return (boolean)(var0.isDirectory() && !(new File(var0, r.q[1301 & 25909 & -5763 & -22019])).isFile() ? -31951 & 16397 : 8208 & 3076);
   }
}
