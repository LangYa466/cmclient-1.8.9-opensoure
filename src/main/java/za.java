import java.nio.ByteBuffer;
import java.nio.IntBuffer;

public class ZA {
   private int bSW = 4096;
   private IntBuffer cDn;
   private int alI;
   private OS cpS = null;
   private int cDo;
   private final int cDp;
   private int ayc = qa.oz();
   private final net.optifine.util.z cDq = new net.optifine.util.z();
   private Zz cDr = null;
   private IntBuffer cDs;
   private int cDt = 0;

   private void iI(int var1) {
      if (!this.cDq.isEmpty()) {
         Zz var2 = this.cDr;
         if (var2 == null || !this.cDq.e(var2.ahH())) {
            var2 = (Zz)this.cDq.amx().amA();
         }

         int var3 = var2.ahF();
         Zz var4 = var2.ahG();
         if (var4 == null) {
            var3 = 0;
         } else {
            var3 = var4.ahJ();
         }

         int var5 = 0;

         while(var2 != null && var5 < var1) {
            ++var5;
            if (var2.ahF() == var3) {
               var3 += var2.bh();
               var2 = var2.ahI();
            } else {
               int var6 = var2.ahF() - var3;
               if (var2.bh() <= var6) {
                  this.aj(var2.ahF(), var3, var2.bh());
                  var2.iH(var3);
                  var3 += var2.bh();
                  var2 = var2.ahI();
               } else {
                  this.iJ(this.cDt + var2.bh());
                  this.aj(var2.ahF(), this.cDt, var2.bh());
                  var2.iH(this.cDt);
                  this.cDt += var2.bh();
                  Zz var7 = var2.ahI();
                  this.cDq.r(var2.ahH());
                  this.cDq.t(var2.ahH());
                  var2 = var7;
               }
            }
         }

         if (var2 == null) {
            this.cDt = ((Zz)this.cDq.amy().amA()).ahJ();
         }

         this.cDr = var2;
      }

   }

   public void sQ() {
      qa.T(qa.aii, 0);
   }

   private void iJ(int var1) {
      if (this.bSW < var1) {
         this.iL(var1);
      }

   }

   public int ahK() {
      return this.cDt;
   }

   public void sP() {
      qa.T(qa.aii, this.ayc);
   }

   public void q(qn var1) {
      this.sP();
      var1.pw();
      this.cDn.flip();
      this.cDs.flip();
      pz.q(this.alI, this.cDn, this.cDs);
      this.cDn.limit(this.cDn.capacity());
      this.cDs.limit(this.cDs.capacity());
      if (this.cDt > this.cDo * 11 / 10) {
         this.iI(1);
      }

   }

   public void sN() {
      if (this.ayc >= 0) {
         qa.ck(this.ayc);
         this.ayc = -1;
      }

   }

   public void q(ByteBuffer var1, Zz var2) {
      int var3 = var2.ahF();
      int var4 = var2.bh();
      int var5 = this.K((long)var1.limit());
      if (var5 <= 0) {
         if (var3 >= 0) {
            var2.iH(-1);
            var2.hx(0);
            this.cDq.r(var2.ahH());
            this.cDo -= var4;
         }
      } else {
         if (var5 > var4) {
            var2.iH(this.cDt);
            var2.hx(var5);
            this.cDt += var5;
            if (var3 >= 0) {
               this.cDq.r(var2.ahH());
            }

            this.cDq.t(var2.ahH());
         }

         var2.hx(var5);
         this.cDo += var5 - var4;
         this.iJ(var2.ahJ());
         long var6 = this.iK(var2.ahF());
         this.sP();
         qa.q(qa.aii, var6, var1);
         this.sQ();
         if (this.cDt > this.cDo * 11 / 10) {
            this.iI(1);
         }
      }

   }

   private void ahL() {
      int var1 = 0;
      int var2 = 0;

      for(Zz var3 = (Zz)this.cDq.amx().amA(); var3 != null; var3 = var3.ahI()) {
         ++var1;
         var2 += var3.bh();
         if (var3.ahF() < 0 || var3.bh() <= 0 || var3.ahJ() > this.cDt) {
            throw new RuntimeException(q.q[23125 & -32225] + var3);
         }

         Zz var4 = var3.ahG();
         if (var4 != null && var3.ahF() < var4.ahJ()) {
            throw new RuntimeException(q.q[821 & -11691] + var3);
         }

         Zz var5 = var3.ahI();
         if (var5 != null && var3.ahJ() > var5.ahF()) {
            throw new RuntimeException(q.q[7101 & 26133] + var3);
         }
      }

      if (var1 != this.cDq.bh()) {
         throw new RuntimeException(a.q[17573 & -21841] + var1 + a.q[4262 & 174] + this.cDq.bh());
      } else if (var2 != this.cDo) {
         throw new RuntimeException(a.q[695 & -24409] + var2 + a.q[5286 & 24743] + this.cDo);
      }
   }

   public ZA(OS var1) {
      this.cDn = MV.bL(this.bSW);
      this.cDs = MV.bL(this.bSW);
      this.alI = 7;
      this.cDp = us.axV.sT();
      this.cpS = var1;
      this.sP();
      long var2 = this.iK(this.bSW);
      qa.q(qa.aii, var2, qa.aiZ);
      this.sQ();
   }

   private long iK(int var1) {
      return (long)var1 * (long)this.cDp;
   }

   private void iL(int var1) {
      int var2;
      for(var2 = this.bSW * 6 / 4; var2 < var1; var2 = var2 * 6 / 4) {
         ;
      }

      long var3 = this.iK(this.bSW);
      long var5 = this.iK(var2);
      int var7 = qa.oz();
      qa.T(qa.aii, var7);
      qa.q(qa.aii, var5, qa.aiZ);
      MV.cN(a.q[-31571 & 2297]);
      qa.T(qa.aii, 0);
      qa.T(qa.aiA, this.ayc);
      qa.T(qa.aiG, var7);
      qa.q(qa.aiA, qa.aiG, 0L, 0L, var3);
      MV.cN(a.q[751 & 186] + var5);
      qa.T(qa.aiA, 0);
      qa.T(qa.aiG, 0);
      qa.ck(this.ayc);
      this.cDn = MV.bL(var2);
      this.cDs = MV.bL(var2);
      this.ayc = var7;
      this.bSW = var2;
   }

   public void q(int var1, Zz var2) {
      if (this.alI != var1) {
         if (this.cDn.position() > 0) {
            throw new IllegalArgumentException(a.q[16555 & 4847] + this.alI + e.q[9929 & -32320] + var1);
         }

         this.alI = var1;
      }

      this.cDn.put(var2.ahF());
      this.cDs.put(var2.bh());
   }

   private int K(long var1) {
      return (int)(var1 / (long)this.cDp);
   }

   private void aj(int var1, int var2, int var3) {
      long var4 = this.iK(var1);
      long var6 = this.iK(var2);
      long var8 = this.iK(var3);
      qa.T(qa.aiA, this.ayc);
      qa.T(qa.aiG, this.ayc);
      qa.q(qa.aiA, qa.aiG, var4, var6, var8);
      MV.cN(a.q[1450 & -24392]);
      qa.T(qa.aiA, 0);
      qa.T(qa.aiG, 0);
   }
}
