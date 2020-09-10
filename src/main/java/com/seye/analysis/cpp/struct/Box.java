package com.seye.analysis.cpp.struct;

import com.sun.jna.Structure;

@Structure.FieldOrder({"x", "y", "width", "height"})
public class Box extends Structure
{
    public int x;
    public int y;
    public int width;
    public int height;

    public static class BoxVal implements Structure.ByValue {

    }

    public static class BoxRef implements Structure.ByReference {
    }
}
