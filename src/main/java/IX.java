import com.google.common.collect.Lists;
import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.epoll.Epoll;
import io.netty.channel.epoll.EpollServerSocketChannel;
import io.netty.channel.local.LocalAddress;
import io.netty.channel.local.LocalServerChannel;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import java.net.InetAddress;
import java.net.SocketAddress;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Ix {
   public volatile boolean bvs;
   public static final Pl bvt = new IA();
   public static final Pl bvu = new Iz();
   private final List bvv = Collections.synchronizedList(Lists.newArrayList());
   private final List bvw = Collections.synchronizedList(Lists.newArrayList());
   private static final Logger bvx = LogManager.getLogger();
   private final Md bvy;
   public static final Pl bvz = new Iy();

   public Ix(Md var1) {
      this.bvy = var1;
      this.bvs = true;
   }

   public SocketAddress Ja() {
      ChannelFuture var1;
      synchronized(this.bvv) {
         var1 = ((ServerBootstrap)((ServerBootstrap)(new ServerBootstrap()).channel(LocalServerChannel.class)).childHandler(new IC(this)).group((EventLoopGroup)bvz.ad()).localAddress(LocalAddress.ANY)).bind().syncUninterruptibly();
         this.bvv.add(var1);
      }

      return var1.channel().localAddress();
   }

   // $FF: synthetic method
   static Md q(Ix var0) {
      return var0.bvy;
   }

   public void Jb() {
      synchronized(this.bvw) {
         Iterator var2 = this.bvw.iterator();

         while(var2.hasNext()) {
            Ip var3 = (Ip)var2.next();
            if (!var3.IL()) {
               if (!var3.IQ()) {
                  var2.remove();
                  var3.IT();
               } else {
                  try {
                     var3.IM();
                  } catch (Exception var8) {
                     if (var3.IO()) {
                        xW var10 = xW.q(var8, o.q[672 & 2040]);
                        ye var6 = var10.bd(o.q[31409 & 675]);
                        var6.q(w.q[9167 & 3055], new ID(this, var3));
                        throw new PI(var10);
                     }

                     bvx.warn(o.q[2739 & 674] + var3.IN(), var8);
                     Oo var5 = new Oo(o.q[-15629 & 683]);
                     var3.q(new Lc(var5), new IE(this, var3, var5));
                     var3.IP();
                  }
               }
            }
         }

      }
   }

   // $FF: synthetic method
   static List w(Ix var0) {
      return var0.bvw;
   }

   public void q(InetAddress var1, int var2) {
      synchronized(this.bvv) {
         Class var4;
         Pl var5;
         if (Epoll.isAvailable() && this.bvy.Pg()) {
            var4 = EpollServerSocketChannel.class;
            var5 = bvu;
            bvx.info(o.q[-23907 & 18333]);
         } else {
            var4 = NioServerSocketChannel.class;
            var5 = bvz;
            bvx.info(o.q[-29794 & 1726]);
         }

         this.bvv.add(((ServerBootstrap)((ServerBootstrap)(new ServerBootstrap()).channel(var4)).childHandler(new IB(this)).group((EventLoopGroup)var5.ad()).localAddress(var1, var2)).bind().syncUninterruptibly());
      }
   }

   public Md Jc() {
      return this.bvy;
   }

   public void Jd() {
      this.bvs = false;

      for(ChannelFuture var2 : this.bvv) {
         try {
            var2.channel().close().sync();
         } catch (InterruptedException var4) {
            bvx.error(o.q[767 & -29025]);
         }
      }

   }
}
