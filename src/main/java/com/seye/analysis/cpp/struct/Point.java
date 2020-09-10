package com.seye.analysis.cpp.struct;

import com.sun.jna.Structure;

@Structure.FieldOrder({"x", "y"})
public class Point extends Structure
{
    public int x;
    public int y;

    public static class PointVal implements Structure.ByValue {

    }

    public static class PointRef implements Structure.ByReference {
    }
}
