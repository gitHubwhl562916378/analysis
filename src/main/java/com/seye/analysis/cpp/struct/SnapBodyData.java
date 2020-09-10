package com.seye.analysis.cpp.struct;

import com.sun.jna.Pointer;
import com.sun.jna.Structure;

@Structure.FieldOrder({"id", "cameraId", "file", "file_length", "feature", "feature_length", "attribute", "attr_length", "norm", "sceneId", "face_id", "idInScene", "ts"})
public class SnapBodyData extends Structure {
    public String id;
    public int cameraId;
    public Pointer file;
    public int file_length;
    public Box hbox;
    public Pointer feature;
    public int feature_length;
    public Pointer attribute;
    public int attr_length;
    public float norm;
    public String sceneId;
    public String face_id;
    public int idInScene;
    public long ts;

    public static class SnapBodyDataVal implements Structure.ByValue {

    }

    public static class SnapBodyDataRef implements Structure.ByReference {
    }
}
