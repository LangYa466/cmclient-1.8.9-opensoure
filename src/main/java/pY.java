import com.google.common.base.Objects;

public class PY implements Comparable {
   private final int bUY;
   private final int bUZ;
   private final int bVa;
   public static final PY bVb = new PY(0, 0, 0);

   public double y(PY var1) {
      return this.M((double)var1.aY(), (double)var1.aX(), (double)var1.KO());
   }

   public int u(PY var1) {
      return this.aX() == var1.aX() ? (this.KO() == var1.KO() ? this.aY() - var1.aY() : this.KO() - var1.KO()) : this.aX() - var1.aX();
   }

   public double M(double var1, double var3, double var5) {
      double var7 = (double)this.aY() - var1;
      double var9 = (double)this.aX() - var3;
      double var11 = (double)this.KO() - var5;
      return var7 * var7 + var9 * var9 + var11 * var11;
   }

   public PY r(PY var1) {
      return new PY(this.aX() * var1.KO() - this.KO() * var1.aX(), this.KO() * var1.aY() - this.aY() * var1.KO(), this.aY() * var1.aX() - this.aX() * var1.aY());
   }

   public int hashCode() {
      return (this.aX() + this.KO() * 31) * 31 + this.aY();
   }

   public int KO() {
      return this.bVa;
   }

   public PY(int var1, int var2, int var3) {
      this.bUZ = var1;
      this.bUY = var2;
      this.bVa = var3;
   }

   public PY(double var1, double var3, double var5) {
      this(Pq.D(var1), Pq.D(var3), Pq.D(var5));
   }

   // $FF: synthetic method
   public int compareTo(Object var1) {
      return this.u((PY)var1);
   }

   public int aX() {
      return this.bUY;
   }

   public String toString() {
      return Objects.toStringHelper(this).add(q.q[2167 & 5843], this.aY()).add(q.q[-12203 & 8541], this.aX()).add(q.q[87 & 247], this.KO()).toString();
   }

   public int aY() {
      return this.bUZ;
   }

   public double N(double var1, double var3, double var5) {
      double var7 = (double)this.aY() + 0.5D - var1;
      double var9 = (double)this.aX() + 0.5D - var3;
      double var11 = (double)this.KO() + 0.5D - var5;
      return var7 * var7 + var9 * var9 + var11 * var11;
   }

   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (!(var1 instanceof PY)) {
         return false;
      } else {
         PY var2 = (PY)var1;
         return this.aY() != var2.aY() ? false : (this.aX() != var2.aX() ? false : this.KO() == var2.KO());
      }
   }
}
