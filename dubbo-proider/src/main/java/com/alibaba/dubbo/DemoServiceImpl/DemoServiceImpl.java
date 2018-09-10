package com.alibaba.dubbo.DemoServiceImpl;

import com.alibaba.dubbo.demo.DemoService;

import java.util.ArrayList;
import java.util.List;

public class DemoServiceImpl implements DemoService {
	@Override
	public List<String> getPermission(long id) {
		List<String> demo = new ArrayList<String>();
		demo.add(String.format("permission_%d", id - 1));
		demo.add(String.format("permission_%d", id ));
		demo.add(String.format("permission_%d", id + 1));
		return demo;
	}
}
