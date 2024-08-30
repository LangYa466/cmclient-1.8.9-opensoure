import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import java.util.Iterator;
import java.util.Map;

public class PF extends PH implements Pa {
   protected final PD bTQ = new PD();
   protected final Map bTR;

   public Object z(Object var1) {
      return this.bTR.get(var1);
   }

   public PF() {
      this.bTR = ((BiMap)this.bTV).inverse();
   }

   public Object k(Object var1) {
      return super.k(var1);
   }

   public int x(Object var1) {
      return this.bTQ.l(var1);
   }

   public Iterator iterator() {
      return this.bTQ.iterator();
   }

   public Object gZ(int var1) {
      return this.bTQ.gY(var1);
   }

   public boolean containsKey(Object var1) {
      return super.containsKey(var1);
   }

   public void q(int var1, Object var2, Object var3) {
      this.bTQ.q(var3, var1);
      this.r(var2, var3);
   }

   protected Map hi() {
      return HashBiMap.create();
   }
}
