import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

public abstract class abd {
   protected abk cYL = null;
   protected abi cZo = null;

   public abstract abg aoc();

   public abstract ByteBuffer w(abF var1);

   public abstract void pK();

   public static String f(ByteBuffer var0) {
      ByteBuffer var1 = h(var0);
      return var1 == null ? null : ach.q(var1.array(), 4328 & 8193, var1.limit());
   }

   public abstract abN q(abL var1, abT var2);

   public int jQ(int var1) {
      if (var1 < 0) {
         throw new abn(-31765 & 13290, o.q[7133 & -27747 & -2451 & -23987]);
      } else {
         return var1;
      }
   }

   public abstract abh q(abL var1, abS var2);

   private static abN e(String[] var0, String var1) {
      if (!w.q[-15410 & -7204 & 10187 & 12237].equalsIgnoreCase(var0[2060 & -32384])) {
         String var3 = o.q[-27901 & -28077 & 11031 & 11191];
         Object[] var4 = new Object[471 & 1026];
         var4[9356 & 256] = var0[2181 & 1082];
         var4[33 & 8193] = var1;
         throw new abq(String.format(var3, var4));
      } else if (!w.q[25563 & 13275 & 17369 & 19401].equalsIgnoreCase(var0[16418 & 3787])) {
         String var10002 = o.q[-1299 & 20397 & 16910 & 3623];
         Object[] var10003 = new Object[-12014 & 8230];
         var10003[1127 & -32616] = var0[7026 & -7038];
         var10003[131 & 20757] = var1;
         throw new abq(String.format(var10002, var10003));
      } else {
         abO var2 = new abO();
         var2.hc(var0[20573 & 8961]);
         return var2;
      }
   }

   public abstract List g(ByteBuffer var1);

   private static abN r(String[] var0, String var1) {
      if (!o.q[-11611 & -10515 & 18189 & 10885].equals(var0[8249 & 17985])) {
         String var4 = o.q[-25962 & -25081 & -13450 & 17078];
         Object[] var5 = new Object[2634 & 5255];
         var5[20744 & 11282] = var0[25621 & 129];
         var5[363 & 24577] = var1;
         throw new abq(String.format(var4, var5));
      } else if (!w.q[-20529 & -24599 & 17353 & -22579].equalsIgnoreCase(var0[9248 & 21057])) {
         String var10002 = o.q[540 & -12372 & 4885 & 13117];
         Object[] var10003 = new Object[-31734 & 29058];
         var10003[2957 & 0] = var0[-30188 & 16640];
         var10003[16405 & 6497] = var1;
         throw new abq(String.format(var10002, var10003));
      } else {
         abP var2 = new abP();
         abT var3 = var2;
         var3.q(Short.parseShort(var0[4257 & -16111]));
         var3.hd(var0[134 & -22701]);
         return var2;
      }
   }

   public abk aod() {
      return this.cYL;
   }

   public static abN q(ByteBuffer var0, abk var1) {
      String var3 = f(var0);
      if (var3 == null) {
         throw new abm(var0.capacity() + (14465 & 17058));
      } else {
         String[] var4 = var3.split(q.q[-27686 & -27314 & -28289 & 1883], 16435 & 2635);
         if (var4.length != (391 & 4675)) {
            throw new abq();
         } else {
            abN var2;
            if (var1 == abk.dae) {
               var2 = r(var4, var3);
            } else {
               var2 = e(var4, var3);
            }

            for(var3 = f(var0); var3 != null && var3.length() > 0; var3 = f(var0)) {
               String[] var5 = var3.split(w.q[-30593 & -30337 & -11150 & 29179], 9243 & 518);
               if (var5.length != (4131 & -16366)) {
                  throw new abq(o.q[-11485 & 29225 & 729 & -32007]);
               }

               if (var2.he(var5[6261 & 8202])) {
                  var2.W(var5[2068 & -27648], var2.hf(var5[20480 & 2082]) + r.q[14117 & 947 & -31825 & -19485] + var5[-27931 & 26897].replaceFirst(o.q[8895 & 13182 & -26938 & -2366], q.q[17437 & -29154 & 26634 & 26962]));
               } else {
                  var2.W(var5[4322 & 8452], var5[16387 & 1321].replaceFirst(o.q[19286 & 19342 & -12549 & -23989], q.q[8213 & -30570 & 20802 & -4762]));
               }
            }

            if (var3 == null) {
               throw new abm();
            } else {
               return var2;
            }
         }
      }
   }

   public static ByteBuffer h(ByteBuffer var0) {
      ByteBuffer var1 = ByteBuffer.allocate(var0.remaining());
      int var3 = 2160 & 17840;

      while(var0.hasRemaining()) {
         int var2 = var3;
         var3 = var0.get();
         var1.put((byte)var3);
         if (var2 == (141 & -32755) && var3 == (16462 & 1162)) {
            var1.limit(var1.position() - (514 & -16310));
            var1.position(1092 & 50);
            return var1;
         }
      }

      var0.position(var0.position() - var1.position());
      return null;
   }

   protected boolean w(abQ var1) {
      return (boolean)(var1.hf(r.q[-17697 & -29698 & 21467 & 3070]).equalsIgnoreCase(r.q[-18437 & 17371 & 26363 & 763]) && var1.hf(w.q[3023 & 9199 & -27681 & 3055]).toLowerCase(Locale.ENGLISH).contains(o.q[-16729 & -10481 & -31745 & 21231]) ? -13567 & 9319 : 4480 & 513);
   }

   public List q(abQ var1, abk var2) {
      return this.r(var1);
   }

   public String toString() {
      return this.getClass().getSimpleName();
   }

   public abstract List j(String var1, boolean var2);

   public List w(abi var1, ByteBuffer var2, boolean var3) {
      if (var1 != abi.cZU && var1 != abi.cZT) {
         throw new IllegalArgumentException(o.q[-19764 & -3416 & 11113 & 19245]);
      } else {
         Object var4 = null;
         if (this.cZo != null) {
            var4 = new abC();
         } else {
            this.cZo = var1;
            if (var1 == abi.cZU) {
               var4 = new abA();
            } else if (var1 == abi.cZT) {
               var4 = new abK();
            }
         }

         ((abE)var4).x(var2);
         ((abE)var4).cH(var3);

         try {
            ((abE)var4).aoD();
         } catch (abn var6) {
            throw new IllegalArgumentException(var6);
         }

         if (var3) {
            this.cZo = null;
         } else {
            this.cZo = var1;
         }

         return Collections.singletonList(var4);
      }
   }

   public List q(abQ var1, abk var2, boolean var3) {
      return this.q(var1, var3);
   }

   public List q(abQ var1, boolean var2) {
      StringBuilder var3 = new StringBuilder(-24202 & 6381);
      if (var1 instanceof abL) {
         var3.append(o.q[-21813 & -14643 & 4927 & 4991]).append(((abL)var1).anH()).append(o.q[18303 & -30913 & 14894 & -22006]);
      } else {
         if (!(var1 instanceof abS)) {
            throw new IllegalArgumentException(o.q[2046 & 2030 & 30332 & 16910]);
         }

         var3.append(o.q[-3189 & -8661 & -25077 & 11947]).append(((abS)var1).aoM());
      }

      var3.append(q.q[5019 & -3111 & -12353 & -8259]);
      Iterator var4 = var1.aoO();

      while(var4.hasNext()) {
         String var5 = (String)var4.next();
         String var6 = var1.hf(var5);
         var3.append(var5);
         var3.append(q.q[-17716 & -18723 & 15094 & 677]);
         var3.append(var6);
         var3.append(q.q[7131 & 11163 & -31783 & -31777]);
      }

      var3.append(q.q[29593 & 5083 & 14237 & 10173]);
      byte[] var8 = ach.hj(var3.toString());
      byte[] var9 = var2 ? var1.agy() : null;
      ByteBuffer var7 = ByteBuffer.allocate((var9 == null ? 8524 & -15311 : var9.length) + var8.length);
      var7.put(var8);
      if (var9 != null) {
         var7.put(var9);
      }

      var7.flip();
      return Collections.singletonList(var7);
   }

   public void q(abk var1) {
      this.cYL = var1;
   }

   public abstract abM w(abM var1);

   public abstract abd aoe();

   public abstract List q(ByteBuffer var1, boolean var2);

   int e(abQ var1) {
      String var2 = var1.hf(r.q[21501 & -7171 & -27906 & -18466]);
      if (var2.length() > 0) {
         try {
            int var3 = Integer.parseInt(var2.trim());
            return var3;
         } catch (NumberFormatException var5) {
            return -1 & -1;
         }
      } else {
         return -1 & -1;
      }
   }

   public abstract void q(aaV var1, abF var2);

   public List r(abQ var1) {
      return this.q(var1, (boolean)(17153 & -32565));
   }

   public abstract abh q(abL var1);

   public abQ j(ByteBuffer var1) {
      return q(var1, this.cYL);
   }
}
