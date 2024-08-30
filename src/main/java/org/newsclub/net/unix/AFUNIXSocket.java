package org.newsclub.net.unix;

import java.io.FileDescriptor;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.SocketException;

public final class AFUNIXSocket extends Socket {
   AFUNIXSocketAddress dkX;
   private static Integer dkY = null;
   private final org.newsclub.net.unix.w dkZ;
   AFUNIXSocketImpl dla;
   static String dlb;

   public void bind(SocketAddress var1) {
      super.bind(var1);
      this.dkX = (AFUNIXSocketAddress)var1;
   }

   public static AFUNIXSocket asW() {
      AFUNIXSocketImpl var0 = new AFUNIXSocketImpl();
      AFUNIXSocket var1 = new AFUNIXSocket(var0, (org.newsclub.net.unix.w)null);
      var1.dla = var0;
      return var1;
   }

   public static boolean q(org.newsclub.net.unix.q var0) {
      return (boolean)((ata() & var0.atg()) != 0 ? 4097 & 25609 : -28594 & 24577);
   }

   public static AFUNIXSocket w(AFUNIXSocketAddress var0) {
      AFUNIXSocket var1 = ate();
      var1.connect(var0);
      return var1;
   }

   private void asX() {
      try {
         NativeUnixSocket.setCreated(this);
      } catch (LinkageError var2) {
         throw new IOException(.e.q[-12289 & -28737 & -26689 & 25407], var2);
      }
   }

   public void q(FileDescriptor... var1) {
      if (var1 != null && var1.length != 0) {
         int[] var2 = new int[var1.length];
         int var3 = 416 & 1;

         for(int var4 = var1.length; var3 < var4; ++var3) {
            FileDescriptor var5 = var1[var3];
            var2[var3] = NativeUnixSocket.getFD(var5);
         }

         this.dla.c(var2);
      } else {
         this.dla.c((int[])null);
      }

   }

   public void asY() {
      this.dla.asY();
   }

   public static String asZ() {
      return dlb;
   }

   public void kN(int var1) {
      this.dla.kN(var1);
   }

   static AFUNIXSocket q(org.newsclub.net.unix.w var0) {
      org.newsclub.net.unix.a var1 = new org.newsclub.net.unix.a();
      AFUNIXSocket var2 = new AFUNIXSocket(var1, var0);
      var2.dla = var1;
      return var2;
   }

   public String toString() {
      return this.isConnected() ? .e.q[3922 & -18478 & -5141 & 19279] + this.dla.atq() + .e.q[-14525 & 25539 & 21443 & 14315] + this.dkX.toString() + .q.q[-18468 & -22532 & 11196 & 4092] : .e.q[-30875 & -15545 & -24620 & 5956];
   }

   public boolean isClosed() {
      return (boolean)(!super.isClosed() && (!this.isConnected() || this.dla.atq().valid()) ? -28576 & 2 : 16805 & 25);
   }

   public void connect(SocketAddress var1, int var2) {
      if (!(var1 instanceof AFUNIXSocketAddress)) {
         if (this.dkZ != null && var1 instanceof InetSocketAddress) {
            InetSocketAddress var3 = (InetSocketAddress)var1;
            String var4 = var3.getHostString();
            if (this.dkZ.hy(var4)) {
               var1 = this.dkZ.E(var4, var3.getPort());
            }
         }

         if (!(var1 instanceof AFUNIXSocketAddress)) {
            throw new IllegalArgumentException(.e.q[21451 & -14518 & 15325 & -24763] + AFUNIXSocketAddress.class.getName() + .e.q[18377 & 3039 & -18581 & -18601] + var1);
         }
      }

      this.dla.connect((SocketAddress)var1, var2);
      this.dkX = (AFUNIXSocketAddress)var1;
      NativeUnixSocket.setBound(this);
      NativeUnixSocket.setConnected(this);
   }

   private static synchronized int ata() {
      if (dkY == null) {
         if (!asV()) {
            dkY = 4120 & 256;
         } else {
            dkY = NativeUnixSocket.capabilities();
         }
      }

      return dkY.intValue();
   }

   public AFUNIXSocketCredentials atb() {
      if (!this.isClosed() && this.isConnected()) {
         return this.dla.atb();
      } else {
         throw new SocketException(.e.q[-13483 & -5275 & 5087 & 2013]);
      }
   }

   public int atc() {
      return this.dla.atc();
   }

   public FileDescriptor[] atd() {
      return this.dla.atd();
   }

   public void connect(SocketAddress var1) {
      this.connect(var1, 1224 & 18691);
   }

   public static AFUNIXSocket ate() {
      return q((org.newsclub.net.unix.w)null);
   }

   public static boolean asV() {
      return NativeUnixSocket.abR();
   }

   private AFUNIXSocket(AFUNIXSocketImpl var1, org.newsclub.net.unix.w var2) {
      super(var1);
      this.dkZ = var2;
      if (var2 == null) {
         this.asX();
      }

   }
}
