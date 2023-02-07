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
    esinx_ex("e^tanx - e^x","0"),
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
    variable_limit_integral_derivation("变限积分求导公式","0"),
    tanx_derivation("tanx的导数","0"),
    secx_derivation("secx的导数","0"),
    logax_derivation("logax的导数","0"),
    lnxx21_derivation("ln(x + (x^2 + 1)^1/2)的导数","0"),
    lnxx2_1_derivation("ln(x + (x^2 - 1)^1/2)的导数","0"),
    lnx_derivation("lnx的导数","0"),
    cscx_derivation("cscx的导数","0"),
    cotx_derivation("cotx的导数","0"),
    ax_derivation("ax的导数","0"),
    arctanx_derivation("arctanx的导数","0"),
    arcsinx_derivation("arcsinx的导数","0"),
    arccotx_derivation("arccotx的导数","0"),
    arccosx_derivation("arccosx的导数","0"),
    convexity_def("凹凸性的定义","0"),
    convexity_diff("凹凸性的判别","0"),
    draw_funtion_pict("函数画图步骤","0"),
    extreme_point("极值必要条件","0"),
    if_extreme3("极值第三充分条件","0"),
    if_extreme2("极值第二充分条件","0"),
    if_extreme1("极值第一充分条件","0"),
    if_inflection_point3("拐点第三充分条件","0"),
    if_inflection_point2("拐点第二充分条件","0"),
    if_inflection_point1("拐点第一充分条件","0"),
    inflection_point("拐点定义","0"),
    inflection_point_con("拐点必要条件","0"),
    method2maxandmin("连续函数最大最小值","0"),
    method_valuearound("连续函数最值或取值范围","0"),
    monotonicity_diff("单调性判别","0"),
    oblique_asymptote("斜渐近线","0"),
    horizontal_asymptote("水平渐近线","0"),
    plumb_asymptote("铅锤渐近线","0"),
    relative_maxmin_def("极大极小值定义","0"),
    absolute_maxmin_def("最大最小值定义","0"),
    integral_mean_value_theorem("积分中值定理","0"),
    mclaughlin_formula("麦克劳林公式","0"),
    taylor_formula("泰勒公式","0"),
    cauchy_mean_value_theorem("柯西中值定理","0"),
    lagrange_mean_value_theorem("拉格朗日中值定理","0"),
    rolle_theorem("罗尔定理","0"),
    fermat_theorem("费马定理","0"),
    zero_point_theorem("零点定理","0"),
    mean_value_theorem("平均值定理","0"),
    intermediate_value_theorem("介值定理","0"),
    boundedness_max_theorem("有界与最值定理","0"),
    rolle6("φ(x) = kx,见到f‘(x) + kf(x)","0"),
    rolle5("φ(x) = -x,见到f‘(x) - f(x)","0"),
    rolle4("φ(x) = x,见到f‘(x) + f(x)","0"),
    rolle3("f‘(x) + f(x)φ(x)","0"),
    rolle2("f'(x)2 + f(x)f“(x)","0"),
    rolle1("f(x)f‘(x)","0"),
    integral_cot2x("∫ cotx^2 dx","0"),
    integral_tan2x("∫ tanx^2 dx","0"),
    integral_cos2x("∫ cosx^2 dx","0"),
    integral_sin2x("∫ sinx^2 dx","0"),
    integral_1_x2_a2("∫ 1/(x^2 - a^2) dx","0"),
    integral_1_x2a2sqrt2("∫ 1/√(a^2 + x^2) dx","0"),
    integral_1_a2_x2("∫ 1/√(a^2 - x^2) dx","0"),
    integral_1_a2x2("∫ 1/(a^2 + x^2) dx","0"),
    integral_secxtanx("∫ secxtanx dx","0"),
    integral_secx2("∫ secx^2 dx","0"),
    integral_1sinx("∫ 1/sinx dx","0"),
    integral_1cosx("∫ 1/cosx dx","0"),
    integral_cotx("∫ cotx dx","0"),
    integral_tanx("∫ tanx dx","0"),
    integral_cosx("∫ cosx dx","0"),
    integral_sinx("∫ sinx dx","0"),
    integral_ax("∫ a^x dx","0"),
    integral_1x("∫ 1/x dx","0"),
    integral_xk("∫ x^k dx","0"),
    function_behavior_proving_inequality("函数性态证明不等式","0"),
    odd_degree_equation_real_coefficients("实系数奇次方程","0"),
    rolle_theorem_conclusion("罗尔原话","0"),
    only_root("根是否唯一","0"),
    root_if_exist("判断根是否存在","0"),


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


