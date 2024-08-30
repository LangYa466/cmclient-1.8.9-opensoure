import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class aaa {
   public static Pattern cQD = Pattern.compile(i.q[5358 & 239]);
   public static Pattern cQE = Pattern.compile(i.q[25063 & -25881]);
   public static Pattern cQF = Pattern.compile(i.q[3304 & 744]);
   public static Pattern cQG = Pattern.compile(i.q[27119 & -28433]);
   public static Pattern cQH = Pattern.compile(i.q[24826 & 4586]);
   public static Pattern cQI = Pattern.compile(i.q[-15124 & 9196]);
   public static Pattern cQJ = Pattern.compile(i.q[10215 & 4325]);
   public static Pattern cQK = Pattern.compile(i.q[-32277 & 28927]);
   public static Pattern cQL = Pattern.compile(i.q[26863 & -28179]);
   public static Pattern cQM = Pattern.compile(i.q[25086 & 2790]);
   public static Pattern cQN = Pattern.compile(i.q[-31235 & 8425]);
   public static Pattern cQO = Pattern.compile(i.q[2810 & 9716]);

   public static boolean go(String var0) {
      return cQG.matcher(var0).matches();
   }

   public static boolean gp(String var0) {
      return cQL.matcher(var0).matches();
   }

   public static int gq(String var0) {
      return var0.equals(t.q[-30982 & 17012]) ? 0 : (var0.equals(y.q[8357 & 7399]) ? 1 : q(var0, i.q[225 & 2021], 0, 1));
   }

   public static ZL gr(String var0) {
      Matcher var1 = cQJ.matcher(var0);
      if (var1.matches()) {
         return new ZL(1, var1.group(1), q.q[256 & 16401], var0);
      } else {
         Matcher var2 = cQM.matcher(var0);
         if (var2.matches()) {
            return new ZL(2, var2.group(1), q.q[24704 & -31470], var0);
         } else {
            Matcher var3 = cQK.matcher(var0);
            if (var3.matches()) {
               return new ZL(6, var3.group(2), var3.group(3), var0);
            } else {
               Matcher var4 = cQE.matcher(var0);
               if (var4.matches()) {
                  return new ZL(3, var4.group(1), var4.group(2), var0);
               } else {
                  Matcher var5 = cQF.matcher(var0);
                  if (var5.matches()) {
                     return new ZL(4, var5.group(1), var5.group(2), var0);
                  } else {
                     Matcher var6 = cQH.matcher(var0);
                     if (var6.matches()) {
                        return new ZL(5, var6.group(1), var6.group(2), var0);
                     } else {
                        Matcher var7 = cQI.matcher(var0);
                        if (var7.matches()) {
                           return new ZL(7, var7.group(1), var7.group(2), var0);
                        } else {
                           Matcher var8 = cQN.matcher(var0);
                           return var8.matches() ? new ZL(8, var8.group(1), var8.group(2), var0) : null;
                        }
                     }
                  }
               }
            }
         }
      }
   }

   public static boolean gs(String var0) {
      return cQO.matcher(var0).matches();
   }

   public static int gt(String var0) {
      return var0.equals(y.q[-5974 & 5807]) ? 0 : q(var0, y.q[-30294 & 171], 0, 1);
   }

   public static boolean gu(String var0) {
      return cQD.matcher(var0).matches();
   }

   public static int gv(String var0) {
      int var1 = q(var0, i.q[2787 & 12519], 1, 4);
      return var1 > 0 ? var1 + 3 : q(var0, i.q[-30483 & 25828], 4, 7);
   }

   public static int gw(String var0) {
      return q(var0, i.q[8419 & 3310], 0, 2);
   }

   public static int q(String var0, String var1, int var2, int var3) {
      if (var0.length() != var1.length() + 1) {
         return -1;
      } else if (!var0.startsWith(var1)) {
         return -1;
      } else {
         int var4 = var0.charAt(var1.length()) - 48;
         return var4 >= var2 && var4 <= var3 ? var4 : -1;
      }
   }
}
