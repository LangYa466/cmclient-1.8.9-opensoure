import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;
import javax.crypto.Cipher;

public class In extends MessageToByteEncoder {
   private final Io buP;

   public In(Cipher var1) {
      this.buP = new Io(var1);
   }

   protected void q(ChannelHandlerContext var1, ByteBuf var2, ByteBuf var3) {
      this.buP.q(var2, var3);
   }

   // $FF: synthetic method
   protected void encode(ChannelHandlerContext var1, Object var2, ByteBuf var3) {
      this.q(var1, (ByteBuf)var2, var3);
   }
}
