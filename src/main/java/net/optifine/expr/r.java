package net.optifine.expr;

import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class r {
   private final net.optifine.expr.k cwR;

   private net.optifine.expr.d[] q(Deque var1) {
      ArrayList var2 = new ArrayList();

      while(true) {
         Deque var3 = q(var1, net.optifine.expr.n.cyx, false);
         net.optifine.expr.d var4 = this.w(var3);
         if (var4 == null) {
            net.optifine.expr.d[] var5 = (net.optifine.expr.d[])var2.toArray(new net.optifine.expr.d[var2.size()]);
            return var5;
         }

         var2.add(var4);
      }
   }

   private net.optifine.expr.a q(net.optifine.expr.v var1, Deque var2) {
      net.optifine.expr.v var3 = (net.optifine.expr.v)var2.peek();
      if (var3 != null && var3.agq() == net.optifine.expr.n.cyy) {
         net.optifine.expr.a var5 = net.optifine.expr.a.eX(var3.aZ());
         q(var5, .e.q[17047 & 5111] + var3);
         return var5;
      } else {
         net.optifine.expr.a var4 = net.optifine.expr.a.eX(var1.aZ());
         if (var4 == null) {
            return null;
         } else if (var4.q(new net.optifine.expr.d[0]) > 0) {
            throw new net.optifine.expr.c(.e.q[-6468 & 6872] + var4);
         } else {
            return var4;
         }
      }
   }

   private static net.optifine.expr.d q(net.optifine.expr.v var0) {
      float var1 = .MV.w(var0.aZ(), Float.NaN);
      if (var1 == Float.NaN) {
         throw new net.optifine.expr.c(.e.q[-30026 & 22166] + var0);
      } else {
         return new net.optifine.expr.q(var1);
      }
   }

   private static Deque q(Deque var0, net.optifine.expr.n var1, boolean var2) {
      ArrayDeque var3 = new ArrayDeque();
      int var4 = 0;
      Iterator var5 = var0.iterator();

      while(var5.hasNext()) {
         net.optifine.expr.v var6 = (net.optifine.expr.v)var5.next();
         var5.remove();
         if (var4 == 0 && var6.agq() == var1) {
            return var3;
         }

         var3.add(var6);
         if (var6.agq() == net.optifine.expr.n.cyy) {
            ++var4;
         }

         if (var6.agq() == net.optifine.expr.n.cyz) {
            --var4;
         }
      }

      if (var2) {
         throw new net.optifine.expr.c(.e.q[681 & 21152] + var1);
      } else {
         return var3;
      }
   }

   public net.optifine.expr.f eU(String var1) {
      net.optifine.expr.d var2 = this.eW(var1);
      if (!(var2 instanceof net.optifine.expr.f)) {
         throw new net.optifine.expr.c(.e.q[1677 & -31827] + var2.agh());
      } else {
         return (net.optifine.expr.f)var2;
      }
   }

   private static void q(Object var0, String var1) {
      if (var0 == null) {
         throw new net.optifine.expr.c(var1);
      }
   }

   private net.optifine.expr.d q(net.optifine.expr.a var1, Deque var2) {
      if (var1.q(new net.optifine.expr.d[0]) == 0) {
         net.optifine.expr.v var3 = (net.optifine.expr.v)var2.peek();
         if (var3 == null || var3.agq() != net.optifine.expr.n.cyy) {
            return q(var1, new net.optifine.expr.d[0]);
         }
      }

      net.optifine.expr.v var6 = (net.optifine.expr.v)var2.poll();
      Deque var4 = q(var2, net.optifine.expr.n.cyz, true);
      net.optifine.expr.d[] var5 = this.q(var4);
      return q(var1, var5);
   }

   private void q(List var1, List var2, int var3) {
      for(int var4 = 0; var4 < var2.size(); ++var4) {
         net.optifine.expr.a var5 = (net.optifine.expr.a)var2.get(var4);
         if (var5.agk() == var3) {
            var2.remove(var4);
            net.optifine.expr.d var6 = (net.optifine.expr.d)var1.remove(var4);
            net.optifine.expr.d var7 = (net.optifine.expr.d)var1.remove(var4);
            net.optifine.expr.d var8 = q(var5, new net.optifine.expr.d[]{var6, var7});
            var1.add(var4, var8);
            --var4;
         }
      }

   }

   private net.optifine.expr.d w(Deque var1) {
      if (var1.isEmpty()) {
         return null;
      } else {
         LinkedList var2 = new LinkedList();
         LinkedList var3 = new LinkedList();
         net.optifine.expr.d var4 = this.e(var1);
         q(var4, .e.q[1678 & -27682]);
         var2.add(var4);

         while(true) {
            net.optifine.expr.v var5 = (net.optifine.expr.v)var1.poll();
            if (var5 == null) {
               return this.q(var2, var3);
            }

            if (var5.agq() != net.optifine.expr.n.cyw) {
               throw new net.optifine.expr.c(.e.q[17055 & -25969] + var5);
            }

            net.optifine.expr.d var6 = this.e(var1);
            q(var6, .e.q[3982 & -19826]);
            var3.add(var5);
            var2.add(var6);
         }
      }
   }

   private net.optifine.expr.d e(Deque var1) {
      // $FF: Couldn't be decompiled
   }

   private net.optifine.expr.d q(List var1, List var2) {
      LinkedList var3 = new LinkedList();

      for(net.optifine.expr.v var5 : var2) {
         net.optifine.expr.a var6 = net.optifine.expr.a.eX(var5.aZ());
         q(var6, .e.q[-19761 & 3775] + var5);
         var3.add(var6);
      }

      return this.w(var1, var3);
   }

   private net.optifine.expr.d w(net.optifine.expr.v var1, Deque var2) {
      Deque var3 = q(var2, net.optifine.expr.n.cyz, true);
      return this.w(var3);
   }

   public net.optifine.expr.h eV(String var1) {
      net.optifine.expr.d var2 = this.eW(var1);
      if (!(var2 instanceof net.optifine.expr.h)) {
         throw new net.optifine.expr.c(.e.q[17100 & -19540] + var2.agh());
      } else {
         return (net.optifine.expr.h)var2;
      }
   }

   private static net.optifine.expr.d q(net.optifine.expr.a var0, net.optifine.expr.d[] var1) {
      net.optifine.expr.y[] var2 = var0.w(var1);
      if (var1.length != var2.length) {
         throw new net.optifine.expr.c(.e.q[-23911 & 18425] + var0.bY() + .e.q[-32102 & 9210] + var1.length + .e.q[10013 & 2508] + var2.length);
      } else {
         for(int var3 = 0; var3 < var1.length; ++var3) {
            net.optifine.expr.d var4 = var1[var3];
            net.optifine.expr.y var5 = var4.agh();
            net.optifine.expr.y var6 = var2[var3];
            if (var5 != var6) {
               throw new net.optifine.expr.c(.e.q[667 & 3007] + var0.bY() + .e.q[668 & -18787] + var3 + .q.q[8760 & 22072] + var5 + .e.q[12077 & 396] + var6);
            }
         }

         if (var0.agh() == net.optifine.expr.y.cwT) {
            return new net.optifine.expr.i(var0, var1);
         } else if (var0.agh() == net.optifine.expr.y.cwV) {
            return new net.optifine.expr.u(var0, var1);
         } else if (var0.agh() == net.optifine.expr.y.cwU) {
            return new net.optifine.expr.p(var0, var1);
         } else {
            throw new net.optifine.expr.c(.e.q[703 & 10909] + var0.agh() + .e.q[702 & -9505] + var0.bY());
         }
      }
   }

   public net.optifine.expr.d eW(String var1) {
      try {
         net.optifine.expr.v[] var2 = net.optifine.expr.b.eZ(var1);
         if (var2 == null) {
            return null;
         } else {
            ArrayDeque var3 = new ArrayDeque(Arrays.asList(var2));
            return this.w(var3);
         }
      } catch (IOException var4) {
         throw new net.optifine.expr.c(var4.getMessage(), var4);
      }
   }

   private net.optifine.expr.d w(net.optifine.expr.v var1) {
      if (this.cwR == null) {
         throw new net.optifine.expr.c(.e.q[8927 & -14433] + var1);
      } else {
         net.optifine.expr.d var2 = this.cwR.eY(var1.aZ());
         if (var2 == null) {
            throw new net.optifine.expr.c(.e.q[-27713 & 17055] + var1);
         } else {
            return var2;
         }
      }
   }

   public r(net.optifine.expr.k var1) {
      this.cwR = var1;
   }

   private net.optifine.expr.d w(List var1, List var2) {
      if (var1.size() != var2.size() + 1) {
         throw new net.optifine.expr.c(.e.q[9876 & -29807] + var1.size() + .e.q[-22639 & 2717] + var2.size());
      } else if (var1.size() == 1) {
         return (net.optifine.expr.d)var1.get(0);
      } else {
         int var3 = Integer.MAX_VALUE;
         int var4 = Integer.MIN_VALUE;

         for(net.optifine.expr.a var6 : var2) {
            var3 = Math.min(var6.agk(), var3);
            var4 = Math.max(var6.agk(), var4);
         }

         if (var4 >= var3 && var4 - var3 <= 10) {
            for(int var7 = var4; var7 >= var3; --var7) {
               this.q(var1, var2, var7);
            }

            if (var1.size() == 1 && var2.size() == 0) {
               return (net.optifine.expr.d)var1.get(0);
            } else {
               throw new net.optifine.expr.c(.e.q[9106 & -28006] + var1.size() + .e.q[989 & 4787] + var2.size());
            }
         } else {
            throw new net.optifine.expr.c(.e.q[667 & 21171] + var3 + .e.q[-13641 & 724] + var4);
         }
      }
   }
}
