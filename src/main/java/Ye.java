import com.google.common.collect.Lists;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;

public class ye {
   private final xW aLl;
   private final String aLm;
   private StackTraceElement[] aLn = new StackTraceElement[0];
   private final List aLo = Lists.newArrayList();

   public void do1(int var1) {
      StackTraceElement[] var2 = new StackTraceElement[this.aLn.length - var1];
      System.arraycopy(this.aLn, 0, var2, 0, var2.length);
      this.aLn = var2;
   }

   public void q(String var1, Callable var2) {
      try {
         this.w(var1, var2.call());
      } catch (Throwable var4) {
         this.q(var1, var4);
      }

   }

   public StackTraceElement[] ww() {
      return this.aLn;
   }

   public static void q(ye var0, NW var1, cv var2, int var3) {
      int var4 = cv.w(var2);
      var0.q(i.q[726 & 622], new yf(var4, var2));
      var0.q(i.q[871 & 599], new yg(var3));
      var0.q(i.q[22125 & 8794], new yh(var1));
   }

   public boolean q(StackTraceElement var1, StackTraceElement var2) {
      if (this.aLn.length != 0 && var1 != null) {
         StackTraceElement var3 = this.aLn[0];
         if (var3.isNativeMethod() == var1.isNativeMethod() && var3.getClassName().equals(var1.getClassName()) && Objects.equals(var3.getFileName(), var1.getFileName()) && var3.getMethodName().equals(var1.getMethodName())) {
            if (var2 != null != this.aLn.length > 1) {
               return false;
            } else if (var2 != null && !this.aLn[1].equals(var2)) {
               return false;
            } else {
               this.aLn[0] = var1;
               return true;
            }
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   public static void q(ye var0, NW var1, hI var2) {
      var0.q(t.q[-31119 & 24820], new yi(var2));
      var0.q(i.q[9821 & 21064], new yj(var1));
   }

   public static String f(double var0, double var2, double var4) {
      return String.format(i.q[-32005 & 19002], var0, var2, var4, C(new NW(var0, var2, var4)));
   }

   public void w(StringBuilder var1) {
      var1.append(i.q[10832 & -15520]).append(this.aLm).append(i.q[1865 & -15807]);
      var1.append(i.q[10818 & -31158]);

      for(yk var3 : this.aLo) {
         var1.append(i.q[1603 & 4679]);
         var1.append(var3.R());
         var1.append(q.q[8868 & -29041]);
         var1.append(var3.wx());
      }

      if (this.aLn != null && this.aLn.length > 0) {
         var1.append(i.q[-28090 & 10996]);

         for(StackTraceElement var5 : this.aLn) {
            var1.append(i.q[20039 & 973]);
            var1.append(var5.toString());
         }
      }

   }

   public void w(String var1, Object var2) {
      this.aLo.add(new yk(var1, var2));
   }

   public void q(String var1, Throwable var2) {
      this.w(var1, var2);
   }

   public ye(xW var1, String var2) {
      this.aLl = var1;
      this.aLm = var2;
   }

   public static String C(NW var0) {
      int var1 = var0.aY();
      int var2 = var0.aX();
      int var3 = var0.KO();
      StringBuilder var4 = new StringBuilder();

      try {
         var4.append(String.format(i.q[16959 & 1723], var1, var2, var3));
      } catch (Throwable var17) {
         var4.append(i.q[2685 & 9150]);
      }

      var4.append(q.q[24702 & 4335]);

      try {
         int var5 = var1 >> 4;
         int var6 = var3 >> 4;
         int var7 = var1 & 15;
         int var8 = var2 >> 4;
         int var9 = var3 & 15;
         int var10 = var5 << 4;
         int var11 = var6 << 4;
         int var12 = (var5 + 1 << 4) - 1;
         int var13 = (var6 + 1 << 4) - 1;
         var4.append(String.format(i.q[-23937 & 3901], var7, var8, var9, var5, var6, var10, var11, var12, var13));
      } catch (Throwable var16) {
         var4.append(i.q[18111 & 8766]);
      }

      var4.append(q.q[-32145 & 17518]);

      try {
         int var18 = var1 >> 9;
         int var19 = var3 >> 9;
         int var20 = var18 << 5;
         int var21 = var19 << 5;
         int var22 = (var18 + 1 << 5) - 1;
         int var23 = (var19 + 1 << 5) - 1;
         int var24 = var18 << 9;
         int var25 = var19 << 9;
         int var26 = (var18 + 1 << 9) - 1;
         int var14 = (var19 + 1 << 9) - 1;
         var4.append(String.format(i.q[575 & -29057], var18, var19, var20, var21, var22, var23, var24, var25, var26, var14));
      } catch (Throwable var15) {
         var4.append(i.q[572 & 15229]);
      }

      return var4.toString();
   }

   public int dp(int var1) {
      StackTraceElement[] var2 = Thread.currentThread().getStackTrace();
      if (var2.length <= 0) {
         return 0;
      } else {
         this.aLn = new StackTraceElement[var2.length - 3 - var1];
         System.arraycopy(var2, 3 + var1, this.aLn, 0, this.aLn.length);
         return this.aLn.length;
      }
   }
}
