public class QE implements Comparable {
   private final cv bWN;
   public long bWO;
   public int aVw;
   private long bWP;
   public final NW bWQ;
   private static long bWR;

   // $FF: synthetic method
   public int compareTo(Object var1) {
      return this.q((QE)var1);
   }

   public QE m(long var1) {
      this.bWO = var1;
      return this;
   }

   public int hashCode() {
      return this.bWQ.hashCode();
   }

   public void hi(int var1) {
      this.aVw = var1;
   }

   public String toString() {
      return cv.w(this.bWN) + q.q[1684 & -5498] + this.bWQ + q.q[-30993 & 6254] + this.bWO + q.q[16494 & 638] + this.aVw + q.q[12414 & 110] + this.bWP;
   }

   public cv ds() {
      return this.bWN;
   }

   public int q(QE var1) {
      return this.bWO < var1.bWO ? -1 : (this.bWO > var1.bWO ? 1 : (this.aVw != var1.aVw ? this.aVw - var1.aVw : (this.bWP < var1.bWP ? -1 : (this.bWP > var1.bWP ? 1 : 0))));
   }

   public QE(NW var1, cv var2) {
      this.bWP = (long)(bWR++);
      this.bWQ = var1;
      this.bWN = var2;
   }

   public boolean equals(Object var1) {
      if (!(var1 instanceof QE)) {
         return false;
      } else {
         QE var2 = (QE)var1;
         return this.bWQ.equals(var2.bWQ) && cv.q(this.bWN, var2.bWN);
      }
   }
}
