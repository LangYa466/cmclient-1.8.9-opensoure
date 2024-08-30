import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Su {
   private final Map chv = Maps.newHashMap();
   private final List chw = Lists.newArrayList();
   private int chx;

   private static Sv q(int var0, String var1, int var2) {
      String[] var3 = var0 >= 3 ? var1.split(o.q[9371 & -26405], 2) : var1.split(q.q[-31145 & 16851], 2);
      int var4 = 1;
      int var5 = 0;
      if (var3.length == 2) {
         try {
            var4 = Integer.parseInt(var3[0]);
            if (var2 + var4 >= 256) {
               var4 = 256 - var2;
            }

            if (var4 < 0) {
               var4 = 0;
            }
         } catch (Throwable var8) {
            return null;
         }
      }

      cv var6 = null;

      try {
         String var7 = var3[var3.length - 1];
         if (var0 < 3) {
            var3 = var7.split(w.q[-32654 & 20978], 2);
            if (var3.length > 1) {
               var5 = Integer.parseInt(var3[1]);
            }

            var6 = cv.K(Integer.parseInt(var3[0]));
         } else {
            var3 = var7.split(w.q[759 & 378], 3);
            var6 = var3.length > 1 ? cv.z(var3[0] + w.q[16755 & 1146] + var3[1]) : null;
            if (var6 != null) {
               var5 = var3.length > 2 ? Integer.parseInt(var3[2]) : 0;
            } else {
               var6 = cv.z(var3[0]);
               if (var6 != null) {
                  var5 = var3.length > 1 ? Integer.parseInt(var3[1]) : 0;
               }
            }

            if (var6 == null) {
               return null;
            }
         }

         if (var6 == Ea.bjN) {
            var5 = 0;
         }

         if (var5 < 0 || var5 > 15) {
            var5 = 0;
         }
      } catch (Throwable var9) {
         return null;
      }

      Sv var13 = new Sv(var0, var4, var6, var5);
      var13.hD(var2);
      return var13;
   }

   public void acn() {
      int var1 = 0;

      for(Sv var3 : this.chw) {
         var3.hD(var1);
         var1 += var3.acs();
      }

   }

   private static List r(int var0, String var1) {
      if (var1 != null && var1.length() >= 1) {
         ArrayList var2 = Lists.newArrayList();
         String[] var3 = var1.split(q.q[4715 & 18011]);
         int var4 = 0;

         for(String var8 : var3) {
            Sv var9 = q(var0, var8, var4);
            if (var9 == null) {
               return null;
            }

            var2.add(var9);
            var4 += var9.acs();
         }

         return var2;
      } else {
         return null;
      }
   }

   public List aco() {
      return this.chw;
   }

   public Map acp() {
      return this.chv;
   }

   public String toString() {
      StringBuilder var1 = new StringBuilder();
      var1.append(3);
      var1.append(r.q[3878 & 9069]);

      for(int var2 = 0; var2 < this.chw.size(); ++var2) {
         if (var2 > 0) {
            var1.append(q.q[6731 & 9051]);
         }

         var1.append(((Sv)this.chw.get(var2)).toString());
      }

      var1.append(r.q[5044 & 25380]);
      var1.append(this.chx);
      if (!this.chv.isEmpty()) {
         var1.append(r.q[804 & 4069]);
         int var9 = 0;

         for(Entry var4 : this.chv.entrySet()) {
            if (var9++ > 0) {
               var1.append(q.q[-15525 & 2763]);
            }

            var1.append(((String)var4.getKey()).toLowerCase());
            Map var5 = (Map)var4.getValue();
            if (!var5.isEmpty()) {
               var1.append(w.q[-13985 & 8763]);
               int var6 = 0;

               for(Entry var8 : var5.entrySet()) {
                  if (var6++ > 0) {
                     var1.append(q.q[16762 & 11082]);
                  }

                  var1.append((String)var8.getKey());
                  var1.append(q.q[-23618 & 16407]);
                  var1.append((String)var8.getValue());
               }

               var1.append(w.q[575 & 1309]);
            }
         }
      } else {
         var1.append(r.q[2852 & -30940]);
      }

      return var1.toString();
   }

   public int acq() {
      return this.chx;
   }

   public void hC(int var1) {
      this.chx = var1;
   }

   public static Su dH(String var0) {
      if (var0 == null) {
         return acr();
      } else {
         String[] var1 = var0.split(r.q[17382 & -29900], -1);
         int var2 = var1.length == 1 ? 0 : Pq.y(var1[0], 0);
         if (var2 >= 0 && var2 <= 3) {
            Su var3 = new Su();
            int var4 = var1.length == 1 ? 0 : 1;
            List var5 = r(var2, var1[var4++]);
            if (var5 != null && !var5.isEmpty()) {
               var3.aco().addAll(var5);
               var3.acn();
               int var6 = Rl.caT.car;
               if (var2 > 0 && var1.length > var4) {
                  var6 = Pq.y(var1[var4++], var6);
               }

               var3.hC(var6);
               if (var2 > 0 && var1.length > var4) {
                  String[] var7 = var1[var4++].toLowerCase().split(q.q[8811 & 2651]);

                  for(String var11 : var7) {
                     String[] var12 = var11.split(o.q[8863 & 2204], 2);
                     HashMap var13 = Maps.newHashMap();
                     if (var12[0].length() > 0) {
                        var3.acp().put(var12[0], var13);
                        if (var12.length > 1 && var12[1].endsWith(w.q[16925 & 4127]) && var12[1].length() > 1) {
                           String[] var14 = var12[1].substring(0, var12[1].length() - 1).split(q.q[-30773 & 12622]);

                           for(int var15 = 0; var15 < var14.length; ++var15) {
                              String[] var16 = var14[var15].split(q.q[286 & 9399], 2);
                              if (var16.length == 2) {
                                 var13.put(var16[0], var16[1]);
                              }
                           }
                        }
                     }
                  }
               } else {
                  var3.acp().put(w.q[12602 & 3354], Maps.newHashMap());
               }

               return var3;
            } else {
               return acr();
            }
         } else {
            return acr();
         }
      }
   }

   public static Su acr() {
      Su var0 = new Su();
      var0.hC(Rl.caT.car);
      var0.aco().add(new Sv(1, Ea.bha));
      var0.aco().add(new Sv(2, Ea.bjj));
      var0.aco().add(new Sv(1, Ea.biQ));
      var0.acn();
      var0.acp().put(w.q[20762 & -31270], Maps.newHashMap());
      return var0;
   }
}
