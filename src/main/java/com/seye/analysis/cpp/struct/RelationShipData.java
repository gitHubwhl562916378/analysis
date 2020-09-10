package com.seye.analysis.cpp.struct;

import com.sun.jna.Structure;

@Structure.FieldOrder({"id","natural_person_id","snap_scene_id","camera_id","id_in_scene","ts"})
public class RelationShipData extends Structure
{
    public String id;
    public String natural_person_id;
    public String snap_scene_id;
    public int camera_id;
    public int id_in_scene;
    public long ts;

    public static class RelationShipDataVal implements Structure.ByValue {

    }

    public static class RelationShipDataRef implements Structure.ByReference {
    }
}
