package com.seye.analysis.cpp.callback;

import com.seye.analysis.cpp.struct.SnapSceneData;
import com.sun.jna.Callback;

public interface SnapSceneCallBack extends Callback {
    void OnData(SnapSceneData sceneData);
}
