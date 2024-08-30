import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class gv extends cv {
   public static final hu vT = hu.x(r.q[-21601 & 702]);

   protected gv() {
      super(hn.zn);
      this.q(this.nr.ez().q(vT, Boolean.valueOf(false)));
      this.q(yl.aLz);
   }

   public String cP() {
      return PO.dn(this.cM() + i.q[813 & 7081]);
   }

   public int u(hI var1) {
      return ((Boolean)var1.w(vT)).booleanValue() ? 1 : 0;
   }

   private boolean T(QI var1, NW var2) {
      LinkedList var3 = Lists.newLinkedList();
      ArrayList var4 = Lists.newArrayList();
      var3.add(new PT(var2, Integer.valueOf(0)));
      int var5 = 0;

      while(!var3.isEmpty()) {
         PT var6 = (PT)var3.poll();
         NW var7 = (NW)var6.XO();
         int var8 = ((Integer)var6.XP()).intValue();

         for(OK var12 : OK.values()) {
            NW var13 = var7.v(var12);
            if (var1.g(var13).ds().cB() == hn.zS) {
               var1.q(var13, Ea.bjN.cx(), 2);
               var4.add(var13);
               ++var5;
               if (var8 < 6) {
                  var3.add(new PT(var13, var8 + 1));
               }
            }
         }

         if (var5 > 64) {
            break;
         }
      }

      for(NW var15 : var4) {
         var1.e(var15, Ea.bjN);
      }

      return var5 > 0;
   }

   public int e(hI var1) {
      return ((Boolean)var1.w(vT)).booleanValue() ? 1 : 0;
   }

   public void q(QI var1, NW var2, hI var3, Random var4) {
      if (((Boolean)var3.w(vT)).booleanValue()) {
         OK var5 = OK.u(var4);
         if (var5 != OK.bQC && !QI.c(var1, var2.v(var5))) {
            double var6 = (double)var2.aY();
            double var8 = (double)var2.aX();
            double var10 = (double)var2.KO();
            if (var5 == OK.bQB) {
               var8 = var8 - 0.05D;
               var6 += var4.nextDouble();
               var10 += var4.nextDouble();
            } else {
               var8 = var8 + var4.nextDouble() * 0.8D;
               if (var5.WT() == OM.bQV) {
                  var10 += var4.nextDouble();
                  if (var5 == OK.bQG) {
                     ++var6;
                  } else {
                     var6 += 0.05D;
                  }
               } else {
                  var6 += var4.nextDouble();
                  if (var5 == OK.bQE) {
                     ++var10;
                  } else {
                     var10 += 0.05D;
                  }
               }
            }

            var1.q(OP.bRC, var6, var8, var10, 0.0D, 0.0D, 0.0D);
         }
      }

   }

   protected hA cY() {
      return new hA(this, new ht[]{vT});
   }

   public void q(QI var1, NW var2, hI var3, cv var4) {
      this.H(var1, var2, var3);
      super.q(var1, var2, var3, var4);
   }

   public void w(QI var1, NW var2, hI var3) {
      this.H(var1, var2, var3);
   }

   public void q(Fm var1, yl var2, List var3) {
      var3.add(new GX(var1, 1, 0));
      var3.add(new GX(var1, 1, 1));
   }

   public hI J(int var1) {
      return this.cx().q(vT, Boolean.valueOf((var1 & 1) == 1));
   }

   protected void H(QI var1, NW var2, hI var3) {
      if (!((Boolean)var3.w(vT)).booleanValue() && this.T(var1, var2)) {
         var1.q(var2, var3.q(vT, Boolean.valueOf(true)), 2);
         var1.e(2001, var2, cv.w(Ea.bgT));
      }

   }
}
