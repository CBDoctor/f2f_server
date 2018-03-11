package com.ck.face.utils;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.util.CollectionUtils;

/**
 * 
 * @author cuiyanwei
 *
 */
public class ListUtil {

	public static List<Long> getUnRepeatedList(List<Long> list) {
		if (CollectionUtils.isEmpty(list)) {
			return new ArrayList<Long>();
		}
		Set<Long> set = new HashSet<Long>(list);
		return new ArrayList<Long>(set);
	}
	
	
	public static List<Integer> getCoverageList(Integer totalCount, Integer pageCount) {
		if(pageCount == 0){
			return  new ArrayList<Integer>();
		}
		List<Integer> result = new ArrayList<Integer>(pageCount);
		int pageSize = totalCount / pageCount;
		// 可以整除的情况下，每页数量一致
		if (totalCount % pageCount == 0) {
			for (int i = 0; i < pageCount; i++) {
				result.add(pageSize);
			}
		} else {
			// 不可以整除情况下，最后一页数据特殊处理
			for (int i = 0; i < pageCount - 1; i++) {
				result.add(pageSize);
			}
			result.add(totalCount - (pageCount - 1) * pageSize);
		}
		return result;
	}
	
	
	public static void main(String[] args){
//		List<Long> list = Arrays.asList(1L,2L,34L,1L);
//		List<Long> data = ListUtil.getUnRepeatedList(list);
//		System.out.println(data);
		
		List<Integer> result = getCoverageList(100,3);
		System.out.println(result);
		
		result = getCoverageList(101,3);
		System.out.println(result);
		
		result = getCoverageList(102,3);
		System.out.println(result);
		
		result = getCoverageList(103,3);
		System.out.println(result);
	}

}
