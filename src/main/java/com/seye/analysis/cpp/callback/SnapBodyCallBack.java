package com.seye.analysis.cpp.callback;

import com.seye.analysis.cpp.struct.SnapBodyData;
import com.sun.jna.Callback;

public interface SnapBodyCallBack extends Callback {
    void OnData(SnapBodyData bodyData);
}
