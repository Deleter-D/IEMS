package edu.whpu.pojo;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class JsonUtil {
    private int code = 0;
    private String msg;
    private Long count;
    private List data = new ArrayList();
}
