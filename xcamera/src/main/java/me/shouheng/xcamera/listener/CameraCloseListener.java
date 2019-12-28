package me.shouheng.xcamera.listener;

import me.shouheng.xcamera.enums.CameraFace;

/**
 * @author WngShhng (shouheng2015@gmail.com)
 * @version 2019/4/17 22:47
 */
public interface CameraCloseListener {

    void onCameraClosed(@CameraFace int cameraFace);
}
