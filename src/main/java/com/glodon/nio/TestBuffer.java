package com.glodon.nio;

import org.junit.Test;

import java.nio.ByteBuffer;

/**
 * @author ：renc
 * @date ：Created in 2019/6/21 15:39
 * @description：nio缓冲区学习
 *
    ByteBuffer
    CharBuffer
    DoubleBuffer
    FloatBuffer
    IntBuffer
    LongBuffer
    ShortBuffer

 */
public class TestBuffer {


    /**
     * capacity 缓存区的容量
     * limit 界限，limit之后的数据不能操作
     * position 表示正在操作的位置
     */
    @Test
    public void tesrBuffer(){
        ByteBuffer byteBuffer = ByteBuffer.allocate(10);
        System.err.println("*********************");
        System.err.println("capacity"+byteBuffer.capacity());
        System.err.println("limit"+byteBuffer.limit());
        System.err.println("position"+byteBuffer.position());
        byteBuffer.put("123456".getBytes());
        System.err.println("*********************");
        System.err.println("capacity"+byteBuffer.capacity());
        System.err.println("limit"+byteBuffer.limit());
        System.err.println("position"+byteBuffer.position());
        byteBuffer.flip();
        System.err.println("*********************");
        System.err.println("capacity"+byteBuffer.capacity());
        System.err.println("limit"+byteBuffer.limit());
        System.err.println("position"+byteBuffer.position());
        byte[] a = new byte[2];
        byteBuffer.get(a);
        System.out.println(new String(a,0,2));
        System.err.println("*********************");
        System.err.println("capacity"+byteBuffer.capacity());
        System.err.println("limit"+byteBuffer.limit());
        System.err.println("position"+byteBuffer.position());
    }
}
