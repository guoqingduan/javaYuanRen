package com.yuanren.method;


import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Locale;

public class StringWay {
    public static void main(String[] args) {

        String str="我日尼玛的，操蛋玩意";
        //1.返回char指定索引处的值
        char c = str.charAt(5);
        System.out.println(c);
        //5.按字典顺序比较两个字符串
        //比较首字母。
        str="BACSDA";
        String str2="aBSDAA";
        int i = str.compareTo(str2);
        System.out.println(i);
        //6.按字典顺序比较两个字符串，忽略首字母大小写
        i = str.compareToIgnoreCase(str2);
        System.out.println(i);
        //7.将指定的字符串连接到该字符串的末尾
        String concat = str.concat(str2);
        System.out.println(concat);
        //8.当且仅当此字符串包含指定的char值序列时才返回true
        boolean a = str.contains("DA");
        System.out.println(a);
        //11.将char数组变成字符串输出
        char[] as={'A','B','a','b'};
        String s = String.copyValueOf(as);
        System.out.println(s);
        //12.将char数组变成字符串输出,从下标几开始，长度为几
        String s1 = String.copyValueOf(as, 2, 2);
        System.out.println(s1);
        //13.测试此字符串是否以指定的后缀结尾
        boolean a1 = str.endsWith("A");
        System.out.println(a1);
        //14.将此字符串与指定对象进行比较
        String str1="张三";
        char[] cha={'张','三'};
        boolean equals = str1.equals(cha);
        System.out.println(equals);
        //15.将此 String与其他 String比较，忽略大小写。
        String s2="ABcdEfG你好";
        String s3="abCDeFg";
        boolean b = s2.equalsIgnoreCase(s3);
        System.out.println(b);
        //18.使用平台的默认字符集将此 String编码为字节序列，将结果存储到新的字节数组中
        byte[] bytes = s2.getBytes();
        System.out.println(Arrays.toString(bytes));
        //19.使用给定的charset将该String编码为字节序列，将结果存储到新的字节数组中
           Charset charset = Charset.forName("GBK");
            byte[] byt= s2.getBytes(charset);
            System.out.println(Arrays.toString(byt));

        //21.使用命名的字符集将此 String编码为字节序列，将结果存储到新的字节数组中
        try {
            byte[] byt2= s2.getBytes("UTF-16");
            System.out.println(Arrays.toString(byt2));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        //22.将此字符串中的字符复制到目标字符数组中
        /*srcBegin -- 字符串中要复制的第一个字符的索引。
        srcEnd -- 字符串中要复制的最后一个字符之后的索引。
        dst -- 目标数组。
        dstBegin -- 目标数组中的起始偏移量。*/
        char[] char2=new char[4];
        s2.getChars(2,6,char2,0);
        System.out.println(Arrays.toString(char2));
        //23.返回此字符串的哈希码
        int i1 = s2.hashCode();
        System.out.println(i1);
        //24.返回指定字符第一次出现的字符串内的索引
        String st1="ABCDabcd";
        int i2 = st1.indexOf(65);
        System.out.println(i2);
        //25.返回指定字符第一次出现的字符串内的索引，以指定的索引开始搜索
        int i3 = st1.indexOf(65, 2);
        System.out.println(i3);
        //27.返回指定子串的第一次出现的字符串中的索引，从指定的索引开始
        int ab = st1.indexOf("AB", 0);
        System.out.println(ab);
        //30.返回一个新的字符串，数组中间加间隔。
        String delimiter = "-";
        String[] elements = {"JDK", "8", "String", "join"};
        String join = String.join(delimiter, elements);
        System.out.println(join);
        //31.返回一个新 String,list集合中间加间隔

        //32.返回指定字符的最后一次出现的字符串中的索引
        String str12="AAAA";
        int i4 = str12.lastIndexOf(65);
        System.out.println(i4);
        //33.返回指定字符的最后一次出现的字符串中的索引，从指定的索引开始向后搜索
        i4 = str12.lastIndexOf(65,2);
        System.out.println(i4);
        //34.返回指定子字符串最后一次出现的字符串中的索引
        i4 = str12.lastIndexOf("AA");
        System.out.println(i4);
        //39.测试两个字符串区域是否相等
        //boolean ignoreCase处写 true，表示将不区分大小写，写false则表示将区分大小写。
        //toffset - 该字符串中子区域的开始偏移量。
        //other - 字符串参数。
        //ooffset - 参数字符串中子区域的开始偏移量。
        //len - 要比较的字符数。
        String b1= "tsinghua";
        String b2="it is TsingHua";
        boolean b3 = b1.regionMatches(true, 0, b2, 6, 7);
        System.out.println(b3);//表示将s1字符串从第0个字符“t”开始和s2字符串的第6个字符“T”开始逐个比较，共比较7对字符
        //40.测试两个字符串区域是否相等
        b3 = b1.regionMatches( 0, b2, 6, 7);
        System.out.println(b3);
        //41.返回从替换所有出现的导致一个字符串 oldChar在此字符串 newChar
        String replace = b2.replace('s', 'b');
        System.out.println(replace);
        //42.将与字面目标序列匹配的字符串的每个子字符串替换为指定的字面替换序列
        /*target-- 这是要被替换字符的值的序列。
        replacemen-- 这是char值的替换序列。*/
        String it = b2.replace("it", "is");
        System.out.println(it);
        //43.用给定的替换替换与给定的 regular expression匹配的此字符串的每个子字符串
        //字符串"$ \"中的$与\字符互换位置   第一个参数正则表达式
        String strin2 = "$ \\";
        System.out.println(strin2.replaceAll("\\$(\\W)\\\\", "\\\\$1\\$"));// \ $
        //45.将此字符串分割为给定的 regular expression的匹配
        //参数 分隔正则表达式
        String b4="boo:and:foo";
        String[] split = b4.split(":");
        System.out.println(Arrays.toString(split));

        //46.将这个字符串拆分为给定的 regular expression的匹配
        /*参数limit 作用是控制 模式应用的次数
        其中 limit为非正整数表示 模式被应用尽可能多的次数 比如-1
        limit =0 表示模式应用尽可能多的次数，数组可以是任意长度，并且结尾空字符串将被丢弃。
        limit>0时 那么模式将会应用limit-1次 数组长度不会超过limit*/
        String[] split1 = b4.split(":", 5);
        System.out.println(Arrays.toString(split1));

        //48.测试在指定索引处开始的此字符串的子字符串是否以指定的前缀开头
        boolean and = b4.startsWith("and", 4);
        System.out.println(and);
        //49.返回一个字符序列，该序列是该序列的子序列
        CharSequence charSequence = b4.subSequence(4, 6);//4---6-1
        System.out.println(charSequence);

        //50.返回一个字符串，该字符串是此字符串的子字符串
        String substring = b4.substring(4);
        System.out.println(substring);

        //51.返回一个字符串，该字符串是此字符串的子字符串。
        String substring1 = b4.substring(4, 6);//4---(6-1)
        System.out.println(substring1);

        //52.将此字符串转换为新的字符数组
        char[] chars = b4.toCharArray();
        System.out.println(Arrays.toString(chars));

        //53.将所有在此字符 String使用默认语言环境的规则，以小写
        String b5="AAAAAaaaaa";
        String s4 = b5.toLowerCase();
        System.out.println(s4);

        //54.将所有在此字符 String ，以降低使用给定的规则情况下 Locale
        //locale-- 默认使用的情况下，转换规则为这个语言环境。
        Locale defloc = Locale.getDefault();
        String s5 = b5.toLowerCase(defloc);
        System.out.println(s5);
        //55.此对象（已经是字符串！）本身已被返回
        String s6 = b5.toString();
        System.out.println(s6);

        //56.将所有在此字符 String使用默认语言环境的规则大写
        String s7 = b5.toUpperCase();
        System.out.println(s7);

        //57.
        String s8 = b5.toUpperCase(defloc);
        System.out.println(s8);

        //58.返回一个字符串，其值为此字符串，并删除任何前导和尾随空格
        String b6="     asfs d    ";
        String trim = b6.trim();
        System.out.println(trim);

        //59.返回 boolean参数的字符串 boolean形式
        String s9 = String.valueOf(7>9);
        System.out.println(s9);

        //60.返回 char参数的字符串 char形式
        String 男 = String.valueOf('男');
        System.out.println(男);

        //61.返回 char数组参数的字符串 char形式
        char[] sda={'男','a','A'};
        String s10 = String.valueOf(sda);
        System.out.println(s10);

        //62.返回 char数组参数的特定子阵列的字符串 char形式
        //valueOf(char[] data, int offset, int count)
        /*将 char 数组 data 中 由 data[offset] 开始取 count 个元素 转换成字符串*/
        String s11 = String.valueOf(sda, 1, 2);
        System.out.println(s11);

        //63.返回 double参数的字符串 double形式
        String.valueOf(12412.121231);
        //64.返回 float参数的字符串 float形式
        String.valueOf(12.21f);
        //65.返回 int参数的字符串 int形式
        String.valueOf(1232);
        //66.返回 long参数的字符串 long形式
        String.valueOf(123L);
        //67.返回 Object参数的字符串 Object形式
        Object ob="qwdsa";
        String.valueOf(ob);

    }
}
