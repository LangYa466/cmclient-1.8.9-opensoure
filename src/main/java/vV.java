import java.util.List;
import java.util.Random;

public class VV extends Wh {
   private cv cmF;
   private cv cmG;
   private cv cmH;
   private cv cmI;

   protected void P(HL var1) {
      super.P(var1);
      this.cmF = cv.K(var1.bQ(t.q[1842 & 21050]));
      this.cmH = cv.K(var1.bQ(t.q[-8649 & 571]));
      this.cmG = cv.K(var1.bQ(t.q[17077 & 2684]));
      this.cmI = cv.K(var1.bQ(t.q[2869 & 637]));
   }

   private cv h(Random var1) {
      switch(var1.nextInt(5)) {
      case 0:
         return Ea.bij;
      case 1:
         return Ea.bil;
      default:
         return Ea.bjR;
      }
   }

   public boolean q(QI var1, Random var2, Ur var3) {
      if (this.cmY < 0) {
         this.cmY = this.w(var1, var3);
         if (this.cmY < 0) {
            return true;
         }

         this.ckN.ac(0, this.cmY - this.ckN.ckK + 4 - 1, 0);
      }

      this.q(var1, var3, 0, 1, 0, 12, 4, 8, Ea.bjN.cx(), Ea.bjN.cx(), false);
      this.q(var1, var3, 1, 0, 1, 2, 0, 7, Ea.biE.cx(), Ea.biE.cx(), false);
      this.q(var1, var3, 4, 0, 1, 5, 0, 7, Ea.biE.cx(), Ea.biE.cx(), false);
      this.q(var1, var3, 7, 0, 1, 8, 0, 7, Ea.biE.cx(), Ea.biE.cx(), false);
      this.q(var1, var3, 10, 0, 1, 11, 0, 7, Ea.biE.cx(), Ea.biE.cx(), false);
      this.q(var1, var3, 0, 0, 0, 0, 0, 8, Ea.bkr.cx(), Ea.bkr.cx(), false);
      this.q(var1, var3, 6, 0, 0, 6, 0, 8, Ea.bkr.cx(), Ea.bkr.cx(), false);
      this.q(var1, var3, 12, 0, 0, 12, 0, 8, Ea.bkr.cx(), Ea.bkr.cx(), false);
      this.q(var1, var3, 1, 0, 0, 11, 0, 0, Ea.bkr.cx(), Ea.bkr.cx(), false);
      this.q(var1, var3, 1, 0, 8, 11, 0, 8, Ea.bkr.cx(), Ea.bkr.cx(), false);
      this.q(var1, var3, 3, 0, 1, 3, 0, 7, Ea.bgT.cx(), Ea.bgT.cx(), false);
      this.q(var1, var3, 9, 0, 1, 9, 0, 7, Ea.bgT.cx(), Ea.bgT.cx(), false);

      for(int var4 = 1; var4 <= 7; ++var4) {
         this.w(var1, this.cmF.J(Pq.q(var2, 2, 7)), 1, 1, var4, var3);
         this.w(var1, this.cmF.J(Pq.q(var2, 2, 7)), 2, 1, var4, var3);
         this.w(var1, this.cmH.J(Pq.q(var2, 2, 7)), 4, 1, var4, var3);
         this.w(var1, this.cmH.J(Pq.q(var2, 2, 7)), 5, 1, var4, var3);
         this.w(var1, this.cmG.J(Pq.q(var2, 2, 7)), 7, 1, var4, var3);
         this.w(var1, this.cmG.J(Pq.q(var2, 2, 7)), 8, 1, var4, var3);
         this.w(var1, this.cmI.J(Pq.q(var2, 2, 7)), 10, 1, var4, var3);
         this.w(var1, this.cmI.J(Pq.q(var2, 2, 7)), 11, 1, var4, var3);
      }

      for(int var6 = 0; var6 < 9; ++var6) {
         for(int var5 = 0; var5 < 13; ++var5) {
            this.w(var1, var5, 4, var6, var3);
            this.q(var1, Ea.bjj.cx(), var5, -1, var6, var3);
         }
      }

      return true;
   }

   public VV() {
   }

   public VV(Wf var1, int var2, Random var3, Ur var4, OK var5) {
      super(var1, var2);
      this.ckO = var5;
      this.ckN = var4;
      this.cmF = this.h(var3);
      this.cmH = this.h(var3);
      this.cmG = this.h(var3);
      this.cmI = this.h(var3);
   }

   protected void O(HL var1) {
      super.O(var1);
      var1.a(t.q[25142 & 5682], cv.nk.x(this.cmF));
      var1.a(t.q[2875 & 4851], cv.nk.x(this.cmH));
      var1.a(t.q[-27979 & 17276], cv.nk.x(this.cmG));
      var1.a(t.q[1589 & 9077], cv.nk.x(this.cmI));
   }

   public static VV u(Wf var0, List var1, Random var2, int var3, int var4, int var5, OK var6, int var7) {
      Ur var8 = Ur.q(var3, var4, var5, 0, 0, 0, 13, 4, 9, var6);
      return y(var8) && Ut.q(var1, var8) == null ? new VV(var0, var7, var2, var8, var6) : null;
   }
}
