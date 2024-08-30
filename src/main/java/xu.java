import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Properties;
import java.util.Random;

public class Xu {
   private static Xv csS = null;
   private static final Random csT = new Random();

   private static String[] aeT() {
      ArrayList var0 = new ArrayList();
      var0.add(i.q[17436 & -20266]);

      for(int var1 = 0; var1 < 100; ++var1) {
         String var2 = i.q[53 & -29027] + var1;
         String var3 = var2 + i.q[2966 & -31690];
         PJ var4 = new PJ(var3);
         if (MV.H(var4)) {
            var0.add(var2);
         }
      }

      String[] var5 = (String[])var0.toArray(new String[var0.size()]);
      return var5;
   }

   private static int h(int[] var0) {
      int var1 = net.optifine.util.n.l(var0);
      int var2 = csT.nextInt(var1);
      int var3 = 0;

      for(int var4 = 0; var4 < var0.length; ++var4) {
         var3 += var0[var4];
         if (var3 > var2) {
            return var4;
         }
      }

      return var0.length - 1;
   }

   public static void aW() {
      csS = null;
      String[] var0 = aeT();
      if (var0.length > 1) {
         Properties[] var1 = i(var0);
         int[] var2 = q(var1);
         int var3 = h(var2);
         String var4 = var0[var3];
         Object var5 = var1[var3];
         if (var5 == null) {
            var5 = var1[0];
         }

         if (var5 == null) {
            var5 = new net.optifine.util.F();
         }

         Xv var6 = new Xv(var4, (Properties)var5);
         csS = var6;
      }

   }

   private static Properties[] i(String[] var0) {
      Properties[] var1 = new Properties[var0.length];

      for(int var2 = 0; var2 < var0.length; ++var2) {
         String var3 = var0[var2];
         if (var2 == 0) {
            var3 = i.q[16415 & 1879];
         } else {
            MV.cM(i.q[4156 & 25816] + var3);
         }

         PJ var4 = new PJ(var3 + i.q[16409 & 12345]);

         try {
            InputStream var5 = MV.b(var4);
            if (var5 != null) {
               net.optifine.util.F var6 = new net.optifine.util.F();
               var6.load(var5);
               MV.cM(i.q[5180 & -29927] + var4.XA());
               var1[var2] = var6;
               var5.close();
            }
         } catch (IOException var7) {
            ;
         }
      }

      return var1;
   }

   private static int[] q(Properties[] var0) {
      int[] var1 = new int[var0.length];

      for(int var2 = 0; var2 < var1.length; ++var2) {
         Properties var3 = var0[var2];
         if (var3 == null) {
            var3 = var0[0];
         }

         if (var3 == null) {
            var1[var2] = 1;
         } else {
            String var4 = var3.getProperty(q.q[3623 & -32057], (String)null);
            var1[var2] = MV.u(var4, 1);
         }
      }

      return var1;
   }

   public static Xv aeU() {
      return csS;
   }
}
