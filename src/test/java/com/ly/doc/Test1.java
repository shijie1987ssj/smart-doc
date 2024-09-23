package com.ly.doc;

import com.google.gson.Gson;
import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.Test;

import java.util.Map;

public class Test1 {

	@Test
	public void test111() {
		String description = "afdafdsafdsa";
		Gson gson = new Gson();
		Map descriptionMap = gson.fromJson(description, Map.class);
		System.out.println(descriptionMap);
	}

}
