package com.algorithm.$0_math;

import com.algorithm.$8_annotation.single.ann.Doc4Desc;

/**
 * 手算开方
 *
 * @author:v_fanhaibo on 2018/1/10.
 * @version:v1.0
 */
@Doc4Desc(" SQuare RooT  : sqrt")
public class Sqrt {
    // 被开方数从小数点起向左（整数位）、向右（小数位）两位为段分组，从最左侧的两位数
    // （，第一段，也可能是一位数，如3.21）开始计算。第一段开出其最大整数根
    // （称为根的第一位，标记为a，如3开出1,5开出2,17开出4，以此类推），
    // 余数与第二段顺序组合；第一位乘以20，得到20a，第二位试探商b，
    // 使得20a+b与b的积最接近第一段余数与第二段顺序组合数而不超过，余数与第三段再组合，
    // 以此类推即可得到手开方根


//    Step1：将被开方数(为了形象，表述成“被除数”，此例中即为65536)从个位往高位每两位一断写成6,55,35的形式，为了方便表述，以下每一个“,”称为一步。
//    Step2：从高位开始计算开方。例如第一步为6，由于2^2=4<6<9=3^2，因此只能商2(这就是和除法不同的地方，“除数”和“商”的计算位必须相同)。
//           于是将2写在根号上方，计算开方余项。即高位余项加一步低位，此例中，即为高位余项2和低位一步55，余项即为255。
    /** 如果有余数？才乘以20 */
//    Step3：将Step2得到的第一步开方得数2乘以20(原理在后面证明)作为第二步除数的高位。即本步除数是4x(四十几)。按照要求，本步的商必须是x。因为45×5=225<255<46×6=276，所以本步商5。
//    Step4：按照类似方法，继续计算以后的各步。其中，每一步的除数高位都是20×已求出的部分商。例如第三步的除数高位就是25×20=500，
//           所以第三步除数为50x。本例中，506×6=3036恰好能整除，所以256就是最终计算结果。
}
