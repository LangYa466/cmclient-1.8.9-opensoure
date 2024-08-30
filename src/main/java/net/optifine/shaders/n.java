package net.optifine.shaders;

public class n {
   public static final int cFk = 12;
   public static final int cFl = 10;
   public static final int cFm = 8;
   public static final int cFn = 14;
   public static final .uu cFo = ait();

   public static .uu ait() {
      .uu var0 = new .uu();
      var0.q(new .uw(0, .ux.ayq, .uy.ayB, 3));
      var0.q(new .uw(0, .ux.ayr, .uy.ayH, 4));
      var0.q(new .uw(0, .ux.ayq, .uy.ayE, 2));
      var0.q(new .uw(0, .ux.ayu, .uy.ayH, 2));
      var0.q(new .uw(0, .ux.ays, .uy.ayC, 3));
      var0.q(new .uw(0, .ux.ays, .uy.ayH, 1));
      var0.q(new .uw(0, .ux.ayq, .uy.ayH, 2));
      var0.q(new .uw(0, .ux.ayu, .uy.ayH, 4));
      var0.q(new .uw(0, .ux.ayu, .uy.ayH, 4));
      return var0;
   }

   public static .uu aiu() {
      .uu var0 = new .uu();
      var0.q(new .uw(0, .ux.ayq, .uy.ayB, 3));
      var0.q(new .uw(0, .ux.ayr, .uy.ayD, 4));
      var0.q(new .uw(0, .ux.ayq, .uy.ayE, 2));
      var0.q(new .uw(0, .ux.ayu, .uy.ayH, 2));
      var0.q(new .uw(0, .ux.ays, .uy.ayC, 3));
      var0.q(new .uw(0, .ux.ays, .uy.ayH, 1));
      var0.q(new .uw(0, .ux.ayq, .uy.ayH, 2));
      var0.q(new .uw(0, .ux.ayu, .uy.ayH, 4));
      var0.q(new .uw(0, .ux.ayu, .uy.ayH, 4));
      return var0;
   }

   public static void q(.uu var0, .uu var1) {
      if (var0 != null && var1 != null) {
         var1.clear();

         for(int var2 = 0; var2 < var0.sU(); ++var2) {
            var1.q(var0.db(var2));
         }
      }

   }

   public static void q(.uu var0) {
      if (var0 != null) {
         var0.clear();
         var0.q(new .uw(0, .ux.ayq, .uy.ayB, 3));
         var0.q(new .uw(0, .ux.ayr, .uy.ayD, 4));
         var0.q(new .uw(0, .ux.ayq, .uy.ayE, 2));
         var0.q(new .uw(0, .ux.ayu, .uy.ayH, 2));
         var0.q(new .uw(0, .ux.ays, .uy.ayC, 3));
         var0.q(new .uw(0, .ux.ays, .uy.ayH, 1));
         var0.q(new .uw(0, .ux.ayq, .uy.ayH, 2));
         var0.q(new .uw(0, .ux.ayu, .uy.ayH, 4));
         var0.q(new .uw(0, .ux.ayu, .uy.ayH, 4));
      }

   }

   public static .uu aiv() {
      .uu var0 = new .uu();
      var0.q(new .uw(0, .ux.ayq, .uy.ayB, 3));
      var0.q(new .uw(0, .ux.ayr, .uy.ayD, 4));
      var0.q(new .uw(0, .ux.ayq, .uy.ayE, 2));
      var0.q(new .uw(1, .ux.ayu, .uy.ayE, 2));
      var0.q(new .uw(0, .ux.ays, .uy.ayC, 3));
      var0.q(new .uw(0, .ux.ays, .uy.ayH, 1));
      var0.q(new .uw(0, .ux.ayq, .uy.ayH, 2));
      var0.q(new .uw(0, .ux.ayu, .uy.ayH, 4));
      var0.q(new .uw(0, .ux.ayu, .uy.ayH, 4));
      return var0;
   }

   public static .uu w(.uu var0) {
      if (var0 == null) {
         return null;
      } else {
         .uu var1 = new .uu();
         q(var0, var1);
         return var1;
      }
   }
}
