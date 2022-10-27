# Maven项目管理工具

## Maven安装

1. 确保安装JDK,配置好JDK的环境变量;

   ```shell
   # 执行下面两条语句
   Echo %JAVA_HOME%
   Java -version
   ```

2. [Maven](https://maven.apache.org/download.cgi)下载对应操作系统的版本;

3. 在环境变量中添加MAVEN_HOME并在变量值中添加maven的解压缩目录;

4. 将%MAVEN_HOME%\bin添加到环境变量Path中，注意分;

5. cmd中输入`mvn -v`命令查看Maven的相关信息,出现版信息即安装成功。

## Maven项目的目录

| 目录               | 说明                                          |
| :----------------- | :-------------------------------------------- |
| src/main/java      | 存放项目的java文件                            |
| src/main/resources | 存放项目资源文件，如spring,hibemate配置       |
| src/test/java      | 存放所有单元测试.java文件，如JUnit测试类      |
| src/test/resources | 测试资源文件                                  |
| target             | 项目输出位置，编译后的class文件会输出到此目录 |
| pom.xml            | maven项目核心配置文件                         |

## 创建Maven项目

1. 点击File->new->Module…
   ![](zXingDemo/src/main/resources/image-20221027165946523.png)
2. 输入项目名称，选择项目位置，选择Maven构建系统，选择对应的JDK。
3. 即可生成Maven管理项目。

