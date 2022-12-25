package com.baicizhan.start;

public enum  SerialNumberEnums {

    sinx("sinx","0"),
    cosx("cosx","0"),
    tanx("tanx","0"),
    arcsinx("arcsinx","0"),
    arctanx("arctanx","0"),
    onemcosx("1 - cosx","0"),
    onemcosax("1 - cosx^a","0"),
    ex1("e^x - 1","0"),
    m1xa("(1 + x)^a_M","0"),
    m1xa2("(1 + x)^a","0"),
    ax_1("a^x - 1","0"),
    cosx_m("cosx_M","0"),
    e_x_m("e^x_M","0"),
    ln1x("ln(1 + x)","0"),
    ln1x_m("ln(1 + x)_M","0"),
    ln1x_ei("ln(1 + x)_ei","0"),
    sinx_m("sinx_m","0"),
    x_arcsinx("x - arcsinx","0"),
    x_arctanx("x - arctanx","0"),
    x_sinx("x-sinx","0"),
    x_tanx("x-tanx","0"),
    arccosx_pic("arccosx_pic","0"),
    arccotx_pic("arccotx_pic","0"),
    arcsinx_pic("arcsinx_pic","0"),
    arctanx_pic("arctanx_pic","0"),
    cotx_pic("cotx_pic","0"),
    cscx_pic("cscx_pic","0"),
    e_x("e^x","0"),
    equ_infinitesimal_x("equ_infinitesimal_x","0"),
    p1xa1("(1 + x)^a - 1","0"),
    secx_pic("secx_pic","0"),
    zzsd("x → ∞，增长速度","0"),
    indeterminate_formulae2("未定式1^∞","0"),
    indeterminate_formulae1("未定式∞^0 || 0^0","0"),
    esinx_ex("e^sinx - e^x","0"),
    bounded_def("有界的定义","0"),
    oscillatory_discontinuity("震荡间断点","0"),
    infinite_discontinuity("无穷间断点","0"),
    jump_discontinuity("跳跃间断点","0"),
    removable_discontinuity("可去间断点","0"),
    infinitesimal_scale("无穷小的比阶","0"),
    limit_pro("函数极限性质","0"),
    limit_def("函数极限","0"),
    exponent_function_derivation("幂指函数求导法","0"),
    logarithmic_function_derivation("对数函数求导法","0"),
    implicit_function_derivation("隐函数求导法","0"),
    parametric_equation_function_derivation("参数方程所确定的函数的导数","0"),
    inverse_function_derivation("反函数的导数","0"),
    composite_function_derivation("复合函数的导数以及微分形式不变性","0"),
    piecewise_function_derivation("分段函数的导数","0"),
    if_differencial("可微的判断","0"),
    geo_mean_differencial("可微的几何意义","0"),
    geo_mean_derivative("导数的几何意义","0"),
    differential_con("微分定义","0"),
    derivative_con2("导数定义_公式版","0"),
    derivative_con("导数定义","0"),


    start("start","准备开始");

    private String desc;//文字描述
    private String code; //对应的代码

    SerialNumberEnums( String desc, String code) {
        this.desc = desc;
        this.code = code;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

}


