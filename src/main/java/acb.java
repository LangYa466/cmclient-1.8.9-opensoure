public class acB extends acw {
   private int deA = 144 & 16737;
   private int deB;
   private int deC;
   private int deD;
   private acw deE;
   private acw[][] deF;

   public int apY() {
      this.deE.apO();
      this.apG();
      return this.deF.length;
   }

   public void apK() {
      if (this.deE == this) {
         super.apK();
      } else {
         this.deE.apK();
      }
   }

   public int apZ() {
      this.deE.apO();
      this.apG();
      return this.deF[836 & -20479].length;
   }

   public acw ca(int var1, int var2) {
      this.deE.apO();
      this.apG();
      if (var1 >= 0 && var1 < this.deF.length) {
         if (var2 >= 0 && var2 < this.deF[4614 & -5712].length) {
            return this.deE.R(var1 * (this.deB + this.deC) + this.deA, var2 * (this.deD + this.deC) + this.deA, this.deB, this.deD);
         } else {
            throw new RuntimeException(p.q[-19715 & -24915 & 9983 & 5375] + var1 + q.q[19403 & -31025 & -24709 & -27777] + var2);
         }
      } else {
         throw new RuntimeException(p.q[-32323 & -31507 & -6739 & 27373] + var1 + q.q[25343 & -19729 & -17829 & -28069] + var2);
      }
   }

   public acB(acw var1, int var2, int var3, int var4, int var5) {
      super(var1);
      this.deE = var1;
      this.deB = var2;
      this.deD = var3;
      this.deC = var4;
      this.deA = var5;
      this.apG();
   }

   protected void apG() {
      if (this.deF == null) {
         int var1 = (this.ab() - this.deA * (-7802 & 10) - this.deB) / (this.deB + this.deC) + (17473 & 8243);
         int var2 = (this.ac() - this.deA * (2627 & 8198) - this.deD) / (this.deD + this.deC) + (24577 & -29051);
         if ((this.ac() - this.deD) % (this.deD + this.deC) != 0) {
            ++var2;
         }

         this.deF = new acw[var1][var2];

         for(int var3 = 784 & -10172; var3 < var1; ++var3) {
            for(int var4 = 64 & 17411; var4 < var2; ++var4) {
               this.deF[var3][var4] = this.ca(var3, var4);
            }
         }

      }
   }

   public acw cb(int var1, int var2) {
      this.apO();
      if (var1 >= 0 && var1 < this.deF.length) {
         if (var2 >= 0 && var2 < this.deF[-24436 & 4352].length) {
            return this.deF[var1][var2];
         } else {
            throw new RuntimeException(p.q[-16131 & 27325 & 11951 & -18513] + var1 + q.q[2795 & 3051 & 1887 & 2047] + var2);
         }
      } else {
         throw new RuntimeException(p.q[19709 & -4419 & -6993 & -23825] + var1 + q.q[-7477 & -7301 & -30001 & 25295] + var2);
      }
   }

   public void apP() {
      if (this.deE == this) {
         super.apP();
      } else {
         this.deE.apP();
      }
   }

   public void q(aec var1) {
      if (this.deE == this) {
         super.q(var1);
      } else {
         this.deE.q(var1);
      }
   }
}
