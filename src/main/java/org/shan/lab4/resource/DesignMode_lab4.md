# DesignMode_lab4

## 一 实验目的

1. 结合实例，熟练绘制设计模式结构图。
2. 结合实例，熟练使用 Java 语言实现设计模式。
3. 通过本实验，理解每一种设计模式的模式动机，掌握模式结构，学习如何使用代码实现
   这些设计模式。

## 二 实验要求

1. 结合实例，绘制设计模式的结构图。
2. 使用 Java 语言实现设计模式实例，代码运行正确。

## 三 实验内容

1. 组合模式
   某移动社交软件要增加一个群组（Group）功能。通过设置，用户可以将自己的动态信
   息（包括最新动态 新上传的视频以及分享的链接等）分享给某个特定的成员（Member）. 也可以分享给某个群组中的所有成员；用户可以将成员加至某个指定的群组；此外，还允许
   用户在一个群组中加子群组，以便更加灵活地实现面向特定人群的信息共享。现采用组合模
   式设计该群组功能，绘制对应的类图并编程模拟实现。
2. 装饰模式
   在某 OA 系统中提供一个报表生成工具，用户可以通过该工具为报表增加表头和表尾，
   允许用户为报表增加多个不同的表头和表尾，用户还可以自行确定表头和表尾的次序。为了
   能够灵活设置表头和表尾的次序并易于增加新的表头和表尾，现采用装饰模式设计该报表生
   成工具，绘制对应的类图并编程模拟实现。 3. 访问者模式
   某软件公司需要设计一个源代码解析工具，该工具可以对源代码进行解析和处理，在该
   工具的初始版本中，主要提供了以下 3 个功能。
   (1)度量软件规模。可以统计源代码中类的个数 每个类属性的个数以及每个类方法的
   个数等。
   (2)提取标识符名称，以便检查命名是否合法和规范。可以提取类名 属性名和方法名
   等。
   (3)统计代码行数。可以统计源代码中每个类和每个方法中源代码的行数。
   将来还会在工具中增加一些新功能，为源代码中的类 属性和方法等提供更多的解析操
   作。现采用访问者模式设计该源代码解析工具，可将源代码中的类 属性和方法等设计为待
   访问的元素，上述不同功能由不同的具体访问者类实现，绘制对应的类图并编程模拟实现。 4. 职责链模式
   在某 Web 框架中采用职责链模式来组织数据过滤器，不同的数据过滤器提供了不同的
   功能，例如字符编码转换过滤器 数据类型转换过滤器 数据校验过滤器等，可以将多个过
   滤器连接成一一个过滤器链，进而对数据进行多次处理。根据以上描述，绘制对应的类图并
   编程模拟实现。

## 四 实验结果

需要提供设计模式实例的结构图（类图）和实现代码。

## 五 实验小结

请总结本次实验的体会，包括学会了什么 遇到哪些问题 如何解决这些问题以及存在
哪些有待改进的地方。