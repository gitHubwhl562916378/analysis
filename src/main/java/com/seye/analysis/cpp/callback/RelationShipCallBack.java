package com.seye.analysis.cpp.callback;

import com.seye.analysis.cpp.struct.RelationShipData;
import com.sun.jna.Callback;

public interface RelationShipCallBack extends Callback {
    void OnData(RelationShipData shipData);
}
