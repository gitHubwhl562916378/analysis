package com.seye.analysis.cpp.struct;

import com.sun.jna.Structure;

@Structure.FieldOrder({"name", "is_exists"})
public class AttrValue extends Structure
{
    public String name;
    public boolean is_exists;

    public static class AttrValueVal implements Structure.ByValue {

    }

    public static class AttrValueRef implements Structure.ByReference {
    }
}
