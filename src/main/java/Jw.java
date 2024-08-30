public class jw implements jC {
   private final iU JP;
   // $FF: synthetic field
   final jt JQ;
   private final String JR;
   private final iU JS;
   private final vP JT;

   public void t(int var1, int var2, int var3, int var4, int var5, int var6) {
      this.JS.f(var2, var3);
      this.JP.f(var2, var3);
   }

   public void q(int var1, int var2, int var3, int var4, int var5, int var6, int var7, boolean var8) {
      boolean var9 = jt.e(this.JQ).GV == this.JT;
      jt.w(this.JQ).CB.q(this.JR, var2 + 90 - jt.q(this.JQ), var3 + var5 / 2 - jt.w(this.JQ).CB.Gf / 2, 16777215);
      this.JP.Gv = var2 + 190;
      this.JP.hF = var3;
      this.JP.aM = this.JT.bB() != this.JT.uQ();
      this.JP.r(jt.w(this.JQ), var6, var7);
      this.JS.Gv = var2 + 105;
      this.JS.hF = var3;
      this.JS.iX = vL.dh(this.JT.bB());
      boolean var10 = false;
      if (this.JT.bB() != 0) {
         for(vP var14 : jt.w(this.JQ).Br.aCQ) {
            if (var14 != this.JT && var14.bB() == this.JT.bB()) {
               var10 = true;
               break;
            }
         }
      }

      if (var9) {
         this.JS.iX = OJ.bQm + y.q[1956 & 644] + OJ.bQl + this.JS.iX + OJ.bQm + y.q[-25675 & 17029];
      } else if (var10) {
         this.JS.iX = OJ.bQj + this.JS.iX;
      }

      this.JS.r(jt.w(this.JQ), var6, var7);
   }

   public void f(int var1, int var2, int var3) {
   }

   public boolean y(int var1, int var2, int var3, int var4, int var5, int var6) {
      if (this.JS.w(jt.w(this.JQ), var2, var3)) {
         jt.e(this.JQ).GV = this.JT;
         return true;
      } else if (this.JP.w(jt.w(this.JQ), var2, var3)) {
         jt.w(this.JQ).Br.q(this.JT, this.JT.uQ());
         vP.uR();
         return true;
      } else {
         return false;
      }
   }

   private jw(jt var1, vP var2) {
      this.JQ = var1;
      this.JT = var2;
      this.JR = uI.q(var2.uU());
      this.JS = new iU(0, 0, 0, 75, 20, uI.q(var2.uU()));
      this.JP = new iU(0, 0, 0, 50, 20, uI.q(u.q[-15362 & 15231]));
   }
}
