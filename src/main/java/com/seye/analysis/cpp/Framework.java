package com.seye.analysis.cpp;

import com.seye.analysis.cpp.callback.*;
import com.seye.analysis.cpp.struct.SnapAlarmData;
import com.sun.jna.Library;
import com.sun.jna.Native;

public interface Framework extends Library {

    Framework SDK = Native.load("./libSeyeAnalyApplication.so",Framework.class);

    void SetSnapSceneCallBack(SnapSceneCallBack call);

    void SetSnapFaceCallBack(SnapFaceCallBack call);

    void SetSnapBodyCallBack(SnapBodyCallBack call);

    void SetSnapAlarmCallBack(SnapAlarmCallBack call);

    void SetRelationShipCallBack(RelationShipCallBack call);

    void SetPersonAttrCallBack(PersonAttrCallBack call);

    void cpp_start();
}
