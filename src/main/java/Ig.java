import com.google.common.base.Charsets;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufAllocator;
import io.netty.buffer.ByteBufInputStream;
import io.netty.buffer.ByteBufOutputStream;
import io.netty.buffer.ByteBufProcessor;
import io.netty.handler.codec.DecoderException;
import io.netty.handler.codec.EncoderException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.GatheringByteChannel;
import java.nio.channels.ScatteringByteChannel;
import java.nio.charset.Charset;
import java.util.UUID;

public class IG extends ByteBuf {
   private final ByteBuf bvH;

   public ByteBuf order(ByteOrder var1) {
      return this.bvH.order(var1);
   }

   public ByteBuf discardReadBytes() {
      return this.bvH.discardReadBytes();
   }

   public ByteBuf markReaderIndex() {
      return this.bvH.markReaderIndex();
   }

   public int forEachByte(ByteBufProcessor var1) {
      return this.bvH.forEachByte(var1);
   }

   public ByteOrder order() {
      return this.bvH.order();
   }

   public ByteBuf getBytes(int var1, OutputStream var2, int var3) {
      return this.bvH.getBytes(var1, var2, var3);
   }

   public IG bX(String var1) {
      byte[] var2 = var1.getBytes(Charsets.UTF_8);
      if (var2.length > 32767) {
         throw new EncoderException(i.q[-27678 & 9619] + var1.length() + i.q[1411 & 16871] + 32767 + w.q[4381 & 18685]);
      } else {
         this.fC(var2.length);
         this.writeBytes(var2);
         return this;
      }
   }

   public int capacity() {
      return this.bvH.capacity();
   }

   public ByteBuf writeBytes(ByteBuffer var1) {
      return this.bvH.writeBytes(var1);
   }

   public ByteBuf writeInt(int var1) {
      return this.bvH.writeInt(var1);
   }

   public ByteBuf setZero(int var1, int var2) {
      return this.bvH.setZero(var1, var2);
   }

   public int writerIndex() {
      return this.bvH.writerIndex();
   }

   public ByteBuf setBytes(int var1, byte[] var2) {
      return this.bvH.setBytes(var1, var2);
   }

   public ByteBuf setFloat(int var1, float var2) {
      return this.bvH.setFloat(var1, var2);
   }

   public ByteBuf readBytes(OutputStream var1, int var2) {
      return this.bvH.readBytes(var1, var2);
   }

   public boolean hasArray() {
      return this.bvH.hasArray();
   }

   public int setBytes(int var1, ScatteringByteChannel var2, int var3) {
      return this.bvH.setBytes(var1, var2, var3);
   }

   public float getFloat(int var1) {
      return this.bvH.getFloat(var1);
   }

   public ByteBuffer[] nioBuffers(int var1, int var2) {
      return this.bvH.nioBuffers(var1, var2);
   }

   public double readDouble() {
      return this.bvH.readDouble();
   }

   public void N(NW var1) {
      this.writeLong(var1.Vf());
   }

   public ByteBuf setByte(int var1, int var2) {
      return this.bvH.setByte(var1, var2);
   }

   public ByteBuf copy() {
      return this.bvH.copy();
   }

   public float readFloat() {
      return this.bvH.readFloat();
   }

   public String fB(int var1) {
      int var2 = this.Jk();
      if (var2 > var1 * 4) {
         throw new DecoderException(i.q[382 & 5503] + var2 + i.q[-29185 & 4991] + var1 * 4 + w.q[317 & 24223]);
      } else if (var2 < 0) {
         throw new DecoderException(i.q[3008 & -32380]);
      } else {
         String var3 = new String(this.readBytes(var2).array(), Charsets.UTF_8);
         if (var3.length() > var1) {
            throw new DecoderException(i.q[2433 & 4497] + var2 + i.q[16767 & 3967] + var1 + w.q[6205 & -15587]);
         } else {
            return var3;
         }
      }
   }

   public ByteBuf setBytes(int var1, ByteBuf var2, int var3, int var4) {
      return this.bvH.setBytes(var1, var2, var3, var4);
   }

   public short readShort() {
      return this.bvH.readShort();
   }

   public ByteBuf getBytes(int var1, ByteBuf var2) {
      return this.bvH.getBytes(var1, var2);
   }

   public int writeBytes(InputStream var1, int var2) {
      return this.bvH.writeBytes(var1, var2);
   }

   public ByteBuf markWriterIndex() {
      return this.bvH.markWriterIndex();
   }

   public ByteBuf readBytes(byte[] var1, int var2, int var3) {
      return this.bvH.readBytes(var1, var2, var3);
   }

   public int nioBufferCount() {
      return this.bvH.nioBufferCount();
   }

   public int readBytes(GatheringByteChannel var1, int var2) {
      return this.bvH.readBytes(var1, var2);
   }

   public byte[] array() {
      return this.bvH.array();
   }

   public long getLong(int var1) {
      return this.bvH.getLong(var1);
   }

   public IG(ByteBuf var1) {
      this.bvH = var1;
   }

   public ByteBuf readerIndex(int var1) {
      return this.bvH.readerIndex(var1);
   }

   public boolean equals(Object var1) {
      return this.bvH.equals(var1);
   }

   public void f(long var1) {
      while((var1 & -128L) != 0L) {
         this.writeByte((int)(var1 & 127L) | 128);
         var1 >>>= 7;
      }

      this.writeByte((int)var1);
   }

   public GX Je() {
      GX var1 = null;
      short var2 = this.readShort();
      if (var2 >= 0) {
         byte var3 = this.readByte();
         short var4 = this.readShort();
         var1 = new GX(Fm.fe(var2), var3, var4);
         var1.l(this.Ji());
      }

      return var1;
   }

   public int getUnsignedMedium(int var1) {
      return this.bvH.getUnsignedMedium(var1);
   }

   public ByteBuf getBytes(int var1, ByteBuf var2, int var3, int var4) {
      return this.bvH.getBytes(var1, var2, var3, var4);
   }

   public ByteBuf readSlice(int var1) {
      return this.bvH.readSlice(var1);
   }

   public int compareTo(ByteBuf var1) {
      return this.bvH.compareTo(var1);
   }

   public int readUnsignedMedium() {
      return this.bvH.readUnsignedMedium();
   }

   public int forEachByteDesc(ByteBufProcessor var1) {
      return this.bvH.forEachByteDesc(var1);
   }

   public ByteBuf capacity(int var1) {
      return this.bvH.capacity(var1);
   }

   public String toString(Charset var1) {
      return this.bvH.toString(var1);
   }

   public Enum y(Class var1) {
      return ((Enum[])((Enum[])var1.getEnumConstants()))[this.Jk()];
   }

   public ByteBuf writeBytes(ByteBuf var1, int var2, int var3) {
      return this.bvH.writeBytes(var1, var2, var3);
   }

   public int getMedium(int var1) {
      return this.bvH.getMedium(var1);
   }

   public String toString() {
      return this.bvH.toString();
   }

   public int bytesBefore(int var1, int var2, byte var3) {
      return this.bvH.bytesBefore(var1, var2, var3);
   }

   public boolean getBoolean(int var1) {
      return this.bvH.getBoolean(var1);
   }

   public ByteBuf writeMedium(int var1) {
      return this.bvH.writeMedium(var1);
   }

   public long readLong() {
      return this.bvH.readLong();
   }

   public void w(Enum var1) {
      this.fC(var1.ordinal());
   }

   public ByteBuf readBytes(ByteBuffer var1) {
      return this.bvH.readBytes(var1);
   }

   public ByteBuf setDouble(int var1, double var2) {
      return this.bvH.setDouble(var1, var2);
   }

   public ByteBuf readBytes(ByteBuf var1) {
      return this.bvH.readBytes(var1);
   }

   public char getChar(int var1) {
      return this.bvH.getChar(var1);
   }

   public byte readByte() {
      return this.bvH.readByte();
   }

   public char readChar() {
      return this.bvH.readChar();
   }

   public ByteBuf skipBytes(int var1) {
      return this.bvH.skipBytes(var1);
   }

   public int getInt(int var1) {
      return this.bvH.getInt(var1);
   }

   public ByteBuf slice(int var1, int var2) {
      return this.bvH.slice(var1, var2);
   }

   public int maxWritableBytes() {
      return this.bvH.maxWritableBytes();
   }

   public int hashCode() {
      return this.bvH.hashCode();
   }

   public int arrayOffset() {
      return this.bvH.arrayOffset();
   }

   public boolean isWritable() {
      return this.bvH.isWritable();
   }

   public void fC(int var1) {
      while((var1 & -128) != 0) {
         this.writeByte(var1 & 127 | 128);
         var1 >>>= 7;
      }

      this.writeByte(var1);
   }

   public static int fD(int var0) {
      for(int var1 = 1; var1 < 5; ++var1) {
         if ((var0 & -1 << var1 * 7) == 0) {
            return var1;
         }
      }

      return 5;
   }

   public ByteBuf writeLong(long var1) {
      return this.bvH.writeLong(var1);
   }

   public ByteBuf getBytes(int var1, byte[] var2) {
      return this.bvH.getBytes(var1, var2);
   }

   public long getUnsignedInt(int var1) {
      return this.bvH.getUnsignedInt(var1);
   }

   public ByteBuf getBytes(int var1, ByteBuf var2, int var3) {
      return this.bvH.getBytes(var1, var2, var3);
   }

   public short getShort(int var1) {
      return this.bvH.getShort(var1);
   }

   public boolean isReadable() {
      return this.bvH.isReadable();
   }

   public boolean release(int var1) {
      return this.bvH.release(var1);
   }

   public ByteBuf readBytes(byte[] var1) {
      return this.bvH.readBytes(var1);
   }

   public void y(UUID var1) {
      this.writeLong(var1.getMostSignificantBits());
      this.writeLong(var1.getLeastSignificantBits());
   }

   public ByteBuf unwrap() {
      return this.bvH.unwrap();
   }

   public NW Jf() {
      return NW.h(this.readLong());
   }

   public boolean isReadable(int var1) {
      return this.bvH.isReadable(var1);
   }

   public int maxCapacity() {
      return this.bvH.maxCapacity();
   }

   public int getBytes(int var1, GatheringByteChannel var2, int var3) {
      return this.bvH.getBytes(var1, var2, var3);
   }

   public ByteBuf resetWriterIndex() {
      return this.bvH.resetWriterIndex();
   }

   public ByteBuf writeBytes(ByteBuf var1) {
      return this.bvH.writeBytes(var1);
   }

   public ByteBuf retain(int var1) {
      return this.bvH.retain(var1);
   }

   public ByteBuffer nioBuffer(int var1, int var2) {
      return this.bvH.nioBuffer(var1, var2);
   }

   public boolean isWritable(int var1) {
      return this.bvH.isWritable(var1);
   }

   public boolean readBoolean() {
      return this.bvH.readBoolean();
   }

   public short readUnsignedByte() {
      return this.bvH.readUnsignedByte();
   }

   public ByteBuf retain() {
      return this.bvH.retain();
   }

   public ByteBuf discardSomeReadBytes() {
      return this.bvH.discardSomeReadBytes();
   }

   public int getUnsignedShort(int var1) {
      return this.bvH.getUnsignedShort(var1);
   }

   public ByteBuf writeChar(int var1) {
      return this.bvH.writeChar(var1);
   }

   public ByteBuffer internalNioBuffer(int var1, int var2) {
      return this.bvH.internalNioBuffer(var1, var2);
   }

   public int setBytes(int var1, InputStream var2, int var3) {
      return this.bvH.setBytes(var1, var2, var3);
   }

   public String toString(int var1, int var2, Charset var3) {
      return this.bvH.toString(var1, var2, var3);
   }

   public byte[] Jg() {
      byte[] var1 = new byte[this.Jk()];
      this.readBytes(var1);
      return var1;
   }

   public long memoryAddress() {
      return this.bvH.memoryAddress();
   }

   public OX Jh() {
      return OY.di(this.fB(32767));
   }

   public int readerIndex() {
      return this.bvH.readerIndex();
   }

   public int readUnsignedShort() {
      return this.bvH.readUnsignedShort();
   }

   public int readableBytes() {
      return this.bvH.readableBytes();
   }

   public ByteBuf writeBytes(ByteBuf var1, int var2) {
      return this.bvH.writeBytes(var1, var2);
   }

   public int forEachByteDesc(int var1, int var2, ByteBufProcessor var3) {
      return this.bvH.forEachByteDesc(var1, var2, var3);
   }

   public ByteBuf setShort(int var1, int var2) {
      return this.bvH.setShort(var1, var2);
   }

   public ByteBufAllocator alloc() {
      return this.bvH.alloc();
   }

   public int ensureWritable(int var1, boolean var2) {
      return this.bvH.ensureWritable(var1, var2);
   }

   public ByteBuf writeBytes(byte[] var1, int var2, int var3) {
      return this.bvH.writeBytes(var1, var2, var3);
   }

   public HL Ji() {
      int var1 = this.readerIndex();
      byte var2 = this.readByte();
      if (var2 == 0) {
         return null;
      } else {
         this.readerIndex(var1);
         return Hy.q(new ByteBufInputStream(this), new HH(2097152L));
      }
   }

   public ByteBuf setIndex(int var1, int var2) {
      return this.bvH.setIndex(var1, var2);
   }

   public ByteBuf resetReaderIndex() {
      return this.bvH.resetReaderIndex();
   }

   public int bytesBefore(int var1, byte var2) {
      return this.bvH.bytesBefore(var1, var2);
   }

   public ByteBuf setBytes(int var1, ByteBuffer var2) {
      return this.bvH.setBytes(var1, var2);
   }

   public long Jj() {
      long var1 = 0L;
      int var3 = 0;

      while(true) {
         byte var4 = this.readByte();
         var1 |= (long)(var4 & 127) << var3++ * 7;
         if (var3 > 10) {
            throw new RuntimeException(i.q[-30851 & 14717]);
         }

         if ((var4 & 128) != 128) {
            break;
         }
      }

      return var1;
   }

   public boolean hasMemoryAddress() {
      return this.bvH.hasMemoryAddress();
   }

   public void a(OX var1) {
      this.bX(OY.j(var1));
   }

   public ByteBuf writerIndex(int var1) {
      return this.bvH.writerIndex(var1);
   }

   public void ao(GX var1) {
      if (var1 == null) {
         this.writeShort(-1);
      } else {
         this.writeShort(Fm.s(var1.do1()));
         this.writeByte(var1.bsH);
         this.writeShort(var1.dm());
         HL var2 = null;
         if (var1.do1().Hv() || var1.do1().Hq()) {
            var2 = var1.Ie();
         }

         this.m(var2);
      }

   }

   public ByteBuf writeShort(int var1) {
      return this.bvH.writeShort(var1);
   }

   public int Jk() {
      int var1 = 0;
      int var2 = 0;

      while(true) {
         byte var3 = this.readByte();
         var1 |= (var3 & 127) << var2++ * 7;
         if (var2 > 5) {
            throw new RuntimeException(i.q[2430 & -32260]);
         }

         if ((var3 & 128) != 128) {
            break;
         }
      }

      return var1;
   }

   public ByteBuffer[] nioBuffers() {
      return this.bvH.nioBuffers();
   }

   public ByteBuf copy(int var1, int var2) {
      return this.bvH.copy(var1, var2);
   }

   public ByteBuf clear() {
      return this.bvH.clear();
   }

   public byte getByte(int var1) {
      return this.bvH.getByte(var1);
   }

   public ByteBuf readBytes(ByteBuf var1, int var2, int var3) {
      return this.bvH.readBytes(var1, var2, var3);
   }

   public ByteBuf writeFloat(float var1) {
      return this.bvH.writeFloat(var1);
   }

   public void w(byte[] var1) {
      this.fC(var1.length);
      this.writeBytes(var1);
   }

   public ByteBuf setMedium(int var1, int var2) {
      return this.bvH.setMedium(var1, var2);
   }

   public ByteBuf setBytes(int var1, ByteBuf var2, int var3) {
      return this.bvH.setBytes(var1, var2, var3);
   }

   public short getUnsignedByte(int var1) {
      return this.bvH.getUnsignedByte(var1);
   }

   public ByteBuf setInt(int var1, int var2) {
      return this.bvH.setInt(var1, var2);
   }

   public int bytesBefore(byte var1) {
      return this.bvH.bytesBefore(var1);
   }

   public int readInt() {
      return this.bvH.readInt();
   }

   public ByteBuffer nioBuffer() {
      return this.bvH.nioBuffer();
   }

   public ByteBuf setBoolean(int var1, boolean var2) {
      return this.bvH.setBoolean(var1, var2);
   }

   public double getDouble(int var1) {
      return this.bvH.getDouble(var1);
   }

   public ByteBuf setBytes(int var1, ByteBuf var2) {
      return this.bvH.setBytes(var1, var2);
   }

   public ByteBuf writeBoolean(boolean var1) {
      return this.bvH.writeBoolean(var1);
   }

   public ByteBuf writeZero(int var1) {
      return this.bvH.writeZero(var1);
   }

   public ByteBuf duplicate() {
      return this.bvH.duplicate();
   }

   public boolean release() {
      return this.bvH.release();
   }

   public ByteBuf slice() {
      return this.bvH.slice();
   }

   public ByteBuf readBytes(int var1) {
      return this.bvH.readBytes(var1);
   }

   public long readUnsignedInt() {
      return this.bvH.readUnsignedInt();
   }

   public int forEachByte(int var1, int var2, ByteBufProcessor var3) {
      return this.bvH.forEachByte(var1, var2, var3);
   }

   public int writeBytes(ScatteringByteChannel var1, int var2) {
      return this.bvH.writeBytes(var1, var2);
   }

   public ByteBuf getBytes(int var1, byte[] var2, int var3, int var4) {
      return this.bvH.getBytes(var1, var2, var3, var4);
   }

   public int refCnt() {
      return this.bvH.refCnt();
   }

   public int writableBytes() {
      return this.bvH.writableBytes();
   }

   public ByteBuf ensureWritable(int var1) {
      return this.bvH.ensureWritable(var1);
   }

   public UUID Jl() {
      return new UUID(this.readLong(), this.readLong());
   }

   public ByteBuf setLong(int var1, long var2) {
      return this.bvH.setLong(var1, var2);
   }

   public boolean isDirect() {
      return this.bvH.isDirect();
   }

   public ByteBuf writeBytes(byte[] var1) {
      return this.bvH.writeBytes(var1);
   }

   public ByteBuf readBytes(ByteBuf var1, int var2) {
      return this.bvH.readBytes(var1, var2);
   }

   public ByteBuf writeByte(int var1) {
      return this.bvH.writeByte(var1);
   }

   public int indexOf(int var1, int var2, byte var3) {
      return this.bvH.indexOf(var1, var2, var3);
   }

   public int readMedium() {
      return this.bvH.readMedium();
   }

   public ByteBuf setChar(int var1, int var2) {
      return this.bvH.setChar(var1, var2);
   }

   public ByteBuf setBytes(int var1, byte[] var2, int var3, int var4) {
      return this.bvH.setBytes(var1, var2, var3, var4);
   }

   public ByteBuf getBytes(int var1, ByteBuffer var2) {
      return this.bvH.getBytes(var1, var2);
   }

   public ByteBuf writeDouble(double var1) {
      return this.bvH.writeDouble(var1);
   }

   public void m(HL var1) {
      if (var1 == null) {
         this.writeByte(0);
      } else {
         try {
            Hy.q(var1, new ByteBufOutputStream(this));
         } catch (IOException var3) {
            throw new EncoderException(var3);
         }
      }

   }
}
