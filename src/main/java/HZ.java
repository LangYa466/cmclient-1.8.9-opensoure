import java.util.Stack;
import java.util.regex.Pattern;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Hz {
   private static final Logger btm = LogManager.getLogger();
   private static final Pattern btn = Pattern.compile(p.q[10676 & 20789]);

   private static boolean o(String var0, int var1) {
      return var1 > 0 && var0.charAt(var1 - 1) == '\\' && !o(var0, var1 - 1);
   }

   private static String i(String var0, boolean var1) {
      int var2 = q(var0, ':');
      int var3 = q(var0, ',');
      if (var1) {
         if (var2 == -1) {
            throw new HG(p.q[-24782 & 25074] + var0);
         }

         if (var3 != -1 && var3 < var2) {
            throw new HG(p.q[-15565 & 13619] + var0);
         }
      } else if (var2 == -1 || var2 > var3) {
         var2 = -1;
      }

      return p(var0, var2);
   }

   private static int q(String var0, char var1) {
      int var2 = 0;

      for(boolean var3 = true; var2 < var0.length(); ++var2) {
         char var4 = var0.charAt(var2);
         if (var4 == '"') {
            if (!o(var0, var2)) {
               var3 = !var3;
            }
         } else if (var3) {
            if (var4 == var1) {
               return var2;
            }

            if (var4 == '{' || var4 == '[') {
               return -1;
            }
         }
      }

      return -1;
   }

   private static String o(String var0, boolean var1) {
      if (var1) {
         var0 = var0.trim();
         if (var0.startsWith(w.q[1388 & 31183]) || var0.startsWith(w.q[-32325 & 437])) {
            return var0;
         }
      }

      int var2 = q(var0, ':');
      if (var2 == -1) {
         if (var1) {
            return var0;
         } else {
            throw new HG(p.q[17202 & 2494] + var0);
         }
      } else {
         return var0.substring(var2 + 1).trim();
      }
   }

   static HA p(String var0, String var1) {
      var1 = var1.trim();
      if (var1.startsWith(w.q[-16916 & 16717])) {
         var1 = var1.substring(1, var1.length() - 1);

         HB var8;
         String var9;
         for(var8 = new HB(var0); var1.length() > 0; var1 = var1.substring(var9.length() + 1)) {
            var9 = i(var1, true);
            if (var9.length() > 0) {
               boolean var11 = false;
               var8.btp.add(a(var9, var11));
            }

            if (var1.length() < var9.length() + 1) {
               break;
            }

            char var12 = var1.charAt(var9.length());
            if (var12 != ',' && var12 != '{' && var12 != '}' && var12 != '[' && var12 != ']') {
               throw new HG(p.q[-30924 & 4464] + var12 + p.q[1329 & 311] + var1.substring(var9.length()));
            }
         }

         return var8;
      } else if (var1.startsWith(w.q[20917 & 945]) && !btn.matcher(var1).matches()) {
         var1 = var1.substring(1, var1.length() - 1);

         HC var2;
         String var3;
         for(var2 = new HC(var0); var1.length() > 0; var1 = var1.substring(var3.length() + 1)) {
            var3 = i(var1, false);
            if (var3.length() > 0) {
               boolean var4 = true;
               var2.btq.add(a(var3, var4));
            }

            if (var1.length() < var3.length() + 1) {
               break;
            }

            char var10 = var1.charAt(var3.length());
            if (var10 != ',' && var10 != '{' && var10 != '}' && var10 != '[' && var10 != ']') {
               throw new HG(p.q[4400 & 26546] + var10 + p.q[2353 & 1339] + var1.substring(var3.length()));
            }
         }

         return var2;
      } else {
         return new HD(var0, var1);
      }
   }

   private static String p(String var0, boolean var1) {
      if (var1) {
         var0 = var0.trim();
         if (var0.startsWith(w.q[16844 & 11117]) || var0.startsWith(w.q[-6735 & 2489])) {
            return q.q[-16216 & 11328];
         }
      }

      int var2 = q(var0, ':');
      if (var2 == -1) {
         if (var1) {
            return q.q[-32247 & 9216];
         } else {
            throw new HG(p.q[4978 & -7758] + var0);
         }
      } else {
         return var0.substring(0, var2).trim();
      }
   }

   private static HA a(String var0, boolean var1) {
      String var2 = p(var0, var1);
      String var3 = o(var0, var1);
      return y(var2, var3);
   }

   public static HL bE(String var0) {
      var0 = var0.trim();
      if (!var0.startsWith(w.q[-30388 & 8572])) {
         throw new HG(p.q[-11989 & 2473]);
      } else if (bF(var0) != 1) {
         throw new HG(p.q[-32470 & 4411]);
      } else {
         return (HL)p(o.q[991 & 6126], var0).Iw();
      }
   }

   static HA y(String... var0) {
      return p(var0[0], var0[1]);
   }

   static int bF(String var0) {
      int var1 = 0;
      boolean var2 = false;
      Stack var3 = new Stack();

      for(int var4 = 0; var4 < var0.length(); ++var4) {
         char var5 = var0.charAt(var4);
         if (var5 == '"') {
            if (o(var0, var4)) {
               if (!var2) {
                  throw new HG(p.q[-30421 & 18219] + var0);
               }
            } else {
               var2 = !var2;
            }
         } else if (!var2) {
            if (var5 != '{' && var5 != '[') {
               if (var5 == '}' && (var3.isEmpty() || ((Character)var3.pop()).charValue() != '{')) {
                  throw new HG(p.q[19822 & -23747] + var0);
               }

               if (var5 == ']' && (var3.isEmpty() || ((Character)var3.pop()).charValue() != '[')) {
                  throw new HG(p.q[829 & 6447] + var0);
               }
            } else {
               if (var3.isEmpty()) {
                  ++var1;
               }

               var3.push(Character.valueOf(var5));
            }
         }
      }

      if (var2) {
         throw new HG(p.q[814 & 16686] + var0);
      } else if (!var3.isEmpty()) {
         throw new HG(p.q[9135 & 319] + var0);
      } else {
         if (var1 == 0 && !var0.isEmpty()) {
            var1 = 1;
         }

         return var1;
      }
   }

   private static String p(String var0, int var1) {
      Stack var2 = new Stack();
      int var3 = var1 + 1;
      boolean var4 = false;
      boolean var5 = false;
      boolean var6 = false;

      for(int var7 = 0; var3 < var0.length(); ++var3) {
         char var8 = var0.charAt(var3);
         if (var8 == '"') {
            if (o(var0, var3)) {
               if (!var4) {
                  throw new HG(p.q[939 & 3435] + var0);
               }
            } else {
               var4 = !var4;
               if (var4 && !var6) {
                  var5 = true;
               }

               if (!var4) {
                  var7 = var3;
               }
            }
         } else if (!var4) {
            if (var8 != '{' && var8 != '[') {
               if (var8 == '}' && (var2.isEmpty() || ((Character)var2.pop()).charValue() != '{')) {
                  throw new HG(p.q[-17620 & 316] + var0);
               }

               if (var8 == ']' && (var2.isEmpty() || ((Character)var2.pop()).charValue() != '[')) {
                  throw new HG(p.q[-30419 & 1405] + var0);
               }

               if (var8 == ',' && var2.isEmpty()) {
                  return var0.substring(0, var3);
               }
            } else {
               var2.push(Character.valueOf(var8));
            }
         }

         if (!Character.isWhitespace(var8)) {
            if (!var4 && var5 && var7 != var3) {
               return var0.substring(0, var7 + 1);
            }

            var6 = true;
         }
      }

      return var0.substring(0, var3);
   }
}
