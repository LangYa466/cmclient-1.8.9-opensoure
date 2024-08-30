import java.util.List;

public class wg extends wd {
   public String e(wZ var1) {
      return u.q[485 & -22677];
   }

   public List q(wZ var1, String[] var2, NW var3) {
      return var2.length == 1 ? q(var2, this.vK()) : (var2.length == 2 ? q(var2, Fm.bqX.Xx()) : null);
   }

   protected String[] vK() {
      return Md.Jc().vM();
   }

   public boolean w(String[] var1, int var2) {
      return var2 == 0;
   }

   public int vE() {
      return 2;
   }

   public String vJ() {
      return w.q[-31107 & 16493];
   }

   public void q(wZ var1, String[] var2) {
      DH var3 = var2.length == 0 ? q(var1) : u(var1, var2[0]);
      Fm var4 = var2.length >= 2 ? e(var1, var2[1]) : null;
      int var5 = var2.length >= 3 ? u(var2[2], -1) : -1;
      int var6 = var2.length >= 4 ? u(var2[3], -1) : -1;
      HL var7 = null;
      if (var2.length >= 5) {
         try {
            var7 = Hz.bE(e(var2, 4));
         } catch (HG var9) {
            throw new wq(u.q[8555 & 6114], new Object[]{var9.getMessage()});
         }
      }

      if (var2.length >= 2 && var4 == null) {
         throw new wq(u.q[359 & 22379], new Object[]{var3.bY()});
      } else {
         int var8 = var3.bdM.q(var4, var5, var6, var7);
         var3.bdW.Ha();
         if (!var3.bdO.bfz) {
            var3.Gm();
         }

         var1.q(wG.aKc, var8);
         if (var8 == 0) {
            throw new wq(u.q[8551 & 17267], new Object[]{var3.bY()});
         } else {
            if (var6 == 0) {
               var1.q(new Op(u.q[20836 & -23708], new Object[]{var3.bY(), var8}));
            } else {
               q(var1, this, u.q[13813 & 19303], new Object[]{var3.bY(), var8});
            }

         }
      }
   }
}
