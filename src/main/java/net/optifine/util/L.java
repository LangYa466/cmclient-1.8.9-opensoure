package net.optifine.util;

import java.util.Arrays;
import java.util.HashSet;

public class l {
   public static void q(.vP[] var0, .vP[] var1) {
      HashSet var2 = new HashSet();

      for(int var3 = 0; var3 < var1.length; ++var3) {
         .vP var4 = var1[var3];
         var2.add(Integer.valueOf(var4.bB()));
      }

      HashSet var7 = new HashSet(Arrays.asList(var0));
      var7.removeAll(Arrays.asList(var1));

      for(.vP var5 : var7) {
         Integer var6 = var5.bB();
         if (var2.contains(var6)) {
            var5.dk(0);
         }
      }

   }
}
