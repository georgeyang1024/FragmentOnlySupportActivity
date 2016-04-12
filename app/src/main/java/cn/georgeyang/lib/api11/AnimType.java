package cn.georgeyang.lib.api11;


import cn.georgeyang.fragment.R;

/**
 *
 * anim type ,some bug in xml~
 * Created by george.yang on 2015/10/29.
 */
public enum AnimType {
    NONE,//没有动画
    DEFAULT,//Fragment默認
    LeftInRightOut,//左进右出
    BottomInTopOut,///*由下到上动画 */
    ZoomShow,//放大
    ZoomFragment,//Fragment默認放大
    FADE/*渐变 */
    ;

    public static int[] getAnimRes (AnimType animType){
        int[] animations;
        switch (animType) {
            case LeftInRightOut:
//                animations = new int[]{R.anim.slide_in_right, R.anim.slide_out_left, R.anim.slide_in_left, R.anim.slide_out_right};
                animations = new int[]{R.anim.enter_from_right, R.anim.exit_to_left, R.anim.enter_from_right, R.anim.exit_to_left};
                break;
            case BottomInTopOut:
                animations = new int[]{R.anim.push_top_in, R.anim.push_top_out, R.anim.push_top_in, R.anim.push_top_out};
                break;
            case FADE:
                animations = new int[]{R.anim.alpha_in, R.anim.alpha_out, R.anim.alpha_in, R.anim.alpha_out};
                break;
            case ZoomShow:
                animations = new int[]{R.anim.zoom_in, R.anim.zoom_out, R.anim.zoom_in, R.anim.zoom_out};
                break;
            default:
                animations = new int[]{0,0,0,0};
                break;
        }
        return animations;
    }
}
