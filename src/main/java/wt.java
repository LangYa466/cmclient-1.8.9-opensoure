import java.util.List;

public class wT extends wd {
   public List q(wZ var1, String[] var2, NW var3) {
      return var2.length == 1 ? q(var2, new String[]{q.q[12253 & 4573], t.q[1946 & 23451], q.q[5629 & -30211], i.q[13283 & -31766], q.q[-13855 & 8677], i.q[11240 & 1000]}) : (var2.length == 2 && var2[0].equals(q.q[23549 & -23043]) ? q(var2, new String[]{i.q[-27652 & 11228], i.q[991 & 27647]}) : (var2.length >= 2 && var2.length <= 3 && var2[0].equals(t.q[4062 & 5051]) ? q(var2, 1, var3) : (var2.length == 2 && var2[0].equals(i.q[1002 & 30690]) ? q(var2, new String[]{q.q[17671 & -23754], w.q[503 & -32292]}) : null)));
   }

   public String e(wZ var1) {
      return i.q[986 & 1015];
   }

   protected RP wg() {
      return Md.Jc().bEU[0].wg();
   }

   public void q(wZ var1, String[] var2) {
      if (var2.length < 1) {
         throw new xr(i.q[978 & 9207], new Object[0]);
      } else {
         RP var3 = this.wg();
         if (var2[0].equals(q.q[-31777 & 9693])) {
            if (var2.length != 2 && var2.length != 3) {
               throw new xr(i.q[983 & 13267], new Object[0]);
            }

            double var4 = var3.abl();
            double var6 = q(var2[1], 1.0D, 6.0E7D);
            long var8 = var2.length > 2 ? q(var2[2], 0L, 9223372036854775L) * 1000L : 0L;
            if (var8 > 0L) {
               var3.q(var4, var6, var8);
               if (var4 > var6) {
                  q(var1, this, i.q[17396 & -23596], new Object[]{String.format(i.q[9173 & -10281], var6), String.format(i.q[25565 & 981], var4), Long.toString(var8 / 1000L)});
               } else {
                  q(var1, this, i.q[-24618 & 1014], new Object[]{String.format(i.q[-31779 & 11223], var6), String.format(i.q[1013 & -19489], var4), Long.toString(var8 / 1000L)});
               }
            } else {
               var3.I(var6);
               q(var1, this, i.q[9175 & 5087], new Object[]{String.format(i.q[981 & 17365], var6), String.format(i.q[-15403 & 981], var4)});
            }
         } else if (var2[0].equals(q.q[20961 & 1011])) {
            if (var2.length != 2 && var2.length != 3) {
               throw new xr(i.q[19421 & 2010], new Object[0]);
            }

            double var10 = var3.abo();
            double var18 = var10 + q(var2[1], -var10, 6.0E7D - var10);
            long var21 = var3.abp() + (var2.length > 2 ? q(var2[2], 0L, 9223372036854775L) * 1000L : 0L);
            if (var21 > 0L) {
               var3.q(var10, var18, var21);
               if (var10 > var18) {
                  q(var1, this, i.q[26612 & -27692], new Object[]{String.format(i.q[7157 & 18397], var18), String.format(i.q[-28683 & 13277], var10), Long.toString(var21 / 1000L)});
               } else {
                  q(var1, this, i.q[982 & 27614], new Object[]{String.format(i.q[5085 & 981], var18), String.format(i.q[981 & 25557], var10), Long.toString(var21 / 1000L)});
               }
            } else {
               var3.I(var18);
               q(var1, this, i.q[18391 & 9215], new Object[]{String.format(i.q[2005 & 9181], var18), String.format(i.q[25557 & -28715], var10)});
            }
         } else if (var2[0].equals(t.q[10138 & 5050])) {
            if (var2.length != 3) {
               throw new xr(i.q[-15397 & 1021], new Object[0]);
            }

            NW var11 = var1.dt();
            double var5 = w((double)var11.aY() + 0.5D, var2[1], true);
            double var7 = w((double)var11.KO() + 0.5D, var2[2], true);
            var3.p(var5, var7);
            q(var1, this, i.q[986 & 19419], new Object[]{var5, var7});
         } else if (var2[0].equals(q.q[-5635 & 511])) {
            if (var2.length < 2) {
               throw new xr(i.q[17403 & 987], new Object[0]);
            }

            if (var2[1].equals(i.q[13276 & 3038])) {
               if (var2.length != 3) {
                  throw new xr(i.q[9181 & 3037], new Object[0]);
               }

               double var12 = q(var2[2], 0.0D);
               double var19 = var3.abw();
               var3.G(var12);
               q(var1, this, i.q[9182 & 4094], new Object[]{String.format(i.q[19421 & 983], var12), String.format(i.q[5117 & 3031], var19)});
            } else if (var2[1].equals(i.q[17375 & -31777])) {
               if (var2.length != 3) {
                  throw new xr(i.q[992 & -7177], new Object[0]);
               }

               double var13 = q(var2[2], 0.0D);
               double var20 = var3.abq();
               var3.H(var13);
               q(var1, this, i.q[9209 & 21475], new Object[]{String.format(i.q[694 & 9779], var13), String.format(i.q[-32206 & 29299], var20)});
            }
         } else if (var2[0].equals(i.q[9187 & 21490])) {
            if (var2.length < 2) {
               throw new xr(i.q[17391 & 995], new Object[0]);
            }

            int var14 = u(var2[2], 0);
            if (var2[1].equals(q.q[4454 & 27398])) {
               if (var2.length != 3) {
                  throw new xr(i.q[9188 & -29721], new Object[0]);
               }

               int var16 = var3.abt();
               var3.hw(var14);
               q(var1, this, i.q[1013 & 11245], new Object[]{var14, var16});
            } else if (var2[1].equals(w.q[2004 & 16854])) {
               if (var2.length != 3) {
                  throw new xr(i.q[21486 & 2022], new Object[0]);
               }

               int var17 = var3.abn();
               var3.hv(var14);
               q(var1, this, i.q[3047 & 5095], new Object[]{var14, var17});
            }
         } else {
            if (!var2[0].equals(i.q[1017 & 5098])) {
               throw new xr(i.q[-30762 & 13306], new Object[0]);
            }

            double var15 = var3.abo();
            var1.q(wG.aKd, Pq.D(var15 + 0.5D));
            var1.q(new Op(i.q[1017 & 6121], new Object[]{String.format(i.q[13310 & 18411], var15)}));
         }

      }
   }

   public String vJ() {
      return i.q[-22573 & 21489];
   }

   public int vE() {
      return 2;
   }
}
