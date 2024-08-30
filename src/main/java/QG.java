import java.util.ArrayList;

public class Qg extends ArrayList {
   public Qg() {
   }

   public void t(IG var1) {
      var1.writeByte((byte)(this.size() & 255));

      for(int var2 = 0; var2 < this.size(); ++var2) {
         Qf var3 = (Qf)this.get(var2);
         var1.ao(var3.Yk());
         var1.ao(var3.Ye());
         GX var4 = var3.Yh();
         var1.writeBoolean(var4 != null);
         if (var4 != null) {
            var1.ao(var4);
         }

         var1.writeBoolean(var3.Yd());
         var1.writeInt(var3.Yc());
         var1.writeInt(var3.Yj());
      }

   }

   public void I(HL var1) {
      HT var2 = var1.s(p.q[4239 & 24843], 10);

      for(int var3 = 0; var3 < var2.II(); ++var3) {
         HL var4 = var2.fv(var3);
         this.add(new Qf(var4));
      }

   }

   public Qg(HL var1) {
      this.I(var1);
   }

   public HL Yl() {
      HL var1 = new HL();
      HT var2 = new HT();

      for(int var3 = 0; var3 < this.size(); ++var3) {
         Qf var4 = (Qf)this.get(var3);
         var2.q(var4.Yi());
      }

      var1.w(p.q[-32421 & 11791], var2);
      return var1;
   }

   private boolean i(GX var1, GX var2) {
      return GX.e(var1, var2) && (!var2.HZ() || var1.HZ() && HX.q(var2.Ie(), var1.Ie(), false));
   }

   public static Qg y(IG var0) {
      Qg var1 = new Qg();
      int var2 = var0.readByte() & 255;

      for(int var3 = 0; var3 < var2; ++var3) {
         GX var4 = var0.Je();
         GX var5 = var0.Je();
         GX var6 = null;
         if (var0.readBoolean()) {
            var6 = var0.Je();
         }

         boolean var7 = var0.readBoolean();
         int var8 = var0.readInt();
         int var9 = var0.readInt();
         Qf var10 = new Qf(var4, var6, var5, var8, var9);
         if (var7) {
            var10.Yg();
         }

         var1.add(var10);
      }

      return var1;
   }

   public Qf q(GX var1, GX var2, int var3) {
      if (var3 > 0 && var3 < this.size()) {
         Qf var6 = (Qf)this.get(var3);
         return this.i(var1, var6.Yk()) && (var2 == null && !var6.Yb() || var6.Yb() && this.i(var2, var6.Yh())) && var1.bsH >= var6.Yk().bsH && (!var6.Yb() || var2.bsH >= var6.Yh().bsH) ? var6 : null;
      } else {
         for(int var4 = 0; var4 < this.size(); ++var4) {
            Qf var5 = (Qf)this.get(var4);
            if (this.i(var1, var5.Yk()) && var1.bsH >= var5.Yk().bsH && (!var5.Yb() && var2 == null || var5.Yb() && this.i(var2, var5.Yh()) && var2.bsH >= var5.Yh().bsH)) {
               return var5;
            }
         }

         return null;
      }
   }
}
