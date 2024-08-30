public class Qn {
   private int bVX = 0;
   public final int bVY;
   public final int bVZ;

   public int YQ() {
      return this.bVZ << 4;
   }

   public int YR() {
      return (this.bVZ << 4) + 15;
   }

   public NW I(int var1, int var2, int var3) {
      return new NW((this.bVY << 4) + var1, var2, (this.bVZ << 4) + var3);
   }

   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (!(var1 instanceof Qn)) {
         return false;
      } else {
         Qn var2 = (Qn)var1;
         return this.bVY == var2.bVY && this.bVZ == var2.bVZ;
      }
   }

   public int YS() {
      return this.bVY << 4;
   }

   public static long aJ(int var0, int var1) {
      return (long)var0 & 4294967295L | ((long)var1 & 4294967295L) << 32;
   }

   public Qn(int var1, int var2) {
      this.bVY = var1;
      this.bVZ = var2;
   }

   public int YT() {
      return (this.bVY << 4) + 8;
   }

   public int hashCode() {
      if (this.bVX == 0) {
         int var1 = 1664525 * this.bVY + 1013904223;
         int var2 = 1664525 * (this.bVZ ^ -559038737) + 1013904223;
         this.bVX = var1 ^ var2;
      }

      return this.bVX;
   }

   public String toString() {
      return w.q[-32271 & 17855] + this.bVY + q.q[2159 & 638] + this.bVZ + q.q[1948 & -17508];
   }

   public int YU() {
      return (this.bVZ << 4) + 8;
   }

   public NW hg(int var1) {
      return new NW(this.YT(), var1, this.YU());
   }

   public int YV() {
      return (this.bVY << 4) + 15;
   }
}
