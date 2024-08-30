import com.google.common.collect.ImmutableList;
import java.util.List;

public class YX {
   private static final List cAx = ImmutableList.of();

   public static List q(List var0, Qx var1, hI var2, NW var3, OK var4, OS var5, long var6, Zy var8) {
      if (var4 != null) {
         if (var8.ahy() && XV.w(var1.g(var3.v(var4)), var2)) {
            return cAx;
         }

         if (!var8.A(var0) && MV.Tj()) {
            var0 = WQ.w(var1, var2, var3, var4, var0);
         }
      }

      List var9 = var8.ahC();
      var9.clear();

      for(int var10 = 0; var10 < var0.size(); ++var10) {
         qw var11 = (qw)var0.get(var10);
         qw[] var12 = q(var11, var1, var2, var3, var4, var6, var8);
         if (var10 == 0 && var0.size() == 1 && var12.length == 1 && var12[0] == var11 && var11.pW() == null) {
            return var0;
         }

         for(int var13 = 0; var13 < var12.length; ++var13) {
            qw var14 = var12[var13];
            var9.add(var14);
            if (var14.pW() != null) {
               var8.a(p(var5)).q(var14.pW(), var2);
               var8.cp(true);
            }
         }
      }

      return var9;
   }

   public static vz q(vz var0, hI var1, Zy var2) {
      if (var2.ahy()) {
         var0 = XV.q(var0, var1);
      }

      return var0;
   }

   private static OS p(OS var0) {
      return var0 != null && var0 != OS.bSj ? var0 : OS.bSk;
   }

   private static qw[] q(qw var0, Qx var1, hI var2, NW var3, OK var4, long var5, Zy var7) {
      if (var7.y(var0)) {
         return var7.t(var0);
      } else {
         qw var8 = var0;
         if (MV.Rx()) {
            qw[] var9 = WZ.q(var1, var2, var3, var0, var7);
            if (var9.length != 1 || var9[0] != var0) {
               return var9;
            }
         }

         if (MV.SW()) {
            var0 = XN.q(var3, var0);
            if (var0 != var8) {
               return var7.t(var0);
            }
         }

         return var7.t(var0);
      }
   }
}
