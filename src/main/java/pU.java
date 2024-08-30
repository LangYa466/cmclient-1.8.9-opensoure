import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;
import java.io.IOException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.Marker;
import org.apache.logging.log4j.MarkerManager;

public class Pu extends MessageToByteEncoder {
   private static final Marker bTu = MarkerManager.getMarker(a.q[-32682 & 17334], Ip.bvc);
   private static final Logger bTv = LogManager.getLogger();
   private final Id bTw;

   protected void q(ChannelHandlerContext var1, IF var2, ByteBuf var3) {
      Integer var4 = ((HY)var1.channel().attr(Ip.bve).get()).q(this.bTw, var2);
      if (bTv.isDebugEnabled()) {
         bTv.debug(bTu, a.q[-14308 & 180], new Object[]{var1.channel().attr(Ip.bve).get(), var4, var2.getClass().getName()});
      }

      if (var4 == null) {
         throw new IOException(a.q[-32163 & 183]);
      } else {
         IG var5 = new IG(var3);
         var5.fC(var4.intValue());

         try {
            var2.r(var5);
         } catch (Throwable var7) {
            bTv.error(var7);
         }

      }
   }

   // $FF: synthetic method
   protected void encode(ChannelHandlerContext var1, Object var2, ByteBuf var3) {
      this.q(var1, (IF)var2, var3);
   }

   public Pu(Id var1) {
      this.bTw = var1;
   }
}
