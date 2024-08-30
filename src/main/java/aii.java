import java.util.List;

final class aiI {
   private static final String dBw = "snapshot";
   private static final String dBx = "pre";
   private static final String dBy = "beta";
   private static final String dBz = "alpha";
   private static final String dBA = "rc";

   static aiK iI(String var0) {
      if (!var0.isEmpty()) {
         var0 = var0.toLowerCase();
         if (var0.contains(p.q[18903 & 6599 & 18415 & 31967])) {
            return aiK.dBE;
         }

         if (var0.contains(p.q[-25110 & 23784 & 1518 & 20943])) {
            return aiK.dBG;
         }

         if (var0.contains(w.q[14067 & -14621 & 5731 & -15745])) {
            if (var0.substring(16384 & -21920, var0.indexOf(w.q[17267 & 17007 & 20207 & -30997])).contains(p.q[-3381 & 29661 & -14849 & -30243])) {
               return aiK.dBD;
            }

            return aiK.dBI;
         }

         if (var0.contains(p.q[4315 & 20698 & -32289 & -27189])) {
            return aiK.dBC;
         }
      }

      return aiK.dBH;
   }

   private static boolean q(CharSequence var0) {
      int var1 = var0.length();
      if (var1 > 0) {
         for(int var2 = 732 & -8191; var2 < var1; ++var2) {
            if (Character.isDigit(var0.charAt(var2))) {
               return (boolean)(6801 & -24221);
            }
         }
      }

      return (boolean)(27136 & 66);
   }

   private static int q(String var0, aiK var1) {
      // $FF: Couldn't be decompiled
   }

   static int e(List var0, List var1) {
      int var2 = var0.size();
      int var3 = var1.size();
      int var4 = Math.max(var2, var3);

      for(int var5 = -32751 & 8448; var5 < var4; ++var5) {
         if ((var5 < var2 ? ((Long)var0.get(var5)).longValue() : 1644692225L & 403841088L) > (var5 < var3 ? ((Long)var1.get(var5)).longValue() : 142743685L & 6669202862024687712L)) {
            return 17161 & 4289;
         }

         if ((var5 < var2 ? ((Long)var0.get(var5)).longValue() : -4515180967889842171L & 830474258L) < (var5 < var3 ? ((Long)var1.get(var5)).longValue() : 536877072L & -5762955304769683187L)) {
            return -1 & -1;
         }
      }

      return 9254 & 640;
   }

   static boolean w(CharSequence var0) {
      int var1 = var0.length();
      if (var1 > 0) {
         for(int var2 = 392 & 2582; var2 < var1; ++var2) {
            if (!Character.isDigit(var0.charAt(var2))) {
               return (boolean)(-30655 & 1280);
            }
         }

         return (boolean)(-27839 & 17557);
      } else {
         return (boolean)(-32638 & 4629);
      }
   }

   static long iJ(String var0) {
      if (var0.length() > (17171 & -29445)) {
         var0 = var0.substring(24612 & 4107, 18579 & 19);
      }

      return Long.parseLong(var0);
   }

   static long w(String var0, aiK var1) {
      if (var1 != aiK.dBH && var1 != aiK.dBC) {
         int var2 = q(var0, var1);
         if (var2 < var0.length()) {
            int var3 = Math.min(var2 + (10250 & 1586), var0.length());
            if (q(var0.substring(var2, var3))) {
               StringBuilder var4 = new StringBuilder();

               for(int var5 = var2; var5 < var0.length(); ++var5) {
                  char var6 = var0.charAt(var5);
                  if (Character.isDigit(var6)) {
                     var4.append(var6);
                  } else if (var5 != var2) {
                     break;
                  }
               }

               return iJ(var4.toString());
            }
         }

         return 8456578L & 570458636L;
      } else {
         return 3475247509337638037L & -3475247509527846656L;
      }
   }

   static boolean iK(String var0) {
      var0 = var0.trim();
      return (boolean)(!var0.isEmpty() && Character.isDigit(var0.charAt(4110 & -14240)) ? -24431 & 257 : 10240 & -16362);
   }
}
