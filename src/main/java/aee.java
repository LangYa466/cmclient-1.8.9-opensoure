import java.util.Date;
import org.apache.commons.lang3.StringUtils;

class aeE extends kx {
   // $FF: synthetic field
   final aeD dnn;

   protected boolean x(int var1) {
      return (boolean)(var1 == aeD.r(this.dnn) ? -14843 & 8235 : -32767 & 9728);
   }

   protected int bh() {
      return aez.size();
   }

   protected void bg() {
      this.dnn.jA();
   }

   protected void q(int var1, boolean var2, int var3, int var4) {
      aeD.q(this.dnn, var1);
      this.dnn.p();
      if (var2) {
         this.dnn.q(aeD.w(this.dnn));
      }

   }

   protected void w(int var1, int var2, int var3, int var4, int var5, int var6) {
      aeA var7 = aez.kO(var1);
      aeD.q(this.dnn, var7.I(), var2, var3, 4246 & 3094);
      String var8 = StringUtils.isBlank(var7.XD()) ? q.q[2022 & -29978 & -16925 & 6583] : var7.XD();
      String var10000 = o.q[-27777 & -3201 & 11135 & -13449];
      Object[] var10001 = new Object[-11197 & 262];
      var10001[-15292 & 8218] = aeC.fD().XD().equals(var8) ? o.q[14203 & -18562 & -19592 & -15492] : o.q[-15489 & 20475 & 8185 & 8185];
      var10001[1155 & -24507] = var8;
      String var9 = aeH.hX(String.format(var10000, var10001));
      this.dnn.q(aeD.t(this.dnn), var9, var2 + (-32709 & 540), var3 + (8218 & 1575), -1 & -1);
      var10000 = o.q[-15366 & 17275 & 17402 & -23557];
      var10001 = new Object[8717 & -28637];
      var10001[137 & -16380] = aeD.atX().format(new Date(var7.atU()));
      String var10 = aeH.hX(String.format(var10000, var10001));
      this.dnn.q(aeD.e(this.dnn), var10, var2 + (28 & -32616), var3 + (653 & -32433), -1 & -1);
   }

   protected int bi() {
      return aez.size() * (159 & -23973);
   }

   public aeE(aeD var1, hS var2) {
      super(var2, var1.eo, var1.eC, (-20176 & 16421) + aeD.q(var1).Gf, var1.eC - (28784 & -31160), 1307 & 16575);
      this.dnn = var1;
   }
}
