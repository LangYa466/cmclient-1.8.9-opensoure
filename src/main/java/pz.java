public class PZ {
   private byte bVc;
   private byte bVd;
   private byte bVe;
   private byte bVf;

   public byte XV() {
      return this.bVf;
   }

   public PZ(byte var1, byte var2, byte var3, byte var4) {
      this.bVf = var1;
      this.bVe = var2;
      this.bVc = var3;
      this.bVd = var4;
   }

   public int hashCode() {
      int var1 = this.bVf;
      var1 = 31 * var1 + this.bVe;
      var1 = 31 * var1 + this.bVc;
      var1 = 31 * var1 + this.bVd;
      return var1;
   }

   public byte XW() {
      return this.bVd;
   }

   public PZ(PZ var1) {
      this.bVf = var1.bVf;
      this.bVe = var1.bVe;
      this.bVc = var1.bVc;
      this.bVd = var1.bVd;
   }

   public byte XX() {
      return this.bVc;
   }

   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (!(var1 instanceof PZ)) {
         return false;
      } else {
         PZ var2 = (PZ)var1;
         return this.bVf != var2.bVf ? false : (this.bVd != var2.bVd ? false : (this.bVe != var2.bVe ? false : this.bVc == var2.bVc));
      }
   }

   public byte XY() {
      return this.bVe;
   }
}
