import java.io.BufferedInputStream;
import java.io.File;
import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;

public class aeu {
   private static ArrayList dkU = new ArrayList();

   public static InputStream fm(String var0) {
      InputStream var1 = null;

      for(Object var3 : dkU) {
         aev var4 = (aev)var3;
         var1 = var4.fm(var0);
         if (var1 != null) {
            break;
         }
      }

      if (var1 == null) {
         throw new RuntimeException(t.q[-32130 & 18286 & 3694 & 12142] + var0);
      } else {
         return new BufferedInputStream(var1);
      }
   }

   static {
      dkU.add(new aer());
      dkU.add(new aet(new File(q.q[2543 & 17791 & -30765 & -32037])));
   }

   public static URL hv(String var0) {
      URL var1 = null;

      for(Object var3 : dkU) {
         aev var4 = (aev)var3;
         var1 = var4.hv(var0);
         if (var1 != null) {
            break;
         }
      }

      if (var1 == null) {
         throw new RuntimeException(t.q[19071 & 11007 & -15362 & -11410] + var0);
      } else {
         return var1;
      }
   }
}
