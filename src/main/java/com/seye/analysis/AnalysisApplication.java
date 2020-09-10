package com.seye.analysis;

import com.seye.analysis.cpp.Framework;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AnalysisApplication {

    public static void main(String[] args) {
        //SpringApplication.run(AnalysisApplication.class, args);

        Framework.SDK.SetSnapFaceCallBack(faceData->{
            String id = faceData.id;
        });

        Framework.SDK.SetSnapBodyCallBack(bodyData -> {
            String id = bodyData.id;
        });

        Framework.SDK.SetSnapSceneCallBack(sceneData -> {
            String id = sceneData.id;
        });

        Framework.SDK.SetSnapAlarmCallBack(alarmData -> {

        });

        Framework.SDK.SetPersonAttrCallBack(attrData -> {

        });

        Framework.SDK.SetRelationShipCallBack(shipData -> {

        });

        Framework.SDK.cpp_start();

    }

}
