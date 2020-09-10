package com.seye.analysis.cpp.callback;

import com.seye.analysis.cpp.struct.SnapAlarmData;
import com.sun.jna.Callback;

public interface SnapAlarmCallBack extends Callback {
    void OnData(SnapAlarmData alarmData);
}
