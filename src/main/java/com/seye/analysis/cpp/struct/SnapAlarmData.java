package com.seye.analysis.cpp.struct;

import com.sun.jna.Pointer;
import com.sun.jna.Structure;

@Structure.FieldOrder({"id", "cameraId", "alarm_type", "ts", "file", "file_length", "facebBox", "facebBox_length", "bodybBox", "bodybBox_length", "body_index", "body_index_length", "alarm_zone", "alarm_zone_length", "person", "person_length", "face_index", "person_id", "face_similarity", "scene_id", "has_mask"})
public class SnapAlarmData extends Structure
{
    public String id;
    public int cameraId;
    public int alarm_type;
    public long ts;
    public Pointer file = null;
    public int file_length;
    public Box[] facebBox = new Box[50];
    public int facebBox_length;
    public Box[] bodybBox = new Box[50];
    public int bodybBox_length;
    public Pointer body_index;
    public int body_index_length;
    public Point[] alarm_zone = new Point[100];
    public int alarm_zone_length;
    public Pointer person;
    public int person_length;
    public int face_index;
    public String person_id;
    public float face_similarity;
    public String scene_id;
    public int has_mask;

    public static class SnapAlarmDataVal implements Structure.ByValue {

    }

    public static class SnapAlarmDataRef implements Structure.ByReference {
    }
}
