# 过滤器模式
过滤器模式（Filter Pattern）或标准模式（Criteria Pattern）是一种设计模式，
这种模式允许开发人员使用不同的标准来过滤一组对象，通过逻辑运算以解耦的方式把它们连接起来。
这种类型的设计模式属于结构型模式，它结合多个标准来获得单一标准。
# 实现
我们将创建一个 Person 对象、Criteria 接口和实现了该接口的实体类，来过滤 Person 对象的列表。
CriteriaPatternDemo 类使用 Criteria 对象，基于各种标准和它们的结合来过滤 Person 对象的列表。
![](images/img.png)



## 优化思路：
1.这个方法可以可获取到全部非空的字符串。
```java
List<String> aList = Lists.newArrayList("1","2","");
aList.stream().filter(x -> StringUtils.isNotEmpty(x))
```


2.过滤模式的实现在java8里面有典型的应用方法就是分组操作，可以根据指定的指标进行分组筛选。

```java
Map<Integer, List<Person >> groupMap = persons.stream().collect(Collectors.groupingBy(Person::getGender));
groupMap.forEach((k, v) -> {
System.out.println(k);
v.forEach(System.out::println);
});
```