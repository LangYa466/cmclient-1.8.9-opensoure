import java.util.List;

public class wu extends wd {
   public int vE() {
      return 2;
   }

   public String vJ() {
      return p.q[2203 & 24747];
   }

   protected String[] vT() {
      return Md.Jc().vM();
   }

   public boolean w(String[] var1, int var2) {
      return var2 == 1;
   }

   public List q(wZ var1, String[] var2, NW var3) {
      return var2.length == 1 ? q(var2, new String[]{e.q[466 & 6594], e.q[1020 & 8660], e.q[22523 & 635], e.q[17365 & 1503]}) : (var2.length == 2 ? q(var2, this.vT()) : null);
   }

   public void q(wZ var1, String[] var2) {
      if (var2.length <= 0) {
         throw new xr(p.q[-30516 & 16574], new Object[0]);
      } else {
         Ra var3 = this.i(var1, var2[0]);
         DH var4 = var2.length >= 2 ? u(var1, var2[1]) : q(var1);
         var4.q(var3);
         var4.aNI = 0.0F;
         if (var1.vQ().vU().bL(q.q[-29826 & 5756])) {
            var4.q(new Op(p.q[-28273 & 17101], new Object[0]));
         }

         Op var5 = new Op(y.q[4719 & 8783] + var3.bY(), new Object[0]);
         if (var4 != var1) {
            q(var1, this, 1, p.q[-24178 & 2751], new Object[]{var4.bY(), var5});
         } else {
            q(var1, this, 1, p.q[-5745 & 175], new Object[]{var5});
         }

      }
   }

   protected Ra i(wZ var1, String var2) {
      return !var2.equalsIgnoreCase(Ra.bYM.bY()) && !var2.equalsIgnoreCase(e.q[1250 & -12037]) ? (!var2.equalsIgnoreCase(Ra.bYN.bY()) && !var2.equalsIgnoreCase(e.q[1358 & -15649]) ? (!var2.equalsIgnoreCase(Ra.bYO.bY()) && !var2.equalsIgnoreCase(e.q[-16308 & 2908]) ? (!var2.equalsIgnoreCase(Ra.bYP.bY()) && !var2.equalsIgnoreCase(p.q[1201 & -19822]) ? QZ.hn(y(var2, 0, Ra.values().length - 2)) : Ra.bYP) : Ra.bYO) : Ra.bYN) : Ra.bYM;
   }

   public String e(wZ var1) {
      return p.q[-26147 & 686];
   }
}
