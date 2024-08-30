package net.optifine.util;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class a {
   public static void q(Properties var0, float[] var1) {
      for(Object var3 : var0.keySet()) {
         String var4 = (String)var3;
         String var5 = .a.q[1258 & -14176];
         if (var4.startsWith(var5)) {
            String var6 = var4.substring(var5.length());
            int var7 = .MV.u(var6, -1);
            if (var7 >= 0 && var7 < var1.length) {
               String var8 = var0.getProperty(var4);
               float var9 = .MV.w(var8, -1.0F);
               if (var9 >= 0.0F) {
                  var1[var7] = var9;
               }
            }
         }
      }

   }

   public static Properties P(.PJ var0) {
      String var1 = var0.XA();
      net.optifine.util.F var2 = new net.optifine.util.F();
      String var3 = .q.q[16590 & 15404];
      if (!var1.endsWith(var3)) {
         return var2;
      } else {
         String var4 = var1.substring(0, var1.length() - var3.length()) + .w.q[-24029 & 21027];

         try {
            .PJ var5 = new .PJ(var0.Xz(), var4);
            InputStream var6 = .MV.t(.MV.fF(), var5);
            if (var6 == null) {
               return var2;
            }

            .MV.cR(.q.q[2546 & -28174] + var4);
            var2.load(var6);
            var6.close();
         } catch (FileNotFoundException var7) {
            ;
         } catch (IOException var8) {
            var8.printStackTrace();
         }

         return var2;
      }
   }

   public static boolean w(Properties var0, String var1, boolean var2) {
      String var3 = var0.getProperty(var1);
      if (var3 == null) {
         return var2;
      } else {
         String var4 = var3.toLowerCase().trim();
         if (!var4.equals(.q.q[18801 & -27535]) && !var4.equals(.u.q[-17562 & 823])) {
            if (!var4.equals(.q.q[2162 & 8314]) && !var4.equals(.q.q[862 & -7493])) {
               .MV.cJ(.a.q[701 & -8029] + var1 + .q.q[-32092 & 12940] + var3);
               return var2;
            } else {
               return false;
            }
         } else {
            return true;
         }
      }
   }

   public static float q(Properties var0, String var1, float var2) {
      String var3 = var0.getProperty(var1);
      if (var3 == null) {
         return var2;
      } else {
         float var4 = .MV.w(var3, Float.MIN_VALUE);
         if (var4 == Float.MIN_VALUE) {
            .MV.cJ(.a.q[-14173 & 8621] + var1 + .q.q[8900 & 5028] + var3);
            return var2;
         } else {
            return var4;
         }
      }
   }

   public static .PJ Q(.PJ var0) {
      if (!.MV.RP()) {
         return var0;
      } else if (var0 == null) {
         return var0;
      } else if (!.MV.SP()) {
         return var0;
      } else {
         String var1 = var0.XA();
         String var2 = .q.q[1391 & 335];
         String var3 = .q.q[-23720 & 1365];
         if (!var1.startsWith(var2)) {
            return var0;
         } else {
            var1 = var1.substring(var2.length());
            var1 = var3 + var1;
            .PJ var4 = new .PJ(var0.Xz(), var1);
            return .MV.r(.MV.fF(), var4) ? var4 : var0;
         }
      }
   }
}
