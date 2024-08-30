import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.InvocationTargetException;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Socket;
import java.net.URI;
import java.nio.ByteBuffer;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;
import java.util.Map.Entry;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

public abstract class aba extends aaL implements aaS, Runnable {
   private Proxy CC;
   private Socket czM;
   private OutputStream cZb;
   private aaV cZc;
   private Thread cZd;
   private SocketFactory cZe;
   private int cZf;
   private Thread cZg;
   private Map czt;
   private abd cYR;
   private CountDownLatch cZh;
   protected URI cZi;
   private CountDownLatch cZj;
   private aaZ cZk;

   public aba(URI var1, Map var2) {
      this(var1, new abe(), var2);
   }

   public abstract void r(int var1, String var2, boolean var3);

   public void q(abF var1) {
      this.cZc.q(var1);
   }

   public abV anG() {
      return this.cZc.anG();
   }

   public void q(aaS var1, int var2, String var3) {
      this.h(var2, var3);
   }

   public boolean anE() {
      return this.cZc.anE();
   }

   // $FF: synthetic method
   static OutputStream q(aba var0) {
      return var0.cZb;
   }

   private void pK() {
      Thread var1 = Thread.currentThread();
      if (var1 != this.cZg && var1 != this.cZd) {
         try {
            if (this.cZc.any() == abj.cZZ && this.czM != null) {
               this.czM.close();
            }

            this.anY();
            if (this.cZg != null) {
               this.cZg.interrupt();
               this.cZg.join();
               this.cZg = null;
            }

            if (this.cZd != null) {
               this.cZd.interrupt();
               this.cZd.join();
               this.cZd = null;
            }

            this.cYR.pK();
            if (this.czM != null) {
               this.czM.close();
               this.czM = null;
            }
         } catch (Exception var3) {
            this.r(var3);
            this.cZc.g(1006 & -31761, var3.getMessage());
            return;
         }

         this.cZj = new CountDownLatch(15399 & -32255);
         this.cZh = new CountDownLatch(9041 & -31711);
         this.cZc = new aaV(this, this.cYR);
      } else {
         throw new IllegalStateException(o.q[-20482 & 18431 & -5197 & 27569]);
      }
   }

   public boolean anP() {
      this.connect();
      this.cZj.await();
      return this.cZc.isOpen();
   }

   public String anH() {
      return this.cZi.getPath();
   }

   public boolean anw() {
      return this.cZc.anw();
   }

   private void q(IOException var1) {
      if (var1 instanceof SSLException) {
         this.r(var1);
      }

      this.cZc.anO();
   }

   public void jO(int var1) {
      this.cZc.jO(var1);
   }

   public InetSocketAddress anz() {
      return this.cZc.anz();
   }

   // $FF: synthetic method
   static void q(aba var0, IOException var1) {
      var0.q(var1);
   }

   public boolean anQ() {
      this.pK();
      return this.anP();
   }

   public URI anR() {
      return this.cZi;
   }

   public void g(int var1, String var2) {
      this.cZc.g(var1, var2);
   }

   public void anF() {
      this.cZc.anF();
   }

   public aba(URI var1) {
      this(var1, new abe());
   }

   private boolean anS() {
      int var1 = 21504 & 66;
      if (this.CC != Proxy.NO_PROXY) {
         this.czM = new Socket(this.CC);
         var1 = 65 & 18317;
      } else if (this.cZe != null) {
         this.czM = this.cZe.createSocket();
      } else if (this.czM == null) {
         this.czM = new Socket(this.CC);
         var1 = 19525 & -27863;
      } else if (this.czM.isClosed()) {
         throw new IOException();
      }

      return (boolean)var1;
   }

   public void close() {
      if (this.cZg != null) {
         this.cZc.jO(10232 & -13331);
      }

   }

   public void f(int var1, String var2) {
      this.cZc.f(var1, var2);
   }

   public void q(abi var1, ByteBuffer var2, boolean var3) {
      this.cZc.q(var1, var2, var3);
   }

   protected Collection amY() {
      return Collections.singletonList(this.cZc);
   }

   public void t(byte[] var1) {
      this.cZc.t(var1);
   }

   public boolean isClosed() {
      return this.cZc.isClosed();
   }

   public abstract void r(Exception var1);

   public SSLSession anC() {
      if (!this.anx()) {
         throw new IllegalArgumentException(u.q[-17187 & -23073 & -5921 & 16860]);
      } else {
         return ((SSLSocket)this.czM).getSession();
      }
   }

   public boolean anx() {
      return this.czM instanceof SSLSocket;
   }

   public final void w(aaS var1, int var2, String var3, boolean var4) {
      this.anc();
      if (this.cZg != null) {
         this.cZg.interrupt();
      }

      this.r(var2, var3, var4);
      this.cZj.countDown();
      this.cZh.countDown();
   }

   public final void q(aaS var1, String var2) {
      this.gV(var2);
   }

   public void p(Collection var1) {
      this.cZc.p(var1);
   }

   public final void q(aaS var1, ByteBuffer var2) {
      this.d(var2);
   }

   public void n(Object var1) {
      this.cZc.n(var1);
   }

   public void anT() {
      this.pK();
      this.connect();
   }

   public final void q(aaS var1, Exception var2) {
      this.r(var2);
   }

   public boolean isOpen() {
      return this.cZc.isOpen();
   }

   public aba(URI var1, abd var2, Map var3, int var4) {
      this.cZi = null;
      this.cZc = null;
      this.czM = null;
      this.cZe = null;
      this.CC = Proxy.NO_PROXY;
      this.cZj = new CountDownLatch(4869 & 19561);
      this.cZh = new CountDownLatch(7757 & 8193);
      this.cZf = 1090 & 128;
      this.cZk = null;
      if (var1 == null) {
         throw new IllegalArgumentException();
      } else if (var2 == null) {
         throw new IllegalArgumentException(o.q[25519 & 25519 & -26625 & 16367]);
      } else {
         this.cZi = var1;
         this.cYR = var2;
         this.cZk = new abb(this);
         if (var3 != null) {
            this.czt = new TreeMap(String.CASE_INSENSITIVE_ORDER);
            this.czt.putAll(var3);
         }

         this.cZf = var4;
         this.cw((boolean)(9027 & 28));
         this.cv((boolean)(3212 & 768));
         this.cZc = new aaV(this, var2);
      }
   }

   public void d(ByteBuffer var1) {
   }

   public void t(int var1, String var2, boolean var3) {
   }

   public final void e(aaS var1) {
   }

   private void anU() {
      String var2 = this.cZi.getRawPath();
      String var3 = this.cZi.getRawQuery();
      String var1;
      if (var2 != null && var2.length() != 0) {
         var1 = var2;
      } else {
         var1 = q.q[-31649 & 607 & -17025 & -19073];
      }

      if (var3 != null) {
         var1 = var1 + ('¿' & 'ⅿ') + var3;
      }

      int var4 = this.lG();
      String var5 = this.cZi.getHost() + (var4 != (2000 & 16473) && var4 != (25023 & -32325) ? w.q[18171 & 11002 & -25097 & -10633] + var4 : q.q[-25744 & -31912 & 15522 & 6374]);
      abO var6 = new abO();
      var6.hc(var1);
      var6.W(w.q[-5153 & -21537 & -18433 & 5100], var5);
      if (this.czt != null) {
         for(Entry var8 : this.czt.entrySet()) {
            var6.W((String)var8.getKey(), (String)var8.getValue());
         }
      }

      this.cZc.q((abM)var6);
   }

   public void i(ByteBuffer var1) {
      this.cZc.i(var1);
   }

   public void connect() {
      if (this.cZd != null) {
         throw new IllegalStateException(o.q[4089 & 20401 & 4031 & 5055]);
      } else {
         this.cZd = new Thread(this);
         this.cZd.setDaemon(this.amV());
         this.cZd.setName(o.q[24562 & 31739 & 2042 & 1979] + this.cZd.getId());
         this.cZd.start();
      }
   }

   public Object anv() {
      return this.cZc.anv();
   }

   private int lG() {
      int var1 = this.cZi.getPort();
      String var2 = this.cZi.getScheme();
      if (o.q[22463 & -26697 & -1029 & 4091].equals(var2)) {
         return var1 == (-1 & -1) ? 2491 & 5115 : var1;
      } else if (o.q[8191 & 13245 & -5195 & -7241].equals(var2)) {
         return var1 == (-1 & -1) ? 5205 & 464 : var1;
      } else {
         throw new IllegalArgumentException(o.q[17406 & 17406 & -28745 & -25673] + var2);
      }
   }

   public boolean anA() {
      return this.cZc.anA();
   }

   // $FF: synthetic method
   static aaV w(aba var0) {
      return var0.cZc;
   }

   public void V(String var1, String var2) {
      if (this.czt == null) {
         this.czt = new TreeMap(String.CASE_INSENSITIVE_ORDER);
      }

      this.czt.put(var1, var2);
   }

   public InetSocketAddress w(aaS var1) {
      return this.czM != null ? (InetSocketAddress)this.czM.getRemoteSocketAddress() : null;
   }

   public void run() {
      InputStream var1;
      try {
         boolean var2 = this.anS();
         this.czM.setTcpNoDelay(this.and());
         this.czM.setReuseAddress(this.ane());
         int var12 = this.amW();
         if (var12 > 0) {
            this.czM.setReceiveBufferSize(var12);
         }

         if (!this.czM.isConnected()) {
            InetSocketAddress var4 = this.cZk == null ? InetSocketAddress.createUnresolved(this.cZi.getHost(), this.lG()) : new InetSocketAddress(this.cZk.e(this.cZi), this.lG());
            this.czM.connect(var4, this.cZf);
         }

         if (var2 && o.q[19379 & 7103 & 29691 & 14267].equals(this.cZi.getScheme())) {
            this.anW();
         }

         if (this.czM instanceof SSLSocket) {
            SSLSocket var14 = (SSLSocket)this.czM;
            SSLParameters var5 = var14.getSSLParameters();
            this.q(var5);
            var14.setSSLParameters(var5);
         }

         var1 = this.czM.getInputStream();
         this.cZb = this.czM.getOutputStream();
         this.anU();
      } catch (Exception var9) {
         this.q(this.cZc, var9);
         this.cZc.g(-1 & -1, var9.getMessage());
         return;
      } catch (InternalError var10) {
         if (var10.getCause() instanceof InvocationTargetException && var10.getCause().getCause() instanceof IOException) {
            IOException var3 = (IOException)var10.getCause().getCause();
            this.q(this.cZc, var3);
            this.cZc.g(-1 & -1, var3.getMessage());
            return;
         }

         throw var10;
      }

      if (this.cZg != null) {
         this.cZg.interrupt();

         try {
            this.cZg.join();
         } catch (InterruptedException var6) {
            ;
         }
      }

      this.cZg = new Thread(new abc(this, this));
      this.cZg.setDaemon(this.amV());
      this.cZg.start();
      int var11 = this.amW();
      byte[] var13 = new byte[var11 > 0 ? var11 : cYb];

      try {
         int var15;
         while(!this.anA() && !this.isClosed() && (var15 = var1.read(var13)) != (-1 & -1)) {
            this.cZc.o(ByteBuffer.wrap(var13, 17664 & -24063, var15));
         }

         this.cZc.anO();
      } catch (IOException var7) {
         this.q(var7);
      } catch (RuntimeException var8) {
         this.r(var8);
         this.cZc.g(5102 & 2030, var8.getMessage());
      }

   }

   public abstract void q(abS var1);

   public aaS anV() {
      return this.cZc;
   }

   public void h(int var1, String var2) {
   }

   public InetSocketAddress r(aaS var1) {
      return this.czM != null ? (InetSocketAddress)this.czM.getLocalSocketAddress() : null;
   }

   private void anW() {
      SSLSocketFactory var1;
      if (this.cZe instanceof SSLSocketFactory) {
         var1 = (SSLSocketFactory)this.cZe;
      } else {
         var1 = (SSLSocketFactory)SSLSocketFactory.getDefault();
      }

      this.czM = var1.createSocket(this.czM, this.cZi.getHost(), this.lG(), (boolean)(67 & 16777));
   }

   public String gU(String var1) {
      return this.czt == null ? null : (String)this.czt.remove(var1);
   }

   public aba(URI var1, abd var2, Map var3) {
      this(var1, var2, var3, -32000 & 225);
   }

   public abd anD() {
      return this.cYR;
   }

   public InetSocketAddress anB() {
      return this.cZc.anB();
   }

   public Socket anX() {
      return this.czM;
   }

   public void q(SocketFactory var1) {
      this.cZe = var1;
   }

   public void q(Proxy var1) {
      if (var1 == null) {
         throw new IllegalArgumentException();
      } else {
         this.CC = var1;
      }
   }

   public boolean q(long var1, TimeUnit var3) {
      this.connect();
      boolean var4 = this.cZj.await(var1, var3);
      if (!var4) {
         this.pK();
      }

      return (boolean)(var4 && this.cZc.isOpen() ? -30719 & 4119 : 24612 & 4480);
   }

   public void q(Socket var1) {
      if (this.czM != null) {
         throw new IllegalStateException(o.q[-3137 & 1983 & 20407 & 27583]);
      } else {
         this.czM = var1;
      }
   }

   public void gT(String var1) {
      this.cZc.gT(var1);
   }

   public final void q(aaS var1, abQ var2) {
      this.ana();
      this.q((abS)var2);
      this.cZj.countDown();
   }

   public aba(URI var1, abd var2) {
      this(var1, var2, (Map)null, 5540 & 27211);
   }

   public void q(aaS var1, int var2, String var3, boolean var4) {
      this.t(var2, var3, var4);
   }

   public abj any() {
      return this.cZc.any();
   }

   // $FF: synthetic method
   static Socket e(aba var0) {
      return var0.czM;
   }

   protected void q(SSLParameters var1) {
      var1.setEndpointIdentificationAlgorithm(o.q[-7241 & 949 & -16395 & -28684]);
   }

   public abstract void gV(String var1);

   public void anY() {
      this.close();
      this.cZh.await();
   }

   public void q(aaZ var1) {
      this.cZk = var1;
   }

   public void anZ() {
      this.czt = null;
   }
}
