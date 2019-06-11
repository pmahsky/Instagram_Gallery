package utils;

import android.os.Environment;


public class FilePaths {

    //"storage/emulated/0"
    public static final String ROOT_DIR = Environment.getExternalStorageDirectory().getPath();

    public static final String PICTURES = ROOT_DIR + "/Pictures";
    public static final String CAMERA = ROOT_DIR + "/DCIM/camera";
    public static final String DCIM = ROOT_DIR + "/DCIM";


}
