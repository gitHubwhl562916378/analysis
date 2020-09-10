package com.seye.analysis.cpp.struct;

import com.sun.jna.Pointer;
import com.sun.jna.Structure;

@Structure.FieldOrder({"id", "cameraId", "file", "file_length", "hbox", "feature", "feature_length", "attribute", "attr_length", "norm", "sceneId", "idInScene", "ts", "track_id", "has_mask", "bodyId"})
public class SnapFaceData extends Structure
{
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
    public int idInScene;
    public long ts;
    public int track_id;
    public int has_mask;
    public String bodyId;

    public static class SnapFaceDataVal implements Structure.ByValue {

    }

    public static class SnapFaceDataRef implements Structure.ByReference {
    }
}
