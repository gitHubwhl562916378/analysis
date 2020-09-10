package com.seye.analysis.cpp.struct;

import com.sun.jna.Structure;

@Structure.FieldOrder({"id","camera_id","ts","attr_js"})
public class PersonAttrData extends Structure
{
    public String id;
    public int camera_id;
    public long ts;
    public String attr_js;

    public static class PersonAttrDataVal implements Structure.ByValue {

    }

    public static class PersonAttrDataRef implements Structure.ByReference {
    }
}
