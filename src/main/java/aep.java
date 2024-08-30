import java.lang.reflect.Field;
import sun.misc.Unsafe;

public class aeP {
   public int VL = 144 & 1288;
   private final hS mc;
   private final aeQ valueType;
   private final String cheatType;
   private Field field;
   private final String maxValue;
   private Unsafe unsafe;
   private final String variableName;

   public void aum() {
      (this.mc.Bn.dmw.dAv = new aio(this.mc)).start();
      this.mc.r(new agF(this.mc.fD().XD(), y.q[-14533 & 17275 & -23651 & 3001] + this.cheatType + w.q[25375 & -6979 & -27907 & -16067]));
   }

   public void q(Class var1, Object var2) {
      if (this.unsafe == null) {
         Class var3 = Unsafe.class;
         Field var4 = var3.getDeclaredField(y.q[24442 & 16315 & -5285 & -27810]);
         var4.setAccessible((boolean)(2067 & 933));
         this.unsafe = (Unsafe)var4.get((Object)null);
         this.field = var1.getDeclaredField(this.variableName);
      }

      long var7 = this.unsafe.objectFieldOffset(this.field);
      long var5 = this.unsafe.getLong(var2, var7);
      if (!String.valueOf(var5).equals(this.maxValue)) {
         if (this.VL <= (1284 & -16330)) {
            this.VL += 1539 & -32747;
         } else {
            this.aum();
            this.VL = 25600 & -28248;
         }
      }

   }

   public aeP(hS var1, String var2, aeQ var3, String var4, String var5) {
      this.mc = var1;
      this.variableName = var2;
      this.valueType = var3;
      this.maxValue = var4;
      this.cheatType = var5;
   }

   public void w(Class var1, Object var2) {
      if (this.unsafe == null) {
         Class var3 = Unsafe.class;
         Field var4 = var3.getDeclaredField(y.q[-18470 & -17446 & 18334 & -8418]);
         var4.setAccessible((boolean)(-24739 & 16387));
         this.unsafe = (Unsafe)var4.get((Object)null);
         this.field = var1.getDeclaredField(this.variableName);
      }

      long var7 = this.unsafe.objectFieldOffset(this.field);
      double var5 = this.unsafe.getDouble(var2, var7);
      if (!String.valueOf(var5).equals(this.maxValue)) {
         if (this.VL <= (-32108 & 292)) {
            this.VL += 3173 & 24585;
         } else {
            this.aum();
            this.VL = 528 & 3072;
         }
      }

   }

   public aeQ aun() {
      return this.valueType;
   }

   public void e(Class var1, Object var2) {
      if (this.unsafe == null) {
         Class var3 = Unsafe.class;
         Field var4 = var3.getDeclaredField(y.q[11163 & 11167 & -15586 & -5218]);
         var4.setAccessible((boolean)(8201 & -30637));
         this.unsafe = (Unsafe)var4.get((Object)null);
         this.field = var1.getDeclaredField(this.variableName);
      }

      long var6 = this.unsafe.objectFieldOffset(this.field);
      float var5 = this.unsafe.getFloat(var2, var6);
      if (!String.valueOf(var5).equals(this.maxValue)) {
         if (this.VL <= (30212 & 29)) {
            this.VL += 17793 & 10261;
         } else {
            this.aum();
            this.VL = -23920 & 1026;
         }
      }

   }
}
