package com.seye.analysis.cpp.struct;

import com.sun.jna.Pointer;
import com.sun.jna.Structure;

@Structure.FieldOrder({"id", "cameraId", "file", "file_length", "faceHbox", "faceHbox_length", "faceIds", "bodyBbox", "bodyBbox_length", "bodyIds", "personCount", "ts", "cts"})
public class SnapSceneData extends Structure
{
    public String id;
    public int cameraId;
    public Pointer file;
    public int file_length;
    public Box[] faceHbox = new Box[50];
    public int faceHbox_length;
    public String faceIds;
    public Box[] bodyBbox = new Box[50];
    public int bodyBbox_length;
    public String bodyIds;
    public int personCount;
    public long ts;
    public long cts;

    public static class SnapSceneDataVal implements Structure.ByValue {

    }

    public static class SnapSceneDataRef implements Structure.ByReference {
    }
}
