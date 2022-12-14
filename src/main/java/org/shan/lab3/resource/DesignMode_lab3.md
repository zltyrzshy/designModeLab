# DesignMode_lab3
## 一 实验目的
1. 结合实例，熟练绘制设计模式结构图。
2. 结合实例，熟练使用 Java 语言实现设计模式。
3. 通过本实验，理解每一种设计模式的模式动机，掌握模式结构，学习如何使用代码实现
   这些设计模式。 
## 二 实验要求
1. 结合实例，绘制设计模式的结构图。
2. 使用 Java 语言实现设计模式实例，代码运行正确。 
## 三 实验内容
### 1. 简单工厂模式
   简单工厂模式使用简单工厂模式设计一个可以创建不同几何形状（Shape）（例如圆形（Circle）、矩形（Rectangle）和三角形（Triangle）等）的绘图工具类，每个几何图形均具有绘制方法 draw()和擦除方法 erase()，要求在绘制不支持的几何图形时，抛出一个UnsupportedShapeException 异常。绘制类图并编程模拟实现。
   ```mermaid
classDiagram

Circle --|> Shape
Rectangle --|> Shape
Triangle --|> Shape

Client ..> Factory :use
Factory ..> Circle :use
Factory ..> Rectangle :use
Factory ..> Triangle :use

class Shape{
<<abstract>>
+draw()
+erase()
}
   
   ```
### 2. 建造者模式
   在某赛车游戏中，赛车包括方程式赛车、场地越野赛车、运动汽车、卡车等类型，不同类型的赛车的车身、发动机、轮胎、变速箱等部件有所区别。玩家可以自行选择赛车类型，系统将根据玩家的选择创建出一辆完整的赛车。现采用建造者模式实现赛车的构建，绘制对应的类图并编程模拟实现。

```mermaid
classDiagram

Client ..> Directory :use

Directory o.. CarRace

CarRace <|-- FormulaCar
CarRace <|-- TrackCar
CarRace <|-- TruckCar

class CarRace{
<<abstract>>
#car

+makeBody()
+makeEngine()
+makeTyre()
+getResult()
}

class Directory{
-CarRace

+construct()
}
```



### 3. 抽象工厂模式
   某系统为了改进数据库操作的性能，用户可以自定义数据库连接对象 Connection 和语句对象 Statement ，针对不同类型的数据库提供不同的连接对象和语句对象，例如提供Oracle 或 MySQL 专用连接类和语句类，而且用户可以通过配置文件等方式根据实际需要动态更换系统数据库。使用抽象工厂模式设计该系统，绘制对应的类图并编程模拟实现。
### 4. 桥接模式
   某手机美图 APP 软件支持多种不同的图像格式，例如 JPG、GIF、BMP 等常用图像格式，同时提供了多种不同的滤镜对图像进行处理，例如木刻滤镜（Cutout）、模糊滤镜( Blur）、锐化滤镜（Sharpen）、纹理滤镜（Texture）等。现采用桥接模式设计该 APP 软件，使得该软件能够为多种图像格式提供一系列图像处理滤镜，同时还能够很方便地增加新的图像格式和滤镜，绘制对应的类图并编程模拟实现。
### 5. 策略模式
   在某云计算模拟平台中提供了多种虚拟机迁移算法，例如动态迁移算法中的 Pre - Copy （预拷贝）算法、 Post - Copy （后拷贝）算法、 CR / RT - Motion 算法等，用户
   可以灵活地选择所需的虚拟机迁移算法，也可以方便地增加新算法。现采用策略模式进行设计，绘制对应的类图并编程模拟实现。 
## 四 实验结果
   需要提供设计模式实例的结构图（类图）和实现代码。 
## 五 实验小结
   请总结本次实验的体会，包括学会了什么、遇到哪些问题、如何解决这些问题以及存在哪些有待改进的地方。
