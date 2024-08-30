import java.io.DataInput;
import java.io.DataOutput;

public class HQ extends HF {
   private float btM;

   public HQ(float var1) {
      this.btM = var1;
   }

   public int hashCode() {
      return super.hashCode() ^ Float.floatToIntBits(this.btM);
   }

   public double IE() {
      return (double)this.btM;
   }

   public short IB() {
      return (short)(Pq.bg(this.btM) & '\uffff');
   }

   public int bk() {
      return Pq.bg(this.btM);
   }

   public boolean equals(Object var1) {
      if (super.equals(var1)) {
         HQ var2 = (HQ)var1;
         return this.btM == var2.btM;
      } else {
         return false;
      }
   }

   public long IC() {
      return (long)this.btM;
   }

   public float br() {
      return this.btM;
   }

   public byte ID() {
      return (byte)(Pq.bg(this.btM) & 255);
   }

   void q(DataOutput var1) {
      var1.writeFloat(this.btM);
   }

   public HE IA() {
      return new HQ(this.btM);
   }

   HQ() {
   }

   void w(DataInput var1, int var2, HH var3) {
      var3.d(96L);
      this.btM = var1.readFloat();
   }

   public String toString() {
      return this.btM + q.q[2803 & -28556];
   }

   public byte Iz() {
      return 5;
   }
}
