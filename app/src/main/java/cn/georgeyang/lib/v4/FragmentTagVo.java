package cn.georgeyang.lib.v4;

/**
 * Created by george.yang on 2015/10/30.
 */
public class FragmentTagVo {
    public FragmentTagVo(){};
    public FragmentTagVo(int index, String animType) {
        this.index = index;
        this.animType = animType;
    }
    public String animType;
    public int index;
}
