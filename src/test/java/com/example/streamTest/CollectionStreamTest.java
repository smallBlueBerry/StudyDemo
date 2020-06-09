package com.example.streamTest;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**   
* @Description: Stream好处描述：
*1、无存储。stream不是一种数据结构，它只是某种数据源的一个视图，数据源可以是一个数组，Java容器或I/O channel等。
*2、为函数式编程而生。对stream的任何修改都不会修改背后的数据源，比如对stream执行过滤操作并不会删除被过滤的元素，而是会产生一个不包含被过滤元素的新stream。
*3、惰式执行。stream上的操作并不会立即执行，只有等到用户真正需要结果的时候才会执行。
*4、可消费性。stream只能被“消费”一次，一旦遍历过就会失效，就像容器的迭代器那样，想要再次遍历必须重新生成。
* @version: v1.0.0
* @author: linan
* @date: Jun 5, 2020 4:38:20 PM 
*/
public class CollectionStreamTest {
	
	public static void main(String[] args) {
		// 保留长度等于3的字符串
		Stream<String> stream = Stream.of("I", "love", "you", "too");
		stream.filter(str -> str.length() == 3)
			  .forEach(str -> System.out.println(str));
		
		//distinct() 作用是返回一个去除重复元素之后的Stream
		Stream<String> stream2= Stream.of("I", "love", "you", "too", "too");
		stream2.distinct()
		    .forEach(str -> System.out.println(str));
		
		//sorted()一个是用自然顺序排序，一个是使用自定义比较器排序 将输出按照长度升序排序后的字符串
		Stream<String> stream3 = Stream.of("I", "love", "you", "too");
		stream3.sorted((str1, str2) -> str1.length()-str2.length())
		    .forEach(str -> System.out.println(str));
		
		//map()对每个元素按照某种操作进行转换，转换前后Stream中元素的个数不会改变，但元素的类型取决于转换之后的类型
		Stream<String> stream4 = Stream.of("I", "love", "you", "too");
		stream4.map(str -> str.toUpperCase())
		    .forEach(str -> System.out.println(str));
		
		//flatMap()把原stream中的所有元素都”摊平”之后组成的Stream，转换前后元素的个数和类型都可能会改变。
		Stream<List<Integer>> stream5 = Stream.of(Arrays.asList(1,2), Arrays.asList(3, 4, 5));
		stream5.flatMap(list -> list.stream())
		    .forEach(i -> System.out.println(i));
		
	}

}
