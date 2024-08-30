import java.util.List;

public class FO extends Fm {
   protected final cv brD;

   public static boolean q(QI var0, DD var1, NW var2, GX var3) {
      Md var4 = Md.Jc();
      if (var4 == null) {
         return false;
      } else {
         if (var3.HZ() && var3.Ie().d(e.q[16893 & -27939], 10)) {
            No var5 = var0.h(var2);
            if (var5 != null) {
               if (!var0.bXF && var5.TV() && !var4.Pw().p(var1.mh())) {
                  return false;
               }

               HL var6 = new HL();
               HL var7 = (HL)var6.IA();
               var5.q(var6);
               HL var8 = (HL)var3.Ie().bP(e.q[15613 & 223]);
               var6.b(var8);
               var6.a(q.q[-24365 & 4695], var2.aY());
               var6.a(q.q[-19361 & 885], var2.aX());
               var6.a(q.q[119 & 4191], var2.KO());
               if (!var6.equals(var7)) {
                  var5.w(var6);
                  var5.vv();
                  return true;
               }
            }
         }

         return false;
      }
   }

   // $FF: synthetic method
   public Fm by(String var1) {
      return this.bB(var1);
   }

   public void w(Fm var1, yl var2, List var3) {
      this.brD.q(var1, var2, var3);
   }

   public boolean q(GX var1, DD var2, QI var3, NW var4, OK var5, float var6, float var7, float var8) {
      hI var9 = var3.g(var4);
      cv var10 = var9.ds();
      if (!var10.u(var3, var4)) {
         var4 = var4.v(var5);
      }

      if (var1.bsH == 0) {
         return false;
      } else if (!var2.q(var4, var5, var1)) {
         return false;
      } else if (var3.q(this.brD, var4, false, var5, (zk)null, var1)) {
         int var11 = this.ff(var1.dm());
         hI var12 = this.brD.q(var3, var4, var5, var6, var7, var8, var11, var2);
         if (var3.q(var4, var12, 3)) {
            var12 = var3.g(var4);
            if (var12.ds() == this.brD) {
               q(var3, var2, var4, var1);
               this.brD.q(var3, var4, var12, var2, var1);
            }

            var3.q((double)((float)var4.aY() + 0.5F), (double)((float)var4.aX() + 0.5F), (double)((float)var4.KO() + 0.5F), this.brD.nl.dc(), (this.brD.nl.de() + 1.0F) / 2.0F, this.brD.nl.df() * 0.8F);
            --var1.bsH;
         }

         return true;
      } else {
         return false;
      }
   }

   public String N(GX var1) {
      return this.brD.cM();
   }

   public FO(cv var1) {
      this.brD = var1;
   }

   public String cM() {
      return this.brD.cM();
   }

   public boolean q(QI var1, NW var2, OK var3, DD var4, GX var5) {
      cv var6 = var1.g(var2).ds();
      if (var6 == Ea.bhe) {
         var3 = OK.bQC;
      } else if (!var6.u(var1, var2)) {
         var2 = var2.v(var3);
      }

      return var1.q(this.brD, var2, false, var3, (zk)null, var5);
   }

   public yl HA() {
      return this.brD.cQ();
   }

   public cv ds() {
      return this.brD;
   }

   public FO bB(String var1) {
      super.by(var1);
      return this;
   }
}
