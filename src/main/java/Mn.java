import com.google.common.collect.Lists;
import java.io.File;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class mN {
   private final List Zp = Lists.newArrayList();
   private final hS Zq;
   private static final Logger Zr = LogManager.getLogger();

   public mN(hS var1) {
      this.Zq = var1;
      this.lM();
   }

   public void bs(int var1) {
      this.Zp.remove(var1);
   }

   public void lM() {
      try {
         this.Zp.clear();

         for(String var2 : this.Zq.Bn.dml) {
            this.Zp.add(new agK(var2));
         }

         HL var5 = Hy.t(new File(this.Zq.Ci, i.q[18935 & 1023]));
         if (var5 == null) {
            return;
         }

         HT var6 = var5.s(i.q[-31240 & 13304], 10);

         for(int var3 = 0; var3 < var6.II(); ++var3) {
            this.Zp.add(mL.e(var6.fv(var3)));
         }
      } catch (Exception var4) {
         Zr.error(i.q[-11783 & 9211], var4);
      }

   }

   public int lN() {
      return this.Zp.size();
   }

   public void r(mL var1) {
      this.Zp.add(var1);
   }

   public static void t(mL var0) {
      mN var1 = new mN(hS.eV());
      var1.lM();

      for(int var2 = 0; var2 < var1.lN(); ++var2) {
         mL var3 = var1.bt(var2);
         if (var3.eP.equals(var0.eP) && var3.Zd.equals(var0.Zd)) {
            var1.q(var2, var0);
            break;
         }
      }

      var1.lO();
   }

   public void q(int var1, mL var2) {
      this.Zp.set(var1, var2);
   }

   public void lO() {
      try {
         HT var1 = new HT();

         for(mL var3 : this.Zp) {
            if (!(var3 instanceof agK)) {
               var1.q(var3.lH());
            }
         }

         HL var5 = new HL();
         var5.w(i.q[5112 & 16889], var1);
         Hy.q(var5, new File(this.Zq.Ci, i.q[2551 & 9719]));
      } catch (Exception var4) {
         Zr.error(i.q[-28166 & 25599], var4);
      }

   }

   public mL bt(int var1) {
      return (mL)this.Zp.get(var1);
   }

   public void J(int var1, int var2) {
      mL var3 = this.bt(var1);
      this.Zp.set(var1, this.bt(var2));
      this.Zp.set(var2, var3);
      this.lO();
   }
}
