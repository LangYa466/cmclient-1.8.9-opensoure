import java.io.DataInput;
import java.io.DataOutput;
import java.util.Arrays;

public class HK extends HE {
   private byte[] btF;

   public HK(byte[] var1) {
      this.btF = var1;
   }

   public byte Iz() {
      return 7;
   }

   void q(DataOutput var1) {
      var1.writeInt(this.btF.length);
      var1.write(this.btF);
   }

   public String toString() {
      return w.q[945 & 16821] + this.btF.length + y.q[27640 & 2040];
   }

   public byte[] IF() {
      return this.btF;
   }

   HK() {
   }

   public int hashCode() {
      return super.hashCode() ^ Arrays.hashCode(this.btF);
   }

   public HE IA() {
      byte[] var1 = new byte[this.btF.length];
      System.arraycopy(this.btF, 0, var1, 0, this.btF.length);
      return new HK(var1);
   }

   void w(DataInput var1, int var2, HH var3) {
      var3.d(192L);
      int var4 = var1.readInt();
      var3.d(8L * (long)var4);
      this.btF = new byte[var4];
      var1.readFully(this.btF);
   }

   public boolean equals(Object var1) {
      return super.equals(var1) && Arrays.equals(this.btF, ((HK)var1).btF);
   }
}
