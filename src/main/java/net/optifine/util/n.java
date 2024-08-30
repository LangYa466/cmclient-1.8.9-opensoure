package net.optifine.util;

public class N {
   public static String D(.Qx var0, .NW var1) {
      .No var2 = var0.h(var1);
      return f(var2);
   }

   public static void s(.No var0) {
      .NW var1 = var0.eI();
      String var2 = d(var0);
      if (var2 == null) {
         String var3 = bd(var1);
         var3 = .MV.cQ(var3);
         q(var0, var3);
      }

   }

   public static boolean q(.No var0, String var1) {
      if (var0 instanceof .Nu) {
         ((.Nu)var0).bx(var1);
         return true;
      } else if (var0 instanceof .Nw) {
         ((.Nw)var0).bx(var1);
         return true;
      } else if (var0 instanceof .NF) {
         ((.NF)var0).bx(var1);
         return true;
      } else if (var0 instanceof .NJ) {
         ((.NJ)var0).cX(var1);
         return true;
      } else if (var0 instanceof .Nx) {
         ((.Nx)var0).bx(var1);
         return true;
      } else if (var0 instanceof .ND) {
         ((.ND)var0).bx(var1);
         return true;
      } else if (var0 instanceof .NK) {
         ((.NK)var0).bx(var1);
         return true;
      } else {
         return false;
      }
   }

   public static String d(.No var0) {
      if (var0 instanceof .Nu) {
         return ((.Nu)var0).Ur();
      } else if (var0 instanceof .Nw) {
         return ((.Nw)var0).Ur();
      } else if (var0 instanceof .NF) {
         return ((.NF)var0).Ur();
      } else if (var0 instanceof .NJ) {
         return ((.NJ)var0).UI();
      } else {
         if (var0 instanceof .QB) {
            .QB var1 = (.QB)var0;
            if (var1.dg()) {
               return var1.bY();
            }
         }

         return null;
      }
   }

   public static String f(.No var0) {
      if (!(var0 instanceof .QB)) {
         return null;
      } else {
         .QB var1 = (.QB)var0;
         s(var0);
         return !var1.dg() ? null : var1.bY();
      }
   }

   public static String bd(.NW var0) {
      .No var1 = net.optifine.util.f.h(var0);
      return var1 == null ? null : d(var1);
   }
}
