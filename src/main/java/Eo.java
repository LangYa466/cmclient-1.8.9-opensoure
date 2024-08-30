import com.google.common.collect.Lists;
import java.util.List;

public class eO extends dk {
   private static final List sc = Lists.newArrayList(new String[]{p.q[999 & 13283], p.q[-27676 & 1012], p.q[5109 & -23577], w.q[-27748 & 3580], p.q[1015 & 12270]});

   public No q(QI var1, int var2) {
      return new NO();
   }

   public int cC() {
      return 3;
   }

   public void q(QI var1, NW var2, DD var3) {
      if (!var1.bXF) {
         No var4 = var1.h(var2);
         if (var4 instanceof NO) {
            ((NO)var4).ae(var1, var2);
            var3.w(Nj.bKt);
         }
      }

   }

   public void q(QI var1, NW var2, hI var3, cv var4) {
      boolean var5 = var1.aA(var2);
      No var6 = var1.h(var2);
      if (var6 instanceof NO) {
         NO var7 = (NO)var6;
         if (var7.bNA != var5) {
            if (var5) {
               var7.ae(var1, var2);
            }

            var7.bNA = var5;
         }
      }

   }

   private String Z(int var1) {
      if (var1 < 0 || var1 >= sc.size()) {
         var1 = 0;
      }

      return (String)sc.get(var1);
   }

   public eO() {
      super(hn.zJ);
      this.q(yl.aLN);
   }

   public boolean q(QI var1, NW var2, hI var3, int var4, int var5) {
      float var6 = (float)Math.pow(2.0D, (double)(var5 - 12) / 12.0D);
      var1.q((double)var2.aY() + 0.5D, (double)var2.aX() + 0.5D, (double)var2.KO() + 0.5D, p.q[-11278 & 3050] + this.Z(var4), 3.0F, var6);
      var1.q(OP.bRH, (double)var2.aY() + 0.5D, (double)var2.aX() + 1.2D, (double)var2.KO() + 0.5D, (double)var5 / 24.0D, 0.0D, 0.0D);
      return true;
   }

   public boolean q(QI var1, NW var2, hI var3, DD var4, OK var5, float var6, float var7, float var8) {
      if (var1.bXF) {
         return true;
      } else {
         No var9 = var1.h(var2);
         if (var9 instanceof NO) {
            NO var10 = (NO)var9;
            var10.UQ();
            var10.ae(var1, var2);
            var4.w(Nj.bKv);
         }

         return true;
      }
   }
}
