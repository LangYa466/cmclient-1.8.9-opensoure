import java.util.Collections;
import java.util.Iterator;
import java.util.TreeMap;

public class abR implements abN {
   private TreeMap dbo = new TreeMap(String.CASE_INSENSITIVE_ORDER);
   private byte[] czu;

   public byte[] agy() {
      return this.czu;
   }

   public void W(String var1, String var2) {
      this.dbo.put(var1, var2);
   }

   public boolean he(String var1) {
      return this.dbo.containsKey(var1);
   }

   public Iterator aoO() {
      return Collections.unmodifiableSet(this.dbo.keySet()).iterator();
   }

   public String hf(String var1) {
      String var2 = (String)this.dbo.get(var1);
      return var2 == null ? q.q[-7539 & 520 & 10404 & 19060] : var2;
   }

   public void u(byte[] var1) {
      this.czu = var1;
   }
}
