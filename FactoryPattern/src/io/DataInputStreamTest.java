package io;

import java.io.*;

/**
 * @Author 空白
 * @Date 2021/9/6 21:43
 * @Version 1.0
 */
public class DataInputStreamTest {
    public static void main(String[] args) throws Exception {
        DataOutputStream do1 = new DataOutputStream(new FileOutputStream("dataTest"));
        do1.writeInt(123);
        do1.writeByte(123);
        do1.writeShort(12);
        do1.writeLong(99L);
        do1.writeFloat(12.1f);
        do1.writeDouble(12.1);
        do1.writeBoolean(false);
        do1.writeChar('1');
        DataInputStream di = new DataInputStream(new FileInputStream("dataTest"));
        int  a = di.readInt();
        byte b = di.readByte();
        short s = di.readShort();
        long l = di.readLong();
        float f = di.readFloat();
        double v = di.readDouble();
        boolean b1 = di.readBoolean();
        char c = di.readChar();
        System.out.println(a);
        System.out.println(b);
        System.out.println(s);
        System.out.println(l);
        System.out.println(f);
        System.out.println(v);
        System.out.println(b1);
        System.out.println(c);
        do1.flush();
        do1.close();
        di.close();
    }
}
