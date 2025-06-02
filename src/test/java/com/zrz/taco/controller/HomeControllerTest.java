package com.zrz.taco.controller;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

/**
 * Unit test for HomeController.
 */
public class HomeControllerTest {

    private MockMvc mockMvc;

    @BeforeEach
    public void setup() {
        // 创建 HomeController 实例并初始化 MockMvc
        mockMvc = MockMvcBuilders.standaloneSetup(new HomeController()).build();
    }

    /**
     * Test case: TC01
     * Description: Send a GET request to root path and verify the returned view name is "home".
     * Expected Result: View name should be "home"
     */
    @Test
    public void testHome_ShouldReturnViewNameHome() throws Exception {
        mockMvc.perform(get("/"))  // 发送 GET /
                .andExpect(status().isOk())          // 验证状态码 200 OK
                .andExpect(view().name("home"));     // 验证视图名为 "home"
    }
}
