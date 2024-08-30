import java.util.List;

public class wr extends wd {
   public List q(wZ var1, String[] var2, NW var3) {
      return var2.length == 1 ? q(var2, Md.Jc().vM()) : (var2.length > 1 && var2.length <= 4 ? w(var2, 1, var3) : (var2.length > 5 && var2.length <= 8 && i.q[470 & -26658].equals(var2[4]) ? w(var2, 5, var3) : (var2.length == 9 && i.q[25558 & -26154].equals(var2[4]) ? q(var2, cv.nk.Xx()) : null)));
   }

   public String e(wZ var1) {
      return i.q[5629 & 8661];
   }

   public String vJ() {
      return i.q[-13355 & 1492];
   }

   public boolean w(String[] var1, int var2) {
      return var2 == 0;
   }

   public void q(wZ var1, String[] var2) {
      if (var2.length < 5) {
         throw new xr(i.q[16853 & 10717], new Object[0]);
      } else {
         zk var3 = q(var1, var2[0], zk.class);
         double var4 = w(var3.aNZ, var2[1], false);
         double var6 = w(var3.aNK, var2[2], false);
         double var8 = w(var3.aOt, var2[3], false);
         NW var10 = new NW(var4, var6, var8);
         byte var11 = 4;
         if (i.q[-27690 & 26102].equals(var2[4]) && var2.length > 10) {
            QI var12 = var3.vQ();
            double var13 = w(var4, var2[5], false);
            double var15 = w(var6, var2[6], false);
            double var17 = w(var8, var2[7], false);
            cv var19 = r(var1, var2[8]);
            int var20 = y(var2[9], -1, 15);
            NW var21 = new NW(var13, var15, var17);
            hI var22 = var12.g(var21);
            if (var22.ds() != var19 || var20 >= 0 && var22.ds().e(var22) != var20) {
               throw new wq(i.q[983 & 471], new Object[]{i.q[-15914 & 15870], var3.bY()});
            }

            var11 = 10;
         }

         String var24 = e(var2, var11);
         ws var25 = new ws(this, var3, var1, var10, var4, var6, var8);
         wY var14 = Md.Jc().PP();

         try {
            int var26 = var14.o(var25, var24);
            if (var26 < 1) {
               throw new wq(i.q[473 & -4648], new Object[]{var24});
            }
         } catch (Throwable var23) {
            throw new wq(i.q[31191 & -31241], new Object[]{var24, var3.bY()});
         }
      }
   }

   public int vE() {
      return 2;
   }
}
