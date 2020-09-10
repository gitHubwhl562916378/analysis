package com.seye.analysis.cpp.callback;

import com.seye.analysis.cpp.struct.SnapFaceData;
import com.sun.jna.Callback;

public interface SnapFaceCallBack extends Callback {
    void OnData(SnapFaceData faceData);
}
