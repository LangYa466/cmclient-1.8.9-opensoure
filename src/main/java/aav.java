import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.channels.SelectionKey;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import javax.net.ssl.SSLSession;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class aaV implements aaS {
   private String cYE;
   private SelectionKey cYF;
   public static final int cYG = 80;
   private ByteChannel cYe;
   private boolean cYH;
   private final aaW cYI;
   private acc cYJ;
   private final Logger cYK;
   private abk cYL;
   private final Object cYM;
   // $FF: synthetic field
   static final boolean cYN = (boolean)(!aaV.class.desiredAssertionStatus() ? 1287 & 28753 : 290 & 9220);
   public final BlockingQueue cYO;
   private volatile abj cYP;
   private Object cYQ;
   private abd cYR;
   public static final int cYS = 443;
   private long cYT;
   private List cYU;
   public final BlockingQueue cYV;
   private Integer cYW;
   private String cYX;
   private Boolean cYY;
   private abL cYZ;
   private ByteBuffer cZa;

   public aaV(aaW var1, abd var2) {
      this.cYK = LogManager.getLogger(aaV.class);
      this.cYH = (boolean)(9232 & -32702);
      this.cYP = abj.cZZ;
      this.cYR = null;
      this.cZa = ByteBuffer.allocate(-29114 & 20873);
      this.cYZ = null;
      this.cYX = null;
      this.cYW = null;
      this.cYY = null;
      this.cYE = null;
      this.cYT = System.nanoTime();
      this.cYM = new Object();
      if (var1 != null && (var2 != null || this.cYL != abk.daf)) {
         this.cYO = new LinkedBlockingQueue();
         this.cYV = new LinkedBlockingQueue();
         this.cYI = var1;
         this.cYL = abk.dae;
         if (var2 != null) {
            this.cYR = var2.aoe();
         }

      } else {
         throw new IllegalArgumentException(u.q[26363 & 31995 & -28419 & -15691]);
      }
   }

   public aaV(aaW var1, List var2) {
      this(var1, (abd)null);
      this.cYL = abk.daf;
      if (var2 != null && !var2.isEmpty()) {
         this.cYU = var2;
      } else {
         this.cYU = new ArrayList();
         this.cYU.add(new abe());
      }

   }

   public void f(int var1, String var2) {
      this.q(var1, var2, (boolean)(532 & 24867));
   }

   public synchronized void q(int var1, String var2, boolean var3) {
      if (this.cYP != abj.dab && this.cYP != abj.dac) {
         if (this.cYP == abj.daa) {
            if (var1 == (4078 & -23570)) {
               if (!cYN && var3) {
                  throw new AssertionError();
               }

               this.cYP = abj.dab;
               this.w(var1, var2, (boolean)(402 & 26688));
               return;
            }

            if (this.cYR.aoc() != abg.cZL) {
               try {
                  if (!var3) {
                     try {
                        this.cYI.q(this, var1, var2);
                     } catch (RuntimeException var5) {
                        this.cYI.q(this, var5);
                     }
                  }

                  if (this.isOpen()) {
                     abB var4 = new abB();
                     var4.hb(var2);
                     var4.jT(var1);
                     var4.aoD();
                     this.q(var4);
                  }
               } catch (abn var6) {
                  this.cYK.error(u.q[-5665 & -4913 & 29694 & -27650], var6);
                  this.cYI.q(this, var6);
                  this.w(-31762 & 25582, u.q[-9490 & -5393 & 2766 & 20719], (boolean)(8257 & 390));
               }
            }

            this.w(var1, var2, var3);
         } else if (var1 == (-1 & -3)) {
            if (!cYN && !var3) {
               throw new AssertionError();
            }

            this.w(-3 & -3, var2, (boolean)(-23223 & 49));
         } else if (var1 == (5102 & 1019)) {
            this.w(var1, var2, var3);
         } else {
            this.w(-1 & -1, var2, (boolean)(4384 & -23550));
         }

         this.cYP = abj.dab;
         this.cZa = null;
      }
   }

   public abj any() {
      return this.cYP;
   }

   public void t(byte[] var1) {
      this.i(ByteBuffer.wrap(var1));
   }

   protected void f(int var1, boolean var2) {
      this.e(var1, q.q[-28062 & -27422 & 32065 & -21071], var2);
   }

   private void a(Collection var1) {
      if (!this.isOpen()) {
         throw new abt();
      } else if (var1 == null) {
         throw new IllegalArgumentException();
      } else {
         ArrayList var2 = new ArrayList();

         for(abF var4 : var1) {
            Logger var10000 = this.cYK;
            String var10001 = u.q[20693 & 759 & -29955 & 10973];
            Object[] var10002 = new Object[-28159 & 11353];
            var10002[4160 & 25127] = var4;
            var10000.trace(var10001, var10002);
            var2.add(this.cYR.w(var4));
         }

         this.F(var2);
      }
   }

   public Object anv() {
      return this.cYQ;
   }

   private void q(RuntimeException var1) {
      this.a(this.jP(-17931 & 508));
      this.w(-1 & -1, var1.getMessage(), (boolean)(8768 & 18858));
   }

   public void o(ByteBuffer var1) {
      if (!cYN && !var1.hasRemaining()) {
         throw new AssertionError();
      } else {
         if (this.cYK.isTraceEnabled()) {
            Logger var10000 = this.cYK;
            String var10001 = u.q[-19981 & -23561 & 702 & 8446];
            Object[] var10002 = new Object[8998 & 16403];
            var10002[-2460 & 274] = var1.remaining();
            var10002[5317 & -32495] = var1.remaining() > (-24599 & 1006) ? r.q[-1029 & -25609 & 27367 & 26611] : new String(var1.array(), var1.position(), var1.remaining());
            var10000.trace(var10001, var10002);
         }

         if (this.cYP != abj.cZZ) {
            if (this.cYP == abj.daa) {
               this.p(var1);
            }
         } else if (this.s(var1) && !this.anA() && !this.isClosed()) {
            if (!cYN && this.cZa.hasRemaining() == var1.hasRemaining() && var1.hasRemaining()) {
               throw new AssertionError();
            }

            if (var1.hasRemaining()) {
               this.p(var1);
            } else if (this.cZa.hasRemaining()) {
               this.p(this.cZa);
            }
         }

      }
   }

   public void anI() {
      this.cYT = System.nanoTime();
   }

   private void p(ByteBuffer var1) {
      try {
         for(abF var10 : this.cYR.g(var1)) {
            Logger var10000 = this.cYK;
            String var10001 = u.q[5595 & -16414 & 3831 & 19146];
            Object[] var10002 = new Object[1453 & 30785];
            var10002[-12384 & 25] = var10;
            var10000.trace(var10001, var10002);
            this.cYR.q(this, var10);
         }
      } catch (abr var6) {
         if (var6.amv() == (Integer.MAX_VALUE & Integer.MAX_VALUE)) {
            this.cYK.error(u.q[24259 & -24893 & 17871 & 29131], var6);
            this.cYI.q(this, var6);
         }

         this.w(var6);
      } catch (abn var7) {
         this.cYK.error(u.q[-23562 & -5643 & 22742 & 23780], var7);
         this.cYI.q(this, var7);
         this.w(var7);
      } catch (ThreadDeath | LinkageError | VirtualMachineError var8) {
         this.cYK.error(u.q[-26113 & -30257 & -24363 & 8391]);
         throw var8;
      } catch (Error var9) {
         this.cYK.error(u.q[-11042 & -26682 & 17358 & 22743]);
         Exception var4 = new Exception(var9);
         this.cYI.q(this, var4);
         String var5 = u.q[-27161 & -18953 & 4327 & -32545] + var9.getClass().getName();
         this.f(-14349 & 5107, var5);
      }

   }

   public ByteChannel anJ() {
      return this.cYe;
   }

   private void q(abn var1) {
      this.a(this.jP(16788 & -29730));
      this.w(var1.aor(), var1.getMessage(), (boolean)(3140 & 4744));
   }

   public boolean anE() {
      return (boolean)(!this.cYO.isEmpty() ? 325 & 6297 : 16960 & -28543);
   }

   public SelectionKey anK() {
      return this.cYF;
   }

   public String anH() {
      return this.cYE;
   }

   public boolean isClosed() {
      return (boolean)(this.cYP == abj.dac ? 483 & 7177 : -29044 & 24882);
   }

   public acc anL() {
      return this.cYJ;
   }

   public String toString() {
      return super.toString();
   }

   public void g(int var1, String var2) {
      this.e(var1, var2, (boolean)(11288 & 7));
   }

   private void F(List var1) {
      synchronized(this.cYM) {
         for(ByteBuffer var4 : var1) {
            this.a(var4);
         }

      }
   }

   public InetSocketAddress anz() {
      return this.cYI.w(this);
   }

   public void jO(int var1) {
      this.q(var1, q.q[-1296 & 960 & -31462 & -24184], (boolean)(1 & 17418));
   }

   public void gT(String var1) {
      if (var1 == null) {
         throw new IllegalArgumentException(u.q[6388 & 23031 & 8436 & -29228]);
      } else {
         this.a(this.cYR.j(var1, (boolean)(this.cYL == abk.dae ? -26357 & 9249 : 6300 & -31966)));
      }
   }

   public boolean isOpen() {
      return (boolean)(this.cYP == abj.daa ? 17457 & -32759 : 16897 & 8464);
   }

   public void q(abi var1, ByteBuffer var2, boolean var3) {
      this.a(this.cYR.w(var1, var2, var3));
   }

   long anM() {
      return this.cYT;
   }

   public void p(Collection var1) {
      this.a(var1);
   }

   private void q(abQ var1) {
      Logger var10000 = this.cYK;
      String var10001 = u.q[14811 & 13819 & 17403 & 19199];
      Object[] var10002 = new Object[16897 & 1161];
      var10002[-15556 & 2048] = this.cYR;
      var10000.trace(var10001, var10002);
      this.cYP = abj.daa;
      this.anI();

      try {
         this.cYI.q(this, var1);
      } catch (RuntimeException var3) {
         this.cYI.q(this, var3);
      }

   }

   public boolean anx() {
      return this.cYe instanceof abU;
   }

   public aaW anN() {
      return this.cYI;
   }

   public void anO() {
      if (this.cYP == abj.cZZ) {
         this.f(-1 & -1, (boolean)(2049 & -24575));
      } else if (this.cYH) {
         this.e(this.cYW.intValue(), this.cYX, this.cYY.booleanValue());
      } else if (this.cYR.aoc() == abg.cZL) {
         this.f(-13330 & 1016, (boolean)(65 & -32719));
      } else if (this.cYR.aoc() == abg.cZM) {
         if (this.cYL == abk.daf) {
            this.f(19438 & 13294, (boolean)(5325 & 17153));
         } else {
            this.f(-27671 & 26606, (boolean)(18451 & 12385));
         }
      } else {
         this.f(-10257 & 1006, (boolean)(-32687 & 3073));
      }

   }

   public void q(acc var1) {
      this.cYJ = var1;
   }

   public void q(abF var1) {
      this.a(Collections.singletonList(var1));
   }

   public boolean anw() {
      return this.cYH;
   }

   public void q(abM var1) {
      this.cYZ = this.cYR.w(var1);
      this.cYE = var1.anH();
      if (!cYN && this.cYE == null) {
         throw new AssertionError();
      } else {
         try {
            this.cYI.q(this, this.cYZ);
         } catch (abn var3) {
            throw new abq(u.q[-10241 & -29737 & 29143 & 30975]);
         } catch (RuntimeException var4) {
            this.cYK.error(u.q[504 & -31272 & 216 & -32292], var4);
            this.cYI.q(this, var4);
            throw new abq(u.q[21245 & -7463 & 17881 & 12285] + var4);
         }

         this.F(this.cYR.r(this.cYZ));
      }
   }

   public void q(SelectionKey var1) {
      this.cYF = var1;
   }

   public abd anD() {
      return this.cYR;
   }

   public void close() {
      this.jO(1000 & 3055);
   }

   public void anl() {
      if (this.cYY == null) {
         throw new IllegalStateException(u.q[6098 & -29486 & -17165 & 18675]);
      } else {
         this.e(this.cYW.intValue(), this.cYX, this.cYY.booleanValue());
      }
   }

   private ByteBuffer jP(int var1) {
      String var2;
      switch(var1) {
      case 404:
         var2 = u.q[28872 & 457 & -19751 & 5357];
         break;
      case 500:
      default:
         var2 = u.q[-28455 & 6617 & 30463 & -6165];
      }

      return ByteBuffer.wrap(ach.hj(u.q[203 & 26623 & -16913 & 6862] + var2 + u.q[-32533 & 19679 & 31691 & 23019] + ((13682 & 696) + var2.length()) + u.q[4335 & 9934 & 6142 & 16124] + var2 + u.q[-30771 & 26573 & -26403 & 31949]));
   }

   public void q(ByteChannel var1) {
      this.cYe = var1;
   }

   public synchronized void w(int var1, String var2, boolean var3) {
      if (!this.cYH) {
         this.cYW = var1;
         this.cYX = var2;
         this.cYY = var3;
         this.cYH = (boolean)(-32251 & 25011);
         this.cYI.e(this);

         try {
            this.cYI.q(this, var1, var2, var3);
         } catch (RuntimeException var5) {
            this.cYK.error(u.q[32503 & 16115 & 979 & 24023], var5);
            this.cYI.q(this, var5);
         }

         if (this.cYR != null) {
            this.cYR.pK();
         }

         this.cYZ = null;
      }
   }

   public synchronized void e(int var1, String var2, boolean var3) {
      if (this.cYP != abj.dac) {
         if (this.cYP == abj.daa && var1 == (9214 & 23534)) {
            this.cYP = abj.dab;
         }

         if (this.cYF != null) {
            this.cYF.cancel();
         }

         if (this.cYe != null) {
            try {
               this.cYe.close();
            } catch (IOException var6) {
               if (var6.getMessage() != null && var6.getMessage().equals(u.q[-12081 & -32561 & 29951 & 5375])) {
                  this.cYK.trace(u.q[-26378 & -30224 & -4398 & 30681], var6);
               } else {
                  this.cYK.error(u.q[7131 & 7121 & -2337 & 25817], var6);
                  this.cYI.q(this, var6);
               }
            }
         }

         try {
            this.cYI.w(this, var1, var2, var3);
         } catch (RuntimeException var5) {
            this.cYI.q(this, var5);
         }

         if (this.cYR != null) {
            this.cYR.pK();
         }

         this.cYZ = null;
         this.cYP = abj.dac;
      }
   }

   public void n(Object var1) {
      this.cYQ = var1;
   }

   public boolean anA() {
      return (boolean)(this.cYP == abj.dab ? 129 & -32247 : 196 & 25634);
   }

   public InetSocketAddress anB() {
      return this.cYI.r(this);
   }

   private void a(ByteBuffer var1) {
      Logger var10000 = this.cYK;
      String var10001 = u.q[-10022 & -26401 & 12798 & 11995];
      Object[] var10002 = new Object[8243 & 23554];
      var10002[34 & 8220] = var1.remaining();
      var10002[8521 & 6181] = var1.remaining() > (-14358 & 9213) ? r.q[-16665 & -20757 & 13031 & -15645] : new String(var1.array());
      var10000.trace(var10001, var10002);
      this.cYO.add(var1);
      this.cYI.e(this);
   }

   public SSLSession anC() {
      if (!this.anx()) {
         throw new IllegalArgumentException(u.q[-26882 & 30463 & 28124 & 30972]);
      } else {
         return ((abU)this.cYe).ani().getSession();
      }
   }

   public abV anG() {
      if (this.cYR == null) {
         return null;
      } else if (!(this.cYR instanceof abe)) {
         throw new IllegalArgumentException(u.q[-15875 & -29987 & 13823 & -24353]);
      } else {
         return ((abe)this.cYR).anG();
      }
   }

   public void i(ByteBuffer var1) {
      if (var1 == null) {
         throw new IllegalArgumentException(u.q[20735 & -27907 & -23300 & 26324]);
      } else {
         this.a(this.cYR.q(var1, (boolean)(this.cYL == abk.dae ? -22445 & 4105 : -27380 & 8880)));
      }
   }

   public void w(abn var1) {
      this.q(var1.aor(), var1.getMessage(), (boolean)(8705 & -12154));
   }

   public void anF() {
      abI var1 = this.cYI.q(this);
      if (var1 == null) {
         throw new NullPointerException(u.q[15070 & -22274 & -26922 & 27902]);
      } else {
         this.q(var1);
      }
   }

   private boolean s(ByteBuffer var1) {
      ByteBuffer var2;
      if (this.cZa.capacity() == 0) {
         var2 = var1;
      } else {
         if (this.cZa.remaining() < var1.remaining()) {
            ByteBuffer var3 = ByteBuffer.allocate(this.cZa.capacity() + var1.remaining());
            this.cZa.flip();
            var3.put(this.cZa);
            this.cZa = var3;
         }

         this.cZa.put(var1);
         this.cZa.flip();
         var2 = this.cZa;
      }

      var2.mark();

      try {
         try {
            if (this.cYL == abk.daf) {
               if (this.cYR != null) {
                  abQ var22 = this.cYR.j(var2);
                  if (!(var22 instanceof abL)) {
                     this.cYK.trace(u.q[22461 & -2567 & -32519 & -29955]);
                     this.w(17390 & 4074, u.q[25591 & 8948 & 18175 & 30911], (boolean)(80 & -16888));
                     return (boolean)(0 & -16157);
                  }

                  abL var25 = (abL)var22;
                  abh var19 = this.cYR.q(var25);
                  if (var19 == abh.cZP) {
                     this.q(var25);
                     return (boolean)(-32751 & 17477);
                  }

                  this.cYK.trace(u.q[19706 & 16638 & -24326 & 11706]);
                  this.f(9194 & 2031, u.q[-6981 & -24389 & 20155 & -5121]);
                  return (boolean)(369 & -23422);
               }

               for(abd var23 : this.cYU) {
                  var23 = var23.aoe();

                  try {
                     var23.q(this.cYL);
                     var2.reset();
                     abQ var6 = var23.j(var2);
                     if (!(var6 instanceof abL)) {
                        this.cYK.trace(u.q[8435 & 2807 & -3393 & 29883]);
                        this.q(new abn(-27670 & 20462, u.q[23295 & 30964 & -24386 & 27581]));
                        return (boolean)(20756 & 193);
                     }

                     abL var7 = (abL)var6;
                     abh var18 = var23.q(var7);
                     if (var18 == abh.cZP) {
                        this.cYE = var7.anH();

                        abT var8;
                        try {
                           var8 = this.cYI.q(this, var23, var7);
                        } catch (abn var12) {
                           this.cYK.trace(u.q[-26691 & 1469 & -17675 & 2749], var12);
                           this.q(var12);
                           return (boolean)(2305 & 9364);
                        } catch (RuntimeException var13) {
                           this.cYK.error(u.q[30710 & 26367 & -13826 & -27209], var13);
                           this.cYI.q(this, var13);
                           this.q(var13);
                           return (boolean)(3111 & 24584);
                        }

                        this.F(var23.r(var23.q(var7, var8)));
                        this.cYR = var23;
                        this.q(var7);
                        return (boolean)(4161 & 8449);
                     }
                  } catch (abq var14) {
                     ;
                  }
               }

               if (this.cYR == null) {
                  this.cYK.trace(u.q[24767 & -24329 & -14665 & 23231]);
                  this.q(new abn(10218 & 1002, u.q[8190 & 7356 & -32262 & -30209]));
               }

               return (boolean)(9157 & 7200);
            }

            if (this.cYL == abk.dae) {
               this.cYR.q(this.cYL);
               abQ var20 = this.cYR.j(var2);
               if (!(var20 instanceof abS)) {
                  this.cYK.trace(u.q[24251 & 4351 & 18427 & 2041]);
                  this.w(3050 & -2066, u.q[20215 & 4342 & -11844 & 14517], (boolean)(643 & -24508));
                  return (boolean)(5253 & 10496);
               }

               abS var5 = (abS)var20;
               abh var17 = this.cYR.q(this.cYZ, var5);
               if (var17 == abh.cZP) {
                  try {
                     this.cYI.q(this, this.cYZ, var5);
                  } catch (abn var10) {
                     this.cYK.trace(u.q[7422 & -8514 & 21692 & -32579], var10);
                     this.w(var10.aor(), var10.getMessage(), (boolean)(16978 & 3212));
                     return (boolean)(9601 & 20);
                  } catch (RuntimeException var11) {
                     this.cYK.error(u.q[-22337 & 9663 & -14915 & -13635], var11);
                     this.cYI.q(this, var11);
                     this.w(-1 & -1, var11.getMessage(), (boolean)(1312 & 578));
                     return (boolean)(10532 & 4234);
                  }

                  this.q(var5);
                  return (boolean)(13833 & -32619);
               }

               Logger var10000 = this.cYK;
               String var10001 = u.q[-29249 & -25089 & 8446 & 32255];
               Object[] var10002 = new Object[10069 & 20481];
               var10002[8453 & 5120] = this.cYR;
               var10000.trace(var10001, var10002);
               this.f(13290 & 17402, u.q[8703 & 1023 & 23231 & -15681] + this.cYR + u.q[23535 & 23019 & -12588 & -32048]);
            }
         } catch (abq var15) {
            this.cYK.trace(u.q[-29711 & -29707 & 10689 & 9409], var15);
            this.w(var15);
         }
      } catch (abm var16) {
         if (this.cZa.capacity() == 0) {
            var2.reset();
            int var4 = var16.aoq();
            if (var4 == 0) {
               var4 = var2.capacity() + (4112 & -23084);
            } else if (!cYN && var16.aoq() < var2.remaining()) {
               throw new AssertionError();
            }

            this.cZa = ByteBuffer.allocate(var4);
            this.cZa.put(var1);
         } else {
            this.cZa.position(this.cZa.limit());
            this.cZa.limit(this.cZa.capacity());
         }
      }

      return (boolean)(2707 & 17440);
   }
}
