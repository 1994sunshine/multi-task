package com.baidu.unbiz.multitask.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.baidu.unbiz.multitask.task.Taskable;
import com.baidu.unbiz.multitask.vo.DeviceRequest;
import com.baidu.unbiz.multitask.vo.DeviceViewItem;

/**
 * Created by wangchongjie on 15/12/21.
 */
@Service
public class ExplicitDefTask implements Taskable<List<DeviceViewItem>> {

    public <E> List<DeviceViewItem> work(E request) {
        if (request instanceof  DeviceRequest) {
            List<DeviceViewItem> result = new ArrayList<DeviceViewItem>();
            result.add(new DeviceViewItem());
            return result;
        }
        return null;
    }

}
