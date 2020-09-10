package com.seye.analysis.cpp.callback;

import com.seye.analysis.cpp.struct.PersonAttrData;
import com.sun.jna.Callback;

public interface PersonAttrCallBack extends Callback {
    void OnData(PersonAttrData attrData);
}
