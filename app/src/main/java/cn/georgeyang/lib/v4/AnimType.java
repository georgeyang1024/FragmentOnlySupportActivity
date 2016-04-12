package cn.georgeyang.lib.v4;


import cn.georgeyang.fragment.R;

/**
 * Created by george.yang on 2015/10/29.
 */
public enum AnimType {
    NONE,//没有动画
    LeftInRightOut,//左进右出
    BottomInTopOut,//上进，往下出
    ZoomShow;//fragment默认缩放

    /**
     * index=0,准备进入的动画
     * index=1,准备移至消失的动画
     * index=2,准备显示处理的画面的动画
     * index=3,当前界面的退出动画
     * @param animType
     * @return
     */
    public static int[] getAnimRes (AnimType animType){
        switch (animType) {
            case LeftInRightOut:
                return new int[]{R.anim.push_left_in, R.anim.push_left_out,R.anim.back_left_in, R.anim.back_right_out};
            case BottomInTopOut:
                return new int[]{R.anim.push_bottom_in,R.anim.push_bottom_out,R.anim.push_top_in,R.anim.push_top_out};
            default:
                return new int[]{0,0,0,0};
        }
    }
}
