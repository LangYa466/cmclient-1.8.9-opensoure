package org.newsclub.net.unix;

import java.io.File;
import java.net.InetSocketAddress;
import java.net.SocketException;
import java.nio.charset.Charset;
import java.util.Locale;

public final class AFUNIXSocketAddress extends InetSocketAddress {
   private final byte[] dlc;
   private static final long dld = 1L;

   byte[] atf() {
      return this.dlc;
   }

   public String toString() {
      return this.getClass().getName() + .o.q[5238 & 21111 & -15499 & -11651] + this.getPort() + .o.q[18549 & 25461 & 13823 & -19081] + f(this.dlc) + .q.q[-27748 & -21540 & 24575 & 18430];
   }

   public AFUNIXSocketAddress(File var1, int var2) {
      this(var1.getCanonicalPath().getBytes(Charset.defaultCharset()), var2);
   }

   private static String f(byte[] var0) {
      StringBuilder var1 = new StringBuilder(var0.length + (19 & 24));
      byte[] var2 = var0;
      int var3 = var0.length;

      for(int var4 = -26543 & 1026; var4 < var3; ++var4) {
         byte var5 = var2[var4];
         if (var5 >= (2169 & -31966) && var5 < (5247 & -16129)) {
            var1.append((char)var5);
         } else {
            var1.append(.o.q[5235 & 30323 & 28790 & 27255]);
            Locale var10001 = Locale.ENGLISH;
            String var10002 = .o.q[1407 & 3187 & 20991 & 21499];
            Object[] var10003 = new Object[2127 & 17409];
            var10003[5954 & 2065] = var5;
            var1.append(String.format(var10001, var10002, var10003));
         }
      }

      return var1.toString();
   }

   public AFUNIXSocketAddress(byte[] var1) {
      this(var1, 640 & 28704);
   }

   public static AFUNIXSocketAddress hw(String var0) {
      return D(var0, -4080 & 132);
   }

   public AFUNIXSocketAddress(byte[] var1, int var2) {
      super(5728 & 10368);
      if (var2 != 0) {
         NativeUnixSocket.q(this, var2);
      }

      if (var1.length == 0) {
         throw new SocketException(.o.q[3067 & 3067 & 6261 & -7943] + var1.length);
      } else {
         this.dlc = (byte[])var1.clone();
      }
   }

   public AFUNIXSocketAddress(File var1) {
      this(var1, -32512 & 2049);
   }

   public static AFUNIXSocketAddress D(String var0, int var1) {
      byte[] var2 = var0.getBytes(Charset.defaultCharset());
      byte[] var3 = new byte[var2.length + (4625 & 25705)];
      System.arraycopy(var2, 9252 & 2313, var3, 20993 & 2085, var2.length);
      return new AFUNIXSocketAddress(var3, var1);
   }
}
