#pragma once

#include <stdint.h>
extern "C"
{
    struct Box
    {
        int x;
        int y;
        int width;
        int height;
    };

    struct Point
    {
        int x;
        int y;
    };

    struct AttrValue
    {
        char *name;
        bool is_exists;
    };


    struct SnapFaceData
    {
        char *id;
        int cameraId;
        char *file = nullptr;
        int file_length = -1;
        Box hbox;
        float *feature = nullptr;
        int feature_length = -1;
        float *attribute = nullptr;
        int attr_length = -1;
        float norm;
        char *sceneId;
        int idInScene;
        int64_t ts;
        int track_id;
        int has_mask;
        char *bodyId;
    };

    typedef void (*SnapFaceCallBack)(SnapFaceData *);

    void SetSnapFaceCallBack(SnapFaceCallBack cb);

    struct SnapBodyData
    {
        char *id;
        int cameraId;
        char *file = nullptr;
        int file_length = -1;
        Box hbox;
        float *feature = nullptr;
        int feature_length = -1;
        float *attribute = nullptr;
        int attr_length = -1;
        float norm;
        char *sceneId;
        char *face_id;
        int idInScene;
        int64_t ts;
    };

    typedef void (*SnapBodyCallBack)(SnapBodyData*);

    void SetSnapBodyCallBack(SnapBodyCallBack cb);

    struct SnapSceneData
    {
        char *id;
        int cameraId;
        char *file = nullptr;
        int file_length = -1;
        Box faceHbox[50];
        int faceHbox_length;
        char *faceIds;
        Box bodyBbox[50];
        int bodyBbox_length;
        char *bodyIds;
        int personCount;
        int64_t ts;
        int64_t cts;
    };
    typedef void (*SnapSceneCallBack)(SnapSceneData*);
    void SetSnapSceneCallBack(SnapSceneCallBack cb);

    struct SnapAlarmData
    {
        char *id;
        int cameraId;
        int alarm_type;
        int64_t ts;
        char *file = nullptr;
        int file_length = -1;
        Box facebBox[50];
        int facebBox_length;
        Box bodybBox[50];
        int bodybBox_length;
        int *body_index;
        int body_index_length;
        Point alarm_zone[100];
        int alarm_zone_length;
        char *person = nullptr;
        int person_length = -1;
        int face_index = -1;
        char *person_id;
        float face_similarity = 0.0;
        char *scene_id;
        int has_mask;
    };
    typedef void (*SnapAlarmCallBack)(SnapAlarmData*);
    void SetSnapAlarmCallBack(SnapAlarmCallBack cb);

    struct RelationShipData
    {
        char *id;
        char *natural_person_id;
        char *snap_scene_id;
        int camera_id;
        int id_in_scene;
        int64_t ts;
    };
    typedef void (*RelationShipCallBack)(RelationShipData*);
    void SetRelationShipCallBack(RelationShipCallBack cb);

    struct PersonAttrData
    {
        char *id;
        int camera_id;
        int64_t ts;
        char *attr_js;
    };
    typedef void(*PersonAttrCallBack)(PersonAttrData*);
    void SetPersonAttrCallBack(PersonAttrCallBack cb);

    void cpp_start();
}