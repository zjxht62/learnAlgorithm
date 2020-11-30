package com.zjx.learnalgorithm.GrokkingAlgorithms.chapter4;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Demo class
 *
 * @author trevor.zhao
 * @date 2019/12/28
 */
public class QuickSort {
    private static List<Integer> quickSort(List<Integer> list) {
        if (list.size() < 2) {
            //基准条件,list里面只有1个或者0个元素的话 是已经排好序的
            return list;
        } else {
            //递归条件
            Integer pivot = list.get(0);

            //获得所有比privot小的元素
            List<Integer> less = list.stream().skip(1).filter(e1 -> e1 <= pivot).collect(Collectors.toList());

            //获取所有比privot大的元素
            List<Integer> greater = list.stream().skip(1).filter(e1 -> e1 > pivot).collect(Collectors.toList());

            return Stream.of(
                quickSort(less).stream(),
                Stream.of(pivot),
                quickSort(greater).stream())
                .flatMap(Function.identity()).collect(Collectors.toList());

        }
    }
}
