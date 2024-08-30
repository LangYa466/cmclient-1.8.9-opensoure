import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ZU extends ZP {
   private static final Pattern cQs = Pattern.compile(i.q[-13859 & 5597]);
   private static final Pattern cQt = Pattern.compile(i.q[-10274 & 8670]);

   public static boolean gk(String var0) {
      return Boolean.valueOf(var0).booleanValue();
   }

   public String gd(String var1) {
      return gk(var1) ? r.q[727 & -25913] : w.q[1776 & -32010];
   }

   public static ZP F(String var0, String var1) {
      Matcher var2 = cQs.matcher(var0);
      if (!var2.matches()) {
         return null;
      } else {
         String var3 = var2.group(1);
         String var4 = var2.group(2);
         String var5 = var2.group(3);
         if (var4 != null && var4.length() > 0) {
            boolean var6 = MV.e(var3, e.q[8422 & 24310]);
            boolean var7 = !var6;
            var1 = net.optifine.util.J.Q(var1, y.q[1794 & -11756]);
            ZU var8 = new ZU(var4, var5, String.valueOf(var7), var1);
            return var8;
         } else {
            return null;
         }
      }
   }

   public ZU(String var1, String var2, String var3, String var4) {
      super(var1, var2, var3, new String[]{q.q[1143 & 10610], q.q[20603 & 625]}, var3, var4);
   }

   public String alq() {
      return gk(this.wx()) ? t.q[11042 & 4922] + this.bY() + i.q[-32294 & 18906] : i.q[10203 & -26117] + this.bY() + i.q[3580 & 476];
   }

   public boolean gh(String var1) {
      Matcher var2 = cQt.matcher(var1);
      if (var2.matches()) {
         String var3 = var2.group(2);
         if (var3.equals(this.bY())) {
            return true;
         }
      }

      return false;
   }

   public String gb(String var1) {
      String var2 = super.gb(var1);
      return var2 != var1 ? var2 : (gk(var1) ? XH.afH() : XH.afF());
   }

   public boolean alA() {
      return true;
   }

   public boolean gg(String var1) {
      Matcher var2 = cQs.matcher(var1);
      if (!var2.matches()) {
         return false;
      } else {
         String var3 = var2.group(2);
         return var3.matches(this.bY());
      }
   }
}
