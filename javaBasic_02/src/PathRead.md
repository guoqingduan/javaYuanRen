/* 正数和负数的
 * 正数的反码与原码相等  正数的补码与原码相等
 * 负数的反码最高位不变其他位取反
 * 负数的补码是反码加1
 * 按位与 & 同为1为1，否则为0
 * 按位或 | 同为0为0  否则为1
 * 异或   ^ 两数相同为0，否则为1
 * 取反   ~
 * 
 */
 /*去掉空白 ctrl+shift+J
 *格式化代码 Ctrl+alt+L
 */
###if和switch的区别
if和switch可以互换，但是if它主要完成的条件判断，switch主要是对数据的结果分支执行，
if可以在条件中书写判断的区间，而switch只能接受固定类型的数据，最后还要求必须是常量
switch（表达式） byte short int char  string（1.7）
###使用switch时需要注意的事项
1.在switch语句中case语句和default语句在书写上没有先后顺序。但是会先执行case语句。
2.switch语句只有遇到两个情况才会结束整个switch语句。1.遇到break语句；2.执行到整个switch语句的
末尾（switch语句匹配的最后的右大括号）
3.在switch语句中，是可以省略default语句的。而且default语句中的break同样也是可以省略的
4.在switch语句的书写上，是可以省略break语句的。但是在执行时，如果没有break语句，程序会向下
  继续执行可执行的代码


