import java.util.Arrays;

public class Ze implements Qx {
   private final int cAN;
   private final int cAO;
   private final int cAP;
   private final Qm cAQ;
   private final int cAR;
   private final int cAS;
   private final int cAT;
   private static final net.optifine.util.q cAU = new net.optifine.util.q(Integer.TYPE, 16);
   private final boolean cAV = MV.Tg();
   private int[] ajr;
   private static final net.optifine.util.q cAW = new net.optifine.util.q(hI.class, 16);
   private final int cAX;
   private final int cAY;
   private hI[] ajn;

   public boolean YP() {
      return this.cAQ.YP();
   }

   public int u(NW var1, OK var2) {
      return this.cAQ.u(var1, var2);
   }

   public Rl ai(NW var1) {
      return this.cAQ.ai(var1);
   }

   public void agX() {
      cAU.b(this.ajr);
      this.ajr = null;
      cAW.b(this.ajn);
      this.ajn = null;
   }

   private int u(NW var1, int var2) {
      int var3 = this.cAQ.q(var1, var2);
      if (this.cAV && !this.g(var1).ds().cr()) {
         var3 = Xz.q(var1, var3);
      }

      return var3;
   }

   public boolean aj(NW var1) {
      return this.cAQ.aj(var1);
   }

   public Rb Ks() {
      return this.cAQ.Ks();
   }

   public void agY() {
      if (this.ajr == null) {
         this.ajr = (int[])cAU.jz(this.cAS);
      }

      Arrays.fill(this.ajr, -1);
      if (this.ajn == null) {
         this.ajn = (hI[])cAW.jz(this.cAS);
      }

      Arrays.fill(this.ajn, (Object)null);
   }

   public int q(NW var1, int var2) {
      int var3 = this.j(var1);
      if (var3 >= 0 && var3 < this.cAS && this.ajr != null) {
         int var4 = this.ajr[var3];
         if (var4 == -1) {
            var4 = this.u(var1, var2);
            this.ajr[var3] = var4;
         }

         return var4;
      } else {
         return this.u(var1, var2);
      }
   }

   public No h(NW var1) {
      return this.cAQ.h(var1);
   }

   public hI g(NW var1) {
      int var2 = this.j(var1);
      if (var2 >= 0 && var2 < this.cAS && this.ajn != null) {
         hI var3 = this.ajn[var2];
         if (var3 == null) {
            var3 = this.cAQ.g(var1);
            this.ajn[var2] = var3;
         }

         return var3;
      } else {
         return this.cAQ.g(var1);
      }
   }

   private int j(NW var1) {
      int var2 = var1.aY() - this.cAP;
      if (var2 >= 0 && var2 < this.cAO) {
         int var3 = var1.aX() - this.cAY;
         if (var3 >= 0 && var3 < this.cAT) {
            int var4 = var1.KO() - this.cAN;
            return var4 >= 0 && var4 < this.cAX ? var4 * this.cAR + var3 * this.cAO + var2 : -1;
         } else {
            return -1;
         }
      } else {
         return -1;
      }
   }

   public Ze(Qm var1, NW var2, NW var3, int var4) {
      this.cAQ = var1;
      int var5 = var2.aY() - var4 >> 4;
      int var6 = var2.aX() - var4 >> 4;
      int var7 = var2.KO() - var4 >> 4;
      int var8 = var3.aY() + var4 >> 4;
      int var9 = var3.aX() + var4 >> 4;
      int var10 = var3.KO() + var4 >> 4;
      this.cAO = var8 - var5 + 1 << 4;
      this.cAT = var9 - var6 + 1 << 4;
      this.cAX = var10 - var7 + 1 << 4;
      this.cAR = this.cAO * this.cAT;
      this.cAS = this.cAO * this.cAT * this.cAX;
      this.cAP = var5 << 4;
      this.cAY = var6 << 4;
      this.cAN = var7 << 4;
   }
}
