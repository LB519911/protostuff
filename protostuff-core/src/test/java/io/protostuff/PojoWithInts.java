// Generated by http://code.google.com/p/protostuff/ ... DO NOT EDIT!
// Generated from foo.proto

package io.protostuff;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import io.protostuff.GraphIOUtil;
import io.protostuff.Input;
import io.protostuff.Message;
import io.protostuff.Output;
import io.protostuff.Schema;

public final class PojoWithInts implements Externalizable, Message<PojoWithInts>, Schema<PojoWithInts>
{

    public static Schema<PojoWithInts> getSchema()
    {
        return DEFAULT_INSTANCE;
    }

    public static PojoWithInts getDefaultInstance()
    {
        return DEFAULT_INSTANCE;
    }

    static final PojoWithInts DEFAULT_INSTANCE = new PojoWithInts();

    private int someInt32;
    private int someUint32;
    private int someSint32;
    private int someFixed32;
    private int someSfixed32;
    private long someInt64;
    private long someUint64;
    private long someSint64;
    private long someFixed64;
    private long someSfixed64;

    public PojoWithInts()
    {

    }

    // getters and setters

    // someInt32

    public int getSomeInt32()
    {
        return someInt32;
    }

    public void setSomeInt32(int someInt32)
    {
        this.someInt32 = someInt32;
    }

    // someUint32

    public int getSomeUint32()
    {
        return someUint32;
    }

    public void setSomeUint32(int someUint32)
    {
        this.someUint32 = someUint32;
    }

    // someSint32

    public int getSomeSint32()
    {
        return someSint32;
    }

    public void setSomeSint32(int someSint32)
    {
        this.someSint32 = someSint32;
    }

    // someFixed32

    public int getSomeFixed32()
    {
        return someFixed32;
    }

    public void setSomeFixed32(int someFixed32)
    {
        this.someFixed32 = someFixed32;
    }

    // someSfixed32

    public int getSomeSfixed32()
    {
        return someSfixed32;
    }

    public void setSomeSfixed32(int someSfixed32)
    {
        this.someSfixed32 = someSfixed32;
    }

    // someInt64

    public long getSomeInt64()
    {
        return someInt64;
    }

    public void setSomeInt64(long someInt64)
    {
        this.someInt64 = someInt64;
    }

    // someUint64

    public long getSomeUint64()
    {
        return someUint64;
    }

    public void setSomeUint64(long someUint64)
    {
        this.someUint64 = someUint64;
    }

    // someSint64

    public long getSomeSint64()
    {
        return someSint64;
    }

    public void setSomeSint64(long someSint64)
    {
        this.someSint64 = someSint64;
    }

    // someFixed64

    public long getSomeFixed64()
    {
        return someFixed64;
    }

    public void setSomeFixed64(long someFixed64)
    {
        this.someFixed64 = someFixed64;
    }

    // someSfixed64

    public long getSomeSfixed64()
    {
        return someSfixed64;
    }

    public void setSomeSfixed64(long someSfixed64)
    {
        this.someSfixed64 = someSfixed64;
    }

    // java serialization

    public void readExternal(ObjectInput in) throws IOException
    {
        GraphIOUtil.mergeDelimitedFrom(in, this, this);
    }

    public void writeExternal(ObjectOutput out) throws IOException
    {
        GraphIOUtil.writeDelimitedTo(out, this, this);
    }

    // message method

    public Schema<PojoWithInts> cachedSchema()
    {
        return this;
    }

    // schema methods

    public PojoWithInts newMessage()
    {
        return new PojoWithInts();
    }

    public Class<PojoWithInts> typeClass()
    {
        return PojoWithInts.class;
    }

    public String messageName()
    {
        return PojoWithInts.class.getSimpleName();
    }

    public String messageFullName()
    {
        return PojoWithInts.class.getName();
    }

    public boolean isInitialized(PojoWithInts message)
    {
        return true;
    }

    public void mergeFrom(Input input, PojoWithInts message) throws IOException
    {
        for (int number = input.readFieldNumber(this);; number = input.readFieldNumber(this))
        {
            switch (number)
            {
                case 0:
                    return;
                case 1:
                    message.someInt32 = input.readInt32();
                    break;
                case 2:
                    message.someUint32 = input.readUInt32();
                    break;
                case 3:
                    message.someSint32 = input.readSInt32();
                    break;
                case 4:
                    message.someFixed32 = input.readFixed32();
                    break;
                case 5:
                    message.someSfixed32 = input.readSFixed32();
                    break;
                case 11:
                    message.someInt64 = input.readInt64();
                    break;
                case 12:
                    message.someUint64 = input.readUInt64();
                    break;
                case 13:
                    message.someSint64 = input.readSInt64();
                    break;
                case 14:
                    message.someFixed64 = input.readFixed64();
                    break;
                case 15:
                    message.someSfixed64 = input.readSFixed64();
                    break;
                default:
                    input.handleUnknownField(number, this);
            }
        }
    }

    public void writeTo(Output output, PojoWithInts message) throws IOException
    {
        if (message.someInt32 != 0)
            output.writeInt32(1, message.someInt32, false);

        if (message.someUint32 != 0)
            output.writeUInt32(2, message.someUint32, false);

        if (message.someSint32 != 0)
            output.writeSInt32(3, message.someSint32, false);

        if (message.someFixed32 != 0)
            output.writeFixed32(4, message.someFixed32, false);

        if (message.someSfixed32 != 0)
            output.writeSFixed32(5, message.someSfixed32, false);

        if (message.someInt64 != 0)
            output.writeInt64(11, message.someInt64, false);

        if (message.someUint64 != 0)
            output.writeUInt64(12, message.someUint64, false);

        if (message.someSint64 != 0)
            output.writeSInt64(13, message.someSint64, false);

        if (message.someFixed64 != 0)
            output.writeFixed64(14, message.someFixed64, false);

        if (message.someSfixed64 != 0)
            output.writeSFixed64(15, message.someSfixed64, false);
    }

    public String getFieldName(int number)
    {
        return Integer.toString(number);
    }

    public int getFieldNumber(String name)
    {
        return Integer.parseInt(name);
    }

    @Override
    public int hashCode()
    {
        final int prime = 31;
        int result = 1;
        result = prime * result + someFixed32;
        result = prime * result + (int) (someFixed64 ^ (someFixed64 >>> 32));
        result = prime * result + someInt32;
        result = prime * result + (int) (someInt64 ^ (someInt64 >>> 32));
        result = prime * result + someSfixed32;
        result = prime * result + (int) (someSfixed64 ^ (someSfixed64 >>> 32));
        result = prime * result + someSint32;
        result = prime * result + (int) (someSint64 ^ (someSint64 >>> 32));
        result = prime * result + someUint32;
        result = prime * result + (int) (someUint64 ^ (someUint64 >>> 32));
        return result;
    }

    @Override
    public boolean equals(Object obj)
    {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        PojoWithInts other = (PojoWithInts) obj;
        if (someFixed32 != other.someFixed32)
            return false;
        if (someFixed64 != other.someFixed64)
            return false;
        if (someInt32 != other.someInt32)
            return false;
        if (someInt64 != other.someInt64)
            return false;
        if (someSfixed32 != other.someSfixed32)
            return false;
        if (someSfixed64 != other.someSfixed64)
            return false;
        if (someSint32 != other.someSint32)
            return false;
        if (someSint64 != other.someSint64)
            return false;
        if (someUint32 != other.someUint32)
            return false;
        if (someUint64 != other.someUint64)
            return false;
        return true;
    }

    @Override
    public String toString()
    {
        return "PojoWithInts [someFixed32=" + someFixed32 + ", someFixed64=" + someFixed64 + ", someInt32=" + someInt32
                + ", someInt64=" + someInt64
                + ", someSfixed32=" + someSfixed32 + ", someSfixed64=" + someSfixed64 + ", someSint32=" + someSint32
                + ", someSint64=" + someSint64
                + ", someUint32=" + someUint32 + ", someUint64=" + someUint64 + "]";
    }

}