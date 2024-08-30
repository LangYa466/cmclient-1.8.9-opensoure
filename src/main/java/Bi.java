import com.google.common.collect.Lists;
import java.security.InvalidParameterException;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;

public class bI {
   private bJ jQ;
   private final String jR;
   private final String jS;
   private Consumer iz;
   private final List jT;
   private final E jU;

   public bI q(float var1, float var2, float var3) {
      this.jQ = bJ.jX;
      this.jT.add(Float.valueOf(var1));
      this.jT.add(Float.valueOf(var2));
      this.jT.add(Float.valueOf(var3));
      return this;
   }

   public bI t(int var1, int var2, int var3) {
      this.jQ = bJ.jW;
      this.jT.add(Integer.valueOf(var1));
      this.jT.add(Integer.valueOf(var2));
      this.jT.add(Integer.valueOf(var3));
      return this;
   }

   public int bk() {
      return ((Integer)this.jT.get(12300 & 18449)).intValue();
   }

   public boolean af() {
      return (boolean)(this.jU.aQ && !this.jU.J() ? -32502 & 30785 : ((Boolean)this.jT.get(16732 & -31584)).booleanValue());
   }

   public bI q(Number var1) {
      this.q(4096 & -29680, var1);
      this.jU.aP.add(this);
      return this;
   }

   public int bl() {
      bP var1 = this.bo();
      return var1.bz() && var1.by() != 0 ? var1.bx() : var1.bl();
   }

   public bI u(String var1) {
      this.q(17428 & -24127, var1);
      this.jU.aP.add(this);
      return this;
   }

   public Object bm() {
      return this.jT.get(-18332 & 17411);
   }

   public bI q(bR var1) {
      this.jQ = bJ.jZ;
      this.q(21249 & 8202, var1);
      this.jU.aP.add(this);
      return this;
   }

   public bI q(String... var1) {
      if (var1.length == 0) {
         throw new InvalidParameterException(i.q[17407 & 25599 & 14327 & -26635]);
      } else {
         this.jQ = bJ.ka;
         Collections.addAll(this.jT, var1);
         return this;
      }
   }

   public List bn() {
      return this.jT;
   }

   public bI o(boolean var1) {
      this.jQ = bJ.jY;
      this.q(-32608 & 3084, Boolean.valueOf(var1));
      this.jU.aP.add(this);
      return this;
   }

   public bP bo() {
      return (bP)this.jT.get(20995 & -31544);
   }

   public String bp() {
      return this.jR;
   }

   public String R() {
      return this.jS;
   }

   public bJ bq() {
      return this.jQ;
   }

   public bI(E var1, String var2, String var3) {
      this.jT = Lists.newArrayList();
      this.jU = var1;
      this.jR = var2;
      this.jS = var3;
   }

   public float br() {
      return ((Float)this.jT.get(2304 & 12832)).floatValue();
   }

   public float v(int var1) {
      return Float.parseFloat(String.valueOf(this.jT.get(var1 + (1057 & -25891))));
   }

   public bI o(int var1, int var2) {
      this.jQ = bJ.jV;
      this.q(4401 & 24644, new bP(var1, (boolean)(var2 != 0 ? 25617 & 2507 : 13345 & -13814), var2));
      return this;
   }

   public bI q(Object var1) {
      this.q(28866 & -32204, var1);
      if (this.iz != null) {
         this.iz.accept(this);
      }

      return this;
   }

   public bI(E var1, String var2) {
      this(var1, var2, var2.replace(q.q[11134 & -21041 & 17754 & 842], q.q[-25022 & -31398 & -19931 & 15417]).toUpperCase());
      this.jU.aP.add(this);
   }

   private void q(int var1, Object var2) {
      if (!this.jT.isEmpty()) {
         this.jT.remove(var1);
      }

      this.jT.add(var1, var2);
   }

   public bI q(Consumer var1) {
      this.iz = var1;
      return this;
   }

   public boolean bs() {
      return (boolean)(!this.jT.isEmpty() ? 10709 & 35 : 26640 & -32531);
   }
}
