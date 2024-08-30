package org.newsclub.net.unix;

import java.io.Closeable;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.SocketImpl;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

class AFUNIXSocketImpl extends SocketImpl {
   private boolean dlu = (boolean)(12 & -16288);
   private static final int dlv = 1;
   private ByteBuffer dlw = ByteBuffer.allocateDirect(1285 & 240);
   private volatile boolean dlx = (boolean)(12361 & 3232);
   private volatile boolean dly = (boolean)(-27616 & 18446);
   private volatile boolean dlz = (boolean)(3712 & -28668);
   private final List dlA = Collections.synchronizedList(new LinkedList());
   private final Map dlB = Collections.synchronizedMap(new HashMap());
   private final AtomicInteger dlC = new AtomicInteger(259 & 12808);
   private int[] dlD = null;
   private volatile boolean cAf = (boolean)(1163 & 2304);
   private long dlE = -1L & -1L;
   private final org.newsclub.net.unix.o dlF = new org.newsclub.net.unix.o(this);
   private static final int dlG = 0;
   private int dlH = 4131 & 16532;
   private final org.newsclub.net.unix.p dlI = new org.newsclub.net.unix.p(this);
   private static final int dlJ = 2;
   private AFUNIXSocketAddress dlK;
   private boolean cXV = (boolean)(9421 & 16641);

   // $FF: synthetic method
   static ByteBuffer q(AFUNIXSocketImpl var0) {
      return var0.dlw;
   }

   protected final synchronized void close() {
      boolean var1 = this.dlz;
      this.dlz = (boolean)(5136 & 18699);
      FileDescriptor var2 = this.ato();
      if (var2 != null) {
         NativeUnixSocket.shutdown(var2, 642 & 59);
         this.cAf = (boolean)(4097 & -13823);
         if (var1 && this.dlK != null && this.dlK.atf() != null && this.dlE >= (537314210L & -636683345851834368L)) {
            this.atn();
         }

         NativeUnixSocket.close(var2);
      }

      this.cAf = (boolean)(30341 & -32703);
   }

   void asY() {
      this.dlA.clear();
   }

   protected InputStream getInputStream() {
      if (!this.dlu && !this.dlz) {
         throw new IOException(.p.q[14441 & 6249 & -15629 & 25297]);
      } else {
         this.atp();
         return this.dlF;
      }
   }

   private void atn() {
      while(this.dlC.get() > 0) {
         try {
            FileDescriptor var1 = new FileDescriptor();

            try {
               NativeUnixSocket.connect(this.dlK.atf(), var1, this.dlE);
            } catch (IOException var5) {
               return;
            }

            try {
               NativeUnixSocket.shutdown(var1, 16450 & 8206);
            } catch (Exception var4) {
               ;
            }

            try {
               NativeUnixSocket.close(var1);
            } catch (Exception var3) {
               ;
            }
         } catch (Exception var6) {
            ;
         }
      }

   }

   protected void shutdownInput() {
      FileDescriptor var1 = this.ato();
      if (var1 != null) {
         NativeUnixSocket.shutdown(var1, 6409 & 208);
      }

   }

   protected void bind(SocketAddress var1, int var2) {
      if (!(var1 instanceof AFUNIXSocketAddress)) {
         throw new SocketException(.p.q[16359 & 2755 & -31368 & -28548] + var1.getClass());
      } else {
         this.dlK = (AFUNIXSocketAddress)var1;
         this.dlE = NativeUnixSocket.bind(this.dlK.atf(), this.fd, var2);
         this.atp();
         this.dlz = (boolean)(16705 & 7181);
         this.localport = this.dlK.getPort();
      }
   }

   void x(int[] var1) {
      if (var1 != null && var1.length != 0) {
         FileDescriptor[] var2 = new FileDescriptor[var1.length];
         int var3 = 202 & 27136;

         for(int var4 = var1.length; var3 < var4; ++var3) {
            FileDescriptor var5 = new FileDescriptor();
            NativeUnixSocket.initFD(var5, var1[var3]);
            var2[var3] = var5;
            this.dlB.put(var5, Integer.valueOf(var1[var3]));
            Closeable var6 = () -> {
               Integer var10000 = (Integer)this.dlB.remove(var5);
            };
            NativeUnixSocket.attachCloseable(var5, var6);
         }

         this.dlA.add(var2);
      }
   }

   // $FF: synthetic method
   static void w(AFUNIXSocketImpl var0) {
      var0.atr();
   }

   protected int available() {
      FileDescriptor var1 = this.atp();
      return NativeUnixSocket.available(var1);
   }

   protected void bind(InetAddress var1, int var2) {
      throw new SocketException(.p.q[10351 & 13404 & 7524 & 16880] + InetAddress.class);
   }

   // $FF: synthetic method
   static int[] e(AFUNIXSocketImpl var0) {
      return var0.dlD;
   }

   protected void connect(String var1, int var2) {
      throw new SocketException(.p.q[12405 & -22156 & 16963 & -3133] + InetAddress.class);
   }

   private static int m(Object var0) {
      try {
         return ((Integer)var0).intValue();
      } catch (ClassCastException var2) {
         throw (SocketException)(new SocketException(.p.q[16583 & 6727 & -11705 & -20249] + var0)).initCause(var2);
      } catch (NullPointerException var3) {
         throw (SocketException)(new SocketException(.p.q[21839 & 31818 & -31137 & -32643])).initCause(var3);
      }
   }

   public String toString() {
      return super.toString() + .p.q[-10369 & -10517 & 735 & -24457] + this.fd + .p.q[13804 & 13550 & 3431 & -19753] + this.dlK + .p.q[21629 & 29813 & -13353 & 12103] + this.dlu + .p.q[-19594 & -31922 & 30975 & -25898] + this.dlz + .q.q[-26627 & -22562 & 28669 & -9283];
   }

   // $FF: synthetic method
   static boolean q(AFUNIXSocketImpl var0, boolean var1) {
      return var0.dly = var1;
   }

   private static int A(Object var0) {
      try {
         return ((Boolean)var0).booleanValue() ? 33 & 22021 : 4130 & 24900;
      } catch (ClassCastException var2) {
         throw (SocketException)(new SocketException(.p.q[2895 & 2511 & -20353 & 12615] + var0)).initCause(var2);
      } catch (NullPointerException var3) {
         throw (SocketException)(new SocketException(.p.q[-17073 & -18999 & 378 & -21286])).initCause(var3);
      }
   }

   protected void connect(InetAddress var1, int var2) {
      throw new SocketException(.p.q[21711 & 21214 & -1063 & -31117] + InetAddress.class);
   }

   private synchronized FileDescriptor ato() {
      if (this.cAf) {
         return null;
      } else {
         FileDescriptor var1 = this.fd;
         return var1 != null && var1.valid() ? var1 : null;
      }
   }

   // $FF: synthetic method
   static boolean w(AFUNIXSocketImpl var0, boolean var1) {
      return var0.dlx = var1;
   }

   protected void listen(int var1) {
      FileDescriptor var2 = this.atp();
      if (var1 <= 0) {
         var1 = 16499 & 8754;
      }

      NativeUnixSocket.listen(var2, var1);
   }

   private FileDescriptor atp() {
      FileDescriptor var1 = this.ato();
      if (var1 == null) {
         throw new SocketException(.p.q[9559 & 16834 & 6375 & 22983]);
      } else {
         return var1;
      }
   }

   protected final void finalize() {
      try {
         this.close();
      } catch (Throwable var5) {
         ;
      }

      try {
         synchronized(this.dlB) {
            for(FileDescriptor var3 : this.dlB.keySet()) {
               NativeUnixSocket.close(var3);
            }
         }
      } catch (Throwable var7) {
         ;
      }

   }

   void c(int... var1) {
      this.dlD = var1 != null && var1.length != 0 ? var1 : null;
   }

   protected OutputStream getOutputStream() {
      if (!this.dlu && !this.dlz) {
         throw new IOException(.p.q[-21895 & 32113 & -26675 & -25393]);
      } else {
         this.atp();
         return this.dlI;
      }
   }

   protected void connect(SocketAddress var1, int var2) {
      if (!(var1 instanceof AFUNIXSocketAddress)) {
         throw new SocketException(.p.q[-32423 & -22965 & 11770 & -26414] + var1.getClass());
      } else {
         this.dlK = (AFUNIXSocketAddress)var1;
         NativeUnixSocket.connect(this.dlK.atf(), this.fd, -1L & -1L);
         this.atp();
         this.address = this.dlK.getAddress();
         this.port = this.dlK.getPort();
         this.localport = 18440 & -24316;
         this.dlu = (boolean)(595 & 165);
      }
   }

   FileDescriptor[] atd() {
      if (this.dlA.isEmpty()) {
         return null;
      } else {
         ArrayList var1 = new ArrayList(this.dlA);
         if (var1.isEmpty()) {
            return null;
         } else {
            this.dlA.removeAll(var1);
            int var2 = 13350 & 320;

            for(FileDescriptor[] var4 : var1) {
               var2 += var4.length;
            }

            if (var2 == 0) {
               return null;
            } else {
               FileDescriptor[] var7 = new FileDescriptor[var2];
               int var8 = 16 & 3850;

               for(FileDescriptor[] var6 : var1) {
                  System.arraycopy(var6, 16974 & 2208, var7, var8, var6.length);
                  var8 += var6.length;
               }

               return var7;
            }
         }
      }
   }

   // $FF: synthetic method
   static FileDescriptor r(AFUNIXSocketImpl var0) {
      return var0.ato();
   }

   protected void shutdownOutput() {
      FileDescriptor var1 = this.ato();
      if (var1 != null) {
         NativeUnixSocket.shutdown(var1, 7237 & 8729);
      }

   }

   public Object getOption(int var1) {
      if (var1 == (5 & 6156)) {
         return this.cXV;
      } else {
         FileDescriptor var2 = this.atp();

         try {
            switch(var1) {
            case 1:
            case 8:
               return Boolean.valueOf((boolean)(NativeUnixSocket.getSocketOptionInt(var2, var1) != 0 ? 1 & 131 : 65 & -26624));
            case 128:
            case 4097:
            case 4098:
               return NativeUnixSocket.getSocketOptionInt(var2, var1);
            case 4102:
               return Math.max(this.dlH, Math.max(NativeUnixSocket.getSocketOptionInt(var2, -11179 & 6189), NativeUnixSocket.getSocketOptionInt(var2, 5398 & 28711)));
            default:
               throw new SocketException(.p.q[3531 & 15563 & -29859 & 21087] + var1);
            }
         } catch (SocketException var4) {
            throw var4;
         } catch (Exception var5) {
            throw (SocketException)(new SocketException(.p.q[-20274 & -20145 & 1902 & -4102])).initCause(var5);
         }
      }
   }

   FileDescriptor atq() {
      return this.fd;
   }

   int atc() {
      return this.dlw.capacity();
   }

   protected void create(boolean var1) {
   }

   protected AFUNIXSocketImpl() {
      this.fd = new FileDescriptor();
   }

   protected void accept(SocketImpl var1) {
      FileDescriptor var2 = this.atp();
      AFUNIXSocketImpl var3 = (AFUNIXSocketImpl)var1;

      try {
         if (this.dlC.incrementAndGet() >= (-1 & Integer.MAX_VALUE)) {
            throw new SocketException(.p.q[-25345 & 511 & 7999 & 24063]);
         }

         if (!this.dlz || this.cAf) {
            throw new SocketException(.y.q[11102 & -5154 & -8226 & -10243]);
         }

         NativeUnixSocket.accept(this.dlK.atf(), var2, var3.fd, this.dlE, this.dlH);
         if (!this.dlz || this.cAf) {
            try {
               NativeUnixSocket.shutdown(var3.fd, 5670 & 66);
            } catch (Exception var10) {
               ;
            }

            try {
               NativeUnixSocket.close(var3.fd);
            } catch (Exception var9) {
               ;
            }

            throw new SocketException(.y.q[2942 & -31874 & 10076 & 20349]);
         }
      } finally {
         this.dlC.decrementAndGet();
      }

      var3.dlK = this.dlK;
      var3.dlu = (boolean)(-31647 & 24581);
   }

   private void atr() {
      if (this.dly && this.dlx) {
         this.close();
      }

   }

   protected void bind(SocketAddress var1) {
      this.bind(var1, -1 & -1);
   }

   AFUNIXSocketCredentials atb() {
      return NativeUnixSocket.peerCredentials(this.fd, new AFUNIXSocketCredentials());
   }

   public void setOption(int var1, Object var2) {
      if (var1 == (-31675 & 23342)) {
         this.cXV = (boolean)(A(var2) != 0 ? -15743 & 6499 : 16434 & 4480);
      } else {
         FileDescriptor var3 = this.atp();

         try {
            switch(var1) {
            case 1:
            case 8:
               NativeUnixSocket.setSocketOptionInt(var3, var1, A(var2));
               return;
            case 128:
               if (var2 instanceof Boolean) {
                  boolean var4 = ((Boolean)var2).booleanValue();
                  if (var4) {
                     throw new SocketException(.p.q[-14229 & -6325 & 16335 & 15051]);
                  }

                  NativeUnixSocket.setSocketOptionInt(var3, var1, -1 & -1);
                  return;
               }

               NativeUnixSocket.setSocketOptionInt(var3, var1, m(var2));
               return;
            case 4097:
            case 4098:
               NativeUnixSocket.setSocketOptionInt(var3, var1, m(var2));
               return;
            case 4102:
               this.dlH = m(var2);
               NativeUnixSocket.setSocketOptionInt(var3, -11641 & 4205, this.dlH);
               NativeUnixSocket.setSocketOptionInt(var3, 22534 & 12590, this.dlH);
               return;
            default:
               throw new SocketException(.p.q[-15539 & 5085 & -17187 & -21925] + var1);
            }
         } catch (SocketException var5) {
            throw var5;
         } catch (Exception var6) {
            throw (SocketException)(new SocketException(.p.q[13389 & 24830 & 27084 & 2380])).initCause(var6);
         }
      }
   }

   void kN(int var1) {
      this.dlw = ByteBuffer.allocateDirect(var1);
   }

   // $FF: synthetic method
   static FileDescriptor t(AFUNIXSocketImpl var0) {
      return var0.atp();
   }

   protected void sendUrgentData(int var1) {
      FileDescriptor var2 = this.atp();
      byte[] var10002 = new byte[651 & 19473];
      var10002[420 & 16384] = (byte)(var1 & 23807 & 255);
      NativeUnixSocket.write(this, var2, var10002, -32500 & 1536, 1119 & -15871, this.dlD);
   }
}
