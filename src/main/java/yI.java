import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class YI extends YH {
   private String[] q(int var1, List var2) {
      iS var3 = MV.eV().CB;
      ArrayList var4 = new ArrayList();

      for(int var5 = 0; var5 < var2.size(); ++var5) {
         String var6 = (String)var2.get(var5);
         if (var6 != null && var6.length() > 0) {
            for(String var8 : var3.r(var6, var1)) {
               var4.add(var8);
            }
         }
      }

      String[] var9 = (String[])var4.toArray(new String[var4.size()]);
      return var9;
   }

   public String[] w(iU var1, int var2) {
      if (!(var1 instanceof aaf)) {
         return null;
      } else {
         aaf var3 = (aaf)var1;
         ZP var4 = var3.alS();
         String[] var5 = this.q(var4, var2);
         return var5;
      }
   }

   private String[] fd(String var1) {
      if (var1.length() <= 0) {
         return new String[0];
      } else {
         var1 = net.optifine.util.J.Q(var1, e.q[230 & 19711]);
         String[] var2 = var1.split(o.q[995 & 4010]);

         for(int var3 = 0; var3 < var2.length; ++var3) {
            var2[var3] = q.q[6934 & -32225] + var2[var3].trim();
            var2[var3] = net.optifine.util.J.P(var2[var3], q.q[79 & 723]);
         }

         return var2;
      }
   }

   private String[] q(ZP var1, int var2) {
      String var3 = var1.alH();
      String var4 = MV.cQ(var1.alE()).trim();
      String[] var5 = this.fd(var4);
      vL var6 = MV.SL();
      String var7 = null;
      if (!var3.equals(var1.bY()) && var6.aCO) {
         var7 = o.q[926 & -22561] + XH.eD(o.q[17311 & -31777]) + q.q[10972 & 676] + var1.bY();
      }

      String var8 = null;
      if (var1.alD() != null && var6.aCO) {
         var8 = o.q[-23649 & 2974] + XH.eD(o.q[935 & 13280]) + q.q[-14708 & 646] + MV.w(var1.alD());
      }

      String var9 = null;
      if (var1.akN() != null && var6.aCO) {
         String var10 = var1.J() ? var1.gb(var1.akN()) : XH.eD(o.q[9131 & 945]);
         var9 = o.q[926 & -12322] + XH.afD() + q.q[678 & -31084] + var10;
      }

      ArrayList var12 = new ArrayList();
      var12.add(var3);
      var12.addAll(Arrays.asList(var5));
      if (var7 != null) {
         var12.add(var7);
      }

      if (var8 != null) {
         var12.add(var8);
      }

      if (var9 != null) {
         var12.add(var9);
      }

      String[] var11 = this.q(var2, var12);
      return var11;
   }
}
