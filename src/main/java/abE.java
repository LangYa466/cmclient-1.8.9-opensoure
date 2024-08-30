import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class abe extends abd {
   private List cZp;
   private aby cZq;
   private aby cZr;
   private List cZs;
   private static final String cZt = "Sec-WebSocket-Accept";
   // $FF: synthetic field
   static final boolean cZu = (boolean)(!abe.class.desiredAssertionStatus() ? 16977 & -32735 : 12289 & 19748);
   private abV cZv;
   private abF cZw;
   private static final String cZx = "Sec-WebSocket-Extensions";
   private static final String cZy = "Sec-WebSocket-Protocol";
   private int cZz;
   private ByteBuffer cZA;
   private final SecureRandom cZB;
   private final List cZC;
   private static final String cZD = "Upgrade";
   private aby cZE;
   private final Logger cZF;
   private static final String cZG = "Connection";
   private static final String cZH = "Sec-WebSocket-Key";

   private void q(aaV var1, abF var2, abi var3) {
      if (var3 != abi.cZS) {
         this.r(var2);
      } else if (var2.aoI()) {
         this.e(var1, var2);
      } else if (this.cZw == null) {
         this.cZF.error(r.q[20473 & 3064 & 29693 & 11000]);
         throw new abn(-29717 & 21498, r.q[-3331 & -9479 & 8957 & 13049]);
      }

      if (var3 == abi.cZT && !ach.n(var2.aoF())) {
         this.cZF.error(r.q[-8194 & -27650 & -15622 & 25594]);
         throw new abn(21487 & -30721);
      } else {
         if (var3 == abi.cZS && this.cZw != null) {
            this.k(var2.aoF());
         }

      }
   }

   private long aof() {
      long var1 = -5810409494462574526L & 550961284L;
      synchronized(this.cZC) {
         for(ByteBuffer var5 : this.cZC) {
            var1 += (long)var5.limit();
         }

         return var1;
      }
   }

   private byte[] r(long var1, int var3) {
      byte[] var4 = new byte[var3];
      int var5 = (14984 & -32756) * var3 - (56 & 5514);

      for(int var6 = 2065 & 5766; var6 < var3; ++var6) {
         var4[var6] = (byte)((int)(var1 >>> var5 - (7692 & 8456) * var6));
      }

      return var4;
   }

   private void k(ByteBuffer var1) {
      synchronized(this.cZC) {
         this.cZC.add(var1);
      }
   }

   private ByteBuffer e(abF var1) {
      ByteBuffer var2 = var1.aoF();
      int var3 = this.cYL == abk.dae ? 1027 & -32239 : 17161 & -32634;
      int var4 = this.z(var2);
      ByteBuffer var5 = ByteBuffer.allocate((5421 & -30655) + (var4 > (9865 & -32767) ? var4 + (8453 & 6689) : var4) + (var3 != 0 ? 1332 & 8836 : 11266 & -28640) + var2.remaining());
      byte var6 = this.q(var1.aoG());
      byte var7 = (byte)(var1.aoI() ? -123 & -126 : -29487 & 4360);
      var7 = (byte)(var7 | var6);
      if (var1.aoJ()) {
         var7 |= this.jR(2359 & -32567);
      }

      if (var1.aoK()) {
         var7 |= this.jR(20994 & 8227);
      }

      if (var1.aoL()) {
         var7 |= this.jR(17123 & 259);
      }

      var5.put(var7);
      byte[] var8 = this.r((long)var2.remaining(), var4);
      if (!cZu && var8.length != var4) {
         throw new AssertionError();
      } else {
         if (var4 == (521 & 25681)) {
            var5.put((byte)(var8[-16341 & 8320] | this.cA((boolean)var3)));
         } else if (var4 == (10258 & -15866)) {
            var5.put((byte)(1150 & 12415 | this.cA((boolean)var3)));
            var5.put(var8);
         } else {
            if (var4 != (-32680 & 782)) {
               throw new IllegalStateException(r.q[24295 & 740 & -10252 & -14604]);
            }

            var5.put((byte)(639 & 6527 | this.cA((boolean)var3)));
            var5.put(var8);
         }

         if (var3 != 0) {
            ByteBuffer var9 = ByteBuffer.allocate(7468 & -32762);
            var9.putInt(this.cZB.nextInt());
            var5.put(var9.array());

            for(int var10 = 6353 & -24572; var2.hasRemaining(); ++var10) {
               var5.put((byte)(var2.get() ^ var9.get(var10 % (4364 & 11782))));
            }
         } else {
            var5.put(var2);
            var2.flip();
         }

         if (!cZu && var5.remaining() != 0) {
            throw new AssertionError(var5.remaining());
         } else {
            var5.flip();
            return var5;
         }
      }
   }

   private void r(abF var1) {
      if (this.cZw != null) {
         this.cZF.trace(r.q[22526 & -10242 & 766 & -11268]);
         throw new abn(2046 & -15382, r.q[3071 & 1789 & 26367 & 4095]);
      } else {
         this.cZw = var1;
         this.k(var1.aoF());
         this.aoj();
      }
   }

   private abF l(ByteBuffer var1) {
      if (var1 == null) {
         throw new IllegalArgumentException();
      } else {
         int var2 = var1.remaining();
         int var3 = 4175 & 17922;
         this.bY(var2, var3);
         byte var4 = var1.get();
         int var5 = var4 >> (-11256 & 10696) != 0 ? 4163 & 11669 : -32498 & 16400;
         int var6 = (var4 & 2624 & 25665) != 0 ? 5123 & 181 : 10304 & 16915;
         int var7 = (var4 & 552 & 28851) != 0 ? -28079 & 19497 : 19596 & 8992;
         int var8 = (var4 & -16100 & 1682) != 0 ? 4137 & 24833 : -32188 & 10658;
         byte var9 = var1.get();
         int var10 = (var9 & -55 & -94) != 0 ? 4353 & 721 : 1120 & 28675;
         int var11 = (byte)(var9 & 2303 & 383);
         abi var12 = this.r((byte)(var4 & 287 & 9231));
         if (var11 < 0 || var11 > (-22019 & 1151)) {
            abf var13 = this.q(var1, var12, var11, var2, var3);
            var11 = abf.q(var13);
            var3 = abf.w(var13);
         }

         this.M((long)var11);
         var3 = var3 + (var10 != 0 ? 11172 & 20486 : 640 & 29800);
         var3 = var3 + var11;
         this.bY(var2, var3);
         ByteBuffer var18 = ByteBuffer.allocate(this.jQ(var11));
         if (var10 != 0) {
            byte[] var14 = new byte[12876 & 2054];
            var1.get(var14);

            for(int var15 = 5 & -9838; var15 < var11; ++var15) {
               var18.put((byte)(var1.get() ^ var14[var15 % (24772 & -27628)]));
            }
         } else {
            var18.put(var1.array(), var1.position(), var18.limit());
            var1.position(var1.position() + var18.limit());
         }

         abG var19 = abG.w(var12);
         var19.cH((boolean)var5);
         var19.cG((boolean)var6);
         var19.cF((boolean)var7);
         var19.cD((boolean)var8);
         var18.flip();
         var19.x(var18);
         if (var19.aoG() != abi.cZS) {
            if (!var19.aoJ() && !var19.aoK() && !var19.aoL()) {
               this.cZq = this.cZE;
            } else {
               this.cZq = this.aon();
            }
         }

         if (this.cZq == null) {
            this.cZq = this.cZE;
         }

         this.cZq.t(var19);
         this.cZq.u(var19);
         if (this.cZF.isTraceEnabled()) {
            Logger var10000 = this.cZF;
            String var10001 = r.q[1015 & 12021 & -9235 & -15377];
            Object[] var10002 = new Object[2 & 547];
            var10002[4256 & -15352] = var19.aoF().remaining();
            var10002[16419 & 9481] = var19.aoF().remaining() > (1002 & 29672) ? r.q[19435 & 19175 & -31001 & -26653] : new String(var19.aoF().array());
            var10000.trace(var10001, var10002);
         }

         var19.aoD();
         return var19;
      }
   }

   private byte q(abi var1) {
      if (var1 == abi.cZS) {
         return (byte)(0 & 6273);
      } else if (var1 == abi.cZT) {
         return (byte)(1163 & 26657);
      } else if (var1 == abi.cZU) {
         return (byte)(6210 & 25222);
      } else if (var1 == abi.cZX) {
         return (byte)(10 & 12297);
      } else if (var1 == abi.cZV) {
         return (byte)(17417 & 8777);
      } else if (var1 == abi.cZW) {
         return (byte)(1258 & -8182);
      } else {
         throw new IllegalArgumentException(r.q[23539 & 5875 & -29701 & 18431] + var1.toString());
      }
   }

   public int hashCode() {
      int var1 = this.cZr != null ? this.cZr.hashCode() : -31998 & 19489;
      var1 = (-29921 & 8383) * var1 + (this.cZv != null ? this.cZv.hashCode() : 17 & 7424);
      var1 = (-32673 & 7199) * var1 + (this.cZz ^ this.cZz >>> (-10970 & 8416));
      return var1;
   }

   public List aog() {
      return this.cZs;
   }

   public abe(aby var1) {
      this(Collections.singletonList(var1));
   }

   private String aoh() {
      Calendar var1 = Calendar.getInstance();
      SimpleDateFormat var2 = new SimpleDateFormat(r.q[-16385 & -27649 & 1775 & 18175], Locale.US);
      var2.setTimeZone(TimeZone.getTimeZone(r.q[9976 & -31747 & 20466 & 20470]));
      return var2.format(var1.getTime());
   }

   private void aoi() {
      synchronized(this.cZC) {
         this.cZC.clear();
      }
   }

   public abe(List var1, List var2, int var3) {
      this.cZF = LogManager.getLogger(abe.class);
      this.cZr = new abw();
      this.cZE = new abw();
      this.cZB = new SecureRandom();
      if (var1 != null && var2 != null && var3 >= (23047 & 1417)) {
         this.cZp = new ArrayList(var1.size());
         this.cZs = new ArrayList(var2.size());
         int var4 = 11299 & 4620;
         this.cZC = new ArrayList();

         for(aby var6 : var1) {
            if (var6.getClass().equals(abw.class)) {
               var4 = 4417 & 16537;
            }
         }

         this.cZp.addAll(var1);
         if (var4 == 0) {
            this.cZp.add(this.cZp.size(), this.cZr);
         }

         this.cZs.addAll(var2);
         this.cZz = var3;
         this.cZq = null;
      } else {
         throw new IllegalArgumentException();
      }
   }

   public abN q(abL var1, abT var2) {
      var2.W(r.q[15355 & -13317 & -32001 & -28706], r.q[3803 & -31013 & 23551 & -28673]);
      var2.W(w.q[-13361 & 16383 & -14369 & -8193], var1.hf(w.q[-21553 & -21521 & -22561 & 5071]));
      String var3 = var1.hf(r.q[-9257 & -17450 & 25308 & -15620]);
      if (var3 != null && !q.q[-5837 & -24203 & 3200 & -30071].equals(var3)) {
         var2.W(r.q[12255 & 8181 & -25891 & 8925], this.gW(var3));
         if (this.aon().aou().length() != 0) {
            var2.W(r.q[30415 & 26591 & 2782 & -13586], this.aon().aou());
         }

         if (this.anG() != null && this.anG().aoP().length() != 0) {
            var2.W(r.q[-25869 & 9936 & -19493 & -3078], this.anG().aoP());
         }

         var2.hd(r.q[-27937 & 6911 & 991 & 18143]);
         var2.W(w.q[2999 & 17079 & -6401 & 28343], r.q[13038 & 13040 & 27645 & 7162]);
         var2.W(r.q[11257 & 21495 & -8211 & 32493], this.aoh());
         return var2;
      } else {
         throw new abq(r.q[26591 & 18398 & 13054 & -25602]);
      }
   }

   private String gW(String var1) {
      String var2 = var1.trim();
      String var3 = var2 + r.q[-2319 & 31473 & 1013 & 3061];

      MessageDigest var4;
      try {
         var4 = MessageDigest.getInstance(r.q[17146 & -6406 & -25605 & -25866]);
      } catch (NoSuchAlgorithmException var6) {
         throw new IllegalStateException(var6);
      }

      return ace.o(var4.digest(var3.getBytes()));
   }

   private void aoj() {
      long var1 = this.aof();
      if (var1 > (long)this.cZz) {
         this.aoi();
         Logger var10000 = this.cZF;
         String var10001 = r.q[762 & 8191 & -15381 & 1007];
         Object[] var10002 = new Object[16450 & 1946];
         var10002[9905 & -30464] = this.cZz;
         var10002[7169 & 789] = var1;
         var10000.trace(var10001, var10002);
         throw new abr(this.cZz);
      }
   }

   public void q(aaV var1, abF var2) {
      abi var3 = var2.aoG();
      if (var3 == abi.cZX) {
         this.t(var1, var2);
      } else if (var3 == abi.cZV) {
         var1.anN().w(var1, var2);
      } else if (var3 == abi.cZW) {
         var1.anI();
         var1.anN().q(var1, var2);
      } else if (var2.aoI() && var3 != abi.cZS) {
         if (this.cZw != null) {
            this.cZF.error(r.q[-30987 & 757 & -1025 & 29429]);
            throw new abn(17402 & -30741, r.q[7927 & 5879 & -21506 & -23554]);
         }

         if (var3 == abi.cZT) {
            this.w(var1, var2);
         } else {
            if (var3 != abi.cZU) {
               this.cZF.error(r.q[2039 & 20471 & 2807 & -14601]);
               throw new abn(25579 & 3066, r.q[-9 & 30463 & 7159 & 3071]);
            }

            this.r(var1, var2);
         }
      } else {
         this.q(var1, var2, var3);
      }

   }

   private void q(aaV var1, RuntimeException var2) {
      this.cZF.error(r.q[21499 & -15361 & 16383 & 12031], var2);
      var1.anN().q(var1, var2);
   }

   public abe(List var1, int var2) {
      this(var1, Collections.singletonList(new abW(q.q[20370 & 20219 & -28387 & 28685])), var2);
   }

   public List aok() {
      return this.cZp;
   }

   public abh q(abL var1) {
      int var2 = this.e(var1);
      if (var2 != (77 & 527)) {
         this.cZF.trace(r.q[-26915 & 4077 & 5839 & 23245]);
         return abh.cZQ;
      } else {
         abh var3 = abh.cZQ;
         String var4 = var1.hf(r.q[14335 & -1 & -11570 & 19166]);

         for(aby var6 : this.cZp) {
            if (var6.gZ(var4)) {
               this.cZr = var6;
               var3 = abh.cZP;
               Logger var10000 = this.cZF;
               String var10001 = r.q[20175 & -28705 & -22561 & 29695];
               Object[] var10002 = new Object[8449 & 20681];
               var10002[16385 & 1216] = this.cZr;
               var10000.trace(var10001, var10002);
               break;
            }
         }

         abh var7 = this.gX(var1.hf(r.q[22234 & 32496 & -18689 & 759]));
         if (var7 == abh.cZP && var3 == abh.cZP) {
            return abh.cZP;
         } else {
            this.cZF.trace(r.q[1749 & -18731 & 4095 & 9203]);
            return abh.cZQ;
         }
      }
   }

   private int z(ByteBuffer var1) {
      if (var1.remaining() <= (-31363 & 637)) {
         return 281 & -12287;
      } else {
         return var1.remaining() <= (184942591 & 544276479) ? -32622 & 19782 : -31735 & 664;
      }
   }

   private void M(long var1) {
      if (var1 > (-8026769003303141377L & 2147483647L)) {
         this.cZF.trace(r.q[27627 & -10245 & -19732 & 15080]);
         throw new abr(r.q[11003 & -17409 & -27667 & -29715]);
      } else if (var1 > (long)this.cZz) {
         Logger var10000 = this.cZF;
         String var10001 = r.q[19178 & 23278 & -27905 & -30997];
         Object[] var10002 = new Object[17439 & -30110];
         var10002[8208 & -32759] = this.cZz;
         var10002[3649 & 12309] = var1;
         var10000.trace(var10001, var10002);
         throw new abr(r.q[5119 & 9195 & 14335 & -15633], this.cZz);
      } else if (var1 < (-951059654442186952L & 1379614851L)) {
         this.cZF.trace(r.q[5868 & -22804 & 9966 & -3091]);
         throw new abr(r.q[-28689 & 4093 & -23811 & -21505]);
      }
   }

   public int aol() {
      return this.cZz;
   }

   public abe(List var1) {
      this(var1, Collections.singletonList(new abW(q.q[-14063 & -3627 & 30893 & 6548])));
   }

   public String toString() {
      String var1 = super.toString();
      if (this.aon() != null) {
         var1 = var1 + r.q[-22530 & -14594 & 24318 & -11266] + this.aon().toString();
      }

      if (this.anG() != null) {
         var1 = var1 + r.q[-7425 & -32001 & -11521 & 4863] + this.anG().toString();
      }

      var1 = var1 + r.q[1910 & -15586 & -1116 & -2198] + this.cZz;
      return var1;
   }

   private abf q(ByteBuffer var1, abi var2, int var3, int var4, int var5) {
      if (var2 != abi.cZV && var2 != abi.cZW && var2 != abi.cZX) {
         int var6;
         int var7;
         if (var3 == (5374 & 18559)) {
            var7 = var5 + 2;
            this.bY(var4, var7);
            byte[] var8 = new byte[135 & 20547];
            var8[11 & 4129] = var1.get();
            var8[5270 & -32510] = var1.get();
            var6 = (new BigInteger(var8)).intValue();
         } else {
            var7 = var5 + 8;
            this.bY(var4, var7);
            byte[] var11 = new byte[-24308 & 2056];

            for(int var9 = 0 & 286; var9 < (1096 & 8844); ++var9) {
               var11[var9] = var1.get();
            }

            long var12 = (new BigInteger(var11)).longValue();
            this.M(var12);
            var6 = (int)var12;
         }

         return new abf(this, var6, var7);
      } else {
         this.cZF.trace(r.q[2798 & -28938 & -27665 & -23553]);
         throw new abp(r.q[-14609 & -2073 & 6887 & 13031]);
      }
   }

   private void w(aaV var1, abF var2) {
      try {
         var1.anN().q(var1, ach.b(var2.aoF()));
      } catch (RuntimeException var4) {
         this.q(var1, var4);
      }

   }

   public List q(ByteBuffer var1, boolean var2) {
      abA var3 = new abA();
      var3.x(var1);
      var3.cE(var2);

      try {
         var3.aoD();
      } catch (abn var5) {
         throw new abs(var5);
      }

      return Collections.singletonList(var3);
   }

   private ByteBuffer aom() {
      long var1 = 4256409549303401120L & -4256409550814436350L;
      ByteBuffer var3;
      synchronized(this.cZC) {
         for(ByteBuffer var6 : this.cZC) {
            var1 += (long)var6.limit();
         }

         this.aoj();
         var3 = ByteBuffer.allocate((int)var1);

         for(ByteBuffer var10 : this.cZC) {
            var3.put(var10);
         }
      }

      var3.flip();
      return var3;
   }

   private void e(aaV var1, abF var2) {
      if (this.cZw == null) {
         this.cZF.trace(r.q[-32001 & -23810 & -20739 & 21245]);
         throw new abn(-14354 & 5114, r.q[-7427 & -30979 & -20485 & 3839]);
      } else {
         this.k(var2.aoF());
         this.aoj();
         if (this.cZw.aoG() == abi.cZT) {
            ((abG)this.cZw).x(this.aom());
            ((abG)this.cZw).aoD();

            try {
               var1.anN().q(var1, ach.b(this.cZw.aoF()));
            } catch (RuntimeException var5) {
               this.q(var1, var5);
            }
         } else if (this.cZw.aoG() == abi.cZU) {
            ((abG)this.cZw).x(this.aom());
            ((abG)this.cZw).aoD();

            try {
               var1.anN().q(var1, this.cZw.aoF());
            } catch (RuntimeException var4) {
               this.q(var1, var4);
            }
         }

         this.cZw = null;
         this.aoi();
      }
   }

   public void pK() {
      this.cZA = null;
      if (this.cZr != null) {
         this.cZr.pK();
      }

      this.cZr = new abw();
      this.cZv = null;
   }

   public abg aoc() {
      return abg.cZN;
   }

   private byte jR(int var1) {
      switch(var1) {
      case 1:
         return (byte)(-31656 & 4802);
      case 2:
         return (byte)(-32729 & 4328);
      case 3:
         return (byte)(10394 & 52);
      default:
         return (byte)(-21981 & 284);
      }
   }

   public abV anG() {
      return this.cZv;
   }

   public abM w(abM var1) {
      var1.W(r.q[-4390 & 17114 & -9222 & -21537], r.q[-24869 & -18469 & 2015 & 5087]);
      var1.W(w.q[-23569 & -25617 & 31711 & 32767], r.q[6110 & -27682 & 766 & -28709]);
      byte[] var2 = new byte[17200 & -18283];
      this.cZB.nextBytes(var2);
      var1.W(r.q[-14593 & 727 & -9258 & 18389], ace.o(var2));
      var1.W(r.q[-24612 & 6108 & 18141 & 11260], r.q[-13603 & -32035 & 5853 & 2781]);
      StringBuilder var3 = new StringBuilder();

      for(aby var5 : this.cZp) {
         if (var5.aow() != null && var5.aow().length() != 0) {
            if (var3.length() > 0) {
               var3.append(q.q[2431 & 5631 & 3694 & 11775]);
            }

            var3.append(var5.aow());
         }
      }

      if (var3.length() != 0) {
         var1.W(r.q[10190 & 16079 & -30721 & 21455], var3.toString());
      }

      StringBuilder var7 = new StringBuilder();

      for(abV var6 : this.cZs) {
         if (var6.aoP().length() != 0) {
            if (var7.length() > 0) {
               var7.append(q.q[18942 & 254 & -24850 & -26002]);
            }

            var7.append(var6.aoP());
         }
      }

      if (var7.length() != 0) {
         var1.W(r.q[13277 & -15656 & -1295 & -7432], var7.toString());
      }

      return var1;
   }

   public abe() {
      this(Collections.emptyList());
   }

   public abd aoe() {
      ArrayList var1 = new ArrayList();

      for(aby var3 : this.aok()) {
         var1.add(var3.aov());
      }

      ArrayList var5 = new ArrayList();

      for(abV var4 : this.aog()) {
         var5.add(var4.aoQ());
      }

      return new abe(var1, var5, this.cZz);
   }

   private abh gX(String var1) {
      for(abV var3 : this.cZs) {
         if (var3.hg(var1)) {
            this.cZv = var3;
            Logger var10000 = this.cZF;
            String var10001 = r.q[-4390 & -12294 & 27614 & 9207];
            Object[] var10002 = new Object[-29687 & 4133];
            var10002[528 & 42] = this.cZv;
            var10000.trace(var10001, var10002);
            return abh.cZP;
         }
      }

      return abh.cZQ;
   }

   public boolean equals(Object var1) {
      if (this == var1) {
         return (boolean)(8481 & 2757);
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         abe var2 = (abe)var1;
         if (this.cZz != var2.aol()) {
            return (boolean)(-32764 & 25195);
         } else {
            if (this.cZr != null) {
               if (!this.cZr.equals(var2.aon())) {
                  return (boolean)(-20400 & 17161);
               }
            } else if (var2.aon() != null) {
               return (boolean)(-20400 & 17161);
            }

            return (boolean)(this.cZv != null ? this.cZv.equals(var2.anG()) : (var2.anG() == null ? -31727 & 549 : -11774 & 69));
         }
      } else {
         return (boolean)(-32638 & 9272);
      }
   }

   public abh q(abL var1, abS var2) {
      if (!this.w(var2)) {
         this.cZF.trace(r.q[-31017 & 3059 & 22235 & -10533]);
         return abh.cZQ;
      } else if (var1.he(r.q[-27658 & -25641 & 27637 & 27388]) && var2.he(r.q[-4131 & 12279 & 6903 & 4863])) {
         String var3 = var2.hf(r.q[11255 & 2013 & -3337 & -18699]);
         String var4 = var1.hf(r.q[18142 & 2815 & -13609 & -13612]);
         var4 = this.gW(var4);
         if (!var4.equals(var3)) {
            this.cZF.trace(r.q[-26633 & -26921 & 29439 & 8959]);
            return abh.cZQ;
         } else {
            abh var5 = abh.cZQ;
            String var6 = var2.hf(r.q[-12562 & -14642 & 15054 & 7886]);

            for(aby var8 : this.cZp) {
               if (var8.gY(var6)) {
                  this.cZr = var8;
                  var5 = abh.cZP;
                  Logger var10000 = this.cZF;
                  String var10001 = r.q[10201 & 5854 & -21541 & -17445];
                  Object[] var10002 = new Object[8325 & -29181];
                  var10002[2176 & -28662] = this.cZr;
                  var10000.trace(var10001, var10002);
                  break;
               }
            }

            abh var10 = this.gX(var2.hf(r.q[9936 & -18698 & -29737 & 17407]));
            if (var10 == abh.cZP && var5 == abh.cZP) {
               return abh.cZP;
            } else {
               this.cZF.trace(r.q[-2087 & -19463 & 765 & 767]);
               return abh.cZQ;
            }
         }
      } else {
         this.cZF.trace(r.q[14071 & -24873 & 23294 & 11007]);
         return abh.cZQ;
      }
   }

   public aby aon() {
      return this.cZr;
   }

   public List g(ByteBuffer var1) {
      while(true) {
         LinkedList var2 = new LinkedList();
         if (this.cZA != null) {
            try {
               var1.mark();
               int var4 = var1.remaining();
               int var9 = this.cZA.remaining();
               if (var9 > var4) {
                  this.cZA.put(var1.array(), var1.position(), var4);
                  var1.position(var1.position() + var4);
                  return Collections.emptyList();
               }

               this.cZA.put(var1.array(), var1.position(), var9);
               var1.position(var1.position() + var9);
               abF var3 = this.l((ByteBuffer)this.cZA.duplicate().position(2061 & 4192));
               var2.add(var3);
               this.cZA = null;
            } catch (abl var6) {
               ByteBuffer var5 = ByteBuffer.allocate(this.jQ(var6.aoq()));
               if (!cZu && var5.limit() <= this.cZA.limit()) {
                  throw new AssertionError();
               }

               this.cZA.rewind();
               var5.put(this.cZA);
               this.cZA = var5;
               continue;
            }
         }

         while(var1.hasRemaining()) {
            var1.mark();

            try {
               abF var8 = this.l(var1);
               var2.add(var8);
            } catch (abl var7) {
               var1.reset();
               int var10 = var7.aoq();
               this.cZA = ByteBuffer.allocate(this.jQ(var10));
               this.cZA.put(var1);
               break;
            }
         }

         return var2;
      }
   }

   private void r(aaV var1, abF var2) {
      try {
         var1.anN().q(var1, var2.aoF());
      } catch (RuntimeException var4) {
         this.q(var1, var4);
      }

   }

   private void t(aaV var1, abF var2) {
      int var3 = 6125 & 9197;
      String var4 = q.q[4728 & -14468 & 26092 & -8057];
      if (var2 instanceof abB) {
         abB var5 = (abB)var2;
         var3 = var5.aor();
         var4 = var5.getMessage();
      }

      if (var1.any() == abj.dab) {
         var1.e(var3, var4, (boolean)(8985 & 7171));
      } else if (this.aoc() == abg.cZN) {
         var1.q(var3, var4, (boolean)(30795 & 517));
      } else {
         var1.w(var3, var4, (boolean)(-23548 & 4744));
      }

   }

   private byte cA(boolean var1) {
      return (byte)(var1 ? -128 & -42 : 1536 & 249);
   }

   public abe(List var1, List var2) {
      this(var1, var2, Integer.MAX_VALUE & Integer.MAX_VALUE);
   }

   public List j(String var1, boolean var2) {
      abK var3 = new abK();
      var3.x(ByteBuffer.wrap(ach.hi(var1)));
      var3.cE(var2);

      try {
         var3.aoD();
      } catch (abn var5) {
         throw new abs(var5);
      }

      return Collections.singletonList(var3);
   }

   private abi r(byte var1) {
      switch(var1) {
      case 0:
         return abi.cZS;
      case 1:
         return abi.cZT;
      case 2:
         return abi.cZU;
      case 3:
      case 4:
      case 5:
      case 6:
      case 7:
      default:
         throw new abp(r.q[9206 & 2037 & 25340 & 26365] + (short)var1);
      case 8:
         return abi.cZX;
      case 9:
         return abi.cZV;
      case 10:
         return abi.cZW;
      }
   }

   public ByteBuffer w(abF var1) {
      this.aon().y(var1);
      if (this.cZF.isTraceEnabled()) {
         Logger var10000 = this.cZF;
         String var10001 = r.q[999 & 1763 & -24586 & -24838];
         Object[] var10002 = new Object[-26581 & 25878];
         var10002[3104 & 8723] = var1.aoF().remaining();
         var10002[51 & 12297] = var1.aoF().remaining() > (2029 & 11240) ? r.q[-17689 & -21529 & -30749 & 21239] : new String(var1.aoF().array());
         var10000.trace(var10001, var10002);
      }

      return this.e(var1);
   }

   private void bY(int var1, int var2) {
      if (var1 < var2) {
         this.cZF.trace(r.q[2031 & -31761 & 21246 & 17391]);
         throw new abl(var2);
      }
   }
}
