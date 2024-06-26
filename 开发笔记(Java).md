# Java

## Java SE

### 02：Java概述

#### Java 重要特点

1. Java 语言是面向对象的(oop)

2. Java 语言是健壮的。Java 的强类型机制、异常处理、垃圾的自动收集等是 Java 程序健壮性的重要保证
3. Java 语言是跨平台性的。[即: 一个编译好的.class 文件可以在多个系统下运行，这种特性称为跨平台]

3. Java 语言是解释型的[了解] 。

   解释性语言：javascript,PHP, java 

   编译性语言: c / c++ 

   区别是：解释性语言，编译后的代码，不能直接被机器执行,需要解释器来执行, 编译性语言, 编译后的代码, 可以直接被机器执行, c /c+

#### 什么是 JDK，JRE，JVM

1. JDK 的全称（Java Development Kit） Java 开发工具包。JDK 是提供给 Java 开发人员使用的，其中包含了 java 的开发工具，也包括了 JRE。所以安装了 JDK，就不用在单独 安装 JRE 了。

   **JDK = JRE + java 的开发工具** [java, javac,javadoc,javap 等]

2. JRE的全称（Java Runtime Environment） Java 运行环境。包括 Java 虚拟机(**JVM** Java Virtual Machine)和 Java 程序所需的核心类库等，如果想要运行一个开发好的 Java 程序， 计算机中只需要安装 JRE 即可。

   **JRE = JVM +Java 的核心类库**

####  Java 开发注意事项和细节说明

![image-20240224162718902](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240224162718902.png)

####  Java 转义字符

![image-20240224162905093](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240224162905093.png)

#### 注释(comment)

用于注解说明解释程序的文字就是注释，注释提高了代码的阅读性（可读性）；注释是一个程序员必须要具有的良 好编程习惯。将自己的思想通过注释先整理出来，再用代码去体现。

```java
//单行注释

/*
多行注释

多行注释
*/

/**
	*文档注释
	*author 陈俊宇
	*version 1.0
	*	
	*见下图
*/
```

![image-20240224163254806](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240224163254806.png)

####  Java 代码规范

![image-20240224163415535](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240224163415535.png)

#### Java编写步骤

1. 编写java的源代码

2. javac编译，得到对应的.class字节码文件

3. java运行，本质就是把.class加载到JVM运行

#### 本章作业

![image-20240224163527124](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240224163527124.png)

### 03：变量

#### 概念

变量相当于内存中一个数据存储空间的表示，你可以把变量看做是一个房间的门牌号，通过门牌号我们可以找到房间，而通过变量名可以访问到变量(值)

**变量 = 变量名 + 值 + 数据类型**

#### 程序中 +号的使用

1. 当左右两边都是数值型时，则做加法运算

2. 当左右两边有一方为字符串,则做拼接运算

![image-20240225113717741](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240225113717741.png)

#### 数据类型

每一种数据都定义了明确的数据类型，在内存中分配了不同大小的内存空间(字节)。

![image-20240225145443035](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240225145443035.png)

 基本数据类型有 8 中 数值型 byte , short , int , long , float ,double，char , boolean；引用类型有三种：类，接口， 数组。

##### 整型

Java 的整数类型就是用于存放整数值的，比如 12 , 30, 3456 等等。

![image-20240225145649044](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240225145649044.png) 

![image-20240225145807635](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240225145807635.png) 

**注意：byte a = 10;**

**看似是将默认的int类型转换成了更小的byte类型应该会报错，但是表达式是正确的。因为这里程序所做的事是：判断10这个值是否在-128~127之间，根据这个来看是否符合要求，注意：这里的10一定是一个具体的值，而不能是变量，或者是大于这个范围的值。short类型同样适用。**

##### 浮点型

Java 的浮点类型可以表示一个小数，比如 123.4 ，7.8 ，0.12 等等。

![image-20240225145919616](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240225145919616.png) 

![image-20240225150023292](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240225150023292.png) 

##### 字符型

字符类型可以表示单个字符,字符类型是 char，char 是两个字节(可以存放汉字)，多个字符我们用字符串 String。

![image-20240225150238229](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240225150238229.png) 

![image-20240225150345863](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240225150345863.png) 

##### 布尔型

![image-20240225150439440](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240225150439440.png) 

#### 基本数据类型转换

##### 自动类型转换

![image-20240225150544626](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240225150544626.png) 

![image-20240225150650565](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240225150650565.png) 

##### 强制类型转换

自动类型转换的逆过程，将容量大的数据类型转换为容量小的数据类型。使用时要加上强制转换符 ( )，但可能造成
精度降低或溢出,格外要注意。

![image-20240225150803240](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240225150803240.png) 

![image-20240225150850098](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240225150850098.png) 

#### 基本数据类型和 String 类型的转换

![image-20240225151001328](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240225151001328.png) 

1. 在将 String 类型转成 基本数据类型时， 要确保String类型能够转成有效的数据，比如 我们可以把 "123" , 转成一个整数，但是不能把 "hello" 转成一个整数

2. 如果格式不正确，就会抛出异常，程序就会终止，

#### 本章作业

![image-20240225151148714](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240225151148714.png)

### 04：运算符

运算符是一种特殊的符号，用以表示数据的运算、赋值和比较等

#### 算术运算符

算术运算符是对数值类型的变量进行运算的，在 Java 程序中使用的非常多

![image-20240227145701670](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240227145701670.png)

![image-20240227145728090](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240227145728090.png)

![image-20240227145749356](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240227145749356.png)

#### 比较运算符

关系运算符的结果都是 boolean 型，也就是要么是 true，要么是 false

![image-20240227145853553](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240227145853553.png)

关系运算符组成的表达式，我们称为**关系表达式**。 a > b

#### 逻辑运算符

用于连接多个条件（多个关系表达式），最终的结果也是一个 boolean 

![image-20240227150124179](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240227150124179.png)

1. **a&b** : & 叫**逻辑与**：规则：当 a 和 b 同时为 true ,则结果为 true, 否则为 false 

2. **a&&b** : && 叫**短路与**：规则：当 a 和 b 同时为 true ,则结果为 true,否则为 false 

3. **a|b** : | 叫**逻辑或**，规则：当 a 和 b ，有一个为 true ,则结果为 true,否则为 false 

4. **a||b** : || 叫**短路或**，规则：当 a 和 b ，有一个为 true ,则结果为 true,否则为 false

5. **!a** : 叫**取反**。当 a 为 true, 则结果为 false, 当 a 为 false 是，结果为 true 

6. **a^b**: 叫**逻辑异或**，当 a 和 b 不同时，则结果为 true, 否则为 false

**&& 和 & 使用区别（||和|同）:**

1. &&短路与：**如果第一个条件为 false，则第二个条件不会判断**，最终结果为 false，效率高 
2. & 逻辑与：**不管第一个条件是否为 false，第二个条件都要判断**，效率低

#### 赋值运算符

赋值运算符就是将某个运算后的值，赋给指定的变量。

赋值运算符分为两类：

1. 基本赋值运算符 **=** ：int a = 10
2. 复合赋值运算符**+= ，-= ，*= ， /= ，%=** ：
   a += b  ====》  等价 a = a + b; 

#### 三元运算符

条件表达式    ?     表达式 1    :     表达式2

运算规则： 

1. 如果条件表达式为 true，运算后的结果是表达式 1； 
2. 如果条件表达式为 false，运算后的结果是表达式 2

细节：

表达式 1 和表达式 2 要为可以赋给接收变量的类型(或可以自动转换)

#### 标识符的命名规则和规范

规则：

![image-20240227151129934](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240227151129934.png)

规范：

1. 包名：多单词组成时所有字母都小写：aaa.bbb.ccc //比如 com.hsp.crm 
2. 类名、接口名：多单词组成时，所有单词的首字母大写：XxxYyyZzz [大驼峰] 比如： TankShotGame 
3. 变量名、方法名：多单词组成时，第一个单词首字母小写，第二个单词开始每个单词首字母大写：xxxYyyZzz [小 驼峰， 简称 驼峰法] 比如： tankShotGame 
4. 常量名：所有字母都大写。多单词时每个单词用下划线连接：XXX_YYY_ZZZ 比如 ：定义一个所得税率 TAX_RATE 

#### 键盘输入语句

在编程中，需要接收用户输入的数据，就可以使用键盘输入语句来获取。Input.java , 需要一个 扫描器(对象), 就是 Scanner

步骤：

1.  引入/导入 Scanner 类所在的包
    **import java.util.Scanner;**
2.  创建 Scanner 对象 , new 创建一个对象
    **Scanner myScanner = new Scanner(System.in)；**
3.  调用里面的功能
    **String name = myScanner.next(); //接收用户输入字符串**
    int age = myScanner.nextInt(); //接收用户输入 int
    double sal = myScanner.nextDouble(); //接收用户输入 doubl

```java
import java.util.Scanner;
public class Input {
    Scanner myScanner = new Scanner(System.in);
    String name = myScanner.next();
}
```



#### 原码、反码、补码

**进制:**

二进制：0,1 ，满 2 进 1.以 0b 或 0B 开头。 

十进制：0-9 ，满 10 进 1。 

八进制：0-7 ，满 8 进 1. 以数字 0 开头表示。 

十六进制：0-9 及 A(10)-F(15)，满 16 进 1. 以 0x 或 0X

**原码、反码、补码：**

![image-20240227152037830](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240227152037830.png)

为什么计算机的计算都是采用补码的方式？

因为可以统一正数和负数的运算

#### 位运算符

java 中有 **7 个**位运算(**&、|、 ^ 、~、>>、<<和 >>>**)

![image-20240227152230556](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240227152230556.png)

1. 算术右移 >>：低位溢出,符号位不变,并用符号位补溢出的高位 
2. 算术左移 <<: 符号位不变,低位补 0 
3. **>>>**逻辑右移也叫无符号右移,运算规则是: 低位溢出，高位补 0 
4. 特别说明：没有 <<< 符号

本章作业：

![image-20240227152554047](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240227152554047.png)

![image-20240227152604098](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240227152604098.png)

### 05：程序控制结构

在程序中，程序运行的流程控制决定程序是如何执行的，是我们必须掌握的，主要有三大流程控制语句：

1. 顺序控制
2. 分支控制 
3. 循环控制

####  顺序控制

![image-20240227184158551](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240227184158551.png)

#### 分支控制 

让程序有选择的的执行,分支控制有三种 

1. 单分支 if 
2. 双分支 if-else 
3. 多分支 if-else if -....-else

##### 单分支

![image-20240227184323395](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240227184323395.png)

![image-20240227190203640](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240227190203640.png) 

##### 双分支

![image-20240227190255856](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240227190255856.png)

![image-20240227190411393](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240227190411393.png) 

##### 多分支

![image-20240227191732315](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240227191732315.png) 

![image-20240227191751330](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240227191751330.png) 

##### 嵌套分支

在一个分支结构中又完整的嵌套了另一个完整的分支结构，里面的分支的结构称为内层分支外面的分支结构称为外 层分支。

老师建议: 不要超过 3层（可读性不好）

##### switch 分支结构

![image-20240227193344488](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240227193344488.png)

![image-20240227193358043](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240227193358043.png)

![image-20240227193956153](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240227193956153.png)

##### switch 和 if 的比较

1. 如果判断的具体数值不多，而且符合 byte、 short 、int、 char, enum[枚举], String 这 6 种类型。虽然两个语句都可 以使用，建议使用 swtich 语句。 
2. 其他情况：对区间判断，对结果为 boolean 类型判断，使用 if，if 的使用范围更广

#### 循环控制

##### for 循环

![image-20240227194619183](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240227194619183.png)

![image-20240227194634788](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240227194634788.png)

1.  循环条件是返回一个布尔值的表达式 
2.  for(;循环判断条件;) 中的初始化和变量迭代可以写到其它地方，但是两边的分号不能省略。 
3.  循环初始值**可以有多条初始化语句，但要求类型一样，并且中间用逗号隔开**，循环变量迭代也可以有多条变量迭代 语句，中间用逗号隔开。

##### while 循环

![image-20240227195208401](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240227195208401.png) 

![](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240227195217459.png) 

1. 循环条件是返回一个布尔值的表达式 
2. while 循环是先判断再执行语句

#####  do..while 循环

![image-20240227195605308](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240227195605308.png) 

![](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240227195722863.png) 

1. 先执行，再判断，也就是说，一定会至少执行一次 
2. **最后 有一个 分号 ;** 

##### 多重循环

1. 将一个循环放在另一个循环体内，就形成了嵌套循环。其中，for ,while ,do…while 均可以作为外层循环和内层循环。 【**建议一般使用两层，最多不要超过 3 层**, 否则，代码的可读性很差】 
2. 实质上，**嵌套循环就是把内层循环当成外层循环的循环体**。当只有内层循环的循环条件为 false 时，才会完全跳出内 层循环，才可结束外层的当次循环，开始下一次的循环

3. 设外层循环次数为 m 次，内层为 n 次，则内层循环体实际上需要执行 m*n 次。

![image-20240227200302757](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240227200302757.png) 

#### 跳转控制

##### break

break 语句用于终止某个语句块的执行，一般使用在 switch 或者循环[for , while , do-while]中

![image-20240227202403904](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240227202403904.png) 

![image-20240227202419529](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240227202419529.png)

##### continue

1. continue 语句用于结束本次循环，继续执行下一次循环。 
2. continue 语句出现在多层嵌套的循环语句体中时，可以通过标签指明要跳过的是哪一层循环 , 这个和前面的标签的 使用的规则一样

![image-20240227202548239](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240227202548239.png) 

##### return

return 使用在方法，表示跳出所在的方法。如果 return 写在 main 方法中，则退出程序。

![image-20240227202706376](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240227202706376.png) 

#### 本章作业

![image-20240227202734212](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240227202734212.png)

![image-20240227202741313](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240227202741313.png) 

### 06：数组、排序和查找

数组可以存放多个同一类型的数据。数组也是一种数据类型，是引用类型。

**数(数据)组(一组)就是一组数据**

#### 数组的使用

```java
//**使用方式一：动态初始化**
int a[] = new int[3];

//**使用方式二：动态初始化**
//先申明数组、再创建数组
int a[];
a = new int[3];

//**使用方式三：静态初始化**
int a[] = {2,3,4};
```

![image-20240228162344823](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240228162344823.png) 

#### 数组的细节

1. 数组是多个**相同类型数据的组合**，实现对这些数据的统一管理

2) 数组中的元素可以是任何数据类型，包括基本类型和引用类型，但是不能混用。
3) 数组创建后，**如果没有赋值，有默认值**
   int 0，short 0, byte 0, long 0, float 0.0,double 0.0，char \u0000，boolean false，String null

4) 使用数组的步骤 
   1) 声明数组并开辟空间 
   2) 给数组各个元素赋值 
   3) 使用数组
5) 数组的**下标是从** **0** **开始的**
6) 数组下标必须在指定范围内使用，否则报错：下标越界异常
7) 数组属**引用类型**，数组型数据是对象(object)

#### 数组赋值机制

1. 基本数据类型赋值，这个值就是具体的数据，而且相互不影响。int n1 = 2; int n2 = n1;

2) 数组在**默认情况下是引用传递，赋的值是地址**。

![image-20240228162932571](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240228162932571.png) 

#### 排序

排序是将多个数据，依指定的顺序进行排列的过程。

排序分为：内部排序和外部排序

1. 内部排序：指将需要处理的所有数据都加载到内部存储器中进行排序。包括(交换式排序法、选择式排序法和插入式排序法)
2. 外部排序：数据量过大，无法全部加载到内存中，需要借助外部存储进行排序。包括(合并排序法和直接合并排序法)

#### 冒泡排序法

冒泡排序（Bubble Sorting）的基本思想是：通过对待排序序列从后向前（从下标较大的元素开始），依次比较相邻元素的值，若发现逆序则交换，使值较大的元素逐渐从前移向后部，就象水底下的气泡一样逐渐向上冒。

**思路：**

![image-20240228163400974](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240228163400974.png) 

#### 二维数组

```java
//**使用方式1：动态初始化**
int a[3][3] = new int[3][3];

//**使用方式2：动态初始化**
//先声明、再开辟空间
int a[][];
a = new int[3][3]
    
//**使用方式 3: 动态初始化-列数不确定**
/**
0
00
000
*/
int a[][] = new a[10][];//先开辟行数的空间
for(int i = 0; i < a.length; i++) {
    a[i] = new int[i+1]; //再动态开辟列数的空间
}

int a[][];
a

//**使用方式 4: 静态初始化**
int a[][] = {{1,2,3},{4,5,6},{7,8,9}};
```

**储存细节：**

![image-20240228163846781](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240228163846781.png) 

#### 二维数组细节

1) 一维数组的声明方式有:
   int[] x 或者 int x[]

2) 二维数组的声明方式有:
   ![image-20240228164437857](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240228164437857.png)

3. 二维数组实际上是由多个一维数组组成的，它的各个一维数组的长度可以相同，也可以不相同。
4. 还是要注意数据类型的自动转换

![image-20240228164546217](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240228164546217.png) 

#### 本章作业

![image-20240228164725724](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240228164725724.png) 

![image-20240228164742609](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240228164742609.png) 

### 07：面向对象编程

#### 类与对象

```java
Cat cat1 = new Cat();

class Cat {
	String name; 
	int age; 
	String color; 
}
```

##### 类和对象的区别和联系

1. 类是抽象的，概念的，代表一类事物,比如人类,猫类.., 即它是数据类型
2. 对象是具体的，实际的，代表一个具体事物, 即 是实例
3. 类是对象的模板，对象是类的一个个体，对应一个实例

##### 对象在内存中存在形式

![image-20240229150533210](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240229150533210.png)

##### 属性/成员变量

从概念或叫法上看： 成员变量 = 属性 = field(字段)

属性是类的一个组成部分，一般是基本数据类型,也可是引用类型(对象，数组)。

**属性细节：**

1. 属性的定义语法同变量，
   示例：访问修饰符 属性类型 属性名(**public int name**); 
2. 访问修饰符： 控制属性的访问范围 有四种访问修饰符 public, proctected, 默认, private 
3. 属性的定义类型可以为任意类型，包含基本类型或引用类型 
4. 属性如果不赋值，有默认值，规则和数组一致。
   具体说: int 0，short 0, byte 0, long 0, float 0.0,
   double 0.0，char \u0000， boolean false，String null

##### 创建对象

```java
//1. 先声明再创建
Cat cat; //声明对象 cat
cat = new Cat(); //创建

//1. 直接创建
Cat cat = new Cat();
```

##### 访问属性

```java
cat.name;
cat.age;
cat.color;
```

##### 类和对象的内存分配机制

**Java 内存的结构分析:** 

1. 栈： 一般存放基本数据类型(局部变量) 
2. 堆： 存放对象(Cat cat , 数组等) 
3. 方法区：常量池(常量，比如字符串)， 类加载信息

```java
//简单流程分析
Person p = new Person();
p.name = “jack”;
p.age = 1

/**
1) 先加载 Person 类信息(属性和方法信息, 只会加载一次)
2) 在堆中分配空间, 进行默认初始化(看规则)
3) 把地址赋给 p , p 就指向对象
4) 进行指定初始化，比如 p.name =”jack” p.age = 10  
*/

```

![image-20240229152024847](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240229152024847.png)

#### 成员方法

在某些情况下，我们要需要定义成员方法(简称方法)。比如人类:除了有一些属性外( 年龄，姓名..),我们人类还有一 些行为比如:可以说话、跑步..,通过学习。这时就要用成员方法才能完成。

##### 基本使用

```java
//1. 方法写好后，如果不去调用(使用)，不会输出
//2. 先创建对象 ,然后调用方法即可
Person p1 = new Person();
p1.speak(); //调用方法

class Person {
	String name;
	int age;
    
    public void speak() {
        System.out.println("我是一个好人");
    }
    
    public int getSum(int num1, int num2) {
        int res = num1 + num2;
        return res;
    }
}
```

##### 方法的调用机制原理

![image-20240229152600039](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240229152600039.png)

##### 成员方法的定义

![image-20240229152732957](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240229152732957.png) 

1. **访问修饰符**： (作用是控制 方法使用的范围) 如果不写默认访问，[有四种: public, protected, 默认, private]

2. **返回数据类型**：

   1. 一个方法最多有一个返回值 [如果返回多个结果 **返回数组** ]
   2. 返回类型可以为任意类型，包含基本类型或引用类型(数组，对象)
   3. 如果方法要求有返回数据类型，则方法体中最后的执行语句必须为 return 值; 而且要求返回值类型必须和 return 的 值类型一致或兼容
   4. 如果方法是 void，则方法体中可以没有 return 语句，或者 只写 **return ;**

3. **方法名**：遵循驼峰命名法，最好见名知义，表达出该功能的意思即可

4. **参数列表**：

   ![image-20240229153308376](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240229153308376.png) 

##### 方法调用细节

![image-20240229153450642](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240229153450642.png)

#### 成员方法传参机制

**基本数据类型的传参机制**

![image-20240229153624402](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240229153624402.png) 

**引用数据类型的传参机制**

引用类型传递的是地址（传递也是值，但是值是地址），可以通过形参影响实参

#### 方法递归调用

递归就是方法**自己调用自己**,每次调用时传入不同的变量.递归有助于编程者解决复杂问题,同时可以让代码变 得简洁

**递归重要规则**

![image-20240229153906120](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240229153906120.png)

![image-20240229154053516](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240229154053516.png)

#### 方法重载

java 中允许同一个类中，多个同名方法的存在，但要求 形参列表不一致！

**好处：**

1) 减轻了起名的麻烦 
2) 减轻了记名的麻烦

```java
class MyCalculator {
    //一个整数，一个 double 的和
    public double calculate(int n1, double n2) {
    	return n1 + n2;
    }
    //一个 double ,一个 Int 和
    public double calculate(double n1, int n2) {
        System.out.println("calculate(double n1, int n2) 被调用..");
        return n1 + n2;
    }
}
```

**细节:**

![image-20240301084526792](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240301084526792.png) 

![image-20240301084546628](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240301084546628.png) 

####  可变参数

java 允许将**同一个类中多个同名同功能但参数个数不同**的方法，封装成一个方法。 就可以通过可变参数实现。

**基本语法：**

![image-20240301084725289](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240301084725289.png) 

```java
public int sum(int... nums) {
    //System.out.println("接收的参数个数=" + nums.length);
    int res = 0;
    for(int i = 0; i < nums.length; i++) {
    	res += nums[i];
    }
    return res;
}
```

**细节：**

![image-20240301084907686](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240301084907686.png) 

```java
//细节: 可变参数可以和普通类型的参数一起放在形参列表，但必须保证可变参数在最后
public void f2(String str, double... nums) {
}

//细节: 一个形参列表中只能出现一个可变参数
//下面的写法是错的. 
public void f3(int... nums1, double... nums2) {
}
```

#### 作用域

![image-20240301085201052](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240301085201052.png) 

**注意事项和细节使用:**

![image-20240301085248768](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240301085248768.png) 

#### 构造方法

构造方法又叫构造器(constructor)，是类的一种特殊的方法，它的主要作用是完成对新对象的初始化。它有几个特点：

1) 方法名和类名相同 
2) 没有返回值 
3) 在创建对象时，系统会自动的调用该类的构造器完成对象的初始化。

**基本语法：**

![image-20240301085351515](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240301085351515.png) 

1) 构造器的修饰符可以默认， 也可以是 public protected private 
2) 构造器没有返回值 
3) 方法名 和类名字必须一样 
4) 参数列表 和 成员方法一样的规则 
5) 构造器的调用, 由系统完成

**注意事项和使用细节：**

![image-20240301085756408](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240301085756408.png) 

```java
public class ConstructorDetail {
	//编写一个 main 方法
    public static void main(String[] args) {
        Person p1 = new Person("king", 40);//第 1 个构造器
        Person p2 = new Person("tom");//第 2 个构造器
        Dog dog1 = new Dog();//使用的是默认的无参构造器
    }
}

class Dog {
    //如果程序员没有定义构造器，系统会自动给类生成一个默认无参构造器(也叫默认构造器)
}

class Person {
    String name;
    int age; //默认0
    
    //第 1 个构造器
	public Person(String pName, int pAge) {
        name = pName;
        age = pAge;
	}
    
   //第 2 个构造器, 只指定人名，不需要指定年龄
    public Person(String pName) {
    	name = pName;
    }
}
    
```

#### 对象创建的流程分析

![image-20240301090245190](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240301090245190.png) 

####  this 关键字

简单的说，那个对象调用，this就代表那个对象。

1. this 关键字可以用来访问本类的属性、方法、构造器 
2. this 用于区分当前类的属性和局部变量 
3. **访问成员方法的语法：this.方法名(参数列表)**
4. **访问构造器语法：this(参数列表)**; 注意:只能在构造器中使用(即**只能在构造器中**访问另外一个构造器, **必须放在第一 条语句**)
5. this 不能在类定义的外部使用，只能在类定义的方法中使用

#### 本章作业

![image-20240301090818873](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240301090818873.png) 

![image-20240301090832365](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240301090832365.png) 

![image-20240301090848648](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240301090848648.png) 

![image-20240301090904456](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240301090904456.png) 

![image-20240301090915425](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240301090915425.png) 

### 08：面向对象编程(中级)

#### 包

**作用：**

![image-20240302082554681](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240302082554681.png) 

**语法：**

![image-20240302082641790](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240302082641790.png) 

**本质：**

![image-20240302082724253](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240302082724253.png) 

**命名：**

![image-20240302082824346](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240302082824346.png) 

**细节：**

![image-20240302083016432](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240302083016432.png) 

![image-20240302082932774](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240302082932774.png) 

#### 访问修饰符

java 提供四种访问控制修饰符号，用于控制方法和属性(成员变量)的访问权限（范围）：

1) 公开级别:用 **public** 修饰,对外公开 
2) 受保护级别:用 **protected** 修饰,对子类和同一个包中的类公开 
3) 默认级别:**没有修饰符号**,向同一个包的类公开
4) 私有级别:用 **private** 修饰,只有类本身可以访问,不对外公开

![image-20240302094024820](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240302094024820.png) 

**注意事项：**

![image-20240302083342543](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240302083342543.png) 

#### 封装

![image-20240302103331943](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240302103331943.png) 

**好处：**

![image-20240302103402079](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240302103402079.png) 

**实现步骤：**

![image-20240302103503236](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240302103503236.png) 

**将构造器和 setXxx 结合：**

![image-20240302103609067](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240302103609067.png) 

#### 继承

继承可以解决代码复用,让我们的编程更加靠近人类思维.**当多个类存在相同的属性(变量)和方法时,可以从这些类中 抽象出父类**,在父类中定义这些相同的属性和方法，所有的子类不需要重新定义这些属性和方法，只需要通过 **extends 来 声明**继承父类即可。

![image-20240302103743228](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240302103743228.png) 

**继承的基本语法：**

![image-20240302103821353](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240302103821353.png) 

**好处：**

1) 代码的复用性提高了 
2) 代码的扩展性和维护性提高了

**继承细节：**

1. 子类继承了所有的属性和方法，非私有的属性和方法可以在子类直接访问, 但是私有属性和方法不能在子类直接访 问，要通过父类提供公共的方法去访问
2. 子类**必须调用父类的构造器**， 完成父类的初始化
3. 当创建子类对象时，不管使用子类的哪个构造器，**默认情况下总会去调用父类的无参构造器**，如果**父类没有提供无参构造器，则必须在子类的构造器中用 super 去指定**使用父类的哪个构造器完成对父类的初始化工作，否则，编译不会通过
4. 如果希望指定去调用父类的某个构造器，则显式的调用一下 : **super(参数列表）**
5. super 在使用时，**必须放在构造器第一行(super 只能在构造器中使用)**
6. super() 和 this() 都只能放在构造器第一行，因此这**两个方法不能共存在一个构造器**
7. java 所有类都是 Object 类的子类, Object 是所有类的基类
8. 父类构造器的调用不限于直接父类，将一直往上追溯直到 Object 类(顶级父类）
9. 子类最多只能继承一个父类(指直接继承)，即 **java 中是单继承机制**
10. 不能滥用继承，**子类和父类之间必须满足 is-a 的逻辑关系**

**继承的本质分析：**

![image-20240302104358566](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240302104358566.png) 

**查找关系：**

1. 首先看子类是否有该属性
2. 如果子类有这个属性，并且可以访问，则返回信息
3. 如果子类没有这个属性，就看父类有没有这个属性(如果父类有该属性，并且可以访问，就返回信息..)
4. 如果父类没有就按照(3)的规则，继续找上级父类，直到 Object..

**内存布局：**

![image-20240302104638634](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240302104638634.png) 

#### super关键字

super 代表父类的引用，用于访问**父类的属性、方法、构造器**

**语法：**

![image-20240302113723098](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240302113723098.png) 

```java
System.out.println(n1);
System.out.println(this.n1);
//n1 和 this.n1 查找的规则是
//(1) 先找本类，如果有，则调用
//(2) 如果没有，则找父类(如果有，并可以调用，则调用)
//(3) 如果父类没有，则继续找父类的父类,整个规则，就是一样的,直到 Object 类
// 提示：如果查找属性的过程中，找到了，但是不能访问， 则报错, cannot access
// 如果查找属性的过程中，没有找到，则提示属性不存在
    
System.out.println(super.n1);
//找 n1 (super.n1) 的顺序是直接查找父类属性，其他的规则一样
```

**细节：**

![image-20240302114122709](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240302114122709.png) 

#### super 和 this 的比较

![image-20240302114230453](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240302114230453.png) 

#### 方法重写

![image-20240302114331887](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240302114331887.png) 

**细节：**

![image-20240302114413515](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240302114413515.png) 

**方法重写与方法重载区别：**

![image-20240302134050595](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240302134050595.png) 

#### 多态

方法或对象具有多种形态。是面向对象的第三大特征，多态是建立在封装和继承基础之上的。

##### 多态的具体体现

1. 方法的多态：重写和重载体现多态
2. 对象的多态：

 ![image-20240302161158753](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240302161158753.png)

##### 多态注意事项和细节

1. 多态的前提是：两个对象(类)存在继承关系

2. 多态的**向上转型**
   ![image-20240302161318650](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240302161318650.png)

   为什么不能调用子类的特有成员？因为在编译阶段，能调用哪些成员,是由编译类型来决定的。

   最终运行效果看子类(运行类型)的具体实现, 即调用方法时，按照从子类(运行类型)开始查找方法，然后调用规则我前面我们讲的方法调用规则一致

3. 多态**向下转型**
   ![image-20240302161406048](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240302161406048.png)

4. **instanceOf 比较操作符**，用于判断对象的**运行类型**是否为 XX 类型或 XX 类型的子类型

![image-20240302161851944](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240302161851944.png) 

##### java 的动态绑定机制

![image-20240302162152620](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240302162152620.png) 

##### 多态的应用

1. 多态数组：数组的定义类型为父类类型，里面保存的实际元素类型为子类类型
   应用实例:现有一个继承结构如下，要求创建 1 个 Person 对象、2 个 Student 对象和 2 个 Teacher 对象, 统一放在数组 中，并调用每个对象 say 方法

   ```java
   Person[] persons = new Person[5];
   
   persons[0] = new Person("jack", 20);
   persons[1] = new Student("mary", 18, 100);
   persons[2] = new Student("smith", 19, 30.1);
   persons[3] = new Teacher("scott", 30, 20000);
   persons[4] = new Teacher("king", 50, 25000);
   ```

2. 多态参数
   ![image-20240302162658189](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240302162658189.png)

#### Object 类详解

##### equals 方法

==和 equals 的对比：

![image-20240302190357187](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240302190357187.png) 

![image-20240303155917455](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240303155917455.png)

##### hashCode 方法

![image-20240302190736043](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240302190736043.png) 

1. 两个引用，如果指向的是同一个对象，则哈希值肯定是一样的
2. 两个引用，如果指向的是不同对象，则哈希值是不一样的 
3. 哈希值主要根据地址号来的，不能完全将哈希值等价于地址

##### toString 方法

1. 基本介绍：

   默认返回：全类名+@+哈希值的十六进制，【查看 Object 的 toString 方法】

   子类往往重写 toString 方法，用于返回对象的属性信息

2. 重写 toString 方法，打印对象或拼接对象时，都会自动调用该对象的 toString 形式

3. **当直接输出一个对象时，toString 方法会被默认的调用**, 比如 System.out.println(monster)； 就会默认调用 monster.toString()

##### finalize 方法

1. 当对象被回收时，系统自动调用该对象的 finalize 方法。子类可以重写该方法，做一些释放资源的操作
2. 什么时候被回收：当某个对象没有任何引用时，则 jvm 就认为这个对象是一个垃圾对象，就会使用垃圾回收机制来 销毁该对象，在销毁该对象前，会先调用 finalize 方法。 
3. 垃圾回收机制的调用，是由系统来决定(即有自己的 GC 算法), 也可以通过 **System.gc()** 主动触发垃圾回收机制
4. **我们在实际开发中，几乎不会运用 finalize , 所以更多就是为了应付面试.**

#### 本章作业：

![image-20240303111746815](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240303111746815.png) 

![image-20240303111800007](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240303111800007.png) 

![image-20240303151844489](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240303151844489.png) 

![image-20240303111843504](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240303111843504.png) 

![image-20240303111906766](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240303111906766.png) 

### 10：面向对象编程(高级)

#### 类变量和类方法

##### 类变量

![image-20240305155410347](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240305155410347.png) 

**定义：**

![image-20240305155451552](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240305155451552.png) 

**访问类变量:**

![image-20240305155627145](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240305155627145.png) 

```java
class AA {
    public static void num;
}

AA.num;
//或者
new AA().num;
```

**细节：**

![image-20240305155841863](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240305155841863.png) 

##### 类方法

![image-20240305160024564](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240305160024564.png) 

![image-20240305160055714](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240305160055714.png) 

如果我们希望不创建实例，也可以调用某个方法(即当做工具来使用），这时，把方法做成静态方法时非常合适。

**类方法经典的使用场景：**

![image-20240305160248348](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240305160248348.png) 

**细节：**

![image-20240305160332732](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240305160332732.png) 

#### main方法

**理解 main 方法：**

![image-20240305160726592](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240305160726592.png) 

**特别提示：**

1) 在 main()方法中，我们可以直接调用 main 方法所在类的静态方法或静态属性。 
2) 但是，不能直接访问该类中的非静态成员，必须创建该类的一个实例对象后，才能通过这个对象去访问类中的非静态成员

**在idea中传递参数：**

![image-20240305160928734](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240305160928734.png) 

#### 代码块

##### 基本介绍

![image-20240305161018264](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240305161018264.png) 

##### 基本语法

![image-20240305161102528](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240305161102528.png) 

##### 代码块的好处

 ![image-20240305161233498](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240305161233498.png) 

##### 代码块的细节讨论

![image-20240305161346185](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240305161346185.png) 

![image-20240305161525158](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240305161525158.png) 

![image-20240305161643324](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240305161643324.png) 

![image-20240305161710575](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240305161710575.png) 

#### 单例模式

**什么是设计模式：**

![image-20240305200508550](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240305200508550.png) 

**什么是单例模式：**

![image-20240305200419112](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240305200419112.png) 

##### **饿汉式：**

```java
//步骤[单例模式-饿汉式]
//1. 将构造器私有化
//2. 在类的内部直接创建对象(该对象是 static)
//3. 提供一个公共的 static 方法，返回 gf 对象
class GirlFriend {
	private String name;
    //2. 在类的内部直接创建对象(该对象是 static)
    private static GirlFriend gf = new GirlFriend("小红红");
    //1. 将构造器私有化
    private GirlFriend(String name) {
		System.out.println("構造器被調用.");
		this.name = name;
	}
    //3. 提供一个公共的 static 方法，返回 gf 对象
    public static GirlFriend getInstance() {
		return gf;
    }
}
```

##### **懒汉式：**

```java
//步骤[单例模式-懒式]
//1. 将构造器私有化
//2. 在类的内部定义一个对象(该对象是 static)
//3. 提供一个公共的 static 方法，返回 Cat 对象
//4. 只有当用户调用getInstance这个公用方法时，才会真正创建Cat对象
class Cat {
    private String name;
    public static int n1 = 999;
    //2. 在类的内部定义一个对象(该对象是 static)
    private static Cat cat ; //默认是 null
    //1. 将构造器私有化
    private Cat(String name) {
        this.name = name;
    }
    //3. 提供一个公共的 static 方法，返回 Cat 对象
    public static Cat getInstance() {
        if(cat == null) {//如果还没有创建cat对象，就创建一个
        	cat = new Cat("小可愛");
        }
        return cat;
   	}
}
```

##### 饿汉式 VS 懒汉式

![image-20240305201445529](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240305201445529.png) 

#### final关键字

**基本介绍：**

![image-20240305205312151](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240305205312151.png) 

**细节：**

![image-20240305205404737](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240305205404737.png) 

![image-20240305205506115](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240305205506115.png) 

#### 抽象类

**理解：**

![image-20240306085546788](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240306085546788.png) 

父类方法不确定性的问题 ===> 考虑将该方法设计为抽象(abstract)方法 ===> 所谓抽象方法就是没有实现的方法 ===> 所谓没有实现就是指，没有方法体 ===> 当一个类中存在抽象方法时，需要将该类声明为 abstract 类 ==> 一般来说，抽象类会被继承，有其子类来实现抽象方法

**介绍：**

![image-20240306085841810](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240306085841810.png) 

**细节：**

![image-20240306085933576](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240306085933576.png) 

![image-20240306090007586](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240306090007586.png) 

![image-20240306090038794](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240306090038794.png) 

不能用static是因为static声明的静态成员可以直接被类调用，而抽象类就只有被继承的能力。

#### 模板设计模式

**基本介绍：**

![image-20240306093306421](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240306093306421.png) 

**模板设计模式能解决的问题：**

![image-20240306093354767](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240306093354767.png) 

```java
abstract public class Template { //抽象类-模板设计模式
    public abstract void job();//抽象方法
    
    public void calculateTime() {//实现方法，调用 job 方法
        //得到开始的时间
        long start = System.currentTimeMillis();
        job(); //动态绑定机制
        //得的结束的时间
        long end = System.currentTimeMillis();
        System.out.println("任务执行时间 " + (end - start));
  	}
}
 
class AA extends Template {
    @Override
    public void job() { //实现 Template 的抽象方法 job
        long num = 0;
        for (long i = 1; i <= 800000; i++) {
        	num += i;
        }
    }
}

class BB extends Template {
    @Override
    public void job() { //实现 Template 的抽象方法 job
        long num = 0;
        for (long i = 1; i <= 600000; i++) {
        	num += i;
        }
    }
}      
```

#### 接口

##### 为什么有接口

![image-20240306105841413](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240306105841413.png) 

##### 基本介绍

![image-20240306105933451](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240306105933451.png) 

##### 注意事项和细节

![image-20240306110040799](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240306110040799.png) 

![image-20240306110118438](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240306110118438.png) 

##### 实现接口 vs 继承

![image-20240306110244415](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240306110244415.png) 

小结: 

1. 当子类继承了父类，就自动的拥有父类的功能

2. 如果子类需要扩展功能，可以通过实现接口的方式扩展.（可以理解 实现接口 是 对 java 单继承机制的一种补充）

```java
//猴子
class Monkey {
    public String name;
    public Monkey(String name) {
    	this.name = name;
    }
    public void climbing() {
    System.out.println(name + " 会爬树...");
    }
}
//鱼
interface Fishable {
	void swimming();
}
//鸟
interface Birdable {
	void flying();
} 

//小猴子继承了猴子的爬树，小猴子实现了与鱼的游泳和鸟的飞翔
class LittleMonkey extends Monkey implements Fishable,Birdable {
    public LittleMonkey(String name) {
		super(name);
	}
    @Override
    public void swimming() {
    	System.out.println(getName() + " 通过学习，可以像鱼儿一样游泳...");
    }
    @Override
    public void flying() {
    	System.out.println(getName() + " 通过学习，可以像鸟儿一样飞翔...");
    }
}
```

![image-20240306110811731](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240306110811731.png) 

##### 接口的多态特性

![image-20240306110901095](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240306110901095.png) 

##### 接口练习

```java
interface A {
	int x = 0;
}
class B {
	int x = 1;
}
class C extends B implements A {
    public void pX() {
		System.out.println(x); //错误，x是A的还是B的，模糊
        // 改
        System.out.println(A.x + " " + super.x);
        //可以明确的指定 x
        //访问接口的 x 就使用 A.x
        //访问父类的 x 就使用 super.x
    }
}
```

#### 内部类

1. 如果**定义在局部位置**(方法中/代码块) :
   1. 局部内部类（有类名）
   2. 匿名内部类（**没有类名，重点！！！**）

2. 定义在成员位置
   1. 成员内部类
   2. 静态内部类（有static修饰）

##### 基本介绍

![image-20240306143853579](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240306143853579.png) 

##### 基本语法

![image-20240306143954630](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240306143954630.png) 

##### 局部内部类

![image-20240306144054269](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240306144054269.png) 

```java
class Outer02 {//外部类
    private int n1 = 100;
    private void m2() {
    	System.out.println("Outer02 m2()");
	}//私有方法
    public void m1() {//方法
        ////2.不能添加访问修饰符,但是可以使用 final 修饰
        final class Inner02 {//局部内部类(本质仍然是一个类)
            private int n1 = 800;
            public void f1() {
                //7.如果外部类和局部内部类的成员重名时,使用 外部类名.this.成员去访问
                System.out.println("n1=" + n1 + " 外部类的 n1=" + Outer02.this.n1);
                //4.局部内部类可以直接访问外部类的成员
                m2();
            }
            //5.外部类在方法中，可以创建 Inner02 对象，然后调用方法即可
            Inner02 inner02 = new Inner02;
            inner02.f1();
        }
    }
}     
```

##### 匿名内部类

![image-20240306145355085](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240306145355085.png) 

![image-20240306145446514](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240306145446514.png) 

```java
//需求是Tiger类只是使用一次，后面再不使用,可以使用匿名内部类来简化开发

class Outer04 { //外部类
	private int n1 = 10;//属性
    public void method() {//方法
        //基于接口的匿名内部类
        IA tiger = new IA() {
        //tiger 的编译类型 是 IA，
        //tiger 的运行类型是匿名内部类 Outer04$1(系统自动生成的)
            @Override
            public void cry() {
            	System.out.println("老虎叫唤...");
            }
        }
        //jdk 底层在创建匿名内部类 Outer04$1,然后立即马上就创建了 Outer04$1,并把地址返回给tiger
      	//**********************************************
        //类似于
        class Outer04$1 implements IA {
            @Override
            public void cry() {
            	System.out.println("老虎叫唤...");
            }
     	}
        //**********************************************
        System.out.println("tiger 的运行类型=" + tiger.getClass())
    	tiger.cry();
    }
}
   
interface IA {//接口
	public void cry();
} 
```

**最佳实践：当做实参直接传递，简洁高效。**

```java
public class InnerClassExercise01 {
	public static void main(String[] args) {
        //当做实参直接传递，简洁高效
        f1(new IL() {
        	@Override
        	public void show() {
       			System.out.println("这是一副名画~~...");
        	}
		});
    }
}
//接口
interface IL {
	void show();
}
```

##### 成员内部类

![image-20240306151747626](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240306151747626.png) 

![image-20240306151802370](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240306151802370.png) 

![image-20240306151831810](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240306151831810.png) 

**外部其他类 使用成员内部类：**

```java
class Outer08 { //外部类
	public class Inner08 {//成员内部类
        public void say() {
            System.out.println("你好");
        }
    }
}
public class Test {//外部类其他类
    public static void main(String[] args) {
        //方式 1
		//outer08.new Inner08(); 相当于把 new Inner08()当成outer08的成员
        // 这就是一个语法，不要特别的纠结
        Outer08.Inner08 inner08 = outer08.new Inner08();
        inner08.say();
        //方式 2
		//编写一个方法，可以返回成员内部类的对象实例.
    }
}
```

##### 静态内部类

![image-20240306151901882](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240306151901882.png) 

**外部其他类 使用静态内部类：**

```java
class Outer10 { //外部类
    static class Inner10 {
        public void say() {
            System.out.println("你好");
        }
    }
}
public class Test {//外部类其他类
    public static void main(String[] args) {
        //方式 1
		//因为静态内部类，是可以通过类名直接访问(前提是满足访问权限)
        Outer10.Inner10 inner10 = new Outer10.Inner10();
        inner10.say();
        //方式 2
		//编写一个方法，可以返回静态内部类的对象实例.
    }
}
```

### 11：枚举和注解

#### 枚举

1) 枚举对应英文(enumeration, 简写 enum) 
2) 枚举是一组常量的集合
3) 可以这里理解：枚举属于一种特殊的类，里面只包含一组有限的特定的对象。

**枚举的二种实现方式：**

1) 自定义类实现枚举 
2) 使用 enum 关键字实现枚举

##### 增强for循环

```java
int[] nums = {1,2,3,4,5,6};

//执行流程是 依次从 nums 数组中取出数据，赋给 i, 如果取出完毕，则退出 for
for (int i : nums) {
    System.out.println("i=" + i);
}
```

##### 自定义枚举

![image-20240307101028951](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240307101028951.png) 

**步骤：**

1. 将构造器私有化,目的防止 直接 new 
2. 去掉 setXxx 方法, 防止属性被修该
3. 在 Season 内部，直接创建固定的对象 
4. 优化，可以加入 final 修饰符

```java
class Season {
    private String name;
    private String desc;//描述
    
    //3.在 Season 内部，直接创建固定的对象 
    //4.优化，可以加入 final 修饰符
    public static final Season SPRING = new Season("春天", "温暖");
    public static final Season WINTER = new Season("冬天", "寒冷");
    public static final Season AUTUMN = new Season("秋天", "凉爽");
    public static final Season SUMMER = new Season("夏天", "炎热");
    
    //1.将构造器私有化,目的防止 直接 new 
    private Season(String name, String desc) {
        this.name = name;
        this.desc = desc;
	}
```

**进行自定义类实现枚举，有如下特点：**

1) 构造器私有化 
2) 本类内部创建一组对象[四个 春夏秋冬]
3) 对外暴露对象（通过为对象添加 public final static 修饰符）
4) 可以提供 get 方法，但是不要提供 set

##### enum 枚举

###### enum 来实现枚举

1. 使用关键字 enum 替代 class
2. public static final Season SPRING = new Season("春天", "温暖")   ====》**SPRING("春天", "温暖")** 解读 常量名(实参列表) 
3. **如果有多个常量(对象)， 使用 ,号间隔即可**
4. **常量对象的定义要写在最前面** 
5. 如果我们使用的是无参构造器，创建常量对象，则可以省略 **括号（）**

```java
//1.使用关键字 enum 替代 class
enum Season2 {
    //2.public static final Season SPRING = new Season("春天", "温暖")   ====》SPRING("春天", "温暖")
    //解读 常量名(实参列表) 
	SPRING("春天", "温暖"), 
    WINTER("冬天", "寒冷"), //3.如果有多个常量(对象)， 使用 ,号间隔
    AUTUMN("秋天", "凉爽"),
    SUMMER("夏天", "炎热");
    //4. 常量对象的定义要写在最前面
    
    //What() ==> what;  5.如果我们使用的是无参构造器，创建常量对象，则可以省略 括号（）
    
    private String name;
	private String desc;//描述
    
    //默认是私有的
    Season2(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }
    
    private Season2() {//无参构造器
	}
}
```

###### **注意事项**

1. 当我们使用 enum 关键字开发一个枚举类时，**默认会继承 Enum 类**, **而且是一个 final 类**,可以使用 javap 工 具来演示 
2. 传统的 public static final Season2 SPRING = new Season2("春天", "温暖"); **简化成 SPRING("春天", "温暖")**， 这里必须知道，它调用的是哪个构造器. 
3. 如果使用无参构造器 创建 枚举对象，则实参列表和小括号都可以省略
4. 当有多个枚举对象时，使用,间隔，**最后有一个分号结尾** 
5. **枚举对象必须放在枚举类的行首**

![image-20240307102849743](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240307102849743.png) 

###### enum 常用方法

说明：使用关键字 enum 时，会隐式继承 Enum 类, 这样我们就可以使用 Enum 类相关的方法。

1) **toString**:Enum 类已经重写过了，返回的是当前对象 名,子类可以重写该方法，用于返回对象的属性信息 
2) **name**：返回当前对象名（常量名），子类中不能重写
   System.out.println(==autumn.name()==);
3) **ordinal**：返回当前对象的位置号，默认从 0 开始
   System.out.println(==autumn.ordinal()==);
4) **values**：返回当前枚举类中所有的常量
   Season2[] values = ==Season2.values()==;
5) **valueOf**：将字符串转换成枚举对象，要求字符串必须 为已有的常量名，否则报异常！
   Season2 autumn1 = ==Season2.valueOf("AUTUMN")==;
6) **compareTo**：比较两个枚举常量，比较的就是编号！
   System.out.println(==Season2.AUTUMN.compareTo(Season2.SUMMER)==)

###### enum 实现接口

1. 使用 enum 关键字后，就不能再继承其它类了，**因为 enum 会隐式继承 Enum，而 Java 是单继承机制**。 

2. 枚举类和普通类一样，可以实现接口，如下形式。 
   **enum 类名 implements 接口 1，接口 2{}**

   ```java
   interface IPlaying {//接口
   	public void playing();
   }
   
   enum Music implements IPlaying {//枚举类实现接口
       CLASSICMUSIC;
       @Override
       public void playing() {
       	System.out.println("播放好听的音乐...");
       }
   }
   ```

#### 注解

##### 注解的理解

1) 注解(Annotation)，**用于修饰解释** 包、类、方法、属性、构造器、局部变量等数据信息。
2) 和注释一样，注解不影响程序逻辑，但注解可以被编译或运行，**相当于嵌入在代码中的补充信息**。
3) 注解是以"@注释名"在代码中存在的，还可以添加一些参数值 , 例如:@SuppressWarnings(value="unchecked")

##### 内置注解

###### @Override

![image-20240307105801970](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240307105801970.png) 

![image-20240307105835684](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240307105835684.png) 

###### @Deprecated

@Deprecated: 用于表示某个程序元素(类, 方法等)已过时

![image-20240307105919709](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240307105919709.png) 

###### @SuppressWarnings

@SuppressWarnings: 抑制编译器警告

![image-20240307110004803](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240307110004803.png) 

##### 元注解

元注解的作用就是负责注解其他注解 , Java定义了4个标准的meta-annotation类型,他们被用来提供 对其他annotation类型作说明 .

这些类型和它们所支持的类在java.lang.annotation包中可以找到 .( @Target , @Retention , @Documented , @Inherited )

**@Target** : 用于描述注解的使用范围(即:被描述的注解可以用在什么地方) 

**@Retention** : 表示需要在什么级别保存该注释信息 , 用于描述注解的生命周期 (SOURCE < CLASS < RUNTIME) 

**@Document**：说明该注解将被包含在javadoc中 

**@Inherited**：说明子类可以继承父类中的该注解

```java
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.SOURCE)
public @interface Override {
}

@Target({TYPE, FIELD, METHOD, PARAMETER, CONSTRUCTOR, LOCAL_VARIABLE})
@Retention(RetentionPolicy.SOURCE)
public @interface SuppressWarnings {
    String[] value();
}

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(value={CONSTRUCTOR, FIELD, LOCAL_VARIABLE, METHOD, PACKAGE, PARAMETER, TYPE})
public @interface Deprecated {
}
```

##### 自定义注解

使用 @interface自定义注解时 , 自动继承了java.lang.annotation.Annotation接口。

1. @ interface用来声明一个注解 , 格式 : **public @ interface 注解名 { 定义内容 }** 

2. 配置参数，虽然带有括号，但是本质上是一个变量而不是方法，格式：**类型 变量名();**

3. @Target()和@Retention()，**这两个元注解是必须要写的**，而且一般自定义的注解都是全部保存到，即**RetentionPolicy.RUNTIME**

4. 可以通过default来声明参数的默认值 ，格式：**类型 变量名() default 默认值**;
   注解元素必须要有值 , 我们定义注解元素时 , 经常使用空字符串,0作为默认值 .

5. 如果**只有一个参数成员 , 一般参数名为value** ，这有一个好处，当使用这个自定义注解传入参数时，value可以省略不写，如果是别的参数名，就必须要写

```java
public class Test01 {
    //显示定义值 / 不显示值就是默认值
    @MyAnnotation(name="陈俊宇",age=23,id=1,schools = {"湖北大学"})
    public void test() {

    }

    //只有一个参数, 默认名字一般是value.使用可省略不写
    @MyAnnotation2("aaa")
    public void test2() {

    }

}

@Target(value = {ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotation {
    String name() default "";
    int age() default 0;
    int id() default -1; //String indexOf("abc") -1 , 不存在,找不到
    String[] schools() default {"清华大学"};
}

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotation2 {
    String[] value();
}
```





#### 本章作业

![image-20240307110345574](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240307110345574.png) 

![image-20240307110359777](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240307110359777.png) 

### 12：异常

#### 异常介绍

![image-20240307174052378](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240307174052378.png) 

#### 异常体系图

![image-20240307174200505](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240307174200505.png) 

![image-20240307174225877](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240307174225877.png) 

#### 运行时异常

对于运行时异常，可以不作处理，因为这类异常很普遍，若全处理可能会对程序的可读性和运行效率产生影响。

**常见的运行时异常：**

1) NullPointerException 空指针异常 
   当应用程序试图在**需要对象的地方使用null时**，抛出该异常
2) ArithmeticException 数学运算异常 
   当出现异常的运算条件时，抛出此异常。例如，**一个整数“除以零”**时，抛出此类的一个实例
3) ArrayIndexOutOfBoundsException 数组下标越界异常
   **用非法索引访问数组时抛出的异常**。如果索引为负或大于等于数组大小，则该索引为非法索引
4) ClassCastException 类型转换异常 
   当**试图将对象强制转换为不是实例的子类时**，抛出该异常，例如：在向上转型和向下转型的时候
5) NumberFormatException 数字格式不正确异常
   当应用程序**试图将字符串转换成一种数值类型**，但该字符串不能转换为适当格式时，抛出该异常

#### 编译异常

编译异常是指在编译期间，就必须处理的异常，否则代码不能通过编译。

**常见的编译异常：**

![image-20240307175609545](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240307175609545.png) 

#### 异常处理

异常处理就是当异常发生时，对异常处理的方式。

**异常处理的方式：**

1. try-catch-finally

2. throws

   ![image-20240307175805347](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240307175805347.png) 

##### try-catch 异常处理

![image-20240307175857673](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240307175857673.png) 

**try-catch 方式处理异常说明：**

![image-20240307180020062](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240307180020062.png) 

**try-catch 方式处理异常-注意事项：**

![image-20240307180104995](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240307180104995.png) 

![image-20240307180120345](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240307180120345.png) 

![image-20240307180148754](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240307180148754.png) 

##### throws异常处理

**介绍：**

![image-20240307180240788](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240307180240788.png) 

![image-20240307175938523](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240307175938523.png) 

**使用细节：**

![image-20240307180330439](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240307180330439.png) 

#### 自定义异常

**基本概念：**

![image-20240307180428334](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240307180428334.png) 

**步骤：**

![image-20240307180446022](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240307180446022.png) 

```java
class AgeException extends RuntimeException {
    public AgeException(String message) {//构造器
		super(message);
	}
}

throw new AgeException("年龄需要在 18~120 之间");
```

#### throw 和 throws 区别

![image-20240307180635727](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240307180635727.png) 

#### 本章作业

![image-20240307180731664](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240307180731664.png) 

![image-20240307180748657](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240307180748657.png) 

### 13：常用类

#### 包装类

##### 包装类的分类

1) 针对八种基本数据类型相应的引用类型—包装类 
2) 有了类的特点，就可以调用类中的方法。

![image-20240308170618202](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240308170618202.png) 

##### 包装类和基本数据

![image-20240308170741778](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240308170741778.png) 

**手动装箱：**

```java
//手动装箱 int->Integer
int n1 = 100;
Integer integer = new Integer(n1);
Integer integer1 = Integer.valueOf(n1);

//手动拆箱 Integer -> int
int i = integer.intValue();
```

**自动装箱：**

```java
//jdk5 后，就可以自动装箱和自动拆箱
//自动装箱 int->Intege
int n2 = 200;
Integer integer2 = n2;//底层使用的是 Integer.valueOf(n2)

//自动拆箱 Integer->int
int n3 = integer2; //底层仍然使用的是 intValue()方法
```

##### 包装类和 String 类

```java
//包装类(Integer)->String
Integer i = 100;//自动装箱
//方式 1
String str1 = i + "";
//方式 2
String str2 = i.toString();
//方式 3
String str3 = String.valueOf(i);

//String -> 包装类(Integer)
String str4 = "12345";
Integer i2 = Integer.parseInt(str4);//使用到自动装箱
Integer i3 = new Integer(str4);//构造
```

####  String 类

##### String 类的理解

![image-20240308171619508](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240308171619508.png) 

![image-20240308171701632](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240308171701632.png) 

```java
//1.String 对象用于保存字符串，也就是一组字符序列

//2. "jack" 字符串常量, 双引号括起的字符序列

//3. 字符串的字符使用 Unicode 字符编码，一个字符(不区分字母还是汉字)占两个字节

//4. String 类有很多构造器，构造器的重载
// 常用的有 String s1 = new String(); //
//String s2 = new String(String original);
//String s3 = new String(char[] a);
//String s4 = new String(char[] a,int startIndex,int count)
//String s5 = new String(byte[] b)

//5. String 类实现了接口 Serializable【String 可以串行化:可以在网络传输】，接口 Comparable [String 对象可以比较大小]

//6. String 是 final 类，不能被其他的类继承

//7. String 有属性 private final char value[]; 用于存放字符串内容

//8. 一定要注意：value 是一个 final 类型， 不可以修改(需要功力)：即 value 不能指向新的地址，但是单个字符内容是可以变
```

##### 创建 String 对象

![image-20240308172017598](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240308172017598.png) 

**两种创建 String 对象的区别：**

![image-20240308172052241](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240308172052241.png) 

![image-20240308172114853](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240308172114853.png) 

##### String 类的常见方法

**String缺点：**

![](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240308172216821.png) 

**String 类的常见方法一览：**

![image-20240308172255299](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240308172255299.png) 

![image-20240308172331604](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240308172331604.png) 

#####  StringBuffer 类

###### **基本介绍：**

![image-20240308172504823](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240308172504823.png) 

```java
//1. StringBuffer 的直接父类 是 AbstractStringBuilder

//2. StringBuffer 实现了 Serializable, 即 StringBuffer 的对象可以串行化

//3. 在父类中 AbstractStringBuilder 有属性 char[] value,不是 final该 value 数组存放 字符串内容，引出存放在堆中的

//4. StringBuffer 是一个 final 类，不能被继承

//5. 因为 StringBuffer 字符内容是存在 char[] value, 所有在变化(增加/删除)

// 不用每次都更换地址(即不是每次创建新对象)， 所以效率高于 String
StringBuffer stringBuffer = new StringBuffer("hello");
```

######  **String VS StringBuffer：**

![image-20240308172848918](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240308172848918.png) 

###### **String 和 StringBuffer 相互转换：**

![image-20240308172914816](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240308172914816.png) 

```java
//看 String——>StringBuffer
String str = "hello tom";
//方式 1 使用构造器
//注意： 返回的才是 StringBuffer 对象，对 str 本身没有影响
StringBuffer stringBuffer = new StringBuffer(str);
//方式 2 使用的是 append 方法
StringBuffer stringBuffer1 = new StringBuffer();
stringBuffer1 = stringBuffer1.append(str);

//看 StringBuffer ->String
StringBuffer stringBuffer3 = new StringBuffer("韩顺平教育");
//方式 1 使用 StringBuffer 提供的 toString 方法
String s = stringBuffer3.toString();
//方式 2: 使用构造器来搞定
String s1 = new String(stringBuffer3)
```

######  StringBuffer 类常见方法

```java
StringBuffer s = new StringBuffer("hello");
//增
s.append(',');// "hello,
s.append("张三丰");//"hello,张三丰"
s.append("赵敏").append(100).append(true).append(10.5);//"hello,张三丰赵敏 100true10.5"

//删
s.delete(11, 14);//"hello,张三丰赵敏 true10.5

//改
s.replace(9, 11, "周芷若");//"hello,张三丰周芷若 true10.5

//插
s.insert(9, "赵敏");//"hello,张三丰赵敏周芷若 true10.5

//长度
s.length()
```

##### StringBuilder 类

###### **基本介绍**

![image-20240308174956149](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240308174956149.png) 

```java
//1. StringBuffer 的直接父类 是 AbstractStringBuilder

//2. StringBuffer 实现了 Serializable, 即 StringBuffer 的对象可以串行化

//3. 在父类中 AbstractStringBuilder 有属性 char[] value,不是 final该 value 数组存放 字符串内容，引出存放在堆中的

//4. StringBuffer 是一个 final 类，不能被继承

//5. 因为 StringBuffer 字符内容是存在 char[] value, 所有在变化(增加/删除),不用每次都更换地址(即不是每次创建新对象)， 所以效率高于 String

StringBuffer stringBuffer = new StringBuffer("hello");

//6. StringBuilder 的方法，没有做互斥的处理,即没有 synchronized 关键字,因此在单线程的情况下使用
```

######  String、StringBuffer 和 StringBuilder 的比较

![image-20240308175326835](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240308175326835.png) 

###### String、StringBuffer 和 StringBuilder 的选择

![image-20240308175436067](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240308175436067.png) 

####  Math 类

Math 类包含用于执行基本数学运算的方法，如初等指数、对数、平方根和三角函数。

**方法一览(均为静态方法)：**

```java
//1.abs 绝对值
int abs = Math.abs(-9);
System.out.println(abs);//9
//2.pow 求幂
double pow = Math.pow(2, 4);//2 的 4 次方
System.out.println(pow);//16
//3.ceil 向上取整,返回>=该参数的最小整数(转成 double);
double ceil = Math.ceil(3.9);
System.out.println(ceil);//4.0
//4.floor 向下取整，返回<=该参数的最大整数(转成 double)
double floor = Math.floor(4.001);
System.out.println(floor);//4.0
//5.round 四舍五入 Math.floor(该参数+0.5)
long round = Math.round(5.51);
System.out.println(round);//6
//6.sqrt 求开方
double sqrt = Math.sqrt(9.0);
System.out.println(sqrt);//3.0

//7.random 求随机数
// random 返回的是 0 <= x < 1 之间的一个随机小数
// 思考：请写出获取 a-b 之间的一个随机整数,a,b 均为整数 ，比如 a = 2, b=7
// 即返回一个数 x 2 <= x <= 7
// 老韩解读 Math.random() * (b-a) 返回的就是 0 <= 数 <= b-a
// (1) (int)(a) <= x <= (int)(a + Math.random() * (b-a +1) )
// (2) 使用具体的数给小伙伴介绍 a = 2 b = 7
// (int)(a + Math.random() * (b-a +1) ) = (int)( 2 + Math.random()*6)
// Math.random()*6 返回的是 0 <= x < 6 小数
// 2 + Math.random()*6 返回的就是 2<= x < 8 小数

//8.max , min 返回最大值和最小值
int min = Math.min(1, 9);
int max = Math.max(45, 90);
System.out.println("min=" + min);
System.out.println("max=" + max);
```

####  Arrays 类

**Arrays 类常见方法：**

![image-20240309110000976](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240309110000976.png) 

![image-20240309110031519](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240309110031519.png) 

```java
3)binarySearch 通过二分搜索法进行查找，要求必须排好
//1. 使用 binarySearch 二叉查找
//2. 要求该数组是有序的. 如果该数组是无序的，不能使用 binarySearch
//3. 如果数组中不存在该元素，就返回 return -(low + 1) // key not found.
```



#### System 类

![image-20240309110213285](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240309110213285.png) 

```java
2）arraycopy()
// srcPos： 从源数组的哪个索引位置开始拷贝
// dest : 目标数组，即把源数组的数据拷贝到哪个数组
// destPos: 把源数组的数据拷贝到 目标数组的哪个索引
// length: 从源数组拷贝多少个数据到目标数组
```

#### 大数类

**BigInteger 、BigDecimal 类：**

![image-20240309110808224](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240309110808224.png) 

**常见方法：**注意这些大数类不能直接+-*/哦，要调用方法

![image-20240309110839015](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240309110839015.png) 

```java
long l = 23788888899999999999999999999l; // 编译会报错
BigInteger bigInteger = new BigInteger("23788888899999999999999999999");
System.out.println(bigInteger);

//1. 在对 BigInteger 进行加减乘除的时候，需要使用对应的方法，不能直接进行 + - * /
//2. 可以创建一个 要操作的 BigInteger 然后进行相应操作
BigInteger add = bigInteger.add(bigInteger2);

//当我们需要保存一个精度很高的数时，double 不够
double d = 1999.11111111111999999999999977788d; //输出时，会截断后面的很多小数
BigDecimal bigDecimal = new BigDecimal("1999.11111111111999999999999977788");

//1. 如果对 BigDecimal 进行运算，比如加减乘除，也需要使用对应的方法
//2. 创建一个需要操作的 BigDecimal 然后调用相应的方法即可
System.out.println(bigDecimal.divide(bigDecimal2));//可能抛出异常 ArithmeticExceptio
//在调用 divide 方法时，指定精度即可. BigDecimal.ROUND_CEILING
//如果有无限循环小数，就会保留 分子 的精度
System.out.println(bigDecimal.divide(bigDecimal2, BigDecimal.ROUND_CEILING))
```

#### 日期类

#####  第一代日期类

![image-20240309111356647](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240309111356647.png) 

```java
//1. 获取当前系统时间
//2. 这里的 Date 类是在 java.util 包
//3. 默认输出的日期格式是国外的方式, 因此通常需要对格式进行转换

Date d1 = new Date(); 
Date d2 = new Date(9234567);  //通过指定毫秒数得到时间

//1. 创建 SimpleDateFormat 对象，可以指定相应的格式
//2. 这里的格式使用的字母是规定好，不能乱写
SimpleDateFormat sdf = new SimpleDateFormat("yyyy 年 MM 月 dd 日 hh:mm:ss E");
String format = sdf.format(d1); // format:将日期转换成指定格式的字符串
System.out.println("当前日期=" + format);
```



#####  第二代日期类

![image-20240309111430624](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240309111430624.png) 

```java
//1. Calendar 是一个抽象类， 并且构造器是 private
//2. 可以通过 getInstance()
//3. 提供大量的方法和字段提供给程序员
//4. Calendar 没有提供对应的格式化的类，因此需要程序员自己组合来输出(灵活)
//5. 如果我们需要按照 24 小时进制来获取时间， Calendar.HOUR ==改成=> Calendar.HOUR_OF_DAY

Calendar c = Calendar.getInstance();
System.out.println("c=" + c);

System.out.println("年：" + c.get(Calendar.YEAR));
// 这里为什么要 + 1, 因为 Calendar 返回月时候，是按照 0 开始编号
System.out.println("月：" + (c.get(Calendar.MONTH) + 1));
//Calender 没有专门的格式化方法，所以需要程序员自己来组合显示
System.out.println(c.get(Calendar.YEAR) + "-" + (c.get(Calendar.MONTH) + 1) + "-" +
					c.get(Calendar.DAY_OF_MONTH) +" " + c.get(Calendar.HOUR_OF_DAY) + ":" + 									c.get(Calendar.MINUTE) + ":" + c.get(Calendar.SECOND) )
```

#####  第三代日期类

**前两代的不足：**

![image-20240309112129814](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240309112129814.png) 

**第三代日期类：**

![image-20240309112237443](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240309112237443.png) 

```java
//1. 使用 now() 返回表示当前日期时间的 对象
LocalDateTime ldt = LocalDateTime.now(); //LocalDate.now();//LocalTime.now()
System.out.println(ldt);

//2. 使用 DateTimeFormatter 对象来进行格式化
// 创建 DateTimeFormatter 对象
DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
String format = dateTimeFormatter.format(ldt);
System.out.println("格式化的日期=" + format);

System.out.println("年=" + ldt.getYear());
System.out.println("月=" + ldt.getMonth());
System.out.println("月=" + ldt.getMonthValue());
System.out.println("日=" + ldt.getDayOfMonth());
System.out.println("时=" + ldt.getHour());
System.out.println("分=" + ldt.getMinute());
System.out.println("秒=" + ldt.getSecond());

//3.提供 plus 和 minus 方法可以对当前时间进行加或者减
//看看 890 天后，是什么时候 把 年月日-时分秒
LocalDateTime localDateTime = ldt.plusDays(890);
//看看在 3456 分钟前是什么时候，把 年月日-时分秒
LocalDateTime localDateTime2 = ldt.minusMinutes(3456);
```

#####  DateTimeFormatter

![image-20240309112551648](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240309112551648.png) 

#####  Instant 时间戳

![image-20240309112619261](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240309112619261.png) 

#### 本章作业

![image-20240309112659936](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240309112659936.png) 

![image-20240309112726941](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240309112726941.png)  

### 14：集合

#### 数组的缺点

前面我们保存多个数据使用的是数组，而数组有不足的地方

![image-20240309162809195](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240309162809195.png) 

#### 集合

**介绍：**

![image-20240309162853015](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240309162853015.png) 

**集合框架体系：**

Java 的集合类很多，主要分为两大类，集合主要是两组(**单列集合** , **双列集合**），Collection 接口有两个重要的子接口 **List** 和**Set** , 他们的实现子类都是单列集；Map 接口的实现子类 是双列集合，存放的 **K-V**

1. **Collection**

   ![](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240309162947303.png) 

2. **Map**

   ![image-20240309163045641](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240309163045641.png) 

#### Collection 接口

#####  **特点**

![image-20240309163352481](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240309163352481.png) 

##### 使用 Iterator遍历

![image-20240309163614699](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240309163614699.png) 

![image-20240309163647889](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240309163647889.png) 

![image-20240309163713779](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240309163713779.png) 

```java
Collection col = new ArrayList();
col.add(new Book("三国演义", "罗贯中", 10.1));
col.add(new Book("小李飞刀", "古龙", 5.1));
col.add(new Book("红楼梦", "曹雪芹", 34.6));

//1. 先得到 col 对应的 迭代器
Iterator iterator = col.iterator();
//2. 使用 while 循环遍历
while (iterator.hasNext()) {//判断是否还有数据
    Object obj = iterator.next();    //返回下一个元素，类型是 Object
    System.out.println("obj=" + obj);
}

//3. 当退出 while 循环后 , 这时 iterator 迭代器，指向最后的元素
iterator.next();//NoSuchElementException

//4. 如果希望再次遍历，需要重置我们的迭代器
iterator = col.iterator();
```

##### 使用增强for 遍历

![image-20240309164237070](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240309164237070.png) 

#### List 接口

 **List 接口基本介绍：**

![image-20240309164428358](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240309164428358.png) 

**List 的三种遍历方式：**

![image-20240309164555204](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240309164555204.png) 

#### ArrayList类

#####  ArrayList 注意事项

![image-20240309164720678](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240309164720678.png) 

##### 底层操作机制

![image-20240309164804936](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240309164804936.png) 

##### 源码分析

![image-20240309165014622](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240309165014622.png)

#### Vector类

**Vector 的基本介绍:**

![image-20240309165133485](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240309165133485.png) 

**Vector 和 ArrayList 的比较:**

![image-20240309165240707](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240309165240707.png) 

#### LinkedList类

 **LinkedList说明：**

![image-20240309165344385](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240309165344385.png) 

**LinkedList 的底层操作机制：**

![image-20240309165456367](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240309165456367.png) 

**ArrayList 和 LinkedList 比较：**

![image-20240309165557406](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240309165557406.png) 

#### Set 接口

**基本介绍：**

![image-20240310154100791](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240310154100791.png) 

**常用方法：**

和 List 接口一样, Set 接口也是 Collection 的子接口，因此，常用方法和 Collection 接口一样

**遍历方式：**

![image-20240310154225134](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240310154225134.png) 

#### HashSet类

##### 介绍

![image-20240310154355827](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240310154355827.png) 

##### 底层机制

**HashMap底层：**

![image-20240310154508648](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240310154508648.png) 

**运行流程：**

![image-20240310154526665](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240310154526665.png) 

![image-20240310154555876](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240310154555876.png) 

**扩容和树化流程：**

![image-20240310154651452](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240310154651452.png) 

#### LinkedHashSet类

**介绍：**

![image-20240310154940416](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240310154940416.png) 

**底层机制：**

![image-20240310155038426](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240310155038426.png) 

#### TreeSet类

```java
//1. 当我们使用无参构造器，创建 TreeSet 时，仍然是无序的
TreeSet treeSet = new TreeSet();
//2. 老师希望添加的元素，按照字符串大小来排序
//3. 使用 TreeSet 提供的一个构造器，可以传入一个比较器(匿名内部类)， 并指定排序规则
TreeSet treeSet = new TreeSet(new Comparator() {
    @Override
    public int compare(Object o1, Object o2) {
        return ((String) o1).length() - ((String) o2).length();
    }
}
```



#### Map 接口

##### 介绍

![image-20240310155148144](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240310155148144.png) 

![image-20240310155251575](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240310155251575.png) 

##### 遍历方法

![image-20240310155358780](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240310155358780.png) 

![image-20240310155415049](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240310155415049.png) 

#### HashMap类

##### 介绍

![image-20240310155658702](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240310155658702.png) 

##### 底层机制

![image-20240310155644731](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240310155644731.png) 

![image-20240310155732414](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240310155732414.png) 

#### Hashtable类

**介绍：**

![image-20240310155843663](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240310155843663.png) 

**Hashtable 和 HashMap对比：**

![image-20240310155941192](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240310155941192.png) 

#### Properties类

**介绍：**

![image-20240310160024459](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240310160024459.png) 

#### TreeMap类

```java
//1. 当我们使用无参构造器，创建 TreeMap 时，仍然是无序的
TreeMap treeMap = new TreeMap();
//2. 老师希望添加的元素，按照字符串大小来排序
//3. 使用 TreeSet 提供的一个构造器，可以传入一个比较器(匿名内部类)， 并指定排序规则
TreeMap treeMap = new TreeMap(new Comparator() {
    @Override
    public int compare(Object o1, Object o2) {
		return ((String) o2).length() - ((String) o1).length()
    }
}
```

#### 如何选择集合实现类

![image-20240310160133720](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240310160133720.png) 

#### Collections 工具类

**介绍:**

![image-20240310160826860](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240310160826860.png) 

**排序操作：（均为 static 方法)**

![image-20240310160910975](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240310160910975.png) 

**查找、替换操作：**

![image-20240310161004044](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240310161004044.png) 

#### 本章作业

![image-20240310183453137](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240310183453137.png) 

![image-20240310183505143](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240310183505143.png) 

![image-20240310161235533](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240310161235533.png) 

### 15：泛型

**使用传统方法的问题分析：**

![image-20240312163904885](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240312163904885.png) 

```java
//使用传统的方法来解决，在Arraylist中添加了三个Dog对象
ArrayList arrayList = new ArrayList();
arrayList.add(new Dog("旺财", 10));
arrayList.add(new Dog("发财", 1));
arrayList.add(new Dog("小黄", 5));
    
//假如我们的程序员，不小心，添加了一只猫
arrayList.add(new Cat("招财猫", 8));

//遍历时就会出错，而且有向下转型的时空间开销
for (Object o : arrayList) {
    //向下转型 Object ->Dog
    Dog dog = (Dog) o;
    System.out.println(dog.getName() + "-" + dog.getAge());
}
```

**泛型快速体验：**

![image-20240312164258141](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240312164258141.png) 

```java
//1. 当我们 ArrayList<Dog> 表示存放到 ArrayList 集合中的元素是 Dog 类型
//2. 如果编译器发现添加的类型，不满足要求，就会报错
//3. 在遍历的时候，可以直接取出 Dog 类型而不是 Object

ArrayList<Dog> arrayList = new ArrayList<Dog>();
arrayList.add(new Dog("旺财", 10));
arrayList.add(new Dog("发财", 1));
arrayList.add(new Dog("小黄", 5);

//假如我们的程序员，不小心，添加了一只猫
arrayList.add(new Cat("招财猫", 8));//会编译报错

//直接取出 Dog 类型而不是 Object，意思就是不用向下转型，提高了效率
for (Dog dog : arrayList) {
System.out.println(dog.getName() + "-" + dog.getAge());
}
```

#### 泛型的好处

![image-20240312164738223](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240312164738223.png) 

#### 泛型介绍

![image-20240312164834821](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240312164834821.png) 

```java
class Person<E> {
    E s;//可以在类声明时通过一个标识表示类中某个属性的类型
    
    public Person(E s) {//E 也可以是参数类型
    	this.s = s;
    }
    
    public E f() {//返回类型也可以使用 E
    	return s;
    }
}
```

#### 泛型语法

##### 泛型的声明

![image-20240312164958429](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240312164958429.png) 

##### 泛型的实例化

![image-20240312165040545](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240312165040545.png) 

##### 泛型使用举例

![image-20240312165423938](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240312165423938.png) 

```java
HashSet<Student> studentHashSet = new HashSet<Student>();
studentHashSet.add(new Student("陈俊宇",23));
studentHashSet.add(new Student("小明",24));
studentHashSet.add(new Student("小红",25));

for (Student student : studentHashSet) {
    System.out.println(student.getName() + "-" + student.getAge());
}

HashMap<String, Student> studentHashMap = new HashMap<>();
studentHashMap.put("陈俊宇",new Student("陈俊宇",23));
studentHashMap.put("小明",new Student("小明",23));
studentHashMap.put("小红",new Student("小红",23));

//先取entrySet，再取itrator，最后取iterator.next()
Set<Map.Entry<String, Student>> entries = studentHashMap.entrySet();
Iterator<Map.Entry<String, Student>> iterator = entries.iterator();
while (iterator.hasNext()) {
    Map.Entry<String, Student> next = iterator.next();
    System.out.println(next.getKey()+"-"+next.getValue().getAge());
}
```

##### 泛型使用的注意事项

![image-20240312171808800](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240312171808800.png) 

```java
自定义泛型
//1.给泛型指向数据类型是，要求是引用类型，不能是基本数据类型
List<Integer> list = new ArrayList<Integer>(); //OK
List<int> list2 = new ArrayList<int>();//错误

//2. B是A的子类
//在给泛型指定具体类型后，可以传入该类型或者其子类类型
Pig<A> aPig = new Pig<A>(new A());
Pig<A> aPig2 = new Pig<A>(new B());

//3. 泛型的使用形式，在实际开发中，我们往往简写
ArrayList<Integer> list1 = new ArrayList<Integer>();
List<Integer> list2 = new ArrayList<Integer>();
//等价于
ArrayList<Integer> list3 = new ArrayList<>();
List<Integer> list4 = new ArrayList<>();

//4. 如果是这样写 泛型默认是 Object
ArrayList arrayList = new ArrayList();
//等价于
ArrayList<Object> arrayList = new ArrayList<Object>()
```

#### 自定义泛型

##### 自定义泛型类

![image-20240312185141247](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240312185141247.png) 

```java
class Tiger<T, R, M> {
    String name;
	R r; //属性使用到泛型
    T[] ts = new T[10];//错误，因为数组在 new 不能确定 T 的类型，就无法在内存开空间。使用泛型的数组，不能初始化
    static R r2; //错误，因为静态是和类相关的，在类加载时，对象还没有创建。所以，如果静态方法和静态属性使用了泛型，JVM 就无法完成初始化。
    
    public Tiger(R r) {//构造器使用泛型
        this.r = r;
    }
    public void setR(R r) {//方法使用到泛型
    	this.r = r;
    }
}

Tiger<Double,String,Integer> g = new Tiger<>("john");
Tiger g2 = new Tiger("john~~");//OK T=Object R=Object M=Object
```

##### 自定义泛型接口

![image-20240312190108785](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240312190108785.png) 

```java
interface IUsb<U, R> {
    int n = 1;
    U name; //不能这样使用
    //普通方法中，可以使用接口泛型
	R get(U u);
}

//在继承接口 指定泛型接口的类型
interface IA extends IUsb<String, Double> {
}
```

##### 自定义泛型方法

![image-20240312190648901](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240312190648901.png) 

####  泛型的继承和通配符

![image-20240312190752691](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240312190752691.png) 

```java
List<?> list = new ArrayList<>();
List<? extends AA> c list = new ArrayList<>();
List<? super AA> c list = new ArrayList<>();

public static void printCollection3(List<? super AA> c) {};
public static void printCollection1(List<?> c) {};
public static void printCollection2(List<? extends AA> c) {};
```

#### 本章作业

![image-20240312191252043](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240312191252043.png) 

### 16：坦克大战

#### java 绘图坐标体系

![image-20240313105756958](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240313105756958.png) 

**坐标体系-像素:**

![image-20240313105851236](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240313105851236.png) 

#### 绘图原理

![image-20240313110022641](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240313110022641.png) 

**Graphics 类:**

![image-20240313110105199](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240313110105199.png) 

#### 绘出坦克

![image-20240313110152617](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240313110152617.png) 

![image-20240313110210579](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240313110210579.png) 

#### java 事件处理机制

##### 基本说明

![image-20240313110316761](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240313110316761.png) 

##### 示意图

![image-20240313110345490](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240313110345490.png) 

##### 机制分析

![image-20240313110408373](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240313110408373.png) 

##### 深入理解

![image-20240313110436330](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240313110436330.png) 

![image-20240313110508870](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240313110508870.png) 

![image-20240313110523591](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240313110523591.png) 

#### 本章作业

![image-20240313110615410](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240313110615410.png) 

### 17：多线程基础

#### 进程基本概念

1. 正在运行的程序（软件）就是一个独立的进程
2. 线程是属于进程的，一个进程中可以同时运行很多个线程
3. 进程中的多个线程其实是并发和并行执行的

**并发的含义：**

进程中的线程是由CPU负责调度执行的，但CPU能同时处理线程的数量有限，为了保证全部线程都能往前执行，**CPU会轮询为系统的每个线程服务**，由于CPU切换的速度很快，给我们的感觉这些线程在同时执行，这就是并发。

**并行的理解：**

在同一个时刻上，同时有多个线程在被CPU调度执行。

所以说，**多线程是并发和并行同时进行的。**

#### 线程基本概念

**什么是线程：**

![image-20240314111445419](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240314111445419.png) 

**什么是多线程：**

![image-20240314111539060](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240314111539060.png)

#### 线程的生命周期

1. 线程的生命周期是线程从生到死的过程中，经历的**各种状态及状态转换**。
2. Java总共定义了6种状态，6种状态都定义在Thread类的内部枚举类中。
   ![](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240314155917176.png) 

3. 线程的6种状态转换
   ![image-20240314160109740](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240314160109740.png)

4. 线程六种状态总结
   ![image-20240314160228236](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240314160228236.png) 

#### 创建多线程

**Java是通过java.lang.Thread 类的对象来代表线程的**。Java有三种方式创建多线程，分别为：继承Thread类、实现Runnable接口、实现Callable接口。

##### 继承Thead类

**步骤：**

1. 定义一个子类MyThread继承线程类java.lang.Thread，重写run()方法
2. 创建MyThread类的对象
3. 调用线程对象的start()方法启动线程（启动后还是执行run方法的）
   （注意：这里调用start()方法——>start0()方法——>底层调用run()方法，这里是JVM的调用）

```java
//1.定义一个子类MyThread继承线程类java.lang.Thread，重写run()方法
public class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println("您好");
        }
    }
}
//2.创建MyThread类的对象
Thread t1 = new MyThread();
//3.调用线程对象的start()方法启动线程
t1.start();
```

**注意事项：**

1. 启动线程必须是调用start方法，不是调用run方法。
   1. 直接调用run方法会当成普通方法执行，此时相当于还是单线程执行。
   2. 只有调用start方法才是启动一个新的线程执行。
2. 不要把主线程任务放在启动子线程之前。因为这样主线程一直是先跑完的，相当于是一个单线程的效果了。

**优缺点：**

优点：编码简单

缺点：线程类已经继承Thread，无法继承其他类，不利于功能的扩展。

##### 实现Runnable接口

**步骤：**

1. 定义一个线程任务类MyRunnable实现Runnable接口，重写run()方法
2. 创建MyRunnable**任务对象**
3. 把MyRunnable任务对象交给Thread处理。
   ![image-20240314112803624](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240314112803624.png) 
4. 调用**线程对象**的start()方法启动线程

```java
//1.定义一个线程任务类MyRunnable实现Runnable接口，重写run()方法
public class MyRunnable implements Runnable {
    @Override
    public void run() {
		for (int i = 1; i <= 3; i++) {
            System.out.println("您好");
        }
    }
}
//2.创建MyRunnable任务对象
Runnable runnable = new MyRunnable();
//3.把MyRunnable任务对象交给Thread处理。4.调用线程对象的start()方法启动线程
new Thread(runnable).start();

//用匿名内部类优化
new Thread(new Runnable {
    @Override
    public void run() {
        System.out.println("您好");
    }
}).start();
```

**优缺点:**

优点：任务类只是实现接口，**可以继续继承其他类、实现其他接口，扩展性强**。

缺点：需要多一个Runnable对象。

##### 实现Callable接口

**前两个方式的问题：**

![image-20240314113849925](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240314113849925.png) 

**利用Callable接口、FutureTask类来实现的步骤：**

1. 创建任务对象
   1. 定义一个类实现Callable接口，重写call方法，封装要做的事情，和要返回的数据。
   2. **把Callable类型的对象**封装成FutureTask（**线程任务对象**）。
      ![image-20240314115043019](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240314115043019.png)
2. 把线程任务对象交给**Thread对象**。
3. 调用Thread对象的start方法启动线程。
4. 线程执行完毕后，通过**FutureTask对象的的get方法**去获取线程任务执行的结果。

```java
//1.1 定义一个类实现Callable接口，重写call方法，封装要做的事情，和要返回的数据。
public class MyCallable implements Callable<String> {
    @Override
    public String call() throws Exception {
        System.out.println("您好");
        return "您好";
    }
}
MyCallable myCallable = new MyCallable();
//1.2 把Callable类型的对象封装成FutureTask（线程任务对象）。
FutureTask<String> stringFutureTask = new FutureTask<>(myCallable);
//2. 把线程任务对象交给Thread对象。
Thread thread = new Thread(stringFutureTask);
//3. 调用Thread对象的start方法启动线程。
thread.start();
//4. 线程执行完毕后，通过FutureTask对象的的get方法去获取线程任务执行的结果
String s = stringFutureTask.get();
```

**优缺点:**

优点：线程任务类只是实现接口，可以继续继承类和实现接口，扩展性强；可以在线程执行完毕后去获取线程执行的结果。

缺点：编码复杂一点。

![image-20240314115151846](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240314115151846.png) 

#### Thread常用方法

![image-20240314140152345](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240314140152345.png) 

```java
public class MyThread extends Thread{
    public MyThread(String name){
        super(name); //1.执行父类Thread(String name)构造器，为当前线程设置名字了
    }
    @Override
    public void run() {
        //2.currentThread() 哪个线程执行它，它就会得到哪个线程对象。
        Thread t = Thread.currentThread();
        for (int i = 1; i <= 3; i++) {
            //3.getName() 获取线程名称
            System.out.println(t.getName() + "输出：" + i);
        }
    }
}
```

#### 线程安全

多个线程，同时操作同一个共享资源的时候，可能会出现业务安全问题。

![image-20240314140627270](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240314140627270.png) 

#### 线程同步

解决线程安全问题的方案。

线程同步的思想是**让多个线程实现先后依次访问共享资源**，这样就解决了安全问题。

线程同步的常见方案是**加锁**：每次只允许一个线程加锁，加锁后才能进入访问，访问完毕后自动解锁，然后其他线程才能再加锁进来。

线程同步有三种方式分别是：同步代码块、同步方法、Lock锁

##### 同步代码块

**作用：**

把访问共享资源的核心代码给上锁，以此保证线程安全。对出现问题的核心代码**使用synchronized进行加锁**，每次只能一个线程占锁进入访问

![image-20240314141114951](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240314141114951.png)  

**原理：**

每次只允许一个线程加锁后进入，执行完毕后自动解锁，其他线程才可以进来执行。

**注意事项：**

1. 对于当前同时执行的线程来说，**同步锁必须是同一把（同一个对象）**，否则会出bug。
2. 锁对象**不能随便选择一个唯一的对象**，因为会影响其他无关线程的执行。
3. 建议使用共享资源作为锁对象，对于**实例方法建议使用this作为锁对象**。
4. 对于**静态方法建议使用字节码（类名.class）对象作为锁对象**。

```java
// 小明 小红线程同时过来的
public void drawMoney(double money) {
    String name = Thread.currentThread().getName();    // 先搞清楚是谁来取钱？
    //1. 对于实例方法建议使用this作为锁对象
    synchronized (this) {
        if(this.money >= money){
            System.out.println(name + "来取钱" + money + "成功！");
            this.money -= money;
            System.out.println(name + "来取钱后，余额剩余：" + this.money);
        }else {
            System.out.println(name + "来取钱：余额不足~");
        }
    }
}

//静态方法
public static void drawMoney(double money) {
    String name = Thread.currentThread().getName();    // 先搞清楚是谁来取钱？
    //2. 静态方法建议使用字节码（类名.class）对象作为锁对象
    synchronized (drawMoney.class) {
        if(this.money >= money){
            System.out.println(name + "来取钱" + money + "成功！");
            this.money -= money;
            System.out.println(name + "来取钱后，余额剩余：" + this.money);
        }else {
            System.out.println(name + "来取钱：余额不足~");
        }
    }
}
```

##### 同步方法

其实同步方法，**就是把整个方法给锁住**，一个线程调用这个方法，另一个线程调用的时候就执行不了，只有等上一个线程调用结束，下一个线程调用才能继续执行。

![image-20240314142120207](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240314142120207.png) 

**底层原理：**

1. 同步方法其实底层也是有隐式锁对象的，只是锁的范围是整个方法代码。
2. 如果方法是实例方法：同步方法默认用this作为的锁对象。
3. 如果方法是静态方法：同步方法默认用类名.class作为的锁对象。

**同步代码块VS同步方法：**

范围上：同步代码块锁的范围更小，同步方法锁的范围更大。

可读性：同步方法更好。

```java
// 同步方法
public synchronized void drawMoney(double money) {
    // 先搞清楚是谁来取钱？
    String name = Thread.currentThread().getName();
    // 1、判断余额是否足够
    if(this.money >= money){
        System.out.println(name + "来取钱" + money + "成功！");
        this.money -= money;
        System.out.println(name + "来取钱后，余额剩余：" + this.money);
    }else {
        System.out.println(name + "来取钱：余额不足~");
    }
}
```

##### Lock锁

Lock锁是JDK5版本专门提供的一种锁对象，通过这个锁对象的方法来达到加锁，和释放锁的目的，使用起来更加灵活。

Lock是接口，不能直接实例化，可以采用它的实现类ReentrantLock来构建Lock锁对象。

![image-20240314142543119](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240314142543119.png) 

```java
1.首先在成员变量位子，需要创建一个Lock接口的实现类对象（这个对象就是锁对象）
	private final Lock lk = new ReentrantLock();
2.在需要上锁的地方加入下面的代码
	 lk.lock(); // 加锁
	 //...中间是被锁住的代码...
	 lk.unlock(); // 解锁
```

```java
// 先创建了一个锁对象
private final Lock lk = new ReentrantLock();

public void drawMoney(double money) {
        // 先搞清楚是谁来取钱？
        String name = Thread.currentThread().getName();
        try {
            lk.lock(); // 加锁
            // 1、判断余额是否足够
            if(this.money >= money){
                System.out.println(name + "来取钱" + money + "成功！");
                this.money -= money;
                System.out.println(name + "来取钱后，余额剩余：" + this.money);
            }else {
                System.out.println(name + "来取钱：余额不足~");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lk.unlock(); // 解锁
        }
    }
}
```

#### 线程池

##### 线程池工作原理

线程池就是一个可以**复用线程的技术**。如果不使用线程池，用户每发起一个请求，后台就需要创建一个新线程来处理，下次新任务来了肯定又要创建新线程处理的，  而创建新线程的开销是很大的，并且请求过多时，肯定会产生大量的线程出来，这样会严重影响系统的性能。

![image-20240314160532753](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240314160532753.png) 

##### 创建线程池

JDK 5.0起提供了代表线程池的**接口：ExecutorService**。有两种方式创建线程池对象分别是：

方式一、使用ExecutorService的实现类**ThreadPoolExecutor**自创建一个线程池对象；
![image-20240314160820300](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240314160820300.png) 

方式二、使用**Executors**（线程池的工具类）调用方法返回不同特点的线程池对象。

##### ThreadPoolExecutor

**ThreadPoolExecutor构造器：**

![image-20240314160957384](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240314160957384.png)

![image-20240314161022252](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240314161022252.png) 

```java
ExecutorService pool = new ThreadPoolExecutor(
    3,	//核心线程数有3个
    5,  //最大线程数有5个。   临时线程数=最大线程数-核心线程数=5-3=2
    8,	//临时线程存活的时间8秒。 意思是临时线程8秒没有任务执行，就会被销毁掉。
    TimeUnit.SECONDS,//时间单位（秒）
    new ArrayBlockingQueue<>(4), //任务阻塞队列，没有来得及执行的任务在，任务队列中等待
    Executors.defaultThreadFactory(), //用于创建线程的工厂对象
    new ThreadPoolExecutor.CallerRunsPolicy() //拒绝策略
);
```

**新任务拒绝策略：**

![image-20240314161456630](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240314161456630.png) 

**注意事项：**

![image-20240314161159124](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240314161159124.png) 

##### 执行Runnable任务

创建好线程池之后，接下来我们就可以使用线程池执行任务了。线程池执行的任务可以有两种，**一种是Runnable任务；一种是callable任务**。

![image-20240314161353570](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240314161353570.png) 

下面的execute方法可以用来执行Runnable任务。

先准备一个线程任务类

```java
public class MyRunnable implements Runnable{
    @Override
    public void run() {
        // 任务是干啥的？
        System.out.println(Thread.currentThread().getName() + " ==> 输出666~~");
        //为了模拟线程一直在执行，这里睡久一点
        try {
            Thread.sleep(Integer.MAX_VALUE);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
```

下面是执行Runnable任务的代码，注意阅读注释，对照着前面的7个参数理解。

```java
ExecutorService pool = new ThreadPoolExecutor(
    3,	//核心线程数有3个
    5,  //最大线程数有5个。   临时线程数=最大线程数-核心线程数=5-3=2
    8,	//临时线程存活的时间8秒。 意思是临时线程8秒没有任务执行，就会被销毁掉。
    TimeUnit.SECONDS,//时间单位（秒）
    new ArrayBlockingQueue<>(4), //任务阻塞队列，没有来得及执行的任务在，任务队列中等待
    Executors.defaultThreadFactory(), //用于创建线程的工厂对象
    new ThreadPoolExecutor.CallerRunsPolicy() //拒绝策略
);

Runnable target = new MyRunnable();
pool.execute(target); // 线程池会自动创建一个新线程，自动处理这个任务，自动执行的！
pool.execute(target); // 线程池会自动创建一个新线程，自动处理这个任务，自动执行的！
pool.execute(target); // 线程池会自动创建一个新线程，自动处理这个任务，自动执行的！
//下面4个任务在任务队列里排队
pool.execute(target);
pool.execute(target);
pool.execute(target);
pool.execute(target);

//下面2个任务，会被临时线程的创建时机了
pool.execute(target);
pool.execute(target);
// 到了新任务的拒绝时机了！
pool.execute(target);
```

![image-20240314162411893](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240314162411893.png) 

##### 执行Callable任务

callable任务相对于Runnable任务来说，就是多了一个返回值。执行Callable任务需要用到下面的submit方法

先准备一个Callable线程任务

```java
public class MyCallable implements Callable<String> {
    private int n;
    public MyCallable(int n) {
        this.n = n;
    }

    // 2、重写call方法
    @Override
    public String call() throws Exception {
        // 描述线程的任务，返回线程执行返回后的结果。
        // 需求：求1-n的和返回。
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return Thread.currentThread().getName() + "求出了1-" + n + "的和是：" + sum;
    }
}
```

再准备一个测试类，在测试类中创建线程池，并执行callable任务。

```java
public class ThreadPoolTest2 {
    public static void main(String[] args) throws Exception {
        // 1、通过ThreadPoolExecutor创建一个线程池对象。
        ExecutorService pool = new ThreadPoolExecutor(
            3,
            5,
            8,
            TimeUnit.SECONDS, 
            new ArrayBlockingQueue<>(4),
            Executors.defaultThreadFactory(),
            new ThreadPoolExecutor.CallerRunsPolicy());

        // 2、使用线程处理Callable任务。
        Future<String> f1 = pool.submit(new MyCallable(100));
        Future<String> f2 = pool.submit(new MyCallable(200));
        Future<String> f3 = pool.submit(new MyCallable(300));
        Future<String> f4 = pool.submit(new MyCallable(400));

        // 3、执行完Callable任务后，需要获取返回结果。
        System.out.println(f1.get());
        System.out.println(f2.get());
        System.out.println(f3.get());
        System.out.println(f4.get());
    }
}
```

##### Executors

线程池工具类（Executors）

有同学可能会觉得前面创建线程池的代码参数太多、记不住，有没有快捷的创建线程池的方法呢？有的。Java为开发者提供了一个创建线程池的工具类，叫做Executors，它提供了方法可以创建各种不能特点的线程池。如下图所示 

![image-20240314162940886](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240314162940886.png) 

```java
// 1、通过Executors创建一个线程池对象。
ExecutorService pool = Executors.newFixedThreadPool(17);

// 计算密集型的任务：核心线程数量 = CPU的核数 + 1
// IO密集型的任务：核心线程数量 = CPU核数 * 2
```

Executors创建线程池这么好用，为什么不推荐同学们使用呢？原因在这里：看下图，这是《阿里巴巴Java开发手册》提供的强制规范要求。

![image-20240314163109093](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240314163109093.png) 

### 18：IO流

#### 文件

**文件概念：**

![image-20240316111657696](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240316111657696.png) 

**文件流：**

![image-20240316111724161](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240316111724161.png) 

#### 文件操作

##### 创建文件对象

![image-20240316111835857](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240316111835857.png) 

```java
//方式一
String filePath = "e:\\news1.txt";
File file = new File(filePath);
//方式二
File parentFile = new File("e:\\");
String fileName = "news2.txt";
File file = new File(parentFile, fileName);
//方式三
String parentPath = "e:\\";
String fileName = "news4.txt";
File file = new File(parentPath,fileName);

file.createNewFile();//如果路径没有该文件，就创建。
```

##### 获取文件的相关信息

![image-20240316112244798](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240316112244798.png) 

```java
System.out.println("文件名字=" + file.getName());

System.out.println("文件绝对路径=" + file.getAbsolutePath());

System.out.println("文件父级目录=" + file.getParent();
                   
System.out.println("文件大小(字节)=" + file.length());
                   
System.out.println("文件是否存在=" + file.exists());
                   
System.out.println("是不是一个文件=" + file.isFile());
                   
System.out.println("是不是一个目录=" + file.isDirectory());               
```

##### 目录的操作

![image-20240316112526329](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240316112526329.png) 

#### IO 流原理及流的分类

##### Java IO 流原理

![image-20240316112607182](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240316112607182.png) 

##### 流的分类

![image-20240316112659411](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240316112659411.png) 

#### IO 流体系

##### IO 流体系图

![image-20240316112809966](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240316112809966.png) 

##### FileInputStream

```java
//单个字节的读取，效率比较低
String filePath = "e:\\hello.txt";
int readData = 0;
FileInputStream fileInputStream = null;

try {
    //创建 FileInputStream 对象，用于读取 文件
    fileInputStream = new FileInputStream(filePath);
    //从该输入流读取一个字节的数据。 如果没有输入可用，此方法将阻止,如果返回-1 , 表示读取完
    while ((readData = fileInputStream.read()) != -1) {
        System.out.print((char)readData);//转成 char 显示
    }
}catch (IOException e) {
	e.printStackTrace();
}finally {
    //关闭文件流，释放资源.
	fileInputStream.close();
}

//使用 read(byte[] b) 读取文件，提高效率
String filePath = "e:\\hello.txt";
byte[] buf = new byte[8]; //一次读取 8 个字节. 
int readLen = 0;
FileInputStream fileInputStream = null;
try {
    //创建 FileInputStream 对象，用于读取 文件
    fileInputStream = new FileInputStream(filePath);
    //从该输入流读取最多 b.length 字节的数据到字节数组。 此方法将阻塞，直到某些输入可用。
    //如果返回-1 , 表示读取完毕
    //如果读取正常, 返回实际读取的字节数
    while ((readLen = fileInputStream.read(buf)) != -1) {
        System.out.print(new String(buf, 0, readLen));//显示
}catch (IOException e) {
	e.printStackTrace();
} finally {
    //关闭文件流，释放资源.
	fileInputStream.close();
}
```

##### FileOutputStream

![image-20240316113714829](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240316113714829.png) 

```java
String destFilePath = "e:\\Koala3.jpg";
FileOutputStream fileOutputStream = null;
fileOutputStream = new FileOutputStream(destFilePath);
fileOutputStream.write('1');//一定要使用这个方法
fileOutputStream.close();
```

##### FileReader

![image-20240316114128666](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240316114128666.png) 

![image-20240316113955271](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240316113955271.png) 

##### FileWriter

![image-20240316114023550](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240316114023550.png) 

#### 节点流和处理(包装)流

##### 基本介绍

![image-20240316114208634](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240316114208634.png) 

##### 节点流和处理流

![image-20240316114314030](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240316114314030.png) 

##### 区别和联系

![image-20240316114510836](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240316114510836.png) 

##### 处理流的功能

![image-20240316114643340](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240316114643340.png) 

##### BufferedReader &&  BufferedWriter(缓冲流字符流)

![image-20240316114811847](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240316114811847.png) 

```java
String filePath = "e:\\a.java";

//创建 bufferedReader
BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath));
String line; //按行读取, 效率高
//说明
//1. bufferedReader.readLine() 是按行读取文件
//2. 当返回 null 时，表示文件读取完
while ((line = bufferedReader.readLine()) != null) {
	System.out.println(line);
}

//关闭流, 这里注意，只需要关闭 BufferedReader ，因为底层会自动的去关闭 节点流
bufferedReader.close();
```

##### BufferedInputStream && BufferedOutputStream（缓冲流字节流）

![image-20240316115104758](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240316115104758.png) 

![image-20240316115134437](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240316115134437.png) 

```java
String srcFilePath = "e:\\a.java";
bis = new BufferedInputStream(new FileInputStream(srcFilePath));
byte[] buff = new byte[1024];
while ((readLen = bis.read(buff)) != -1) {}
```

##### ObjectInputStream && ObjectOutputStream（对象流）

###### 序列化和反序列化

![image-20240316115455946](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240316115455946.png) 

![image-20240316115524224](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240316115524224.png) 

###### 对象流介绍

功能：提供了对基本类型或对象类型的序列化和反序列化的方法 

ObjectOutputStream 提供 序列化功能 

ObjectInputStream 提供 反序列化功能

![image-20240316115639687](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240316115639687.png) 

```java
//序列化后，保存的文件格式，不是存文本，而是按照他的格式来保存
String filePath = "e:\\data.dat";
ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filePath));

//序列化数据到 e:\data.dat
oos.writeInt(100);// int -> Integer (实现了 Serializable)
oos.writeBoolean(true);// boolean -> Boolean (实现了 Serializable)
oos.writeChar('a');// char -> Character (实现了 Serializable)
oos.writeDouble(9.5);// double -> Double (实现了 Serializable)
oos.writeUTF("韩顺平教育");//String
//保存一个 dog 对象
oos.writeObject(new Dog("旺财", 10, "日本","白色"));
oos.close();
```

```java
// 1.创建流对象
ObjectInputStream ois = new ObjectInputStream(new FileInputStream("src\\data.dat"));
// 2.读取， 注意顺序
System.out.println(ois.readInt());
System.out.println(ois.readBoolean());
System.out.println(ois.readChar());
System.out.println(ois.readDouble());
System.out.println(ois.readUTF());
System.out.println(ois.readObject());
System.out.println(ois.readObject());
System.out.println(ois.readObject());
// 3.关闭
ois.close();
```

###### 细节注意

![image-20240316115903209](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240316115903209.png) 

##### InputStreamReader && OutputStreamWriter（转换流）

###### 标准输入输出流

![image-20240316120114468](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240316120114468.png) 

###### 基本介绍

![image-20240316133551918](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240316133551918.png) 

```java
String filePath = "e:\\a.txt";
//解读
//1. 把 FileInputStream 转成 InputStreamReader
//2. 指定编码 gbk
InputStreamReader isr = new InputStreamReader(new FileInputStream(filePath), "gbk");
//3. 把 InputStreamReader 传入 BufferedReader
BufferedReader br = new BufferedReader(isr);
//4. 读取
String s = br.readLine();
//5. 关闭外层流
br.close();

```

##### PrintStream  && PrintWriter（打印流）

![image-20240316133958542](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240316133958542.png) 

![image-20240316134011666](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240316134011666.png) 

```java
PrintStream out = System.out;
//在默认情况下，PrintStream 输出数据的位置是 标准输出，即显示器
out.print("john, hello");
//因为 print 底层使用的是 write , 所以我们可以直接调用 write 进行打印/输出
out.write("韩顺平,你好".getBytes());
out.close();

//我们可以去修改打印流输出的位置/设备
//1. 输出修改成到 "e:\\f1.txt"
//2. "hello, 韩顺平教育~" 就会输出到 e:\f1.tx
System.setOut(new PrintStream("e:\\f1.txt"));
System.out.println("hello, 韩顺平教育~");
printWriter.close();//flush + 关闭流, 才会将数据写入到文件.
```

#### Properties 类

##### 需求

![image-20240316134605350](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240316134605350.png) 

![image-20240316134659565](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240316134659565.png) 

##### 基本介绍

![image-20240316134743328](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240316134743328.png) 

```java
//使用 Properties 类来读取 mysql.properties 文件

//1. 创建 Properties 对象
Properties properties = new Properties();
//2. 加载指定配置文件
properties.load(new FileReader("src\\mysql.properties"));
//3. 把 k-v 显示控制台
properties.list(System.out);
//4. 根据 key 获取对应的值
String user = properties.getProperty("user");
String pwd = properties.getProperty("pwd");
System.out.println("用户名=" + user);
System.out.println("密码是=" + pwd);
//5.注意保存时，是中文的 unicode 码值
properties.setProperty("user", "汤姆");
properties.setProperty("pwd", "888888");
//6.将 k-v 存储文件中即可
properties.store(new FileOutputStream("src\\mysql2.properties"), null);
```

#### 本章作业

![](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240316135123389.png) 

### 19：网络编程

#### 网络的相关概念

##### 网络通信

![image-20240317091817534](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240317091817534.png) 

##### 网络

![image-20240317091900023](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240317091900023.png) 

##### ip 地址

![image-20240317091935669](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240317091935669.png) 

##### ipv4 地址分类

![image-20240317092031840](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240317092031840.png) 

##### 域名

![image-20240317092117158](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240317092117158.png) 

#### 网络通信协议

![image-20240317092230751](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240317092230751.png) 

![image-20240317092302910](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240317092302910.png) 

![image-20240317092332184](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240317092332184.png) 

#### TCP 和 UDP

![ ](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240317092357589.png) 

#### InetAddress 类

![image-20240317092508089](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240317092508089.png) 

```java
//获取本机 InetAddress 对象 getLocalHost
InetAddress localHost = InetAddress.getLocalHost();

//根据指定主机名/域名获取 ip 地址对象 getByName
InetAddress host2 = InetAddress.getByName("ThinkPad-PC");
System.out.println(host2);
InetAddress host3 = InetAddress.getByName("www.baidu.com");
System.out.println(host3);

//获取 InetAddress 对象的主机名 getHostName
String host3Name = host3.getHostName();
System.out.println(host3Name);

//获取 InetAddress 对象的地址 getHostAddress
String host3Address = host3.getHostAddress();
System.out.println(host3Address);
```

#### Socket

![image-20240317092815153](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240317092815153.png) 

![image-20240317092842287](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240317092842287.png) 

#### TCP 网络通信编程

##### 基本介绍

![image-20240317092922695](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240317092922695.png) 

##### 案例1：使用字节流

![image-20240317093158380](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240317093158380.png) 

**步骤：**

1. **服务器端：**

   ```java
   //1. 在本机 的 9999 端口监听, 等待连接
   //2. 当没有客户端连接 9999 端口时，程序会 阻塞, 等待连接
   //3. 通过 socket.getInputStream() 读取客户端写入到数据通道的数据, 显示
   //4. IO 读取
   //5. 通过输出流，写入数据到 数据通道
   //6.关闭流和 socket
   ```

   ```java
   //1. 在本机 的 9999 端口监听, 等待连接
   // 细节: 要求在本机没有其它服务在监听 9999
   // 细节：这个 ServerSocket 可以通过 accept() 返回多个 Socket[多个客户端连接服务器的并发]
   ServerSocket serverSocket = new ServerSocket(9999);
   System.out.println("服务端，在9999端口监听，等待连接");
   
   //2. 当没有客户端连接 9999 端口时，程序会 阻塞, 等待连接
   // 如果有客户端连接，则会返回 Socket 对象，程序继续
   Socket socket = serverSocket.accept();
   System.out.println("服务器 socket = " + socket.getClass());
   
   //3. 通过 socket.getInputStream() 读取客户端写入到数据通道的数据, 显示
   InputStream inputStream = socket.getInputStream();
   
   //4. IO 读取
   byte[] bytes = new byte[1024];
   int readLen = 0;
   while ((readLen = inputStream.read(bytes)) != -1) {
       System.out.println(new String(bytes,0,readLen));//根据读取到的实际长度，显示内容
   }
   
   //5. 通过输出流，写入数据到 数据通道
   OutputStream outputStream = socket.getOutputStream();
   outputStream.write("hello, client".getBytes());
   socket.shutdownOutput();// 设置结束标记
   
   //6.关闭流和 socket
   outputStream.close();
   inputStream.close();
   socket.close();
   serverSocket.close();
   System.out.println("服务器端退出....");
   ```

2. **客户端：**

   ```java
   //1. 连接服务端 (ip , 端口）
   //2. 连接上后，生成 Socket, 通过 socket.getOutputStream,得到 和 socket 对象关联的输出流对
   //3. 通过输出流，写入数据到 数据通道
   //4. 通过输入流，从 数据通道 读取数据
   //5. 关闭流对象和 socket, 必须关闭
   ```

   ```java
   //1. 连接服务端 (ip , 端口）
   //解读: 连接本机的 9999 端口, 如果连接成功，返回 Socket 对
   Socket socket = new Socket(InetAddress.getLocalHost(),9999);
   System.out.println("客户端 socket 返回=" + socket.getClass());
   
   //2. 连接上后，生成 Socket, 通过 socket.getOutputStream,得到 和 socket 对象关联的输出流对
   OutputStream outputStream = socket.getOutputStream();
   
   //3. 通过输出流，写入数据到 数据通道
   outputStream.write("hello, server".getBytes());
   socket.shutdownOutput();// 设置结束标记
   
   //4. 通过输入流，从 数据通道 读取数据
   InputStream inputStream = socket.getInputStream();
   byte[] bytes = new byte[1024];
   int readLen;
   while ((readLen = inputStream.read(bytes)) != -1) {
       System.out.println(new String(bytes,0,readLen));
   }
   
   //5. 关闭流对象和 socket, 必须关闭
   inputStream.close();
   outputStream.close();
   socket.close();
   System.out.println("客户端退出.....");
   ```

##### 案例2：使用字符流

![image-20240317093217779](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240317093217779.png) 

1. **服务器端：**

   ```java
   ServerSocket serverSocket = new ServerSocket(9999);
   System.out.println("服务器端已启动，正在监听9999端口....");
   Socket socket = serverSocket.accept();
   
   InputStream inputStream = socket.getInputStream();
   //转换流
   InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
   //缓冲流
   BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
   String Line = bufferedReader.readLine();
   System.out.println(Line);
   
   
   BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
   bufferedWriter.write("hello, client");
   bufferedWriter.newLine();//插入一个换行符，表示写入的内容结束, 注意，要求对方使用 readLine()!!!!
   bufferedWriter.flush();// 如果使用的字符流，需要手动刷新，否则数据不会写入数据通道
   
   bufferedWriter.close();
   bufferedReader.close();
   socket.close();
   serverSocket.close();
   ```

2. **客户端：**

   ```java
    Socket socket = new Socket(InetAddress.getLocalHost(),9999);
   
   OutputStream outputStream = socket.getOutputStream();
   OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream);
   BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);
   bufferedWriter.write("Hello, Server");
   bufferedWriter.newLine();//插入一个换行符，表示写入的内容结束, 注意，要求对方使用 readLine()!!!!
   bufferedWriter.flush();// 如果使用的字符流，需要手动刷新，否则数据不会写入数据通道
   
   BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
   String Line = bufferedReader.readLine();
   System.out.println(Line);
   
   bufferedReader.close();
   bufferedWriter.close();
   socket.close();
   ```

#### netstat 指令

![image-20240317093401309](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240317093401309.png) 

**netstat -anb 在管理员状态下的dos中输入，可以看到对应的应用程序**

#### TCP 网络细节

![image-20240317093537193](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240317093537193.png) 

#### UDP网络通信编程

##### 基本介绍

![image-20240317093637430](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240317093637430.png) 

##### 基本流程

![image-20240317093711299](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240317093711299.png) 

##### 应用案例

![image-20240317093754124](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240317093754124.png) 

#### 本章作业

![image-20240317093828267](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240317093828267.png)  

### 20：反射机制

#### 静态 VS 动态语言

**动态语言：**

1. 是一类在运行时可以改变其结构的语言：例如新的函数、对象、甚至代码可以被引进，已有的 函数可以被删除或是其他结构上的变化。通俗点说就是**在运行时代码可以根据某些条件改变自 身结构**。
2. 主要动态语言：Object-C、C#、JavaScript、PHP、Python等。

**静态语言：**

1. 与动态语言相对应的，**运行时结构不可变的语言就是静态语言**。如Java、C、C++。
2. Java不是动态语言，但Java可以称之为“**准动态语言**”。即Java有一定的动态性，我们可以**利用 反射机制获得类似动态语言的特性**。Java的动态性让编程的时候更加灵活！

#### Java Reflection

Reflection（反射）是Java被视为动态语言的关键，反射机制允许程序在执行期借助于Reflection API取 得任何类的内部信息，并能直接操作任意对象的内部属性及方法。

```java
Class c = Class.forName("java.lang.String")
```

加载完类之后，在堆内存的**方法区中就产生了一个Class类型的对象**（一个类只有一个Class对象，**类对象**），这 个类对象就包含了完整的类的结构信息。我们可以通过这个类对象看到类的结构。**这个类对象就像一面镜子， 透过这个镜子看到类的结构，所以，我们形象的称之为：反射**

![image-20240321114210448](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240321114210448.png) 

**Java反射机制提供的功能：**

* 在运行时判断任意一个对象所属的类 
* 在运行时构造任意一个类的对象 
* 在运行时判断任意一个类所具有的成员变量和方法 
* 在运行时获取泛型信息 
* 在运行时调用任意一个对象的成员变量和方法 
* 在运行时处理注解 
* 生成动态代理 ........

**Java反射优点和缺点:**

优点：可以实现动态创建对象和编译，体现出很大的灵活性 ! 

缺点：对性能有影响。**使用反射基本上是一种解释操作**，我们可以告诉JVM，我们希望做什么并且它满 足我们的要求。**这类操作总是慢于 直接执行相同的操作**。

#### 反射相关的主要API

* java.lang.Class : 代表一个类 
* java.lang.reflect.Method : 代表类的方法 
* java.lang.reflect.Field : 代表类的成员变量 
* java.lang.reflect.Constructor : 代表类的构造器 .......

#### Class类

在Object类中定义了以下的方法，此方法将被所有子类继承

```java
public final Class getClass();
```

以上的方法返回值的类型是一个**Class类型**，**此类是Java反射的源头**，实际上所谓反射从程序的运行结果来 看也很好理解，即：可以通过对象反射求出类的名称。

<img src="https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240321114927097.png" alt="image-20240321114927097" style="zoom:50%;" /> 

对象照镜子后可以得到的信息：某个类的属性、方法和构造器、某个类到底实现了哪些接口。对于每个 类而言，JRE 都为其保留一个不变的 Class 类型的对象。

* Class 本身也是一个类 
* Class 对象只能由系统建立对象 
* 一个加载的类在 JVM 中只会有一个Class实例 
* 一个Class对象对应的是一个加载到JVM中的一个.class文件 
* 每个类的实例都会记得自己是由哪个 Class 实例所生成 
* 通过Class可以完整地得到一个类中的所有被加载的结构 
* Class类是Reflection的根源，针对任何你想动态加载、运行的类，唯有先获得相应的Class对象

##### 获得Class对象的方式

```java
		Person person = new Person();

        System.out.println("这个人是:"+person.name);

        //获得class办法一:通过对象获得
        Class c1 = person.getClass();
        System.out.println(c1);

        //获得class办法二:通过类的静态成员class获得（这是最快的）
        Class c2 = Person.class;
        System.out.println(c2);

        //获得class办法三:通过字符串获得(包名+类名) （这是最常用的）
        Class c3 = Class.forName("com.cjy.reflection_.Student");
        System.out.println(c3);

        //获得class办法四:只针对内置的基本数据类型
        Class c4 = Integer.TYPE;
        System.out.println(c4);

        //获得父类类型，c3是student类，它的父类是person
        Class c5 = c3.getSuperclass();
        System.out.println(c5);
```

a）若已知具体的类，通过类的class属性获取，该方法最为安全可靠，程序性能最高。 

```java
Class clazz = Person.class;
```

b）已知某个类的实例，调用该实例的getClass()方法获取Class对象 

```java
Class clazz = person.getClass();
```

c）已知一个类的全类名，且该类在类路径下，可通过Class类的静态方法forName()获取，可能抛出 ClassNotFoundException 

```java
Class clazz = Class.forName("demo01.Student");
```

d）内置基本数据类型可以直接用类名.Type 

e）还可以利用ClassLoader我们之后讲解

##### Class类的常用方法

通过反射可以获取运行时类的完整结构，如下：

Field、Method、Constructor、Superclass、Interface、Annotation

虽然在实际的操作中，取得类的信息的操作代码，并不会经常开发，但是一定要熟悉java.lang.reflect包的作用，反射机制。

![image-20240321120337587](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240321120337587.png) 

```java
		Class userClass = Class.forName("com.cjy.reflection_.User");
        //调用缺省构造函数，返回Class对象的一个实例
        User user = (User)userClass.newInstance();
        System.out.println(user);

        //返回此Class对象所表示的实体的名称
        String name = userClass.getName();
        System.out.println(name);

        //返回当前Class对象的父类的class对象
        Class superclass = userClass.getSuperclass();
        System.out.println(superclass);

        //获取当前Class对象的接口
        Class[] interfaces = userClass.getInterfaces();
        for (Class anInterface : interfaces) {
            System.out.println(anInterface);
        }

        //返回该类的类加载器
        ClassLoader classLoader = userClass.getClassLoader();
        System.out.println(classLoader);

        //返回一个包含默写Constructor对象的数组
        Constructor[] constructors = userClass.getConstructors();
        for (Constructor constructor : constructors) {
            System.out.println(constructor);
        }

        //返回一个Method对象，此对象的形参类型为paramType
        Method setId = userClass.getMethod("setId", Integer.TYPE);
        System.out.println(setId);

        //返回Field对象的一个数组（Declared说明就算是private属性，也可以获取）
        Field[] declaredFields = userClass.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            System.out.println(declaredField);
        }
        //返回Field对象的一个数组（没有Declared，那就只能获取public的属性）
        Field[] fields = userClass.getFields();
        for (Field field : fields) {
            System.out.println(field);
        }
```



##### Class对象的类型

哪些类型可以有Class对象？

* class：外部类，成员内部类，静态内部类，局部内部类，匿名内部类。 
* interface：接口 
* []：数组
* enum：枚举 
* annotation：注解@interface 
* primitive type：基本数据类型 
* void

```java
Class<Object> objectClass = Object.class;
Class<Comparator> comparatorClass = Comparator.class;
Class<String[]> aClass = String[].class;
Class<ElementType> elementTypeClass = ElementType.class;
Class<Override> overrideClass = Override.class;
Class<Integer> integerClass = int.class;
Class<Void> voidClass = void.class;
```

#### Java内存分析

![image-20240321142846382](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240321142846382.png) 

##### 类的加载过程

![image-20240321142946317](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240321142946317.png) 

##### 类的加载理解

**加载：** 
将class文件字节码内容加载到内存中，并将这些静态数据转换成方法区的运行时数据结构， 然后**生成一个代表这个类的java.lang.Class对象**.

**链接：**
将Java类的二进制代码合并到JVM的运行状态之中的过程。

* 验证：确保加载的类信息符合JVM规范，没有安全方面的问题
* 准备：**正式为类变量（static）分配内存并设置类变量默认初始值或为常量赋值的阶段**，，这些内存都将在方 法区中进行分配。
* 解析：虚拟机常量池内的符号引用（常量名）替换为直接引用（地址）的过程。

**初始化：**

* 执行类构造器()方法的过程。类构造器()方法**是由编译期自动收集类中所有类变量的赋值动作 和静态代码块中的语句合并产生的**。（类构造器是构造类信息的，**不是构造该类对象的构造 器**，即：类构造器 != 类的构造器 ）。
* 当初始化一个类的时候，如果发现其父类还没有进行初始化，则需要先触发其父类的初始化。
* 虚拟机会保证一个类的()方法在多线程环境中被正确加锁和同步。

##### 类初始化的时机

**类的主动引用（一定会发生类的初始化）：**

* 当虚拟机启动，先初始化main方法所在的类
* new一个类的对象
* 调用类的静态成员（除了final常量）和静态方法
* 使用java.lang.reflect包的方法对类进行反射调用
* 当初始化一个类，如果其父类没有被初始化，则先会初始化它的父类

**类的被动引用（不会发生类的初始化）：**

* 当访问一个静态域时，只有真正声明这个域的类才会被初始化。如：当通过子类引用父类的静 态变量，不会导致子类初始化
* 通过数组定义类引用，不会触发此类的初始化
* 引用常量（final）不会触发此类的初始化（常量在链接阶段就存入调用类的常量池中了）

##### 类加载器的作用

**类加载的作用：**
将class文件字节码内容加载到内存中，并将这些静态数据转换成方法区的运行时数 据结构，然后在堆中生成一个代表这个类的java.lang.Class对象，作为方法区中类数据的访问入 口。

**类缓存：**
标准的JavaSE类加载器可以按要求查找类，但一旦某个类被加载到类加载器中，它将维持 加载（缓存）一段时间。不过JVM垃圾回收机制可以回收这些Class对象

![image-20240321144115403](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240321144115403.png) 

**类加载器：**

类加载器作用是用来把类(class)装载进内存的。JVM 规范定义了如下类型的类的加载器

![image-20240321144222334](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240321144222334.png) 

#### Class对象的作用

##### 调用指定的构造函数

**创建类的对象：**调用Class对象的newInstance()方法 

1. 类必须有一个无参数的构造器。 

2. 类的构造器的访问权限需要足够

**思考：难道没有无参的构造器就不能创建对象了吗？**

只要在操作的时候明确的调用类中的构造器， 并将参数传递进去之后，就可以实例化操作，没有无参的构造器也可以创建对象。

**步骤如下：**

1. 通过Class类的getDeclaredConstructor(Class … parameterTypes)取得本类的指定形参类型 的构造器
2. 向构造器的形参中传递一个对象数组进去，里面包含了构造器中所需的各个参数。
3. 通过Constructor实例化对象

##### 调用指定的方法

通过反射，调用类中的方法，通过**Method类**完成。

1. 通过Class类的getMethod(String name,Class…parameterTypes)方法取得一个Method对 象，并设置此方法操作时所需要的参数类型。
2. 之后使用Object **invoke**(Object obj, Object[] args)进行调用，并向方法中传递要设置的obj对 象的参数信息。

![image-20240321152613218](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240321152613218.png) 

* invoke的**第一个参数，要填实例对象**，是调用这个对象的方法；若原方法**若为静态方法，则第一个参数填null**，第一个参数一定要有值，不管是实例对象或是null，否则会编译错误。
* 若原方法形参列表为空，则Object[] args可以省略，或者填null
* 若原方法声明为private,则需要在调用此invoke()方法前，显式调用方法对象的 setAccessible(true)方法，将可访问private的方法。

```java
		Class<?> userClass = Class.forName("com.cjy.reflection_.User");
        User user = (User)userClass.newInstance();
        System.out.println(user);

        //调用有形参的方法
        Method setName = userClass.getMethod("setName", String.class);
        setName.invoke(user,"陈俊宇");
        System.out.println(user);

        //调用没有形参的方法
        Method getName = userClass.getMethod("getName");
        System.out.println(getName.invoke(user));

        //调用静态方法
        Method sayHello = userClass.getMethod("sayHello");
        sayHello.invoke(null);
```

#### setAccessible

* Method和Field、Constructor对象都有setAccessible()方法。
* setAccessible作用是启动和禁用访问安全检查的开关。
* 参数值为true则指示反射的对象在使用时应该取消Java语言访问检查。
* 提高反射的效率。如果代码中必须用反射，而该句代码需要频繁的被调用，那么请设置为true
* 使得原本无法访问的私有成员也可以访问
* 参数值为false则指示反射的对象应该实施Java语言访问检查

**性能大比拼：**

```java
        Class<?> userClass = Class.forName("com.cjy.reflection_.User");

        User user = new User(1,"陈俊宇",22);


        //直接用user.getName的形式调用方法1亿次（2ms）
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 100000000; i++) {
            user.getName();
        }
        long endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime+ "ms");

        //用类对象获取指定方法后，激活这个方法执行1亿次（104ms）
        Method getName = userClass.getMethod("getName");
        startTime = System.currentTimeMillis();
        for (int i = 0; i < 100000000; i++) {
            getName.invoke(user);
        }
        endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime+ "ms");

        //用类对象获取指定方法后，在激活之前调用setAccessible禁用安全检查机关，然后激活这个方法执行1亿次（60ms）
        startTime = System.currentTimeMillis();
        getName.setAccessible(true);
        for (int i = 0; i < 100000000; i++) {
            getName.invoke(user);
        }
        endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime+ "ms");
```

#### 反射读取注解

**什么是ORM？**
Object Relationship Mapping --> 对象关系映射

**使用反射读取注解信息三步:** 
1.定义注解 , 2.在类中使用注解 , 3. 使用反射获取注解 , 一般都是现成框架实现 , 我们手动实现

![image-20240321160228697](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240321160228697.png) 

**自定义注解：**

```java
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface Table {
    String tableName();//表名
}

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@interface Field {
    String column();//列名
    String type();//类型
    int length();//长度
}
```

**学生类：**

```java
@Table(tableName = "学生表")
class Student {
    @Field(column = "id",type = "int",length = 3)
    private int id;

    @Field(column = "姓名",type = "varchar",length = 10)
    private String name;

    @Field(column = "年龄",type = "int",length = 3)
    private int age;

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
```

**测试类：**

```java
Class<?> studentClass = Class.forName("com.cjy.reflectANDannotation.Student");

//获得这个类的注解（虽然只有Table这一个注解）
Annotation[] annotations = studentClass.getAnnotations();
for (Annotation annotation : annotations) {
    System.out.println(annotation);
}

//获得类的Table注解的tableName的值
Table annotation = studentClass.getAnnotation(Table.class);
System.out.println(annotation.tableName());

//获得类指定注解的值
java.lang.reflect.Field name = studentClass.getDeclaredField("id");
Field Annotation_ = name.getAnnotation(Field.class);
System.out.println(Annotation_.column());
System.out.println(Annotation_.type());
System.out.println(Annotation_.length());
```

### 21：函数式编程

#### 概述

**为什么学？**

- 能够看懂公司里的代码
- 大数量下处理集合效率高
- 代码可读性高
- 消灭嵌套地狱

```java
//查询未成年作家的评分在70以上的书籍 由于洋流影响所以作家和书籍可能出现重复，需要进行去重
List<Book> bookList = new ArrayList<>();
Set<Book> uniqueBookValues = new HashSet<>();
Set<Author> uniqueAuthorValues = new HashSet<>();
for (Author author : authors) {
    if (uniqueAuthorValues.add(author)) {
        if (author.getAge() < 18) {
            List<Book> books = author.getBooks();
            for (Book book : books) {
                if (book.getScore() > 70) {
                    if (uniqueBookValues.add(book)) {
                        bookList.add(book);
                    }
                }
            }
        }
    }
}
System.out.println(bookList);
```

```java
List<Book> collect = authors.stream()
    .distinct()
    .filter(author -> author.getAge() < 18)
    .map(author -> author.getBooks())
    .flatMap(Collection::stream)
    .filter(book -> book.getScore() > 70)
    .distinct()
    .collect(Collectors.toList());
System.out.println(collect);
```

**函数式编程思想：**

面向对象思想需要关注用什么对象完成什么事情。而函数式编程思想就类似于我们数学中的函数。它主要**关注的是对数据进行了什么操作**。

**优点：**

* 代码简洁，开发快速
* 接近自然语言，易于理解
* 易于"并发编程"

#### Lambda表达式

**概述：**

Lambda是JDK8中一个语法糖。他可以对某些匿名内部类的写法进行简化。它是函数式编程思想的一个重要体现。让我们不用关注是什么对象。而是更关注我们对数据进行了什么操作。

**核心原则：**

可推导可省略

**基本格式：**

(参数列表) -> {代码}

**省略规则：**

* 参数类型可以省略
* 方法体只有一句代码时大括号return和唯一一句代码的分号可以省略
* 方法只有一个参数时小括号可以省略
* 以上这些规则都记不住也可以省略不记，直接在匿名内部类上面**按ALT + Enter**即可

**心得体会：**

在你不熟悉一个函数接口的具体用法时，最好先用匿名内部类先推一边流程，根据重写方法的**方法名、返回值、形参**大概猜一下这个方法的作用是什么，**结合这个作用去写方法体**，然后直接用idea的快捷键快速生成Lambda表达式。

注意，这个能把匿名内部类简化为箭头函数的方式，只针对**只含单一方法的”接口“。**

**实例分析：**

1. 我们在创建线程并启动时可以使用匿名内部类的写法：

   ```java
   new Thread(new Runnable() {
               @Override
               public void run() {
                   System.out.println("执行");
               }
           }).start();
   ```

   可以使用Lambda的格式对其进行修改。修改后如下：

   ```java
   new Thread(() -> System.out.println("执行")).start();
   ```

2. 现有方法定义如下，其中IntBinaryOperator是一个接口。先使用匿名内部类的写法调用该方法。

   ```java
   public static int calculateNum(IntBinaryOperator operator){
           int a = 10;
           int b = 20;
           return operator.applyAsInt(a, b);
       }
   
   public static void main(String[] args) {
       int i = calculateNum(new IntBinaryOperator() {
           @Override
           public int applyAsInt(int left, int right) {
               return left + right;
           }
       });
       System.out.println(i);
   }
   ```

   Lambda写法：

   ```java
   int i = calculateNum((left, right) -> left + right);
   ```

3. 现有方法定义如下，其中IntPredicate是一个接口。先使用匿名内部类的写法调用该方法。

   ```java
   public static void printNum(IntPredicate predicate){
           int[] arr = {1,2,3,4,5,6,7,8,9,10};
           for (int i : arr) {
               if(predicate.test(i)){
                   System.out.println(i);
               }
           }
       }
       public static void main(String[] args) {
           printNum(new IntPredicate() {
               @Override
               public boolean test(int value) {
                   return value%2==0;
               }
           });
       }
   ```

   Lambda写法：

   ```java
   printNum(value -> value > 5);
   ```

4. 现有方法定义如下，其中Function是一个接口。先使用匿名内部类的写法调用该方法。

   ```java
   public static <R> R typeConver(Function<String,R> function){
           String str = "1235";
           R result = function.apply(str);
           return result;
       }
   public static void main(String[] args) {
       Integer result = typeConver(new Function<String, Integer>() {
           @Override
           public Integer apply(String s) {
               return Integer.valueOf(s);
           }
       });
       System.out.println(result);
   }
   ```

   Lambda写法：

   ```java
   Integer integer = typeConver(s -> Integer.valueOf(s));
   ```

#### Stream流

##### 基本介绍

Java8的Stream使用的是函数式编程模式，如同它的名字一样，它可以被用来对集合或数组进行链状流式的操作。可以更方便的让我们对集合或数组操作。

Stream是 Java 8新增加的类，用来补充集合类。

Stream代表数据流，流中的数据元素的数量可能是有限的，也可能是无限的。

Java Stream提供了提供了串行和并行两种类型的流，保持一致的接口，提供函数式编程方式，以管道方式提供中间操作和最终执行操作，为Java语言的集合提供了现代语言提供的类似的高阶函数操作，简化和提高了Java集合的功能。

##### 案例数据准备

~~~xml
    <dependencies>
        <dependency>
            <groupId>org.projectlombok</groupId>
            <artifactId>lombok</artifactId>
            <version>1.18.16</version>
        </dependency>
    </dependencies>
~~~

~~~java
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode//用于后期的去重使用
public class Author {
    //id
    private Long id;
    //姓名
    private String name;
    //年龄
    private Integer age;
    //简介
    private String intro;
    //作品
    private List<Book> books;
}
~~~

~~~java
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode//用于后期的去重使用
public class Book {
    //id
    private Long id;
    //书名
    private String name;

    //分类
    private String category;

    //评分
    private Integer score;

    //简介
    private String intro;

}
~~~

~~~java
private static List<Author> getAuthors() {
        //数据初始化
        Author author = new Author(1L,"蒙多",33,"一个从菜刀中明悟哲理的祖安人",null);
        Author author2 = new Author(2L,"亚拉索",15,"狂风也追逐不上他的思考速度",null);
        Author author3 = new Author(3L,"易",14,"是这个世界在限制他的思维",null);
        Author author4 = new Author(3L,"易",14,"是这个世界在限制他的思维",null);

        //书籍列表
        List<Book> books1 = new ArrayList<>();
        List<Book> books2 = new ArrayList<>();
        List<Book> books3 = new ArrayList<>();

        books1.add(new Book(1L,"刀的两侧是光明与黑暗","哲学,爱情",88,"用一把刀划分了爱恨"));
        books1.add(new Book(2L,"一个人不能死在同一把刀下","个人成长,爱情",99,"讲述如何从失败中明悟真理"));

        books2.add(new Book(3L,"那风吹不到的地方","哲学",85,"带你用思维去领略世界的尽头"));
        books2.add(new Book(3L,"那风吹不到的地方","哲学",85,"带你用思维去领略世界的尽头"));
        books2.add(new Book(4L,"吹或不吹","爱情,个人传记",56,"一个哲学家的恋爱观注定很难把他所在的时代理解"));

        books3.add(new Book(5L,"你的剑就是我的剑","爱情",56,"无法想象一个武者能对他的伴侣这么的宽容"));
        books3.add(new Book(6L,"风与剑","个人传记",100,"两个哲学家灵魂和肉体的碰撞会激起怎么样的火花呢？"));
        books3.add(new Book(6L,"风与剑","个人传记",100,"两个哲学家灵魂和肉体的碰撞会激起怎么样的火花呢？"));

        author.setBooks(books1);
        author2.setBooks(books2);
        author3.setBooks(books3);
        author4.setBooks(books3);

        List<Author> authorList = new ArrayList<>(Arrays.asList(author,author2,author3,author4));
        return authorList;
    }
~~~

##### 创建流

单列集合： `集合对象.stream()`

~~~java
List<Author> authors = getAuthors();
Stream<Author> stream = authors.stream();
~~~

数组：`Arrays.stream(数组) `或者使用`Stream.of`来创建

~~~java
Integer[] arr = {1,2,3,4,5};
Stream<Integer> stream = Arrays.stream(arr);
Stream<Integer> stream2 = Stream.of(arr);
~~~

双列集合：转换成单列集合后再创建

~~~java、
Map<String,Integer> map = new HashMap<>();
map.put("蜡笔小新",19);
map.put("黑子",17);
map.put("日向翔阳",16);

Stream<Map.Entry<String, Integer>> stream = map.entrySet().stream();
~~~

##### 中间操作

###### filter

可以对流中的元素进行条件过滤，符合过滤条件的才能继续留在流中。

例如：

​	打印所有姓名长度大于1的作家的姓名

~~~java
List<Author> authors = getAuthors();
authors.stream()
        .filter(author -> author.getName().length() > 1)
        .forEach(author -> System.out.println(author.getName()));
~~~

###### map

可以把对流中的元素进行计算或转换。

例如：

​	打印所有作家的姓名

~~~java
List<Author> authors = getAuthors();
authors.stream()
        .map(author -> author.getName())
        .forEach(name -> System.out.println(name));
~~~

###### distinct

可以去除流中的重复元素。

例如：

​	打印所有作家的姓名，并且要求其中不能有重复元素。

~~~java
 List<Author> authors = getAuthors();
        authors.stream()
                .distinct()
                .map(author -> author.getName())
                .forEach(name -> System.out.println(name));
~~~

**注意：distinct方法是依赖Object的equals方法来判断是否是相同对象的。所以需要注意重写equals方法。**

###### sorted

可以对流中的元素进行排序。

例如：

​	对流中的元素按照年龄进行降序排序，并且要求不能有重复的元素。

~~~java
//调用有参的sorted()方法
List<Author> authors = getAuthors();
authors.stream()
        .distinct()
        .map(author -> author.getAge())
        .sorted((o1, o2) -> o2 - o1)
        .forEach(age -> System.out.println(age));
~~~

**注意：如果调用空参的sorted()方法，需要流中的元素是实现了Comparable。**

###### limit

可以设置流的最大长度，超出的部分将被抛弃。

例如：

​	对流中的元素按照年龄进行降序排序，并且要求不能有重复的元素,然后打印其中年龄最大的两个作家的姓名。

~~~java
List<Author> authors = getAuthors();
authors.stream()
        .distinct()
        .sorted((o1, o2) -> o2.getAge() - o1.getAge())
        .limit(2)
        .forEach(author -> System.out.println(author.getName()));
~~~

###### peek

`peek`方法方法会使用一个Consumer消费流中的元素，但是返回的流还是包含原来的流中的元素。

~~~java
String[] arr = new String[]{"a","b","c","d"};
Arrays.stream(arr)
        .peek(System.out::println) //a,b,c,d
        .count();
~~~



###### skip

跳过流中的前n个元素，返回剩下的元素

例如：

​	打印除了年龄最大的作家外的其他作家，要求不能有重复元素，并且按照年龄降序排序。

~~~java
 List<Author> authors = getAuthors();
authors.stream()
        .distinct()
        .sorted((author1, author2) -> author2.getAge() - author1.getAge())
        .skip(1)
        .forEach(author -> System.out.println(author.getName()));
~~~

###### flatMap

map只能把一个对象转换成另一个对象来作为流中的元素。而flatMap可以把一个对象转换成多个对象作为流中的元素。

例一：

​	打印所有书籍的名字。要求对重复的元素进行去重。

~~~java
List<Author> authors = getAuthors();
authors.stream()
        .distinct()
        .flatMap( author -> author.getBooks().stream())
        .distinct()
        .forEach(book -> System.out.println(book.getName()));
~~~

例二：

​	打印现有数据的所有分类。要求对分类进行去重。不能出现这种格式：哲学,爱情

~~~java
authors.stream()
        .distinct()
        .flatMap(author -> author.getBooks().stream())
        .distinct()
        .flatMap(book -> Arrays.stream(book.getCategory().split(",")))
        .distinct()
        .forEach(name -> System.out.println(name));
~~~

##### 终结操作

###### forEach

对流中的元素进行遍历操作，我们通过传入的参数去指定对遍历到的元素进行什么具体操作。

###### count

可以用来获取当前流中元素的个数。

例子：

​	打印这些作家的所出书籍的数目，注意删除重复元素。

~~~java
List<Author> authors = getAuthors();
long count = authors.stream()
        .distinct()
        .flatMap(author -> author.getBooks().stream())
        .map(book -> book.getName())
        .distinct()
        .count();
System.out.println(count);
~~~

###### max&min

可以用来或者流中的最值。

例子：

​	分别获取这些作家的所出书籍的最高分和最低分并打印。

~~~java
List<Author> authors = getAuthors();
Optional<Book> max = authors.stream()
        .distinct()
        .flatMap(author -> author.getBooks().stream())
        .max(new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getScore() - o2.getScore();
            }
        });
System.out.println(max.get());

Optional<Book> min = authors.stream()
        .distinct()
        .flatMap(author -> author.getBooks().stream())
        .min((o1, o2) -> o1.getScore() - o2.getScore());
System.out.println(min.get());
~~~

###### collect

​	把当前流转换成一个集合。

例子：

​	获取一个存放所有作者名字的List集合。

~~~java
List<Author> authors = getAuthors();
List<Author> list = authors.stream()
        		.collect(Collectors.toList());
~~~

​	获取一个所有书名的Set集合。

~~~java
 Set<Author> set = authors.stream()
                .collect(Collectors.toSet());
~~~

​	获取一个Map集合，map的key为作者名，value为List<Book>

~~~java
Map<String, List<Book>> map = authors.stream()
                .distinct()
                .collect(Collectors.toMap(author -> author.getName(), author  -> author.getBooks()));
~~~

###### anyMatch

可以用来判断是否有任意符合匹配条件的元素，结果为boolean类型。

例子：

​	判断是否有年龄在29以上的作家

~~~java
List<Author> authors = getAuthors();
boolean b = authors.stream()
        .distinct()
        .anyMatch(author -> author.getAge() > 29);
System.out.println(b);
~~~

###### allMatch

​	可以用来判断是否都符合匹配条件，结果为boolean类型。如果都符合结果为true，否则结果为false。

例子：

​	判断是否所有的作家都是成年人

~~~java
List<Author> authors = getAuthors();
boolean b = authors.stream()
        .distinct()
        .allMatch(author -> author.getAge() >= 18);
System.out.println(b);
~~~

###### findAny

​	获取流中的任意一个元素。该方法没有办法保证获取的一定是流中的第一个元素。

例子：

​	获取任意一个年龄大于18的作家，如果存在就输出他的名字

~~~java
List<Author> authors = getAuthors();
Optional<Author> someOne = authors.stream()
        .distinct()
        .filter(author -> author.getAge() > 18)
        .findAny();
System.out.println(someOne);
~~~

###### findFirst

​	获取流中的第一个元素。

例子：

​	获取一个年龄最小的作家，并输出他的姓名。

~~~java
List<Author> authors = getAuthors();
Optional<Author> first = authors.stream()
        .distinct()
        .sorted((o1, o2) -> o1.getAge() - o2.getAge())
        .findFirst();
System.out.println(first);
~~~

###### reduce归并

对流中的数据按照你指定的计算方式计算出一个结果。（缩减操作）

reduce的作用是把stream中的元素给组合起来，我们可以传入一个初始值，它会按照我们的计算方式依次拿流中的元素和初始化值进行计算，计算结果再和后面的元素计算。

reduce两个参数的重载形式内部的计算方式如下：

~~~java
T result = identity;
for (T element : this stream)
	result = accumulator.apply(result, element)
return result;
~~~

其中identity就是我们可以通过方法参数传入的初始值，accumulator的apply具体进行什么计算也是我们通过方法参数来确定的。

例子：

​	使用reduce求所有作者年龄的和

~~~java
List<Author> authors = getAuthors();
Integer reduce = authors.stream()
        .distinct()
        .map(author -> author.getAge())
        .reduce(0, (integer, integer2) -> integer + integer2);
System.out.println(reduce);
~~~

##### 注意事项

* 惰性求值（如果没有终结操作，没有中间操作是不会得到执行的）
* 流是一次性的（一旦一个流对象经过一个终结操作后。这个流就不能再被使用,所以这时候你应该重新定义流）
* 不会影响原数据（我们在流中可以多数据做很多处理。但是正常情况下是不会影响原来集合中的元素的。这往往也是我们期望的）

##### 流和其它集合的区别

1. **不存储数据**。流是基于数据源的对象，它本身不存储数据元素，而是通过管道将数据源的元素传递给操作。
2. **函数式编程**。流的操作不会修改数据源，例如`filter`不会将数据源中的数据删除。
3. **惰性求值**。流的很多操作如filter,map等中间操作是延迟执行的，只有到终点操作才会将操作顺序执行。
4. **可以解绑**。对于无限数量的流，有些操作是可以在有限的时间完成的，比如`limit(n)` 或 `findFirst()`，这些操作可是实现"短路"(Short-circuiting)，访问到有限的元素后就可以返回。
5. **纯消费**。流的元素只能访问一次，类似Iterator，操作没有回头路，如果你想从头重新访问流的元素，对不起，你得重新生成一个新的流。

流的操作是以管道的方式串起来的。流管道包含一个数据源，接着包含零到N个中间操作，最后以一个终点操作结束。

#### Optional

##### 基本介绍

我们在编写代码的时候出现最多的就是空指针异常。所以在很多情况下我们需要做各种非空的判断。

例如：

~~~~java
        Author author = getAuthor();
        if(author!=null){
            System.out.println(author.getName());
        }
~~~~

尤其是对象中的属性还是一个对象的情况下。这种判断会更多。而过多的判断语句会让我们的代码显得臃肿不堪。所以在JDK8中引入了Optional,养成使用Optional的习惯后你可以写出更优雅的代码来避免空指针异常。

并且在很多函数式编程相关的API中也都用到了Optional，如果不会使用Optional也会对函数式编程的学习造成影响。

##### 1. 创建对象

Optional就好像是包装类，可以把我们的具体数据封装Optional对象内部。然后我们去使用Optional中封装好的方法操作封装进去的数据就可以非常优雅的避免空指针异常。

1. 我们一般使用**Optional**的**静态方法ofNullable**来把数据封装成一个Optional对象。无论传入的参数是否为null都不会出现问题。

```java
    Author author = getAuthor();
    Optional<Author> authorOptional = Optional.ofNullable(author);
```

你可能会觉得还要加一行代码来封装数据比较麻烦。但是如果**改造下getAuthor方法，让其的返回值就是封装好的Optional**的话，我们在使用时就会方便很多。

而且在实际开发中我们的数据很多是从数据库获取的。Mybatis从3.5版本可以也已经支持Optional了。我们可以直接把dao方法的返回值类型定义成Optional类型，MyBastis会自己把数据封装成Optional对象返回。封装的过程也不需要我们自己操作。

2. 如果你**确定一个对象不是空**的则可以使用**Optional**的**静态方法of**来把数据封装成Optional对象。

~~~~java
        Author author = new Author();
        Optional<Author> authorOptional = Optional.of(author);
~~~~

但是一定要注意，如果使用of的时候传入的参数必须不为null。（尝试下传入null会出现什么结果）

3. 如果一个方法的返回值类型是Optional类型。而如果我们经判断发现某次计算得到的返回值为null，这个时候就需要把null封装成Optional对象返回。这时则可以使用**Optional**的**静态方法empty**来进行封装。

~~~~java
		Optional.empty()
~~~~

通过查看ofNullable的源码我们可以得知：

~~~java
	return Value == null ? empty() : of(Value);
~~~

##### 2. 安全消费值

我们获取到一个Optional对象后肯定需要对其中的数据进行使用。这时候我们可以使用其**ifPresent**方法对来消费其中的值。这个方法会**判断其内封装的数据是否为空，不为空时才会执行具体的消费代码**。这样使用起来就更加安全了。

例如,以下写法就优雅的避免了空指针异常。

```java
    Optional<Author> authorOptional = Optional.ofNullable(getAuthor());
    authorOptional.ifPresent(author -> System.out.println(author.getName()));
```

##### 3. 获取值

如果我们想获取值自己进行处理**可以使用get方法获取，但是不推荐**。因为当Optional内部的数据为空的时候会出现异常。

##### 4. 安全获取值

如果我们期望安全的获取值。我们不推荐使用get方法，而是使用Optional提供的以下方法。

* **orElseGet**
  获取数据并且设置数据为空时的默认值。如果数据不为空就能获取到该数据。如果为空则根据你传入的参数来创建对象作为默认值返回。

  ~~~java
   		Optional<Author> authorOptional = Optional.ofNullable(getAuthor());
          Author author1 = authorOptional.orElseGet(() -> new Author());
  ~~~

* **orElseThrow**
  获取数据，如果数据不为空就能获取到该数据。如果为空则根据你传入的参数来创建异常抛出。

  ~~~java
  		Optional<Author> authorOptional = Optional.ofNullable(getAuthor());
  		Author author = authorOptional.orElseThrow(() -> new RuntimeException("author为空"));
          System.out.println(author.getName());
  ~~~

##### 5. **过滤**

我们可以使用filter方法对数据进行过滤。如果原本是有数据的，但是不符合判断，也会变成一个无数据的Optional对象。

~~~java
Optional<Author> authorOptional = Optional.ofNullable(getAuthor());
authorOptional.filter(author -> author.getAge()>100)
    								.ifPresent(author -> System.out.println(author.getName()));
~~~

##### 6. 数据转换

Optional还提供了map可以让我们的对数据进行转换，并且转换得到的数据也还是被Optional包装好的，保证了我们的使用安全。

例如我们想获取作家的书籍集合。

~~~java
private static void testMap() {
    Optional<Author> authorOptional = getAuthorOptional();
    Optional<List<Book>> optionalBooks = authorOptional.map(author -> author.getBooks());
    optionalBooks.ifPresent(books -> System.out.println(books));
}
~~~

#### 函数式接口

**只有一个抽象方法**的接口我们称之为函数接口。

JDK的函数式接口都加上了**@FunctionalInterface** 注解进行标识。但是无论是否加上该注解只要接口中只有一个抽象方法，都是函数式接口。

#### 方法引用

我们在使用lambda时，如果方法体中只有一个方法的调用的话（包括构造方法）,我们可以用方法引用进一步简化代码。

**推荐用法：**

我们在使用lambda时不需要考虑什么时候用方法引用，用哪种方法引用，方法引用的格式是什么。我们只需要在写完lambda方法发现方法体只有一行代码，并且是方法的调用时使用快捷键尝试是否能够转换成方法引用即可。

当我们方法引用使用的多了慢慢的也可以直接写出方法引用。

**基本格式:**

类名或者对象名::方法名

#### 并行流

当流中有大量元素时，我们可以使用并行流去提高操作的效率。其实并行流就是把任务分配给多个线程去完全。如果我们自己去用代码实现的话其实会非常的复杂，并且要求你对并发编程有足够的理解和认识。而如果我们使用Stream的话，我们只需要修改一个方法的调用就可以使用并行流来帮我们实现，从而提高效率。

**parallel方法可以把串行流转换成并行流。**

~~~java
 private static void test28() {
    Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    Integer sum = stream.parallel()
            .peek(new Consumer<Integer>() {
                @Override
                public void accept(Integer num) {
                    System.out.println(num+Thread.currentThread().getName());
                }
            })
            .filter(num -> num > 5)
            .reduce((result, ele) -> result + ele)
            .get();
    System.out.println(sum);
}
~~~

**也可以通过parallelStream直接获取并行流对象。**

~~~java
List<Author> authors = getAuthors();
authors.parallelStream()
        .map(author -> author.getAge())
        .map(age -> age + 10)
        .filter(age->age>18)
        .map(age->age+2)
        .forEach(System.out::println);
~~~





## Java并发编程

### JUC

JUC其实就是JDK中的三个包:

java.util.concurrent 并发相关的

java.util.concurrent.atomic 原子性

java.util.concurrent.locks lock锁

![image-20240326195120006](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240326195120006.png) 

### Java并发理论基础

#### 多线程并发不安全

如果**多个线程对同一个共享数据进行访问而不采取同步操作**的话，那么操作的结果是不一致的。例如：有500个线程同时对conut进行++的操作，最后的结果很count很可能小于500。

![image-20240330143447383](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240330143447383.png) 

**并发出现问题的根源：**

那么结果为什么不是500？并发出现问题的根源是什么？

##### **1. 可见性**

**线程本地内存（theadlocal）**引起的。

什么叫做具有可见性？ 是**指一个线程对共享变量的修改，另一个线程能够立即看得到**。
![image-20240330143917540](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240330143917540.png) 

假如执行线程1的是Cpu1，执行线程2的是Cpu2。
当线程1执行i = 5这句时，会先把i的初始值加载到线程的“本地内存”，然后赋值为5，那么此时线程1的“本地内存”中的i的值就被修改为5了。但是**还没有来得及把“本地内存”中的i传递给主内存中**。

此时，线程2执行了j = i，这里的i是从主内存中取的，主内存的i的值仍然为1没有改变，这就会会带来错误。也就是说，**线程1对共享变量i的修改对于线程2而言，不具有可见性**。

##### **2. 原子性**

**分时复用**引起的

原子性即一个操作或者多个操作要么全部执行并且执行的过程不会被打断，要么不执行。
![image-20240330144859012](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240330144859012.png) 

这里需要注意的是：**`i += 1`需要三条CPU指令**

1. 将变量i从内存读取到CPU寄存器
2. 在CPU寄存器中执行 i + 1 操作
3. 将最后的结果写入内存中

​	由于CPU的分时复用（线程切换）的存在，线程1在执行第一条指令后，就切换到线程2执行，那么很有可能最后写入内存中的值不是3而是2。

##### **3. 有序性**

**指令重排序引起的**

有序性即程序的执行顺序按照代码的先后顺序执行，

**但是在执行程序时为了提高性能。编译器和处理器常常会对指令做重排序**。重排序分为三种类型：

1. 编译器优化的重排序。编译器在不改变单线程语义的情况下，可以重新安排语句执行顺序
2. 指令级并行的重排序。现代处理器采用了指令级并行技术来将多条指令重叠执行，如果不存在数据依赖性，处理器可以改变语句对应机器指令的执行顺序
3. 内存系统的重排序。由于处理器使用缓存和（读/写）缓存区，这使得加载和存储操作看上去可能是乱序执行的

上述的1属于编译器重排序，2和3属于处理器重排序。**这些重排序都有可能会导致多线程程序出现内存可见性问题**。所以如果不采取手段，利用Java提供的可见性问题处理工具（如：volatile）加以控制，任由编译器处理器进行指令重排序，程序就会运行出错。

**那为什么不静止重排序呢？**重排序本身是用来提高性能的，全部禁止不行，所以JMM要进行取舍。

#### Java内存模型(JMM)

Java 线程之间的通信由Java内存模型(JMM）控制，JMM决定一个线程对共享变量的写入何时对另一个线程可见。

从抽象的角度来看，JMM定义了线程和主内存之间的抽象关系：线程之间的共享变量存储在主内存(main memory)中，每个线程都有一个私有的本地内存（ThreadLocal），本地内存中存储了该线程以读/写共享变量的副本。

本地内存是JMM的一个抽象概念，并不真实存在。它涵盖了高速缓存，写缓冲区，寄存器以及其他的硬件和编译器优化。

##### Java内存模型示意图

![image-20240402091318054](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240402091318054.png) 

从上图来看，线程A与线程B之间如要通信的话，必须要经历下面2个步骤︰

* 首先，线程A把本地内存A中更新过的共享变量刷新到主内存中去。
* 然后，线程B到主内存中去读取线程A之前已更新过的共享变量。

从整体来看，这两个步骤实质上是**线程A在向线程B发送消息**，而且这**个通信过程必须要经过主内存**。JMM通过控制主内存与每个线程的本地内存之间的交互,来为java程序员提供内存可见性保证。

##### 重排序

![image-20240402091651108](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240402091651108.png) 

这些**重排序都可能会导致多线程程序出现内存可见性问题**。

对于编译器，**JMM的编译器重排序规则**会禁止特定类型的编译器重排序(不是所有的编译器重排序都要禁止)。

对于处理器重排序，**JMM的处理器重排序规则**会要求java编译器在生成指令序列时，插入特定类型的**内存屏障指令**，通过内存屏障指令来禁止特定类型的处理器重排序(不是所有的处理器重排序都要禁止)。

**内存屏障指令：**

内存屏障被用于多线程编程和并发控制中，确保对共享数据的操作按照预期顺序执行，并保证线程间的数据同步。内存屏障最主要的作用就是保证了内存操作的顺序性及可见性。在内存屏障之前的指令全部执行完成之后，才允许执行内存屏障之后的指令，从而保证代码的顺序性。

##### happen-before规则

基于上面对重排序的学习可以发现，重排序一方面是会提升程序性能，我们应该支持，另外—方面有的重排序会导致程序出问题，我们应该禁止。那到底哪些应该禁止，哪些应该支持呢?这个事情如果让Java程序员自己来分析，明显是很困难的。所以**这个工作就由JMM承担了**。

**JMM定义了一套规则，叫做happen-before规则**。这套规则—方面给程序员的承诺，一方面是对编译器和处理器的约束。JMM承诺程序员基于这套规则编程，即便不理解重排序，程序也不会因为发生了重排序出问题，也不会出现内存可见性问题。而另外一方面，Java平台在具体实现的时候，有了这套规则的也就知道了禁止重排序应该禁止到什么程度，比如有些重排序并不会打破这套规则，也并不会改变程序的执行结果，那就应该支持。

![image-20240402092253570](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240402092253570.png) 

##### 八条规则

1. **单一线程顺序规则**：在一个线程内，在程序前面的操作happen-before于后面的操作。

2. **监视器锁规则**：对一个锁的解锁操作happen-before于后面对同一个锁的加锁操作。

3. **volatile变量规则**：对一个volatile变量的写操作happen-before于后面对这个变量的读操作。
4. **传递性规则**：如果A happen-beforeB，B happen-before C，则A happen-before C。
5. 线程start()规则：如果线程A执行操作ThreadB.start()，那么A线程的ThreadB.start())操作happen-before于线程B中的任意操作。
6. join规则：如果线程A执行操作ThreadB.join()并成功返回，那么B线程内的任意操作happen-before于线程A从ThreadB.join()操作成功返回。
7. 线程中断规则：对线程interrupt()方法的调用happen-before于被中断线程的代码检测到中断事件的发生，可以通过interrupted()方法检测到是否有中断发生。
8. 对象终结规则：一个对象的初始化完成(构造函数执行结束)happen-before于它的finalize()方法的开始。

#### synchronized

##### synchronized的使用

Java中每一个对象都可以作为锁，具体表现为以下3种形式。

1. **被synchronized和static一起修饰的方法**，锁的对象是**类的class对象（class）**，该方法被称为**静态同步方法**。
   所有的静态同步方法用的也是同一把锁----类对象本身

2. **仅仅被synchronized修饰的方法**，锁的对象是方法的调用者，即**实例对象（this）**，该方法被称为**（普通）同步方法**。

3. 对于**同步方法块**，锁是Synchronized括号里面指定的对象（指定的对象也可以用this,即指定当前实例对象)

4. **没有被synchronized修饰的方法**，它**没有锁的对象**，该方法被称为**普通方法**。

synchronized的使用可以和八锁问题结合起来，**解题步骤：**

1. **判断多个线程调用的方法是否属于同一把锁**，不是同一把锁的话，则计算有那些锁，那些没有锁；
2. 如果属于同一把锁，则线程的执行按照同步代码方式执行；
3. 如果不是同一把锁，甚至没有锁，则按照多线程的步骤执行。

##### 加锁和释放锁原理

**synchronized加锁和释放锁的原理**本质是对一个对象的监视器(monitor)进行获取，而这个获取过程是排他的，也就是同一时刻只能有一个线程获取到由synchronized所保护对象的监视器。下面通过一个图来展示线程，对象Object，监视器Monitor,同步队列SychronizedQueue之间的关系。

![image-20240402135406667](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240402135406667.png) 

图中可以看到，任意线程对Object(Object由synchronized保护)的访问，**首先要获得Object的监视器Monitor**。**如果获取失败，线程进入同步队列，线程状态变为BLOCKED**。当访问Object 的前驱(获得了锁的线程)释放了锁，则该释放操作唤醒阻塞在同步队列中的线程，使其重新尝试对监视器的获取。

##### 可重入的实现原理

**synchronized对于一个对象加锁后是可以重入的**，就是说同一个线程可以反复给该对象加锁，且并不会因为前一次加的锁还没有释放而阻塞。
**原理：**Synchronized加锁的对象拥有一个**monitor计数器**，当线程获取该对象锁后，monitor计数器就会加一，释放锁后就会将monitor计数器减一。所以**同一个线程反复对该对象加锁时，只会引起monitor计数器加1，并不会触发Monitor.Enter失败的流程**，即线程不会被阻塞。释放锁也是一样，每触发一次释放操作锁monitor计数器会减1，当最终monitor计数器**重新减为0之后，才真正表示释放了锁**。

##### 保证可见性的原理

**锁的happens-before关系：**

Synchronized的happens-before规则，即监视器锁规则：**对同一个监视器的解锁，happens-before于对该监视器的加锁**。

继续来看代码:

![image-20240402140149506](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240402140149506.png) 

happens-before关系如图：

![image-20240402140227825](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240402140227825.png) 

在图中每一个箭头连接的两个节点就代表之间的happens-before关系，

**黑色的是通过程序顺序规则推导出来**，

**红色的为监视器锁规则推导而出：**线程A释放锁happens-before线程B加锁，

**蓝色的则是通过程序顺序规则和监视器锁规则推测出来happens-befor关系**，通过**传递性规则**进一步推导的happens-before关系。现在我们来重点关注**2 happens-before 5**，通过这个关系我们可以得出什么?

根据happens-before的定义中的一条：==**如果A happens-before B，则A的执行结果对B可见**，**并且A的执行顺序先于B**==。线程A先对共享变量A进行加一，由**2 happens-before 5关系可知线程A的执行结果对线程B可见即线程B所读取到的a的值为1**。

##### 锁的内存语义

1. 当线程释放锁时，JMM会把该线程对应的本地内存中的共享变量刷新到主内存中。
2. 当线程获取锁时，JMM会把该线程对应的本地内存置为无效。

##### 锁升级与对比

###### java对象头

Synchronized用的**锁是存在Java对象头**里面的，所以理解对象头的存储结构和存储数据的类型可以有助于对锁的理解。

Java对象头中**主要存储三类数据**：

1. 第一类叫做**Mark Word**，主要**存储对象的hashcode**、**分代年龄**、**锁信息**等运行数据;
2. 第二类是**Class Pointer**，指向方法区中该class 的对象，JVM通过此字段来判断当前对象是哪个类的实例;
3. 第三类，**数组的长度，就是如果当前对象是数组的话才会有**。

三类中，我们这里重点关注第一类Mark Word，是我们理解锁的核心.

![image-20240402141113536](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240402141113536.png) 

**程序运行期间，Mark Word存储的信息会随着锁标志位的变化而变化**，**可能会变化为以下四种状态之一：**

![image-20240402141221595](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240402141221595.png) 

看到这里，你会发现**无锁、偏向锁的“锁标志位”是一样的**，即**都是01**，这是**因为无锁、偏向锁是靠字段"是否是偏向锁”来区分的**，0代表没有启用偏向锁，1代表启用偏向锁，可以通过VM参数(XX:UseBiasedLocking=true 默认)控制。并且启动偏向锁还有延迟(默认4秒)，可以通过VM参数(XX:BiasedLockingStartupDelay=0 ）关闭延迟。

###### 锁升级与对比

基于上面对Java对象头的理解，可以看出锁一共有4种状态，分别是:**无锁，偏向锁，轻量级锁，重量级锁**(Java SE 1.6开始，**为了降低锁的获取与释放带来的性能消耗，才引入的"偏向锁"和“轻量级锁"**)。这几个锁状态会随着并发竞争情况逐渐升级，==**锁只能升级不能降级**==，也就是说轻量级锁不能变回偏向锁，重量级锁不能变回轻量级锁。下面详细介绍下这几个锁，以及锁的升级过程。

###### 偏向锁

在大多实际环境下，锁不仅不存在多线程竞争，而且总是由同一个线程多次获取，那么在同一个线程反复获取所释放锁中，其中并没有锁的竞争，那么这样看上去，多次的获取锁和释放锁带来了很多不必要的性能开销和上下文切换。所以引入了偏向锁来处理这种情况。

**偏向锁的加锁：**

1. 当一个线程A访问同步块并获取锁时，会在对象头和栈帧中的锁记录里存储锁偏向的线程ID，

2. 以后该线程在进入和退出同步块时不需要进行CAS操作来加锁和解锁，只需简单地测试一下对象头的Mark Word里是否存储着指向当前线程A的偏向锁。

3. 如果测试成功，表示线程已经获得了锁。

4. 如果测试失败，则需要再测试一下Mark Word中偏向锁的标识是否设置成1(表示当前是偏向锁)

5. 如果设置了，则尝试使用CAS将对象头的偏向锁指向当前线程。

6. 如果没有设置，则使用CAS竞争锁(即轻量级锁)

   <img src="https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240402142105880.png" alt="image-20240402142105880" style="zoom: 80%;" /> 

   例子：当大呆需要上WC时，只有它自已要上WC，此时并**没有其它的人需要上WC，那么这时这个WC可以直接给大呆使用，并且大呆把可以标识自已身份的ID贴到门上**，表示此时大呆占用了这个WC。

**偏向锁的撤销：**

还是用上面这个图来解释，此时当前的WC被大呆所占用，这时二呆来了也要使用WC。这时**大呆和二呆就要通过CAS的方式来抢占WC**。因为此时锁的状态是偏向锁的状态，二呆来了也要使用WC(这时有**两个人同时要使用WC，这时就要将偏向锁升级成轻量级锁**)，**在升级轻量锁之前首先需要将WC上的标识大呆身份的ID撕下来**(**这一步叫做偏向锁的撤销**)。

![image-20240402142300696](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240402142300696.png) 

###### 轻量级锁

上面锁被撤销后，升级为了轻量级锁，**轻量级锁状态下两个人需要通过过自旋+CAS的方式两个人来抢锁**。**当其中一个线程抢锁成功后，会将LR贴到WC的门上，表示WC当前被某个线程占用，然后另一个没有抢到锁的线程就一直自旋获取锁**。

![image-20240402142517212](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240402142517212.png) 

LR的锁记录中存储的是对象的**Mark Word的备份**，即拷贝进入的,而两个线程竞争的过程就是**通过CAS的方式将对象本来的Mark Word位置存储的信息替换为指向自己LR记录的指针**。**谁替换成功了，谁就获得了锁**，例如A成功了。那没有获取到锁的线程B，就再自旋一段时间(**自旋的原因是因为B认为A很快就能执行完**，我就在门口等一下，也就是**B认为竞争没有那么激烈**)。**当自旋一段时间后，如果还没有获得锁，那B就只能将锁修改为重量级锁了，然后自己进入阻塞状态**，等待A执行完之后唤醒。

![image-20240402142725246](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240402142725246.png) 

###### 重量级锁

重量级锁，线程加锁失败会进入阻塞状态，等待前驱获得线程的锁执行完之后唤醒。

![image-20240402142835027](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240402142835027.png) 

#### volatile

**volatile变量的作用：如果一个字段被声明成volatile，JMM确保所有线程看到这个变量的值是一样的。**

##### volatile可见性的实现

1．当写一个volatile变量的时候，JMM会把该线程对应本地内存中的共享变量值刷新到主内存。
2．当读一个volatile变量时:JMM会把该线程对应的本地内存置为无效，线程接下来将从主内存中读取共享变量

##### volatile有序性的实现

###### happen-before

**对一个volatile 域的写，happens-before于任意后续对这个 volatile 域的读**

![image-20240402145108374](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240402145108374.png) 

根据happens-before规则，上面过程会建立3类happens-before关系。

1. 根据程序次序规则：1 happens-before 2且 3 happens-before 4。
2. 根据volatile 规则: 2 happens-before 3。
3. 根据 happens-before 的传递性规则：1 happens-before 4。

<img src="https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240402145239783.png" alt="image-20240402145239783" style="zoom:80%;" /> 

因为以上规则，当线程A将 volatile变量flag更改为true后，对于线程B来说是可见的。

###### volatile禁止重排序

为了性能优化，JMM在不改变正确语义的前提下，会允许编译器和处理器对指令序列进行重排序。针对会改变语义的场景，Java编译器会在生成指令系列时在适当的位置会插入内存屏障指令来禁止特定类型的处理器重排序，J**MM针对编译器制定的 volatile重排序规则表**如下(NO就是需要禁止重排序的场景)

![image-20240402145732092](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240402145732092.png) 

#### final

##### 重排序禁止规则

按照final修饰的数据类型分类：

基本数据类型:

* final域写：禁止final域写与构造方法重排序，即禁止final域写重排序到构造方法之外，从而保证该对象对所有线程可见时，该对象的final域全部已经初始化过。
* final域读：**先确保初次读对象的引用**，**然后读对象的final 域**，这样**在读对象的final 域的时候可以保证final 域已经被初始化过了**。

引用数据类型:

* 额外增加约束：修饰了一个成员对象，那么就会**先将该成员对象构造完成**(即其成员变量全部被初始化了)，**再将该成员对象的引用赋值给引用变量**。**保证这两步不会被重排序**，否则，其他线程可以通过这个引用来访问尚未被初始化的成员变量。

#### 线程状态

![image-20240402151400052](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240402151400052.png) 

1. **NEW**：初始状态，线程被创建，但是还没有调用start()方法。
2. **RUNNABLE**：运行状态，Java线程将操作系统中的就绪和运行两种状态笼统地称作"运行中”
3. **BLOCKED**：阻塞状态，表示线程阻塞于锁。
4. **WAITING**：等待状态，表示线程进入等待状态，进入该状态表示当前线程需要等待其他线程做出一些等待动作(通知或中断)
5. **TIME_WAITING**超时等待状态，该状态不同于WAITING状态，它可以在指定的时间自行返回。

6. **TERMINATED**：终止状态，表示当前线程已经执行完毕。

``阻塞状态BLOCKED是线程阻塞在进入synchronized关键字修饰的方法或代码块时(获取锁)的状态，``

``但是如果是阻塞在java.concurrent包中的Lock接口的线程状态却是等待状态WAITING，因为Lock接口的阻塞实现均使用的是LockSupport类中的相关方法;``

#### 线程中断和终止

中断可以理解为线程的一个**标识位属性**，它表示一个运行中的线程是否被其他线程进行了中断操作。**其他线程通过调用该线程的interrupt方法进行中断操作**。反过来，**线程通过isInterrupt()方法来判断自己是否被执行的中断操作**，并做出响应。

##### 中断异常

如果sleep、wait 等可以让线程进入阻塞的方法使线程休眠了，而**处于休眠中的线程被中断**，那么线程是可以感受到中断信号的，并且会抛出一个InterruptedException异常。

**在抛出InterruptException之前，Java虚拟机会将该线程的中断标记位清除**。然后抛出InterruptException，此时调用isInterrunpted ()方法将会返回false。

##### 线程不应强制停止

为什么线程不应强制停止？

上面介绍了中断，那基于中断的停止模式是，A线程如果想要停止B线程，则A线程需要给B线程发送一个中断信号，B线程通过中断标志位判断自己是否有被中断，**最后自行决定如何响应中断**（例如:可以停止，可以延后，也可以直接忽略)。**为什么要让线程拥有响应中断的主权，而不可以强制停止呢?**(A强制停止B)

可以设想一下，我们很多工作并不是可以贸然停止的，例如A想要停止B时，B线程正在写入一个文件，可能文件正写入一半，如果立即停止那数据就是不完整的。但是对于A来说，它是感知不到B进行到什么阶段的，所以也没办法选择一个最佳时机来停止B，**要想安全稳妥的停止B线程，确实只能B线程自行决策**。

再看几种停止线程的错误方法。比如stop()， suspend()和resume()，这些方法已经被Java直接标记为@Deprecated。如果再调用这些方法，IDE会友好地提示，我们不应该再使用它们了。是**因为stop()会直接把线程停止，这样就没有给线程足够的时间来处理想要在停止前保存数据的逻辑，任务戛然而止**，会导致出现数据完整性等问题。

#### 线程之间的通信

现实的多线程模式下，每一个线程并不是独立的执行就完事了，更常见的是线程之间需要相互协作才能更好的完成—项任务。协作的过程中，就免不了线程之间需要相互通信。Java提供的一些可以完成线程间通信的机制。

1. **Volatile**：当两个线程A，B共同使用一个普通共享变量的时候，线程A对变量进行了修改，另外一个线程B是不能保证一定能看到最新值的。这就导致了线程之间的可见性问题，并发程序基于此运行是会出错的。为了解决这个问题，**Java提供了Volatile关键字，被该关键字修饰的变量不会存在B线程读不到最新值的情况**。
2. **Synchronized**：这是Java提供的另外一个关键字，它可以修饰方法或者同步块，**被修饰之后能够确保同一时间只有一个线程可以处于方法或者同步块中**，所以在方法和同步块中去访问共享变量，可以保证可见性和排他性。
3. **wait/ notify**： Java还提供了"等待/通知""的机制来进行线程间的协作运行。
   **通知等待机制：**
   java在的等待和通知方法(如下**5种**)被**定义在了Object类**上。一个线程B调用了对象O的wait()方法进入等待状态WAITING或者TIMED_WAITING,而另外一个线程A调用了对象O的的notify或者notifyAll方法，线程B从wait方法返回，然后执行后续操作。

  * notify：通知一个在对象上等待的线程。

  * notifyAll：通知所有等待在该对象上的线程。

  * wait()：线程调用该方法进入等待(WAITING）状态，返回需要等待另外的线程通知或者被中断，另外注意线程调用wait方法后会释放对象的锁（**能调用wait方法的前提也是获取到了对象的锁**)

  * wait(long)：线程调用之后会进入超时等待(TIMED_WAITING)状态，多一种返回方式，就是如果没有通知，也会在等待n毫秒后返回。

  * wait(long,int):超时时间更细，到纳秒

4. **Thread.join()**：AB两线程，A调用B.join()，表示A需要等待B完全执行完成，才会从B.join()处返回继续执行。当然也支持join(long)和
   join(long,int)两种超时返回。调用join后，A线程会处于等待(WAITING)或，超时等待(TIMED WAITING)状态

#### ThreadLocal

ThreadLocal叫本地变量（线程变量），其是**以ThreadLocal对象为Key**，**任意对象为value的存储结构**(其底层是在线程里维护了一个map, map的key就是各种ThreadLocal对象），**当一个Key-Value值被存储之后，会一直附带在线程上**，所以你可以在线程执行的任何位置再通过这个ThreadLocal对象取到存入的一个值。另外**设定或修改值的方式是SET(T),获取值的方式是get();**

![image-20240402160558335](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240402160558335.png) 

**帮助理解:**

* 一开始创建了一个ThreadLocal对象，叫做TIME_THREADLOCAL_OBECT(特别注意这里只是创建了一个对象)，这个对象会作为一个key,去存储—个Long型的value值，到线程的ThreadLocalMap中。
* begin方法:需要理解为啥set方法只需要传value值，无需传key。是因为TIME_THREADLOCAL_OBECT对象会作为key
* end方法:同理，需要理解get方法为啥不用传参数，同样因为TIME_THREADLOCAL_OBECT会作为key
* another_threadlocal_object:如果需要存储另外一个值，可以再生成一个threadlocal对象，例如代码注释里的another_threadlocal_object。

对象作为key的话，是这个map只能保存—对值，因为只有—个对象，那就是只有一个 key。这一个threadlocal 对象只能保存一个值。按照上面的例子，这个值是一个Long。但是要注意：**一个线程里面是可以定义很多threadlocal 对象的**。

### Java中的锁

#### Lock接口

锁主要是能用来控制多个线程访问共享变量的方式，在Lock接口出现之前，Java主要是靠我们前面介绍的synchronized关键字来实现锁功能的，在JavaSE5之后，开始提供Lock接口来实现锁的功能。他有与synchronized关键字类似的同步功能，只是说有一些差别，**Lock需要显示的进行加锁和解锁操作**。虽然损失了一些隐式加解锁的便捷性，但是增强了可操作性。另外Lock还提供了—些特有的可中断获取锁。超时获取锁等同步特性。

![image-20240402162402874](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240402162402874.png) 

* 解锁过程放入finally块，确保锁能够被释放
* **加锁过程不要写在try里面，因为加锁过程如果发生异常，也会进入finally块导致锁无故释放**

**Lock VS synchronized：**

![image-20240327113239201](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240327113239201.png) 

**相同点：**

* synchronized 和Lock都是用来保护资源线程安全的。
* 都可以保证可见性。
* synchronized 和 ReentrantLock都拥有可重入的特点

**不同点：**

* 加解锁控制差别:：**synchronized的加锁和解锁是由Jvm实现的(内置锁)**，而Lock的加解锁需要手动控制，通过lock()和unlock()，一般会把unlock操作放入finally块来解锁，以防忘记解锁。
* synchronized 锁不够灵活：**synchronized一个线程获取锁之后，其他线程想要获取锁只能等待**，只能进入阻塞状态，直到持有锁的线程释放这个锁，可能这个等待过程会持续很久。相比之下，Lock可以使用lockInterruptibly方法，不想等了可以中断退出，也可以使用tryLock获取锁，能获取就获取，不能获取线程也可以去干别的事情，更加灵活。
* **synchronized锁只能同时被一个线程拥有**，但是Lock 锁没有这个限制：例如读写锁中的读锁时可以被多个线程同时拥有的。
* 是否可以设置公平/非公平：公平锁是指多个线程在等待同一个锁时，根据先来后到的原则依次获得锁。ReentrantLock 等Lock 实现类可以根据自己的需要来设置公平或非公平，**synchronized则不能设置**。

#### AQS队列同步器

队列同步器**AbstractQueuedSynchronizer**(以下简称同步器)，**是用来构建锁或者其他同步组件的基础框架**，它使用了**一个int成员变量表示同步状态（五种：1，-1，-2，-3, 0）**，通过**内置的FIFO队列来完成资源获取线程的排队工作**，是实现大部分同步需求的基础。

**同步器的主要使用方式是继承**，子类通过继承同步器并实现它的可重写方法来管理同步状态，在可重写方法的实现过程中免不了要对同步状态进行更改

这时就需要使用同步器提供的3个方法(**getState()**、**setState(int newState)**、**compareAndSetstate(int expect,int update)**)来进行操作，因为它们能够保证状态的改变是安全的。

**子类推荐被定义为自定义同步组件的静态内部类**，同步器自身没有实现任何同步接口，它仅仅是定义了若干同步状态获取和释放的方法来供自定义同步组件(锁，CountDownLatch等)使用，同步器既可以支持独占式地获取同步状态，也可以支持共享式地获取同步状态，这样就可以方便实现不同类型的同步组件(可重入锁ReentrantLock、可重入读写锁ReentrantReadWriteLock和CountDownLatch等)。

##### AQS的实现

**AQS的实现采用的是模版模式**，对外提供的三类方法用于实现一个同步组件;

**三类方法关系**：

1. 使用者继承AQS并重写**5个指定的方法**(第二类)。
2. 重写同步器指定的方法时，需要使用**同步器提供的3个方法**来访问或修改同步状态(第一类)。
3. 最后将AQS组合在自定义同步组件的实现中，并调用其**9个模板方法**(第三类)和5个重写过的方法来实现，另外模板方法会调用使用者重写的方法。

**第—类：3个访问和修改同步状态的方法**
重写同步器指定的方法第二类时，需要使用同步器提供的如下3个方法来访问或修改同步状态。

* getState():获取当前同步状态。
* setState( int newState):设置当前同步状态。
* compareAndSetState(int expect, int update):使用CAS设置当前状态，该方法能够保证状态设置的原子性

**第二类:5个可重写方法**

* isHeldExclusively():该线程是否正在独占资源。只有用到condition才需要去实现它。
* tryAcquire(int):独占方式。尝试获取资源，成功则返回true，失败则返回false。
* tryRelease(int):独占方式。尝试释放资源，成功则返回true，失败则返回false
* tryAcquireShared :共享方式。尝试获取资源。负数表示失败;0表示成功，但没有剩余可用资源;正数表示成功，且有剩余资源
* tryReleaseShared(int):共享方式。尝试释放资源，成功则返回true，失败则返回false。

**第三类:9个模版方法**

模版方法主要分成：独占式获取与释放同步状态，共享式获取与释放同步状态和查询同步队列中的等待线程

![image-20240402171147225](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240402171147225.png) 

##### 实现原理分析

尝试从多个角度分析AQS的实现，主要包括**同步队列**，**独占式获取释放同步状态**，**共享式获取同步状态**，**独占超时获取同步状态**等同步器核心数据结构和模版方法

##### 同步队列

1. **队列节点**:节点Node是构成同步队列的基础，获取同步状态失败的线程将会被包装成—个节点加入同步队列的尾部

![image-20240402172133951](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240402172133951.png)  

2. **队列基本结构**:同步器包含两个节点的引用(头，尾节点)
   ![](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240402172423357.png)

3. **新加入节点的过程**:当有新节点需要加入的时候，需要保证线程安全，同步器提供了一个基于CAS的设置尾节点的方法:compareAndSet**Tail**(Nodeexpect,Node update)，**它需要传递当前线程"认为"的尾节点和当前节点**，只有设置成功后，当前节点才正式与之前的尾节点建立关联。
   ![](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240402172547242.png)

4. **首节点释放过程**:同步队列遵循FIFO，首节点是获取同步状态成功的节点，**首节点的线程在释放同步状态时，将会唤醒后继节点**，**而后继节点将会在获取同步状态成功时将自己设置为首节点**
   ![image-20240402172708638](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240402172708638.png)

##### 独占式同步获取释放

在获取同步状态时，**同步器维护了一个同步队列**，**获取状态失败的线程都会被加入到队列中并在队列中自旋**;**在释放同步状态时，同步器调用tryRelease方法释放同步状态**，然后唤醒后继节点。移出队列的条件是后继节点获取了同步状态，并把自己设置为了新的头节点，此时前驱节点会被移出队列。

![image-20240402172945875](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240402172945875.png) 

##### 共享式同步获取释放

1. **共享式VS独占式**:共享式获取与独占式获取的差别在于同一时刻是否能让多个线程获取到同步状态。左边共享式访问时，其他共享式的访问都会被允许，而独占式访问被阻塞。右边是独占式访问资源时，同一时刻其他访问均被阻塞。
   ![image-20240402173138897](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240402173138897.png)

2. **共享式同步获取实现**:在acquireShared(int arg)方法中，同步器调用tryAcquireShared( int arg)方法尝试获取同步状态，**tryAcquireShared(intarg)方法返回值为int类型，当返回值大于等于0时，表示能够获取到同步状态**。因此，**在共享式获取的自旋过程中，成功获取到同步状态并退出自旋的条件就是tryAcquireShared(int arg)方法返回值大于等于0**

3. **共享式同步状态释放**:通过调用releaseShared( int arg)方法可以释放同步状态。

##### 独占式超时获取释放

* **使用理解**:通过调用同步器的**doAcquireNanos(int arg,long nanosTimeout)**方法可以超时获取同步状态，即在指定的时间段内获取同步状态，**如果获取到同步状态则返回true，否则，返回false**。该方法提供了传统Java同步操作(比如synchronized关键字)所不具备的特性。
* **支持中断**:超时获取同步状态过程可以**被视作响应中断获取同步状态过程的"增强版”**, doAcquireNanos(int arg,long nanosTimeout)方法在支持响应中断的基础上，增加了超时获取的特性
* **设置时间过短**:**如果nanosTimeout小于等于spinForTimeoutThreshold(1000纳秒)时，将不会使该线程进行超时等待，而是进入快速的自旋过程**。原因在于，非常短的超时等待无法做到十分精确，如果这时再进行超时等待，相反会让nanosTimeout的超时从整体上表现得反而不精确
  ![image-20240402173615596](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240402173615596.png)

#### 重入锁ReentrantLock

**什么是重入?**重进入是指任意线程在获取到锁之后能够再次获取该锁而不会被锁所阻塞

**重入实现需要解决两个问题:**

1. **线程再次获取锁**:锁需要去识别获取锁的线程是否为当前占据锁的线程，如果是，则再次成功获取。
2. **锁的最终释放**:线程重复n次获取了锁，随后在第n次释放该锁后，其他线程能够获取到该锁。锁的最终释放要求**锁对于获取进行计数自增**，计数表示当前锁被重复获取的次数，而**锁被释放时，计数自减**，当**计数等于0时表示锁已经成功释放**。

ReentrantLock总共有三个内部类，并且三个内部类是紧密相关的，下面先看三个类的关系。

![image-20240402185004827](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240402185004827.png) 

ReentrantLock类内部总共存在Sync、NonfairSync、FairSync三个类,NonfairSync与FairSync类继承自Sync类，Sync类继承自AQS抽象类![image-20240402185153080](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240402185153080.png)

#### 读写锁ReentrantReadWriteLock

读写锁在同一时刻可以允许多个读线程访问，但是在写线程访问时，所有的读线程和其他写线程均被阻塞。读写锁维护了一对锁，一个读锁和一个写锁，通过分离读锁和写锁，使得并发性相比一般的排他锁有了很大提升。

Java并发包中提供的读写锁是ReentrantReadWriteLock，具有如下特性

* 公平性选择:支持公平和非公平(默认）的锁获取方式
* 支持重入:同一线程获取读锁之后能再次获取;同一线程获取写锁之后能再次获取写锁，并且还能获取读锁。
* 锁降级:按照获取写锁，再获取读锁，再释放写锁的顺序，写锁能够降级为读锁

##### 读写锁的接口

ReentrantReadWriteLock 是**接口ReadWriteLock**的具体实现，ReadWriteLock中仅定义了两个方法:

* readLock():获取读锁
* writeLock():获取写锁

ReentrantReadWriteLock首先实现了接口中的两个方法，其次还提供了查看其内部状态的方法，方法及描述如下:

![image-20240402185728551](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240402185728551.png) 

##### 读写锁的实现分析

###### 读写状态设计

读写锁依然是组合了一个自定义的同步器(AQS)来实现同步功能，而读写状态就是其同步器的状态，再次查看同步器的详解可知，同步状态state是一个int类型的整数。前面ReentrantLock实现重入性是在state上面进行累加，例如同一线程重复获取N次，那state的值为N。现在对于读写锁来说同样只能在这个int类型的同步状态上维护多个读线程和一个写线程的状态，所以此时**累加已经不行了**，**只能将一个32位的int变量进行切割，其中高16位维护读状态，低16位维护写状态**。

![image-20240402185938457](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240402185938457.png) 

**解析:当前状态表示一个线程已经获取了写锁，并且重入了两次，所以写状态为3，并且获取了两次读锁，所以读状态为2;**

###### 写锁的获取与释放

**获取:**写锁是一个支持重进入的排它锁。如果当前线程已经获取了写锁，则增加写状态。如果当前线程在获取写锁时，读锁已经被获取(读状态不为0)或者该线程不是已经获取写锁的线程，则当前线程进入等待状态。

**释放**:写锁释放与ReentrantLock的锁释放类似，因为支持可重入，所以这里每释放一次则写状态减1，当写状态减为0时，才真正释放写锁，别的线程才可以获取。

###### 读锁的获取与释放

读锁是一个支持重进入的共享锁，它能够被多个线程同时获取，在没有其他写线程访问(或者写状态为0)时，读锁总会被成功地获取，而所做的也只是(线程安全的)增加读状态。如果当前线程已经获取了读锁，则增加读状态。如果当前线程在获取读锁时，写锁已被其他线程获取，则进入等待状态。

读锁是一个支持重进入的共享锁，并且支持多个线程同时获取。所以在能够获取读锁的状态下，不管是同一线程再次获取读锁，还是其他线程获取读锁，都只是在读状态增加。

但是，获取读锁的实现从Java 5到Java 6变得复杂许多，主要原因是新增了一些功能，例如**getReadHoldCount()方法，作用是返回当前线程获取读锁的次数**。读状态是记录所有线程获取读锁次数的总和，而每个线程各自获取读锁的次数只能选择保存在ThreadLocal中，由线程自身维护。

###### 锁降级

**锁降级(支持)**︰指的是写锁降级成为读锁。如果当前线程拥有写锁，然后将其释放，最后再获取读锁，这种分段完成的过程不能称之为锁降级。锁降级是**指把持住(当前拥有的)写锁，再获取到读锁，随后释放(先前拥有的)写锁的过程**。

锁升级(不支持)︰指读锁升级为写锁。流程遵循先获取读锁，再获取写锁，再释放读锁。

##### 读写锁应用

![image-20240328093254907](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240328093254907.png) 

所谓的读写锁（Readers-Writer Lock），顾名思义就是**将一个锁拆分为读锁和写锁两个锁**。其中**读锁允许多个线程同时获得**，因为读操作本身是线程安全的。而**写锁则是互斥锁，不允许多个线程同时获得写锁**，**并且写操作和读操作也是互斥的**。

独占锁（写锁）：指该锁一次只能被一个线程锁持有。对于ReentranrLock和 Synchronized 而言都是独占锁。

共享锁（读锁）：该锁可被多个线程所持有。

对于ReentrantReadWriteLock其读锁时共享锁，写锁是独占锁，读锁的共享锁可保证并发读是非常高效的。

**main方法：**

~~~java
public class Test01 {
    public static void main(String[] args) {
         LockMyCache myCache = new LockMyCache();
        //10个写线程
        for (int i = 0; i < 10; i++) {
            final int temp = i;
            new Thread(() -> {
                myCache.put(temp + "", temp + "");
            }, "线程" + String.valueOf(i)).start();
        }
        //10个读线程
        for (int i = 0; i < 10; i++) {
            final int temp = i;
            new Thread(() -> {
                myCache.get(temp + "");
            }, "线程" + String.valueOf(i)).start();
        }
    }
}
~~~

**没有读写锁的资源类：**

~~~java
//没有读写锁的资源类，写入的时候，还没写入完成，会存在其他的写入！造成问题
class MyCache {
    private Map<String, String> map = new HashMap<>();

    //写操作
    public void put(String key, String value) {
        System.out.println(Thread.currentThread().getName() + " 执行写操作");
        map.put(key, value);
        System.out.println(Thread.currentThread().getName() + " 写操作完毕");
    }

    //读操作
    public void get(String key) {
        System.out.println(Thread.currentThread().getName() + " 执行读操作");
        map.get(key);
        System.out.println(Thread.currentThread().getName() + " 读操作完毕");
    }
}
~~~

**有读写锁的资源类：**

~~~java
class LockMyCache {
    private volatile Map<String,String> map = new HashMap<>();
    //定义读写锁
    ReentrantReadWriteLock readWriteLock = new ReentrantReadWriteLock();
    //写操作，上写锁
    public void put(String key, String value) {
        readWriteLock.writeLock().lock();//上写锁
        try {
            System.out.println(Thread.currentThread().getName() + " 执行写操作");
            map.put(key, value);
            System.out.println(Thread.currentThread().getName() + " 写操作完毕");
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            readWriteLock.writeLock().unlock();//解写锁
        }
    }

    //读操作，上读锁
    public void get(String key) {
        readWriteLock.readLock().lock();//上读锁
        try {
            System.out.println(Thread.currentThread().getName() + " 执行读操作");
            map.get(key);
            System.out.println(Thread.currentThread().getName() + " 读操作完毕");
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            readWriteLock.readLock().unlock();//解读锁
        }
    }

}
~~~

![image-20240328100551431](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240328100551431.png) ![image-20240328100628642](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240328100628642.png)  

#### LockSupport工具

LockSupport定义了一组的公共静态方法，这些方法**提供了最基本的线程阻塞和唤醒功能**，而LockSupport也成为构建同步组件的基础工具

LockSupport定义了**一组以park开头的方法用来阻塞当前线程**，以及**unpark(Thread thread)方法来唤醒**一个被阻塞的线程。这些方法及描述如下:

![image-20240402190558046](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240402190558046.png) 

#### Condition接口

任意一个Java对象，都拥有—组监视器方法(定义在java.lang.Object上)，主要包括wait()、wait(long timeout)、notify()以及notifyAll()方法，这些方法与synchronized同步关键字配合，可以实现等待/通知模式。**Condition接口也提供了类似Object的监视器方法，与Lock配合可以实现等待/通知模式**。

![image-20240402190713341](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240402190713341.png) 

##### Condition接口与示例

Condition定义了等待/通知两种类型的方法，当前线程调用这些方法时，需要提前获取到Condition对象关联的锁。Condition对象是由Lock对象(**调用Lock对象的newCondition()方法**)创建出来的，换句话说，Condition是依赖Lock对象的。

![image-20240402190855836](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240402190855836.png) 

**分析：**

* **创建Condition对象**:一般都会将Condition对象作为成员变量，获取一个condition必须通过Lock的newCondition方法
* **await()**:当调用await()方法后，当前线程会释放锁并在此等待
* **signal()**:其他线程调用Condition对象的signal()方法，通知当前线程后，当前线程才从等待状态进入锁的同步队列，尝试获取锁，如果获取到了锁，则从await()方法返回。

##### Condition的部分方法

![image-20240402191108221](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240402191108221.png) 

##### Condition实现分析

ConditionObject是同步器AbstractQueuedSynchronizer的内部类，因为Condition的操作需要获取相关联的锁，所以作为同步器的内部类也较为合理。**每个Condition对象都包含着一个队列(以下称为等待队列)**，该队列是Condition对象实现等待/通知功能的关键。

###### 等待队列

等待队列是一个FIFO的队列，并且同步队列中的节点复用了AbstractQueuedSynchronizer.Node，与同步队列中的节点一致。

加入等待队列之后，我们可以通过下面这个图来了解同步器AQS与同步队列，等待队列的对应关系。

![image-20240402191244709](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240402191244709.png) 



**总结分析:**

* 一个Condition包含一个等待队列，Condition拥有首节点(firstWaiter)和―尾节点(lastWaiter);
* 一个同步器(AQS)**拥有一个同步队列和多个等待队列**，因为condition对象可以创建多个。(对比来看，Object监视器模型上，一个对象拥有一个同步队列和一个等待队列)

###### 等待

调用Condition的await()方法(或者以await开头的方法)，会使当前**线程进入等待队列并释放锁**，**同时线程状态变为等待状态(WAITING)**。当从await()方法返回时，当前线程一定获取了Condition相关联的锁。如果从队列(同步队列和等待队列)的角度看await()方法，当调用await()方法时，相当于同步队列的首节点(获取了锁的节点)移动到Condition的等待队列中

![image-20240402191507467](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240402191507467.png) 

###### 通知

调用Condition的signal()方法，将会唤醒在等待队列中等待时间最长的节点(首节点)，在唤醒节点之前，会将节点移到同步队列中，开始加入到获取同步状态的竞争当中。

![image-20240402191604837](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240402191604837.png) 

成功获取锁之后，被唤醒的线程将从先前调用的await()方法返回，继续执行。Condition的signalAll()方法，相当于对等待队列中的每个节点均执行一次signal()方法，效果就是将等待队列中所有节点全部移动到同步队列中，并唤醒每个节点的线程

### 并发安全容器

#### ConCurrentHashMap

##### HashTable的缺点

在多线程的情况下，使用HashMap是线程不安全的。另外可以使用Hashtable，其是线程安全的，但是Hashtable的运行效率很低，之所以效率低下**主要是因为其实现使用了synchronized关键字**对put等操作进行加锁，而synchronized关键字加锁是对整个对象进行加锁，也就是说在进行put等修改Hash表的操作时，锁住了整个Hash表，从而使得其表现的效率低下。所以最终就诞生了ConcurrentHashMap。

##### 锁分段技术

HashTable容器在竞争激烈的并发环境下表现出效率低下的原因是所有访问HashTable的线程都必须竞争同一把锁，假如**容器里有多把锁，每一把锁用于锁容器其中一部分数据**，那么当多线程访问容器里不同数据段的数据时，线程间就不会存在锁竞争，从而可以有效提高并发访问效率，这就是ConcurrentHashMap所使用的锁分段技术。首先将数据分成一段一段地存储，然后给每一段数据配—把锁，当一个线程占用锁访问其中一个段数据的时候，其他段的数据也能被其他线程访问。

##### ConCurrentHashMap1.7

在**JDK1.5~1.7版本**，Java使用了分段锁机制实现ConcurrentHashMap.

简而言之，ConcurrentHashMap在对象中**保存了一个Segment数组**，即**将整个Hash表划分为多个分段**;而每个Segment元素，即**每个分段则类似于一个Hashtable;**这样，在执行put操作时首先根据hash算法**定位到元素属于哪个Segment**，然后**对该Segment加锁**即可。因此，ConcurrentHashMap在多线程并发编程中可以实现多线程put操作。

###### 数据结构

整个ConcurrentHashMap由一个个 Segment组成，Segment 代表"部分"或”一段"的意思，所以很多地方都会将其描述为分段锁。简单理解就是，**ConcurrentHashMap是由Segment数组结构和HashEntry数组结构组成**。**Segment是一种可重入锁**(ReentrantLock)，在ConcurrentHashMap里扮演锁的角色;**HashEntry则用于存储键值对数据**。

![image-20240403081255601](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240403081255601.png) 

###### 初始化

初始化方法是通过**initialCapacity**、 **loadFactor**和**concurrencyLevel**参数来初始化segment数组、段偏移量segmentShift、段掩码segmentMask和每个segment里的 HashEntry数组来实现的。

* **concurrencyLevel**:并行级别、并发数、Segment 数。**默认是16**，也就是说ConcurrentHashMap有16个Segments,所以理论上，这个时候，最多可以同时支持16个线程并发写，只要它们的操作分别分布在不同的Segment 上。这个值可以在初始化的时候设置为其他值，**但是—旦初始化以后，它是不可以扩容的**。
* **initialCapacity**:初始容量，这**个值指的是整个ConcurrentHashMap 的初始容量**，实际操作的时候需要**平均分给每个Segment**。
* **loadFactor**: Segment 数组不可以扩容，所以**这个负载因子是给每个Segment内部使用的**。

###### 定位Segement

根据前面的数据结构介绍可知，数据都是受到Segment分段锁保护的，所以**插入或者获取元素的时候，必须要先定位到Segment**。可以看到ConcurrentHashMap会首先使用Wang/Jenkins **hash的变种算法对元素的hashCode进行一次再散列**。

**备注：再散列 === 对hashcode进行再进行一次散列**

![image-20240403082254651](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240403082254651.png) 

之所以进行再散列，目的是减少散列冲突，使元素能够均匀地分布在不同的Segment上，从而提高容器的存取效率。
ConcurrentHashMap通过以下**散列算法**定位segment。

![image-20240403082123851](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240403082123851.png) 

###### get操作

Segment的get操作实现非常简单和高效。先经过一次再散列，然后使用这个散列值通过散列运算定位到Segment，再通过散列算法定位到元素。

![image-20240403082517942](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240403082517942.png) 

get操作的高效之处在于**整个get过程不需要加锁**。我们知道HashTable容器的get方法是需要加锁的，那么ConcurrentHash-Map的get操作是如何做到**不加锁不出问题的呢**?

**原因是它的get方法里将要使用的共享变量都定义成volatile类型**，如用于统计当前Segement大小的count字段和用于存储值的HashEntry的value。

![image-20240403082631871](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240403082631871.png) 

在定位元素的代码里我们可以发现，**定位HashEntry**和**定位Segment**的散列算法虽然一样，都与数组的长度减去1再相"与"，但是相"与"的值不一样，**定位Segment使用的是元素的hashcode通过再散列后得到的值的高位**，而**定位HashEntry直接使用的是再散列后的值**。

![image-20240403082829882](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240403082829882.png) 

###### put操作

由于put方法里需要对共享变量进行写入操作，所以**为了线程安全，在操作共享变量时必须加锁**。put方法首先定位到Segment，然后在Segment里进行插入操作。插入操作需要经历两个步骤，**第一步判断是否需要对Segment里的HashEntry数组进行扩容**，**第二步定位添加元素的位置，然后将其放在HashEntry数组里**。（**先判断，后插入**）

* **是否需要扩容**：**在插入元素前**会先判断Segment里的HashEntry数组是否超过容量(threshold)，如果超过阈值，则对数组进行扩容。值得—提的是，**Segment的扩容判断比HashMap更恰当**，因为HashMap是在插入元素后判断元素是否已经到达容量的，如果到达了就进行扩容，**但是很有可能扩容之后没有新元素插入**，这时HashMap就进行了一次无效的扩容。

* **如何扩容**：在扩容的时候，首先会创建一个容量是**原来容量两倍的数组**，然后将原数组里的元素进行再散列后插入到新的数组里。为了高效，ConcurrentHashMap不会对整个容器进行扩容，而**只对某个segment进行扩容**。

###### size操作

如果要统计整个ConcurrentHashMap里元素的大小，就**必须统计所有Segment里元素的大小后求和**。

Segment里的全局变量count是一个volatile变量，那么在多线程场景下，是不是直接把所有Segment的count相加就可以得到整个ConcurrentHashMap大小了呢?
不是的，**虽然相加时可以获取每个Segment的count的最新值**，但是可能累加前使用的count发生了变化，那么统计结果就不准了。所以，**最安全的做法是在统计size的时候把所有Segment的put、remove和clean方法全部锁住**，但是这种做法显然非常低效。
（**备注：累加也需要时间，在这个时间段内修改的count，你做加法时是看不出来的**）
因为在累加count操作过程中，之前累加过的count发生变化的**几率非常小**，所以ConcurrentHashMap的做法是先尝试**3次**通过不锁住Segment的方式来统计各个Segment大小，**如果统计的过程中，容器的count发生了变化，则再采用加锁的方式**来统计所有Segment的大小。

那么ConcurrentHashMap是如何判断在统计的时候容器是否发生了变化呢?
使用modCount变量，在put、remove和clean方法里操作元素前都会将变量modCount进行加1，那么在统**计size 前后比较modCount是否发生变化，从而得知容器的大小是否发生变化**。

##### ConCurrentHashMap1.8

在JDK1.7之前，ConcurrentHashMap是通过分段锁机制来实现的，所以**其最大并发度受Segment的个数限制**。因此，在JDK1.8中，ConcurrentHashMap的实现原理摒弃了这种设计，而是选择了与**HashMap类似的数组+链表+红黑树的方式实现**，而**加锁则采用CAS和synchronized实现**。

###### 数据结构

结构上和Java8的 HashMap基本上一样，不过它要保证线程安全性，所以在**源码上确实要复杂一些**。

![image-20240403084102561](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240403084102561.png) 

###### Node节点

![image-20240403084148167](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240403084148167.png) 

可以看出，每个Node 里面是 key-value 的形式，并且**把 value 用volatile修饰**，以便保证可见性，同时内部还有一个指向下一个节点的next 指针。

###### put方法

###### get方法

自己看源码

#### CopyOnWriteArrayList

从JDK1.5开始，Java并发包里提供了使用CopyOnWrite机制实现的并发容器CopyOnWriteArray-List 作为主要的并发List，CopyOnWrite的并发集合还包括CopyOnWriteArraySet，其底层正是利用CopyOnWriteArrayList 实现的。所以今天我们以CopyOnWriteArrayList为突破口，来看一下CopyOnWrite容器的特点。

###### CopyOnWrite含义

从CopyOnWriteArrayList 的名字就能看出它是满足CopyOnWrite 的ArrayList，**CopyOnWrite的意思是说，当容器需要被修改的时候，不直接修改当前容器，而是先将当前容器进行Copy，复制出一个新的容器，然后修改新的容器，完成修改之后，再将原容器的引用指向新的容器。**这样就完成了整个修改过程。

###### 使用场景

* **读操作可以尽可能的快，而写即使慢—些也没关系**：为了将读取的性能发挥到极致，CopyOnWriteArrayList**读取是完全不用加锁**的，**并且写入也不会阻塞读取操作，也就是说你可以在写入的同时进行读取**。**只有写入和写入之间需要进行同步**，也就是不允许多个写入同时发生，所以会更慢一点。
* **读多写少**：写入本身是会拷贝一份出来，会增加资源的消耗，同时多个写入之间需要进行同步，所以应该尽量的少。

###### 特点

**迭代期间允许修改集合内容**：ArrayList**在迭代期间如果修改集合的内容**，会抛出Concurrent-ModificationException异常的，
CopyOnWriteArrayList 的迭代器在迭代的时候，如果数组内容被修改了,CopyOnWriteArrayList不会报 ConcurrentModificationException的异常，**因为迭代器使用的依然是旧数组，只不过迭代的内容可能已经过时了**。

备注：迭代器在迭代过程中会检查集合是否被修改，如果检测到修改，则会抛出此异常，例如：在遍历List期间删除元素问题

###### 缺点

* **内存占用问题**：因为CopyOnWrite 的**写时复制机制**，所以**在进行写操作的时候，内存里会同时驻扎两个对象的内存**，这一点会占用额外的内存空间。
* **数据―致性问题**：由于CopyOnWrite容器的修改是**先修改副本，所以这次修改对于其他线程来说，并不是实时能看到的**，只有在修改完之后才能体现出来。如果你希望写入的的数据马上能被其他线程看到，CopyOnWrite容器是不适用的。

#### ConCurrentLinkedQueue

实现一个线程安全的队列有两种方式：—种是使用**阻塞算法**，另一种是使用**非阻塞算法**。

使用阻塞算法的队列可以用一个锁(入队和出队用同一把锁)或两个锁(入队和出队用不同的锁)等方式来实现。

非阻塞的实现方式则可以**使用循环CAS的方式来实现**，这个死循环去配合CAS也就是典型的**乐观锁**的思想。

ConcurrentLinkedQueue就是使用**非阻塞算法**实现线程安全的**非阻塞队列**

**适合用在不需要阻塞功能，且并发不是特别剧烈的场景**。

#### 阻塞队列BlockingQueue

###### 阻塞队列基本介绍

阻塞队列是一个队列，在数据结构中起的作用如下图：

![image-20240328110141531](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240328110141531.png) 

当队列是空的，从队列中获取元素的操作将会被阻塞。

当队列是满的，从队列中添加元素的操作将会被阻塞。

试图从空的队列中获取元素的线程将会被阻塞，直到其他线程往空的队列插入新的元素。

试图向已满的队列中添加新元素的线程将会被阻塞，直到其他线程从队列中移除一个或多个元素或者完全清空，使队列变得空闲起来并后续新增。

**阻塞队列的用处：**

在多线程领域：所谓阻塞，在某些情况下会挂起线程（即阻塞），一旦条件满足，被挂起的线程又会自动被唤起。

**为什么需要 BlockingQueue？**

好处是我们不需要关心什么时候需要阻塞线程，什么时候需要唤醒线程，因为这一切BlockingQueue 都给你一手包办了。
在 concurrent 包发布以前，在多线程环境下，我们每个程序员都必须自己去控制这些细节，尤其还要兼顾效率和线程安全，而这会给我们的程序带来不小的复杂度。

###### 接口架构图

![image-20240328110437828](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240328110437828.png) 

* **ArrayBlockingQueue**：由**数组**结构组成的有界阻塞队列。
* **LinkedBlockingQueue**：由**链表**结构组成的**有界**（默认值为：integer.MAX_VALUE）阻塞队列。
* **SynchronousQueue**：不存储元素的阻塞队列，也即**单个元素的队列**。

==**这些类都实现了BolckQueue接口**==

###### 四组API 的使用

![image-20240328110740942](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240328110740942.png) 

![image-20240328110812798](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240328110812798.png) 

###### 抛出异常(add,remove)

**add的返回值为boolean如果队列已满则报错，remove的返回值为弹出的元素如果队列为空则报错，element的返回值为队首元素**

~~~java
		BlockingQueue<String> blockingQueue = new ArrayBlockingQueue<>(3);

        System.out.println(blockingQueue.add("a"));
        System.out.println(blockingQueue.add("b"));
        System.out.println(blockingQueue.add("c"));
        //如果阻塞队列满了，还add的话会抛	IllegalStateException: Queue full
//        System.out.println(blockingQueue.add("d"));

        System.out.println("________________________");
		System.out.println(blockingQueue.element()); //返回队首元素

        System.out.println(blockingQueue.remove());
        System.out.println(blockingQueue.remove());
        System.out.println(blockingQueue.remove());
        //如果阻塞队列为空，还remove会抛 NoSuchElementException
//        System.out.println(blockingQueue.remove());
~~~

###### 返回特殊值(offer,poll)

**offer的返回值为boolean如果队列已满则返回false，poll的返回值为弹出的元素如果队列为空则返回null，peek的返回值为队首元素**

~~~java
		ArrayBlockingQueue<String> blockingQueue = new ArrayBlockingQueue<>(3);

        System.out.println(blockingQueue.offer("a"));
        System.out.println(blockingQueue.offer("b"));
        System.out.println(blockingQueue.offer("c"));
        //不会抛出异常，如果添加失败就返回false
//        System.out.println(blockingQueue.offer("d"));

        System.out.println("________________________");
        System.out.println(blockingQueue.peek());//返回队首元素

        System.out.println(blockingQueue.poll());
        System.out.println(blockingQueue.poll());
        System.out.println(blockingQueue.poll());
        //不会抛出异常，如果删除失败就返回null
//        System.out.println(blockingQueue.poll());
~~~

###### 一直阻塞(put,take)

**put方法没有返回值，take方法的返回值为弹出元素**

~~~java
		ArrayBlockingQueue<String> blockingQueue = new ArrayBlockingQueue<>(3);

        blockingQueue.put("a");
        blockingQueue.put("b");
        blockingQueue.put("c");
        //如果阻塞队列满了，还put的话，该put操作会一直阻塞在这里，直到阻塞队列出队元素
//        blockingQueue.put("d");

        System.out.println("__________________________");

        System.out.println(blockingQueue.take());
        System.out.println(blockingQueue.take());
        System.out.println(blockingQueue.take());
        //如果阻塞队列为空，还take的话，该take操作会一直阻塞在这里，直到阻塞队列有进队元素
//        System.out.println(blockingQueue.take());
~~~

###### 超时退出(offer,poll)

**超时退出和返回特殊值所使用的方法是一样的，只不过进行了重载，在超时退出中，需要额外提供时间的相关参数**

~~~java
		ArrayBlockingQueue<String> blockingQueue = new ArrayBlockingQueue<>(3);

        System.out.println(blockingQueue.offer("a", 3, TimeUnit.SECONDS));
        System.out.println(blockingQueue.offer("b", 3, TimeUnit.SECONDS));
        System.out.println(blockingQueue.offer("c", 3, TimeUnit.SECONDS));
        //如果阻塞队列满了，还offer的话,这个offer操作会阻塞3秒，如果3秒过后，阻塞队列仍满的话，就退出offer操作
//        System.out.println(blockingQueue.offer("d", 3, TimeUnit.SECONDS));

        System.out.println("__________________________");

        System.out.println(blockingQueue.poll(3, TimeUnit.SECONDS));
        System.out.println(blockingQueue.poll(3, TimeUnit.SECONDS));
        System.out.println(blockingQueue.poll(3, TimeUnit.SECONDS));
        //如果阻塞队列为空，还poll的话,这个poll操作会阻塞3秒，如果3秒过后，阻塞队列仍为空的话，就退出poll操作
//        System.out.println(blockingQueue.poll(3, TimeUnit.SECONDS));
~~~

###### 同步队列

**SynchronousQueue** 没有容量，或者说容量默认为一。与其他的 BlockingQueue 不同，SynchronousQueue是一个不存储元素的 BlockingQueue 。

每一个**put操作**必须要等待一个**take操作**，否则不能继续添加元素，反之亦然。

~~~java
		SynchronousQueue<String> synchronousQueue = new SynchronousQueue<>();

        //A线程向同步队列里面写入元素
        new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                try {
                    System.out.println(Thread.currentThread().getName() + " 写入元素" + i);
                    Thread.sleep(2000);
                    synchronousQueue.put(String.valueOf(i));
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        },"A线程").start();

        //B线程向同步队列里面读出元素
        new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                try {
                    System.out.println(Thread.currentThread().getName() + " 读出元素" + i);
                    synchronousQueue.take();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        },"B线程").start();
~~~

![image-20240328120118210](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240328120118210.png) 

#### Fork/Join框架

Fork/Join框架是Java 7提供的一个用于并行执行任务的框架，是一个把大任务分割成若干个小任务，最终汇总每个小任务结果后得到大任务结果的框架。

###### 运行流程图

![image-20240403092832292](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240403092832292.png) 

###### 工作窃取算法

工作窃取(work-stealing)算法是指**某个线程从其他队列里窃取任务来执行**。那么，为什么需要使用工作窃取算法呢?假如我们需要做一个比较大的任务，可以把这个任务分割为若干互不依赖的子任务，为了减少线程间的竞争，把这些子任务分别放到不同的队列里，并为每个队列创建一个单独的线程来执行队列里的任务，线程和队列——对应。比如A线程负责处理A队列里的任务。但是，有的线程会先把自己队列里的任务干完，而其他线程对应的队列里还有任务等待处理。**干完活的线程与其等着，不如去帮其他线程干活**，于是它就去其他线程的队列里窃取一个任务来执行。而在这时它们会访问同一个队列，所以为了减少窃取任务线程和被窃取任务线程之间的竞争，**通常会使用双端队列，被窃取任务线程永远从双端队列的头部拿任务执行，而窃取任务的线程永远从双端队列的尾部拿任务执行**。

![image-20240403093025726](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240403093025726.png) 

###### Fork/Join使用

###### Fork/Join实现原理

### 原子类和并发工具类

#### CAS

###### 什么是CAS

CAS的全称为Compare-And-Swap，直译就是对比交换。是**一条CPU的原子指令**，其**作用是让CPU先进行比较两个值是否相等，然后原子地更新某个位置的值**，经过调查发现，其实现方式是基于硬件平台的汇编指令，就是说**CAS是靠硬件实现的，JVM只是封装了汇编调用**，那些AtomicInteger类便是使用了这些封装后的接口。

简单解释：CAS操作需要输入两个数值，一个旧值(期望操作前的值)和一个新值，在操作期间先比较下在旧值有没有发生变化，**如果没有发生变化，才交换成新值，发生了变化则不交换**。

###### CAS使用举例

并发线程累加操作同一个变量500次，但最终结果一般都到不了500，其背后原因就是并发状态下，线程不安全导致的。

针对这个问题，我们如果**将共享的操作变量int换成AtomicInteger**，也可以解决问题。其中**AtomicInteger的实现是使用了CAS操作**

![image-20240403094028547](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240403094028547.png) 

###### CAS问题

**CAS方式为乐观锁**，**synchronized为悲观锁**。因此使用CAS解决并发问题通常情况下性能更优。

但是CAS仍然存在三大问题：**ABA问题**，**循环开销大**，**只能保证一个共享变量的原子操作**。

1. ABA问题
   **什么是ABA问题**：因为CAS需要在操作值的时候，检查值有没有发生变化，如果没有发生变化则更新，**但是如果一个值原来是A，变成了B，又变成了A**，那么**使用CAS进行检查时会发现它的值没有发生变化**，但是实际上却变化了。ABA很多业务场景是可以容忍的，但是有些业务场景就会带来问题。
   **ABA问题的解决思路**：使用**版本号**。在变量前面追加上版本号，每次变量更新的时候把版本号加1，那么**A一B一A**就会变成**1A→2B→3A**。从Java 1.5开始，JDK的Atomic包里提供了一个类AtomicStampedReference来解决ABA问题。这个类的compareAndSet方法的作用是首先检查当前引用是否等于预期引用，并且检查当前标志是否等于预期标志，**如果全部相等，则以原子方式将该引用和该标志的值设置为给定的更新值**。

2. 循环开销大
   自旋CAS如果长时间不成功，会给CPU带来非常大的执行开销
3. 只能保证一个共享变量的原子操作
   当对一个共享变量执行操作时，我们可以使用循环CAS的方式来保证原子操作，但是对多个共享变量操作时，循环CAS就无法保证操作的原子性，这个时候就可以用**锁**

###### 乐观锁悲观锁

乐观锁和悲观锁是用来解决并发场景下数据竞争问题的两种思想。

乐观锁:**乐观锁在操作数据时非常乐观，认为别人不会同时修改数据**。因此在执行更新的时候只会判断—下在此期间别人是否修改了数据，如果别人修改了数据则放弃操作，否则执行操作。

悲观锁:**悲观锁在操作数据时比较悲观，认为别人会同时修改数据**。因此操作数据时直接把数据锁住，直到操作完成后才会释放锁;上锁期间其他人不能修改数据

#### 原子操作类

###### 原子更新基本类型

![image-20240403095007857](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240403095007857.png) 

###### 原子更新数组

![image-20240403095133306](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240403095133306.png) 

![image-20240403095240042](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240403095240042.png) 

###### 原子更新引用类型

###### 原子更新字段

#### 并发工具类

###### CountDownLatch

**原理：**

* CountDownLatch 主要有两个方法，一个是CountDown方法，另一个是await 方法
* 当一个或多个线程调用 await 方法时，这些线程会阻塞，只有被唤醒才能执行await 下面的代码
* 其他线程调用CountDown方法会将计数器减1（调用CountDown方法的线程不会阻塞）
* 当计数器变为0时，await 方法阻塞的线程会被唤醒，继续执行下面的代码

~~~java
 public static void main(String[] args) throws InterruptedException {
    //定义倒计时器
    CountDownLatch countDownLatch = new CountDownLatch(6);

    for (int i = 0; i < 6; i++) {
        new Thread(() -> {
            System.out.println(Thread.currentThread().getName() + " 执行了减1操作");
            //计数器减1
            countDownLatch.countDown();
        }, String.valueOf(i)).start();
    }

    //阻塞等待计数器归零
    countDownLatch.await();
    System.out.println("所有线程都执行减一操作完毕");
}
~~~

###### CyclicBarrier

![image-20240328084808428](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240328084808428.png) 

翻译：CyclicBarrier 篱栅

作用：和上面的减法相反，这里是加法。CyclicBarrier 作用是让一组线程相互等待，当达到一个共同点时，所有之前等待的线程再继续执行，且 CyclicBarrier 功能可重复使用。

CyclicBarrier 字面意思回环栅栏（循环屏障），通过它可以实现让一组线程等待至某个状态（屏障点）之后再全部同时执行。叫做回环是因为当所有等待线程都被释放以后，CyclicBarrier可以被重用。 

当所有的龙珠都被各个线程集齐后，才会执行CyclicBarrier 里面的线程“召唤神龙”

~~~java
public static void main(String[] args) {
    CyclicBarrier cyclicBarrier = new CyclicBarrier(7, () -> {
        System.out.println("七颗龙珠已集齐，开始召唤神龙");
    });

    for (int i = 0; i < 7; i++) {
        final int temp = i;
        new Thread(() -> {
            try {
                System.out.println(Thread.currentThread().getName() + " 收集了龙珠" + temp);
                cyclicBarrier.await();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } catch (BrokenBarrierException e) {
                throw new RuntimeException(e);
            }
        },"线程"+String.valueOf(i)).start();
    }
}
~~~

###### Semaphore

Semaphore（信号量）是Java中一个并发控制工具，用于控制对共享资源的访问。它基于计数器的原理，可以限制同时访问某个资源的线程数量。

Semaphore主要有两个方法，一个是acquire（获取），另一个是release （释放）

* `acquire()`方法尝试获取一个许可证，如果当前没有可用的许可证，则该线程将被阻塞，直到有可用的许可证为止。当一个线程调用 acquire 操作时，他要么通过成功获取信号量（信号量-1）；要么一直等下去，直到有线程释放信号量，或超时
* `release()`方法释放一个许可证，使其可供其他线程使用。实际上会将信号量的值 + 1，然后唤醒等待的线程。

通过适当地使用`acquire()`和`release()`方法，在超过信号量允许的线程数量时，可以限制并发访问共享资源的线程数量，实现线程间的同步和互斥。

~~~java
public static void main(String[] args) {
    Semaphore semaphore = new Semaphore(3);// 模拟资源类，有3个空车位

    for (int i = 0; i < 6; i++) {// 模拟6个车
        new Thread(() -> {
            try {
                semaphore.acquire();// acquire 得到
                System.out.println(Thread.currentThread().getName() + " 正在停车");
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } finally {
                semaphore.release();// 释放这个位置
            }
        },"车"+String.valueOf(i)).start();
    }
}
~~~

###### Exchanger

Exchanger(交换者)是一个用于线程间协作的工具类。Exchanger用于进行线程间的数据交换。它提供一个同步点，在这个同步点，两个线程可以交换彼此的数据。这两个线程通过exchange方法交换数据，如果第一个线程先执行exchange()方法，它会一直等待第二个线程也执行exchange方法，当两个线程都到达同步点时，这两个线程就可以交换数据，将本线程生产出来的数据传递给对方。

exchange()方法:入参是本线程需要传递给对方的数据，返回值则是对方线程传过来的数据。

![image-20240403100053824](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240403100053824.png) 

### 线程池和Executor框架

#### 线程池原理

###### 为什么要使用线程池

Java中的线程池是运用场景最多的并发框架，几乎所有需要异步或并发执行任务的程序都可以使用线程池。在开发过程中，合理地使用线程池能够带来3个好处。

1. 降低资源消耗:通过重复利用已创建的线程降低线程创建和销毁造成的消耗。
2. 提高响应速度:当任务到达时，任务可以不需要等到线程创建就能立即执行。
3. 提高线程的可管理性:线程是稀缺资源，如果无限制地创建，不仅会消耗系统资源，还会降低系统的稳定性，使用线程池可以进行统一分配、调优和监控

###### 线程池实现原理

当提交一个任务到线程池之后，线程池处理这个任务的流程如下。

![image-20240403101315337](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240403101315337.png) 

**流程分析:**

1. 首先会判断核心线程池是否已满:如果没有满，则直接创建新线程来执行任务。如果已经满了，则进行下一步判断，尝试将任务放入队列。
2. 判断队列是否已经满了:如果没有满，则任务放入队列，结束。如果队列已经满了，则进行下一步判断
3. 判断线程池是否已经满:如果没满，则创建新线程来执行任务。如果已经满了，则按照拒绝策略来处理任务。

#### Executor框架

###### Executo两级调度模型

在上层，Java多线程程序通常把应用分解为若干个任务，然后**使用用户级的调度器(Executor框架)将这些任务映射为固定数量的线程**;

在底层，**操作系统内核将这些线程映射到硬件处理器上**。这种两级调度模型的示意图所示。

<img src="https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240403101657628.png" alt="image-20240403101657628" style="zoom: 67%;" /> 

从图中可以看出，**应用程序通过Executor框架控制上层的调度**;而**下层的调度由操作系统内核控制**，**下层的调度不受应用程序的控制**。

###### Executor框架结构

1. **Executor框架主要由3大部分组成**:
   * **任务**。包括被执行任务需要实现的接口:Runnable接口或Callable接口。
   * **任务的执行**。包括任务执行机制的核心接口Executor，以及继承自Executor的ExecutorService接口。Executor框架有两个关键类实现了ExecutorService接口(ThreadPoolExecutor和ScheduledThreadPoolExecutor)。
   * **异步计算的结果**。包括接口Future和实现Future接口的FutureTask类。
2. **类和接口的简介:**
   * Executor是一个接口，它是Executor框架的基础，它将任务的提交与任务的执行分离开来。
   * ThreadPoolExecutor是线程池的核心实现类，用来执行被提交的任务. ScheduledThreadPoolExecutor是一个实现类，可以在给定的延迟后运行命令，或者定期执行命令。
   * Future接口和实现Future接口的FutureTask类，代表异步计算的结果。
   * Runnable接口和Callable接口的实现类，都可以被ThreadPoolExecutor或Scheduled- ThreadPoolExecutor执行。
3. **类和接口的使用示意图:**

![image-20240403102625850](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240403102625850.png) 

4. **流程分析:**
   1. 主线程首先要创建实现Runnable或者Callable接口的任务对象。工具类Executors可以把一个Runnable对象封装为一个Callable对象(Executors.callable(Runnable task)或Executors.callable(Runnable task,Object resule))。
   2. 然后可以把Runnable对象直接交给ExecutorService执行(ExecutorService.execute(Runnable command));或者也可以把Runnable对象或Callable对象提交给ExecutorService执行(Executor-Service.submit(Runnable task)或
      ExecutorService.submit(Callable<T>task))。
   3. 如果执行ExecutorService.submit(...)，ExecutorService将返回一个实现Future接口的对象FutureTask。由于FutureTask实现了Runnable，程序员也可以创建FutureTask，然后直接交给ExecutorService执行。
   4. 最后，主线程可以执行FutureTask.get()方法来等待任务执行完成。主线程也可以执行FutureTask.cancel (boolean mayInterruptIfRunning)来取消此任务的执行。

###### Executor框架成员

总结一下Executor的框架成员，主要有:**ThreadPoolExecutor**、**ScheduledThreadPoolExecutor**、**Future接口**、**Runnable接口**、**Callable接口**和**Executors**。

1. **ThreadPoolExecutor**线程池的实现类:**是Executor框架最核心的类**，Executors可以创建3种类型的线程池:**SingleThreadExecutor**、**FixedThreadPool**和**CachedThreadPool**
   * FixedThreadPool:一种使用固定线程数的线程池，适用于为了满足资源管理的需求，而需要限制当前线程数量的应用场景，它适用于负载比较重的服务器
   * SingleThreadExecutor:一种使用单个线程数的线程池，适用于需要保证顺序地执行各个任务;并且在任意时间点，不会有多个线程是活动的应用场景。
   * CachedThreadPool:一种会根据需要创建新线程的线程池，是大小无界的线程池，适用于执行很多的短期异步任务的小程序，或者是负载较轻的服务器
2. **ScheduledThreadPoolExecutor**线程池实现类:一种用于定时任务或周期任务的线程池Executors可以创建2种类型的
   延迟线程池
   * ScheduledThreadPoolExecutor:包含若干个线程的ScheduledThreadPoolExecutor。适用于需要多个后台线程执行周期任务，同时为了满足资源管理的需求而需要限制后台线程的数量的应用场景
   * SingleThreadScheduledExecutor:只包含一个线程的ScheduledThreadPoolExecutor。适用于需要单个后台线程执行周期任务，同时需要保证顺序地执行各个任务的应用场景
3. **Future接口**:Future接口和实现Future接口的FutureTask类用来表示异步计算的结果。当把Runnable接口或Callable接口的实现类提交(submit)给线程池之后，可以拿到一个实现了Future接口的对象返回值。
   * 提交Runnable任务到ExecutorService时，这个方法的返回类型是Future<?>，它实际上是一个占位符，因为Runnable本身不返回任何值。这里的Future对象主要用来检查计算是否完成，但没有实际的返回值。
   * 提交Callable任务时，submit(Callable<T> task)方法会返回一个Future<T>对象，通过这个Future对象可以获取到Callable任务计算的结果
4. **Runnable接口或Callable接口**:实现这两任意接口的任务对象可以被线程池执行，区别就是提交Runnable任务不会返回结果，而Callable接口会。 
   * Runnable接口中的run方法没有返回值(void)，所以当你实现Runnable接口并重写run方法时，你不能返回一个结果给调用者。
   * Callable接口中的call方法有返回值，可以是一个任意类型的对象。这使得Callable任务能够计算结果并返回给调用者。

#### ThreadPoolExecutor详解

**记住口诀**：**三大方法，七大参数，四种拒绝策略**

###### **三大方法**

* **Executors.newFixedThreadPool(int)**：执行长期任务性能好，创建一个线程池，一池有N个固定的线程，有固定线程数的线程
  （int，int，。。。。。）

* **Executors.newSingleThreadExecutor()**：只有一个线程（1,1，。。。。）
* **Executors.newCachedThreadPool()**：执行很多短期异步任务，线程池根据需要创建新线程，但在先构建的线程可用时将重用他们。可扩容，遇强则强（0，nteger.MAX_VALUE，。。。。。。）

这三大方法底层都是使用的**ThreadPoolExecutor（）这个方法**，在实际开发中，建议直接使用ThreadPoolExecutor（）

###### **七大参数**

查看三大方法的底层源码，发现**本质都是调用了 new ThreadPoolExecutor ( 7 大参数 )**

~~~java
public ThreadPoolExecutor(int corePoolSize,
                    int maximumPoolSize,
                    long keepAliveTime,
                    TimeUnit unit,
                    BlockingQueue<Runnable> workQueue,
                    ThreadFactory threadFactory,
                    RejectedExecutionHandler handler) {
                    //业务代码
}
~~~

* **corePoolSize**：核心线程数。在创建了线程池后，线程中没有任何线程，等到有任务到来时才创建线程去执行任务。默认情况下，在创建了线程池后，线程池中的线程数为0，当有任务来之后，就会创建一个线程去执行任务，当线程池中的线程数目达corePoolSize后，就会把到达的任务放到缓存队列当中。

* **maximumPoolSize** ：最大线程数。表明线程中最多能够创建的线程数量，此值必须大于等于1，临时线程数 = 最大线程数 - 核心线程数。
* **keepAliveTime**：空闲的线程保留的时间。如果临时线程等待了keepAliveTime时间仍然没有新的任务进来，就关闭临时线程
* **TimeUnit** ：keepAliveTime的时间单位。TimeUnit是一个枚举类，里面可以找到keepAliveTime的时间单位。
* **BlockingQueue< Runnable>** ：阻塞队列，存储等待执行的任务。参数有ArrayBlockingQueue、LinkedBlockingQueue、SynchronousQueue可选，同上一节阻塞队列。
* **ThreadFactory**：线程工厂，用来创建线程，一般默认即可。Executors.defaultThreadFactory()
* **RejectedExecutionHandler** ：拒绝策略。队列已满，而且任务量大于最大线程的异常处理策略。有四种取值。

###### 四种拒绝策略

~~~java
//ThreadPoolExecutor.AbortPolicy():丢弃任务并抛出RejectedExecutionException异常。（默认）

//ThreadPoolExecutor.DiscardPolicy()：也是丢弃任务，但是不抛出异常。

//ThreadPoolExecutor.DiscardOldestPolicy()：丢弃队列最前面的任务，然后重新尝试执行任务（重复此过程）

//ThreadPoolExecutor.CallerRunsPolicy()：由主线程去执行这个任务，老板亲自上
~~~

###### 底层工作原理

![image-20240328151409219](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240328151409219.png) 

**思考题：线程是否越多越好？**

一个计算为主的程序（专业一点称为**CPU**密集型程序）。多线程跑的时候，可以充分利用起所有的cpu核心，比如说4个核心的cpu,开4个线程的时候，可以同时跑4个线程的运算任务，此时是最大效率。但是如果线程远远超出cpu核心数量 反而会使得任务效率下降，因为频繁的切换线程也是要消耗时间的。

**因此对于cpu密集型的任务来说，线程数等于cpu数是最好的了。**

如果是一个磁盘或网络为主的程序（**IO**密集型）。一个线程处在IO等待的时候，另一个线程还可以在CPU里面跑，有时候CPU闲着没事干，所有的线程都在等着IO，这时候他们就是同时的了，而单线程的话此时还是在一个一个等待的。我们都知道IO的速度比起CPU来是慢到令人发指的。所以开多线程，比方说多线程网络传输，多线程往不同的目录写文件，等等。**此时 线程数等于IO任务数是最佳的**。

```java
public static void main(String[] args) {
    // 获得CPU的内核数
//        System.out.println(Runtime.getRuntime().availableProcessors());
    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(
            2,
            5,
            3,
            TimeUnit.SECONDS,
            new ArrayBlockingQueue<>(3),
            Executors.defaultThreadFactory(),
            new ThreadPoolExecutor.CallerRunsPolicy()
    );

    try {
        for (int i = 1; i <= 9; i++) {
            int finalI = i;
            //最大容量为：maximumPoolSize + workQueue = 最大容量数
            threadPoolExecutor.execute(() -> {
                System.out.println(Thread.currentThread().getName() + " 办理业务" + finalI);
            });
        }
    } catch (Exception e) {
        throw new RuntimeException(e);
    } finally {
        threadPoolExecutor.shutdown();// 用完记得关闭
    }
}
```

#### ScheduledT-P-E详解

#### FutureTask详解

FutureTask为Future提供了基础实现，如获取任务执行结果(get)和取消任务(cancel)等。如果任务尚未完成，获取任务执行结果时将会阻塞。**一旦执行结束，任务就不能被重启或取消**(除非使用runAndReset执行计算)。**FutureTask常用来封装Callable和 Runnable**，也可以作为一个任务提交到线程池中执行。除了作为一个独立的类之外，此类也提供了一些功能性函数供我们创建自定义task类使用。**FutureTask 的线程安全由CAS来保证**

###### FutureTask三种状态

1. **未启动**: FutureTask.run()方法还没有被执行之前，FutureTask处于未启动状态。当创建一个FutureTask，且没有执行FutureTask.run()方法之前，这个FutureTask处于未启动状态。
2. **已启动**: FutureTask.run()方法被执行的过程中，FutureTask处于已启动状
3. **已完成**:FutureTask.run()方法执行完后正常结束，或被取消(FutureTask.cancel(...))，或执行FutureTask.run()方法时抛出异常而异常结束，FutureTask处于已完成状态。

![image-20240403104044742](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240403104044742.png) 

###### get和cancle方法

1. **FutureTask.get()分析**:当FutureTask处于未启动或已启动状态时，执行FutureTask.get()方法将导致调用线程阻塞;当FutureTask处于已完成状态时，执行FutureTask.get()方法将导致调用线程立即返回结果或抛出异常。
2. **FutureTask.cancel分析**:当FutureTask处于未启动状态时，执行FutureTask.cancel()方法将导致此任务永远不会被执行;当FutureTask处于已启动状态时，执行FutureTask.cancel(true)方法将以中断执行此任务线程的方式来试图停止任务;当FutureTask处于已启动状态时，执行FutureTask.cancel(false)方法将不会对正在执行此任务的线程产生影响(让正在执行的任务运行完成);当FutureTask处于已完成状态时，执行FutureTask.cancel(...)方法将返回false。

![image-20240403104320765](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240403104320765.png) 

###### FutureTask的使用

可以把FutureTask交给Executor执行;也可以通过ExecutorService.submit(...)方法返回一个FutureTask，然后执行
FutureTask.get()方法或FutureTask.cancel(...)方法。除此以外，还可以单独使用FutureTask。

### 生产者和消费者

线程间的通信 , 线程之间要协调和调度

####  synchroinzed 版

```java
public class Solution {
    public static void main(String[] args) {
        Date date = new Date();
        new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                try {
                    date.increment();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }, "A线程").start();
        new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                try {
                    date.decrement();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }, "B线程").start();
    }
}

//资源类
class Date {
    private int number = 0;

    public synchronized void increment() throws InterruptedException {
        if (number != 0) { // number==1时,就等待
            this.wait();
        }
        number++;
        System.out.println(Thread.currentThread().getName() + "，执行了++操作，此时number的值——>" + number);
        this.notify(); //执行完number++后，唤醒其他线程
    }

    public synchronized void decrement() throws InterruptedException {
        if (number == 0) { // number==0时,就等待
            this.wait();
        }
        number--;
        System.out.println(Thread.currentThread().getName() + "，执行了--操作，此时number的值——>" + number);

        this.notify(); //执行完number--后，唤醒其他线程
    }
}
```

<img src="https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240327110302526.png" alt="image-20240327110302526" style="zoom: 80%;" /> 

#### 问题升级（虚假唤醒）

如果有4个线程，两个加，两个减，再执行前述代码，则结果如下：++和--的操作没有交替执行

![image-20240327110547406](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240327110547406.png) 

这就是所谓的**虚假唤醒**问题。

虚假唤醒是一种现象，它只会出现在多线程环境中，指的是在多线程环境下，多个线程等待在同一个条件上，等到条件满足时，所有等待的线程都被唤醒，但由于多个线程执行的顺序不同，后面竞争到锁、获得运行权的线程在运行时条件已经不再满足，**线程应该睡眠但是却继续往下运行的一种现象**。

**白话：**多线程环境的编程中，我们经常遇到让多个线程等待在一个条件上，等到这个条件成立的时候我们再去唤醒这些线程，让它们接着往下执行代码的场景。
**正常情况：**假如某一时刻条件成立，所有的线程都被唤醒了，然后去竞争锁，因为同一时刻只会有一个线程能拿到锁，其他的线程都会阻塞到锁上无法往下执行，等到成功争抢到锁的线程消费完条件，释放了锁，后面的线程继续运行。
**虚假唤醒：**拿到锁时这个条件很可能已经不满足了，这个时候线程应该继续在这个条件上阻塞下去，而不应该继续执行，如果继续执行了，就说发生了虚假唤醒。

==**核心原因：判断是否阻塞不应该用if只判断一次，而应该在循坏中循环判断是否阻塞**==

所以，**将资源类的if全部替换为while后**，代码的运行结果如下：**四个线程可以交替执行，++和--操作也可以交替执行**

![image-20240327111624615](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240327111624615.png) 

#### JUC版

**三剑客对比：**

![image-20240327113239201](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240327113239201.png) 

**Condition接口：**

wait，notify，notifyAll方法，这些方法与synchornized关键字相配合，可以实现等待/通知模式。

Condition接口也提供了类似的Object的监视器方法（**await()、signal()、signalAll()**），与Lock配合可以实现等待/通知模式。但是这两者在使用方式以及功能上还是有差别的。
**Condition接口来自于java.util.concurrent.locks 包下，是JUC的三个包之一**

![image-20240327114536984](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240327114536984.png) 

（**使用时，通过lock.newCondition()方法生成一个Condition对象**，然后将原本是wait的地方替换为condition.await(),将原本是notifyall()的地方替换为condition.signalAll()）

**注意：要有手动上锁解锁的操作**

~~~java
//资源类
class Date {
    private int number = 0;
    //1.定义lock锁
    Lock lock = new ReentrantLock();
    //2.定义Condition
    Condition condition = lock.newCondition();

    public void increment() throws InterruptedException {
        lock.lock();
        try {
            while (number != 0) { // number==1时,就等待
                condition.await();
            }
            number++;
            System.out.println(Thread.currentThread().getName() + "，执行了++操作，此时number的值——>" + number);
            condition.signalAll(); //执行完number++后，唤醒其他线程
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            lock.unlock();
        }
    }

    public void decrement() throws InterruptedException {
        lock.lock();
        try {
            while (number == 0) { // number==0时,就等待
                condition.await();
            }
            number--;
            System.out.println(Thread.currentThread().getName() + "，执行了--操作，此时number的值——>" + number);

            condition.signalAll(); //执行完number--后，唤醒其他线程
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            lock.unlock();
        }
    }
}
~~~

#### 精确通知顺序访问

能实现精准通知的顺序访问，这就是JUC的优势了，现在我假设，A打印完后，B打印，B打印完后，C打印，C打印完后，A再打印。明明是三个线程，随机执行的，现在竟然可以顺序执行，是不是很神奇呀！这就是归功于JUC下的Condition接口了。具体代码如下：

```java
public class Solution {
    public static void main(String[] args) {
        Date date = new Date();
        new Thread(() -> {for (int i = 0; i < 10; i++) date.printA();},"A线程").start();
        new Thread(() -> {for (int i = 0; i < 10; i++) date.printB();},"B线程").start();
        new Thread(() -> {for (int i = 0; i < 10; i++) date.printC();},"C线程").start();
    }
}

class Date {
    private Lock lock = new ReentrantLock();
    private Condition condition1 = lock.newCondition();
    private Condition condition2 = lock.newCondition();
    private Condition condition3 = lock.newCondition();
    private int number = 0;

    public void printA() {
        lock.lock();
        try {
            while (number != 0) { //number！=0时，A线程循环等待
                condition1.await();
            }
            System.out.println(Thread.currentThread().getName() + "——》AAAAAAAAAAAA");
            number = 1;
            condition2.signal(); //A执行完后，唤醒B线程
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            lock.unlock();
        }
    }

    public void printB() {
        lock.lock();
        try {
            while (number != 1) { //number！=1时，B线程循环等待
                condition2.await();
            }
            System.out.println(Thread.currentThread().getName() + "——》BBBBBBBBBBB");
            number = 2;
            condition3.signal(); //B执行完后，唤醒C线程
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            lock.unlock();
        }
    }

    public void printC() {
        lock.lock();
        try {
            while (number != 2) { //number！=2时，C线程循环等待
                condition3.await();
            }
            System.out.println(Thread.currentThread().getName() + "——》CCCCCCCCCCCC");
            number = 0;
            condition1.signal(); //C执行完后，唤醒A线程
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            lock.unlock();
        }
    }
}
```

![image-20240327142243138](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240327142243138.png) 

## JVM

### 内存区域

#### 运行时数据区

Java对于内存的管理是采用分区的方式进行管理的，不同区域的特性，存储的数据都是不同的。根据《Java虚拟机规范》的规定，Java虚拟机所管理的内存将会包括以下几个运行时数据区域：

![image-20240409195606827](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240409195606827.png)

![image-20240409202006267](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240409202006267.png) 

##### 程序计数器（PC）

程序计数器可以看作是当前线程所执行的字节码的**行号指示器**。它通过标示下一条需要执行的字节码指令完成指令切换，可以说一个线程的运行就是在该计数器的不断变化推动下一步一步完成的。

* 它是一块**很小的内存空间**，几乎可以忽略不计。也是运行速度最快的存储区域（寄存器）
* 在JVM规范中，**每个线程都有它自己的程序计数器，是线程私有的**，生命周期与线程的生命周期一致
* 它是程序控制流的指示器，分支、循环、跳转、异常处理、**线程恢复**等基础功能都需要依赖这个计数器来完成
* 字节码解释器工作时就是通过改变这个计数器的值来选取下一条需要执行的字节码指令
* 任何时间一个线程都只有一个方法在执行，也就是所谓的当前方法。**如果当前线程正在执行的是Java方法，程序计数器记录的是VM字节码指令地址**，**如果是执行native方法，则是未指定值**(undefined)
* **它是唯一一个在JVM规范中没有规定任何outofMemoryError情况的区域**

##### 虚拟机栈（stack）

Java虚拟机栈(Java Virtual Machine Stacks)，早期也叫Java栈。**每个线程在创建的时候都会创建一个虚拟机栈**，其内部保存一个个的栈帧(Stack Frame)，对应着一次次Java方法调用，是线程私有的，生命周期和线程致。

虚拟机栈的**操作只有两个，就是入栈和出栈**。当调用一个新的方法时，就构建一个**栈帧**压入到栈中，而一个法执行结束，就会有一个栈帧出栈，整个遵循"FIFO"的原则。栈帧中主要存储了局部变量表、操作数栈、动态连接、方法出口等信息。

**在一条活动线程中，一个时间点上，只会有一个活动的栈帧**。即只有当前正在执行的方法的栈帧是有效的，这个栈帧被称为**当前栈帧**。不同线程中所包含的栈帧是不允许存在相互引用的，即**不能在一个栈帧中引用另外一个线程的栈帧**。如果当前方法调用了其他方法，方法返回之际，当前栈帧会传回此方法的执行结果给前一个栈帧，接着，虚拟机会丢弃当前栈帧，使得前一个栈帧重新成为当前栈帧。Java方法有两种返回函数的方式，一种是正常的函数返回，使用return 指令，另一种是抛出异常，不管用哪种方式，都会导致栈帧被弹出。

虚拟机栈规定了两类异常状况：如果线程请求的栈深度大于虚拟机所允许的深度，将抛出**StackOverflowError异常**；如果Java虚拟机栈容量可以动态扩展，当栈扩展时无法申请到足够的内存会抛出**OutOfMemoryError异常**。

##### 本地方法栈（stack）

**一个Native Method就是一个Java调用非Java 代码（C++）的接口**。我们知道的Unsafe类就有很多本地方法。**本地方法栈(Native Method Stacks)**与虚拟机栈所发挥的作用是非常相似的，其区别只是**虚拟机栈**为虚拟机执行**Java方法**(也就是字节码)服务，而**本地方法栈**则是为虚拟机使用到的**本地(Native)方法**服务。

《Java虚拟机规范》对本地方法栈中方法使用的语言、使用方式与数据结构并没有任何强制规定，**Hotspot虚拟机直接就把本地方法栈和虚拟机栈合二为一**。

##### Java堆（heap）

**Java堆是被所有线程共享的一块内存区域**，**"几乎"所有的对象实例都在这里分配内存**。Java堆也是垃圾收集器管理的内存区域，以G1收集器的出现为分界，往前的收集器基本是采用**分代收集理论**进行设计，所以"新生代"、"老年代"、"永久代"、"Eden空间"、"From Survivor空间"、"To Survivor空间"等概念都是分代设计下的产物，垃圾分代的唯一目的就是优化GC性能。

Java虚拟机规范规定，**Java堆可以是处于物理上不连续的内存空间中，只要逻辑上是连续的即可**，像磁盘空间一样。实现时，既可以是固定大小，也可以是可扩展的，主流虚拟机都是可扩展的（通过-Xmx和-Xms控制)，**如果堆中没有内存完成实例分配，并且堆无法再扩展时，就会抛出outOfMNemoryError异常。**

##### 方法区（Method）

**方法区(Method Area)与Java堆一样，是各个线程共享的内存区域**，它用于存储已被虚拟机加载的**类信息**、**常量**、**静态变量**、即时编译器编译后的代码缓存等数据。

虽然Java虚拟机规范把方法区描述为堆的一个逻辑部分，但是它却有一个别名叫Non-Heap(非堆)，目的应该是与Java堆区分开。方法区的大小和堆空间一样，可以选择固定大小也可选择可扩展，**方法区的大小决定了系统可以放多少个类**，如果系统类太多，导致**方法区溢出，虚拟机同样会抛出内存溢出OutOfMemoryError错误**。JVM关闭后方法区即被释放。

**Java8之后方法区的变化：**

* 移除了永久代(PermGen)，替换为元空间(Metaspace) ;
* 永久代中的class metadata转移到了native memory (本地内存，而不是虚拟机);
* 永久代中的 interned Strings 和class static variables转移到了Java堆;
* 永久代参数(PermSize MaxPermSize) -> 元空间参数(MetaspaceSize MaxMetaspaceSize)

##### 运行时常量池

https://blog.csdn.net/weixin_42679575/article/details/128021153

**运行时常量池(Runtime Constant Pool)是方法区的一部分**。**Class文件中**除了有类的版本/字段/方法/接口等描述信息外，**还有一项信息是常量池表**(Constant Pool Table)，**用于存放编译期生成的各种字面量和符号引用这部分内容将在类加载后进入方法区的运行时常量池中存放**，**JVM为每个已加载的类型(类或接口）都维护一个常量池，通过索引访问**，在加载类和接口到虚拟机后创建。所以运行时常量池相对于Class文件常量池的另一重要特性:具备动态性

既然运行时常量池是方法区的一部分，自然**受到方法区内存的限制**，当常量池无法再申请到内存时会抛出OutofMemoryError异常。

##### 字符串常量池

~~~java
String s2 = "b";
String s3 = "a" + "b";
String s4 = s1 + s2;
String s5 = "ab";
String s6 = s4.intern();
// 问
System.out.println(s3 == s4);flase
System.out.println(s3 == s5);true
System.out.println(s3 == s6);true
String x2 = new String("c") + new String("d");
String x1 = "cd";
x2.intern();
// 问，如果调换了【最后两行代码】的位置呢，如果是jdk1.6呢
System.out.println(x1 == x2);1.8true //1.6 flase
~~~

###### StringTable特性

* 常量池中的字符串仅是符号，第一次用到时才变为对象

* 利用串池的机制，来避免重复创建字符串对象

* 字符串**==变量==拼接的原理是 StringBuilder** （1.8）

* 字符串**==常量==拼接的原理是编译期优化**

* 可以使用 intern 方法，**主动将串池中还没有的字符串对象放入串池**

  * 1.8 将这个字符串对象尝试放入串池，如果有则并不会放入，如果没有则放入串池，并且本身也会改变了， 会把串池中的对象返回

  * 1.6 将这个字符串对象尝试放入串池，如果有则并不会放入，**如果没有会把此对象复制一份，将复制的那一份放入串池，而本身不会改变**， 会把串池中的对象返回

#### 本地内存和直接内存

**本地内存(Native Memory)：**

**本地内存并不是虚拟机运行时数据区的一部分**，它**也不是Java虚拟机规范定义的内存区域**。我们可以看到在 HotSpot 中，JDK1.8就将方法区移除了，用元数据区来代替，并且将元数据区从虚拟机运行时数据区移除了，转到了本地内存中，也就是说这块区域是受本机物理内存的限制，**当申请的内存超过了本机物理内存，才会抛出OutofMemoryError异常**。

**直接内存(Direct Memory)：**

**直接内存也是受本机物理内存的限制，并且不受JVM内存管理**。在JDK1.4中新加入的NIO(new input/output)类，引入了一种**基于通道(Channel）与缓冲区**(Buffer)的I/0方式，它可以使用Native 函数库直接分配堆外内存，然后通过一个存储在Java堆里面的DirectByteBuffer对象作为这块内存的引用操作，这样**避免了在Java堆和Native堆中来回复制数据**，显著提高性能。

* **Java程序内存 =  JVM内存＋本地内存**
* **本地内存 = 元空间＋直接内存**

#### 运行时栈帧结构

##### 栈与栈帧整体结构

![image-20240410083134822](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240410083134822.png) 

线程调用一个方法执行和退出就对应着一个栈帧的入栈和出栈。**栈的顶部第一个栈帧叫做当前栈帧**，对应的是一个线程需要执行的最新的方法;栈帧内部主要包括**局部变量表**，**操作数栈**，**方法返回地址**，**动态连接**等信息。

##### 局部变量表

局部变量表(Local Variables Table)是一组变量值的存储空间，**用于存放方法参数和方法内部定义的局部变量**。主要包括编译期就可知道的各种基本数据类型，对象引用等，所以**局部变量表所需要的容量大小**编译期就能确定下来，并且**在整个方法运行期间，都不会改变**。

**变量槽(Variable Slot):**

* 局部变量表的容量以变量槽(Variable Slot)为最小单位。
* Java虚拟机通过索引定位的方式使用局部变量表，索引值的范围是从O开始至局部变量表最大的变量槽数量。如果访问的是32位数据类型的变量，索引N就代表了使用第N个变量槽，如果访问的是64位数据类型的变量，则说明会同时使用第N和N+1两个变量槽。(对于两个相邻的共同存放一个64位数据的两个变量槽，虚拟机不允许采用任何方式单独访问其中的某一个)。
* 如果执行的是实例方法，那局部变量表中**第0位索引的变量槽默认是用于传递方法所属对象实例的引用"this"**
* 为了尽可能节省栈帧耗用的内存空间，局部变量表中的变量槽是可以重用的，如果当前字节码PC计数器的值已经超出了某个变量的作用域，那这个变量对应的变量槽就可以交给其他变量来重用。
  （超过了局部变量的作用域，就是这个变量使用完成了，留着没用了，那么它占用的那块内存就可以腾给别的变量使用）

##### 操作数栈

操作数栈，**主要用于保存计算过程的中间结果**，**同时作为计算过程中变量临时的存储空间**。当一个方法执行过程中，会有各种字节码指令对操作数栈出栈和入栈操作。

例如在做算术运算的时候是通过将运算涉及的操作数栈压入栈顶后调用运算指令来进行的。比如字节码指令iadd，这条指令在运行的时候要求操作数栈中最接近栈顶的两个元素已经存入了两个int型的数值，当执行这个指令时，会把这两个int值出栈并相加，然后将相加的结果重新入栈。

**编译器在编译阶段就会保证操作数栈中元素的数据类型与字节码指令的序列严格匹配**。同时在类加载过程中的类检验阶段的数据流分析阶段还会再次验证。

##### 动态连接

每个栈帧都包含一个指向运行时常量池中该"栈帧所属方法"的引用，**持有这个引用是为了支持方法调用过程中的动态连接**(Dynamic Linking)。

在Java源文件被编译到字节码文件中时，所有的变量和方法引用都作为**符号引用**保存在Class 文件的常量池中。比如:描述一个方法调用了另外的其他方法时，就是通过常量池中指向方法的符号引用来表示的，那么**动态链接的作用就是为了将这些符号引用转换为调用方法的直接引用**。

**备注：**初始是一个字符串，这个字符串就是符号引用;一旦这个符号引用被使用了，就会根据这个符号引用找到对应方法的地址，然后符号引用就会被替换为直接引用(方法的地址)

![image-20240410085548607](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240410085548607.png) 

##### 方法返回地址

**方法正常退出：**一个方法正常执行完成之后，会遇到返回指令。这种情况会有一个预先定义好类型的返回值返回给调用方法。

**方法异常退出：**一个方法执行过程中，如果发生了异常，并且异常没有在方法中妥善的捕获处理，那也会触发方法的退出。这种情况是不会有返回值返回给调用方的。

方法正常退出时，主调方法的PC计数器的值就可以作为返回地址，栈帧中很可能会保存这个计数器值。而方法异常退出时，返回地址是要通过异常处理器表来确定的，栈帧中就一般不会保存这部分信息。本质上，方法的退出就是当前栈帧出栈的过程。此时，需要恢复**上层方法**的局部变量表、操作数栈、**将返回值压入调用者栈帧**的操作数栈、设置PC寄存器值等，让调用者方法继续执行下去。

### 垃圾收集器

#### Java中的引用

##### 直接引用

无论是对象的访问定位，还是对象是否可以被回收的判断等，都离不开引用。而**Java中虚拟机HotSpot通过直接引用来访问Java对象的**。**直接引用就是说指针是直接指向对象实例的**，如果想要获取到对象的类型数据信息，则需要再调用对象里维护的类型数据指针。

**jvm的引用类型每个厂商实现不一样，hotspot是通过直接引用访问对象的，而引用类型以强弱之分则分为强引用、软引用、弱引用、虚引用**

##### 强引用

强引用是最常见的引用类型，比如Object obj=new Object()这种new产生的引用就是强引用，**一个对象如果还有强引用，那么垃圾回收器绝不会回收它**。(用途:对象的一般状态)

~~~java
Object object = new Object();
String a = "AAA";
~~~

##### 软引用

软引用来表示对象是**有用的，但不是必须**的。如果一个对象只有软引用了，那么当内存不足，准备抛出OMM之前（**本来要报OMM异常的**），**会先把这些软引用的对象进行回收了**，如果回收之后内存还是不够，这时才实际抛出OOM。(用途:对象缓存)

```java
Person cjy = new Person("cjy");
SoftReference<Person> sr = new SoftReference<>(cjy);
System.out.println(sr.get().getName());
```

##### 弱引用

弱引用就更低一级，**用来描述一些非必须的对象**。当一个对象只有弱引用的时候，只要发生垃圾回收gc，就会被回收。所以**弱引用对象活不过下一次GC;**(用途:对象缓存)

```java
WeakReference<String> wr = new WeakReference<>(new String("hello"));
System.out.println(wr.get());
System.gc();
System.out.println(wr.get());

输出：
hello
null
```

##### 虚引用

虚引用是**最弱的一种引用，形同虚设**。一个对象是否有虚引用的存在，完全不会对其生存时间构成影响，也**无法通过虚引用来取得一个对象实例**。为一个对象设置虚引用关联的**唯一目的只是为了能在这个对象被收集器回收时收到一个系统通知**。**虚引用必须和引用队列关联使用**，当垃圾回收器准备回收一个对象时，如果发现它还有虚引用，就会把这个虚引用加入到与之关联的引用队列中。(用途:未知)

```java
ReferenceQueue<String> queue = new ReferenceQueue<>();
PhantomReference<String> pr = new PhantomReference<>(new String("hhh"), queue);
System.out.println(pr.get());
System.gc();
Thread.sleep(1000); //等待GC完成
System.out.println(queue.poll());

输出：
null
java.lang.ref.PhantomReference@1b6d3586
```

#### 可达性分析算法

##### 算法基本思路

通过一系列称为"**GC Roots**"的根对象作为起始节点集，从这些节点开始，根据引用关系向下搜索，**搜索过程所走过的路径称为"引用链(**Reference Chain)，如果某个对象到GC Roots间没有任何引用链相连，即GC Roots到这个对象不可达时，则证明此对象是不可能再被使用的。

![image-20240410100637782](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240410100637782.png) 

对象Object6 ,Object7, Object8,0bject9虽然互有关联，但是它们到GC Roots是不可达的，因此它们将会被判定为可回收的对象。

##### GC Root的对象

**"固定“可作为GC Roots的对象包括以下几种：**

* 在**虚拟机栈中引用的对象**，例如各个线程被调用的方法堆栈中使用到的参数、局部变量、临时变量等。
* 在**本地方法栈中Native方法引用的对象**。
* 在方法区中**类静态属性引用的对象**，例如Java类的引用类型静态变量。
* 在方法区中**常量引用的对象**，例如字符串常量池(String Table)里的引用。
* **所有被同步锁(synchronized关键字)持有的对象**。
* Java虚拟机内部的引用，如基本数据类型对应的Class对象，一些常驻的异常对象(比如NullPointExcepiton.OutOfMemoryError)等，还有系统类加载器。
* 反映Java虚拟机内部情况的JM XBean、JVMTI中注册的回调、本地代码缓存等。

除了这些固定的GC Roots外，GC Roots还可以扩充的。例如当针对部分区域进行收集时，其他区域对于该区域的引用，也需要加入Gc Roots集合中进行判断。

**举例：**当采用分代收集时，如果此时目标是收集"新生代”，那么"老年代"中如果存在有对新生代对象的引用关系，那么这些老年代的对象就应该看作上面"固定Gc Roots 集合"的补充，需要纳入一起进行可达性分析。(新生代中有对象即便只被老年代引用，也应该判定为存活对象，不能回收)

##### 记忆集Remembered Sets

当对堆进行部分内存区域回收的时候，就会存在**跨区域引用**的问题，在GC Roots这里讲过，如果存在跨区域的引用关系，那么这种引用**即便不是"固定"Gc Roots范畴，那也应该纳入作为Gc Roots集合的补充**，一起来进行可达性分析判断。（例如所有堆内存的被划分为(A,B,C,D,E)五个区，当我们这次只对A，B进行回收时，就需要判断C,D,E中是否有引用A,B中的对象)

为了能够找出这种跨区的引用关系，一种直接的方式就是，将"回收区"以外的所有内存区域扫描一遍，看看哪些是有引用回收区里面的对象的。很显然，这种全域扫描的方式性能会极差，是不可接受的。

所以就有了**记忆集**（**卡表CardTable**），**记忆集列出了从外部指向本块的所有引用**。这种引用记录会在引用关系创建，更改时进行维护。当需要进行这种外部引用关系分析时，直接读取记忆集内容就行。

#### 垃圾回收算法

##### 标记-清除算法

首先找出所有对象，将存活的对象进行标记，然后清理掉未被标记的对象，结束。这里的清理并不是将内存空间字节清零，而是记录这段内存的起始地址，下次分配内存的时候,会直接覆盖这段内存。

![image-20240410102209096](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240410102209096.png) 

##### 标记-整理算法

首先找出所有对象，将存活的对象进行标记，然后将存活对象整理到一端，然后把其他内存区域直接清理掉。 

![image-20240410102318715](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240410102318715.png)

##### 复制算法

将内存划分为大小相等的两块，每次只使用其中一块，当这一块内存用完了就将还存活的对象复制到另一块上面，然后再把使用过的内存空间进行一次清理。

![image-20240410102406219](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240410102406219.png) 

##### 分代收集算法

现在的商业虚拟机采用分代收集算法，它根据对象存活周期将内存划分为几块，不同块采用适当的收集算法。
一般将堆分为新生代和老年代，新生代每次垃圾收集时都发现有大批对象死去，而每次回收后存活的少量对象，将会逐步**晋升**到老年代中存放

* 新生代:
  * 绝大多数对象都是朝生夕灭的
  * 复制算法
* 老年代:
  * "大多数"是熬过越多次垃圾收集过程的对象
  * 标记–清除或者标记–整理算法

HotSpot虚拟机的将新生代内存分为**一块较大的Eden空间和两块较小的Survivor空间**，每次使用Eden空间和其中一块Survivor From。在回收时，将Eden和Survivor From中还存活着的对象一次性复制到另一块Survivor To空间上最后清理Eden和使用过的那一块Survivor From。Eden和Survivor的大小比例默认为8:1，保证了内存的利用率达到90%。

**Eden：**大部分新对象分配的时候都在这个区域分配。

**Survivor ：**在经历一次gc后，**Eden区中的对象，至少存活一次gc之后，就会进入survivor From区**，**然后马上拷贝到 survivor TO区**；**后续就From区于TO区来回复制**，直到对象存活次数达到晋升老年代的条件，就从survivor中移出，进入老年代。

#### 垃圾收集器

HotSpot虚拟机中的7个垃圾收集器，图中有连线的说明是可以一起搭配使用的。

<img src="https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240410103840053.png" alt="image-20240410103840053" style="zoom:80%;" /> 

##### Serial收集器

Serial收集器是在进行垃圾收集时，必须暂停其他所有工作线程(Stop The World)。Stop The World听起来很牛，其实并不是啥好事，因为**它会导致用户线程停止工作**，所以有些真实应用来说是无法接受的。

![image-20240410103955893](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240410103955893.png) 

**总结:**

* Serial翻译为串行，也就是说它以串行的方式执行
* Serial是新生代的垃圾收集器
* 算法:复制算法
* HotSpot虚拟机运行在客户端模式下的默认新生代收集器

##### ParNew收集器

**ParNew收集器实质上是Serial收集器的多线程并行版本**，除了同时使用多条线程进行垃圾收集之外，其余的行为包括控制参数、收集算法、Stop The World、对象分配规则、回收策略等都与Serial收集器完全一致，在实现上这两种收集器也共用了相当多的代码。

![image-20240410104732337](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240410104732337.png) 

**总结：**

* 垃圾收集时多线程并行
* ParNew是新生代的垃圾收集器
* 算法:复制算法
* 是Server模式下的虚拟机首选新生代收集器，主要是因为除了Serial收集器，只有它能与CMS收集器(老年代)配合工作。
* 使用-XX:ParallelGCThreads参数来设置GC线程数。

##### Parallel Scavenge收集器

该收集器与ParNew类似，都是**多线程的垃圾收集器**。其它收集器**关注点是尽可能缩短垃圾收集时用户线程的停顿时间**，而**它的目标是达到一个可控制的吞吐量**，它被称为"吞吐量优先"收集器。这里的吞吐量指CPU用于运行用户代码的时间占总时间的比值。

**吞吐量=运行用户代码的时间 / (运行用户代码的时间+运行垃圾收集的时间)**

Parallel Scavenge收集器提供了两个参数用于精确控制吞吐量，分别是控制最大垃圾收集停顿时间的-XX:MaxGCPauseMillis参数以及直接设置吞吐量大小的-XX:GCTimeRatio参数。

![image-20240410105339423](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240410105339423.png) 

**总结:**

* 吞吐量优先收集器
* 新生代垃圾收集器
* 算法:复制算法
* 两个精确控制吞吐量的参数:
  * 控制最大垃圾收集停顿时间:-**XX:MaxGCPauseMillis**
  * 直接设置吞吐量大小: **XX:GCTimeRatio**
* GC自适应的调节策略开关:开启开关，就不需要手动指定新生代的大小(-Xmn)、Eden和Survivor区的比例晋升老年代对象年龄等细节参数了。虚拟机会根据当前系统的运行情况收集性能监控信息，动态调整这些参数以提供最合适的停顿时间或者最大的吞吐量。
  * **XX:+UseAdaptiveSizePolicy**

##### Serial Old收集器

是Serial 收集器的老年代版本，使用**标记-整理算法**，主要意义也是供客户端模式下的HotSpot虚拟机使用

![image-20240410105659383](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240410105659383.png)

**总结:**

* 老年代收集器
* 算法:标记-整理算法
* gc时暂停所有用户线程。
* 主要作为客户端模式下的HotSpot虚拟机使用，另外也作为CMS收集器并发收集发生Concurrent M ode Failure时的后备预案使用。

##### Parallel Old收集器

Parallel Old是Parallel Scavenge收集器的老年代版本，多线程并行收集。**目前只能与新生代的Parallel Scavenge收集器搭配使用**，可以说Parallel Old就是为Parallel Scavenge而生的。在这之前Parallel Scavenge收集器只能与老年代的Serial Old进行搭配，但是一个多线程，一个单线程，导致吞吐量并没有充分的提升，直到Parallel Old收集器出现。

![image-20240410110024957](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240410110024957.png)

**总结:**

* Parallel Old为Parallel Scavenge而生，只能搭配Parallel Scavenge.
* Parallel Old采用多线程
* 算法:标记-整理
* 在注重吞吐量或者处理器资源较为稀缺的场合，都可以优先考虑Parallel Scavenge加Parallel Old收集器这个组合
* JDK 6时才开始提供

##### CMS收集器

CMS(**Concurrent Mark Sweep**)是一款追求最短停顿时间的收集器。

![image-20240410110412723](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240410110412723.png) 

**分为以下四个流程:**

* **初始标记:**仅仅只是标记一下 GC Roots 能直接关联到的对象，**速度很快，需要"Stop The World"**。
* **并发标记:**进行GC Roots Tracing 的过程，它在整个回收过程中**耗时最长，不需要"Stop The World”，可以与用户线程并发**。
* **重新标记:**为了**修正并发标记期间因用户程序继续运作而导致标记产生变动的那一部分对象**的标记记录，**需要"Stop The World"”**。比初始标记时间长，比并发标记时间短。
* **并发清除:**清除掉判定为死亡的对象，**不需要"Stop The World"，可以与用户线程并发**。

**优点：**并发收集、低停顿（标记清除算法）。

**问题总结:**

* **吞吐量低**：CMS追求用户线程停顿时间少，停顿时间少就只能与用户线程并发执行部分阶段，导致**整个垃圾回收需要执行的整体时间会更长**（停顿之后专心垃圾收集肯定是最快的)，所以吞吐量会降低
* **"浮动垃圾“问题**："**并发清除"阶段，由于gc线程是与用户线程并发的**，**这个期间用户还会产生新的垃圾，所以一般会预留出一部分内存**，不能等到老年代快满的时候才去收集，**如果预留的内存不足以存放这部分浮动垃圾的话，就会出现Concurrent Mode Failure**。前面讲过，出现这个错误之后，虚拟机将临时启用Serial Old来替代CMS
* **标记-清除算法**：因为没有整理的过程，所以垃圾收集完之后，会有很多空间碎片，导致需要分配大块连续内存的时候，空间不足.

##### G1收集器

**Garbage First(简称G1)收集器**，意为**垃圾优先，哪一块的垃圾最多就优先清理它**。从名字就可以看出G1的一个特性，那就是G1能对不同区块的内存进行回收价值和成本排序，即价**值越高成本越低的区块会被先回收**。另外我们还能为G1设定性能指标，例如任意1秒内暂停时间不超过10毫秒，G1会尽力去达成这个目标。

开创了**收集器面向局部收集的设计思路**和**基于Region的内存布局形式**。JDK 8 Update 40这个版本以后的G1收集器被Oracle官方称为"全功能的垃圾收集器"。JDK 9发布之日，G1宣告取代Parallel Scavenge加Parallel Old组合，成为**服务端模式下的默认垃圾收集器**

**G1依然还是采用了分代设计**，但是之前的一些垃圾收集器有很大差别，**不会在为新生代，老年代等分配规定大小的区域，而是将整个堆分成一个个大小固定的Region区域**，每一个Region都可以是新生代，老年代，Eden空间Survivor空间的角色。所以**Region成为了垃圾收集的最小单元，每一次回收都会是Region的整数倍大小**.

![image-20240410112405753](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240410112405753.png) 

###### Region特性与关键问题

* 所有的Eden区和Survivor区合起来就是年轻代，所有的Old区拼在一起那就是老年代。
  * **年轻代老年代算法几乎是一致的**，都是**基于region回收**,回收是将存活的对象放入另外一个region 中，所以**局部看起来属于是"复制算法”**。
* G1每次收集时只会收集部分region，每次收集时，**会先估算每个小块存活对象的总数**，回收时垃圾最多的小块会被优先回收。
* Region里面存在的**跨Region引用对象如何解决**?︰使用记忆集避免全堆作为GC Roots扫描，G1它的每个Region都维护有自己的记忆集，这些记忆集会记录下别的Region指向自己的指针，并标记这些指针分别在哪些卡页的范围之内。

* 在并发标记阶段如何保证**收集线程与用户线程互不干扰地运行**?:
  * 回收过程中改变对象引用关系:必须保证其不能打破原本的对象图结构，导致标记结果出现错误。G1收集器则是通过原始快照(SATB)算法来实现的。
  * 回收过程中新创建对象:**G1为每一个Region设计了两个名为TAMS(Top at Mark Start)的指针**，**把Region中的一部分空间划分出来用于并发回收过程中的新对象分配**，并发回收时新分配的对象地址都必须要在这两个指针位置以上。

###### G1收集器步骤

![image-20240410113150171](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240410113150171.png) 

* 初始标记:仅仅只是标记一下GC Roots能直接关联到的对象。(需要停顿)
* 并发标记:从GC Roots开始进行可达性分析，完成对象图的扫描，判断存活对象和可回收对象。做后再处理下SATB记录的有引用变动的对象（无需停顿)
* 最终标记:对用户线程做另一个短暂的停顿，用于处理并发阶段结束后仍遗留下来的最后那少量的SATB记录。(需要停顿)
* 筛选回收:统计各个Region的回收价值和成本并进行排序，根据用户所期望的停顿时间来制定回收计划，筛选任意多个Region构成回收集，然后把决定回收的那一部分Region的存活对象复制到空的Region中，再清理掉整个l旧 Region的全部空间。(需要停顿)

#### 内存分配与回收策略

1. 对象优先在Eden分配：大多数情况下，对象在新生代Eden区中分配。当Eden区没有足够空间进行分配时，虚拟机将发起一次Minor GC。
2. 大对象直接进入老年代：大对象就是指需要大量连续内存空间的Java对象，最典型的大对象便是那种很长的字符串，或者元素数量很庞大的数组。大对象会直接进入老年代，可以设想一下，如果大对象被分配在新生代,又因为新生代多采用复制算法，所以如果一个大对象能存活很久的话，那么复制开销将会是非常大的。
3. 长期存活的对象将进入老年代：对象头里面存储了对象的分代年龄，新生带的对象每经历一次Minor GC年龄就会增加一岁，当年龄达到一定程度（默认15，-XX:MaxTenuringThreshold可配)，就会晋升为老年代。
4. 动态对象年龄判定：并不是永远要求对象的年龄必须达到- XX:MaxTenuringThreshold才能晋升老年代，**如果在Survivor空间中相同年龄所有对象大小的总和大于Survivor空间的一半**，年龄大于或等于该年龄的对象就可以直接进入老年代，无须等到-XX:MaxTenuringThreshold中要求的年龄。
5. 空间分配担保：上面可以看出，Minor GC有可能会导致一大批对象从新生代进入老年代，那老年代如果放不下怎么办?
   每次Minor GC之前都得检查老年代的空间是否能容纳所有新生代对象：
   * 如果可以那就安全。
   * 如果不可以，则虚拟机会先查看- XX:HandlePromotionFailure参数的设置值**是否允许担保失败(HandlePromotion Failure);**
     * 如果允许，那会继续检查**老年代最大可用的连续空间是否大于历次晋升到老年代对象的平均大小**，
       * 如果大于，将尝试进行一次Minor GC，尽管这次Minor GC是有风险的;
       * 如果小于，就进行Full Gc
     * 如果不允许，那这时就要改为进行一次Full GC。



### 类文件结构

#### Java字节码文件

**任何一个Class文件都对应着唯一的一个类或接口的定义信息**，但是反过来说，类或接口并不一定都得定义在文件里；另外Class文件是一组以8个字节为基础单位的二进制流，各个数据项目严格按照顺序紧凑的排列在class文件中，这个二进制流可以不一定来自于磁盘文件，也可以来自于网络，或者动态生成。

**Class文件格式只有两种数据类型，"无符号数"和"表”：**

* 无符号数属于基本的数据类型，以u1、u2、u4、u8来分别代表1个字节、2个字节、4个字节和8个字节的无符号数，无符号数可以用来描述数字、索引引用、数量值或者按照UTF-8编码构成字符串值。
* 表是由**多个无符号数**或者**其他表**作为数据项构成的**复合数据类型**，为了便于区分，所有表的命名都习惯性地以"**_info**"结尾。表用于描述有层次关系的复合结构的数据，整个Class文件本质上也可以视作是一张表，后面将挨个介绍这张表里面的数据项。

#### Class文件的结构属性

再强调下，一个 Class对应的是一个类或者接口的信息。可以联想一个类是怎么定义的来对应着理解下面的内容。Class文件中主要包括如下的数据类型:

![image-20240410131914049](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240410131914049.png) 

##### 魔数和Class文件版本

每个Class文件的**头4个字节被称为魔数**(Magic Number)，Class文件的魔数取得很有"浪漫气息”，值为0 xCAFEBABE(咖啡宝贝)。它的**唯一作用是确定这个文件是否为一个能被虚拟机接受的Class文件**

**紧接着魔数的4个字节存储的是Class文件的版本号**:第5和第6个字节是次版本号。高版本JDK可以执行低版本文件，但是低版本JDK不能执行高版本文件。

##### 常量池

**紧接着主、次版本号之后的是常量池入口**。常量池是class文件中**关联最多**的数据类型，也是**占用class文件最大**的数据项之一，也是**第一个出现的表类型**数据项目。

**常量池中主要存放两类常量:**

* 字面量:文本字符串，final常量值等
* 符号引用:类和接口的全限定名，字段的名称和描述符，方法的名称和描述符，方法句柄和方法类型，动态调用点和动态常量等

##### 访问标志

**在常量池结束之后，紧接着的2个字节代表访问标志**。主要描述这个Class是类还是接口;是否定义为public类型;是否定义为abstract类型;如果是类的话，是否被声明为final，是否为注解，是否为枚举值等等。

##### 类、父类、接口索引

主要确定该类型的继承关系，即继承了哪些父类，实现了哪些接口等。**类索引和父类索引都是一个u2数据类型**，而**接口索引是一个u2类型的数据的集合**（一个类可以继承一个父类，但可以实现多个接口)。

##### 字段表集合

**字段表(field_info)用于描述接口或者类中声明的变量**。"字段"(Field)包括类级变量以及实例级变量，但不包括在方法内部声明的局部变量。联想一个类中字段的定义信息，主要包括:作用域(public，private..)，受否static，是否final，数据类型(基本类型，对象，数组）等等。

##### 方法表集合

参考字段的定义，与之类似。也包括作用域，是否static，是否Synchronized等等。

##### 属性表集合

属性表(attribute_info)在前面的讲解之中已经出现过数次，**Class文件、字段表、方法表都可以携带自己的属性表集合**，以描述某些场景专有的信息。

### 类加载机制

#### 类生命周期

其中类加载的过程包括了**加载、验证、准备、解析、初始化**五个阶段。在这五个阶段中，**加载、验证准备和初始化这四个阶段发生的顺序是确定的**，而**解析阶段则不一定**，它在某些情况下可以在初始化阶段之后开始，这是为了支持Java语言的运行时绑定(也成为动态绑定或晚期绑定)。另外注意这里的几个阶段是按顺序开始，而不是按顺序进行或完成，因为这些阶段通常都是互相交叉地混合进行的，通常在一个阶段执行的过程中调用或激活另一个阶段。

![image-20240410151835093](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240410151835093.png) 

##### 1. 加载

**步骤："加载"(Loading)阶段需要完成三件事:**

1. 通过一个类的全限定名来获取定义此**类的二进制字节流**。

2. 将这个字节流所代表**的静态存储结构**转化为**方法区的运行时数据结构**。
3. 在**内存中生成一个代表这个类的java.lang.Class对象**，作为方法区这个类的各种数据的访问入口。

<img src="https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240410152200626.png" alt="image-20240410152200626" style="zoom:80%;" /> 

**类加载器︰**加载阶段是开发人员可控性最强的阶段，类加载器可以是系统的，也可以是自定义的。

**加载方式：**类的二进制字节流并没有限定说必须从Class文件获取，其他获取的渠道举例:

* 从本地文件系统加载
* 从数据库中获取
* 从zip,jar等文件中获取
* 从网络下载等

##### 2. 验证

**验证是连接阶段的第一步**，验证的主要目的就是按照虚拟机的要求去检查Class字节流，确保这个字节流是符合要求的，不会有安全性问题等。

**验证需要完成如下工作:**

* 文件格式验证：例如是否以魔数OxCAFEBABE开头;版本号等能否被虚拟机执行。
* 元数据验证：进行语义分析，确保符合Java语言规范。例如这个类是不是抽象类,是否实现了其父类或接口之中要求实现的所有方法
* 字节码验证：通过数据流和控制流分析，确定程序语义是合法的、符合逻辑的。
* 符号引用验证：符号引用验证可以看作是对类自身以外(常量池中的各种符号引用)的各类信息进行匹配性校验
  例如:根据符号引用描述的名字能否找到对应的类;或者符号引用中的类、字段、方法的可访问性(private.protected、public、<package>)是否可被当前类访问等。

##### 3. 准备

**准备阶段主要是为类的静态变量(Static变量)分配内存**，**并将其初始化为默认值**(0，OL， null,false等这种)

**注意：**

* 准备阶段只给类变量分配内存，不会给实例变量分配内存。

* 准备阶段正常只会赋零值。准备阶段后，value = 0

  ~~~java
  public static int value = 123;
  ~~~

* 但是加了final关键字，会直接赋初始值;准备阶段后value = 123

  ~~~java
  public static final int value = 123;
  ~~~

##### 4. 解析

**解析阶段是Java虚拟机将常量池内的符号引用替换为直接引用的过程**。包括(类或接口解析;字段解析;方法解析;接口方法解析)

**符号引用：**符号引用**以一组符号来描述所引用的目标，与虚拟机实现的内存布局无关**，各种虚拟机实现的内存布局可以各不相同，但是它们能接受的符号引用必须都是一致的，因为符号引用的字面量形式明确定义在《Java虚拟机规范》的Class文件格式中。

**直接引用：**直接引用是可以**直接指向目标的指针**、相对偏移量或者是一个能间接定位到目标的句柄。如果有了直接引用，那引用的目标必定已经在虚拟机的内存中存在。

##### 5. 初始化

**初始化是为类的静态变量赋予正确的初始值**（前面准备阶段是为变量赋零值)，JVM负责对类进行初始化，主要对类变量进行初始化。在Java中对类变量进行初始值设定有两种方式:

* 声明类变量是指定初始值

  ~~~java
  public static int value = 123;
  ~~~

* 使用静态代码块为类变量指定初始值

  ~~~java
  public static int value;
  static {
  	value = 123;
  }
  ~~~

**初始化步骤:**

1. 如果这个类还没有被加载和连接，则程序先加载并连接该类
2. 如果该类的直接父类还没有被初始化，则先初始化其直接父类
3. 如果类中有初始化语句，则系统依次执行这些初始化语句

**初始化时机：**只有当对类的主动使用的时候才会导致类的初始化，类的主动使用包括六种

* 调用类的**静态方法**
* 访问某个类或接口的**静态变量**，或者对该静态变量赋值;
* **初始化某个类的子类**，则其父类也会被初始化
* 创建类的实例，也就是**new**的方式
* **反射**(如Class.forName("com.pdai.jvm.Test"))
* Java虚拟机启动时被标明为启动类的类(Java Test)，直接使用java.exe命令来运行某个主类

#### 类加载器

在Java程序中，对于任意一个类，都必须由**加载它的类加载器**和这个**类本身**一起**共同确立其在Java虚拟机中的唯一性**。如果一个类被两个不同的加载器加载，即使来源是同一个Class文件，那这也是两个不同的类，主要会体现在，Class对象的equals()方法，isInstance()方法的返回结果，以及使用instance-of关键字做对象所属关系判定等各种情况。

**自定义类加载器：**
1．自定义一个类加载器
2．利用自定义类加载器加载User类，并生成一个对象实例; selfLoadUser
3．判断selfLoadUser是否为User类的实例(注意:这里的User是系统加载器加载的)

**备注：这里我自定义的加载器打破了双亲委派机制，我是先从当前加载器加载，如果返回值为null，就去上一层的加载器加载。**

![](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240410155035713.png) 

![image-20240410155053445](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240410155053445.png) 

**结果分析:**

* 现象: selfLoadUser.getClass:输出的类名是User，但是selfLoadUser对象却不是User类的实例(false)
* 原因:**虽然都是同一个User类源文件，但是由于加载器不同**，selfLoadUser是自定义加载器加载的，而最后判定的User类是默认的系统加载器加载的，所以selfLoadUser并不是该User类的实例。

#### 双亲委派模型

* **启动类加载器**：负责加载存放在**<JAVA_HOME>\lib**目录，或者被-Xbootclasspath参数所指定的路径中存放的而且是Java虚拟机能够识别的类库加载到虚拟机的内存中。
* **扩展类加载器**：这个类加载器是在类sun.misc.Launcher$ExtClassLoader中以Java代码的形式实现的。它负责加载**<JAVA_HOM E>\lib\ext**目录中，或者被java.ext.dirs系统变量所指定的路径中所有的类库
* **应用程序类加载器**：由于应用程序类加载器是ClassLoader类中的getSystemClassLoader()方法的返回值，所以**有些场合中也称它为"系统类加载器”**。它**负责加载用户类路径(ClassPath)上所有的类库**

​	<img src="https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240410155601408.png" alt="image-20240410155601408" style="zoom:50%;" />  

**双亲委派模型的工作过程：**

如果一个类加载器收到了类加载的请求，**它首先不会自己去尝试加载这个类，而是把这个请求委派给父类加载器去完成**，每一个层次的类加载器都是如此，因此所有的加载请求最终都应该传送到最顶层的启动类加载器中，**只有当父加载器反馈自己无法完成这个加载请求时，子加载器才会尝试自己去完成加载**。（**加载器之间没有实际的继承关系**）

## Java EE

### Maven

#### Maven概述

Apache Maven是一个项目管理和构建工具，它基于项目对象模型(Project Object Model , 简称: POM)的概念，通过一小段描述信息来管理项目的构建、报告和文档。

**Maven的作用：** 

1. 方便的依赖管理
2. 统一的项目结构
3. 标准的项目构建流程

##### Maven模型

* 项目对象模型 (Project Object Model)
* 依赖管理模型(Dependency)
* 构建生命周期/阶段(Build lifecycle & phases)



1). 构建生命周期/阶段(Build lifecycle & phases)

![image-20221130142100703](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20221130142100703.png)

以上图中紫色框起来的部分，就是用来完成标准化构建流程 。当我们需要编译，Maven提供了一个编译插件供我们使用；当我们需要打包，Maven就提供了一个打包插件供我们使用等。 



2). 项目对象模型 (Project Object Model)

![image-20221130142643255](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20221130142643255.png)

以上图中紫色框起来的部分属于项目对象模型，就是将我们自己的项目抽象成一个对象模型，有自己专属的坐标，如下图所示是一个Maven项目：

![image-20220616094113852](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20220616094113852.png)

> 坐标，就是资源(jar包)的唯一标识，通过坐标可以定位到所需资源(jar包)位置
>
> ![image-20221130230134757](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20221130230134757.png)



3). 依赖管理模型(Dependency)

![image-20221130143139644](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20221130143139644.png)

以上图中紫色框起来的部分属于依赖管理模型，是使用坐标来描述当前项目依赖哪些第三方jar包

![image-20221130174805973](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20221130174805973.png)

之前我们项目中需要jar包时，直接就把jar包复制到项目下的lib目录，而现在书写在pom.xml文件中的坐标又是怎么能找到所要的jar包文件的呢？

> 答案：Maven仓库

##### Maven仓库 

仓库：用于存储资源，管理各种jar包

> 仓库的本质就是一个目录(文件夹)，这个目录被用来存储开发中所有依赖(就是jar包)和插件



Maven仓库分为：

- 本地仓库：自己计算机上的一个目录(用来存储jar包)
- 中央仓库：由Maven团队维护的全球唯一的。仓库地址：https://repo1.maven.org/maven2/
- 远程仓库(私服)：一般由公司团队搭建的私有仓库

![image-20220616095633552](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20220616095633552.png)

当项目中使用坐标引入对应依赖jar包后，首先会查找本地仓库中是否有对应的jar包

* 如果有，则在项目直接引用

* 如果没有，则去中央仓库中下载对应的jar包到本地仓库

如果还可以搭建远程仓库(私服)，将来jar包的查找顺序则变为： 本地仓库 --> 远程仓库--> 中央仓库

##### 配置阿里云私服

由于中央仓库在国外，所以下载jar包速度可能比较慢，而阿里公司提供了一个远程仓库，里面基本也都有开源项目的jar包。

进入到conf目录下修改settings.xml配置文件：

1). 使用超级记事本软件，打开settings.xml文件，定位到160行左右

2). 在<mirrors>标签下为其添加子标签<mirror>，内容如下：

```xml
<mirror>  
    <id>alimaven</id>  
    <name>aliyun maven</name>  
    <url>http://maven.aliyun.com/nexus/content/groups/public/</url>
    <mirrorOf>central</mirrorOf>          
</mirror>
```

![](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/3.gif)

注意配置的位置，在<mirrors> ... </mirrors> 中间添加配置。如下图所示：

![image-20221130161346565](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20221130161346565.png)

==注:  只可配置一个<mirror>(另一个要注释!) ，不然两个可能发生冲突，导致jar包无法下载!!!!!!!==

#### IDEA集成Maven

我们要想在IDEA中使用Maven进行项目构建，就需要在IDEA中集成Maven

##### 配置Maven环境 

###### 当前工程设置 

1、选择 IDEA中 File  =>  Settings  =>  Build,Execution,Deployment  =>  Build Tools  =>  Maven

![image-20220616103219646](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20220616103219646.png) 

![image-20221130234731629](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20221130234731629.png)



2、设置IDEA使用本地安装的Maven，并修改配置文件及本地仓库路径

![](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20220616103302386.png)

> Maven home path ：指定当前Maven的安装目录
>
> User settings file ：指定当前Maven的settings.xml配置文件的存放路径
>
> Local repository ：指定Maven的本地仓库的路径 (如果指定了settings.xml, 这个目录会自动读取出来, 可以不用手动指定)



3、配置工程的编译版本为11

- Maven默认使用的编译版本为5（版本过低）

![image-20221201093737128](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20221201093737128.png) 

上述配置的maven环境，只是针对于当前工程的，如果我们再创建一个project，又恢复成默认的配置了。 要解决这个问题， 我们就需要配置全局的maven环境。

###### 全局设置 

1、进入到IDEA欢迎页面

- 选择 IDEA中 File  =>  close project

<img src="https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/4.gif" style="zoom:80%;" />

<img src="https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20220616104338612.png" style="zoom:80%;" />



2、打开 All settings , 选择 Build,Execution,Deployment  =>  Build Tools  =>  Maven

<img src="https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20220616104517726.png" style="zoom:80%;" />



3、配置工程的编译版本为11

<img src="https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20221201093737128.png" alt="image-20221201093737128" style="zoom:80%;" />

这里所设置的maven的环境信息，并未指定任何一个project，此时设置的信息就属于全局配置信息。 以后，我们再创建project，默认就是使用我们全局配置的信息。

##### POM配置详解

POM (Project Object Model) ：指的是项目对象模型，用来描述当前的maven项目。

- 使用pom.xml文件来实现

pom.xml文件：

~~~xml
<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
    <!-- POM模型版本 -->
    <modelVersion>4.0.0</modelVersion>

    <!-- 当前项目坐标 -->
    <groupId>com.itheima</groupId>
    <artifactId>maven_project1</artifactId>
    <version>1.0-SNAPSHOT</version>
    
    <!-- 打包方式 -->
    <packaging>jar</packaging>
 
</project>
~~~

pom文件详解：

- <project> ：pom文件的根标签，表示当前maven项目
- <modelVersion> ：声明项目描述遵循哪一个POM模型版本
  - 虽然模型本身的版本很少改变，但它仍然是必不可少的。目前POM模型版本是4.0.0
- 坐标 ：<groupId>、<artifactId>、<version>
  - 定位项目在本地仓库中的位置，由以上三个标签组成一个坐标
- <packaging> ：maven项目的打包方式，通常设置为jar或war（默认值：jar）

##### Maven坐标详解

什么是坐标？

* Maven中的坐标是==资源的唯一标识== , 通过该坐标可以唯一定位资源位置
* 使用坐标来定义项目或引入项目中需要的依赖

Maven坐标主要组成

* groupId：定义当前Maven项目隶属组织名称（通常是域名反写，例如：com.itheima）
* artifactId：定义当前Maven项目名称（通常是模块名称，例如 order-service、goods-service）
* version：定义当前项目版本号

如下图就是使用坐标表示一个项目：

![image-20220616111031057](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20220616111031057.png) 

> **注意：**
>
> * 上面所说的资源可以是插件、依赖、当前项目。
> * 我们的项目如果被其他的项目依赖时，也是需要坐标来引入的。

##### 导入Maven项目

- **方式1：使用Maven面板，快速导入项目**

打开IDEA，选择右侧Maven面板，点击 + 号，选中对应项目的pom.xml文件，双击即可

![image-20221201104320521](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20221201104320521.png)

<img src="https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20221201104906754.png" alt="image-20221201104906754" style="zoom:80%;" /> 

> 说明：如果没有Maven面板，选择 View  =>  Appearance  =>  Tool Window Bars
>
> ![image-20220616111937679](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20220616111937679.png) 



- **方式2：使用idea导入模块项目**

File  =>  Project Structure  =>  Modules  =>  +  =>  Import Module

<img src="https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20220823161727718.png" style="zoom:80%;" />

找到要导入工程的pom.xml

![image-20221201105532909](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20221201105532909.png)

<img src="https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20221201105845872.png" alt="image-20221201105845872" style="zoom:80%;" />

#### 依赖管理

##### 依赖配置

依赖：指当前项目运行所需要的jar包。一个项目中可以引入多个依赖：

例如：在当前工程中，我们需要用到logback来记录日志，此时就可以在maven工程的pom.xml文件中，引入logback的依赖。具体步骤如下：

1. 在pom.xml中编写<dependencies>标签

2. 在<dependencies>标签中使用<dependency>引入坐标

3. 定义坐标的 groupId、artifactId、version

```xml
<dependencies>
    <!-- 第1个依赖 : logback -->
    <dependency>
        <groupId>ch.qos.logback</groupId>
        <artifactId>logback-classic</artifactId>
        <version>1.2.11</version>
    </dependency>
    <!-- 第2个依赖 : junit -->
    <dependency>
        <groupId>junit</groupId>
        <artifactId>junit</artifactId>
        <version>4.12</version>
    </dependency>
</dependencies>
```

4. 点击刷新按钮，引入最新加入的坐标
   - 刷新依赖：保证每一次引入新的依赖，或者修改现有的依赖配置，都可以加入最新的坐标

![image-20221130184402805](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20221130184402805.png)  

> 注意事项：
>
> 1. 如果引入的依赖，在本地仓库中不存在，将会连接远程仓库 / 中央仓库，然后下载依赖（这个过程会比较耗时，耐心等待）
> 2. 如果不知道依赖的坐标信息，可以到mvn的中央仓库（https://mvnrepository.com/）中搜索





**添加依赖的几种方式：**

1. 利用中央仓库搜索的依赖坐标

   <img src="https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/5.gif" style="zoom:80%;" />



2. 利用IDEA工具搜索依赖

   <img src="https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/6.gif" style="zoom:80%;" />



3. 熟练上手maven后，快速导入依赖

   <img src="https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/7.gif" style="zoom:80%;" />

##### 依赖传递

###### 依赖具有传递性

早期我们没有使用maven时，向项目中添加依赖的jar包，需要把所有的jar包都复制到项目工程下。如下图所示，需要logback-classic时，由于logback-classic又依赖了logback-core和slf4j，所以必须把这3个jar包全部复制到项目工程下

![image-20221201120514644](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20221201120514644.png)



我们现在使用了maven，当项目中需要使用logback-classic时，只需要在pom.xml配置文件中，添加logback-classic的依赖坐标即可。

![image-20221201113659400](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20221201113659400.png)

在pom.xml文件中只添加了logback-classic依赖，但由于maven的依赖具有传递性，所以会自动把所依赖的其他jar包也一起导入。



依赖传递可以分为：

1. 直接依赖：在当前项目中通过依赖配置建立的依赖关系

2. 间接依赖：被依赖的资源如果依赖其他资源，当前项目间接依赖其他资源

![image-20220616115445812](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20220616115445812.png) 

比如以上图中：

- projectA依赖了projectB。对于projectA 来说，projectB 就是直接依赖。
- 而projectB依赖了projectC及其他jar包。 那么此时，在projectA中也会将projectC的依赖传递下来。对于projectA 来说，projectC就是间接依赖。

![image-20221201115801806](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20221201115801806.png)

###### 排除依赖

问题：之前我们讲了依赖具有传递性。那么A依赖B，B依赖C，如果A不想将C依赖进来，是否可以做到？ 

答案：在maven项目中，我们可以通过排除依赖来实现。



什么是排除依赖？

- 排除依赖：指主动断开依赖的资源。（被排除的资源无需指定版本）

```xml
<dependency>
    <groupId>com.itheima</groupId>
    <artifactId>maven-projectB</artifactId>
    <version>1.0-SNAPSHOT</version>
   
    <!--排除依赖, 主动断开依赖的资源-->
    <exclusions>
    	<exclusion>
            <groupId>junit</groupId>
            <artifactId>junit</artifactId>
        </exclusion>
    </exclusions>
</dependency>
```



依赖排除示例：

- maven-projectA依赖了maven-projectB，maven-projectB依赖了Junit。基于依赖的传递性，所以maven-projectA也依赖了Junit

![image-20221201141929240](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20221201141929240.png)

- 使用排除依赖后

![image-20221201142501556](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20221201142501556.png)

#####  依赖范围

在项目中导入依赖的jar包后，默认情况下，可以在任何地方使用。

![image-20221201135142706](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20221201135142706.png)

如果希望限制依赖的使用范围，可以通过<scope>标签设置其作用范围。

![image-20220616123806894](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20220616123806894.png) 

作用范围：

1. 主程序范围有效（main文件夹范围内）

2. 测试程序范围有效（test文件夹范围内）

3. 是否参与打包运行（package指令范围内）

![image-20221201140140947](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20221201140140947.png)

如上图所示，给junit依赖通过scope标签指定依赖的作用范围。 那么这个依赖就只能作用在测试环境，其他环境下不能使用。

scope标签的取值范围：

| **scope**值     | **主程序** | **测试程序** | **打包（运行）** | **范例**    |
| --------------- | ---------- | ------------ | ---------------- | ----------- |
| compile（默认） | Y          | Y            | Y                | log4j       |
| test            | -          | Y            | -                | junit       |
| provided        | Y          | Y            | -                | servlet-api |
| runtime         | -          | Y            | Y                | jdbc驱动    |

#### 生命周期

##### 介绍

Maven的生命周期就是为了对所有的构建过程进行抽象和统一。 描述了一次项目构建，经历哪些阶段。

在Maven出现之前，项目构建的生命周期就已经存在，软件开发人员每天都在对项目进行清理，编译，测试及部署。虽然大家都在不停地做构建工作，但公司和公司间、项目和项目间，往往使用不同的方式做类似的工作。

Maven从大量项目和构建工具中学习和反思，然后总结了一套高度完美的，易扩展的项目构建生命周期。这个生命周期包含了项目的清理，初始化，编译，测试，打包，集成测试，验证，部署和站点生成等几乎所有构建步骤。

Maven对项目构建的生命周期划分为3套（相互独立）：

![](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20220616124015567.png)

- clean：清理工作。

- default：核心工作。如：编译、测试、打包、安装、部署等。

- site：生成报告、发布站点等。

三套生命周期又包含哪些具体的阶段呢, 我们来看下面这幅图:

![image-20220616124348972](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20220616124348972.png) 

我们看到这三套生命周期，里面有很多很多的阶段，这么多生命周期阶段，其实我们常用的并不多，主要关注以下几个：

**• clean：移除上一次构建生成的文件**

**• compile：编译项目源代码**

**• test：使用合适的单元测试框架运行测试(junit)**

**• package：将编译后的文件打包，如：jar、war等**

**• install：安装项目到本地仓库**



Maven的生命周期是抽象的，这意味着生命周期本身不做任何实际工作。**在Maven的设计中，实际任务（如源代码编译）都交由插件来完成。**

![image-20221130142100703](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20221130142100703.png)



IDEA工具为了方便程序员使用maven生命周期，在右侧的maven工具栏中，已给出快速访问通道

![image-20221201151340340](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20221201151340340.png)

生命周期的顺序是：clean --> validate --> compile --> test --> package --> verify --> install --> site --> deploy 

我们需要关注的就是：clean -->  compile --> test --> package  --> install 

> 说明：在同一套生命周期中，我们在执行后面的生命周期时，前面的生命周期都会执行。

>  思考：当运行package生命周期时，clean、compile生命周期会不会运行？
>
>  ​	clean不会运行，compile会运行。  因为compile与package属于同一套生命周期，而clean与package不属于同一套生命周期。



##### 执行

在日常开发中，当我们要执行指定的生命周期时，有两种执行方式：

1. 在idea工具右侧的maven工具栏中，选择对应的生命周期，双击执行
2. 在DOS命令行中，通过maven命令执行



**方式一：在idea中执行生命周期**

- 选择对应的生命周期，双击执行

![image-20221201161957301](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20221201161957301.png) 



compile：

![image-20221201163711835](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20221201163711835.png)



test：

![image-20221201164627403](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20221201164627403.png)



package：

![image-20221201165801341](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20221201165801341.png)



install：

![image-20221201170830837](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20221201170830837.png)



clean：

![image-20221201171529382](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20221201171529382.png)



**方式二：在命令行中执行生命周期**

1. 进入到DOS命令行

![image-20221201172210253](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20221201172210253.png)

![image-20221201172914648](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20221201172914648.png) 

### 项目层级

**DAO层：**
DAO层叫**数据访问层**，全称为**data access object**，属于一种比较底层，比较基础的操作，具体到对于某个表的增删改查，也就是说**某个DAO一定是和数据库的某一张表**一一对应的，其中**封装了增删改查**基本操作，建议DAO只做原子操作，增删改查。

**Service层：**
Service层叫**服务层**，被称为服务，粗略的理解就是**对一个或多个DAO进行的再次封装**，封装成一个服务，所以这里也就不会是一个原子操作了，需要事物控制。

**Controler层：**
Controler负责**请求转发，接受页面过来的参数，传给Service处理**，接到返回值，再传给页面。

**domain层：**

Domain层是**模型层**，通常里面的类和数据库中的对象相关联。

**总结：**
**DAO面向表**，**Service面向业务**。后端开发时**先依靠数据库设计出所有表**，然后**对每一张表设计出DAO层**，然后根据具体的业务逻辑**进一步封装DAO层成一个Service层**，**对外提供成一个服务**。

### JUnit

#### 为什么需要 JUnit

![image-20240312191351768](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240312191351768.png) 

#### 基本介绍

![image-20240312191419196](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240312191419196.png) 

```java
@Test
public void m1() {
	System.out.println("m1 方法被调用");
}

@Test
public void m2() {
	System.out.println("m2 方法被调用");
}
```

### Spring相关概念

#### Spring家族

Spring并不是单一的一个技术，而是一个大家族，可以从官网（https://spring.io）的`Projects`中查看其包含的所有技术。

Spring发展到今天已经形成了一种开发的生态圈,Spring提供了若干个项目,每个项目用于完成特定的功能。

Spring有若干个项目，可以根据需要自行选择，把这些个项目组合起来，起了一个名称叫==全家桶==，如下图所示：

![image-20240411155341399](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240411155341399.png) 

这些技术并不是所有的都需要学习，额外需要重点关注`Spring Framework`、`SpringBoot`和`SpringCloud`:

![image-20240411155424796](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240411155424796.png) 

* Spring Framework:Spring框架，是Spring中最早**最核心的技术，也是所有其他技术的基础**。
* SpringBoot:Spring是来简化开发，而SpringBoot是来帮助Spring在简化的基础上能**更快速**进行开发。
* SpringCloud:这个是用来做分布式之**微服务**架构的相关开发。

#### Spring发展史

![image-20240411155533298](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240411155533298.png) 

* Spring1.0是纯配置文件开发
* Spring2.0为了简化开发引入了注解开发，此时是配置文件加注解的开发方式
* Spring3.0已经可以进行纯注解开发，使开发效率大幅提升，我们的课程会以注解开发为主
* Spring4.0根据JDK的版本升级对个别API进行了调整
* Spring5.0已经全面支持JDK8，现在Spring最新的是5系列所以建议大家把JDK安装成1.8版

#### Spring系统架构

Spring Framework的5版本目前没有最新的架构图，而最新的是4版本，所以接下来主要研究的是4的架构图

![image-20240411155635005](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240411155635005.png)

(1)核心层

* Core Container:核心容器，这个模块是Spring最核心的模块，其他的都需要依赖该模块

(2)AOP层

* AOP:面向切面编程，它依赖核心层容器，目的是==在不改变原有代码的前提下对其进行功能增强==
* Aspects:AOP是思想,Aspects是对AOP思想的具体实现

(3)数据层

* Data Access:数据访问，Spring全家桶中有对数据访问的具体实现技术
* Data Integration:数据集成，Spring支持整合其他的数据层解决方案，比如Mybatis
* Transactions:事务，Spring中事务管理是Spring AOP的一个具体实现，也是后期学习的重点内容

(4)Web层

* 这一层的内容将在SpringMVC框架具体学习

(5)Test层

* Spring主要整合了Junit来完成单元测试和集成测试

#### Spring学习路线

对于Spring的学习主要包含四部分内容，分别是:

* ==Spring的IOC/DI==
* ==Spring的AOP==
* ==AOP的具体应用,事务管理==
* ==IOC/DI的具体应用,整合Mybatis==

![image-20240411155946443](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240411155946443.png)





## Spring Framework

### 核心容器

#### Spring核心概念

在Spring核心概念这部分内容中主要包含`IOC/DI`、`IOC容器`和`Bean`

##### 目前项目中的问题

![image-20240411160537110](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240411160537110.png) 

(1)业务层需要调用数据层的方法，就需要在业务层new数据层的对象

(2)如果数据层的实现类发生变化，那么业务层的代码也需要跟着改变，发生变更后，都需要进行编译打包和重部署

(3)所以，现在代码在编写的过程中存在的问题是：==**耦合度偏高**==

**针对这个问题，该如何解决呢?**

![image-20240411160629390](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240411160629390.png) 

我们就想，如果能把框中的内容给去掉，不就可以降低依赖了么，但是又会引入新的问题，去掉以后程序能运行么?

答案肯定是不行，因为bookDao没有赋值为Null，强行运行就会出空指针异常。

所以现在的**问题就是，业务层不想new对象，运行的时候又需要这个对象**，该咋办呢?

针对这个问题，Spring就提出了一个解决方案:

* **使用对象时，在程序中不要主动使用new产生对象，转换为由==外部==提供对象**

这种实现思就是Spring的一个核心概念

##### IOC、DI思想

###### IOC

**==IOC（Inversion of Control）控制反转：==**

(1)什么是控制反转呢？

* 使用对象时，**由主动new产生对象**转换为**由==外部==提供对象**，此过程中对象创建控制权由程序转移到外部，此思想称为**控制反转**。
  * 业务层要用数据层的类对象，以前是自己`new`的
  * 现在自己不new了，交给`别人[外部]`来创建对象
  * `别人[外部]`就反转控制了数据层对象的创建权
  * 这种思想就是控制反转

(2)Spring和IOC之间的关系是什么呢?

* Spring技术对IOC思想进行了实现
* Spring提供了一个容器，称为==IOC容器==，用来充当IOC思想中的"外部"
* **IOC思想中的`别人[外部]`指的就是Spring的IOC容器**

(3)IOC容器的作用以及内部存放的是什么?

* IOC容器负责对象的创建、初始化等一系列工作，其中包含了数据层和业务层的类对象
* **被创建或被管理的对象在IOC容器中统称为==Bean==**
* IOC容器中放的就是一个个的Bean对象

(4)当IOC容器中创建好service和dao对象后，程序能正确执行么?

* **不行**，因为**service运行需要依赖dao对象**
* IOC容器中虽然有service和dao对象
* 但是service对象和dao对象没有任何关系
* **需要把dao对象交给service**,也就是说要绑定service和dao对象之间的关系，像这种在容器中建立对象与对象之间的绑定关系就要用到DI思想

###### DI

**==DI（Dependency Injection）依赖注入：==**

![image-20240411161427918](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240411161427918.png) 

(1)什么是依赖注入呢?

* 在容器中**建立bean与bean之间的依赖关系的整个过程，称为依赖注入**
  * 业务层要用数据层的类对象，以前是自己`new`的
  * 现在自己不new了，**靠`别人[外部其实指的就是IOC容器]`来给注入进来**
  * 这种思想就是依赖注入

(2)IOC容器中哪些bean之间要建立依赖关系呢?

* 这个需要程序员根据业务需求提前建立好关系，如业务层需要依赖数据层，service就要和dao建立依赖关系

介绍完Spring的IOC和DI的概念后，我们会发现这两个概念的最终目标就是:==充分解耦==，具体实现靠:

* 使用IOC容器管理bean（IOC)
* 在IOC容器内将有依赖关系的bean进行关系绑定（DI）
* 最终结果为:**使用对象时不仅可以直接从IOC容器中获取**，**并且获取到的bean已经绑定了所有的依赖关系**.

###### IOC容器

Spring创建了一个容器用来存放所创建的对象，这个容器就叫IOC容器

###### Bean

容器中所存放的一个个对象就叫Bean或Bean对象

#### 入门案列

##### IOC入门案例思路分析

(1)Spring是使用容器来管理bean对象的，那么管什么? 

* 主要管理项目中所使用到的类对象，比如(Service和Dao)

(2)如何将被管理的对象告知IOC容器?

* 使用配置文件

(3)被管理的对象交给IOC容器，要想从容器中获取对象，就先得思考如何获取到IOC容器?

* Spring框架提供相应的接口

(4)IOC容器得到后，如何从容器中获取bean?

* 调用Spring框架提供对应接口中的方法

(5)使用Spring导入哪些坐标?

* 用别人的东西，就需要在pom.xml添加对应的依赖

##### IOC入门案例代码实现

需求分析:将BookServiceImpl和BookDaoImpl交给Spring管理，并从容器中获取对应的bean对象进行方法调用。

1. 创建一个普通的Maven的java项目
   <img src="https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240411162337475.png" alt="image-20240411162337475" style="zoom:50%;" /> 

2. pom.xml添加Spring的依赖jar包，并刷新maven

   ~~~xml
   <dependencies>
       <dependency>
           <groupId>org.springframework</groupId>
           <artifactId>spring-context</artifactId>
           <version>5.2.10.RELEASE</version>
       </dependency>
   </dependencies>
   ~~~

3. 创建BookService,BookServiceImpl，BookDao和BookDaoImpl四个类

   ~~~java
   public interface BookDao {
       public void save();
   }
   public class BookDaoImpl implements BookDao {
       public void save() {
           System.out.println("book dao save ...");
       }
   }
   public interface BookService {
       public void save();
   }
   public class BookServiceImpl implements BookService {
       private BookDao bookDao = new BookDaoImpl();
       public void save() {
           System.out.println("book service save ...");
           bookDao.save();
       }
   }
   ~~~

4. resources下添加spring配置文件（**applicationContext**），并完成bean的配置
   ![image-20240411162555907](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240411162555907.png) 

   ~~~xml
   <!--bean标签标示配置bean
       	id属性标示给bean起名字
       	class属性表示给bean定义类型
   	-->
   	<bean id="bookDao" class="com.itheima.dao.impl.BookDaoImpl"/>
       <bean id="bookService" class="com.itheima.service.impl.BookServiceImpl"/>
   ~~~

   **==注意事项：bean定义时id属性在同一个上下文中(配置文件)不能重复==**

5. 使用Spring提供的接口完成IOC容器的创建
   使用Spring提供的接口完成IOC容器的创建，创建App类，编写main方法

   ~~~java
   //获取IOC容器
   ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml"); 
   ~~~

6. 从容器中获取对象进行方法调用

   ~~~java
   BookService bookService = (BookService) ctx.getBean("bookService");
   bookService.save();
   ~~~

##### DI入门案例思路分析

(1)**要想实现依赖注入，必须要基于IOC管理Bean**

- DI的入门案例要依赖于前面IOC的入门案例

(2)Service中使用new形式创建的Dao对象是否保留?

- **需要删除掉，最终要使用IOC容器中的bean对象**

(3)Service中需要的Dao对象如何进入到Service中?

- 在Service中提供方法，让Spring的IOC容器可以通过该方法传入bean对象

(4)Service与Dao间的关系如何描述?

- 使用配置文件

##### DI入门案例代码实现

需求:基于IOC入门案例，在BookServiceImpl类中删除new对象的方式，使用Spring的DI完成Dao层的注入

1. 删除业务层中使用new的方式创建的dao对象

   ~~~java
   public class BookServiceImpl implements BookService {
       //删除业务层中使用new的方式创建的dao对象
       private BookDao bookDao;
   
       public void save() {
           System.out.println("book service save ...");
           bookDao.save();
       }
   }
   ~~~

2. 在业务层提供BookDao的setter方法
   在BookServiceImpl类中,为BookDao提供setter方法

   ~~~java
    //提供对应的set方法
       public void setBookDao(BookDao bookDao) {
           this.bookDao = bookDao;
       }
   ~~~

3. 在配置文件中添加依赖注入的配置

   ~~~xml
   <!--bean标签标示配置bean
       	id属性标示给bean起名字
       	class属性表示给bean定义类型
   	-->
       <bean id="bookDao" class="com.itheima.dao.impl.BookDaoImpl"/>
   
       <bean id="bookService" class="com.itheima.service.impl.BookServiceImpl">
           <!--配置server与dao的关系-->
           <!--property标签表示配置当前bean的属性
           		name属性表示配置哪一个具体的属性
           		ref属性表示参照哪一个bean
   		-->
           <property name="bookDao" ref="bookDao"/>
       </bean>
   ~~~

   ==注意:配置中的两个bookDao的含义是不一样的==

   * name="bookDao"中`bookDao`的作用是让Spring的IOC容器在获取到名称后，将首字母大写，前面加set找对应的`setBookDao()`方法进行对象注入
   * ref="bookDao"中`bookDao`的作用是让Spring能在IOC容器中找到id为`bookDao`的Bean对象给`bookService`进行注入
   * 综上所述，对应关系如下:
     ![image-20240411163807612](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240411163807612.png) 

#### IOC相关内容

通过前面两个案例，我们已经学习了`bean如何定义配置`，`DI如何定义配置`以及`容器对象如何获取`的内容，接下来主要是把这三块内容展开进行**详细的讲解，深入的学习**下这三部分的内容

##### bean基础配置

对于bean的配置中，主要会讲解`bean基础配置`,`bean的别名配置`,`bean的作用范围配置`==(重点)==,这三部分内容

###### bean基础配置(id与class)

对于bean的基础配置，在前面的案例中已经使用过:

~~~xml
<bean id="" class=""/>
~~~

其中，bean标签的功能、使用方式以及id和class属性的作用，我们通过一张图来描述下

![image-20240411164830239](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240411164830239.png) 

**思考：**

class属性能不能写**接口**如`BookDao`的类全名呢?

* 答案肯定是不行，因为接口是没办法创建对象的。

###### bean别名配置

bean的name属性

![image-20240411165049748](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240411165049748.png) 

**步骤1：配置别名**

打开spring的配置文件applicationContext.xml

~~~xml
<!--name:为bean指定别名，别名可以有多个，使用逗号，分号，空格进行分隔-->
    <bean id="bookService" name="service service4 bookEbi" class="com.itheima.service.impl.BookServiceImpl">
        <property name="bookDao" ref="bookDao"/>
    </bean>

    <!--scope：为bean设置作用范围，可选值为单例singloton，非单例prototype-->
    <bean id="bookDao" name="dao" class="com.itheima.dao.impl.BookDaoImpl"/>
~~~

**步骤2：根据名称容器中获取bean对象**

```java
public class AppForName {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        //此处根据bean标签的id属性和name属性的任意一个值来获取bean对象
        BookService bookService = (BookService) ctx.getBean("service4");
        bookService.save();
    }
}
```

**==注意事项:==**

* bean依赖注入的ref属性指定bean，必须在容器中存在
  ![image-20240411165337474](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240411165337474.png)

* 如果不存在,则会报错，如下:
  ![image-20240411165424024](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240411165424024.png)
  这个错误大家需要特别关注下:
  ![image-20240411165509276](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240411165509276.png)
   获取bean无论是通过id还是name获取，如果无法获取到，将抛出异常==NoSuchBeanDefinitionException==

###### bean作用范围配置

关于bean的作用范围是bean属性配置的一个==重点==内容。看到这个作用范围，我们就得思考bean的作用范围是来控制bean哪块内容的?

我们先来看下`bean作用范围的配置属性`:
![image-20240411165645938](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240411165645938.png) 

**默认情况下，Spring创建的bean对象都是单例的**，

* 将scope设置为`singleton`

```xml
<bean id="bookDao" name="dao" class="com.itheima.dao.impl.BookDaoImpl" scope="singleton"/>
```

运行AppForScope，打印看结果

![image-20240411165749162](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240411165749162.png) 

* 将scope设置为`prototype`

~~~xml
<bean id="bookDao" name="dao" class="com.itheima.dao.impl.BookDaoImpl" scope="prototype"/>
~~~

![image-20240411165821934](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240411165821934.png) 

###### bean基础配置小结

![image-20240411170014426](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240411170014426.png) 

##### bean实例化

对象已经能交给Spring的IOC容器来创建了，**但是容器是如何来创建对象的呢**?

就需要研究下`bean的实例化过程`，在这块内容中主要解决两部分内容，分别是

* bean是如何创建的
* 实例化bean的三种方式，`构造方法`,`静态工厂`和`实例工厂`

在讲解这三种创建方式之前，我们需要先确认一件事:

**bean本质上就是对象，对象在new的时候会使用构造方法完成，那创建bean也是使用构造方法完成的**。

###### 构造方法实例化

~~~java
public class BookDaoImpl implements BookDao {
    //默认的无参构造器被重写，Spring会默认调用无参构造器，所以会报错
    private BookDaoImpl(int i) { 
        System.out.println("book dao constructor is running ....");
    }
    public void save() {
        System.out.println("book dao save ...");
    }
}
~~~

**程序会报错，说明Spring底层使用的是类的无参构造方法。**

![image-20240411171005694](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240411171005694.png) 

###### 静态工厂实例化

1. 创建一个工厂类OrderDaoFactory并提供一个==静态方法==

~~~java
//静态工厂创建对象
public class OrderDaoFactory {    
    public static OrderDao getOrderDao(){
        return new OrderDaoImpl();    
    }
}
~~~

2. 在spring的配置文件application.properties中添加以下内容:

~~~java
<bean id="orderDao" class="com.itheima.factory.OrderDaoFactory" factory-method="getOrderDao"/>
~~~

class:工厂类的类全名

factory-mehod:具体工厂类中创建对象的方法名

对应关系如下图:

![image-20240411171232638](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240411171232638.png)

 介绍完静态工厂实例化后，这种方式一般是用来兼容早期的一些老系统，所以==了解为主==。

###### 实例工厂实例化

接下来继续来研究Spring的第三种bean的创建方式`实例工厂实例化`，这里需要用到**FactoryBean接口**:

1. 创建一个UserDaoFactoryBean的类，**实现FactoryBean接口，重写接口的方法**

   ~~~java
   public class UserDaoFactoryBean implements FactoryBean<UserDao> {
       //代替原始实例工厂中创建对象的方法
       public UserDao getObject() throws Exception {
           return new UserDaoImpl();
       }
       //返回所创建类的Class对象
       public Class<?> getObjectType() {
           return UserDao.class;
       }
   }
   ~~~

2. 在Spring的配置文件中进行配置

   ~~~xml
   <bean id="userDao" class="com.itheima.factory.UserDaoFactoryBean"/>
   ~~~

这种方式在Spring去整合其他框架的时候会被用到，所以这种方式需要大家理解掌握。

查看源码会发现，FactoryBean接口其实会有三个方法，分别是:

~~~java
T getObject() throws Exception;

Class<?> getObjectType();

default boolean isSingleton() {
		return true;
}
~~~

方法一:getObject()，被重写后，在方法中进行对象的创建并返回

方法二:getObjectType(),被重写后，主要返回的是被创建类的Class对象

方法三:没有被重写，因为它已经给了默认值，从方法名中可以看出其作用是设置对象是否为单例，默认true，默认是单例，返回false时不是单例

##### bean生命周期

* 首先理解下什么是生命周期?
  * 从创建到消亡的完整过程,例如人从出生到死亡的整个过程就是一个生命周期。
* bean生命周期是什么?
  * bean对象从创建到销毁的整体过程。
* bean生命周期控制是什么?
  * 在bean创建后到销毁前做一些事情。

###### 生命周期设置

接下来，在上面这个环境中来为BookDao添加生命周期的控制方法，具体的控制有两个阶段:

* bean创建之后，想要添加内容，比如用来初始化需要用到资源
* bean销毁之前，想要添加内容，比如用来释放用到的资源

**步骤1:添加初始化和销毁方法**

针对这两个阶段，我们在BooDaoImpl类中分别添加两个方法，==方法名任意==

~~~java
public class BookDaoImpl implements BookDao {
    public void save() {
        System.out.println("book dao save ...");
    }
    //表示bean初始化对应的操作
    public void init(){
        System.out.println("init...");
    }
    //表示bean销毁前对应的操作
    public void destory(){
        System.out.println("destory...");
    }
}
~~~

**步骤2:配置生命周期**

在配置文件添加配置，如下:

~~~xml
<bean id="bookDao" class="com.itheima.dao.impl.BookDaoImpl" init-method="init" destroy-method="destory"/>
~~~

**结果：**

![image-20240411204846284](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240411204846284.png) 

从结果中可以看出，**init方法执行了，但是destroy方法却未执行**，这是为什么呢?

* Spring的IOC容器是运行在JVM中
* 运行main方法后,JVM启动,Spring加载配置文件生成IOC容器,从容器获取bean对象，然后调方法执行
* main方法执行完后，**JVM退出，这个时候IOC容器中的bean还没有来得及销毁就已经结束了**
* 所以没有调用对应的destroy方法

知道了出现问题的原因，具体该如何解决呢?

###### close关闭容器

* ApplicationContext中没有close方法

* **需要将ApplicationContext更换成ClassPathXmlApplicationContext**

  ```java
  ClassPathXmlApplicationContext ctx = new 
      ClassPathXmlApplicationContext("applicationContext.xml");
  ```

* 调用ctx的close()方法

  ```
  ctx.close();
  ```

  ![image-20240411205003112](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240411205003112.png) 

###### 注册钩子关闭容器

* 在容器未关闭之前，提前设置好回调函数，让JVM在退出之前回调此函数来关闭容器

* 调用ctx的**registerShutdownHook()**方法

  ```
  ctx.registerShutdownHook();
  ```

  **注意:**registerShutdownHook在ApplicationContext中也没有

​	![image-20240411205107132](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240411205107132.png)

两种方式介绍完后，close和registerShutdownHook选哪个?

相同点:**这两种都能用来关闭容器**

不同点:**close()是在调用的时候关闭**，**registerShutdownHook()是在JVM退出前调用关闭。**

分析上面的实现过程，会发现添加初始化和销毁方法，即需要编码也需要配置，实现起来步骤比较多也比较乱。

###### 生命周期接口

**Spring提供了两个接口来完成生命周期的控制**，好处是可以不用再进行配置`init-method`和`destroy-method`

接下来在BookServiceImpl完成这两个接口的使用:

修改BookServiceImpl类，添加两个接口`InitializingBean`， `DisposableBean`并实现接口中的两个方法`afterPropertiesSet`和`destroy`

~~~java
public class BookServiceImpl implements BookService, InitializingBean, DisposableBean {
    private BookDao bookDao;
    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }
    public void save() {
        System.out.println("book service save ...");
        bookDao.save(); 
    }
    public void destroy() throws Exception {
        System.out.println("service destroy");
    }
    public void afterPropertiesSet() throws Exception {
        System.out.println("service init");
    }
}
~~~

对于InitializingBean接口中的afterPropertiesSet方法，翻译过来为`属性设置之后`。**初始化方法会在类中属性设置之后执行。**

###### bean生命周期小结

(1)关于Spring中对bean**生命周期控制提供了两种方式**:

* 在配置文件中的bean标签中添加`init-method`和`destroy-method`属性
* 类实现`InitializingBean`与`DisposableBean`接口，这种方式了解下即可。

(2)**bean的生命周期如下：**

* 初始化容器
  * 1.创建对象(内存分配)
  * 2.执行构造方法
  * 3.执行属性注入(set操作)
  * ==4.执行bean初始化方法==
* 使用bean
  * 1.执行业务操作
* 关闭/销毁容器
  * ==1.执行bean销毁方法==

(3)**关闭容器的两种方式**:

* ConfigurableApplicationContext是ApplicationContext的子类
  * close()方法
  * registerShutdownHook()方法

#### DI相关内容

依赖注入描述了在容器中建立bean与bean之间的依赖关系的过程

**bean有两种类型的数据需要注入**：

* 引用类型
* 简单类型(基本数据类型与String)

**bean有两种方式注入数据：**

* setter注入
  * 简单类型
  * ==引用类型==
* 构造器注入
  * 简单类型
  * 引用类型

##### Setter注入

###### Setter注入引用类型

**步骤1:声明属性并提供setter方法**

~~~java
public class BookServiceImpl implements BookService{
    private BookDao bookDao;
    private UserDao userDao;
    
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    public void save() {
        System.out.println("book service save ...");
        bookDao.save();
        userDao.save();
    }
}
~~~

**步骤2:配置文件中进行注入配置**

~~~xml
 <bean id="bookDao" class="com.itheima.dao.impl.BookDaoImpl"/>
    <bean id="userDao" class="com.itheima.dao.impl.UserDaoImpl"/>
    <bean id="bookService" class="com.itheima.service.impl.BookServiceImpl">
        <property name="bookDao" ref="bookDao"/>
        <property name="userDao" ref="userDao"/>
    </bean>
~~~

==**引用类型使用的是`<property name="" ref=""/>`**，**ref是指向Spring的IOC容器中的另一个bean对象的**==

###### Setter注入简单类型

**步骤1:声明属性并提供setter方法**

在BookDaoImpl类中声明对应的简单数据类型的属性,并提供对应的setter方法

~~~java
public class BookDaoImpl implements BookDao {

    private String databaseName;
    private int connectionNum;

    public void setConnectionNum(int connectionNum) {
        this.connectionNum = connectionNum;
    }

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    public void save() {
        System.out.println("book dao save ..."+databaseName+","+connectionNum);
    }
}
~~~

**步骤2:配置文件中进行注入配置**

~~~java
<bean id="bookDao" class="com.itheima.dao.impl.BookDaoImpl">
        <property name="databaseName" value="mysql"/>
     	<property name="connectionNum" value="10"/>
    </bean>
    <bean id="userDao" class="com.itheima.dao.impl.UserDaoImpl"/>
    <bean id="bookService" class="com.itheima.service.impl.BookServiceImpl">
        <property name="bookDao" ref="bookDao"/>
        <property name="userDao" ref="userDao"/>
    </bean>
~~~

**说明:**

value:后面跟的是简单数据类型，对于参数类型，Spring在注入的时候会**自动转换**，但是不能写成

~~~xml
<property name="connectionNum" value="abc"/>
~~~

这样的话，spring在将`abc`转换成int类型的时候就会报错。

###### Setter小结

两个property注入标签的顺序可以任意。

对于setter注入方式的基本使用就已经介绍完了，

* 对于引用数据类型使用的是`<property name="" ref=""/>`
* 对于简单数据类型使用的是`<property name="" value=""/>`

##### 构造器注入

######  构造器注入引用类型

**步骤1:删除setter方法并提供构造方法**

在BookServiceImpl类中将bookDao的setter方法删除掉,并添加带有bookDao参数的构造方法

~~~java
public class BookServiceImpl implements BookService{
    private BookDao bookDao;

    public BookServiceImpl(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    public void save() {
        System.out.println("book service save ...");
        bookDao.save();
    }
}
~~~

**步骤2:配置文件中进行配置构造方式注入**

~~~xml
    <bean id="bookDao" class="com.itheima.dao.impl.BookDaoImpl"/>
    <bean id="bookService" class="com.itheima.service.impl.BookServiceImpl">
        <constructor-arg name="bookDao" ref="bookDao"/>
    </bean>
~~~

**说明:**

标签<constructor-arg>中

* name属性对应的值为构造函数中**方法形参的参数名**，必须要保持一致。

* ref属性指向的是spring的IOC容器中其他bean对象。

###### 构造器注入多个引用类型

**步骤1:提供多个属性的构造函数**

在BookServiceImpl声明userDao并提供多个参数的构造函数

~~~java
public class BookServiceImpl implements BookService{
    private BookDao bookDao;
    private UserDao userDao;

    public BookServiceImpl(BookDao bookDao,UserDao userDao) {
        this.bookDao = bookDao;
        this.userDao = userDao;
    }

    public void save() {
        System.out.println("book service save ...");
        bookDao.save();
        userDao.save();
    }
}
~~~

**步骤2:配置文件中配置多参数注入**

~~~xml
<bean id="bookDao" class="com.itheima.dao.impl.BookDaoImpl"/>
    <bean id="userDao" class="com.itheima.dao.impl.UserDaoImpl"/>
    <bean id="bookService" class="com.itheima.service.impl.BookServiceImpl">
        <constructor-arg name="bookDao" ref="bookDao"/>
        <constructor-arg name="userDao" ref="userDao"/>
    </bean>
~~~

**说明:**

这两个`<contructor-arg>`的配置顺序可以任意

###### 构造器注入多个简单类型

**步骤1:添加多个简单属性并提供构造方法**

~~~java
public class BookDaoImpl implements BookDao {
    private String databaseName;
    private int connectionNum;

    public BookDaoImpl(String databaseName, int connectionNum) {
        this.databaseName = databaseName;
        this.connectionNum = connectionNum;
    }

    public void save() {
        System.out.println("book dao save ..."+databaseName+","+connectionNum);
    }
}
~~~

**步骤2:配置完成多个属性构造器注入**

~~~java
 <bean id="bookDao" class="com.itheima.dao.impl.BookDaoImpl">
        <constructor-arg name="databaseName" value="mysql"/>
        <constructor-arg name="connectionNum" value="666"/>
    </bean>
    <bean id="userDao" class="com.itheima.dao.impl.UserDaoImpl"/>
    <bean id="bookService" class="com.itheima.service.impl.BookServiceImpl">
        <constructor-arg name="bookDao" ref="bookDao"/>
        <constructor-arg name="userDao" ref="userDao"/>
    </bean>
~~~

###### 构造器注入问题

上面已经完成了构造函数注入的基本使用，但是会存在一些问题:

![image-20240411211757295](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240411211757295.png) 

* 当**构造函数中方法的参数名发生变化后，配置文件中的name属性也需要跟着变**
* 这两块存在紧耦合，具体该如何解决?

在解决这个问题之前，需要提前说明的是，这个参数名发生变化的情况并不多，所以上面的还是比较主流的配置方式，下面介绍的，大家都以**了解**为主。

方式一:删除name属性，添加type属性，按照类型注入

```xml
<bean id="bookDao" class="com.itheima.dao.impl.BookDaoImpl">
    <constructor-arg type="int" value="10"/>
    <constructor-arg type="java.lang.String" value="mysql"/>
</bean>
```

* 这种方式可以解决构造函数形参名发生变化带来的耦合问题
* 但是如果构造方法参数中有类型相同的参数，这种方式就不太好实现了

方式二:删除type属性，添加index属性，按照索引下标注入，下标从0开始

```xml
<bean id="bookDao" class="com.itheima.dao.impl.BookDaoImpl">
    <constructor-arg index="1" value="100"/>
    <constructor-arg index="0" value="mysql"/>
</bean>
```

* 这种方式可以解决参数类型重复问题
* 但是如果构造方法参数顺序发生变化后，这种方式又带来了耦合问题

##### Setter 与 构造器

介绍完两种参数的注入方式，具体我们该如何选择呢?

1. **强制依赖使用构造器进行**，使用setter注入有概率不进行注入导致null对象出现
   * 强制依赖指对象在创建的过程中必须要注入指定的参数
2. **可选依赖使用setter注入进行**，灵活性强
   * 可选依赖指对象在创建过程中注入的参数可有可无
3. Spring框架倡导使用构造器，**第三方框架内部大多数采用构造器注入**的形式进行数据初始化，相对严谨
4. 如果有必要可以两者同时使用，使用构造器注入完成强制依赖的注入，使用setter注入完成可选依赖的注入
5. 实际开发过程中还要根据实际情况分析，如果受控对象没有提供setter方法就必须使用构造器注入
6. **==自己开发的模块推荐使用setter注入==**

* setter注入

  * 简单数据类型

    ```xml
    <bean ...>
    	<property name="" value=""/>
    </bean>
    ```

  * 引用数据类型

    ```xml
    <bean ...>
    	<property name="" ref=""/>
    </bean>
    ```

* 构造器注入

  * 简单数据类型

    ```xml
    <bean ...>
    	<constructor-arg name="" index="" type="" value=""/>
    </bean>
    ```

  * 引用数据类型

    ```xml
    <bean ...>
    	<constructor-arg name="" index="" type="" ref=""/>
    </bean>
    ```

* 依赖注入的方式选择上

  * 建议使用setter注入
  * 第三方技术根据情况选择

##### 自动配置

前面花了大量的时间把Spring的注入去学习了下，总结起来就一个字==麻烦==。

问:麻烦在哪?

答:配置文件的编写配置上。

问:有更简单方式么?

答:有，自动配置

**什么是依赖自动装配?**

* IoC容器根据bean所依赖的资源在容器中自动查找并注入到bean中的过程称为自动装配

**自动装配方式有哪些?**

* ==按类型（常用）==
* 按名称
* 按构造方法
* 不启用自动装配

###### 按类型自动装配

自动装配只需要修改applicationContext.xml配置文件即可:

(1)将`<property>`标签删除

(2)在`<bean>`标签中添加autowire属性

~~~xml
<bean class="com.itheima.dao.impl.BookDaoImpl"/>
    <!--autowire属性：开启自动装配，通常使用按类型装配-->
    <bean id="bookService" class="com.itheima.service.impl.BookServiceImpl" autowire="byType"/>
~~~

==注意事项:==

* 需要注入属性的类中**对应属性的setter方法不能省略**
* **被注入的对象必须要被Spring的IOC容器管理**
* **按照类型在Spring的IOC容器中如果找到多个对象，会报`NoUniqueBeanDefinitionException`**

###### 按名称自动装配

一个类型在IOC中有多个对象，还想要注入成功，这个时候就需要按照名称注入，配置方式为:

~~~xml
<bean id="bookDao" class="com.itheima.dao.impl.BookDaoImpl"/>

    <!--autowire属性：开启自动装配，通常使用按类型装配-->
    <bean id="bookService" class="com.itheima.service.impl.BookServiceImpl" autowire="byName"/>
~~~

###### 自动配置小结

两种方式介绍完后，以后用的更多的是==按照类型==注入。

最后对于依赖注入，需要注意一些其他的配置特征:

1. **自动装配用于引用类型依赖注入，不能对简单类型进行操作**
2. **使用按类型装配时（byType）必须保障容器中相同类型的bean唯一，推荐使用**
3. 使用按名称装配时（byName）必须保障容器中具有指定名称的bean，因变量名与配置耦合，不推荐使用
4. **自动装配优先级低于setter注入与构造器注入，同时出现时自动装配配置失效**

##### 集合注入

前面我们已经能完成引入数据类型和简单数据类型的注入，但是还有一种数据类型==集合==，集合中既可以装简单数据类型也可以装引用数据类型，对于集合，在Spring中该如何注入呢?

先来回顾下，常见的集合类型有哪些?

* 数组
* List
* Set
* Map
* Properties

针对不同的集合类型，该如何实现注入呢?

###### 注入数组类型数据

```xml
<property name="array">
    <array>
        <value>100</value>
        <value>200</value>
        <value>300</value>
    </array>
</property>
```

###### 注入List类型数据

```xml
<property name="list">
    <list>
        <value>itcast</value>
        <value>itheima</value>
        <value>boxuegu</value>
        <value>chuanzhihui</value>
    </list>
</property>
```

###### 注入Set类型数据

```xml
<property name="set">
    <set>
        <value>itcast</value>
        <value>itheima</value>
        <value>boxuegu</value>
        <value>boxuegu</value>
    </set>
</property>
```

###### 注入Map类型数据

```xml
<property name="map">
    <map>
        <entry key="country" value="china"/>
        <entry key="province" value="henan"/>
        <entry key="city" value="kaifeng"/>
    </map>
</property>
```

###### 注入Properties类型数据

```xml
<property name="properties">
    <props>
        <prop key="country">china</prop>
        <prop key="province">henan</prop>
        <prop key="city">kaifeng</prop>
    </props>
</property>
```

###### 集合注入小结

* property标签表示setter方式注入，构造方式注入constructor-arg标签内部也可以写`<array>`、`<list>`、`<set>`、`<map>`、`<props>`标签
* List的底层也是通过数组实现的，所以`<list>`和`<array>`标签是可以混用
* 集合中要添加引用类型，只需要把`<value>`标签改成`<ref>`标签，这种方式用的比较少

#### IOC/DI配置管理第三方bean

本次案例将使用咱们前面提到过的数据源**Druid(德鲁伊)**来配置学习下。

##### 思路分析

需求:使用Spring的IOC容器来管理Druid连接池对象

1.使用第三方的技术，需要在pom.xml添加依赖

2.在配置文件中将【第三方的类】制作成一个bean，让IOC容器进行管理

3.数据库连接需要基础的四要素`驱动`、`连接`、`用户名`和`密码`，【如何注入】到对应的bean中

4.从IOC容器中获取对应的bean对象，将其打印到控制台查看结果

##### 实现Druid管理

**步骤1:导入`druid`的依赖**

~~~xml
<dependency>
    <groupId>com.alibaba</groupId>
    <artifactId>druid</artifactId>
    <version>1.1.16</version>
</dependency>
~~~

**步骤2:配置第三方bean**

~~~xml
<!--管理DruidDataSource对象-->
    <bean class="com.alibaba.druid.pool.DruidDataSource">
        <property name="driverClassName" value="com.mysql.jdbc.Driver"/>
        <property name="url" value="jdbc:mysql://localhost:3306/spring_db"/>
        <property name="username" value="root"/>
        <property name="password" value="root"/>
    </bean>
~~~

* driverClassName:数据库驱动
* url:数据库连接地址
* username:数据库连接用户名
* password:数据库连接密码
* 数据库连接的四要素要和自己使用的数据库信息一致。

**步骤3:从IOC容器中获取对应的bean对象**

~~~java
public class App {
    public static void main(String[] args) {
       ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
       DataSource dataSource = (DataSource) ctx.getBean("dataSource");
       System.out.println(dataSource);
    }
}

~~~

##### 加载properties文件

上节中我们已经完成两个数据源`druid`的配置，但是其中包含了一些问题，我们来分析下:

* 这两个数据源中**都使用到了一些固定的常量如数据库连接四要素**，把这些值写在Spring的配置文件中不利于后期维护
* 需要将这些值**提取到一个外部的properties配置文件中**
* Spring框架如何从配置文件中读取属性值来配置就是接下来要解决的问题。

###### 实现思路

需求:将数据库连接四要素提取到properties配置文件，spring来加载配置信息并使用这些信息来完成属性注入。

1.**在resources下创建一个jdbc.properties**(文件的名称可以任意)

2.将数据库连接四要素配置到配置文件中

3.在Spring的配置文件中**加载properties文件**

4.使用加载到的值实现**属性注入**

其中第3，4步骤是需要大家重点关注，具体是如何实现。

###### 实现步骤

**步骤1:准备properties配置文件**

resources下创建一个jdbc.properties文件,并添加对应的属性键值对

~~~properties
jdbc.driver=com.mysql.jdbc.Driver
jdbc.url=jdbc:mysql://127.0.0.1:3306/spring_db
jdbc.username=root
jdbc.password=root
~~~

**步骤2:开启`context`命名空间**

在applicationContext.xml中**开`context`命名空间**（**开命名空间注意5点**）

![image-20240412153427285](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240412153427285.png) 

**步骤3:加载properties配置文件**

在配置文件中使用`context`命名空间下的标签来加载properties配置文件

~~~xml
<context:property-placeholder location="jdbc.properties"/>
~~~

**步骤4:完成属性注入**

使用`${key}`来读取properties配置文件中的内容并完成属性注入

~~~xml
<context:property-placeholder location="jdbc.properties"/>
    <bean id="dataSource" class="com.alibaba.druid.pool.DruidDataSource">
        <property name="driverClassName" value="${jdbc.driver}"/>
        <property name="url" value="${jdbc.url}"/>
        <property name="username" value="${jdbc.username}"/>
        <property name="password" value="${jdbc.password}"/>
    </bean>
~~~

###### 加载properties小结

  * 如何加载properties配置文件

    ```xml
    <context:property-placeholder location="" system-properties-mode="NEVER"/>
    ```

  * 如何在applicationContext.xml引入properties配置文件中的值

    ~~~xml
    ${key}
    ~~~

#### 核心容器总结

#####  容器相关

- BeanFactory是IoC容器的顶层接口，初始化BeanFactory对象时，加载的bean延迟加载
- ApplicationContext接口是Spring容器的核心接口，初始化时bean立即加载
- ApplicationContext接口提供基础的bean操作相关方法，通过其他接口扩展其功能
- ApplicationContext接口常用初始化类
  - **==ClassPathXmlApplicationContext(常用)==**
  - FileSystemXmlApplicationContext

##### bean相关

![image-20240412154728198](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240412154728198.png) 

##### 依赖注入相关

![image-20240412154823353](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240412154823353.png) 

### IOC/DI注解开发

Spring的IOC/DI对应的配置开发就已经讲解完成，但是使用起来相对来说还是比较复杂的，复杂的地方在==配置文件==。

前面咱们聊Spring的时候说过，Spring可以简化代码的开发，到现在并没有体会到。

所以Spring到底是如何简化代码开发的呢?

要想真正简化开发，就需要用到Spring的注解开发，Spring对注解支持的版本历程:

* 2.0版开始支持注解
* 2.5版注解功能趋于完善
* 3.0版支持纯注解开发

关于注解开发，我们会讲解两块内容**`注解开发定义bean`和`纯注解开发`。**

#### 注解开发定义bean

##### **步骤1:删除原XML配置**

将配置文件中的`<bean>`标签删除掉

![image-20240412155310168](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240412155310168.png) 

##### **步骤2:Dao上添加注解**

在BookDaoImpl类上添加`@Component`注解

~~~java
@Component("bookDao")
public class BookDaoImpl implements BookDao {
    public void save() {
        System.out.println("book dao save ..." );
    }
}
~~~

==注意:@Component注解不可以添加在接口上，因为接口是无法创建对象的。==

XML与注解配置的对应关系:

![image-20240412155437213](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240412155437213.png) 

##### **步骤3:配Spring注解扫描**

为了让Spring框架能够扫描到写在类上的注解，需要在配置文件上进行包扫描

~~~xml
<context:component-scan base-package="com.cjy"/>
~~~

**说明:**

component-scan

* component:组件,Spring**将管理的bean视作自己的一个组件**
* scan:**扫描**

base-package指定Spring框架**扫描的包路径**，它会扫描指定包及其子包中的所有类上的注解。

* 包路径越多[如:com.itheima.dao.impl]，扫描的范围越小速度越快
* 包路径越少[如:com.itheima],扫描的范围越大速度越慢
* 一般扫描到项目的组织名称即Maven的groupId下[如:com.itheima]即可。

##### 注意事项

**@Component注解如果不起名称**，**会有一个默认值就是`当前类名首字母小写`**，所以也可以按照名称获取

**对于@Component注解，还衍生出了其他三个注解`@Controller`、`@Service`、`@Repository`**

通过查看源码会发现:

![1630028345074](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/1630028345074.png)

这三个注解和@Component注解的作用是一样的，为什么要衍生出这三个呢?

**方便我们后期在编写类的时候能很好的区分出这个类是属于`表现层`、`业务层`还是`数据层`的类。**

#### 纯注解开发模式

上面已经可以使用注解来配置bean**,但是依然有用到配置文件**，**在配置文件中对包进行了扫描**，Spring在3.0版已经支持纯注解开发

* **Spring3.0开启了纯注解开发模式，使用Java类替代配置文件**，开启了Spring快速开发赛道

##### 思路分析

将配置文件applicationContext.xml删除掉，使用类来替换。

##### 实现步骤

###### 步骤1:创建配置类

创建一个配置类`SpringConfig`

```java
public class SpringConfig {
}

```

###### 步骤2:标识该类为配置类

在配置类上添加`@Configuration`注解，将其标识为一个配置类,替换`applicationContext.xml`

```java
@Configuration
public class SpringConfig {
}
```

###### 步骤3:用注解替换包扫描配置

在配置类上添加包扫描注解`@ComponentScan`替换`<context:component-scan base-package=""/>`

```java
@Configuration
@ComponentScan("com.itheima")
public class SpringConfig {
}
```

###### 步骤4:创建运行类并执行

创建一个新的容器`AnnotationConfigApplicationContext`

```java
public class AppForAnnotation {

    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        BookDao bookDao = (BookDao) ctx.getBean("bookDao");
        System.out.println(bookDao);
        BookService bookService = ctx.getBean(BookService.class);
        System.out.println(bookService);
    }
}
```

###### 纯注解开发模式小结

* Java类替换Spring核心配置文件

  ![1630029254372](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/1630029254372.png)

* @Configuration注解用于设定当前类为配置类

* @ComponentScan注解用于设定扫描路径，此注解只能添加一次，多个数据请用数组格式

  ```xml
  @ComponentScan({com.itheima.service","com.itheima.dao"})
  ```

* 读取Spring核心配置文件初始化容器对象切换为读取Java配置类初始化容器对象

  ```java
  //加载配置文件初始化容器
  ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
  //加载配置类初始化容器
  ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
  ```

这一节重点掌握的是使用注解完成Spring的bean管理，需要掌握的内容为:

* 记住@Component、@Controller、@Service、@Repository这四个注解
* applicationContext.xml中`<context:component-san/>`的作用是指定扫描包路径，注解为@ComponentScan
* @Configuration标识该类为配置类，使用类替换applicationContext.xml文件
* ClassPathXmlApplicationContext是加载XML配置文件
* AnnotationConfigApplicationContext是加载**配置类**

#### 注解开发bean作用范围

(1)先运行App类,在控制台打印两个一摸一样的地址，说明默认情况下bean是单例

![1630031192753](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/1630031192753.png)

(2)要想将BookDaoImpl变成非单例，只需要在其类上添加`@scope`注解

```java
@Repository
//@Scope设置bean的作用范围
@Scope("prototype")
public class BookDaoImpl implements BookDao {

    public void save() {
        System.out.println("book dao save ...");
    }
}
```

再次执行App类，打印结果:

![1630031808947](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/1630031808947.png)

#### 注解开发Bean的生命周期

(1)在BookDaoImpl中添加两个方法，`init`和`destroy`,方法名可以任意

```java
@Repository
public class BookDaoImpl implements BookDao {
    public void save() {
        System.out.println("book dao save ...");
    }
    public void init() {
        System.out.println("init ...");
    }
    public void destroy() {
        System.out.println("destroy ...");
    }
}

```

(2)如何对方法进行标识，哪个是初始化方法，哪个是销毁方法?

只需要在对应的方法上**添加`@PostConstruct`和`@PreDestroy`注解即可。**

```java
@Repository
public class BookDaoImpl implements BookDao {
    public void save() {
        System.out.println("book dao save ...");
    }
    @PostConstruct //在构造方法之后执行，替换 init-method
    public void init() {
        System.out.println("init ...");
    }
    @PreDestroy //在销毁方法之前执行,替换 destroy-method
    public void destroy() {
        System.out.println("destroy ...");
    }
}

```

(3)要想看到两个方法执行，需要注意的是`destroy`只有在容器关闭的时候，才会执行，所以需要修改App的类

```java
public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        BookDao bookDao1 = ctx.getBean(BookDao.class);
        BookDao bookDao2 = ctx.getBean(BookDao.class);
        System.out.println(bookDao1);
        System.out.println(bookDao2);
        ctx.close(); //关闭容器
    }
}
```

(4)运行App,类查看打印结果，证明init和destroy方法都被执行了。

![1630032385498](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/1630032385498.png)

==**注意:**@PostConstruct和@PreDestroy注解如果找不到，需要导入下面的jar包==

```java
<dependency>
  <groupId>javax.annotation</groupId>
  <artifactId>javax.annotation-api</artifactId>
  <version>1.3.2</version>
</dependency>
```

找不到的原因是，从JDK9以后jdk中的javax.annotation包被移除了，这两个注解刚好就在这个包中。

#### 注解开发依赖注入

##### @Autowired

**注解实现按照类型注入**

直接在BookServiceImpl类的**bookDao属性上添加`@Autowired`注解**

```java
@Service
public class BookServiceImpl implements BookService {
    @Autowired
    private BookDao bookDao;
    
//	  public void setBookDao(BookDao bookDao) {
//        this.bookDao = bookDao;
//    }
    public void save() {
        System.out.println("book service save ...");
        bookDao.save();
    }
}
```

**注意:**

* @Autowired可以写在属性上，也可也写在setter方法上**，最简单的处理方式是`写在属性上并将setter方法删除掉`**
* 为什么setter方法可以删除呢?
  * 自动装配基于反射设计创建对象并通过暴力反射为私有属性进行设值
  * 普通反射只能获取public修饰的内容
  * 暴力反射除了获取public修饰的内容还可以获取private修改的内容
  * **所以此处无需提供setter方法**

#####  @Qualifier

**注解实现按照名称注入**

@Autowired**默认是按照类型注入**，那么**对应BookDao接口如果有多个实现类**，比如添加BookDaoImpl2

```java
@Repository
public class BookDaoImpl2 implements BookDao {
    public void save() {
        System.out.println("book dao save ...2");
    }
}
```

这个时候再次运行App，就会报错

![1630034272959](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/1630034272959.png)

此时，**按照类型注入就无法区分到底注入哪个对象**，**解决方案:`按照名称注入`**

先给两个Dao类分别起个名称

```java
@Repository("bookDao1")
public class BookDaoImpl implements BookDao {
    public void save() {
        System.out.println("book dao save ..." );
    }
}
@Repository("bookDao2")
public class BookDaoImpl2 implements BookDao {
    public void save() {
        System.out.println("book dao save ...2" );
    }
}
```

即：

![image-20240412161631003](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240412161631003.png) 

当根据类型在容器中找到多个bean,注入参数的属性名又和容器中bean的名称不一致，这个时候该如何解决，就需要使用到`@Qualifier`来指定注入哪个名称的bean对象。

~~~java
@Service
public class BookServiceImpl implements BookService {
    @Autowired
    @Qualifier("bookDao1")
    private BookDao bookDao;
    
    public void save() {
        System.out.println("book service save ...");
        bookDao.save();
    }
}
~~~

@Qualifier注解后的值就是需要注入的bean的名称。

==注意:@Qualifier不能独立使用，必须和@Autowired一起使用==

##### @Value()

**简单数据类型注入**

引用类型看完，简单类型注入就比较容易懂了。简单类型注入的是基本数据类型或者字符串类型，下面在`BookDaoImpl`类中添加一个`name`属性，用其进行简单类型注入

数据类型换了，对应的注解也要跟着换，这次使用`@Value`注解，将值写入注解的参数中就行了

```java
@Repository("bookDao")
public class BookDaoImpl implements BookDao {
    @Value("itheima")
    private String name;
    public void save() {
        System.out.println("book dao save ..." + name);
    }
}
```

注意数据格式要匹配，如将"abc"注入给int值，这样程序就会报错。

介绍完后，会有一种感觉就是这个注解好像没什么用，跟直接赋值是一个效果，还没有直接赋值简单，所以这个注解存在的意义是什么?

##### @PropertySource()

**注解读取properties配置文件**

`@Value`一般会被用在从properties配置文件中读取内容进行使用，具体如何实现?

**步骤1：resource下准备properties文件**

jdbc.properties

```properties
name=itheima888
```

**步骤2: 使用注解加载properties配置文件**

在配置类上添加`@PropertySource`注解

```java
@Configuration
@ComponentScan("com.itheima")
@PropertySource("jdbc.properties")
public class SpringConfig {
}

```

**步骤3：使用@Value读取配置文件中的内容**

```java
@Repository("bookDao")
public class BookDaoImpl implements BookDao {
    @Value("${name}")
    private String name;
    public void save() {
        System.out.println("book dao save ..." + name);
    }
}
```

**注意:**

* 如果读取的properties配置文件有多个，可以使用`@PropertySource`的属性来指定多个

  ```java
  @PropertySource({"jdbc.properties","xxx.properties"})
  ```

* `@PropertySource`注解属性中不支持使用通配符`*`,运行会报错

  ```java
  @PropertySource({"*.properties"})
  ```

* `@PropertySource`注解属性中可以把`classpath:`加上,代表从当前项目的根路径找文件

  ```java
  @PropertySource({"classpath:jdbc.properties"})
  ```

#### 注解开发管理第三方bean

前面定义bean的时候都是在自己开发的类上面写个注解就完成了，但如果是第三方的类，这些类都是在jar包中，我们没有办法在类上面添加注解，这个时候该怎么办?

遇到上述问题，我们就需要有一种更加灵活的方式来定义bean,这种方式不能在原始代码上面书写注解，一样能定义bean,这就用到了一个全新的注解==@Bean==。

这个注解该如何使用呢?

##### @Bean()

@Bean注解的作用是**将方法的返回值制作为Spring管理的一个bean对象**

**步骤1:导入对应的jar包**

```xml
<dependency>
    <groupId>com.alibaba</groupId>
    <artifactId>druid</artifactId>
    <version>1.1.16</version>
</dependency>
```

**步骤2:在配置类中添加一个方法**

注意该方法的返回值就是要创建的Bean对象类型

```java
@Configuration
public class SpringConfig {
    public DataSource dataSource(){
        DruidDataSource ds = new DruidDataSource();
        ds.setDriverClassName("com.mysql.jdbc.Driver");
        ds.setUrl("jdbc:mysql://localhost:3306/spring_db");
        ds.setUsername("root");
        ds.setPassword("root");
        return ds;
    }
}
```

**步骤3:在方法上添加`@Bean`注解**

@Bean注解的作用是将方法的返回值制作为Spring管理的一个bean对象

```java
@Configuration
public class SpringConfig {
	@Bean
    public DataSource dataSource(){
        DruidDataSource ds = new DruidDataSource();
        ds.setDriverClassName("com.mysql.jdbc.Driver");
        ds.setUrl("jdbc:mysql://localhost:3306/spring_db");
        ds.setUsername("root");
        ds.setPassword("root");
        return ds;
    }
}
```

**注意:不能使用`DataSource ds = new DruidDataSource()`**

因为DataSource接口中没有对应的setter方法来设置属性。

**步骤4:从IOC容器中获取对象并打印**

```java
public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        DataSource dataSource = ctx.getBean(DataSource.class);
        System.out.println(dataSource);
    }
}
```

至此使用@Bean来管理第三方bean的案例就已经完成。

如果有多个bean要被Spring管理，直接在配置类中多些几个方法，方法上添加@Bean注解即可。

##### 引入外部配置类

如**果把所有的第三方bean都配置到Spring的配置类`SpringConfig`中，虽然可以，但是不利于代码阅读和分类管理**，所有我们就想能不能按照类别**将这些bean配置到不同的配置类中**?

对于数据源的bean,我们新建一个`JdbcConfig`配置类，并把数据源配置到该类下。

```java
public class JdbcConfig {
	@Bean
    public DataSource dataSource(){
        DruidDataSource ds = new DruidDataSource();
        ds.setDriverClassName("com.mysql.jdbc.Driver");
        ds.setUrl("jdbc:mysql://localhost:3306/spring_db");
        ds.setUsername("root");
        ds.setPassword("root");
        return ds;
    }
}
```

现在的问题是，这个配置类如何能被Spring配置类加载到，并创建DataSource对象在IOC容器中?

##### @Import()

**在Spring配置类中引入**

```java
@Configuration
//@ComponentScan("com.itheima.config")
@Import({JdbcConfig.class})
public class SpringConfig {
	
}
```

#### 注入资源给第三方bean

在使用@Bean创建bean对象的时候，如果方法在创建的过程中需要其他资源该怎么办?

这些资源会有两大类，分别是`简单数据类型` 和`引用数据类型`。

#####  简单数据类型

**步骤1:类中提供四个属性**

```java
public class JdbcConfig {
    private String driver;
    private String url;
    private String userName;
    private String password;
	@Bean
    public DataSource dataSource(){
        DruidDataSource ds = new DruidDataSource();
        ds.setDriverClassName("com.mysql.jdbc.Driver");
        ds.setUrl("jdbc:mysql://localhost:3306/spring_db");
        ds.setUsername("root");
        ds.setPassword("root");
        return ds;
    }
}
```

**步骤2:使用`@Value`注解引入值**

```java
public class JdbcConfig {
    @Value("com.mysql.jdbc.Driver")
    private String driver;
    @Value("jdbc:mysql://localhost:3306/spring_db")
    private String url;
    @Value("root")
    private String userName;
    @Value("password")
    private String password;
	@Bean
    public DataSource dataSource(){
        DruidDataSource ds = new DruidDataSource();
        ds.setDriverClassName(driver);
        ds.setUrl(url);
        ds.setUsername(userName);
        ds.setPassword(password);
        return ds;
    }
}
```

##### 引用数据类型

**步骤1:在SpringConfig中扫描BookDao**

扫描的目的是让Spring能管理到BookDao,也就是说要让IOC容器中有一个bookDao对象

```java
@Configuration
@ComponentScan("com.itheima.dao")
@Import({JdbcConfig.class})
public class SpringConfig {
}
```

**步骤2:在JdbcConfig类的方法上添加参数**

```java
@Bean
public DataSource dataSource(BookDao bookDao){
    System.out.println(bookDao);
    DruidDataSource ds = new DruidDataSource();
    ds.setDriverClassName(driver);
    ds.setUrl(url);
    ds.setUsername(userName);
    ds.setPassword(password);
    return ds;
}
```

==引用类型注入只需要为bean定义方法设置形参即可，容器会根据类型自动装配对象。==

#### Spring整合Junit

整合Junit与整合Druid和MyBatis差异比较大，为什么呢？Junit是一个搞单元测试用的工具，它不是我们程序的主体，也不会参加最终程序的运行，从作用上来说就和之前的东西不一样，它不是做功能的，看做是一个辅助工具就可以了。

##### 步骤1:引入依赖

pom.xml

```xml
<dependency>
    <groupId>junit</groupId>
    <artifactId>junit</artifactId>
    <version>4.12</version>
    <scope>test</scope>
</dependency>

<dependency>
    <groupId>org.springframework</groupId>
    <artifactId>spring-test</artifactId>
    <version>5.2.10.RELEASE</version>
</dependency>
```

##### 步骤2:编写测试类

在test\java下创建一个AccountServiceTest,这个名字任意

```java
//设置类运行器
@RunWith(SpringJUnit4ClassRunner.class)
//设置Spring环境对应的配置类
@ContextConfiguration(classes = {SpringConfiguration.class}) //加载配置类
//@ContextConfiguration(locations={"classpath:applicationContext.xml"})//加载配置文件
public class AccountServiceTest {
    //支持自动装配注入bean
    @Autowired
    private AccountService accountService;
    @Test
    public void testFindById(){
        System.out.println(accountService.findById(1));

    }
    @Test
    public void testFindAll(){
        System.out.println(accountService.findAll());
    }
}
```

**注意:**

* 单元测试，如果测试的是注解配置类，则使用`@ContextConfiguration(classes = 配置类.class)`
* 单元测试，如果测试的是配置文件，则使用`@ContextConfiguration(locations={配置文件名,...})`
* Junit运行后是基于Spring环境运行的，所以Spring提供了一个专用的类运行器，这个务必要设置，这个类运行器就在Spring的测试专用包中提供的，导入的坐标就是这个东西`SpringJUnit4ClassRunner`
* 上面两个配置都是固定格式，当需要测试哪个bean时，使用自动装配加载对应的对象，下面的工作就和以前做Junit单元测试完全一样了

#### 注解开发总结

![image-20240412163657461](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240412163657461.png) 

##### 知识点1@Component

| 名称 | @Component/@Controller/@Service/@Repository |
| ---- | ------------------------------------------- |
| 类型 | 类注解                                      |
| 位置 | 类定义上方                                  |
| 作用 | 设置该类为spring管理的bean                  |
| 属性 | value（默认）：定义bean的id                 |

##### 知识点2@Configuration

| 名称 | @Configuration                                             |
| ---- | ---------------------------------------------------------- |
| 类型 | 类注解                                                     |
| 位置 | 类定义上方（在SpringConfig配置类上）                       |
| 作用 | 设置该类为spring配置类，**用来替代applicationContext.xml** |
| 属性 | value（默认）：定义bean的id                                |

##### 知识点3@ComponentScan

| 名称 | @ComponentScan                                               |
| ---- | ------------------------------------------------------------ |
| 类型 | 类注解                                                       |
| 位置 | 类定义上方（在SpringConfig配置类上）                         |
| 作用 | 设置spring配置类扫描路径，**用于加载使用注解格式定义的bean**，为了让Spring框架能够扫描到写在类上的注解 |
| 属性 | value（默认）：扫描路径，此路径可以逐层向下扫描              |

##### 知识点4@Scope

| 名称 | @Scope                                                       |
| ---- | ------------------------------------------------------------ |
| 类型 | 类注解                                                       |
| 位置 | 类定义上方                                                   |
| 作用 | 设置该类创建对象的作用范围<br/>可用于设置创建出的bean是否为单例对象 |
| 属性 | value（默认）：定义bean作用范围，<br/>==默认值singleton（单例），可选值prototype（非单例）== |

##### 知识点5@PostConstruct

| 名称 | @PostConstruct         |
| ---- | ---------------------- |
| 类型 | 方法注解               |
| 位置 | 方法上                 |
| 作用 | 设置该方法为初始化方法 |
| 属性 | 无                     |

##### 知识点6@PreDestroy

| 名称 | @PreDestroy          |
| ---- | -------------------- |
| 类型 | 方法注解             |
| 位置 | 方法上               |
| 作用 | 设置该方法为销毁方法 |
| 属性 | 无                   |

##### 知识点7@Autowired


| 名称 | @Autowired                                                   |
| ---- | ------------------------------------------------------------ |
| 类型 | 属性注解  或  方法注解（了解）  或  方法形参注解（了解）     |
| 位置 | 属性定义上方  或  标准set方法上方  或  类set方法上方  或  方法形参前面 |
| 作用 | 为引用类型属性设置值（自动的，按类型注入bean）               |
| 属性 | required：true/false，定义该属性是否允许为null               |

##### 知识点8@Qualifier

| 名称 | @Qualifier                                                   |
| ---- | ------------------------------------------------------------ |
| 类型 | 属性注解  或  方法注解（了解）                               |
| 位置 | 属性定义上方  或  标准set方法上方  或  类set方法上方         |
| 作用 | 为引用类型属性指定注入的beanId（要搭配@Autowired，可以按名字注入bean） |
| 属性 | value（默认）：设置注入的beanId                              |

##### 知识点9@Value

| 名称 | @Value                                                    |
| ---- | --------------------------------------------------------- |
| 类型 | 属性注解  或  方法注解（了解）                            |
| 位置 | 属性定义上方  或  标准set方法上方  或  类set方法上方      |
| 作用 | 为  基本数据类型  或  字符串类型  属性设置值 （简单类型） |
| 属性 | value（默认）：要注入的属性值                             |

##### 知识点10@PropertySource

| 名称 | @PropertySource                                              |
| ---- | ------------------------------------------------------------ |
| 类型 | 类注解                                                       |
| 位置 | 类定义上方，**在SpringConfig类上面**                         |
| 作用 | 加载properties文件中的属性值                                 |
| 属性 | value（默认）：设置加载的properties文件对应的文件名或文件名组成的数组 |

##### 知识点11@Bean

| 名称 | @Bean                                                        |
| ---- | ------------------------------------------------------------ |
| 类型 | 方法注解                                                     |
| 位置 | 方法定义上方                                                 |
| 作用 | 设置该方法的返回值作为spring管理的bean，**特别在管理第三方bean有用**，搭配@import使用 |
| 属性 | value（默认）：定义bean的id                                  |

##### 知识点12@Import

| 名称 | @Import                                                      |
| ---- | ------------------------------------------------------------ |
| 类型 | 类注解                                                       |
| 位置 | 类定义上方                                                   |
| 作用 | 导入配置类，比如：**将MysqlConfig的配置类导入到SpringConfig类中** |
| 属性 | value（默认）：定义导入的配置类类名，<br/>当配置类有多个时使用数组格式一次性导入多个配置类 |

##### 知识点13@RunWith

| 名称 | @RunWith                          |
| ---- | --------------------------------- |
| 类型 | 测试类注解                        |
| 位置 | 测试类定义上方                    |
| 作用 | 设置JUnit运行器                   |
| 属性 | value（默认）：运行所使用的运行期 |

##### 知识点14@ContextConfiguration

| 名称 | @ContextConfiguration                                        |
| ---- | ------------------------------------------------------------ |
| 类型 | 测试类注解                                                   |
| 位置 | 测试类定义上方                                               |
| 作用 | 设置JUnit加载的Spring核心配置，**将SpringConfig的类配置信息给到测试类** |
| 属性 | classes：核心配置类，可以使用数组的格式设定加载多个配置类<br/>locations:配置文件，可以使用数组的格式设定加载多个配置文件名称 |

### AOP

#### AOP简介

前面我们在介绍Spring的时候说过，Spring有两个核心的概念，一个是`IOC/DI`，一个是`AOP`。

前面已经对`IOC/DI`进行了系统的学习，接下来要学习它的另一个核心内容，就是==AOP==。

对于AOP,我们前面提过一句话是:==AOP是在不改原有代码的前提下对其进行增强。==

##### 什么是AOP

* AOP(Aspect Oriented Programming)**面向切面编程**，一种编程范式，指导开发者如何组织程序结构。
* OOP(Object Oriented Programming)面向对象编程

我们都知道OOP是一种编程思想，那么AOP也是一种编程思想，编程思想主要的内容就是指导程序员该如何编写程序，所以它们两个是不同的`编程范式`。

##### AOP作用

在不惊动原始设计的基础上为其进行功能增强，前面咱们有技术就可以实现这样的功能即代理模式。

##### AOP核心概念

在不惊动(改动)原有设计(代码)的前提下，想给谁添加功能就给谁添加。这个也就是Spring的理念：

* 无入侵式/无侵入式

![image-20240413154116743](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240413154116743.png) 

(1)前面一直在强调，Spring的AOP是对一个类的方法在不进行任何修改的前提下实现增强。对于上面的案例中BookServiceImpl中有`save`,`update`,`delete`和`select`方法,这些方法我们给起了一个名字叫==连接点==

(2)在BookServiceImpl的四个方法中，`update`和`delete`只有打印没有计算万次执行消耗时间，但是在运行的时候已经有该功能，那也就是说`update`和`delete`方法都已经被增强，所以对于**需要增强的方法**我们给起了一个名字叫==切入点==

(3)执行BookServiceImpl的update和delete方法的时候都被添加了一个计算万次执行消耗时间的功能，将这个功能抽取到一个方法中，换句话说就是**存放共性功能的方法**，我们给起了个名字叫==通知==

(4)通知是要增强的内容，会有多个，切入点是需要被增强的方法，也会有多个，那哪个切入点需要添加哪个通知，就需要提前将它们之间的关系描述清楚，那么对于**通知和切入点之间的关系描述**，我们给起了个名字叫==切面==

(5)通知是一个方法，方法不能独立存在需要被写在一个类中，这个类我们也给起了个名字叫==通知类==

**至此AOP中的核心概念就已经介绍完了，总结下:**

* 连接点(JoinPoint)：程序执行过程中的任意位置，粒度为执行方法、抛出异常、设置变量等
  * **在SpringAOP中，理解为方法的执行**
* 切入点(Pointcut):匹配连接点的式子
  * 在SpringAOP中，一个切入点可以描述一个具体方法，也可也匹配多个方法
    * **一个具体的方法**:如com.itheima.dao包下的BookDao接口中的无形参无返回值的save方法
    * **匹配多个方法**:所有的save方法，所有的get开头的方法，所有以Dao结尾的接口中的任意方法，所有带有一个参数的方法
  * **连接点范围要比切入点范围大**，是切入点的方法也一定是连接点，但是是连接点的方法就不一定要被增强，所以可能不是切入点。
* 通知(Advice):在切入点处执行的操作，也就是共性功能
  * **在SpringAOP中，功能最终以方法的形式呈现**
* 通知类：定义通知的类
* 切面(Aspect):描述通知与切入点的对应关系。

#### AOP入门案例

##### 思路分析

需求明确后，具体该如何实现，都有哪些步骤，我们先来分析下:

> 1.导入坐标(pom.xml)
>
> 2.制作连接点(原始操作，Dao接口与实现类)
>
> 3.制作共性功能(通知类与通知)
>
> 4.定义切入点
>
> 5.绑定切入点与通知关系(切面)

##### 实现步骤

###### 步骤1:添加依赖

```xml
<dependency>
    <groupId>org.aspectj</groupId>
    <artifactId>aspectjweaver</artifactId>
    <version>1.9.4</version>
</dependency>
```

![1630146885493](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/1630146885493.png)

* 因为`spring-context`中已经导入了`spring-aop`,所以不需要再单独导入`spring-aop`
* 导入AspectJ的jar包,AspectJ是AOP思想的一个具体实现，Spring有自己的AOP实现，但是相比于AspectJ来说比较麻烦，所以我们直接采用Spring整合ApsectJ的方式进行AOP开发。

###### 步骤2:定义接口与实现类

```
环境准备的时候，BookDaoImpl已经准备好，不需要做任何修改
```

###### 步骤3:定义通知类和通知

通知就是将共性功能抽取出来后形成的方法，共性功能指的就是当前系统时间的打印。

~~~java
public class MyAdvice {
    public void method(){
        System.out.println(System.currentTimeMillis());    
    }
}
~~~

###### 步骤4:定义切入点

BookDaoImpl中有两个方法，分别是save和update，我们要增强的是update方法，该如何定义呢?

```java
public class MyAdvice {
    @Pointcut("execution(void com.itheima.dao.BookDao.update())")
    private void pt(){}
    public void method(){
        System.out.println(System.currentTimeMillis());
    }
}
```

**说明:**

* **切入点定义依托一个不具有实际意义的方法进行**，即**无参数、无返回值、方法体无实际逻辑**。
* execution及后面编写的内容，后面会有章节专门去学习。

###### 步骤5:制作切面

切面是用来描述通知和切入点之间的关系，如何进行关系的绑定?

```java
public class MyAdvice {
    @Pointcut("execution(void com.itheima.dao.BookDao.update())")
    private void pt(){}
    
    @Before("pt()")
    public void method(){
        System.out.println(System.currentTimeMillis());
    }
}
```

绑定切入点与通知关系，并指定通知添加到原始连接点的具体执行==位置==

![1630148447689](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/1630148447689.png)

**说明:**@Before翻译过来是之前，也就是说通知会在切入点方法执行之前执行，除此之前还有其他四种类型，后面会讲。

###### 步骤6:将通知类配给容器并标识其为切面类

```java
@Component
@Aspect  //这里添加了Aspect注解，说明这是一个切面类，使下面的@Pointcut和@Before生效
public class MyAdvice {
    @Pointcut("execution(void com.itheima.dao.BookDao.update())")
    private void pt(){}
    
    @Before("pt()")
    public void method(){
        System.out.println(System.currentTimeMillis());
    }
}
```

###### 步骤7:开启注解格式AOP功能

```java
@Configuration
@ComponentScan("com.itheima")
@EnableAspectJAutoProxy //这里添加了@EnableAspectJAutoProxy注解，使切面生效
public class SpringConfig {
}
```

#### AOP工作流程

由于**AOP是基于Spring容器管理的bean做的增强**，所以整个工作过程需要从Spring加载bean说起:

###### 流程1:Spring容器启动

* 容器启动就需要去加载bean,哪些类需要被加载呢?
* 需要被增强的类，如:BookServiceImpl
* 通知类，如:MyAdvice
* 注意此时bean对象还没有创建成功

###### 流程2:读取所有切面配置中被使用的的切入点

![1630151682428](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/1630151682428.png)

* **上面这个例子中有两个切入点的配置，但是第一个`ptx()`并没有被使用，所以不会被读取。**

###### 流程3:初始化bean

判定bean对应的类中的方法是否匹配到任意切入点

* 注意第1步在容器启动的时候，bean对象还没有被创建成功。

* 要被实例化bean对象的类中的方法和切入点进行匹配

  ![1630152538083](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/1630152538083.png)

  * 匹配失败，创建原始对象,如`UserDao`
    * 匹配失败说明不需要增强，直接调用原始对象的方法即可。
  * 匹配成功，创建原始对象（==目标对象==）的==代理==对象,如:`BookDao`
    * 匹配成功说明需要对其进行增强
    * 对哪个类做增强，这个类对应的对象就叫做目标对象
    * 因为要对目标对象进行功能增强，而采用的技术是动态代理，所以会为其创建一个代理对象
    * 最终运行的是代理对象的方法，在该方法中会对原始方法进行功能增强

###### 流程4:获取bean执行方法

* 获取的bean是原始对象时，调用方法并执行，完成操作
* 获取的bean是代理对象时，根据代理对象的运行模式运行原始方法与增强的内容，完成操作

###### 小结

在上面介绍AOP的工作流程中，我们提到了两个核心概念，分别是:

* **目标对象(Target)**：原始功能去掉共性功能对应的类产生的对象，这种对象是无法直接完成最终工作的
* **代理(Proxy**)：目标对象无法直接完成工作，需要对其进行功能回填，通过原始对象的代理对象实现

上面这两个概念比较抽象，简单来说，

目标对象就是要增强的类[如:BookServiceImpl类]对应的对象，也叫原始对象，不能说它不能运行，只能说它在运行的过程中对于要增强的内容是缺失的。

SpringAOP是在不改变原有设计(代码)的前提下对其进行增强的，它的**底层采用的是代理模式实现的**，所以要对原始对象进行增强，就需要对原始对象创建代理对象，在代理对象中的方法把通知[如:MyAdvice中的method方法]内容加进去，就实现了增强,这就是我们所说的代理(Proxy)。

#### AOP切入点表达式

前面的案例中，有涉及到如下内容:

![1630155937718](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/1630155937718.png)

对于AOP中切入点表达式，我们总共会学习三个内容，分别是`语法格式`、`通配符`和`书写技巧`。

##### 语法格式

**首先我们先要明确两个概念:**

* **切入点**:要进行增强的方法
* **切入点表达式**:要进行增强的方法的描述方式

**对于切入点表达式的语法为:**

* 切入点表达式标准格式：动作关键字(**访问修饰符**  **返回值**  **包名.类/接口名.方法名(参数)** **异常名**）

  ~~~java
  execution(public User com.itheima.service.UserService.findById(int))
  ~~~

* **execution：动作关键字，描述切入点的行为动作，例如execution表示执行到指定切入点**

* public:访问修饰符,还可以是public，private等，可以省略

* **User：返回值，写返回值类型**

* **com.itheima.service：包名，多级包使用点连接**

* **UserService:类/接口名称**

* **findById：方法名**

* **int:参数，直接写参数的类型，多个类型用逗号隔开**

* 异常名：方法定义中抛出指定异常，可以省略

切入点表达式就是要找到需要增强的方法，所以它就是对一个具体方法的描述，但是方法的定义会有很多，所以如果每一个方法对应一个切入点表达式，想想这块就会觉得将来编写起来会比较麻烦，有没有更简单的方式呢?

就需要用到下面所学习的通配符。

##### 通配符

我们使用通配符描述切入点，主要的目的就是简化之前的配置，具体都有哪些通配符可以使用?

* `*`:单个独立的任意符号，可以独立出现，也可以作为前缀或者后缀的匹配符出现，**匹配一个或多个**

  ```
  execution（public * com.itheima.*.UserService.find*(*))
  ```

  匹配com.itheima包下的任意包中的UserService类或接口中所有find开头的带有一个参数的方法

* `..`：多个连续的任意符号，可以独立出现，常用于简化包名与参数的书写，**匹配0个或多个**

  ```
  execution（public User com..UserService.findById(..))
  ```

  匹配com包下的任意包中的UserService类或接口中所有名称为findById的方法

~~~java
execution(void com.itheima.dao.BookDao.update())
匹配接口，能匹配到
execution(void com.itheima.dao.impl.BookDaoImpl.update())
匹配实现类，能匹配到
execution(* com.itheima.dao.impl.BookDaoImpl.update())
返回值任意，能匹配到
execution(* com.itheima.dao.impl.BookDaoImpl.update(*))
返回值任意，但是update方法必须要有一个参数，无法匹配，要想匹配需要在update接口和实现类添加参数
execution(void com.*.*.*.*.update())
返回值为void,com包下的任意包三层包下的任意类的update方法，匹配到的是实现类，能匹配
execution(void com.*.*.*.update())
返回值为void,com包下的任意两层包下的任意类的update方法，匹配到的是接口，能匹配
execution(void *..update())
返回值为void，方法名是update的任意包下的任意类，能匹配
execution(* *..*(..))
匹配项目中任意类的任意方法，能匹配，但是不建议使用这种方式，影响范围广
execution(* *..u*(..))
匹配项目中任意包任意类下只要以u开头的方法，update方法能满足，能匹配
execution(* *..*e(..))
匹配项目中任意包任意类下只要以e结尾的方法，update和save方法能满足，能匹配
execution(void com..*())
返回值为void，com包下的任意包任意类任意方法，能匹配，*代表的是方法
execution(* com.itheima.*.*Service.find*(..))
将项目中所有业务层方法的以find开头的方法匹配 //重点了解
execution(* com.itheima.*.*Service.save*(..))
将项目中所有业务层方法的以save开头的方法匹配 //重点了解
~~~

##### 书写技巧

对于切入点表达式的编写其实是很灵活的，那么在编写的时候，有没有什么好的技巧让我们用用:

- **所有代码按照标准规范开发，否则以下技巧全部失效**
- 描述切入点通**==常描述接口==**，而不描述实现类,如果描述到实现类，就出现紧耦合了
- 访问控制修饰符针对接口开发均采用public描述（**==可省略访问控制修饰符描述==**）
- 返回值类型对于**增删改类使用精准类型加速匹配**，对于**查询类使用\*通配快速描述**
- **==包名==**书写**==尽量不使用..匹配==**，效率过低，常用\*做单个包描述匹配，或精准匹配
- **==接口名/类名==**书写名称与模块相关的**==采用\*匹配==**，例如UserService书写成\*Service，绑定业务层接口名
- **==方法名==**书写以**==动词==**进行**==精准匹配==**，名词采用*匹配，例如getById书写成getBy*,selectAll书写成selectAll
- 参数规则较为复杂，根据业务方法灵活调整
- 通常**==不使用异常==**作为**==匹配==**规则

#### AOP通知类型

AOP通知描述了抽取的共性功能，根据共性功能抽取的位置不同，最终运行代码时要将其加入到合理的位置，通知具体要添加到切入点的哪里?

共提供了5种通知类型:

- 前置通知
- 后置通知
- **==环绕通知(重点)==**
- 返回后通知(了解)
- 抛出异常后通知(了解)

为了更好的理解这几种通知类型，我们来看一张图：

![image-20240413161154928](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240413161154928.png) 

(1)前置通知，**追加功能到方法执行前**,类似于在代码1或者代码2添加内容

(2)后置通知,追加功能到方法执行后,**不管方法执行的过程中有没有抛出异常都会执行**，类似于在代码5添加内容

(3)返回后通知,追加功能到方法执行后，**只有方法正常执行结束后才进行**,类似于在代码3添加内容，如果方法执行抛出异常，返回后通知将不会被添加

(4)抛出异常后通知,追加功能到方法抛出异常后，**只有方法执行出异常才进行**,类似于在代码4添加内容，只有方法抛出异常后才会被添加

(5)环绕通知,环绕通知功能比较强大，它可以追加功能到方法执行的前后，这也是比较**常用**的方式，它可以实现其他四种通知类型的功能，具体是如何实现的，需要我们往下学习。

##### 前置通知

修改MyAdvice,在before方法上添加`@Before注解`

```java
@Component
@Aspect
public class MyAdvice {
    @Pointcut("execution(void com.itheima.dao.BookDao.update())")
    private void pt(){}
    
    @Before("pt()")
    //此处也可以写成 @Before("MyAdvice.pt()"),不建议
    public void before() {
        System.out.println("before advice ...");
    }
}
```

![image-20240413161406156](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240413161406156.png) 

##### 后置通知

```java
@Component
@Aspect
public class MyAdvice {
    @Pointcut("execution(void com.itheima.dao.BookDao.update())")
    private void pt(){}
    
    @Before("pt()")
    public void before() {
        System.out.println("before advice ...");
    }
    @After("pt()")
    public void after() {
        System.out.println("after advice ...");
    }
}
```

![1630167887131](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/1630167887131.png) 

##### 环绕通知

###### 基本使用

```java
@Component
@Aspect
public class MyAdvice {
    @Pointcut("execution(void com.itheima.dao.BookDao.update())")
    private void pt(){}
    
    @Around("pt()")
    public void around(){
        System.out.println("around before advice ...");
        System.out.println("around after advice ...");
    }
}
```

![1630167969051](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/1630167969051.png)

运行结果中，通知的内容打印出来，**但是原始方法的内容却没有被执行**。

因为环绕通知需要在原始方法的前后进行增强，所以**环绕通知就必须要能对原始操作进行调用**，具体如何实现?

```java
@Component
@Aspect
public class MyAdvice {
    @Pointcut("execution(void com.itheima.dao.BookDao.update())")
    private void pt(){}
    
    @Around("pt()")
    public void around(ProceedingJoinPoint pjp) throws Throwable{
        System.out.println("around before advice ...");
        //表示对原始操作的调用
        pjp.proceed();
        System.out.println("around after advice ...");
    }
}
```

![image-20240413161534156](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240413161534156.png) 

###### 注意事项

**原始方法有返回值的处理**

运行后会报错，错误内容为:

Exception in thread "main" org.springframework.aop.AopInvocationException: ==Null return value from advice does not match primitive return type for: public abstract int com.itheima.dao.BookDao.select()==
	at org.springframework.aop.framework.JdkDynamicAopProxy.invoke(JdkDynamicAopProxy.java:226)
	at com.sun.proxy.$Proxy19.select(Unknown Source)
	at com.itheima.App.main(App.java:12)

**错误大概的意思是:`空的返回不匹配原始方法的int返回`**

* void就是返回Null
* 原始方法就是BookDao下的select方法

**所以如果我们使用环绕通知的话，要根据原始方法的返回值来设置环绕通知的返回值**，具体解决方案为:

```java
@Component
@Aspect
public class MyAdvice {
    @Pointcut("execution(void com.itheima.dao.BookDao.update())")
    private void pt(){}
    
    @Pointcut("execution(int com.itheima.dao.BookDao.select())")
    private void pt2(){}
    
    @Around("pt2()") //这里把原来的void类型该为了Object类型，实现了对原始方法有返回值的处理
    public Object aroundSelect(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("around before advice ...");
        //表示对原始操作的调用
        Object ret = pjp.proceed();
        System.out.println("around after advice ...");
        return ret + 888888866666666;
    }
}
```

**说明:**

​	为什么返回的是Object而不是int的主要原因是**Object类型更通用**。

​	**在环绕通知中是可以对原始方法返回值就行修改的**。

###### **环绕通知注意事项**

1. 环绕通知**必须依赖形参ProceedingJoinPoint才能实现对原始方法的调用**，进而实现原始方法调用前后同时添加通知
2. 通知中如果未使用ProceedingJoinPoint对原始方法进行调用将跳过原始方法的执行
3. 对原始方法的调用可以不接收返回值，通知方法设置成void即可，如果接收返回值，最好设定为Object类型
4. 原始方法的返回值如果是void类型，通知方法的返回值类型可以设置成void,也可以设置成Object
5. 由于无法预知原始方法运行后是否会抛出异常，因此环绕通知方法必须要处理Throwable异常

##### 返回后通知

```java
@Component
@Aspect
public class MyAdvice {
    @Pointcut("execution(void com.itheima.dao.BookDao.update())")
    private void pt(){}
    
    @Pointcut("execution(int com.itheima.dao.BookDao.select())")
    private void pt2(){}
    
    @AfterReturning("pt2()")
    public void afterReturning() {
        System.out.println("afterReturning advice ...");
    }
}
```

![1630169124446](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/1630169124446.png) 



**注意：**返回后通知是需要在原始方法`select`正常执行后才会被执行，**如果`select()`方法执行的过程中出现了异常，那么返回后通知是不会被执行**。后置通知是不管原始方法有没有抛出异常都会被执行。这个案例大家下去可以自己练习验证下。

##### 异常后通知

```java
@Component
@Aspect
public class MyAdvice {
    @Pointcut("execution(void com.itheima.dao.BookDao.update())")
    private void pt(){}
    
    @Pointcut("execution(int com.itheima.dao.BookDao.select())")
    private void pt2(){}
    
    @AfterThrowing("pt2()")
    public void afterThrowing() {
        System.out.println("afterThrowing advice ...");
    }
}
```

![1630169357146](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/1630169357146.png)

**注意：**异常后通知是需要原始方法抛出异常，可以在`select()`方法中添加一行代码`int i = 1/0`即可。如果没有抛异常，异常后通知将不会被执行。

#### AOP通知获取数据

目前我们写AOP仅仅是在原始方法前后追加一些操作，接下来我们要说说AOP中数据相关的内容，我们将从`获取参数`、`获取返回值`和`获取异常`三个方面来研究切入点的相关信息。

前面我们介绍通知类型的时候总共讲了五种，那么对于这五种类型都会有参数，返回值和异常吗?

我们先来一个个分析下:

* **获取切入点方法的参数**，**所有的通知类型都可以获取参数**
  * **JoinPoint**：适用于前置、后置、返回后、抛出异常后通知
  * **ProceedingJoinPoint**：适用于环绕通知
* **获取切入点方法返回值**，前置和抛出异常后通知是没有返回值，后置通知可有可无，所以不做研究
  * 返回后通知
  * 环绕通知
* **获取切入点方法运行异常信息**，前置和返回后通知是不会有，后置通知可有可无，所以不做研究
  * 抛出异常后通知
  * 环绕通知

##### 获取参数

###### 非环绕通知获取方式

**在方法上添加JoinPoint,通过JoinPoint来获取参数**

```java
@Component
@Aspect
public class MyAdvice {
    @Pointcut("execution(* com.itheima.dao.BookDao.findName(..))")
    private void pt(){}

    @Before("pt()")
    public void before(JoinPoint jp)  //主要在这里，添加了形参JoinPoint
        Object[] args = jp.getArgs(); // 调用了JoinPOint接口的getArgs方法获得参数数组
        System.out.println(Arrays.toString(args));
        System.out.println("before advice ..." );
    }
	//...其他的略
}
```

运行App类，可以获取如下内容，说明参数100已经被获取

![1630233291929](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/1630233291929.png)

**思考:方法的参数只有一个，为什么获取的是一个数组?**

因为参数的个数是不固定的，所以使用数组更通配些。

如果将参数改成两个会是什么效果呢?

**说明:**

使用JoinPoint的方式获取参数适用于`前置`、`后置`、`返回后`、`抛出异常后`通知。剩下的大家自行去验证。

###### 环绕通知获取方式

**环绕通知使用的是ProceedingJoinPoint**，因为**ProceedingJoinPoint是JoinPoint类的子类**，所以对于ProceedingJoinPoint类中应该也会有对应的`getArgs()`方法，我们去验证下:

```java
@Component
@Aspect
public class MyAdvice {
    @Pointcut("execution(* com.itheima.dao.BookDao.findName(..))")
    private void pt(){}

    @Around("pt()")
    public Object around(ProceedingJoinPoint pjp)throws Throwable {
        Object[] args = pjp.getArgs(); //ProceedingJoinPoint是JoinPoint类的子类
        System.out.println(Arrays.toString(args));
        Object ret = pjp.proceed();
        return ret;
    }
	//其他的略
}
```

运行App后查看运行结果，说明ProceedingJoinPoint也是可以通过getArgs()获取参数

![1630233974310](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/1630233974310.png) 

**注意:**

* pjp.proceed()方法是有**两个构造方法**，分别是:

  ![1630234756123](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/1630234756123.png)

  * **调用无参数的proceed，当原始方法有参数，会在调用的过程中自动传入参数**

  * 所以调用这两个方法的任意一个都可以完成功能

  * 但是**当需要修改原始方法的参数时**，就只能采用带有参数的方法,如下:

    ~~~java
    @Component
    @Aspect
    public class MyAdvice {
        @Pointcut("execution(* com.itheima.dao.BookDao.findName(..))")
        private void pt(){}
    
        @Around("pt()")
        public Object around(ProceedingJoinPoint pjp) throws Throwable{
            Object[] args = pjp.getArgs();
            System.out.println(Arrays.toString(args));
            
            args[0] = 666; //这里原地修改了args数组
            
             //这里把修改的args数组作为参数传给proceed
            Object ret = pjp.proceed(args); 
           
            return ret;
        }
    	//其他的略
    
    ~~~

    有了这个特性后，我们就可以在环绕通知中对原始方法的参数进行拦截过滤，避免由于参数的问题导致程序无法正确运行，保证代码的健壮性。

##### 获取返回值

对于返回值，只有返回后`AfterReturing`和环绕`Around`这两个通知类型可以获取，具体如何获取?

###### 环绕通知获取返回值

~~~java
@Component
@Aspect
public class MyAdvice {
    @Pointcut("execution(* com.itheima.dao.BookDao.findName(..))")
    private void pt(){}

    @Around("pt()")
    public Object around(ProceedingJoinPoint pjp) throws Throwable{
        Object[] args = pjp.getArgs();
        System.out.println(Arrays.toString(args));
        args[0] = 666;
        Object ret = pjp.proceed(args);
        return ret;
    }
	//其他的略
}
~~~

**上述代码中，`ret`就是方法的返回值，我们是可以直接获取，不但可以获取，如果需要还可以进行修改。**

###### 返回后通知获取返回值

```java
@Component
@Aspect
public class MyAdvice {
    @Pointcut("execution(* com.itheima.dao.BookDao.findName(..))")
    private void pt(){}

    @AfterReturning(value = "pt()",returning = "ret")
    public void afterReturning(Object ret) {
        System.out.println("afterReturning advice ..."+ret);
    }
	//其他的略
}
```

**==注意:==**

(1)参数名的问题

![1630237320870](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/1630237320870.png)

(2)afterReturning方法参数类型的问题

参数类型可以写成String，但是为了能匹配更多的参数类型，建议写成Object类型

(3)afterReturning方法参数的顺序问题

![1630237586682](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/1630237586682.png)

##### 获取异常

对于获取抛出的异常，只有抛出异常后`AfterThrowing`和环绕`Around`这两个通知类型可以获取，具体如何获取?

###### 环绕通知获取异常

这块比较简单，以前我们是抛出异常，现在只需要将异常捕获，就可以获取到原始方法的异常信息了

~~~java
@Component
@Aspect
public class MyAdvice {
    @Pointcut("execution(* com.itheima.dao.BookDao.findName(..))")
    private void pt(){}

    @Around("pt()")
    public Object around(ProceedingJoinPoint pjp){
        Object[] args = pjp.getArgs();
        System.out.println(Arrays.toString(args));
        args[0] = 666;
        Object ret = null;
        //这里直接用trycatch块来捕获异常
        try{
            ret = pjp.proceed(args);
        }catch(Throwable throwable){
            t.printStackTrace();
        }
        return ret;
    }
	//其他的略
}
~~~

在catch方法中就可以获取到异常，至于获取到异常以后该如何处理，这个就和你的业务需求有关了。

###### 抛出异常后通知获取异常

```java
@Component
@Aspect
public class MyAdvice {
    @Pointcut("execution(* com.itheima.dao.BookDao.findName(..))")
    private void pt(){}

    @AfterThrowing(value = "pt()",throwing = "t")
    public void afterThrowing(Throwable t) {
        System.out.println("afterThrowing advice ..."+t);
    }
	//其他的略
}
```

如何让原始方法抛出异常，方式有很多，

```java
@Repository
public class BookDaoImpl implements BookDao {

    public String findName(int id,String password) {
        System.out.println("id:"+id);
        if(true){ //这里骗一手编译器，实际上还是要执行这个抛出异常的
            throw new NullPointerException();
        }
        return "itcast";
    }
}
```

==注意:==

![1630239939043](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/1630239939043.png)

#### 百度网盘密码数据兼容处理

##### 需求分析

需求: **对百度网盘分享链接输入密码时尾部多输入的空格做兼容处理**。

![1630240203033](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/1630240203033.png)

问题描述:

* 点击链接，会提示，请输入提取码，如下图所示

  <img src="https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/1630240528228.png" alt="1630240528228" style="zoom: 50%;" /> 

* 当我们从别人发给我们的内容中复制提取码的时候，有时候会多复制到一些空格，直接粘贴到百度的提取码输入框

* 但是百度那边记录的提取码是没有空格的

* 这个时候如果不做处理，直接对比的话，就会引发提取码不一致，导致无法访问百度盘上的内容

* 所以多输入一个空格可能会导致项目的功能无法正常使用。

* 此时我们就想能不能将输入的参数先帮用户去掉空格再操作呢?

综上所述，我们需要考虑两件事:
①：**在业务方法执行之前对所有的输入参数进行格式处理——trim()**
②：**使用处理后的参数调用原始方法——环绕通知中存在对原始方法的调用**

##### 环境准备

- 创建一个Maven项目

- pom.xml添加Spring依赖

  ```xml
  <dependencies>
      <dependency>
        <groupId>org.springframework</groupId>
        <artifactId>spring-context</artifactId>
        <version>5.2.10.RELEASE</version>
      </dependency>
      <dependency>
        <groupId>org.aspectj</groupId>
        <artifactId>aspectjweaver</artifactId>
        <version>1.9.4</version>
      </dependency>
    </dependencies>
  ```

- 添加ResourcesService，ResourcesServiceImpl,ResourcesDao和ResourcesDaoImpl类

  ```java
  public interface ResourcesDao {
      boolean readResources(String url, String password);
  }
  @Repository
  public class ResourcesDaoImpl implements ResourcesDao {
      public boolean readResources(String url, String password) {
          //模拟校验
          return password.equals("root");
      }
  }
  public interface ResourcesService {
      public boolean openURL(String url ,String password);
  }
  @Service
  public class ResourcesServiceImpl implements ResourcesService {
      @Autowired
      private ResourcesDao resourcesDao;
  
      public boolean openURL(String url, String password) {
          return resourcesDao.readResources(url,password);
      }
  }
  
  ```

- 创建Spring的配置类

  ```java
  @Configuration
  @ComponentScan("com.itheima")
  public class SpringConfig {
  }
  ```

- 编写App运行类

  ```java
  public class App {
      public static void main(String[] args) {
          ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
          ResourcesService resourcesService = ctx.getBean(ResourcesService.class);
          boolean flag = resourcesService.openURL("http://pan.baidu.com/haha", "root");
          System.out.println(flag);
      }
  }
  ```

最终创建好的项目结构如下:

![1630241681697](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/1630241681697.png) 

现在项目的效果是，当输入密码为"root"控制台打印为true,如果密码改为"root  "控制台打印的是false

需求是使用AOP将参数进行统一处理，不管输入的密码`root`前后包含多少个空格，最终控制台打印的都是true。

##### 具体实现

###### 步骤1:开启SpringAOP的注解功能

```java
@Configuration
@ComponentScan("com.itheima")
@EnableAspectJAutoProxy
public class SpringConfig {
}
```

###### 步骤2:编写通知类

```java
@Component
@Aspect
public class DataAdvice {
    @Pointcut("execution(boolean com.itheima.service.*Service.*(*,*))")
    private void servicePt(){}
    
}
```

###### 步骤3:添加环绕通知

```java
@Component
@Aspect
public class DataAdvice {
    @Pointcut("execution(boolean com.itheima.service.*Service.*(*,*))")
    private void servicePt(){}
    
    @Around("DataAdvice.servicePt()")
    // @Around("servicePt()")这两种写法都对
    public Object trimStr(ProceedingJoinPoint pjp) throws Throwable {
        Object ret = pjp.proceed();
        return ret;
    }
    
}
```

###### 步骤4:完成核心业务，处理参数中的空格

```java
@Component
@Aspect
public class DataAdvice {
    @Pointcut("execution(boolean com.itheima.service.*Service.*(*,*))")
    private void servicePt(){}
    
    @Around("DataAdvice.servicePt()")
    // @Around("servicePt()")这两种写法都对
    public Object trimStr(ProceedingJoinPoint pjp) throws Throwable {
        //获取原始方法的参数
        Object[] args = pjp.getArgs();
        for (int i = 0; i < args.length; i++) {
            //判断参数是不是字符串
            if(args[i].getClass().equals(String.class)){
                args[i] = args[i].toString().trim();
            }
        }
        //将修改后的参数传入到原始方法的执行中
        Object ret = pjp.proceed(args);
        return ret;
    }
    
}
```

###### 步骤5:运行程序

不管密码`root`前后是否加空格，最终控制台打印的都是true

###### 步骤6:优化测试

为了能更好的看出AOP已经生效，我们可以修改ResourcesImpl类，在方法中将密码的长度进行打印

```java
@Repository
public class ResourcesDaoImpl implements ResourcesDao {
    public boolean readResources(String url, String password) {
        System.out.println(password.length());
        //模拟校验
        return password.equals("root");
    }
}
```

再次运行成功，就可以根据最终打印的长度来看看，字符串的空格有没有被去除掉。

**注意：**

![image-20240413164450531](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240413164450531.png) 

#### AOP总结

AOP的知识就已经讲解完了，接下来对于AOP的知识进行一个总结:

##### AOP的核心概念

* 概念：AOP(Aspect Oriented Programming)面向切面编程，一种编程范式
* 作用：在不惊动原始设计的基础上为方法进行功能==增强==
* 核心概念
  * 代理（Proxy）：SpringAOP的核心本质是采用代理模式实现的
  * 连接点（JoinPoint）：在SpringAOP中，理解为任意方法的执行
  * 切入点（Pointcut）：匹配连接点的式子，也是具有共性功能的方法描述
  * 通知（Advice）：若干个方法的共性功能，在切入点处执行，最终体现为一个方法
  * 切面（Aspect）：描述通知与切入点的对应关系
  * 目标对象（Target）：被代理的原始对象成为目标对象

##### 切入点表达式

* 切入点表达式标准格式：动作关键字(访问修饰符  返回值  包名.类/接口名.方法名（参数）异常名)

  ```
  execution(* com.itheima.service.*Service.*(..))
  ```

* 切入点表达式描述通配符：

  * 作用：用于快速描述，范围描述
  * `*`：匹配任意符号（常用）
  * `..` ：匹配多个连续的任意符号（常用）
  * `+`：匹配子类类型

* 切入点表达式书写技巧

  1.按==标准规范==开发
  2.查询操作的返回值建议使用\*匹配
  3.减少使用..的形式描述包
  4.==对接口进行描述==，使用\*表示模块名，例如UserService的匹配描述为*Service
  5.方法名书写保留动词，例如get，使用\*表示名词，例如getById匹配描述为getBy\*
  6.参数根据实际情况灵活调整

##### 五种通知类型

- 前置通知
- 后置通知
- 环绕通知（重点）
  - 环绕通知依赖形参ProceedingJoinPoint才能实现对原始方法的调用
  - 环绕通知可以隔离原始方法的调用执行
  - 环绕通知返回值设置为Object类型
  - 环绕通知中可以对原始方法调用过程中出现的异常进行处理
- 返回后通知
- 抛出异常后通知

##### 通知中获取参数

- 获取切入点方法的参数，所有的通知类型都可以获取参数
  - JoinPoint：适用于前置、后置、返回后、抛出异常后通知
  - ProceedingJoinPoint：适用于环绕通知
- 获取切入点方法返回值，前置和抛出异常后通知是没有返回值，后置通知可有可无，所以不做研究
  - 返回后通知
  - 环绕通知
- 获取切入点方法运行异常信息，前置和返回后通知是不会有，后置通知可有可无，所以不做研究
  - 抛出异常后通知
  - 环绕通知

##### 知识点1：@EnableAspectJAutoProxy  

| 名称 | @EnableAspectJAutoProxy                    |
| ---- | ------------------------------------------ |
| 类型 | 配置类注解                                 |
| 位置 | 配置类定义上方，**SpringConfig配置类上面** |
| 作用 | 开启注解格式AOP功能                        |

##### 知识点2：@Aspect

| 名称 | @Aspect                              |
| ---- | ------------------------------------ |
| 类型 | 类注解                               |
| 位置 | 切面类定义上方，**在MyAdvice类上面** |
| 作用 | 设置当前类为AOP切面类                |

##### 知识点3：@Pointcut   

| 名称 | @Pointcut                                                    |
| ---- | ------------------------------------------------------------ |
| 类型 | 方法注解                                                     |
| 位置 | 切入点方法定义上方，**被修饰的方法无参无返回值无逻辑**       |
| 作用 | 设置切入点方法                                               |
| 属性 | value（默认）：切入点表达式      **“execution（。。。。）”** |

##### 知识点4：@Before

| 名称 | @Before                                                      |
| ---- | ------------------------------------------------------------ |
| 类型 | 方法注解                                                     |
| 位置 | 通知方法定义上方，**前置通知**                               |
| 作用 | 设置当前通知方法与切入点之间的绑定关系，当前通知方法在原始切入点方法前运行 |

##### 知识点5：@After

| 名称 | @After                                                       |
| ---- | ------------------------------------------------------------ |
| 类型 | 方法注解                                                     |
| 位置 | 通知方法定义上方，**后置通知**                               |
| 作用 | 设置当前通知方法与切入点之间的绑定关系，当前通知方法在原始切入点方法后运行 |

##### 知识点6：@AfterReturning  

| 名称 | @AfterReturning                                              |
| ---- | ------------------------------------------------------------ |
| 类型 | 方法注解                                                     |
| 位置 | 通知方法定义上方，**返回后通知**                             |
| 作用 | 设置当前通知方法与切入点之间绑定关系，当前通知方法在原始切入点方法正常执行完毕后执行 |

##### 知识点7：@AfterThrowing  

| 名称 | @AfterThrowing                                               |
| ---- | ------------------------------------------------------------ |
| 类型 | 方法注解                                                     |
| 位置 | 通知方法定义上方，**异常后通知**                             |
| 作用 | 设置当前通知方法与切入点之间绑定关系，当前通知方法在原始切入点方法运行抛出异常后执行 |

##### 知识点8：@Around

| 名称 | @Around                                                      |
| ---- | ------------------------------------------------------------ |
| 类型 | 方法注解                                                     |
| 位置 | 通知方法定义上方，**环绕通知**，**搭配ProceedingJoinPoint使用** |
| 作用 | 设置当前通知方法与切入点之间的绑定关系，当前通知方法在原始切入点方法前后运行 |

### AOP事务管理

#### Spring事务简介

- 事务作用：在数据层保障一系列的数据库操作**同成功同失败**
- Spring事务作用：在数据层或**==业务层==**保障一系列的数据库操作同成功同失败

Spring为了管理事务，提供了一个平台事务管理器`PlatformTransactionManager`

![1630243651541](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/1630243651541.png)

commit是用来提交事务，rollback是用来回滚事务。

PlatformTransactionManager只是一个接口，Spring还为其提供了一个具体的实现:

![1630243993380](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/1630243993380.png)

从名称上可以看出，我们只需要给它一个DataSource对象，它就可以帮你去在业务层管理事务。其内部采用的是JDBC的事务。所以说如果你持久层采用的是JDBC相关的技术，就可以采用这个事务管理器来管理你的事务。

### Spring整合Mybatis思路分析

#### Mybatis开发

在准备环境的过程中，我们也来回顾下Mybatis开发的相关内容:

##### 步骤1:准备数据库表

Mybatis是来操作数据库表，所以先创建一个数据库及表

```sql
create database spring_db character set utf8;
use spring_db;
create table tbl_account(
    id int primary key auto_increment,
    name varchar(35),
    money double
);
```

##### 步骤2:创建项目导入jar包

项目的pom.xml添加相关依赖

```xml
<dependencies>
    <dependency>
        <groupId>org.springframework</groupId>
        <artifactId>spring-context</artifactId>
        <version>5.2.10.RELEASE</version>
    </dependency>
    <dependency>
        <groupId>com.alibaba</groupId>
        <artifactId>druid</artifactId>
        <version>1.1.16</version>
    </dependency>
    <dependency>
        <groupId>org.mybatis</groupId>
        <artifactId>mybatis</artifactId>
        <version>3.5.6</version>
    </dependency>
    <dependency>
        <groupId>mysql</groupId>
        <artifactId>mysql-connector-java</artifactId>
        <version>5.1.47</version>
    </dependency>
</dependencies>
```

##### 步骤3:根据表创建模型类

```java
public class Account implements Serializable {

    private Integer id;
    private String name;
    private Double money;
	//setter...getter...toString...方法略    
}
```

##### 步骤4:创建Dao接口

```java
public interface AccountDao {

    @Insert("insert into tbl_account(name,money)values(#{name},#{money})")
    void save(Account account);

    @Delete("delete from tbl_account where id = #{id} ")
    void delete(Integer id);

    @Update("update tbl_account set name = #{name} , money = #{money} where id = #{id} ")
    void update(Account account);

    @Select("select * from tbl_account")
    List<Account> findAll();

    @Select("select * from tbl_account where id = #{id} ")
    Account findById(Integer id);
}
```

##### 步骤5:创建Service接口和实现类

```java
public interface AccountService {

    void save(Account account);

    void delete(Integer id);

    void update(Account account);

    List<Account> findAll();

    Account findById(Integer id);

}

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountDao accountDao;

    public void save(Account account) {
        accountDao.save(account);
    }

    public void update(Account account){
        accountDao.update(account);
    }

    public void delete(Integer id) {
        accountDao.delete(id);
    }

    public Account findById(Integer id) {
        return accountDao.findById(id);
    }

    public List<Account> findAll() {
        return accountDao.findAll();
    }
}
```

##### 步骤6:添加jdbc.properties文件

resources目录下添加，用于配置数据库连接四要素

```properties
jdbc.driver=com.mysql.jdbc.Driver
jdbc.url=jdbc:mysql://localhost:3306/spring_db?useSSL=false
jdbc.username=root
jdbc.password=root
```

useSSL:关闭MySQL的SSL连接

##### 步骤7:添加Mybatis核心配置文件

```xml
<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE configuration
        PUBLIC "-//mybatis.org//DTD Config 3.0//EN"
        "http://mybatis.org/dtd/mybatis-3-config.dtd">
<configuration>
    <!--读取外部properties配置文件-->
    <properties resource="jdbc.properties"></properties>
    <!--别名扫描的包路径-->
    <typeAliases>
        <package name="com.itheima.domain"/>
    </typeAliases>
    <!--数据源-->
    <environments default="mysql">
        <environment id="mysql">
            <transactionManager type="JDBC"></transactionManager>
            <dataSource type="POOLED">
                <property name="driver" value="${jdbc.driver}"></property>
                <property name="url" value="${jdbc.url}"></property>
                <property name="username" value="${jdbc.username}"></property>
                <property name="password" value="${jdbc.password}"></property>
            </dataSource>
        </environment>
    </environments>
    <!--映射文件扫描包路径-->
    <mappers>
        <package name="com.itheima.dao"></package>
    </mappers>
</configuration>
```

##### 步骤8:编写应用程序

```java
public class App {
    public static void main(String[] args) throws IOException {
        // 1. 创建SqlSessionFactoryBuilder对象
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        // 2. 加载SqlMapConfig.xml配置文件
        InputStream inputStream = Resources.getResourceAsStream("SqlMapConfig.xml.bak");
        // 3. 创建SqlSessionFactory对象
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(inputStream);
        // 4. 获取SqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession();
        // 5. 执行SqlSession对象执行查询，获取结果User
        AccountDao accountDao = sqlSession.getMapper(AccountDao.class);

        Account ac = accountDao.findById(1);
        System.out.println(ac);

        // 6. 释放资源
        sqlSession.close();
    }
}
```

##### 步骤9:运行程序

![1630136904087](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/1630136904087.png)

#### 6.1.2 整合思路分析

Mybatis的基础环境我们已经准备好了，接下来就得分析下在上述的内容中，哪些对象可以交给Spring来管理?

* Mybatis程序核心对象分析

  ![1630137189480](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/1630137189480.png)

  从图中可以获取到，真正需要交给Spring管理的是==SqlSessionFactory==

* 整合Mybatis，就是将Mybatis用到的内容交给Spring管理，分析下配置文件

  ![1630137388717](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/1630137388717.png)

  **说明:**

  * 第一行读取外部properties配置文件，Spring有提供具体的解决方案`@PropertySource`,需要交给Spring
  * 第二行起别名包扫描，为SqlSessionFactory服务的，需要交给Spring
  * 第三行主要用于做连接池，Spring之前我们已经整合了Druid连接池，这块也需要交给Spring
  * 前面三行一起都是为了创建SqlSession对象用的，那么用Spring管理SqlSession对象吗?回忆下SqlSession是由SqlSessionFactory创建出来的，所以只需要将SqlSessionFactory交给Spring管理即可。
  * 第四行是Mapper接口和映射文件[如果使用注解就没有该映射文件]，这个是在获取到SqlSession以后执行具体操作的时候用，所以它和SqlSessionFactory创建的时机都不在同一个时间，可能需要单独管理。

### Spring整合Mybatis

前面我们已经分析了Spring与Mybatis的整合，大体需要做两件事，

第一件事是:Spring要管理MyBatis中的SqlSessionFactory

第二件事是:Spring要管理Mapper接口的扫描

具体该如何实现，具体的步骤为:

#### 步骤1:项目中导入整合需要的jar包

```xml
<dependency>
    <!--Spring操作数据库需要该jar包-->
    <groupId>org.springframework</groupId>
    <artifactId>spring-jdbc</artifactId>
    <version>5.2.10.RELEASE</version>
</dependency>
<dependency>
    <!--
		Spring与Mybatis整合的jar包
		这个jar包mybatis在前面，是Mybatis提供的
	-->
    <groupId>org.mybatis</groupId>
    <artifactId>mybatis-spring</artifactId>
    <version>1.3.0</version>
</dependency>
```

#### 步骤2:创建Spring的主配置类

```java
//配置类注解
@Configuration
//包扫描，主要扫描的是项目中的AccountServiceImpl类
@ComponentScan("com.itheima")
public class SpringConfig {
}

```

#### 步骤3:创建数据源的配置类

在配置类中完成数据源的创建

```java
public class JdbcConfig {
    @Value("${jdbc.driver}")
    private String driver;
    @Value("${jdbc.url}")
    private String url;
    @Value("${jdbc.username}")
    private String userName;
    @Value("${jdbc.password}")
    private String password;

    @Bean
    public DataSource dataSource(){
        DruidDataSource ds = new DruidDataSource();
        ds.setDriverClassName(driver);
        ds.setUrl(url);
        ds.setUsername(userName);
        ds.setPassword(password);
        return ds;
    }
}
```

#### 步骤4:主配置类中读properties并引入数据源配置类

```java
@Configuration
@ComponentScan("com.itheima")
@PropertySource("classpath:jdbc.properties")
@Import(JdbcConfig.class)
public class SpringConfig {
}

```

#### 步骤5:创建Mybatis配置类并配置SqlSessionFactory

```java
public class MybatisConfig {
    //定义bean，SqlSessionFactoryBean，用于产生SqlSessionFactory对象
    @Bean
    public SqlSessionFactoryBean sqlSessionFactory(DataSource dataSource){
        SqlSessionFactoryBean ssfb = new SqlSessionFactoryBean();
        //设置模型类的别名扫描
        ssfb.setTypeAliasesPackage("com.itheima.domain");
        //设置数据源
        ssfb.setDataSource(dataSource);
        return ssfb;
    }
    //定义bean，返回MapperScannerConfigurer对象
    @Bean
    public MapperScannerConfigurer mapperScannerConfigurer(){
        MapperScannerConfigurer msc = new MapperScannerConfigurer();
        msc.setBasePackage("com.itheima.dao");
        return msc;
    }
}
```

**说明:**

* 使用SqlSessionFactoryBean封装SqlSessionFactory需要的环境信息

  ![1630138835057](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/1630138835057.png)

  * SqlSessionFactoryBean是前面我们讲解FactoryBean的一个子类，在该类中将SqlSessionFactory的创建进行了封装，简化对象的创建，我们只需要将其需要的内容设置即可。
  * 方法中有一个参数为dataSource,当前Spring容器中已经创建了Druid数据源，类型刚好是DataSource类型，此时在初始化SqlSessionFactoryBean这个对象的时候，发现需要使用DataSource对象，而容器中刚好有这么一个对象，就自动加载了DruidDataSource对象。

* 使用MapperScannerConfigurer加载Dao接口，创建代理对象保存到IOC容器中

  ![1630138916939](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/1630138916939.png)

  * 这个MapperScannerConfigurer对象也是MyBatis提供的专用于整合的jar包中的类，用来处理原始配置文件中的mappers相关配置，加载数据层的Mapper接口类
  * MapperScannerConfigurer有一个核心属性basePackage，就是用来设置所扫描的包路径

#### 步骤6:主配置类中引入Mybatis配置类

```java
@Configuration
@ComponentScan("com.itheima")
@PropertySource("classpath:jdbc.properties")
@Import({JdbcConfig.class,MybatisConfig.class})
public class SpringConfig {
}
```

#### 步骤7:编写运行类

在运行类中，从IOC容器中获取Service对象，调用方法获取结果

```java
public class App2 {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);

        AccountService accountService = ctx.getBean(AccountService.class);

        Account ac = accountService.findById(1);
        System.out.println(ac);
    }
}

```

#### 步骤8:运行程序

![1630139036627](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/1630139036627.png)

支持Spring与Mybatis的整合就已经完成了，其中主要用到的两个类分别是:

* ==SqlSessionFactoryBean==
* ==MapperScannerConfigurer==



## SpringMVC

### SpringMVC概述

针对web层进行了优化，采用了MVC设计模式，将其设计为`controller`、`view`和`Model`

* controller负责请求和数据的接收，接收后将其转发给service进行业务处理
* service根据需要会调用dao对数据进行增删改查
* dao把数据处理完后将结果交给service,service再交给controller
* controller根据需求组装成Model和View,Model和View组合起来生成页面转发给前端浏览器
* 这样做的好处就是controller可以处理多个请求，并对请求进行分发，执行不同的业务操作。

SpringMVC==主要==负责的就是

* controller如何接收请求和数据
* 如何将请求和数据转发给业务层
* 如何将响应数据转换成json发回到前端

<img src="https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240414182623066.png" alt="image-20240414182623066" style="zoom: 67%;" /> 

介绍了这么多，对SpringMVC进行一个**定义**:

* S**pringMVC是一种基于Java实现MVC模型的轻量级Web框架**

* 优点

  * **使用简单、开发便捷**(相比于Servlet)
  * 灵活性强

### SpringMVC入门案例

**SpringMVC的具体的实现流程:**

1.创建web工程(Maven结构)

2.设置tomcat服务器，加载web工程(tomcat插件)

3.导入坐标(==SpringMVC==+Servlet)

4.定义处理请求的功能类(==UserController==)

5.==设置请求映射(配置映射关系)==

6.==将SpringMVC设定加载到Tomcat容器中==

#### 步骤1:创建Maven项目

打开IDEA,创建一个新的web项目

![image-20240414183044859](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240414183044859.png) 

#### 步骤2:补全目录结构

因为使用骨架创建的项目结构不完整，需要手动补全,**这里新建的java文件夹是源码目录**

![image-20240414183218976](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240414183218976.png) 

#### 步骤3:导入jar包

将pom.xml中多余的内容删除掉，再添加SpringMVC需要的依赖

~~~xml
  <dependencies>
    <dependency>
      <groupId>javax.servlet</groupId>
      <artifactId>javax.servlet-api</artifactId>
      <version>3.1.0</version>
      <scope>provided</scope>
    </dependency>
    <dependency>
      <groupId>org.springframework</groupId>
      <artifactId>spring-webmvc</artifactId>
      <version>5.2.10.RELEASE</version>
    </dependency>
  </dependencies>

  <build>
    <plugins>
      <plugin>
        <groupId>org.apache.tomcat.maven</groupId>
        <artifactId>tomcat7-maven-plugin</artifactId>
        <version>2.1</version>
        <configuration>
          <port>80</port>
          <path>/</path>
        </configuration>
      </plugin>
    </plugins>
  </build>

~~~

**说明:**servlet的坐标为什么需要添加`<scope>provided</scope>`?

* scope是maven中jar包依赖作用范围的描述，
* 如果不设置默认是`compile`在在编译、运行、测试时均有效
* 如果运行有效的话就会和tomcat中的servlet-api包发生冲突，导致启动报错

* provided代表的是该包只在编译和测试的时候用，运行的时候无效直接使用tomcat中的，就避免冲突

#### 步骤4:创建配置类

```java
@Configuration
@ComponentScan("com.itheima.controller")
public class SpringMvcConfig {
}
```

#### 步骤5:创建Controller类

```java
@Controller
public class UserController {
    
    @RequestMapping("/save")
    public String save(){
        System.out.println("user save ...");
    }
}

```

#### 步骤6:使用配置类替换web.xml

**将web.xml删除，换成ServletContainersInitConfig**

![image-20240414183647219](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240414183647219.png) 

~~~java
public class ServletContainersInitConfig extends AbstractDispatcherServletInitializer {
    //加载springmvc配置类
    protected WebApplicationContext createServletApplicationContext() {
        //初始化WebApplicationContext对象
        AnnotationConfigWebApplicationContext ctx = new AnnotationConfigWebApplicationContext();
        //加载指定配置类
        ctx.register(SpringMvcConfig.class);
        return ctx;
    }

    //设置由springmvc控制器处理的请求映射路径
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }

    //加载spring配置类
    protected WebApplicationContext createRootApplicationContext() {
        return null;
    }
}
~~~

#### 步骤7:配置Tomcat环境

![image-20240414184508268](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240414184508268.png)

#### 入门案例总结

* SpringMVC是基于Spring的，在pom.xml只导入了`spring-webmvc`jar包的原因是它会自动依赖spring相关坐标
* **AbstractDispatcherServletInitializer类是SpringMVC提供的快速初始化Web3.0容器的抽象类**
* AbstractDispatcherServletInitializer提供了三个接口方法供用户实现
  * createServletApplicationContext方法，创建Servlet容器时，加载SpringMVC对应的bean并放入WebApplicationContext对象范围中，而WebApplicationContext的作用范围为ServletContext范围，即整个web容器范围
  * getServletMappings方法，设定SpringMVC对应的请求映射路径，即SpringMVC拦截哪些请求
  * createRootApplicationContext方法，如果创建Servlet容器时需要加载非SpringMVC对应的bean,使用当前方法进行，使用方式和createServletApplicationContext相同。
  * **createServletApplicationContext用来加载SpringMVC环境**
  * **createRootApplicationContext用来加载Spring环境**

- 一次性工作
  - 创建工程，设置服务器，加载工程
  - 导入坐标
  - 创建web容器启动类，加载SpringMVC配置，并设置SpringMVC请求拦截路径
  - SpringMVC核心配置类（设置配置类，扫描controller包，加载Controller控制器bean）
- 多次工作
  - 定义处理请求的控制器类
  - 定义处理请求的控制器方法，并配置映射路径（@RequestMapping）与返回json数据（@ResponseBody）

### 工作流程解析

为了更好的使用SpringMVC,我们将SpringMVC的使用过程总共分两个阶段来分析，分别是`启动服务器初始化过程`和`单次请求过程`

<img src="https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240414185100500.png" alt="image-20240414185100500" style="zoom:67%;" /> 

#### 启动服务器初始化过程

1. 服务器启动，执行ServletContainersInitConfig类，初始化web容器

   * 功能类似于以前的web.xml

2. 执行createServletApplicationContext方法，创建了WebApplicationContext对象

   * 该方法加载SpringMVC的配置类SpringMvcConfig来初始化SpringMVC的容器

3. 加载SpringMvcConfig配置类

   ![1630433335744](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/1630433335744.png)

4. **执行@ComponentScan加载对应的bean**

   * 扫描指定包及其子包下所有类上的注解，如Controller类上的@Controller注解

5. 加载UserController，每个@RequestMapping的名称对应一个具体的方法

   ![1630433398932](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/1630433398932.png)

   * **此时就建立了 `/save` 和 save方法的对应关系**

6. 执行getServletMappings方法，**设定SpringMVC拦截请求的路径规则**

   ![1630433510528](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/1630433510528.png)

   * **`/`代表所拦截请求的路径规则，只有被拦截后才能交给SpringMVC来处理请求**

#### 单次请求过程

1. 发送请求`http://localhost/save`
2. **web容器发现该请求满足SpringMVC拦截规则，将请求交给SpringMVC处理**
3. 解析请求路径/save
4. 由/save匹配执行对应的方法save(）
   * 上面的第五步已经将请求路径和方法建立了对应关系，通过/save就能找到对应的save方法
5. 执行save()
6. **检测到有@ResponseBody直接将save()方法的返回值作为响应体返回给请求方**

### bean加载控制

#### 问题分析

入门案例的内容已经做完了，在入门案例中我们创建过一个`SpringMvcConfig`的配置类，再回想前面咱们学习Spring的时候也创建过一个配置类`SpringConfig`。**这两个配置类都需要加载资源**，那么它们分别都需要加载哪些内容?

我们先来看下目前我们的项目目录结构:

<img src="https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/1630459727575.png" alt="1630459727575" style="zoom:67%;" /> 

* config目录存入的是配置类,写过的配置类有:

  * ServletContainersInitConfig
  * SpringConfig
  * SpringMvcConfig
  * JdbcConfig
  * MybatisConfig

* controller目录存放的是SpringMVC的controller类
* service目录存放的是service接口和实现类
* dao目录存放的是dao/Mapper接口

controller、service和dao这些类都需要被容器管理成bean对象，那么到底是该让SpringMVC加载还是让Spring加载呢?

* **SpringMVC加载其相关bean(表现层bean),也就是controller包下的类**
* **Spring控制的bean**
  * **业务bean(Service)**
  * **功能bean(DataSource,SqlSessionFactoryBean,MapperScannerConfigurer等)**

分析清楚谁该管哪些bean以后，接下来要解决的问题是如何让Spring和SpringMVC分开加载各自的内容。

在SpringMVC的配置类`SpringMvcConfig`中使用注解`@ComponentScan`，我们只需要将其扫描范围设置到controller即可，如

![1630460319004](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/1630460319004.png)

在Spring的配置类`SpringConfig`中使用注解`@ComponentScan`,当时扫描的范围中其实是已经包含了controller,如:

![1630460408159](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/1630460408159.png)

从包结构来看的话，Spring已经多把SpringMVC的controller类也给扫描到，所以针对这个问题该如何解决，就是咱们接下来要学习的内容。

概括的描述下咱们现在的问题就是==因为功能不同，如何避免Spring错误加载到SpringMVC的bean?==

#### 思路分析

针对上面的问题，解决方案也比较简单，就是:

* 加载Spring控制的bean的时候排除掉SpringMVC控制的bean

具体该如何排除：

* 方式一:Spring加载的bean设定扫描范围为精准范围，例如service包、dao包等
* **方式二:Spring加载的bean设定扫描范围为com.itheima,排除掉controller包中的bean**
* 方式三:不区分Spring与SpringMVC的环境，加载到同一个环境中[了解即可]

#### 设置bean加载控制

**方式二:修改Spring配置类，设定扫描范围为com.itheima,排除掉controller包中的bean**

```java
@Configuration
@ComponentScan(value="com.itheima",
    excludeFilters=@ComponentScan.Filter(
    	type = FilterType.ANNOTATION,
        classes = Controller.class
    )
)
public class SpringConfig {
}
```

* **excludeFilters属性：设置扫描加载bean时，排除的过滤规则**

* **type属性：**设置排除规则，当前使用按照bean定义时的注解类型进行排除

  * **ANNOTATION：按照注解排除**
  * ASSIGNABLE_TYPE:按照指定的类型过滤
  * ASPECTJ:按照Aspectj表达式排除，基本上不会用
  * REGEX:按照正则表达式排除
  * CUSTOM:按照自定义规则排除

  **大家只需要知道第一种ANNOTATION即可**

* **classes属性：设置排除的具体注解类，当前设置排除@Controller定义的bean**

==注意:测试的时候，需要把SpringMvcConfig配置类上的@ComponentScan注解注释掉，否则不会报错==

出现问题的原因是，

* Spring配置类扫描的包是`com.itheima`
* **SpringMVC的配置类，`SpringMvcConfig`上有一个@Configuration注解，也会被Spring扫描到**
* SpringMvcConfig上又有一个@ComponentScan，把controller类又给扫描进来了
* 所以如果不把@ComponentScan注释掉，Spring配置类将Controller排除，但是因为扫描到SpringMVC的配置类，又将其加载回来，演示的效果就出不来
* 解决方案，也简单，把SpringMVC的配置类移出Spring配置类的扫描范围即可。

#### 简化ServletContainersInitConfig

最后一个问题，有了Spring的配置类，要想在tomcat服务器启动将其加载，我们需要修改ServletContainersInitConfig

```java
public class ServletContainersInitConfig extends AbstractDispatcherServletInitializer {
    protected WebApplicationContext createServletApplicationContext() {
        AnnotationConfigWebApplicationContext ctx = new AnnotationConfigWebApplicationContext();
        ctx.register(SpringMvcConfig.class);
        return ctx;
    }
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
    protected WebApplicationContext createRootApplicationContext() {
      AnnotationConfigWebApplicationContext ctx = new AnnotationConfigWebApplicationContext();
        ctx.register(SpringConfig.class);
        return ctx;
    }
}
```

**对于上述的配置方式，Spring还提供了一种更简单的配置方式，可以不用再去创建**`AnnotationConfigWebApplicationContext`对象，不用手动`register`对应的配置类，如何实现?

```java
public class ServletContainersInitConfig extends AbstractAnnotationConfigDispatcherServletInitializer {

    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{SpringConfig.class};
    }

    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{SpringMvcConfig.class};
    }

    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}
```

### PostMan工具

代码编写完后，我们要想测试，只需要打开浏览器直接输入地址发送请求即可。发送的是`GET`请求可以直接使用浏览器，但是如果要发送的是`POST`请求呢?

如果要求发送的是post请求，我们就得准备页面在页面上准备form表单，测试起来比较麻烦。所以我们就需要借助一些第三方工具，如PostMan.

* PostMan是一款功能强大的网页调试与发送网页HTTP请求的Chrome插件。![1630463382386](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/1630463382386.png)
* 作用：常用于进行接口测试

* 特征
  * 简单
  * 实用
  * 美观
  * 大方

###  请求与响应

前面我们已经完成了入门案例相关的知识学习，接来了我们就需要针对SpringMVC相关的知识点进行系统的学习，之前我们提到过，SpringMVC是web层的框架，主要的作用是接收请求、接收数据、响应结果，所以这一章节是学习SpringMVC的==重点==内容，我们主要会讲解四部分内容:

* 请求映射路径
* 请求参数
* 日期类型参数传递
* 响应json数据

#### 请求映射路径

##### 问题分析

团队多人开发，每人设置不同的请求路径，冲突问题该如何解决?

解决思路:为不同模块设置模块名作为请求路径前置

**对于Book模块的save,将其访问路径设置`http://localhost/book/save`**

**对于User模块的save,将其访问路径设置`http://localhost/user/save`**

这样在同一个模块中出现命名冲突的情况就比较少了。

##### 步骤1:修改Controller

```java
@Controller
public class UserController {

    @RequestMapping("/user/save")
    @ResponseBody
    public String save(){
        System.out.println("user save ...");
        return "{'module':'user save'}";
    }
    
    @RequestMapping("/user/delete")
    @ResponseBody
    public String save(){
        System.out.println("user delete ...");
        return "{'module':'user delete'}";
    }
}

@Controller
public class BookController {

    @RequestMapping("/book/save")
    @ResponseBody
    public String save(){
        System.out.println("book save ...");
        return "{'module':'book save'}";
    }
}
```

问题是解决了，但是每个方法前面都需要进行修改，写起来比较麻烦而且还有很多重复代码，如果/user后期发生变化，所有的方法都需要改，耦合度太高。

##### 步骤2:优化路径配置

优化方案:

```java
@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/save")
    @ResponseBody
    public String save(){
        System.out.println("user save ...");
        return "{'module':'user save'}";
    }
    
    @RequestMapping("/delete")
    @ResponseBody
    public String save(){
        System.out.println("user delete ...");
        return "{'module':'user delete'}";
    }
}

@Controller
@RequestMapping("/book")
public class BookController {

    @RequestMapping("/save")
    @ResponseBody
    public String save(){
        System.out.println("book save ...");
        return "{'module':'book save'}";
    }
}
```

**注意:**

* **当类上和方法上都添加了`@RequestMapping`注解，前端发送请求的时候，要和两个注解的value值相加匹配才能访问到。**
* @RequestMapping注解value属性前面加不加`/`都可以

#### 请求参数

请求路径设置好后，只要确保页面发送请求地址和后台Controller类中配置的路径一致，就可以接收到前端的请求，接收到请求后，如何接收页面传递的参数?

关于请求参数的传递与接收是和请求方式有关系的，目前比较常见的两种请求方式为：

* GET
* POST

针对于不同的请求前端如何发送，后端如何接收?

##### GET发送单个参数

发送请求与参数:

```
http://localhost/commonParam?name=itcast
```

![1630467921300](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/1630467921300.png)

接收参数：

```java
@Controller
public class UserController {

    @RequestMapping("/commonParam")
    @ResponseBody
    public String commonParam(String name){
        System.out.println("普通参数传递 name ==> "+name);
        return "{'module':'commonParam'}";
    }
}
```

##### GET发送多个参数

发送请求与参数:

```
http://localhost/commonParam?name=itcast&age=15
```

![1630468045733](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/1630468045733.png)

接收参数：

```java
@Controller
public class UserController {

    @RequestMapping("/commonParam")
    @ResponseBody
    public String commonParam(String name,int age){
        System.out.println("普通参数传递 name ==> "+name);
        System.out.println("普通参数传递 age ==> "+age);
        return "{'module':'commonParam'}";
    }
}
```

##### GET请求中文乱码

如果我们传递的参数中有中文，你会发现接收到的参数会出现中文乱码问题。

发送请求:`http://localhost/commonParam?name=张三&age=18`

控制台:

![1630480536510](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/1630480536510.png)

出现乱码的原因相信大家都清楚，Tomcat8.5以后的版本已经处理了中文乱码的问题，但是IDEA中的Tomcat插件目前只到Tomcat7，所以需要修改pom.xml来解决GET请求中文乱码问题

```xml
<build>
    <plugins>
      <plugin>
        <groupId>org.apache.tomcat.maven</groupId>
        <artifactId>tomcat7-maven-plugin</artifactId>
        <version>2.1</version>
        <configuration>
          <port>80</port><!--tomcat端口号-->
          <path>/</path> <!--虚拟目录-->
          <uriEncoding>UTF-8</uriEncoding><!--访问路径编解码字符集-->
        </configuration>
      </plugin>
    </plugins>
  </build>
```

##### POST发送参数

发送请求与参数:

![1630480812809](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/1630480812809.png)接收参数：

和GET一致，不用做任何修改

```java
@Controller
public class UserController {

    @RequestMapping("/commonParam")
    @ResponseBody
    public String commonParam(String name,int age){
        System.out.println("普通参数传递 name ==> "+name);
        System.out.println("普通参数传递 age ==> "+age);
        return "{'module':'commonParam'}";
    }
}
```

##### POST请求中文乱码

发送请求与参数:

![1630480964421](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/1630480964421.png)

接收参数:

控制台打印，会发现有中文乱码问题。

![1630481008109](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/1630481008109.png)

**解决方案:配置过滤器**

```java
public class ServletContainersInitConfig extends AbstractAnnotationConfigDispatcherServletInitializer {
    protected Class<?>[] getRootConfigClasses() {
        return new Class[0];
    }

    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{SpringMvcConfig.class};
    }

    protected String[] getServletMappings() {
        return new String[]{"/"};
    }

    //乱码处理
    @Override
    protected Filter[] getServletFilters() {
        CharacterEncodingFilter filter = new CharacterEncodingFilter();
        filter.setEncoding("UTF-8");
        return new Filter[]{filter};
    }
}
```

CharacterEncodingFilter是在spring-web包中，所以用之前需要导入对应的jar包。

#### 五种类型参数传递

前面我们已经能够使用GET或POST来发送请求和数据，所携带的数据都是比较简单的数据，接下来在这个基础上，我们来研究一些比较复杂的参数传递，常见的参数种类有:

* 普通参数
* POJO类型参数
* 嵌套POJO类型参数
* 数组类型参数
* 集合类型参数

这些参数如何发送，后台改如何接收?我们一个个来学习。

##### 普通参数

* 普通参数:url地址传参，地址参数名与形参变量名相同，定义形参即可接收参数。

![1630481585729](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/1630481585729.png)

**如果形参与地址参数名不一致该如何解决?**

发送请求与参数:

```
http://localhost/commonParamDifferentName?name=张三&age=18
```

后台接收参数:

```java
@RequestMapping("/commonParamDifferentName")
@ResponseBody
public String commonParamDifferentName(String userName , int age){
    System.out.println("普通参数传递 userName ==> "+userName);
    System.out.println("普通参数传递 age ==> "+age);
    return "{'module':'common param different name'}";
}
```

因为前端给的是`name`,后台接收使用的是`userName`,两个名称对不上，导致接收数据失败:

![1630481772035](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/1630481772035.png)

**解决方案:使用@RequestParam注解**

```java
@RequestMapping("/commonParamDifferentName")
    @ResponseBody
    public String commonParamDifferentName(@RequestPaam("name") String userName , int age){
        System.out.println("普通参数传递 userName ==> "+userName);
        System.out.println("普通参数传递 age ==> "+age);
        return "{'module':'common param different name'}";
    }
```

**注意:写上@RequestParam注解框架就不需要自己去解析注入，能提升框架处理性能**

##### POJO数据类型

简单数据类型一般处理的是参数个数比较少的请求，如果参数比较多，那么后台接收参数的时候就比较复杂，这个时候我们可以考虑使用POJO数据类型。

* POJO参数：请求参数名与形参对象属性名相同，定义POJO类型形参即可接收参数

此时需要使用前面准备好的POJO类，先来看下User

```java
public class User {
    private String name;
    private int age;
    //setter...getter...和toString方法必须写
}
```

发送请求和参数:

![1630482186745](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/1630482186745.png)

后台接收参数:

```java
//POJO参数：请求参数与形参对象中的属性对应即可完成参数传递
@RequestMapping("/pojoParam")
@ResponseBody
public String pojoParam(User user){
    System.out.println("pojo参数传递 user ==> "+user);
    return "{'module':'pojo param'}";
}
```

**注意:**

* POJO参数接收，前端GET和POST发送请求数据的方式不变。
* ==请求参数key的名称要和POJO中属性的名称一致，否则无法封装。==

##### 嵌套POJO类型参数

如果POJO对象中嵌套了其他的POJO类，如

```java
public class Address {
    private String province;
    private String city;
    //setter...getter...略
}
public class User {
    private String name;
    private int age;
    private Address address;
    //setter...getter...略
}
```

* 嵌套POJO参数：请求参数名与形参对象属性名相同，按照对象层次结构关系即可接收嵌套POJO属性参数

发送请求和参数:

![1630482363291](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/1630482363291.png)

后台接收参数:

```java
//POJO参数：请求参数与形参对象中的属性对应即可完成参数传递
@RequestMapping("/pojoParam")
@ResponseBody
public String pojoParam(User user){
    System.out.println("pojo参数传递 user ==> "+user);
    return "{'module':'pojo param'}";
}
```

**注意:**

==请求参数key的名称要和POJO中属性的名称一致，否则无法封装==

##### 数组类型参数

举个简单的例子，如果前端需要获取用户的爱好，爱好绝大多数情况下都是多个，如何发送请求数据和接收数据呢?

* 数组参数：请求参数名与形参对象属性名相同且请求参数为多个，定义数组类型即可接收参数

发送请求和参数:

![1630482999626](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/1630482999626.png)

后台接收参数:

```java
  //数组参数：同名请求参数可以直接映射到对应名称的形参数组对象中
    @RequestMapping("/arrayParam")
    @ResponseBody
    public String arrayParam(String[] likes){
        System.out.println("数组参数传递 likes ==> "+ Arrays.toString(likes));
        return "{'module':'array param'}";
    }
```

##### 集合类型参数

数组能接收多个值，那么集合是否也可以实现这个功能呢?

发送请求和参数:

![1630484283773](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/1630484283773.png)

后台接收参数:

```java
//集合参数：同名请求参数可以使用@RequestParam注解映射到对应名称的集合对象中作为数据
@RequestMapping("/listParam")
@ResponseBody
public String listParam(List<String> likes){
    System.out.println("集合参数传递 likes ==> "+ likes);
    return "{'module':'list param'}";
}
```

运行会报错，

![1630484339065](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/1630484339065.png)

**错误的原因是:SpringMVC将List看做是一个POJO对象来处理，将其创建一个对象并准备把前端的数据封装到对象中，但是List是一个接口无法创建对象，所以报错。**

解决方案是:使用`@RequestParam`注解

```java
//集合参数：同名请求参数可以使用@RequestParam注解映射到对应名称的集合对象中作为数据
@RequestMapping("/listParam")
@ResponseBody
public String listParam(@RequestParam List<String> likes){
    System.out.println("集合参数传递 likes ==> "+ likes);
    return "{'module':'list param'}";
}
```

* 集合保存普通参数：请求参数名与形参集合对象名相同且请求参数为多个，@RequestParam绑定参数关系
* 对于简单数据类型使用数组会比集合更简单些。

#### JSON数据传输参数

前面我们说过，现在比较流行的开发方式为异步调用。前后台以异步方式进行交换，传输的数据使用的是==JSON==,所以前端如果发送的是JSON数据，后端该如何接收?

对于JSON数据类型，我们常见的有三种:

- json普通数组（["value1","value2","value3",...]）
- json对象（{key1:value1,key2:value2,...}）
- json对象数组（[{key1:value1,...},{key2:value2,...}]）

对于上述数据，前端如何发送，后端如何接收?

##### JSON普通数组

###### 步骤1:pom.xml添加依赖

SpringMVC默认使用的是jackson来处理json的转换，所以需要在pom.xml添加jackson依赖

```xml
<dependency>
    <groupId>com.fasterxml.jackson.core</groupId>
    <artifactId>jackson-databind</artifactId>
    <version>2.9.0</version>
</dependency>
```

###### 步骤2:PostMan发送JSON数据

![1630485135061](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/1630485135061.png)

###### 步骤3:开启SpringMVC注解支持

在SpringMVC的配置类中开启SpringMVC的注解支持，这里面就包含了将JSON转换成对象的功能。

```java
@Configuration
@ComponentScan("com.itheima.controller")
//开启json数据类型自动转换
@EnableWebMvc
public class SpringMvcConfig {
}
```

###### 步骤4:参数前添加@RequestBody

```java
//使用@RequestBody注解将外部传递的json数组数据映射到形参的集合对象中作为数据
@RequestMapping("/listParamForJson")
@ResponseBody
public String listParamForJson(@RequestBody List<String> likes){
    System.out.println("list common(json)参数传递 list ==> "+likes);
    return "{'module':'list common for json param'}";
}
```

###### 步骤5:启动运行程序

![1630492624684](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/1630492624684.png)

JSON普通数组的数据就已经传递完成，下面针对JSON对象数据和JSON对象数组的数据该如何传递呢?

##### JSON对象数据

我们会发现，只需要关注请求和数据如何发送?后端数据如何接收?

请求和数据的发送:

```json
{
	"name":"itcast",
	"age":15
}
```

![1630493105450](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/1630493105450.png)

后端接收数据：

```java
@RequestMapping("/pojoParamForJson")
@ResponseBody
public String pojoParamForJson(@RequestBody User user){
    System.out.println("pojo(json)参数传递 user ==> "+user);
    return "{'module':'pojo for json param'}";
}
```

启动程序访问测试

![1630493233550](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/1630493233550.png)

**说明:**

address为null的原因是前端没有传递数据给后端。

如果想要address也有数据，我们需求修改前端传递的数据内容:

```json
{
	"name":"itcast",
	"age":15,
    "address":{
        "province":"beijing",
        "city":"beijing"
    }
}
```

再次发送请求，就能看到address中的数据

![1630493450694](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/1630493450694.png)

##### JSON对象数组

集合中保存多个POJO该如何实现?

请求和数据的发送:

```json
[
    {"name":"itcast","age":15},
    {"name":"itheima","age":12}
]
```

 ![1630493501205](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/1630493501205.png)

后端接收数据:

```java
@RequestMapping("/listPojoParamForJson")
@ResponseBody
public String listPojoParamForJson(@RequestBody List<User> list){
    System.out.println("list pojo(json)参数传递 list ==> "+list);
    return "{'module':'list pojo for json param'}";
}
```

启动程序访问测试

![1630493561137](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/1630493561137.png)

##### JSON对象数组**小结**

SpringMVC接收JSON数据的实现步骤为:

(1)**导入jackson包**

(2)**使用PostMan发送JSON数据**

(3)开启SpringMVC注解驱动，**在配置类上添加@EnableWebMvc注解**

(4)**Controller方法的参数前添加@RequestBody注解**

#### 日期类型参数传递

前面我们处理过简单数据类型、POJO数据类型、数组和集合数据类型以及JSON数据类型，接下来我们还得处理一种开发中比较常见的一种数据类型，`日期类型`

日期类型比较特殊，因为对于日期的格式有N多中输入方式，比如:

* 2088-08-18
* 2088/08/18
* 08/18/2088
* ......

针对这么多日期格式，SpringMVC该如何接收，它能很好的处理日期类型数据么?

##### 步骤1:编写方法接收日期数据

在UserController类中添加方法，把参数设置为日期类型

```java
@RequestMapping("/dataParam")
@ResponseBody
public String dataParam(Date date)
    System.out.println("参数传递 date ==> "+date);
    return "{'module':'data param'}";
}
```

##### 步骤2:启动Tomcat服务器

查看控制台是否报错，如果有错误，先解决错误。

##### 步骤3:使用PostMan发送请求

使用PostMan发送GET请求，并设置date参数

`http://localhost/dataParam?date=2088/08/08`

![1630494320917](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/1630494320917.png)

##### 步骤4:查看控制台

![1630494443738](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/1630494443738.png)

通过打印，我们发现SpringMVC可以接收日期数据类型，并将其打印在控制台。

这个时候，我们就想如果把日期参数的格式改成其他的，SpringMVC还能处理么?

##### 步骤5:更换日期格式

为了能更好的看到程序运行的结果，我们在方法中多添加一个日期参数

```java
@RequestMapping("/dataParam")
@ResponseBody
public String dataParam(Date date,Date date1)
    System.out.println("参数传递 date ==> "+date);
    return "{'module':'data param'}";
}
```

使用PostMan发送请求，携带两个不同的日期格式，

`http://localhost/dataParam?date=2088/08/08&date1=2088-08-08`

![1630494565970](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/1630494565970.png)

发送请求和数据后，页面会报400，控制台会报出一个错误

Resolved [org.springframework.web.method.annotation.==MethodArgumentTypeMismatchException==: Failed to convert value of type 'java.lang.String' to required type 'java.util.Date'; nested exception is org.springframework.core.convert.==ConversionFailedException==: Failed to convert from type [java.lang.String] to type [java.util.Date] for value '2088-08-08'; nested exception is java.lang.IllegalArgumentException]

从错误信息可以看出，错误的原因是在将`2088-08-08`转换成日期类型的时候失败了，原因是SpringMVC默认支持的字符串转日期的格式为`yyyy/MM/dd`,而我们现在传递的不符合其默认格式，SpringMVC就无法进行格式转换，所以报错。

解决方案也比较简单，需要使用`@DateTimeFormat`

```java
@RequestMapping("/dataParam")
@ResponseBody
public String dataParam(Date date,
                        @DateTimeFormat(pattern="yyyy-MM-dd") Date date1)
    System.out.println("参数传递 date ==> "+date);
	System.out.println("参数传递 date1(yyyy-MM-dd) ==> "+date1);
    return "{'module':'data param'}";
}
```

重新启动服务器，重新发送请求测试，SpringMVC就可以正确的进行日期转换了

![1630495221038](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/1630495221038.png)

##### 步骤6:携带时间的日期

接下来我们再来发送一个携带时间的日期，看下SpringMVC该如何处理?

先修改UserController类，添加第三个参数

```java
@RequestMapping("/dataParam")
@ResponseBody
public String dataParam(Date date,
                        @DateTimeFormat(pattern="yyyy-MM-dd") Date date1,
                        @DateTimeFormat(pattern="yyyy/MM/dd HH:mm:ss") Date date2)
    System.out.println("参数传递 date ==> "+date);
	System.out.println("参数传递 date1(yyyy-MM-dd) ==> "+date1);
	System.out.println("参数传递 date2(yyyy/MM/dd HH:mm:ss) ==> "+date2);
    return "{'module':'data param'}";
}
```

使用PostMan发送请求，携带两个不同的日期格式，

`http://localhost/dataParam?date=2088/08/08&date1=2088-08-08&date2=2088/08/08 8:08:08`

![1630495347289](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/1630495347289.png)

重新启动服务器，重新发送请求测试，SpringMVC就可以将日期时间的数据进行转换

![image-20240414192255961](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240414192255961.png) 

##### 内部实现原理

讲解内部原理之前，我们需要先思考个问题:

* 前端传递字符串，后端使用日期Date接收
* 前端传递JSON数据，后端使用对象接收
* 前端传递字符串，后端使用Integer接收
* 后台需要的数据类型有很多中
* 在数据的传递过程中存在很多类型的转换

问:谁来做这个类型转换?

答:SpringMVC

问:SpringMVC是如何实现类型转换的?

答:SpringMVC中提供了很多类型转换接口和实现类

在框架中，有一些类型转换接口，其中有:

* (1) Converter接口

```java
/**
*	S: the source type
*	T: the target type
*/
public interface Converter<S, T> {
    @Nullable
    //该方法就是将从页面上接收的数据(S)转换成我们想要的数据类型(T)返回
    T convert(S source);
}
```

**注意:Converter所属的包为`org.springframework.core.convert.converter`**

Converter接口的实现类

![1630496385398](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/1630496385398.png)

框架中有提供很多对应Converter接口的实现类，用来实现不同数据类型之间的转换,如:

请求参数年龄数据（String→Integer）

日期格式转换（String → Date）

* (2) HttpMessageConverter接口

该接口是实现对象与JSON之间的转换工作

**==注意:SpringMVC的配置类把@EnableWebMvc当做标配配置上去，不要省略==**

#### 响应

SpringMVC接收到请求和数据后，进行一些了的处理，当然这个处理可以是转发给Service，Service层再调用Dao层完成的，不管怎样，处理完以后，都需要将结果告知给用户。

比如:根据用户ID查询用户信息、查询用户列表、新增用户等。

**对于响应，主要就包含两部分内容：**

* **响应页面**（了解）
* **响应数据**
  * **文本数据**（了解）
  * **json数据**

因为异步调用是目前常用的主流方式，所以我们需要更关注的就是如何返回JSON数据，对于其他只需要认识了解即可。

##### 响应JSON数据

###### 响应POJO对象

```java
@Controller
public class UserController {
    
    @RequestMapping("/toJsonPOJO")
    @ResponseBody
    public User toJsonPOJO(){
        System.out.println("返回json对象数据");
        User user = new User();
        user.setName("itcast");
        user.setAge(15);
        return user;
    }
    
}
```

返回值为实体类对象，设置返回值为实体类类型，即可实现返回对应对象的json数据，需要依赖==@ResponseBody==注解和==@EnableWebMvc==注解

重新启动服务器，访问`http://localhost/toJsonPOJO`

![1630497954896](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/1630497954896.png)

###### 响应POJO集合对象

```java
@Controller
public class UserController {
    
    @RequestMapping("/toJsonList")
    @ResponseBody
    public List<User> toJsonList(){
        System.out.println("返回json集合数据");
        User user1 = new User();
        user1.setName("传智播客");
        user1.setAge(15);

        User user2 = new User();
        user2.setName("黑马程序员");
        user2.setAge(12);

        List<User> userList = new ArrayList<User>();
        userList.add(user1);
        userList.add(user2);

        return userList;
    }
    
}

```

重新启动服务器，访问`http://localhost/toJsonList`

![1630498084047](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/1630498084047.png)

### Rest风格

对于Rest风格，我们需要学习的内容包括:

* REST简介
* REST入门案例
* REST快速开发
* 案例:基于RESTful页面数据交互

#### REST简介

* ==REST==（Representational State Transfer），表现形式状态转换,它是一种软件架构==风格==

  当我们想表示一个网络资源的时候，可以使用两种方式:

  * 传统风格资源描述形式
    * `http://localhost/user/getById?id=1` 查询id为1的用户信息
    * `http://localhost/user/saveUser` 保存用户信息
  * REST风格描述形式
    * `http://localhost/user/1` 
    * `http://localhost/user`

传统方式一般是一个请求url对应一种操作，这样做不仅麻烦，也不安全，因为会程序的人读取了你的请求url地址，就大概知道该url实现的是一个什么样的操作。

查看REST风格的描述，你会发现请求地址变的简单了，并且光看请求URL并不是很能猜出来该URL的具体功能

所以REST的优点有:

- 隐藏资源的访问行为，无法通过地址得知对资源是何种操作
- 书写简化

但是我们的问题也随之而来了，一个相同的url地址即可以是新增也可以是修改或者查询，那么到底我们该如何区分该请求到底是什么操作呢?

* 按照REST风格访问资源时使用==行为动作==区分对资源进行了何种操作
  * **`http://localhost/users`	查询全部用户信息 GET（查询）**
  * **`http://localhost/users/1`  查询指定用户信息 GET（查询）**
  * **`http://localhost/users`    添加用户信息    POST（新增/保存）**
  * **`http://localhost/users`    修改用户信息    PUT（修改/更新）**
  * **`http://localhost/users/1`  删除用户信息    DELETE（删除）**

请求的方式比较多，但是比较常用的就4种，分别是`GET`,`POST`,`PUT`,`DELETE`。

按照不同的请求方式代表不同的操作类型。

* **发送GET请求是用来做查询**
* **发送POST请求是用来做新增**
* **发送PUT请求是用来做修改**
* **发送DELETE请求是用来做删除**

但是==注意==:

* 上述行为是约定方式，约定不是规范，可以打破，所以称REST风格，而不是REST规范
  * REST提供了对应的架构方式，按照这种架构设计项目可以降低开发的复杂性，提高系统的可伸缩性
  * REST中规定GET/POST/PUT/DELETE针对的是查询/新增/修改/删除，但是我们如果非要用GET请求做删除，这点在程序上运行是可以实现的
  * 但是如果绝大多数人都遵循这种风格，你写的代码让别人读起来就有点莫名其妙了。
* 描述模块的名称通常使用复数，也就是加s的格式描述，表示此类资源，而非单个资源，例如:users、books、accounts......

清楚了什么是REST风格后，我们后期会经常提到一个概念叫`RESTful`，那什么又是RESTful呢?

* 根据REST风格对资源进行访问称为==RESTful==。

后期我们在进行开发的过程中，大多是都是遵从REST风格来访问我们的后台服务，所以可以说咱们以后都是基于RESTful来进行开发的。



#### REST入门

##### 新增

```java
@Controller
public class UserController {
	//设置当前请求方法为POST，表示REST风格中的添加操作
    @RequestMapping(value = "/users",method = RequestMethod.POST)
    @ResponseBody
    public String save() {
        System.out.println("user save...");
        return "{'module':'user save'}";
    }
}
```

* 将请求路径更改为`/users`

  * 访问该方法使用 POST: `http://localhost/users`

* 使用method属性限定该方法的访问方式为`POST`

  * 如果发送的不是POST请求，比如发送GET请求，则会报错

    ![1630505392070](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/1630505392070.png)

##### 删除

```java
@Controller
public class UserController {
    //设置当前请求方法为DELETE，表示REST风格中的删除操作
	@RequestMapping(value = "/users",method = RequestMethod.DELETE)
    @ResponseBody
    public String delete(Integer id) {
        System.out.println("user delete..." + id);
        return "{'module':'user delete'}";
    }
}
```

* 将请求路径更改为`/users`
  - 访问该方法使用 DELETE: `http://localhost/users`

访问成功，但是删除方法没有携带所要删除数据的id,所以针对RESTful的开发，如何携带数据参数?

###### 传递路径参数

前端发送请求的时候使用:`http://localhost/users/1`,路径中的`1`就是我们想要传递的参数。

后端获取参数，需要做如下修改:

* 修改@RequestMapping的value属性，将其中修改为`/users/{id}`，目的是和路径匹配
* **在方法的形参前添加@PathVariable注解**

```java
@Controller
public class UserController {
    //设置当前请求方法为DELETE，表示REST风格中的删除操作
	@RequestMapping(value = "/users/{id}",method = RequestMethod.DELETE)
    @ResponseBody
    public String delete(@PathVariable Integer id) {
        System.out.println("user delete..." + id);
        return "{'module':'user delete'}";
    }
}
```

**思考如下两个问题:**

(1)如果方法形参的名称和路径`{}`中的值不一致，该怎么办?

![1630506231379](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/1630506231379.png)

(2)如果有多个参数需要传递该如何编写?

前端发送请求的时候使用:`http://localhost/users/1/tom`,路径中的`1`和`tom`就是我们想要传递的两个参数。

后端获取参数，需要做如下修改:

```java
@Controller
public class UserController {
    //设置当前请求方法为DELETE，表示REST风格中的删除操作
	@RequestMapping(value = "/users/{id}/{name}",method = RequestMethod.DELETE)
    @ResponseBody
    public String delete(@PathVariable Integer id,@PathVariable String name) {
        System.out.println("user delete..." + id+","+name);
        return "{'module':'user delete'}";
    }
}
```

##### 修改

```java
@Controller
public class UserController {
    //设置当前请求方法为PUT，表示REST风格中的修改操作
    @RequestMapping(value = "/users",method = RequestMethod.PUT)
    @ResponseBody
    public String update(@RequestBody User user) {
        System.out.println("user update..." + user);
        return "{'module':'user update'}";
    }
}
```

- 将请求路径更改为`/users`

  - 访问该方法使用 PUT: `http://localhost/users`

- 访问并携带参数:

  ![1630506507096](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/1630506507096.png)

##### 根据ID查询

```java
@Controller
public class UserController {
    //设置当前请求方法为GET，表示REST风格中的查询操作
    @RequestMapping(value = "/users/{id}" ,method = RequestMethod.GET)
    @ResponseBody
    public String getById(@PathVariable Integer id){
        System.out.println("user getById..."+id);
        return "{'module':'user getById'}";
    }
}
```

将请求路径更改为`/users`

- 访问该方法使用 GET: `http://localhost/users/666`

##### 查询所有

```java
@Controller
public class UserController {
    //设置当前请求方法为GET，表示REST风格中的查询操作
    @RequestMapping(value = "/users" ,method = RequestMethod.GET)
    @ResponseBody
    public String getAll() {
        System.out.println("user getAll...");
        return "{'module':'user getAll'}";
    }
}
```

将请求路径更改为`/users`

- 访问该方法使用 GET: `http://localhost/users`

##### 入门**小结**

RESTful入门案例，我们需要学习的内容如下:

(1)设定Http请求动作(动词)

@RequestMapping(value="",==method== = RequestMethod.==POST|GET|PUT|DELETE==)

(2)设定请求参数(路径变量)

@RequestMapping(value="/users/=={id}==",method = RequestMethod.DELETE)

@ReponseBody

public String delete(==@PathVariable== Integer ==id==){

}

#### RESTful快速开发

做完了RESTful的开发，你会发现==好麻烦==，麻烦在哪?

![1630507339724](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/1630507339724.png)

问题1：每个方法的@RequestMapping注解中都定义了访问路径/books，重复性太高。

问题2：每个方法的@RequestMapping注解中都要使用method属性定义请求方式，重复性太高。

问题3：每个方法响应json都需要加上@ResponseBody注解，重复性太高。

对于上面所提的这三个问题，具体该如何解决?

```java
@RestController //@Controller + ReponseBody
@RequestMapping("/books")
public class BookController {
    
	//@RequestMapping(method = RequestMethod.POST)
    @PostMapping
    public String save(@RequestBody Book book){
        System.out.println("book save..." + book);
        return "{'module':'book save'}";
    }

    //@RequestMapping(value = "/{id}",method = RequestMethod.DELETE)
    @DeleteMapping("/{id}")
    public String delete(@PathVariable Integer id){
        System.out.println("book delete..." + id);
        return "{'module':'book delete'}";
    }

    //@RequestMapping(method = RequestMethod.PUT)
    @PutMapping
    public String update(@RequestBody Book book){
        System.out.println("book update..." + book);
        return "{'module':'book update'}";
    }

    //@RequestMapping(value = "/{id}",method = RequestMethod.GET)
    @GetMapping("/{id}")
    public String getById(@PathVariable Integer id){
        System.out.println("book getById..." + id);
        return "{'module':'book getById'}";
    }

    //@RequestMapping(method = RequestMethod.GET)
    @GetMapping
    public String getAll(){
        System.out.println("book getAll...");
        return "{'module':'book getAll'}";
    }
    
}
```

对于刚才的问题，我们都有对应的解决方案：

问题1：每个方法的@RequestMapping注解中都定义了访问路径/books，重复性太高。

```
将@RequestMapping提到类上面，用来定义所有方法共同的访问路径。
```

问题2：每个方法的@RequestMapping注解中都要使用method属性定义请求方式，重复性太高。

```
使用@GetMapping  @PostMapping  @PutMapping  @DeleteMapping代替
```

问题3：每个方法响应json都需要加上@ResponseBody注解，重复性太高。

```
1.将ResponseBody提到类上面，让所有的方法都有@ResponseBody的功能
2.使用@RestController注解替换@Controller与@ResponseBody注解，简化书写
```

### SSM整合

前面我们已经把`Mybatis`、`Spring`和`SpringMVC`三个框架进行了学习，今天主要的内容就是把这三个框架整合在一起完成我们的业务功能开发，具体如何来整合，我们一步步来学习。

#### 流程分析

(1) 创建工程

* 创建一个Maven的web工程
* pom.xml添加SSM需要的依赖jar包
* 编写Web项目的入口配置类，实现`AbstractAnnotationConfigDispatcherServletInitializer`重写以下方法
  * getRootConfigClasses()	：返回Spring的配置类->需要==SpringConfig==配置类
  * getServletConfigClasses() ：返回SpringMVC的配置类->需要==SpringMvcConfig==配置类
  * getServletMappings()      : 设置SpringMVC请求拦截路径规则
  * getServletFilters()       ：设置过滤器，解决POST请求中文乱码问题

(2)SSM整合[==重点是各个配置的编写==]

* SpringConfig
  * 标识该类为配置类 @Configuration
  * 扫描Service所在的包 @ComponentScan
  * 在Service层要管理事务 @EnableTransactionManagement
  * 读取外部的properties配置文件 @PropertySource
  * 整合Mybatis需要引入Mybatis相关配置类 @Import
    * 第三方数据源配置类 JdbcConfig
      * 构建DataSource数据源，DruidDataSouroce,需要注入数据库连接四要素， @Bean @Value
      * 构建平台事务管理器，DataSourceTransactionManager,@Bean
    * Mybatis配置类 MybatisConfig
      * 构建SqlSessionFactoryBean并设置别名扫描与数据源，@Bean
      * 构建MapperScannerConfigurer并设置DAO层的包扫描
* SpringMvcConfig
  * 标识该类为配置类 @Configuration
  * 扫描Controller所在的包 @ComponentScan
  * 开启SpringMVC注解支持 @EnableWebMvc

(3)功能模块[与具体的业务模块有关]

* 创建数据库表
* 根据数据库表创建对应的模型类
* 通过Dao层完成数据库表的增删改查(接口+自动代理)
* 编写Service层[Service接口+实现类]
  * @Service
  * @Transactional
  * 整合Junit对业务层进行单元测试
    * @RunWith
    * @ContextConfiguration
    * @Test
* 编写Controller层
  * 接收请求 @RequestMapping @GetMapping @PostMapping @PutMapping @DeleteMapping
  * 接收数据 简单、POJO、嵌套POJO、集合、数组、JSON数据类型
    * @RequestParam
    * @PathVariable
    * @RequestBody
  * 转发业务层 
    * @Autowired
  * 响应结果
    * @ResponseBody

#### 整合配置

掌握上述的知识点后，接下来，我们就可以按照上述的步骤一步步的来完成SSM的整合。

##### 步骤1：创建Maven的web项目

可以使用Maven的骨架创建

![1630561266760](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/1630561266760.png)

##### 步骤2:添加依赖

pom.xml添加SSM所需要的依赖jar包

```xml
<?xml version="1.0" encoding="UTF-8"?>

<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
  xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
  <modelVersion>4.0.0</modelVersion>

  <groupId>com.itheima</groupId>
  <artifactId>springmvc_08_ssm</artifactId>
  <version>1.0-SNAPSHOT</version>
  <packaging>war</packaging>

  <dependencies>
    <dependency>
      <groupId>org.springframework</groupId>
      <artifactId>spring-webmvc</artifactId>
      <version>5.2.10.RELEASE</version>
    </dependency>

    <dependency>
      <groupId>org.springframework</groupId>
      <artifactId>spring-jdbc</artifactId>
      <version>5.2.10.RELEASE</version>
    </dependency>

    <dependency>
      <groupId>org.springframework</groupId>
      <artifactId>spring-test</artifactId>
      <version>5.2.10.RELEASE</version>
    </dependency>

    <dependency>
      <groupId>org.mybatis</groupId>
      <artifactId>mybatis</artifactId>
      <version>3.5.6</version>
    </dependency>

    <dependency>
      <groupId>org.mybatis</groupId>
      <artifactId>mybatis-spring</artifactId>
      <version>1.3.0</version>
    </dependency>

    <dependency>
      <groupId>mysql</groupId>
      <artifactId>mysql-connector-java</artifactId>
      <version>5.1.47</version>
    </dependency>

    <dependency>
      <groupId>com.alibaba</groupId>
      <artifactId>druid</artifactId>
      <version>1.1.16</version>
    </dependency>

    <dependency>
      <groupId>junit</groupId>
      <artifactId>junit</artifactId>
      <version>4.12</version>
      <scope>test</scope>
    </dependency>

    <dependency>
      <groupId>javax.servlet</groupId>
      <artifactId>javax.servlet-api</artifactId>
      <version>3.1.0</version>
      <scope>provided</scope>
    </dependency>

    <dependency>
      <groupId>com.fasterxml.jackson.core</groupId>
      <artifactId>jackson-databind</artifactId>
      <version>2.9.0</version>
    </dependency>
  </dependencies>

  <build>
    <plugins>
      <plugin>
        <groupId>org.apache.tomcat.maven</groupId>
        <artifactId>tomcat7-maven-plugin</artifactId>
        <version>2.1</version>
        <configuration>
          <port>80</port>
          <path>/</path>
        </configuration>
      </plugin>
    </plugins>
  </build>
</project>


```

##### 步骤3:创建项目包结构

![1630561591931](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/1630561591931.png)

* config目录存放的是相关的配置类
* controller编写的是Controller类
* dao存放的是Dao接口，因为使用的是Mapper接口代理方式，所以没有实现类包
* service存的是Service接口，impl存放的是Service实现类
* resources:存入的是配置文件，如Jdbc.properties
* webapp:目录可以存放静态资源
* test/java:存放的是测试类

##### 步骤4:创建SpringConfig配置类

```java
@Configuration
@ComponentScan({"com.itheima.service"})
@PropertySource("classpath:jdbc.properties")
@Import({JdbcConfig.class,MyBatisConfig.class})
@EnableTransactionManagement
public class SpringConfig {
}
```

##### 步骤5:创建JdbcConfig配置类

```java
public class JdbcConfig {
    @Value("${jdbc.driver}")
    private String driver;
    @Value("${jdbc.url}")
    private String url;
    @Value("${jdbc.username}")
    private String username;
    @Value("${jdbc.password}")
    private String password;

    @Bean
    public DataSource dataSource(){
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName(driver);
        dataSource.setUrl(url);
        dataSource.setUsername(username);
        dataSource.setPassword(password);
        return dataSource;
    }

    @Bean
    public PlatformTransactionManager transactionManager(DataSource dataSource){
        DataSourceTransactionManager ds = new DataSourceTransactionManager();
        ds.setDataSource(dataSource);
        return ds;
    }
}
```

##### 步骤6:创建MybatisConfig配置类

```java
public class MyBatisConfig {
    @Bean
    public SqlSessionFactoryBean sqlSessionFactory(DataSource dataSource){
        SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
        factoryBean.setDataSource(dataSource);
        factoryBean.setTypeAliasesPackage("com.itheima.domain");
        return factoryBean;
    }

    @Bean
    public MapperScannerConfigurer mapperScannerConfigurer(){
        MapperScannerConfigurer msc = new MapperScannerConfigurer();
        msc.setBasePackage("com.itheima.dao");
        return msc;
    }
}
```

##### 步骤7:创建jdbc.properties

在resources下提供jdbc.properties,设置数据库连接四要素

```properties
jdbc.driver=com.mysql.jdbc.Driver
jdbc.url=jdbc:mysql://localhost:3306/ssm_db
jdbc.username=root
jdbc.password=root
```

##### 步骤8:创建SpringMVC配置类

```java
@Configuration
@ComponentScan("com.itheima.controller")
@EnableWebMvc
public class SpringMvcConfig {
}
```

##### 步骤9:创建Web项目入口配置类

```java
public class ServletConfig extends AbstractAnnotationConfigDispatcherServletInitializer {
    //加载Spring配置类
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{SpringConfig.class};
    }
    //加载SpringMVC配置类
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{SpringMvcConfig.class};
    }
    //设置SpringMVC请求地址拦截规则
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
    //设置post请求中文乱码过滤器
    @Override
    protected Filter[] getServletFilters() {
        CharacterEncodingFilter filter = new CharacterEncodingFilter();
        filter.setEncoding("utf-8");
        return new Filter[]{filter};
    }
}

```

至此SSM整合的环境就已经搭建好了。在这个环境上，我们如何进行功能模块的开发呢?

#### 功能模块开发

> 需求:对表tbl_book进行新增、修改、删除、根据ID查询和查询所有

##### 步骤1:创建数据库及表

```sql
create database ssm_db character set utf8;
use ssm_db;
create table tbl_book(
  id int primary key auto_increment,
  type varchar(20),
  name varchar(50),
  description varchar(255)
)

insert  into `tbl_book`(`id`,`type`,`name`,`description`) values (1,'计算机理论','Spring实战 第五版','Spring入门经典教程，深入理解Spring原理技术内幕'),(2,'计算机理论','Spring 5核心原理与30个类手写实践','十年沉淀之作，手写Spring精华思想'),(3,'计算机理论','Spring 5设计模式','深入Spring源码刨析Spring源码中蕴含的10大设计模式'),(4,'计算机理论','Spring MVC+Mybatis开发从入门到项目实战','全方位解析面向Web应用的轻量级框架，带你成为Spring MVC开发高手'),(5,'计算机理论','轻量级Java Web企业应用实战','源码级刨析Spring框架，适合已掌握Java基础的读者'),(6,'计算机理论','Java核心技术 卷Ⅰ 基础知识(原书第11版)','Core Java第11版，Jolt大奖获奖作品，针对Java SE9、10、11全面更新'),(7,'计算机理论','深入理解Java虚拟机','5个纬度全面刨析JVM,大厂面试知识点全覆盖'),(8,'计算机理论','Java编程思想(第4版)','Java学习必读经典，殿堂级著作！赢得了全球程序员的广泛赞誉'),(9,'计算机理论','零基础学Java(全彩版)','零基础自学编程的入门图书，由浅入深，详解Java语言的编程思想和核心技术'),(10,'市场营销','直播就这么做:主播高效沟通实战指南','李子柒、李佳奇、薇娅成长为网红的秘密都在书中'),(11,'市场营销','直播销讲实战一本通','和秋叶一起学系列网络营销书籍'),(12,'市场营销','直播带货:淘宝、天猫直播从新手到高手','一本教你如何玩转直播的书，10堂课轻松实现带货月入3W+');
```

##### 步骤2:编写模型类

```java
public class Book {
    private Integer id;
    private String type;
    private String name;
    private String description;
    //getter...setter...toString省略
}
```

##### 步骤3:编写Dao接口

```java
public interface BookDao {

//    @Insert("insert into tbl_book values(null,#{type},#{name},#{description})")
    @Insert("insert into tbl_book (type,name,description) values(#{type},#{name},#{description})")
    public void save(Book book);

    @Update("update tbl_book set type = #{type}, name = #{name}, description = #{description} where id = #{id}")
    public void update(Book book);

    @Delete("delete from tbl_book where id = #{id}")
    public void delete(Integer id);

    @Select("select * from tbl_book where id = #{id}")
    public Book getById(Integer id);

    @Select("select * from tbl_book")
    public List<Book> getAll();
}
```

##### 步骤4:编写Service接口和实现类

```java
@Transactional
public interface BookService {
    /**
     * 保存
     * @param book
     * @return
     */
    public boolean save(Book book);

    /**
     * 修改
     * @param book
     * @return
     */
    public boolean update(Book book);

    /**
     * 按id删除
     * @param id
     * @return
     */
    public boolean delete(Integer id);

    /**
     * 按id查询
     * @param id
     * @return
     */
    public Book getById(Integer id);

    /**
     * 查询全部
     * @return
     */
    public List<Book> getAll();
}
```

```java
@Service
public class BookServiceImpl implements BookService {
    @Autowired
    private BookDao bookDao;

    public boolean save(Book book) {
        bookDao.save(book);
        return true;
    }

    public boolean update(Book book) {
        bookDao.update(book);
        return true;
    }

    public boolean delete(Integer id) {
        bookDao.delete(id);
        return true;
    }

    public Book getById(Integer id) {
        return bookDao.getById(id);
    }

    public List<Book> getAll() {
        return bookDao.getAll();
    }
}
```

**说明:**

* bookDao在Service中注入的会提示一个红线提示，为什么呢?

  * BookDao是一个接口，没有实现类，接口是不能创建对象的，所以最终注入的应该是代理对象
  * 代理对象是由Spring的IOC容器来创建管理的
  * IOC容器又是在Web服务器启动的时候才会创建
  * IDEA在检测依赖关系的时候，没有找到适合的类注入，所以会提示错误提示
  * 但是程序运行的时候，代理对象就会被创建，框架会使用DI进行注入，所以程序运行无影响。

* 如何解决上述问题?

  * 可以不用理会，因为运行是正常的

  * 设置错误提示级别

    ![](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/1630600227357.png)



##### 步骤5:编写Contorller类

```java
@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    private BookService bookService;

    @PostMapping
    public boolean save(@RequestBody Book book) {
        return bookService.save(book);
    }

    @PutMapping
    public boolean update(@RequestBody Book book) {
        return bookService.update(book);
    }

    @DeleteMapping("/{id}")
    public boolean delete(@PathVariable Integer id) {
        return bookService.delete(id);
    }

    @GetMapping("/{id}")
    public Book getById(@PathVariable Integer id) {
        return bookService.getById(id);
    }

    @GetMapping
    public List<Book> getAll() {
        return bookService.getAll();
    }
}
```

对于图书模块的增删改查就已经完成了编写，我们可以从后往前写也可以从前往后写，最终只需要能把功能实现即可。

接下来我们就先把业务层的代码使用`Spring整合Junit`的知识点进行单元测试:

#### 单元测试

##### 步骤1:新建测试类

```java
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfig.class)
public class BookServiceTest {

}
```

##### 步骤2:注入Service类

```java
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfig.class)
public class BookServiceTest {

    @Autowired
    private BookService bookService;


}
```

##### 步骤3:编写测试方法

我们先来对查询进行单元测试。

```java
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfig.class)
public class BookServiceTest {

    @Autowired
    private BookService bookService;

    @Test
    public void testGetById(){
        Book book = bookService.getById(1);
        System.out.println(book);
    }

    @Test
    public void testGetAll(){
        List<Book> all = bookService.getAll();
        System.out.println(all);
    }

}
```

根据ID查询，测试的结果为:

![1630600844191](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/1630600844191.png)

查询所有，测试的结果为:

![image-20240416174951122](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240416174951122.png) 

#### PostMan测试

##### 新增

`http://localhost/books`

```json
{
	"type":"类别测试数据",
    "name":"书名测试数据",
    "description":"描述测试数据"
}
```

![1630652582425](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/1630652582425.png)

##### 修改

`http://localhost/books`

```json
{
    "id":13,
	"type":"类别测试数据",
    "name":"书名测试数据",
    "description":"描述测试数据"
}
```

![1630652758221](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/1630652758221.png)

##### 删除

`http://localhost/books/14`

![1630652796605](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/1630652796605.png)

##### 查询单个

`http://localhost/books/1`

![1630652837682](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/1630652837682.png)

##### 查询所有

`http://localhost/books`

![1630652867493](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/1630652867493.png)

#### 统一结果封装

##### 表现层与前端数据传输协议定义

SSM整合以及功能模块开发完成后，接下来，我们在上述案例的基础上分析下有哪些问题需要我们去解决下。首先第一个问题是:

* 在Controller层增删改返回给前端的是boolean类型数据

  ![1630653359533](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/1630653359533.png)

* 在Controller层查询单个返回给前端的是对象

  ![1630653385377](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/1630653385377.png)

* 在Controller层查询所有返回给前端的是集合对象

  ![1630653468887](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/1630653468887.png)

目前我们就已经有三种数据类型返回给前端，如果随着业务的增长，我们需要返回的数据类型会越来越多。对于前端开发人员在解析数据的时候就比较凌乱了，所以对于前端来说，如果后台能够返回一个统一的数据结果，前端在解析的时候就可以按照一种方式进行解析。开发就会变得更加简单。

所以我们就想能不能将返回结果的数据进行统一，具体如何来做，大体的思路为:

* 为了封装返回的结果数据:==创建结果模型类，封装数据到data属性中==
* 为了封装返回的数据是何种操作及是否操作成功:==封装操作结果到code属性中==
* 操作失败后为了封装返回的错误信息:==封装特殊消息到message(msg)属性中==

![1630654293972](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/1630654293972.png)

根据分析，我们可以设置统一数据返回结果类

```java
public class Result{
	private Object data;
	private Integer code;
	private String msg;
}
```

**注意:**Result类名及类中的字段并不是固定的，可以根据需要自行增减提供若干个构造方法，方便操作。

##### 表现层与前端数据传输协议实现

前面我们已经分析了如何封装返回结果数据，具体在项目中该如何实现，我们通过个例子来操作一把

对于结果封装，我们应该是在表现层进行处理，所以我们把结果类放在controller包下，当然你也可以放在domain包，这个都是可以的，具体如何实现结果封装，具体的步骤为:

###### 步骤1:创建Result类

```java
public class Result {
    //描述统一格式中的数据
    private Object data;
    //描述统一格式中的编码，用于区分操作，可以简化配置0或1表示成功失败
    private Integer code;
    //描述统一格式中的消息，可选属性
    private String msg;

    public Result() {
    }
	//构造方法是方便对象的创建
    public Result(Integer code,Object data) {
        this.data = data;
        this.code = code;
    }
	//构造方法是方便对象的创建
    public Result(Integer code, Object data, String msg) {
        this.data = data;
        this.code = code;
        this.msg = msg;
    }
	//setter...getter...省略
}
```

###### 步骤2:定义返回码Code类

```java
//状态码
public class Code {
    public static final Integer SAVE_OK = 20011;
    public static final Integer DELETE_OK = 20021;
    public static final Integer UPDATE_OK = 20031;
    public static final Integer GET_OK = 20041;

    public static final Integer SAVE_ERR = 20010;
    public static final Integer DELETE_ERR = 20020;
    public static final Integer UPDATE_ERR = 20030;
    public static final Integer GET_ERR = 20040;
}

```

**注意:**code类中的常量设计也不是固定的，可以根据需要自行增减，例如将查询再进行细分为GET_OK,GET_ALL_OK,GET_PAGE_OK等。

###### 步骤3:修改Controller类的返回值

```java
//统一每一个控制器方法返回值
@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    private BookService bookService;

    @PostMapping
    public Result save(@RequestBody Book book) {
        boolean flag = bookService.save(book);
        return new Result(flag ? Code.SAVE_OK:Code.SAVE_ERR,flag);
    }

    @PutMapping
    public Result update(@RequestBody Book book) {
        boolean flag = bookService.update(book);
        return new Result(flag ? Code.UPDATE_OK:Code.UPDATE_ERR,flag);
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id) {
        boolean flag = bookService.delete(id);
        return new Result(flag ? Code.DELETE_OK:Code.DELETE_ERR,flag);
    }

    @GetMapping("/{id}")
    public Result getById(@PathVariable Integer id) {
        Book book = bookService.getById(id);
        Integer code = book != null ? Code.GET_OK : Code.GET_ERR;
        String msg = book != null ? "" : "数据查询失败，请重试！";
        return new Result(code,book,msg);
    }

    @GetMapping
    public Result getAll() {
        List<Book> bookList = bookService.getAll();
        Integer code = bookList != null ? Code.GET_OK : Code.GET_ERR;
        String msg = bookList != null ? "" : "数据查询失败，请重试！";
        return new Result(code,bookList,msg);
    }
}
```

###### 步骤4:启动服务测试

![1630656326477](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/1630656326477.png)

至此，我们的返回结果就已经能以一种统一的格式返回给前端。前端根据返回的结果，先从中获取`code`,根据code判断，如果成功则取`data`属性的值，如果失败，则取`msg`中的值做提示。

#### 统一异常处理

##### 问题描述

在讲解这一部分知识点之前，我们先来演示个效果，修改BookController类的`getById`方法

```java
@GetMapping("/{id}")
public Result getById(@PathVariable Integer id) {
    //手动添加一个错误信息
    if(id==1){
        int i = 1/0;
    }
    Book book = bookService.getById(id);
    Integer code = book != null ? Code.GET_OK : Code.GET_ERR;
    String msg = book != null ? "" : "数据查询失败，请重试！";
    return new Result(code,book,msg);
}
```

重新启动运行项目，使用PostMan发送请求，当传入的id为1，则会出现如下效果：

![1630656982337](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/1630656982337.png)

前端接收到这个信息后和之前我们约定的格式不一致，这个问题该如何解决?

在解决问题之前，我们先来看下异常的种类及出现异常的原因:

- 框架内部抛出的异常：因使用不合规导致
- 数据层抛出的异常：因外部服务器故障导致（例如：服务器访问超时）
- 业务层抛出的异常：因业务逻辑书写错误导致（例如：遍历业务书写操作，导致索引异常等）
- 表现层抛出的异常：因数据收集、校验等规则导致（例如：不匹配的数据类型间导致异常）
- 工具类抛出的异常：因工具类书写不严谨不够健壮导致（例如：必要释放的连接长期未释放等）

看完上面这些出现异常的位置，你会发现，在我们开发的任何一个位置都有可能出现异常，而且这些异常是不能避免的。所以我们就得将异常进行处理。

**思考**

1. 各个层级均出现异常，异常处理代码书写在哪一层?

   ==所有的异常均抛出到表现层进行处理==

2. 异常的种类很多，表现层如何将所有的异常都处理到呢?

   ==异常分类==

3. 表现层处理异常，每个方法中单独书写，代码书写量巨大且意义不强，如何解决?

   ==AOP==

对于上面这些问题及解决方案，SpringMVC已经为我们提供了一套解决方案:

* 异常处理器:

  * 集中的、统一的处理项目中出现的异常。

    ![1630657791653](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/1630657791653.png)

##### 异常处理器的使用

###### 环境准备

- 创建一个Web的Maven项目
- pom.xml添加SSM整合所需jar包
- 创建对应的配置类
- 编写Controller、Service接口、Service实现类、Dao接口和模型类
- resources下提供jdbc.properties配置文件

内容参考前面的项目或者直接使用前面的项目进行本节内容的学习。

最终创建好的项目结构如下:

![1630657972564](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/1630657972564.png)

###### 使用步骤

**步骤1:创建异常处理器类**

```java
//@RestControllerAdvice用于标识当前类为REST风格对应的异常处理器
@RestControllerAdvice
public class ProjectExceptionAdvice {
    //除了自定义的异常处理器，保留对Exception类型的异常处理，用于处理非预期的异常
    @ExceptionHandler(Exception.class)
    public void doException(Exception ex){
      	System.out.println("嘿嘿,异常你哪里跑！")
    }
}

```

==确保SpringMvcConfig能够扫描到异常处理器类==

**步骤2:让程序抛出异常**

修改`BookController`的getById方法，添加`int i = 1/0`.

```java
@GetMapping("/{id}")
public Result getById(@PathVariable Integer id) {
  	int i = 1/0;
    Book book = bookService.getById(id);
    Integer code = book != null ? Code.GET_OK : Code.GET_ERR;
    String msg = book != null ? "" : "数据查询失败，请重试！";
    return new Result(code,book,msg);
}
```

**步骤3:运行程序，测试**

![1630658350945](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/1630658350945.png)

说明异常已经被拦截并执行了`doException`方法。

**异常处理器类返回结果给前端**

```java
//@RestControllerAdvice用于标识当前类为REST风格对应的异常处理器
@RestControllerAdvice
public class ProjectExceptionAdvice {
    //除了自定义的异常处理器，保留对Exception类型的异常处理，用于处理非预期的异常
    @ExceptionHandler(Exception.class)
    public Result doException(Exception ex){
      	System.out.println("嘿嘿,异常你哪里跑！")
        return new Result(666,null,"嘿嘿,异常你哪里跑！");
    }
}

```

**启动运行程序，测试**

![1630658606549](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/1630658606549.png)

至此，就算后台执行的过程中抛出异常，最终也能按照我们和前端约定好的格式返回给前端。

##### 异常分类

异常处理器我们已经能够使用了，那么在咱们的项目中该如何来处理异常呢?

因为异常的种类有很多，如果每一个异常都对应一个@ExceptionHandler，那得写多少个方法来处理各自的异常，所以我们在处理异常之前，需要对异常进行一个分类:

- 业务异常（BusinessException）

  - 规范的用户行为产生的异常

    - 用户在页面输入内容的时候未按照指定格式进行数据填写，如在年龄框输入的是字符串

      ![1630659599983](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/1630659599983.png)

  - 不规范的用户行为操作产生的异常

    - 如用户故意传递错误数据

      ![1630659622958](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/1630659622958.png)

- 系统异常（SystemException）

  - 项目运行过程中可预计但无法避免的异常
    - 比如数据库或服务器宕机

- 其他异常（Exception）

  - 编程人员未预期到的异常，如:用到的文件不存在

    ![1630659690341](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/1630659690341.png)

将异常分类以后，针对不同类型的异常，要提供具体的解决方案:

##### 异常解决方案

- 业务异常（BusinessException）
  - 发送对应消息传递给用户，提醒规范操作
    - 大家常见的就是提示用户名已存在或密码格式不正确等
- 系统异常（SystemException）
  - 发送固定消息传递给用户，安抚用户
    - 系统繁忙，请稍后再试
    - 系统正在维护升级，请稍后再试
    - 系统出问题，请联系系统管理员等
  - 发送特定消息给运维人员，提醒维护
    - 可以发送短信、邮箱或者是公司内部通信软件
  - 记录日志
    - 发消息和记录日志对用户来说是不可见的，属于后台程序
- 其他异常（Exception）
  - 发送固定消息传递给用户，安抚用户
  - 发送特定消息给编程人员，提醒维护（纳入预期范围内）
    - 一般是程序没有考虑全，比如未做非空校验等
  - 记录日志

##### 异常解决方案的具体实现

> 思路:
>
> 1.先通过自定义异常，完成BusinessException和SystemException的定义
>
> 2.将其他异常包装成自定义异常类型
>
> 3.在异常处理器类中对不同的异常进行处理

###### 步骤1:自定义异常类

```java
//自定义异常处理器，用于封装异常信息，对异常进行分类
public class SystemException extends RuntimeException{
    private Integer code;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public SystemException(Integer code, String message) {
        super(message);
        this.code = code;
    }

    public SystemException(Integer code, String message, Throwable cause) {
        super(message, cause);
        this.code = code;
    }

}

//自定义异常处理器，用于封装异常信息，对异常进行分类
public class BusinessException extends RuntimeException{
    private Integer code;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public BusinessException(Integer code, String message) {
        super(message);
        this.code = code;
    }

    public BusinessException(Integer code, String message, Throwable cause) {
        super(message, cause);
        this.code = code;
    }

}


```

**说明:**

* 让自定义异常类继承`RuntimeException`的好处是，后期在抛出这两个异常的时候，就不用在try...catch...或throws了
* 自定义异常类中添加`code`属性的原因是为了更好的区分异常是来自哪个业务的

###### 步骤2:将其他异常包成自定义异常

假如在BookServiceImpl的getById方法抛异常了，该如何来包装呢?

```java
public Book getById(Integer id) {
    //模拟业务异常，包装成自定义异常
    if(id == 1){
        throw new BusinessException(Code.BUSINESS_ERR,"请不要使用你的技术挑战我的耐性!");
    }
    //模拟系统异常，将可能出现的异常进行包装，转换成自定义异常
    try{
        int i = 1/0;
    }catch (Exception e){
        throw new SystemException(Code.SYSTEM_TIMEOUT_ERR,"服务器访问超时，请重试!",e);
    }
    return bookDao.getById(id);
}
```

具体的包装方式有：

* 方式一:`try{}catch(){}`在catch中重新throw我们自定义异常即可。
* 方式二:直接throw自定义异常即可

上面为了使`code`看着更专业些，我们在Code类中再新增需要的属性

```java
//状态码
public class Code {
    public static final Integer SAVE_OK = 20011;
    public static final Integer DELETE_OK = 20021;
    public static final Integer UPDATE_OK = 20031;
    public static final Integer GET_OK = 20041;

    public static final Integer SAVE_ERR = 20010;
    public static final Integer DELETE_ERR = 20020;
    public static final Integer UPDATE_ERR = 20030;
    public static final Integer GET_ERR = 20040;
    public static final Integer SYSTEM_ERR = 50001;
    public static final Integer SYSTEM_TIMEOUT_ERR = 50002;
    public static final Integer SYSTEM_UNKNOW_ERR = 59999;

    public static final Integer BUSINESS_ERR = 60002;
}

```

###### 步骤3:处理器类中处理自定义异常

```java
//@RestControllerAdvice用于标识当前类为REST风格对应的异常处理器
@RestControllerAdvice
public class ProjectExceptionAdvice {
    //@ExceptionHandler用于设置当前处理器类对应的异常类型
    @ExceptionHandler(SystemException.class)
    public Result doSystemException(SystemException ex){
        //记录日志
        //发送消息给运维
        //发送邮件给开发人员,ex对象发送给开发人员
        return new Result(ex.getCode(),null,ex.getMessage());
    }

    @ExceptionHandler(BusinessException.class)
    public Result doBusinessException(BusinessException ex){
        return new Result(ex.getCode(),null,ex.getMessage());
    }

    //除了自定义的异常处理器，保留对Exception类型的异常处理，用于处理非预期的异常
    @ExceptionHandler(Exception.class)
    public Result doOtherException(Exception ex){
        //记录日志
        //发送消息给运维
        //发送邮件给开发人员,ex对象发送给开发人员
        return new Result(Code.SYSTEM_UNKNOW_ERR,null,"系统繁忙，请稍后再试！");
    }
}
```

###### 步骤4:运行程序

根据ID查询，

如果传入的参数为1，会报`BusinessException`

![1630661162758](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/1630661162758.png)

如果传入的是其他参数，会报`SystemException`

![1630661192383](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/1630661192383.png)

对于异常我们就已经处理完成了，不管后台哪一层抛出异常，都会以我们与前端约定好的方式进行返回，前端只需要把信息获取到，根据返回的正确与否来展示不同的内容即可。

#### 前后台协议联调

##### 环境准备

- 创建一个Web的Maven项目
- pom.xml添加SSM整合所需jar包
- 创建对应的配置类
- 编写Controller、Service接口、Service实现类、Dao接口和模型类
- resources下提供jdbc.properties配置文件

内容参考前面的项目或者直接使用前面的项目进行本节内容的学习。

最终创建好的项目结构如下:

![1630661781776](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/1630661781776.png)

1. 将`资料\SSM功能页面`下面的静态资源拷贝到webapp下。

![1630663662691](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/1630663662691.png)

2. 因为添加了静态资源，SpringMVC会拦截，所有需要在SpringConfig的配置类中将静态资源进行放行。

* 新建SpringMvcSupport

  ```java
  @Configuration
  public class SpringMvcSupport extends WebMvcConfigurationSupport {
      @Override
      protected void addResourceHandlers(ResourceHandlerRegistry registry) {
          registry.addResourceHandler("/pages/**").addResourceLocations("/pages/");
          registry.addResourceHandler("/css/**").addResourceLocations("/css/");
          registry.addResourceHandler("/js/**").addResourceLocations("/js/");
          registry.addResourceHandler("/plugins/**").addResourceLocations("/plugins/");
      }
  }
  ```

* 在SpringMvcConfig中扫描SpringMvcSupport

  ```java
  @Configuration
  @ComponentScan({"com.itheima.controller","com.itheima.config"})
  @EnableWebMvc
  public class SpringMvcConfig {
  }
  ```

接下来我们就需要将所有的列表查询、新增、修改、删除等功能一个个来实现下。

##### 列表功能

![1630670317859](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/1630670317859.png)

> 需求:页面加载完后发送异步请求到后台获取列表数据进行展示。
>
> 1.找到页面的钩子函数，`created()`
>
> 2.`created()`方法中调用了`this.getAll()`方法
>
> 3.在getAll()方法中使用axios发送异步请求从后台获取数据
>
> 4.访问的路径为`http://localhost/books`
>
> 5.返回数据

返回数据res.data的内容如下:

```json
{
    "data": [
        {
            "id": 1,
            "type": "计算机理论",
            "name": "Spring实战 第五版",
            "description": "Spring入门经典教程，深入理解Spring原理技术内幕"
        },
        {
            "id": 2,
            "type": "计算机理论",
            "name": "Spring 5核心原理与30个类手写实践",
            "description": "十年沉淀之作，手写Spring精华思想"
        },...
    ],
    "code": 20041,
    "msg": ""
}
```

发送方式:

```js
getAll() {
    //发送ajax请求
    axios.get("/books").then((res)=>{
        this.dataList = res.data.data;
    });
}
```

![1630666787456](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/1630666787456.png)

##### 添加功能

![1630670332168](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/1630670332168.png)

> 需求:完成图片的新增功能模块
>
> 1.找到页面上的`新建`按钮，按钮上绑定了`@click="handleCreate()"`方法
>
> 2.在method中找到`handleCreate`方法，方法中打开新增面板
>
> 3.新增面板中找到`确定`按钮,按钮上绑定了`@click="handleAdd()"`方法
>
> 4.在method中找到`handleAdd`方法
>
> 5.在方法中发送请求和数据，响应成功后将新增面板关闭并重新查询数据

`handleCreate`打开新增面板

```js
handleCreate() {
    this.dialogFormVisible = true;
},
```

`handleAdd`方法发送异步请求并携带数据

```js
handleAdd () {
    //发送ajax请求
    //this.formData是表单中的数据，最后是一个json数据
    axios.post("/books",this.formData).then((res)=>{
        this.dialogFormVisible = false;
        this.getAll();
    });
}
```

##### 添加功能状态处理

基础的新增功能已经完成，但是还有一些问题需要解决下:

> 需求:新增成功是关闭面板，重新查询数据，那么新增失败以后该如何处理?
>
> 1.在handlerAdd方法中根据后台返回的数据来进行不同的处理
>
> 2.如果后台返回的是成功，则提示成功信息，并关闭面板
>
> 3.如果后台返回的是失败，则提示错误信息

(1)修改前端页面

```js
handleAdd () {
    //发送ajax请求
    axios.post("/books",this.formData).then((res)=>{
        //如果操作成功，关闭弹层，显示数据
        if(res.data.code == 20011){
            this.dialogFormVisible = false;
            this.$message.success("添加成功");
        }else if(res.data.code == 20010){
            this.$message.error("添加失败");
        }else{
            this.$message.error(res.data.msg);
        }
    }).finally(()=>{
        this.getAll();
    });
}
```

(2)后台返回操作结果，将Dao层的增删改方法返回值从`void`改成`int`

```java
public interface BookDao {

//    @Insert("insert into tbl_book values(null,#{type},#{name},#{description})")
    @Insert("insert into tbl_book (type,name,description) values(#{type},#{name},#{description})")
    public int save(Book book);

    @Update("update tbl_book set type = #{type}, name = #{name}, description = #{description} where id = #{id}")
    public int update(Book book);

    @Delete("delete from tbl_book where id = #{id}")
    public int delete(Integer id);

    @Select("select * from tbl_book where id = #{id}")
    public Book getById(Integer id);

    @Select("select * from tbl_book")
    public List<Book> getAll();
}
```

(3)在BookServiceImpl中，增删改方法根据DAO的返回值来决定返回true/false

```java
@Service
public class BookServiceImpl implements BookService {
    @Autowired
    private BookDao bookDao;

    public boolean save(Book book) {
        return bookDao.save(book) > 0;
    }

    public boolean update(Book book) {
        return bookDao.update(book) > 0;
    }

    public boolean delete(Integer id) {
        return bookDao.delete(id) > 0;
    }

    public Book getById(Integer id) {
        if(id == 1){
            throw new BusinessException(Code.BUSINESS_ERR,"请不要使用你的技术挑战我的耐性!");
        }
//        //将可能出现的异常进行包装，转换成自定义异常
//        try{
//            int i = 1/0;
//        }catch (Exception e){
//            throw new SystemException(Code.SYSTEM_TIMEOUT_ERR,"服务器访问超时，请重试!",e);
//        }
        return bookDao.getById(id);
    }

    public List<Book> getAll() {
        return bookDao.getAll();
    }
}

```

(4)测试错误情况，将图书类别长度设置超出范围即可

![1630668954348](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/1630668954348.png)

处理完新增后，会发现新增还存在一个问题，

新增成功后，再次点击`新增`按钮会发现之前的数据还存在，这个时候就需要在新增的时候将表单内容清空。

```js
resetForm(){
	this.formData = {};
}
handleCreate() {
    this.dialogFormVisible = true;
    this.resetForm();
}
```

##### 修改功能

![1630670367812](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/1630670367812.png)

>需求:完成图书信息的修改功能
>
>1.找到页面中的`编辑`按钮，该按钮绑定了`@click="handleUpdate(scope.row)"`
>
>2.在method的`handleUpdate`方法中发送异步请求根据ID查询图书信息
>
>3.根据后台返回的结果，判断是否查询成功
>
>​	如果查询成功打开修改面板回显数据，如果失败提示错误信息
>
>4.修改完成后找到修改面板的`确定`按钮，该按钮绑定了`@click="handleEdit()"`
>
>5.在method的`handleEdit`方法中发送异步请求提交修改数据
>
>6.根据后台返回的结果，判断是否修改成功
>
>​	如果成功提示错误信息，关闭修改面板，重新查询数据，如果失败提示错误信息

scope.row代表的是当前行的行数据，也就是说,scope.row就是选中行对应的json数据，如下:

```json
{
    "id": 1,
    "type": "计算机理论",
    "name": "Spring实战 第五版",
    "description": "Spring入门经典教程，深入理解Spring原理技术内幕"
}
```

修改`handleUpdate`方法

```js
//弹出编辑窗口
handleUpdate(row) {
    // console.log(row);   //row.id 查询条件
    //查询数据，根据id查询
    axios.get("/books/"+row.id).then((res)=>{
        if(res.data.code == 20041){
            //展示弹层，加载数据
            this.formData = res.data.data;
            this.dialogFormVisible4Edit = true;
        }else{
            this.$message.error(res.data.msg);
        }
    });
}
```

修改`handleEdit`方法

```js
handleEdit() {
    //发送ajax请求
    axios.put("/books",this.formData).then((res)=>{
        //如果操作成功，关闭弹层，显示数据
        if(res.data.code == 20031){
            this.dialogFormVisible4Edit = false;
            this.$message.success("修改成功");
        }else if(res.data.code == 20030){
            this.$message.error("修改失败");
        }else{
            this.$message.error(res.data.msg);
        }
    }).finally(()=>{
        this.getAll();
    });
}
```

至此修改功能就已经完成。

##### 删除功能

![1630673984385](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/1630673984385.png)

> 需求:完成页面的删除功能。
>
> 1.找到页面的删除按钮，按钮上绑定了`@click="handleDelete(scope.row)"`
>
> 2.method的`handleDelete`方法弹出提示框
>
> 3.用户点击取消,提示操作已经被取消。
>
> 4.用户点击确定，发送异步请求并携带需要删除数据的主键ID
>
> 5.根据后台返回结果做不同的操作
>
> ​	如果返回成功，提示成功信息，并重新查询数据
>
> ​	如果返回失败，提示错误信息，并重新查询数据

修改`handleDelete`方法

```js
handleDelete(row) {
    //1.弹出提示框
    this.$confirm("此操作永久删除当前数据，是否继续？","提示",{
        type:'info'
    }).then(()=>{
        //2.做删除业务
        axios.delete("/books/"+row.id).then((res)=>{
            if(res.data.code == 20021){
                this.$message.success("删除成功");
            }else{
                this.$message.error("删除失败");
            }
        }).finally(()=>{
            this.getAll();
        });
    }).catch(()=>{
        //3.取消删除
        this.$message.info("取消删除操作");
    });
}
```

接下来，下面是一个完整页面

```html
<!DOCTYPE html>

<html>

    <head>

        <!-- 页面meta -->

        <meta charset="utf-8">

        <meta http-equiv="X-UA-Compatible" content="IE=edge">

        <title>SpringMVC案例</title>

        <meta content="width=device-width,initial-scale=1,maximum-scale=1,user-scalable=no" name="viewport">

        <!-- 引入样式 -->

        <link rel="stylesheet" href="../plugins/elementui/index.css">

        <link rel="stylesheet" href="../plugins/font-awesome/css/font-awesome.min.css">

        <link rel="stylesheet" href="../css/style.css">

    </head>

    <body class="hold-transition">

        <div id="app">

            <div class="content-header">

                <h1>图书管理</h1>

            </div>

            <div class="app-container">

                <div class="box">

                    <div class="filter-container">

                        <el-input placeholder="图书名称" v-model="pagination.queryString" style="width: 200px;" class="filter-item"></el-input>

                        <el-button @click="getAll()" class="dalfBut">查询</el-button>

                        <el-button type="primary" class="butT" @click="handleCreate()">新建</el-button>

                    </div>

                    <el-table size="small" current-row-key="id" :data="dataList" stripe highlight-current-row>

                        <el-table-column type="index" align="center" label="序号"></el-table-column>

                        <el-table-column prop="type" label="图书类别" align="center"></el-table-column>

                        <el-table-column prop="name" label="图书名称" align="center"></el-table-column>

                        <el-table-column prop="description" label="描述" align="center"></el-table-column>

                        <el-table-column label="操作" align="center">

                            <template slot-scope="scope">

                                <el-button type="primary" size="mini" @click="handleUpdate(scope.row)">编辑</el-button>

                                <el-button type="danger" size="mini" @click="handleDelete(scope.row)">删除</el-button>

                            </template>

                        </el-table-column>

                    </el-table>

                    <!-- 新增标签弹层 -->

                    <div class="add-form">

                        <el-dialog title="新增图书" :visible.sync="dialogFormVisible">

                            <el-form ref="dataAddForm" :model="formData" :rules="rules" label-position="right" label-width="100px">

                                <el-row>

                                    <el-col :span="12">

                                        <el-form-item label="图书类别" prop="type">

                                            <el-input v-model="formData.type"/>

                                        </el-form-item>

                                    </el-col>

                                    <el-col :span="12">

                                        <el-form-item label="图书名称" prop="name">

                                            <el-input v-model="formData.name"/>

                                        </el-form-item>

                                    </el-col>

                                </el-row>


                                <el-row>

                                    <el-col :span="24">

                                        <el-form-item label="描述">

                                            <el-input v-model="formData.description" type="textarea"></el-input>

                                        </el-form-item>

                                    </el-col>

                                </el-row>

                            </el-form>

                            <div slot="footer" class="dialog-footer">

                                <el-button @click="dialogFormVisible = false">取消</el-button>

                                <el-button type="primary" @click="handleAdd()">确定</el-button>

                            </div>

                        </el-dialog>

                    </div>

                    <!-- 编辑标签弹层 -->

                    <div class="add-form">

                        <el-dialog title="编辑检查项" :visible.sync="dialogFormVisible4Edit">

                            <el-form ref="dataEditForm" :model="formData" :rules="rules" label-position="right" label-width="100px">

                                <el-row>

                                    <el-col :span="12">

                                        <el-form-item label="图书类别" prop="type">

                                            <el-input v-model="formData.type"/>

                                        </el-form-item>

                                    </el-col>

                                    <el-col :span="12">

                                        <el-form-item label="图书名称" prop="name">

                                            <el-input v-model="formData.name"/>

                                        </el-form-item>

                                    </el-col>

                                </el-row>

                                <el-row>

                                    <el-col :span="24">

                                        <el-form-item label="描述">

                                            <el-input v-model="formData.description" type="textarea"></el-input>

                                        </el-form-item>

                                    </el-col>

                                </el-row>

                            </el-form>

                            <div slot="footer" class="dialog-footer">

                                <el-button @click="dialogFormVisible4Edit = false">取消</el-button>

                                <el-button type="primary" @click="handleEdit()">确定</el-button>

                            </div>

                        </el-dialog>

                    </div>

                </div>

            </div>

        </div>

    </body>

    <!-- 引入组件库 -->

    <script src="../js/vue.js"></script>

    <script src="../plugins/elementui/index.js"></script>

    <script type="text/javascript" src="../js/jquery.min.js"></script>

    <script src="../js/axios-0.18.0.js"></script>

    <script>
        var vue = new Vue({

            el: '#app',
            data:{
                pagination: {},
				dataList: [],//当前页要展示的列表数据
                formData: {},//表单数据
                dialogFormVisible: false,//控制表单是否可见
                dialogFormVisible4Edit:false,//编辑表单是否可见
                rules: {//校验规则
                    type: [{ required: true, message: '图书类别为必填项', trigger: 'blur' }],
                    name: [{ required: true, message: '图书名称为必填项', trigger: 'blur' }]
                }
            },

            //钩子函数，VUE对象初始化完成后自动执行
            created() {
                this.getAll();
            },

            methods: {
                //列表
                getAll() {
                    //发送ajax请求
                    axios.get("/books").then((res)=>{
                        this.dataList = res.data.data;
                    });
                },

                //弹出添加窗口
                handleCreate() {
                    this.dialogFormVisible = true;
                    this.resetForm();
                },

                //重置表单
                resetForm() {
                    this.formData = {};
                },

                //添加
                handleAdd () {
                    //发送ajax请求
                    axios.post("/books",this.formData).then((res)=>{
                        console.log(res.data);
                        //如果操作成功，关闭弹层，显示数据
                        if(res.data.code == 20011){
                            this.dialogFormVisible = false;
                            this.$message.success("添加成功");
                        }else if(res.data.code == 20010){
                            this.$message.error("添加失败");
                        }else{
                            this.$message.error(res.data.msg);
                        }
                    }).finally(()=>{
                        this.getAll();
                    });
                },

                //弹出编辑窗口
                handleUpdate(row) {
                    // console.log(row);   //row.id 查询条件
                    //查询数据，根据id查询
                    axios.get("/books/"+row.id).then((res)=>{
                        // console.log(res.data.data);
                        if(res.data.code == 20041){
                            //展示弹层，加载数据
                            this.formData = res.data.data;
                            this.dialogFormVisible4Edit = true;
                        }else{
                            this.$message.error(res.data.msg);
                        }
                    });
                },

                //编辑
                handleEdit() {
                    //发送ajax请求
                    axios.put("/books",this.formData).then((res)=>{
                        //如果操作成功，关闭弹层，显示数据
                        if(res.data.code == 20031){
                            this.dialogFormVisible4Edit = false;
                            this.$message.success("修改成功");
                        }else if(res.data.code == 20030){
                            this.$message.error("修改失败");
                        }else{
                            this.$message.error(res.data.msg);
                        }
                    }).finally(()=>{
                        this.getAll();
                    });
                },

                // 删除
                handleDelete(row) {
                    //1.弹出提示框
                    this.$confirm("此操作永久删除当前数据，是否继续？","提示",{
                        type:'info'
                    }).then(()=>{
                        //2.做删除业务
                        axios.delete("/books/"+row.id).then((res)=>{
                            if(res.data.code == 20021){
                                this.$message.success("删除成功");
                            }else{
                                this.$message.error("删除失败");
                            }
                        }).finally(()=>{
                            this.getAll();
                        });
                    }).catch(()=>{
                        //3.取消删除
                        this.$message.info("取消删除操作");
                    });
                }
            }
        })

    </script>

</html>
```

#### 拦截器

对于拦截器这节的知识，我们需要学习如下内容:

* 拦截器概念
* 入门案例
* 拦截器参数
* 拦截器工作流程分析

##### 拦截器概念

讲解拦截器的概念之前，我们先看一张图:

![1630676280170](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/1630676280170.png)

(1)浏览器发送一个请求会先到Tomcat的web服务器

(2)Tomcat服务器接收到请求以后，会去判断请求的是静态资源还是动态资源

(3)如果是静态资源，会直接到Tomcat的项目部署目录下去直接访问

(4)如果是动态资源，就需要交给项目的后台代码进行处理

(5)在找到具体的方法之前，我们可以去配置过滤器(可以配置多个)，按照顺序进行执行

(6)然后进入到到中央处理器(SpringMVC中的内容)，SpringMVC会根据配置的规则进行拦截

(7)如果满足规则，则进行处理，找到其对应的controller类中的方法进行执行,完成后返回结果

(8)如果不满足规则，则不进行处理

(9)这个时候，如果我们需要在每个Controller方法执行的前后添加业务，具体该如何来实现?

这个就是拦截器要做的事。

* 拦截器（Interceptor）是一种动态拦截方法调用的机制，在SpringMVC中动态拦截控制器方法的执行
* 作用:
  * 在指定的方法调用前后执行预先设定的代码
  * 阻止原始方法的执行
  * 总结：拦截器就是用来做增强

看完以后，大家会发现

* 拦截器和过滤器在作用和执行顺序上也很相似

所以这个时候，就有一个问题需要思考:拦截器和过滤器之间的区别是什么?

- 归属不同：Filter属于Servlet技术，Interceptor属于SpringMVC技术
- 拦截内容不同：Filter对所有访问进行增强，Interceptor仅针对SpringMVC的访问进行增强

![1630676903190](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/1630676903190.png)

##### 拦截器入门案例

###### 环境准备

- 创建一个Web的Maven项目

- pom.xml添加SSM整合所需jar包

  ```xml
  <?xml version="1.0" encoding="UTF-8"?>
  
  <project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
    xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>
  
    <groupId>com.itheima</groupId>
    <artifactId>springmvc_12_interceptor</artifactId>
    <version>1.0-SNAPSHOT</version>
    <packaging>war</packaging>
  
    <dependencies>
      <dependency>
        <groupId>javax.servlet</groupId>
        <artifactId>javax.servlet-api</artifactId>
        <version>3.1.0</version>
        <scope>provided</scope>
      </dependency>
      <dependency>
        <groupId>org.springframework</groupId>
        <artifactId>spring-webmvc</artifactId>
        <version>5.2.10.RELEASE</version>
      </dependency>
      <dependency>
        <groupId>com.fasterxml.jackson.core</groupId>
        <artifactId>jackson-databind</artifactId>
        <version>2.9.0</version>
      </dependency>
    </dependencies>
  
    <build>
      <plugins>
        <plugin>
          <groupId>org.apache.tomcat.maven</groupId>
          <artifactId>tomcat7-maven-plugin</artifactId>
          <version>2.1</version>
          <configuration>
            <port>80</port>
            <path>/</path>
          </configuration>
        </plugin>
          <plugin>
              <groupId>org.apache.maven.plugins</groupId>
              <artifactId>maven-compiler-plugin</artifactId>
              <configuration>
                  <source>8</source>
                  <target>8</target>
              </configuration>
          </plugin>
      </plugins>
    </build>
  </project>
  
  ```

- 创建对应的配置类

  ```java
  public class ServletContainersInitConfig extends AbstractAnnotationConfigDispatcherServletInitializer {
      protected Class<?>[] getRootConfigClasses() {
          return new Class[0];
      }
  
      protected Class<?>[] getServletConfigClasses() {
          return new Class[]{SpringMvcConfig.class};
      }
  
      protected String[] getServletMappings() {
          return new String[]{"/"};
      }
  
      //乱码处理
      @Override
      protected Filter[] getServletFilters() {
          CharacterEncodingFilter filter = new CharacterEncodingFilter();
          filter.setEncoding("UTF-8");
          return new Filter[]{filter};
      }
  }
  
  @Configuration
  @ComponentScan({"com.itheima.controller"})
  @EnableWebMvc
  public class SpringMvcConfig{
     
  }
  ```

- 创建模型类Book

  ```java
  public class Book {
      private String name;
      private double price;
  
      public String getName() {
          return name;
      }
  
      public void setName(String name) {
          this.name = name;
      }
  
      public double getPrice() {
          return price;
      }
  
      public void setPrice(double price) {
          this.price = price;
      }
  
      @Override
      public String toString() {
          return "Book{" +
                  "书名='" + name + '\'' +
                  ", 价格=" + price +
                  '}';
      }
  }
  ```

- 编写Controller

  ```java
  @RestController
  @RequestMapping("/books")
  public class BookController {
  
      @PostMapping
      public String save(@RequestBody Book book){
          System.out.println("book save..." + book);
          return "{'module':'book save'}";
      }
  
      @DeleteMapping("/{id}")
      public String delete(@PathVariable Integer id){
          System.out.println("book delete..." + id);
          return "{'module':'book delete'}";
      }
  
      @PutMapping
      public String update(@RequestBody Book book){
          System.out.println("book update..."+book);
          return "{'module':'book update'}";
      }
  
      @GetMapping("/{id}")
      public String getById(@PathVariable Integer id){
          System.out.println("book getById..."+id);
          return "{'module':'book getById'}";
      }
  
      @GetMapping
      public String getAll(){
          System.out.println("book getAll...");
          return "{'module':'book getAll'}";
      }
  }
  ```

最终创建好的项目结构如下:

![1630677370998](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/1630677370998.png)

###### 拦截器开发

**步骤1:创建拦截器类**

让类实现HandlerInterceptor接口，重写接口中的三个方法。

```java
@Component
//定义拦截器类，实现HandlerInterceptor接口
//注意当前类必须受Spring容器控制
public class ProjectInterceptor implements HandlerInterceptor {
    @Override
    //原始方法调用前执行的内容
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("preHandle...");
        return true;
    }

    @Override
    //原始方法调用后执行的内容
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println("postHandle...");
    }

    @Override
    //原始方法调用完成后执行的内容
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.out.println("afterCompletion...");
    }
}
```

**注意:**拦截器类要被SpringMVC容器扫描到。

**步骤2:配置拦截器类**

```java
@Configuration
public class SpringMvcSupport extends WebMvcConfigurationSupport {
    @Autowired
    private ProjectInterceptor projectInterceptor;

    @Override
    protected void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/pages/**").addResourceLocations("/pages/");
    }

    @Override
    protected void addInterceptors(InterceptorRegistry registry) {
        //配置拦截器
        registry.addInterceptor(projectInterceptor).addPathPatterns("/books" );
    }
}
```

**步骤3:SpringMVC添加SpringMvcSupport包扫描**

```java
@Configuration
@ComponentScan({"com.itheima.controller","com.itheima.config"})
@EnableWebMvc
public class SpringMvcConfig{
   
}
```

**步骤4:运行程序测试**

使用PostMan发送`http://localhost/books`

![1630678114224](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/1630678114224.png)

如果发送`http://localhost/books/100`会发现拦截器没有被执行，原因是拦截器的`addPathPatterns`方法配置的拦截路径是`/books`,我们现在发送的是`/books/100`，所以没有匹配上，因此没有拦截，拦截器就不会执行。

**步骤5:修改拦截器拦截规则**

```java
@Configuration
public class SpringMvcSupport extends WebMvcConfigurationSupport {
    @Autowired
    private ProjectInterceptor projectInterceptor;

    @Override
    protected void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/pages/**").addResourceLocations("/pages/");
    }

    @Override
    protected void addInterceptors(InterceptorRegistry registry) {
        //配置拦截器
        registry.addInterceptor(projectInterceptor).addPathPatterns("/books","/books/*" );
    }
}
```

这个时候，如果再次访问`http://localhost/books/100`，拦截器就会被执行。

最后说一件事，就是拦截器中的`preHandler`方法，如果返回true,则代表放行，会执行原始Controller类中要请求的方法，如果返回false，则代表拦截，后面的就不会再执行了。

**步骤6:简化SpringMvcSupport的编写**

```java
@Configuration
@ComponentScan({"com.itheima.controller"})
@EnableWebMvc
//实现WebMvcConfigurer接口可以简化开发，但具有一定的侵入性
public class SpringMvcConfig implements WebMvcConfigurer {
    @Autowired
    private ProjectInterceptor projectInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //配置多拦截器
        registry.addInterceptor(projectInterceptor).addPathPatterns("/books","/books/*");
    }
}
```

此后咱们就不用再写`SpringMvcSupport`类了。

最后我们来看下拦截器的执行流程:

![1630679464294](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/1630679464294.png)

当有拦截器后，请求会先进入preHandle方法，

​	如果方法返回true，则放行继续执行后面的handle[controller的方法]和后面的方法

​	如果返回false，则直接跳过后面方法的执行。

##### 拦截器参数

###### 前置处理方法

原始方法之前运行preHandle

```java
public boolean preHandle(HttpServletRequest request,
                         HttpServletResponse response,
                         Object handler) throws Exception {
    System.out.println("preHandle");
    return true;
}
```

* request:请求对象
* response:响应对象
* handler:被调用的处理器对象，本质上是一个方法对象，对反射中的Method对象进行了再包装

使用request对象可以获取请求数据中的内容，如获取请求头的`Content-Type`

```java
public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
    String contentType = request.getHeader("Content-Type");
    System.out.println("preHandle..."+contentType);
    return true;
}
```

使用handler参数，可以获取方法的相关信息

```java
public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
    HandlerMethod hm = (HandlerMethod)handler;
    String methodName = hm.getMethod().getName();//可以获取方法的名称
    System.out.println("preHandle..."+methodName);
    return true;
}
```

###### 后置处理方法

原始方法运行后运行，如果原始方法被拦截，则不执行  

```java
public void postHandle(HttpServletRequest request,
                       HttpServletResponse response,
                       Object handler,
                       ModelAndView modelAndView) throws Exception {
    System.out.println("postHandle");
}
```

前三个参数和上面的是一致的。

modelAndView:如果处理器执行完成具有返回结果，可以读取到对应数据与页面信息，并进行调整

因为咱们现在都是返回json数据，所以该参数的使用率不高。

###### 完成处理方法

拦截器最后执行的方法，无论原始方法是否执行

```java
public void afterCompletion(HttpServletRequest request,
                            HttpServletResponse response,
                            Object handler,
                            Exception ex) throws Exception {
    System.out.println("afterCompletion");
}
```

前三个参数与上面的是一致的。

ex:如果处理器执行过程中出现异常对象，可以针对异常情况进行单独处理  

因为我们现在已经有全局异常处理器类，所以该参数的使用率也不高。

这三个方法中，最常用的是==preHandle==,在这个方法中可以通过返回值来决定是否要进行放行，我们可以把业务逻辑放在该方法中，如果满足业务则返回true放行，不满足则返回false拦截。

##### 拦截器链配置

目前，我们在项目中只添加了一个拦截器，如果有多个，该如何配置?配置多个后，执行顺序是什么?

###### 步骤1:创建拦截器类

实现接口，并重写接口中的方法

```java
@Component
public class ProjectInterceptor2 implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("preHandle...222");
        return false;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println("postHandle...222");
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.out.println("afterCompletion...222");
    }
}
```

###### 步骤2:配置拦截器类

```java
@Configuration
@ComponentScan({"com.itheima.controller"})
@EnableWebMvc
//实现WebMvcConfigurer接口可以简化开发，但具有一定的侵入性
public class SpringMvcConfig implements WebMvcConfigurer {
    @Autowired
    private ProjectInterceptor projectInterceptor;
    @Autowired
    private ProjectInterceptor2 projectInterceptor2;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //配置多拦截器
        registry.addInterceptor(projectInterceptor).addPathPatterns("/books","/books/*");
        registry.addInterceptor(projectInterceptor2).addPathPatterns("/books","/books/*");
    }
}
```

步骤3:运行程序，观察顺序

![1630680435269](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/1630680435269.png)

拦截器执行的顺序是和配置顺序有关。就和前面所提到的运维人员进入机房的案例，先进后出。

* 当配置多个拦截器时，形成拦截器链
* 拦截器链的运行顺序参照拦截器添加顺序为准
* 当拦截器中出现对原始处理器的拦截，后面的拦截器均终止运行
* 当拦截器运行中断，仅运行配置在前面的拦截器的afterCompletion操作

![1630680579735](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/1630680579735.png)

preHandle：与配置顺序相同，必定运行

postHandle:与配置顺序相反，可能不运行

afterCompletion:与配置顺序相反，可能不运行。

这个顺序不太好记，最终只需要把握住一个原则即可:==以最终的运行结果为准==

### SpringMVC总结

#### 知识点1：@Controller

| 名称 | @Controller                   |
| ---- | ----------------------------- |
| 类型 | 类注解                        |
| 位置 | SpringMVC控制器类定义上方     |
| 作用 | 设定SpringMVC的核心控制器bean |

#### 知识点2：@RequestMapping

| 名称     | @RequestMapping                 |
| -------- | ------------------------------- |
| 类型     | 类注解或方法注解                |
| 位置     | SpringMVC控制器类或方法定义上方 |
| 作用     | 设置当前控制器方法请求访问路径  |
| 相关属性 | value(默认)，请求访问路径       |

#### 知识点3：@ResponseBody

| 名称 | @ResponseBody                                    |
| ---- | ------------------------------------------------ |
| 类型 | 类注解或方法注解                                 |
| 位置 | SpringMVC控制器类或方法定义上方                  |
| 作用 | 设置当前控制器方法响应内容为当前返回值，无需解析 |

#### 知识点4：@ComponentScan

| 名称     | @ComponentScan                                               |
| -------- | ------------------------------------------------------------ |
| 类型     | 类注解                                                       |
| 位置     | 类定义上方                                                   |
| 作用     | 设置spring配置类扫描路径，用于加载使用注解格式定义的bean     |
| 相关属性 | excludeFilters:排除扫描路径中加载的bean,需要指定类别(type)和具体项(classes)<br/>includeFilters:加载指定的bean，需要指定类别(type)和具体项(classes) |

#### 知识点5：@RequestParam

| 名称     | @RequestParam                                          |
| -------- | ------------------------------------------------------ |
| 类型     | 形参注解                                               |
| 位置     | SpringMVC控制器方法形参定义前面                        |
| 作用     | 绑定请求参数与处理器方法形参间的关系                   |
| 相关参数 | required：是否为必传参数 <br/>defaultValue：参数默认值 |

#### 知识点6：@EnableWebMvc

| 名称 | @EnableWebMvc             |
| ---- | ------------------------- |
| 类型 | ==配置类注解==            |
| 位置 | SpringMVC配置类定义上方   |
| 作用 | 开启SpringMVC多项辅助功能 |

#### 知识点7：@RequestBody

| 名称 | @RequestBody                                                 |
| ---- | ------------------------------------------------------------ |
| 类型 | ==形参注解==                                                 |
| 位置 | SpringMVC控制器方法形参定义前面                              |
| 作用 | 将请求中请求体所包含的数据传递给请求参数，此注解一个处理器方法只能使用一次 |

#### 知识点8：@DateTimeFormat

| 名称     | @DateTimeFormat                 |
| -------- | ------------------------------- |
| 类型     | ==形参注解==                    |
| 位置     | SpringMVC控制器方法形参前面     |
| 作用     | 设定日期时间型数据格式          |
| 相关属性 | pattern：指定日期时间格式字符串 |

#### 知识点9：@ResponseBody

| 名称     | @ResponseBody                                                |
| -------- | ------------------------------------------------------------ |
| 类型     | ==方法\类注解==                                              |
| 位置     | SpringMVC控制器方法定义上方和控制类上                        |
| 作用     | 设置当前控制器返回值作为响应体,<br/>写在类上，该类的所有方法都有该注解功能 |
| 相关属性 | pattern：指定日期时间格式字符串                              |

#### 知识点10：@RestController

| 名称 | @RestController                                              |
| ---- | ------------------------------------------------------------ |
| 类型 | ==类注解==                                                   |
| 位置 | 基于SpringMVC的RESTful开发控制器类定义上方                   |
| 作用 | 设置当前控制器类为RESTful风格，<br/>等同于@Controller与@ResponseBody两个注解组合功能 |

#### 知识点11：@GetMapping @PostMapping @PutMapping @DeleteMapping

| 名称     | @GetMapping @PostMapping @PutMapping @DeleteMapping          |
| -------- | ------------------------------------------------------------ |
| 类型     | ==方法注解==                                                 |
| 位置     | 基于SpringMVC的RESTful开发控制器方法定义上方                 |
| 作用     | 设置当前控制器方法请求访问路径与请求动作，每种对应一个请求动作，<br/>例如@GetMapping对应GET请求 |
| 相关属性 | value（默认）：请求访问路径                                  |

#### 知识点12：@RestControllerAdvice

| 名称 | @RestControllerAdvice              |
| ---- | ---------------------------------- |
| 类型 | ==类注解==                         |
| 位置 | Rest风格开发的控制器增强类定义上方 |
| 作用 | 为Rest风格开发的控制器类做增强     |

**说明:**此注解自带@ResponseBody注解与@Component注解，具备对应的功能

![1630659060451](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/1630659060451.png)

#### 知识点13：@ExceptionHandler

| 名称 | @ExceptionHandler                                            |
| ---- | ------------------------------------------------------------ |
| 类型 | ==方法注解==                                                 |
| 位置 | 专用于异常处理的控制器方法上方                               |
| 作用 | 设置指定异常的处理方案，功能等同于控制器方法，<br/>出现异常后终止原始控制器执行,并转入当前方法执行 |

**说明：**此类方法可以根据处理的异常不同，制作多个方法分别处理对应的异常

## SpringBoot

### SpringBoot简介

`SpringBoot` 是由 `Pivotal` 团队提供的全新框架，其设计目的是用来==简化== `Spring` 应用的==初始搭建==以及==开发过程==。

使用了 `Spring` 框架后已经简化了我们的开发。而 `SpringBoot` 又是对 `Spring` 开发进行简化的，可想而知 `SpringBoot` 使用的简单及广泛性。既然 `SpringBoot` 是用来简化 `Spring` 开发的，那我们就先回顾一下，以 `SpringMVC` 开发为例：

1. **创建工程，并在 `pom.xml` 配置文件中配置所依赖的坐标**

<img src="https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20210911132335452.png" alt="image-20210911132335452" style="zoom:50%;" />

2. **编写 `web3.0` 的配置类**

   作为 `web` 程序，`web3.0` 的配置类不能缺少，而这个配置类还是比较麻烦的，代码如下

<img src="https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20210911133112602.png" alt="image-20210911133112602" style="zoom:50%;" />

3. **编写 `SpringMVC` 的配置类**

<img src="https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20210911133219847.png" alt="image-20210911133219847" style="zoom:50%;" />

​	做到这只是将工程的架子搭起来。要想被外界访问，最起码还需要提供一个 `Controller` 类，在该类中提供一个方法。

4. **编写 `Controller` 类**

<img src="https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20210911133532151.png" alt="image-20210911133532151" style="zoom:50%;" />

从上面的 `SpringMVC` 程序开发可以看到，前三步都是在搭建环境，而且这三步基本都是固定的。`SpringBoot` 就是对这三步进行简化了。接下来我们通过一个入门案例来体现 `SpingBoot` 简化 `Spring` 开发。

### SpringBoot快速入门

`SpringBoot` 开发起来特别简单，分为如下几步：

* 创建新模块，选择Spring初始化，并配置模块相关基础信息
* 选择当前模块需要使用的技术集
* 开发控制器类
* 运行自动生成的Application类

知道了 `SpringBoot` 的开发步骤后，接下来我们进行具体的操作

#### 创建新模块

![image-20240418160635625](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240418160635625.png) 

![image-20240418160751831](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240418160751831.png) 

#### 创建 `Controller`

在  `com.itheima.controller` 包下创建 `BookController` ，代码如下：

```java
@RestController
@RequestMapping("/books")
public class BookController {

    @GetMapping("/{id}")
    public String getById(@PathVariable Integer id){
        System.out.println("id ==> "+id);
        return "hello , spring boot!";
    }
}
```

#### 启动服务器

运行 `SpringBoot` 工程不需要使用本地的 `Tomcat` 和 插件，只运行项目 `com.itheima` 包下的 `Application` 类，我们就可以在控制台看出如下信息

![image-20210911165642280](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20210911165642280.png)

#### 进行测试

使用 `Postman` 工具来测试我们的程序

![image-20210911160850121](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20210911160850121.png)

通过上面的入门案例我们可以看到使用 `SpringBoot` 进行开发，使整个开发变得很简单，那它是如何做到的呢？

要研究这个问题，我们需要看看 `Application` 类和 `pom.xml` 都书写了什么。先看看 `Applicaion` 类，该类内容如下：

```java
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
```

这个类中的东西很简单，就在类上添加了一个 `@SpringBootApplication` 注解，而在主方法中就一行代码。我们在启动服务器时就是执行的该类中的主方法。

### SpringBoot工程快速启动

#### 问题导入

<img src="https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20210911180828611.png" alt="image-20210911180828611" style="zoom:50%;" />

以后我们和前端开发人员协同开发，而前端开发人员需要测试前端程序就需要后端开启服务器，这就受制于后端开发人员。为了摆脱这个受制，前端开发人员尝试着在自己电脑上安装 `Tomcat` 和 `Idea` ，在自己电脑上启动后端程序，这显然不现实。

我们后端可以将 `SpringBoot` 工程打成 `jar` 包，该 `jar` 包运行不依赖于 `Tomcat` 和 `Idea` 这些工具也可以正常运行，只是这个 `jar` 包在运行过程中连接和我们自己程序相同的 `Mysql` 数据库即可。这样就可以解决这个问题，如下图

<img src="https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20210911181714437.png" alt="image-20210911181714437" style="zoom:50%;" />

那现在问题是如何打包呢？

#### 打包

由于我们在构建 `SpringBoot` 工程时已经在 `pom.xml` 中配置了如下插件

```xml
<plugin>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-maven-plugin</artifactId>
</plugin>
```

所以我们只需要使用 `Maven` 的 `package` 指令打包就会在 `target` 目录下生成对应的 `Jar` 包。

> ==注意：该插件必须配置，不然打好的 `jar` 包也是有问题的。==

#### 启动

进入 `jar` 包所在位置，在 `命令提示符` 中输入如下命令，==**注意：要在pom配置中，把一个东西置为false**==
![image-20240418161345704](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240418161345704.png)

```shell
java -jar springboot_01_quickstart-0.0.1-SNAPSHOT.jar
```

执行上述命令就可以看到 `SpringBoot` 运行的日志信息

<img src="https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20210911182956629.png" alt="image-20210911182956629" style="zoom:60%;" /> 

### SpringBoot概述

`SpringBoot` 是由Pivotal团队提供的全新框架，其设计目的是用来==简化==Spring应用的==初始搭建==以及==开发过程==。

大家已经感受了 `SpringBoot` 程序，回过头看看 `SpringBoot` 主要作用是什么，就是简化 `Spring` 的搭建过程和开发过程。

原始 `Spring` 环境搭建和开发存在以下问题：

* 配置繁琐
* 依赖设置繁琐

`SpringBoot` 程序优点恰巧就是针对 `Spring` 的缺点

* 自动配置。这个是用来解决 `Spring` 程序配置繁琐的问题
* 起步依赖。这个是用来解决 `Spring` 程序依赖设置繁琐的问题
* 辅助功能（内置服务器,...）。我们在启动 `SpringBoot` 程序时既没有使用本地的 `tomcat` 也没有使用 `tomcat` 插件，而是使用 `SpringBoot` 内置的服务器。

#### 程序启动

创建的每一个 `SpringBoot` 程序时都包含一个类似于下面的类，我们将这个类称作引导类

```java
@SpringBootApplication
public class Springboot01QuickstartApplication {
    
    public static void main(String[] args) {
        SpringApplication.run(Springboot01QuickstartApplication.class, args);
    }
}
```

==注意：==

* `SpringBoot` 在创建项目时，采用jar的打包方式

* `SpringBoot` 的引导类是项目的入口，运行 `main` 方法就可以启动项目

  因为我们在 `pom.xml` 中配置了 `spring-boot-starter-web` 依赖，而该依赖通过前面的学习知道它依赖 `tomcat` ，所以运行 `main` 方法就可以使用 `tomcat` 启动咱们的工程。

#### 切换web服务器

现在我们启动工程使用的是 `tomcat` 服务器，那能不能不使用 `tomcat` 而使用 `jetty` 服务器，`jetty` 在我们 `maven` 高级时讲 `maven` 私服使用的服务器。而要切换 `web` 服务器就需要将默认的 `tomcat` 服务器给排除掉，怎么排除呢？使用 `exclusion` 标签

```xml
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-web</artifactId>
    <exclusions>
        <exclusion>
            <artifactId>spring-boot-starter-tomcat</artifactId>
            <groupId>org.springframework.boot</groupId>
        </exclusion>
    </exclusions>
</dependency>
```

现在我们运行引导类可以吗？运行一下试试，打印的日志信息如下

![image-20210918232512707](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20210918232512707.png)

程序直接停止了，为什么呢？那是因为排除了 `tomcat` 服务器，程序中就没有服务器了。所以此时不光要排除 `tomcat` 服务器，还要引入 `jetty` 服务器。在 `pom.xml` 中因为 `jetty` 的起步依赖

```xml
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-jetty</artifactId>
</dependency>
```

接下来再次运行引导类，在日志信息中就可以看到使用的是 `jetty` 服务器

![image-20210918232904623](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20210918232904623.png)

**小结：**

通过切换服务器，我们不难发现在使用 `SpringBoot` 换技术时只需要导入该技术的起步依赖即可。

### 配置文件

#### 配置文件格式

我们现在启动服务器默认的端口号是 `8080`，访问路径可以书写为

```
http://localhost:8080/books/1
```

在线上环境我们还是希望将端口号改为 `80`，这样在访问的时候就可以不写端口号了，如下

```
http://localhost/books/1
```

而 `SpringBoot` 程序如何修改呢？`SpringBoot` 提供了多种属性配置方式

* `application.properties`

  ```
  server.port=80
  ```

* `application.yml`

  ```yaml
  server:
  	port: 81
  ```

* `application.yaml`

  ```yaml
  server:
  	port: 82
  ```

> ==注意：`SpringBoot` 程序的配置文件名必须是 `application` ，只是后缀名不同而已。==

##### 环境准备

创建一个新工程 `springboot_02_base_config` 用来演示不同的配置文件，工程环境和入门案例一模一样，结构如下：

<img src="https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20210917151314753.png" alt="image-20210917151314753" style="zoom:80%;" />

在该工程中的 `com.itheima.controller` 包下创建一个名为 `BookController` 的控制器。内容如下：

```java
@RestController
@RequestMapping("/books")
public class BookController {

    @GetMapping("/{id}")
    public String getById(@PathVariable Integer id){
        System.out.println("id ==> "+id);
        return "hello , spring boot!";
    }
}
```

##### 不同配置文件演示

* **application.properties配置文件**

现在需要进行配置，配合文件必须放在 `resources` 目录下，而该目录下有一个名为 `application.properties` 的配置文件，我们就可以在该配置文件中修改端口号，在该配置文件中书写 `port` ，`Idea` 就会提示，如下

<img src="https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20210917161422535.png" alt="image-20210917161422535" style="zoom:80%;" />

`application.properties` 配置文件内容如下：

```properties
server.port=80
```

启动服务，会在控制台打印出日志信息，从日志信息中可以看到绑定的端口号已经修改了

<img src="https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20210917161720855.png" alt="image-20210917161720855" style="zoom:80%;" />

* **application.yml配置文件**

删除 `application.properties` 配置文件中的内容。在 `resources` 下创建一个名为 `application.yml` 的配置文件，在该文件中书写端口号的配置项，格式如下：

```yaml
server:
	port: 81
```

> ==注意： 在`:`后，数据前一定要加空格。==

而在 `yml` 配置文件中也是有提示功能的，我们也可以在该文件中书写 `port` ，然后 `idea` 就会提示并书写成上面的格式

<img src="https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20210917162512646.png" alt="image-20210917162512646" style="zoom:80%;" />

启动服务，可以在控制台看到绑定的端口号是 `81`

![image-20210917162700711](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20210917162700711.png)

* **application.yaml配置文件**

删除 `application.yml` 配置文件和 `application.properties` 配置文件内容，然后在 `resources` 下创建名为 `application.yaml` 的配置文件，配置内容和后缀名为 `yml` 的配置文件中的内容相同，只是使用了不同的后缀名而已

`application.yaml` 配置文件内容如下：

```yaml
server:
	port: 83
```

启动服务，在控制台可以看到绑定的端口号

![image-20210917163335913](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20210917163335913.png)

==注意：在配合文件中如果没有提示，可以使用一下方式解决==

* 点击 `File` 选中 `Project Structure`

<img src="https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20210917163557071.png" alt="image-20210917163557071" style="zoom:80%;" />

* 弹出如下窗口，按图中标记红框进行选择

<img src="https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20210917163736458.png" alt="image-20210917163736458" style="zoom:70%;" />

* 通过上述操作，会弹出如下窗口

<img src="https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20210917163818051.png" alt="image-20210917163818051" style="zoom:80%;" />

* 点击上图的 `+` 号，弹出选择该模块的配置文件

<img src="https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20210917163828518.png" alt="image-20210917163828518" style="zoom:80%;" />

* 通过上述几步后，就可以看到如下界面。`properties` 类型的配合文件有一个，`ymal` 类型的配置文件有两个

<img src="https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20210917163846243.png" alt="image-20210917163846243" style="zoom:80%;" />

##### 三种配合文件的优先级

在三种配合文件中分别配置不同的端口号，启动服务查看绑定的端口号。用这种方式就可以看到哪个配置文件的优先级更高一些

`application.properties` 文件内容如下：

```properties
server.port=80
```

`application.yml` 文件内容如下：

```yaml
server:
	port: 81
```

`application.yaml` 文件内容如下：

```yaml
server:
	port: 82
```

启动服务，在控制台可以看到使用的端口号是 `80`。说明 `application.properties` 的优先级最高

注释掉 `application.properties` 配置文件内容。再次启动服务，在控制台可以看到使用的端口号是 `81`，说明 `application.yml` 配置文件为第二优先级。

从上述的验证结果可以确定三种配置文件的优先级是：

==`application.properties`  >  `application.yml`   >  `application.yaml`==

> ==注意：==
>
> * `SpringBoot` 核心配置文件名为 `application`
>
> * `SpringBoot` 内置属性过多，且所有属性集中在一起修改，在使用时，通过提示键+关键字修改属性
>
>   例如要设置日志的级别时，可以在配置文件中书写 `logging`，就会提示出来。配置内容如下
>
>   ```yaml
>   logging:
>     level:
>       root: info
>   ```

#### yaml格式

上面讲了三种不同类型的配置文件，而 `properties` 类型的配合文件之前我们学习过，接下来我们重点学习 `yaml` 类型的配置文件。

**YAML（YAML Ain't Markup Language），一种数据序列化格式。**这种格式的配置文件在近些年已经占有主导地位，那么这种配置文件和前期使用的配置文件是有一些优势的，我们先看之前使用的配置文件。

最开始我们使用的是 `xml` ，格式如下：

```xml
<enterprise>
    <name>itcast</name>
    <age>16</age>
    <tel>4006184000</tel>
</enterprise>
```

而 `properties` 类型的配置文件如下

```properties
enterprise.name=itcast
enterprise.age=16
enterprise.tel=4006184000
```

`yaml` 类型的配置文件内容如下

```yaml
enterprise:
	name: itcast
	age: 16
	tel: 4006184000
```

**优点：**

* 容易阅读

  `yaml` 类型的配置文件比 `xml` 类型的配置文件更容易阅读，结构更加清晰

* 容易与脚本语言交互

* 以数据为核心，重数据轻格式

  `yaml` 更注重数据，而 `xml` 更注重格式

**YAML 文件扩展名：**

* `.yml` (主流)
* `.yaml`

上面两种后缀名都可以，以后使用更多的还是 `yml` 的。

##### 语法规则

* 大小写敏感

* 属性层级关系使用多行描述，每行结尾使用冒号结束

* 使用缩进表示层级关系，同层级左侧对齐，只允许使用空格（不允许使用Tab键）

  空格的个数并不重要，只要保证同层级的左侧对齐即可。

* 属性值前面添加空格（属性名与属性值之间使用冒号+空格作为分隔）

* \# 表示注释

==核心规则：数据前面要加空格与冒号隔开==

数组数据在数据书写位置的下方使用减号作为数据开始符号，每行书写一个数据，减号与数据间空格分隔，例如

```yaml
enterprise:
  name: itcast
  age: 16
  tel: 4006184000
  subject:
    - Java
    - 前端
    - 大数据
```

#### yaml配置文件数据读取

##### 环境准备

新创建一个名为 `springboot_03_read_data` 的 `SpringBoot` 工程，目录结构如下

<img src="https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20210917172736484.png" alt="image-20210917172736484" style="zoom:80%;" />

在 `com.itheima.controller` 包写创建名为 `BookController` 的控制器，内容如下

```java
@RestController
@RequestMapping("/books")
public class BookController {

    @GetMapping("/{id}")
    public String getById(@PathVariable Integer id){
        System.out.println("id ==> "+id);
        return "hello , spring boot!";
    }
}
```

在 `com.itheima.domain` 包下创建一个名为 `Enterprise` 的实体类等会用来封装数据，内容如下

```java
public class Enterprise {
    private String name;
    private int age;
    private String tel;
    private String[] subject;
    
    //setter and getter
    
    //toString
}
```

在 `resources` 下创建一个名为 `application.yml` 的配置文件，里面配置了不同的数据，内容如下

```yaml
lesson: SpringBoot

server:
  port: 80

enterprise:
  name: itcast
  age: 16
  tel: 4006184000
  subject:
    - Java
    - 前端
    - 大数据
```

##### 读取配置数据

###### 使用 @Value注解

使用 `@Value("表达式")` 注解可以从配合文件中读取数据，注解中用于读取属性名引用方式是：`${一级属性名.二级属性名……}`

我们可以在 `BookController` 中使用 `@Value`  注解读取配合文件数据，如下

```java
@RestController
@RequestMapping("/books")
public class BookController {
    
    @Value("${lesson}")
    private String lesson;
    @Value("${server.port}")
    private Integer port;
    @Value("${enterprise.subject[0]}")
    private String subject_00;

    @GetMapping("/{id}")
    public String getById(@PathVariable Integer id){
        System.out.println(lesson);
        System.out.println(port);
        System.out.println(subject_00);
        return "hello , spring boot!";
    }
}
```

###### Environment对象

上面方式读取到的数据特别零散，`SpringBoot` 还可以使用 `@Autowired` 注解注入 `Environment` 对象的方式读取数据。这种方式 `SpringBoot` 会将配置文件中所有的数据封装到 `Environment` 对象中，如果需要使用哪个数据只需要通过调用 `Environment` 对象的 `getProperty(String name)` 方法获取。具体代码如下：

```java
@RestController
@RequestMapping("/books")
public class BookController {
    
    @Autowired
    private Environment env;
    
    @GetMapping("/{id}")
    public String getById(@PathVariable Integer id){
        System.out.println(env.getProperty("lesson"));
        System.out.println(env.getProperty("enterprise.name"));
        System.out.println(env.getProperty("enterprise.subject[0]"));
        return "hello , spring boot!";
    }
}
```

> ==注意：这种方式，框架内容大量数据，而在开发中我们很少使用。==

###### 自定义对象

`SpringBoot` 还提供了将配置文件中的数据封装到我们自定义的实体类对象中的方式。具体操作如下：

* 将实体类 `bean` 的创建交给 `Spring` 管理。

  在类上添加 `@Component` 注解

* 使用 `@ConfigurationProperties` 注解表示加载配置文件

  在该注解中也可以使用 `prefix` 属性指定只加载指定前缀的数据

* 在 `BookController` 中进行注入

**具体代码如下：**

`Enterprise` 实体类内容如下：

```java
@Component
@ConfigurationProperties(prefix = "enterprise")
public class Enterprise {
    private String name;
    private int age;
    private String tel;
    private String[] subject;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String[] getSubject() {
        return subject;
    }

    public void setSubject(String[] subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "Enterprise{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", tel='" + tel + '\'' +
                ", subject=" + Arrays.toString(subject) +
                '}';
    }
}
```

`BookController` 内容如下：

```java
@RestController
@RequestMapping("/books")
public class BookController {
    
    @Autowired
    private Enterprise enterprise;

    @GetMapping("/{id}")
    public String getById(@PathVariable Integer id){
        System.out.println(enterprise.getName());
        System.out.println(enterprise.getAge());
        System.out.println(enterprise.getSubject());
        System.out.println(enterprise.getTel());
        System.out.println(enterprise.getSubject()[0]);
        return "hello , spring boot!";
    }
}
```

==注意：==

使用第三种方式，在实体类上有如下警告提示

<img src="https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20210917180919390.png" alt="image-20210917180919390" style="zoom:70%;" />

这个警告提示解决是在 `pom.xml` 中添加如下依赖即可

```xml
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-configuration-processor</artifactId>
    <optional>true</optional>
</dependency>
```

### 多环境配置

以后在工作中，对于开发环境、测试环境、生产环境的配置肯定都不相同，比如我们开发阶段会在自己的电脑上安装 `mysql` ，连接自己电脑上的 `mysql` 即可，但是项目开发完毕后要上线就需要该配置，将环境的配置改为线上环境的。

<img src="https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20210917185253557.png" alt="image-20210917185253557" style="zoom:60%;" />

来回的修改配置会很麻烦，而 `SpringBoot` 给开发者提供了多环境的快捷配置，需要切换环境时只需要改一个配置即可。不同类型的配置文件多环境开发的配置都不相同，接下来对不同类型的配置文件进行说明

#### yaml文件

在 `application.yml` 中使用 `---` 来分割不同的配置，内容如下

```yaml
#开发
spring:
  profiles: dev #给开发环境起的名字
server:
  port: 80
---
#生产
spring:
  profiles: pro #给生产环境起的名字
server:
  port: 81
---
#测试
spring:
  profiles: test #给测试环境起的名字
server:
  port: 82
---
```

上面配置中 `spring.profiles` 是用来给不同的配置起名字的。而如何告知 `SpringBoot` 使用哪段配置呢？可以使用如下配置来启用都一段配置

```yaml
#设置启用的环境
spring:
  profiles:
    active: dev  #表示使用的是开发环境的配置
```

综上所述，`application.yml` 配置文件内容如下

```yaml
#设置启用的环境
spring:
  profiles:
    active: dev

---
#开发
spring:
  profiles: dev
server:
  port: 80
---
#生产
spring:
  profiles: pro
server:
  port: 81
---
#测试
spring:
  profiles: test
server:
  port: 82
---
```

==注意：==

在上面配置中给不同配置起名字的 `spring.profiles` 配置项已经过时。最新用来起名字的配置项是 

```yaml
#开发
spring:
  config:
    activate:
      on-profile: dev
```

#### properties文件

`properties` 类型的配置文件配置多环境需要定义不同的配置文件

* `application-dev.properties` 是开发环境的配置文件。我们在该文件中配置端口号为 `80`

  ```properties
  server.port=80
  ```

* `application-test.properties` 是测试环境的配置文件。我们在该文件中配置端口号为 `81`

  ```properties
  server.port=81
  ```

* `application-pro.properties` 是生产环境的配置文件。我们在该文件中配置端口号为 `82`

  ```properties
  server.port=82
  ```

`SpringBoot` 只会默认加载名为 `application.properties` 的配置文件，所以需要在 `application.properties` 配置文件中设置启用哪个配置文件，配置如下:

```properties
spring.profiles.active=pro
```

#### 命令行启动参数设置

使用 `SpringBoot` 开发的程序以后都是打成 `jar` 包，通过 `java -jar xxx.jar` 的方式启动服务的。那么就存在一个问题，如何切换环境呢？因为配置文件打到的jar包中了。

我们知道 `jar` 包其实就是一个压缩包，可以解压缩，然后修改配置，最后再打成jar包就可以了。这种方式显然有点麻烦，而 `SpringBoot` 提供了在运行 `jar` 时设置开启指定的环境的方式，如下

```shell
java –jar xxx.jar –-spring.profiles.active=test
```

那么这种方式能不能临时修改端口号呢？也是可以的，可以通过如下方式

```shell
java –jar xxx.jar –-server.port=88
```

当然也可以同时设置多个配置，比如即指定启用哪个环境配置，又临时指定端口，如下

```shell
java –jar springboot.jar –-server.port=88 –-spring.profiles.active=test
```

大家进行测试后就会发现命令行设置的端口号优先级高（也就是使用的是命令行设置的端口号），配置的优先级其实 `SpringBoot` 官网已经进行了说明，参见 :

```
https://docs.spring.io/spring-boot/docs/current/reference/html/spring-boot-features.html#boot-features-external-config
```

进入上面网站后会看到如下页面

![image-20210917193910191](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20210917193910191.png)

如果使用了多种方式配合同一个配置项，优先级高的生效。

### SpringBoot整合junit

回顾 `Spring` 整合 `junit`

```java
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfig.class)
public class UserServiceTest {
    
    @Autowired
    private BookService bookService;
    
    @Test
    public void testSave(){
        bookService.save();
    }
}
```

使用 `@RunWith` 注解指定运行器，使用 `@ContextConfiguration` 注解来指定配置类或者配置文件。而 `SpringBoot` 整合 `junit` 特别简单，分为以下三步完成

* 在测试类上添加 `SpringBootTest` 注解
* 使用 `@Autowired` 注入要测试的资源
* 定义测试方法进行测试

#### 环境准备

创建一个名为 `springboot_07_test` 的 `SpringBoot` 工程，工程目录结构如下

<img src="https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20210917213556673.png" alt="image-20210917213556673" style="zoom:80%;" />

在 `com.itheima.service` 下创建 `BookService` 接口，内容如下

```java
public interface BookService {
    public void save();
}
```

在 `com.itheima.service.impl` 包写创建一个 `BookServiceImpl` 类，使其实现 `BookService` 接口，内容如下

```java
@Service
public class BookServiceImpl implements BookService {
    @Override
    public void save() {
        System.out.println("book service is running ...");
    }
}
```

#### 编写测试类

在 `test/java` 下创建 `com.itheima` 包，在该包下创建测试类，将 `BookService` 注入到该测试类中

```java
@SpringBootTest
class Springboot07TestApplicationTests {

    @Autowired
    private BookService bookService;

    @Test
    public void save() {
        bookService.save();
    }
}
```

> ==注意：==这里的引导类所在包必须是测试类所在包及其子包。
>
> 例如：
>
> * 引导类所在包是 `com.itheima`
> * 测试类所在包是 `com.itheima`
>
> 如果不满足这个要求的话，就需要在使用 `@SpringBootTest` 注解时，使用 `classes` 属性指定引导类的字节码对象。如 `@SpringBootTest(classes = Springboot07TestApplication.class)`

### SpringBoot整合mybatis

#### 回顾Spring整合Mybatis

`Spring` 整合 `Mybatis` 需要定义很多配置类

* `SpringConfig` 配置类

  * 导入 `JdbcConfig` 配置类

  * 导入 `MybatisConfig` 配置类

    ```java
    @Configuration
    @ComponentScan("com.itheima")
    @PropertySource("classpath:jdbc.properties")
    @Import({JdbcConfig.class,MyBatisConfig.class})
    public class SpringConfig {
    }
    
    ```

* `JdbcConfig` 配置类

  * 定义数据源（加载properties配置项：driver、url、username、password）

    ```java
    public class JdbcConfig {
        @Value("${jdbc.driver}")
        private String driver;
        @Value("${jdbc.url}")
        private String url;
        @Value("${jdbc.username}")
        private String userName;
        @Value("${jdbc.password}")
        private String password;
    
        @Bean
        public DataSource getDataSource(){
            DruidDataSource ds = new DruidDataSource();
            ds.setDriverClassName(driver);
            ds.setUrl(url);
            ds.setUsername(userName);
            ds.setPassword(password);
            return ds;
        }
    }
    ```

* `MybatisConfig` 配置类

  * 定义 `SqlSessionFactoryBean`

  * 定义映射配置

    ```java
    @Bean
    public MapperScannerConfigurer getMapperScannerConfigurer(){
        MapperScannerConfigurer msc = new MapperScannerConfigurer();
        msc.setBasePackage("com.itheima.dao");
        return msc;
    }
    
    @Bean
    public SqlSessionFactoryBean getSqlSessionFactoryBean(DataSource dataSource){
        SqlSessionFactoryBean ssfb = new SqlSessionFactoryBean();
        ssfb.setTypeAliasesPackage("com.itheima.domain");
        ssfb.setDataSource(dataSource);
        return ssfb;
    }
    
    ```

#### SpringBoot整合mybatis

##### 创建模块

* 创建新模块，选择 `Spring Initializr`，并配置模块相关基础信息

<img src="https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20210917215913779.png" alt="image-20210917215913779" style="zoom:80%;" />

* 选择当前模块需要使用的技术集（MyBatis、MySQL）

  <img src="https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20210917215958091.png" alt="image-20210917215958091" style="zoom:80%;" />

##### 定义实体类

在 `com.itheima.domain` 包下定义实体类 `Book`，内容如下

```java
public class Book {
    private Integer id;
    private String name;
    private String type;
    private String description;
    
    //setter and  getter
    
    //toString
}
```

##### 定义dao接口

在 `com.itheima.dao` 包下定义 `BookDao` 接口，内容如下

```java
public interface BookDao {
    @Select("select * from tbl_book where id = #{id}")
    public Book getById(Integer id);
}
```

##### 定义测试类

在 `test/java` 下定义包 `com.itheima` ，在该包下测试类，内容如下

```java
@SpringBootTest
class Springboot08MybatisApplicationTests {

	@Autowired
	private BookDao bookDao;

	@Test
	void testGetById() {
		Book book = bookDao.getById(1);
		System.out.println(book);
	}
}
```

##### 编写配置

我们代码中并没有指定连接哪儿个数据库，用户名是什么，密码是什么。所以这部分需要在 `SpringBoot` 的配置文件中进行配合。

在 `application.yml` 配置文件中配置如下内容

```yml
spring:
  datasource:
    driver-class-name: com.mysql.jdbc.Driver
    url: jdbc:mysql://localhost:3306/ssm_db
    username: root
    password: root
```

##### 测试

运行测试方法，我们会看到如下错误信息

<img src="https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20210917221427930.png" alt="image-20210917221427930" style="zoom:70%;" />

错误信息显示在 `Spring` 容器中没有 `BookDao` 类型的 `bean`。为什么会出现这种情况呢？

原因是 `Mybatis` 会扫描接口并创建接口的代码对象交给 `Spring` 管理，但是现在并没有告诉 `Mybatis` 哪个是 `dao` 接口。而我们要解决这个问题需要在`BookDao` 接口上使用 `@Mapper` ，`BookDao` 接口改进为

```java
@Mapper
public interface BookDao {
    @Select("select * from tbl_book where id = #{id}")
    public Book getById(Integer id);
}
```

> ==注意：==
>
> `SpringBoot` 版本低于2.4.3(不含)，Mysql驱动版本大于8.0时，需要在url连接串中配置时区 `jdbc:mysql://localhost:3306/ssm_db?serverTimezone=UTC`，或在MySQL数据库端配置时区解决此问题

##### 使用Druid数据源

现在我们并没有指定数据源，`SpringBoot` 有默认的数据源，我们也可以指定使用 `Druid` 数据源，按照以下步骤实现

* 导入 `Druid` 依赖

  ```xml
  <dependency>
      <groupId>com.alibaba</groupId>
      <artifactId>druid</artifactId>
      <version>1.1.16</version>
  </dependency>
  ```

* 在 `application.yml` 配置文件配置

  可以通过 `spring.datasource.type` 来配置使用什么数据源。配置文件内容可以改进为

  ```yaml
  spring:
    datasource:
      driver-class-name: com.mysql.cj.jdbc.Driver
      url: jdbc:mysql://localhost:3306/ssm_db?serverTimezone=UTC
      username: root
      password: root
      type: com.alibaba.druid.pool.DruidDataSource
  ```

### SpringBoot案例

`SpringBoot` 到这就已经学习完毕，接下来我们将学习 `SSM` 时做的三大框架整合的案例用 `SpringBoot` 来实现一下。我们完成这个案例基本是将之前做的拷贝过来，修改成 `SpringBoot` 的即可，主要从以下几部分完成

1. pom.xml

   配置起步依赖，必要的资源坐标(druid)

2. application.yml

   设置数据源、端口等

3. 配置类

   全部删除

4. dao

   设置@Mapper

5. 测试类

6. 页面

   放置在resources目录下的static目录中

#### 创建工程

创建 `SpringBoot` 工程，在创建工程时需要勾选 `web`、`mysql`、`mybatis`，工程目录结构如下

<img src="https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20210917225019868.png" alt="image-20210917225019868" style="zoom:80%;" />

由于我们工程中使用到了 `Druid` ，所以需要导入 `Druid` 的坐标

```xml
<dependency>
    <groupId>com.alibaba</groupId>
    <artifactId>druid</artifactId>
    <version>1.1.16</version>
</dependency>
```

#### 代码拷贝

将 `springmvc_11_page` 工程中的 `java` 代码及测试代码连同包拷贝到 `springboot_09_ssm` 工程，按照下图进行拷贝

<img src="https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20210917225715519.png" alt="image-20210917225715519" style="zoom:70%;" />

需要修改的内容如下：

* `Springmvc_11_page` 中 `config` 包下的是配置类，而 `SpringBoot` 工程不需要这些配置类，所以这些可以直接删除

* `dao` 包下的接口上在拷贝到 `springboot_09-ssm` 工程中需要在接口中添加 `@Mapper` 注解

* `BookServiceTest` 测试需要改成 `SpringBoot` 整合 `junit` 的

  ```java
  @SpringBootTest
  public class BookServiceTest {
  
      @Autowired
      private BookService bookService;
  
      @Test
      public void testGetById(){
          Book book = bookService.getById(2);
          System.out.println(book);
      }
  
      @Test
      public void testGetAll(){
          List<Book> all = bookService.getAll();
          System.out.println(all);
      }
  }
  ```

#### 配置文件

在 `application.yml` 配置文件中需要配置如下内容

* 服务的端口号
* 连接数据库的信息
* 数据源

```yaml
server:
  port: 80

spring:
  datasource:
    type: com.alibaba.druid.pool.DruidDataSource
    driver-class-name: com.mysql.cj.jdbc.Driver
    url: jdbc:mysql://localhost:3306/ssm_db #?servierTimezone=UTC
    username: root
    password: root
```

#### 静态资源

在 `SpringBoot` 程序中是没有 `webapp` 目录的，那么在 `SpringBoot` 程序中静态资源需要放在什么位置呢？

静态资源需要放在 `resources` 下的 `static` 下，如下图所示

<img src="https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20210917230702072.png" alt="image-20210917230702072" style="zoom:80%;" /> 

## MyBatis

在前面我们学习MySQL数据库时，都是利用图形化客户端工具(如：idea、datagrip)，来操作数据库的。

> 在客户端工具中，编写增删改查的SQL语句，发给MySQL数据库管理系统，由数据库管理系统执行SQL语句并返回执行结果。
>
> 增删改操作：返回受影响行数
>
> 查询操作：返回结果集(查询的结果)

我们做为后端程序开发人员，通常会使用Java程序来完成对数据库的操作。Java程序操作数据库，现在主流的方式是：Mybatis。

什么是MyBatis?

- MyBatis是一款优秀的 **持久层** **框架**，用于简化JDBC的开发。
- MyBatis本是 Apache的一个开源项目iBatis，2010年这个项目由apache迁移到了google code，并且改名为MyBatis 。2013年11月迁移到Github。

### 基于SpringBoot的Mybatis

需求：使用Mybatis查询所有用户数据。



#### 入门程序分析

以前我们是在图形化客户端工具中编写SQL查询代码，发送给数据库执行，数据库执行后返回操作结果。

![image-20221209155704203](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20221209155704203.png) 



图形化工具会把数据库执行的查询结果，使用表格的形式展现出来

![image-20220901121116813](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20220901121116813.png) 



现在使用Mybatis操作数据库，就是在Mybatis中编写SQL查询代码，发送给数据库执行，数据库执行后返回结果。

![image-20221209155904370](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20221209155904370.png)



 Mybatis会把数据库执行的查询结果，使用实体类封装起来（一行记录对应一个实体类对象）

![image-20221209161623051](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20221209161623051.png)



Mybatis操作数据库的步骤：

1. 准备工作(创建springboot工程、数据库表user、实体类User)

2. 引入Mybatis的相关依赖，配置Mybatis(数据库连接信息)

3. 编写SQL语句(注解/XML)

#### 入门程序实现

##### 准备工作

###### 创建springboot工程

创建springboot工程，并导入 mybatis的起步依赖、mysql的驱动包。

![image-20221209162827242](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20221209162827242.png)

![image-20221209163123443](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20221209163123443.png)

> 项目工程创建完成后，自动在pom.xml文件中，导入Mybatis依赖和MySQL驱动依赖

~~~xml
<!-- 仅供参考：只粘贴了pom.xml中部分内容 -->
<dependencies>
        <!-- mybatis起步依赖 -->
        <dependency>
            <groupId>org.mybatis.spring.boot</groupId>
            <artifactId>mybatis-spring-boot-starter</artifactId>
            <version>2.3.0</version>
        </dependency>

        <!-- mysql驱动包依赖 -->
        <dependency>
            <groupId>com.mysql</groupId>
            <artifactId>mysql-connector-j</artifactId>
            <scope>runtime</scope>
        </dependency>
        
        <!-- spring单元测试 (集成了junit) -->
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-test</artifactId>
            <scope>test</scope>
        </dependency>
</dependencies>
~~~

###### 数据准备

创建用户表user，并创建对应的实体类User。

- 用户表：

```sql
-- 用户表
create table user(
    id int unsigned primary key auto_increment comment 'ID',
    name varchar(100) comment '姓名',
    age tinyint unsigned comment '年龄',
    gender tinyint unsigned comment '性别, 1:男, 2:女',
    phone varchar(11) comment '手机号'
) comment '用户表';

-- 测试数据
insert into user(id, name, age, gender, phone) VALUES (null,'白眉鹰王',55,'1','18800000000');
insert into user(id, name, age, gender, phone) VALUES (null,'金毛狮王',45,'1','18800000001');
insert into user(id, name, age, gender, phone) VALUES (null,'青翼蝠王',38,'1','18800000002');
insert into user(id, name, age, gender, phone) VALUES (null,'紫衫龙王',42,'2','18800000003');
insert into user(id, name, age, gender, phone) VALUES (null,'光明左使',37,'1','18800000004');
insert into user(id, name, age, gender, phone) VALUES (null,'光明右使',48,'1','18800000005');
```

![image-20220901121116813](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20220901121116813.png) 

- 实体类

  - 实体类的属性名与表中的字段名一一对应。

```java
public class User {
    private Integer id;   //id（主键）
    private String name;  //姓名
    private Short age;    //年龄
    private Short gender; //性别
    private String phone; //手机号
    
    //省略GET, SET方法
}
```

![image-20221209170354143](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20221209170354143.png)

##### 配置Mybatis

> 在之前使用图形化客户端工具，连接MySQL数据库时，需要配置：
>
> ![image-20221209172527630](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20221209172527630.png)
>
> 连接数据库的四大参数：
>
> - MySQL驱动类 
> - 登录名
> - 密码
> - 数据库连接字符串

基于上述分析，在Mybatis中要连接数据库，同样也需要以上4个参数配置。

在springboot项目中，可以编写application.properties文件，配置数据库连接信息。我们要连接数据库，就需要配置数据库连接的基本信息，包括：driver-class-name、url 、username，password。

> 在入门程序中，大家可以直接这么配置，后面会介绍什么是驱动。



application.properties:

```properties
#驱动类名称
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
#数据库连接的url
spring.datasource.url=jdbc:mysql://localhost:3306/mybatis
#连接数据库的用户名
spring.datasource.username=root
#连接数据库的密码
spring.datasource.password=1234
```

> 上述的配置，可以直接复制过去，不要敲错了。 全部都是 spring.datasource.xxxx 开头。

##### 编写SQL语句

在创建出来的springboot工程中，在引导类所在包下，在创建一个包 mapper。在mapper包下创建一个接口 UserMapper ，这是一个持久层接口（Mybatis的持久层接口规范一般都叫 XxxMapper）。

![image-20221209175843651](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20221209175843651.png)

UserMapper：

~~~java
import com.itheima.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import java.util.List;

@Mapper
public interface UserMapper {
    
    //查询所有用户数据
    @Select("select id, name, age, gender, phone from user")
    public List<User> list();
    
}
~~~

> @Mapper注解：表示是mybatis中的Mapper接口
>
> - 程序运行时：框架会自动生成接口的实现类对象(代理对象)，并给交Spring的IOC容器管理
>
>  @Select注解：代表的就是select查询，用于书写select查询语句

##### 单元测试

在创建出来的SpringBoot工程中，在src下的test目录下，已经自动帮我们创建好了测试类 ，并且在测试类上已经添加了注解 @SpringBootTest，代表该测试类已经与SpringBoot整合。 

该测试类在运行时，会自动通过引导类加载Spring的环境（IOC容器）。我们要测试那个bean对象，就可以直接通过@Autowired注解直接将其注入进行，然后就可以测试了。 

测试类代码如下： 

```java
@SpringBootTest
public class MybatisQuickstartApplicationTests {
	
    @Autowired
    private UserMapper userMapper;
	
    @Test
    public void testList(){
        List<User> userList = userMapper.list();
        for (User user : userList) {
            System.out.println(user);
        }
    }

}
```

> 运行结果：
>
> ~~~
> User{id=1, name='白眉鹰王', age=55, gender=1, phone='18800000000'}
> User{id=2, name='金毛狮王', age=45, gender=1, phone='18800000001'}
> User{id=3, name='青翼蝠王', age=38, gender=1, phone='18800000002'}
> User{id=4, name='紫衫龙王', age=42, gender=2, phone='18800000003'}
> User{id=5, name='光明左使', age=37, gender=1, phone='18800000004'}
> User{id=6, name='光明右使', age=48, gender=1, phone='18800000005'}
> ~~~

#### 解决SQL警告与提示

默认我们在UserMapper接口上加的@Select注解中编写SQL语句是没有提示的。 如果想让idea给我们提示对应的SQL语句，我们需要在IDEA中配置与MySQL数据库的链接。 

默认我们在UserMapper接口上的@Select注解中编写SQL语句是没有提示的。如果想让idea给出提示，可以做如下配置：

![image-20221210143348119](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20221210143348119.png)

配置完成之后，发现SQL语句中的关键字有提示了，但还存在不识别表名(列名)的情况：

![image-20221210143934318](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20221210143934318.png)

> 产生原因：Idea和数据库没有建立连接，不识别表信息
>
> 解决方案：在Idea中配置MySQL数据库连接

![image-20221210144139792](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20221210144139792.png) 

> 在配置的时候指定连接那个数据库，如上图所示连接的就是mybatis数据库。

###  数据库连接池

在前面我们所讲解的mybatis中，使用了数据库连接池技术，避免频繁的创建连接、销毁连接而带来的资源浪费。

下面我们就具体的了解下数据库连接池。

#### 介绍

![image-20221210160341852](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20221210160341852.png)

> 没有使用数据库连接池：
>
> - 客户端执行SQL语句：要先创建一个新的连接对象，然后执行SQL语句，SQL语句执行后又需要关闭连接对象从而释放资源，每次执行SQL时都需要创建连接、销毁链接，这种频繁的重复创建销毁的过程是比较耗费计算机的性能。

![image-20221210161016314](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20221210161016314.png)

数据库连接池是个容器，负责分配、管理数据库连接(Connection)

- 程序在启动时，会在数据库连接池(容器)中，创建一定数量的Connection对象

允许应用程序重复使用一个现有的数据库连接，而不是再重新建立一个

- 客户端在执行SQL时，先从连接池中获取一个Connection对象，然后在执行SQL语句，SQL语句执行完之后，释放Connection时就会把Connection对象归还给连接池（Connection对象可以复用）

释放空闲时间超过最大空闲时间的连接，来避免因为没有释放连接而引起的数据库连接遗漏

- 客户端获取到Connection对象了，但是Connection对象并没有去访问数据库(处于空闲)，数据库连接池发现Connection对象的空闲时间 > 连接池中预设的最大空闲时间，此时数据库连接池就会自动释放掉这个连接对象

数据库连接池的好处：

1. 资源重用
2. 提升系统响应速度
3. 避免数据库连接遗漏

#### 产品

要怎么样实现数据库连接池呢？

- 官方(sun)提供了数据库连接池标准（javax.sql.DataSource接口）

  - 功能：获取连接 

    ~~~java
    public Connection getConnection() throws SQLException;
    ~~~

  - 第三方组织必须按照DataSource接口实现

常见的数据库连接池：

* C3P0
* DBCP
* **Druid**
* **Hikari (springboot默认)（追光）**

现在使用更多的是：Hikari、Druid  （性能更优越）

- Hikari（追光者） [默认的连接池] 

![image-20220901144923251](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20220901144923251.png) 

* Druid（德鲁伊）

  * Druid连接池是阿里巴巴开源的数据库连接池项目 

  * 功能强大，性能优秀，是Java语言最好的数据库连接池之一

​		

如果我们想把默认的数据库连接池切换为Druid数据库连接池，只需要完成以下两步操作即可：

> 参考官方地址：https://github.com/alibaba/druid/tree/master/druid-spring-boot-starter

1. 在pom.xml文件中引入依赖

```xml
<dependency>
    <!-- Druid连接池依赖 -->
    <groupId>com.alibaba</groupId>
    <artifactId>druid-spring-boot-starter</artifactId>
    <version>1.2.8</version>
</dependency>
```

2. 在application.properties中引入数据库连接配置

方式1：

~~~properties
spring.datasource.druid.driver-class-name=com.mysql.cj.jdbc.Driver
spring.datasource.druid.url=jdbc:mysql://localhost:3306/mybatis
spring.datasource.druid.username=root
spring.datasource.druid.password=1234
~~~

方式2：**或者是在application.yml中添加type**

~~~yml
spring:
  datasource:
    driver-class-name: com.mysql.cj.jdbc.Driver
    url: jdbc:mysql://localhost:3306/cjy
    username: root
    password: 123456
    type: com.alibaba.druid.pool.DruidDataSource
~~~

### lombok

#### 介绍

Lombok是一个实用的Java类库，可以通过简单的注解来简化和消除一些必须有但显得很臃肿的Java代码。

![image-20221210164641266](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20221210164641266.png)

> 通过注解的形式自动生成构造器、getter/setter、equals、hashcode、toString等方法，并可以自动化生成日志变量，简化java开发、提高效率。

| **注解**            | **作用**                                                     |
| ------------------- | ------------------------------------------------------------ |
| @Getter/@Setter     | 为所有的属性提供get/set方法                                  |
| @ToString           | 会给类自动生成易阅读的  toString 方法                        |
| @EqualsAndHashCode  | 根据类所拥有的非静态字段自动重写 equals 方法和  hashCode 方法 |
| **@Data**           | **提供了更综合的生成代码功能（@Getter  + @Setter + @ToString + @EqualsAndHashCode）** |
| @NoArgsConstructor  | 为实体类生成无参的构造器方法                                 |
| @AllArgsConstructor | 为实体类生成除了static修饰的字段之外带有各参数的构造器方法。 |

#### 使用

第1步：在pom.xml文件中引入依赖

```xml
<!-- 在springboot的父工程中，已经集成了lombok并指定了版本号，故当前引入依赖时不需要指定version -->
<dependency>
    <groupId>org.projectlombok</groupId>
    <artifactId>lombok</artifactId>
</dependency>
```

第2步：在实体类上添加注解

```java
import lombok.Data;

@Data
public class User {
    private Integer id;
    private String name;
    private Short age;
    private Short gender;
    private String phone;
}
```

> 在实体类上添加了@Data注解，那么这个类在编译时期，就会生成getter/setter、equals、hashcode、toString等方法。
>
> ![image-20221210170733921](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20221210170733921.png)

说明：@Data注解中不包含全参构造方法，通常在实体类上，还会添加上：全参构造、无参构造

~~~java
import lombok.Data;

@Data //getter方法、setter方法、toString方法、hashCode方法、equals方法
@NoArgsConstructor //无参构造
@AllArgsConstructor//全参构造
public class User {
    private Integer id;
    private String name;
    private Short age;
    private Short gender;
    private String phone;
}
~~~

Lombok的注意事项：

- **Lombok会在编译时，会自动生成对应的java代码**
- 在使用lombok时，还需要安装一个lombok的插件（**新版本的IDEA中自带**）

![image-20221210165506359](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20221210165506359.png)

### Mybatis基础操作

#### 准备

实施前的准备工作：

1. 准备数据库表
2. 创建一个新的springboot工程，选择引入对应的起步依赖（mybatis、mysql驱动、lombok）
3. application.properties中引入数据库连接信息
4. 创建对应的实体类 Emp（实体类属性采用驼峰命名）
5. 准备Mapper接口 EmpMapper



**准备数据库表**

~~~mysql
-- 部门管理
create table dept
(
    id          int unsigned primary key auto_increment comment '主键ID',
    name        varchar(10) not null unique comment '部门名称',
    create_time datetime    not null comment '创建时间',
    update_time datetime    not null comment '修改时间'
) comment '部门表';
-- 部门表测试数据
insert into dept (id, name, create_time, update_time)
values (1, '学工部', now(), now()),
       (2, '教研部', now(), now()),
       (3, '咨询部', now(), now()),
       (4, '就业部', now(), now()),
       (5, '人事部', now(), now());


-- 员工管理
create table emp
(
    id          int unsigned primary key auto_increment comment 'ID',
    username    varchar(20)      not null unique comment '用户名',
    password    varchar(32) default '123456' comment '密码',
    name        varchar(10)      not null comment '姓名',
    gender      tinyint unsigned not null comment '性别, 说明: 1 男, 2 女',
    image       varchar(300) comment '图像',
    job         tinyint unsigned comment '职位, 说明: 1 班主任,2 讲师, 3 学工主管, 4 教研主管, 5 咨询师',
    entrydate   date comment '入职时间',
    dept_id     int unsigned comment '部门ID',
    create_time datetime         not null comment '创建时间',
    update_time datetime         not null comment '修改时间'
) comment '员工表';
-- 员工表测试数据
INSERT INTO emp (id, username, password, name, gender, image, job, entrydate, dept_id, create_time, update_time)
VALUES 
(1, 'jinyong', '123456', '金庸', 1, '1.jpg', 4, '2000-01-01', 2, now(), now()),
(2, 'zhangwuji', '123456', '张无忌', 1, '2.jpg', 2, '2015-01-01', 2, now(), now()),
(3, 'yangxiao', '123456', '杨逍', 1, '3.jpg', 2, '2008-05-01', 2, now(), now()),
(4, 'weiyixiao', '123456', '韦一笑', 1, '4.jpg', 2, '2007-01-01', 2, now(), now()),
(5, 'changyuchun', '123456', '常遇春', 1, '5.jpg', 2, '2012-12-05', 2, now(), now()),
(6, 'xiaozhao', '123456', '小昭', 2, '6.jpg', 3, '2013-09-05', 1, now(), now()),
(7, 'jixiaofu', '123456', '纪晓芙', 2, '7.jpg', 1, '2005-08-01', 1, now(), now()),
(8, 'zhouzhiruo', '123456', '周芷若', 2, '8.jpg', 1, '2014-11-09', 1, now(), now()),
(9, 'dingminjun', '123456', '丁敏君', 2, '9.jpg', 1, '2011-03-11', 1, now(), now()),
(10, 'zhaomin', '123456', '赵敏', 2, '10.jpg', 1, '2013-09-05', 1, now(), now()),
(11, 'luzhangke', '123456', '鹿杖客', 1, '11.jpg', 5, '2007-02-01', 3, now(), now()),
(12, 'hebiweng', '123456', '鹤笔翁', 1, '12.jpg', 5, '2008-08-18', 3, now(), now()),
(13, 'fangdongbai', '123456', '方东白', 1, '13.jpg', 5, '2012-11-01', 3, now(), now()),
(14, 'zhangsanfeng', '123456', '张三丰', 1, '14.jpg', 2, '2002-08-01', 2, now(), now()),
(15, 'yulianzhou', '123456', '俞莲舟', 1, '15.jpg', 2, '2011-05-01', 2, now(), now()),
(16, 'songyuanqiao', '123456', '宋远桥', 1, '16.jpg', 2, '2010-01-01', 2, now(), now()),
(17, 'chenyouliang', '123456', '陈友谅', 1, '17.jpg', NULL, '2015-03-21', NULL, now(), now());
~~~



**创建一个新的springboot工程，选择引入对应的起步依赖（mybatis、mysql驱动、lombok）**

![image-20221210182008131](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20221210182008131.png)



**application.properties中引入数据库连接信息**

> 提示：可以把之前项目中已有的配置信息复制过来即可

~~~properties
#驱动类名称
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
#数据库连接的url
spring.datasource.url=jdbc:mysql://localhost:3306/mybatis
#连接数据库的用户名
spring.datasource.username=root
#连接数据库的密码
spring.datasource.password=1234
~~~



**创建对应的实体类Emp（实体类属性采用驼峰命名）**

~~~java
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Emp {
    private Integer id;
    private String username;
    private String password;
    private String name;
    private Short gender;
    private String image;
    private Short job;
    private LocalDate entrydate;     //LocalDate类型对应数据表中的date类型
    private Integer deptId;
    private LocalDateTime createTime;//LocalDateTime类型对应数据表中的datetime类型
    private LocalDateTime updateTime;
}
~~~



**准备Mapper接口：EmpMapper**

~~~java
/*@Mapper注解：表示当前接口为mybatis中的Mapper接口
  程序运行时会自动创建接口的实现类对象(代理对象)，并交给Spring的IOC容器管理
*/
@Mapper
public interface EmpMapper {

}
~~~

完成以上操作后，项目工程结构目录如下：

![image-20221210182500817](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20221210182500817.png)

#### 删除操作

页面原型：

![image-20221210183336095](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20221210183336095.png)

> 当我们点击后面的"删除"按钮时，前端页面会给服务端传递一个参数，也就是该行数据的ID。 我们接收到ID后，根据ID删除数据即可。



**功能：根据主键删除数据**

- SQL语句

~~~mysql
-- 删除id=17的数据
delete from emp where id = 17;
~~~

> Mybatis框架让程序员更关注于SQL语句

- 接口方法

~~~java
@Mapper
public interface EmpMapper {
    
    //@Delete("delete from emp where id = 17")
    //public void delete();
    //以上delete操作的SQL语句中的id值写成固定的17，就表示只能删除id=17的用户数据
    //SQL语句中的id值不能写成固定数值，需要变为动态的数值
    //解决方案：在delete方法中添加一个参数(用户id)，将方法中的参数，传给SQL语句
    
    /**
     * 根据id删除数据
     * @param id    用户id
     */
    @Delete("delete from emp where id = #{id}")//使用#{key}方式获取方法中的参数值
    public void delete(Integer id);
    
}
~~~

> @Delete注解：用于编写delete操作的SQL语句

> 如果mapper接口方法形参只有一个普通类型的参数，#{…} 里面的属性名可以随便写，如：#{id}、#{value}。但是建议保持名字一致。

- 测试
  - 在单元测试类中通过@Autowired注解注入EmpMapper类型对象

~~~java
@SpringBootTest
class SpringbootMybatisCrudApplicationTests {
    @Autowired //从Spring的IOC容器中，获取类型是EmpMapper的对象并注入
    private EmpMapper empMapper;

    @Test
    public void testDel(){
        //调用删除方法
        empMapper.delete(16);
    }

}
~~~

#### 新增操作

SQL语句：

```sql
insert into emp(username, name, gender, image, job, entrydate, dept_id, create_time, update_time) values ('songyuanqiao','宋远桥',1,'1.jpg',2,'2012-10-09',2,'2022-10-01 10:00:00','2022-10-01 10:00:00');
```

接口方法：

```java
@Mapper
public interface EmpMapper {

    @Insert("insert into emp(username, name, gender, image, job, entrydate, dept_id, create_time, update_time) values (#{username}, #{name}, #{gender}, #{image}, #{job}, #{entrydate}, #{deptId}, #{createTime}, #{updateTime})")
    public void insert(Emp emp);

}
```

> 说明：#{...} 里面写的名称是对象的属性名

测试类：

```java
import com.itheima.mapper.EmpMapper;
import com.itheima.pojo.Emp;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import java.time.LocalDate;
import java.time.LocalDateTime;

@SpringBootTest
class SpringbootMybatisCrudApplicationTests {
    @Autowired
    private EmpMapper empMapper;

    @Test
    public void testInsert(){
        //创建员工对象
        Emp emp = new Emp();
        emp.setUsername("tom");
        emp.setName("汤姆");
        emp.setImage("1.jpg");
        emp.setGender((short)1);
        emp.setJob((short)1);
        emp.setEntrydate(LocalDate.of(2000,1,1));
        emp.setCreateTime(LocalDateTime.now());
        emp.setUpdateTime(LocalDateTime.now());
        emp.setDeptId(1);
        //调用添加方法
        empMapper.insert(emp);
    }
}

```

#### 更新操作

SQL语句：

```sql
update emp set username = 'linghushaoxia', name = '令狐少侠', gender = 1 , image = '1.jpg' , job = 2, entrydate = '2012-01-01', dept_id = 2, update_time = '2022-10-01 12:12:12' where id = 18;
```

接口方法：

```java
@Mapper
public interface EmpMapper {
    /**
     * 根据id修改员工信息
     * @param emp
     */
    @Update("update emp set username=#{username}, name=#{name}, gender=#{gender}, image=#{image}, job=#{job}, entrydate=#{entrydate}, dept_id=#{deptId}, update_time=#{updateTime} where id=#{id}")
    public void update(Emp emp);
    
}
```

测试类：

```java
@SpringBootTest
class SpringbootMybatisCrudApplicationTests {
    @Autowired
    private EmpMapper empMapper;

    @Test
    public void testUpdate(){
        //要修改的员工信息
        Emp emp = new Emp();
        emp.setId(23);
        emp.setUsername("songdaxia");
        emp.setPassword(null);
        emp.setName("老宋");
        emp.setImage("2.jpg");
        emp.setGender((short)1);
        emp.setJob((short)2);
        emp.setEntrydate(LocalDate.of(2012,1,1));
        emp.setCreateTime(null);
        emp.setUpdateTime(LocalDateTime.now());
        emp.setDeptId(2);
        //调用方法，修改员工数据
        empMapper.update(emp);
    }
}
```

#### 按值查询操作

SQL语句：

~~~mysql
select id, username, password, name, gender, image, job, entrydate, dept_id, create_time, update_time from emp;
~~~

接口方法：

~~~java
@Mapper
public interface EmpMapper {
    @Select("select id, username, password, name, gender, image, job, entrydate, dept_id, create_time, update_time from emp where id=#{id}")
    public Emp getById(Integer id);
}
~~~

测试类：

~~~java
@SpringBootTest
class SpringbootMybatisCrudApplicationTests {
    @Autowired
    private EmpMapper empMapper;

    @Test
    public void testGetById(){
        Emp emp = empMapper.getById(1);
        System.out.println(emp);
    }
}
~~~

> 执行结果：
>
> ![image-20221212103004961](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20221212103004961.png)
>
> 而在测试的过程中，我们会发现有几个字段(deptId、createTime、updateTime)是没有数据值的

### 数据封装

我们看到查询返回的结果中大部分字段是有值的，但是deptId，createTime，updateTime这几个字段是没有值的，而数据库中是有对应的字段值的，这是为什么呢？

![image-20221212103124490](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20221212103124490.png)

原因如下： 

- 实体类属性名和数据库表查询返回的字段名一致，mybatis会自动封装。
- **如果实体类属性名和数据库表查询返回的字段名不一致，不能自动封装。**

 **解决方案：**

1. 起别名
2. 结果映射
3. 开启驼峰命名

**开启驼峰命名(推荐)**：如果字段名与属性名符合驼峰命名规则，mybatis会自动通过驼峰命名规则映射

> 驼峰命名规则：   abc_xyz    =>   abcXyz
>
> - 表中字段名：abc_xyz
> - 类中属性名：abcXyz

```properties
# 在application.properties中添加：
mybatis.configuration.map-underscore-to-camel-case=true

# 在application.yml中添加：
mybatis:
  configuration:
    map-underscore-to-camel-case: true
```

> **要使用驼峰命名前提是 实体类的属性 与 数据库表中的字段名严格遵守驼峰命名。**

### Mybatis的XML配置文件

Mybatis的开发有两种方式：

1. 注解
2. XML

#### XML配置文件规范

使用Mybatis的注解方式，主要是来完成一些简单的增删改查功能。如果需要实现复杂的SQL功能，建议使用XML来配置映射语句，也就是将SQL语句写在XML配置文件中。

在Mybatis中使用XML映射文件方式开发，需要符合一定的规范：

1. XML映射文件的名称与Mapper接口名称一致，并且将XML映射文件和Mapper接口放置在相同包下（**同包同名**）

2. XML映射文件的**namespace属性为Mapper接口全限定名一致**

3. XML映射文件中sql语句的id与Mapper接口中的**方法名一致**，并保持**返回类型一致**。

![image-20221212153529732](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20221212153529732.png)

> \<select>标签：就是用于编写select查询语句的。
>
> - resultType属性，指的是查询返回的单条记录所封装的类型。

#### XML配置文件实现

##### 第1步:创建XML映射文件

![image-20221212154908306](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20221212154908306.png)

![image-20221212155304635](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20221212155304635.png)

![image-20221212155544404](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20221212155544404.png)

##### 第2步:编写XML映射文件

> xml映射文件中的dtd约束，直接从mybatis官网复制即可

~~~xml
<?xml version="1.0" encoding="UTF-8" ?>
<!DOCTYPE mapper
  PUBLIC "-//mybatis.org//DTD Mapper 3.0//EN"
  "https://mybatis.org/dtd/mybatis-3-mapper.dtd">
<mapper namespace="">
 
</mapper>
~~~



配置：XML映射文件的namespace属性为Mapper接口全限定名

![image-20221212160316644](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20221212160316644.png)

~~~xml
<?xml version="1.0" encoding="UTF-8" ?>
<!DOCTYPE mapper
        PUBLIC "-//mybatis.org//DTD Mapper 3.0//EN"
        "https://mybatis.org/dtd/mybatis-3-mapper.dtd">
<mapper namespace="com.itheima.mapper.EmpMapper">

</mapper>
~~~



配置：XML映射文件中sql语句的id与Mapper接口中的方法名一致，并保持返回类型一致

![image-20221212163528787](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20221212163528787.png)

~~~xml
<?xml version="1.0" encoding="UTF-8" ?>
<!DOCTYPE mapper
        PUBLIC "-//mybatis.org//DTD Mapper 3.0//EN"
        "https://mybatis.org/dtd/mybatis-3-mapper.dtd">
<mapper namespace="com.itheima.mapper.EmpMapper">

    <!--查询操作-->
    <select id="list" resultType="com.itheima.pojo.Emp">
        select * from emp
        where name like concat('%',#{name},'%')
              and gender = #{gender}
              and entrydate between #{begin} and #{end}
        order by update_time desc
    </select>
</mapper>
~~~

##### 第3步:编写测试类

> 运行测试类，执行结果：
>
> ![image-20221212163719534](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20221212163719534.png)

~~~java
@Autowired
private EmpService empService;

@Test
void testGetAll() {
    List<Emp> emps = empService.getAll();
    emps.stream().forEach(emp -> System.out.println(emp));
}
~~~

### MybatisX的使用

MybatisX是一款基于IDEA的快速开发Mybatis的插件，为效率而生。

MybatisX的安装：

![image-20221213120923252](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20221213120923252.png)

可以通过MybatisX快速定位：

![image-20221213121521406](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20221213121521406.png)

> MybatisX的使用在后续学习中会继续分享



学习了Mybatis中XML配置文件的开发方式了，大家可能会存在一个疑问：到底是使用注解方式开发还是使用XML方式开发？

> 官方说明：https://mybatis.net.cn/getting-started.html
>
> ![image-20220901173948645](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20220901173948645.png) 

**结论：**使用Mybatis的注解，主要是来完成一些简单的增删改查功能。如果需要实现复杂的SQL功能，建议使用XML来配置映射语句。

## IDE（集成开发环境）—IDEA

1. IDEA 全称 IntelliJ IDEA 
2. 在业界被公认为最好的 Java 开发工具 
3. IDEA 是 JetBrains 公司的产品，总部位于捷克的首都布拉格 
4. 除了支持 Java 开发，还支持 HTML，CSS，PHP，MySQL，Python 等

![image-20240301181316349](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240301181316349.png) 

**版本：**IDEA 2020.2

### IDEA 常用快捷键

1. 删除当前行：默认是Ctrl + Y，改为**Ctrl + D**（）
2. 复制当前行：（搜索duplicate），改为**Ctrl + Alt + 向下箭头**（）
3. 代码补全：**Alt + /**
4. 添加注释和取消注释： **Ctrl + /** 
5. 导入该行需要的类：**Alt+Enter** 
6. 快速格式化代码： **Ctrl + Alt + L**
7. 快速运行程序：默认是Shift + F10 ，改为**Alt + R**（）
8. 生成构造器等：**Alt + Insert**
9. 查看一个类的层级关系： **Ctrl + H**
10. 将光标放在一个方法上，输入 **Ctrl + B** （或者**Ctrl + 鼠标左键**）, 可以定位到方法 
11. **ctrl + alt + <**-- (左）；回到上一个方法；**ctrl + alt + -->** (右）；回到下一个方法。搭配上一步使用
12. **ctrl + alt + 左方向键**-- (左）；回到上一个光标；**ctrl + alt + 右方向键** (右）；回到下一个光标。搭配上一步使用
13. 自动的分配变量名 , 通过 在后面加 **.var** ；自动生成增强for循环，通过 在后面加**.for**
14. 自动的填写输出函数，通过后面加**.sout**
15. 查看快捷键的快捷键：**Ctrl + J**
16. 快速生成迭代器的while：**i t i t**
17. 增强for循环： **I（大写）**
18. 异常处理、同步代码块快捷键：**Ctrl + Alt + T**
19. **按住Alt键，然后拖动鼠标**，实现多行代码的同时修改；**Alt + Shift 点击鼠标**，实现特定位置的同时修改
20. 按住**Shift + Enter**可以实现**直接换行**的操作
21. Alt+Shift+上下键，可以实现**上下移动行**

### 自定义模板

![image-20240301183836222](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240301183836222.png) 

### 自动添加注释

![image-20240326170931531](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240326170931531.png)

### 断点调试

**断点调试介绍：**

![image-20240303090429018](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240303090429018.png) 

**断点调试的快捷键：**

**F7(跳入)** 

**F8(跳过)** 

**shift+F8(跳出)** 

**F9(resume,执行到下一个断点)**

（断点可以在 debug 过程中，动态的下断点）

### 获得CPU的内核数

~~~java
System.out.println(Runtime.getRuntime().availableProcessors());
~~~

### 获得当前系统时间

~~~java
System.currentTimeMills()
~~~

### 查看系统的环境变量

~~~java
public static void main(String[] args) throws Exception{
    Map<String, String> env = System.getenv();
    System.out.println(env);
}
~~~

### 创建普通maven工程项目

**在已有项目中创建普通maven工程：**

1. 右键项目选择 new -> Module
   ![image-20240411092247988](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240411092247988.png) 

2. 选择 new Module , build system 选择maven
   ![image-20240411092452805](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240411092452805.png) 

3. **问题：**在idea2023中，**不能通过Maven Archetype创建普通的Maven项目**
   ![image-20240411092809515](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240411092809515.png) 

### 创建Archetype的Meaven项目

1. 创建带WebApp骨架的Meaven项目，这个带SpringMVC框架的依赖
   ![image-20240416135050731](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240416135050731.png) 

2. 等待Meaven初始化，然后完善项目结构
   ![image-20240416135221360](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240416135221360.png) 

   ![image-20240416135449310](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240416135449310.png) 

### 创建数据库表

1. 创建Mysql数据源
   ![](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240416133749482.png) 

2. 填写连接名、主机、端口号、数据库用户名、密码，并测试连接
   ![image-20240416134020221](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240416134020221.png)

3. 勾选你需要的schemas，在你的schemas中创建数据表
   ![image-20240416134238274](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240416134238274.png)  
4. 打开专属于cjy这个scheam的控制台
   ![image-20240416134655750](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240416134655750.png) 

5. 直接在控制器中通过Sql语句创建数据库表
   ![image-20240416134757297](https://typora2442972980.oss-cn-wuhan-lr.aliyuncs.com/image-20240416134757297.png) 

