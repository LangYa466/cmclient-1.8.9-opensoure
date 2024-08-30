import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import org.apache.logging.log4j.Logger;

public class PV {
   public static PW XS() {
      String var0 = System.getProperty(q.q[17618 & -28418]).toLowerCase();
      return var0.contains(t.q[21363 & 9195]) ? PW.bUR : (var0.contains(t.q[998 & 892]) ? PW.bUS : (var0.contains(t.q[17269 & 9061]) ? PW.bUQ : (var0.contains(t.q[-31898 & 17263]) ? PW.bUQ : (var0.contains(t.q[-31897 & 4087]) ? PW.bUP : (var0.contains(t.q[20328 & 9064]) ? PW.bUP : PW.bUT)))));
   }

   public static Object q(FutureTask var0, Logger var1) {
      try {
         var0.run();
         return var0.get();
      } catch (ExecutionException var4) {
         var1.fatal(i.q[4143 & 17983], var4);
         if (var4.getCause() instanceof OutOfMemoryError) {
            OutOfMemoryError var3 = (OutOfMemoryError)var4.getCause();
            throw var3;
         }
      } catch (InterruptedException var5) {
         var1.fatal(i.q[-16337 & 47], var5);
      }

      return null;
   }
}
